package com.blueboy.unitygames

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.blueboy.unitygames.databinding.FragmentFirstBinding
import com.unity3d.player.UnityPlayerActivity

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FirstFragment : Fragment() {

    private var _binding: FragmentFirstBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonFirst.setOnClickListener {
            startActivity(
                Intent(
                    requireActivity(), UnityPlayerActivity::class.java
                ).also { it1 ->
                    it1.putExtra("gameId", "111")
                    it1.putExtra("game_key", "wretry")
                    it1.putExtra("playerId", "ram")
                    //it1.putExtra("TournamentId", battle?.tournamentId)
                    it1.putExtra("Timer", "")
                    it1.putExtra(
                        "auth_key",
                        "eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiJ9.eyJhdWQiOiIzIiwianRpIjoiODE1NTMyOTM0NzRkOWY4OThjMTEwMGU1ODczYzVjNGVlNTkwMmVkZDM2ODY0NTMyOTA0NjcxZWNjNjNjODhiMDEwMGZiOWY5YmU5NjJhZGYiLCJpYXQiOjE2ODA4NzAzNzkuNDMzMzY1LCJuYmYiOjE2ODA4NzAzNzkuNDMzMzY5LCJleHAiOjE3MTI0OTI3NzkuNDI1OTE2LCJzdWIiOiIyIiwic2NvcGVzIjpbXX0.M7TlpLskrWL3X2GsNkPsnvghOCX7qZeiLo6-b7dJGrpoX5B4hKbzjvX7y8Gzr4-njOM6WISh3QGWVyfXaME6LSOX8jQX7jKsv7LktE8bsS6-fHw59eSrNRwR9xN6_PAK6cgpGTOs80Fra60-OuqfEazgqrJ1omnuoL416Qyko4sTnXmx75GldQUdROfb4ghyZZ0VuEYjnRLidv2b18gaHj_ECUd5KhRcsMb_reznb1saiufMgBKD8IDq9EW3JTKJO8jYSymL0SJk83rYQWZKXt9cyfhEcjanUBzrHGhzcT_9hlvrXqKQUwrMwc6_KHIv-v6dsZBBYPl_N9iWsRLqMGRqDYd3LP1p4Gbp5j0t98vy_QsVtA88o7g6ITaqzdElXAsJ4XiFk-F68qKNSmpepCc7Ch0coxnGAii6xTRXV_f9Wafu_pSDMoNVXb8H3t3uu4HAiweyEMcuQaXHd0I32xu0k5RRbFME8-l8nXrDZXPosAEwwnLLyY_eFirRcLWvpCWfj2q2CPzRcWlTM9GFwKQj8PVP3kRgH3o9QoQIFD5Cxlvu6yPGxmo5kEMc2zUcYCplQHG_wlbcm1bIsB6ERRUIAFS6HfiKJ7TfJuPdNIMsZAxrAFzB_2crTBAhVqfyV5hMAnmjnQ4xyThZP2wNCHFIW0L7eArfwKsaDh9ZO54"
                    )
                    it1.putExtra("profileUrl", "")
                    //it1.putExtra("room_join_fee", battle?.tournamentEntryFees)
                    it1.putExtra("game_version", "")
                    it1.putExtra("practice_mode", "true")

                    it1.putExtra("game_image", "")
                    it1.putExtra("game_banner", "")
                    it1.putExtra("game_name", "")
                    it1.putExtra("app_version", BuildConfig.VERSION_NAME)
                })
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}