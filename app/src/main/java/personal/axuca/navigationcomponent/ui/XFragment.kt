package personal.axuca.navigationcomponent.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import personal.axuca.navigationcomponent.databinding.FragmentXBinding

class XFragment : Fragment() {

    private var _binding: FragmentXBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentXBinding.inflate(inflater, container, false)

        binding.buttonGoY.setOnClickListener {
            Navigation.findNavController(it)
                .navigate(XFragmentDirections.actionXFragmentToYFragment())
        }

        return binding.root
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

}