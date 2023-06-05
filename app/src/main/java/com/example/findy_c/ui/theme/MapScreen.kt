package com.example.findy_c.ui.theme

import android.Manifest
import android.content.Context
import android.location.Location
import android.location.LocationManager
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.core.content.ContentProviderCompat.requireContext
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.findy_c.other.TrackingUtility
import com.google.android.gms.location.LocationServices
import com.google.android.gms.maps.LocationSource
import com.google.android.gms.maps.UiSettings
import com.google.android.gms.maps.model.CameraPosition
import com.google.android.gms.maps.model.LatLng
import com.google.maps.android.compose.GoogleMap
import com.google.maps.android.compose.MapUiSettings
import com.google.maps.android.compose.rememberCameraPositionState
import pub.devrel.easypermissions.EasyPermissions


@Composable
fun MapScreen(){
       val koeln = LatLng(50.9375, 6.9603)


       GoogleMap(modifier=  Modifier.fillMaxSize(), cameraPositionState = rememberCameraPositionState{
              position = CameraPosition.fromLatLngZoom(koeln,9f)},
              uiSettings = MapUiSettings(zoomControlsEnabled = false, myLocationButtonEnabled = true,)
       )
}
