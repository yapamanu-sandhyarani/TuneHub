package com.example.demo.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entities.Playlist;

public interface PlaylistService {


	public void addPlaylist(Playlist playlist);

	public List<Playlist> fetchAllPlaylists();

}
