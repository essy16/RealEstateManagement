package com.example.realestatemanagementapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"


/**
 * A simple [Fragment] subclass.
 * Use the [MainFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class MainFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null
    private lateinit var adapter: HouseAdapter
    private lateinit var recyclerView: RecyclerView
    private lateinit var houseArrayList: ArrayList<House>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment MainFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            MainFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        dataInitialize()
        val layoutManager=LinearLayoutManager(context)

        recyclerView=view.findViewById(R.id.recycler_view)
        recyclerView.layoutManager=layoutManager
        recyclerView.setHasFixedSize(true)
        adapter=HouseAdapter(houseArrayList)
        recyclerView.adapter=adapter



    }
    private fun dataInitialize(){
        houseArrayList= arrayListOf<House>()
        houseArrayList.add(House("Two bedroom","KES 21,000/Month","Umoja 1",R.drawable.house_1))
        houseArrayList.add(House("one bedroom","KES 15,000/Month","Buruburu",R.drawable.house_2))
        houseArrayList.add(House("Three bedroom","KES 11,000/Month","Donholm",R.drawable.house_3))
        houseArrayList.add(House("Two bedroom","KES 40,000/Month","Muthaiga",R.drawable.house__4))
        houseArrayList.add(House("Three bedroom","KES 60,000/Month","Muthaiga",R.drawable.house_5))
        houseArrayList.add(House("One bedroom","KES 10,000/Month","Kaloleni",R.drawable.house_6))


    }
}
