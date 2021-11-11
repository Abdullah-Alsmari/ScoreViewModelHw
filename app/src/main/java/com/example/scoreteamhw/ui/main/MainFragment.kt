package com.example.teamscorehw
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.scoreteamhw.databinding.MainFragmentBinding
import com.example.scoreteamhw.ui.main.MainViewModel


class MainFragment : Fragment() {


    private var _binding: MainFragmentBinding? = null
    private val binding get() = _binding

    private val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = MainFragmentBinding.inflate(inflater, container, false)
        return _binding?.root
    }




     fun Updatescore() {
        binding?.totalScore?.text = viewModel.scope.toString()}


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        Updatescore()
        binding?.button?.setOnClickListener {
            viewModel.plusone()
            Updatescore()

        }
        binding?.button2?.setOnClickListener {
            viewModel.plusFour()
            Updatescore()

        }
        binding?.button3?.setOnClickListener {
            viewModel.subTwo()
            Updatescore()

        }


    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

}












