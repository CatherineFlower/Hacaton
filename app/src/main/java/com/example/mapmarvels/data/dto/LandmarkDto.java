package com.example.mapmarvels.data.dto;

import androidx.annotation.Nullable;

import com.google.gson.annotations.SerializedName;

public class LandmarkDto {
    @Nullable
    @SerializedName("id")
    public Integer id;
    @Nullable
    @SerializedName("title")
    public String title;
    @Nullable
    @SerializedName("description")
    public String description;
    @Nullable
    @SerializedName("image")
    public String image;
    @Nullable
    @SerializedName("coords")
    public String coords;
}
