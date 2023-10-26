package com.ssafy.dingdong.domain.room.dto.response;

import com.ssafy.dingdong.domain.room.entity.Furniture;

public record FurnitureDetailDto(
	String furnitureId,
	Long categoryId,
	String description,
	String thumbnail,
	int xSize,
	int ySize,
	int zSize,
	int xDefault,
	int yDefault,
	int zDefault
) {

	public FurnitureDetailDto(Furniture furniture){
		this(furniture.getFurnitureId(),
			furniture.getFurnitureCategory().getCategoryId(),
			furniture.getFurnitureCategory().getDescription(),
			furniture.getThumbnail(),
			Math.round(furniture.getXSize() / 0.24f),
			Math.round(furniture.getYSize() / 0.24f),
			Math.round(furniture.getZSize() / 0.24f),
			furniture.getFurnitureCategory().getXDefault(),
			furniture.getFurnitureCategory().getYDefault(),
			furniture.getFurnitureCategory().getZDefault());
	}
}
