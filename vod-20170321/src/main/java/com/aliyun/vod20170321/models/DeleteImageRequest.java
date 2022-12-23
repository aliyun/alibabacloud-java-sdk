// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DeleteImageRequest extends TeaModel {
    // The method that is used to delete images. Valid values:
    // 
    // *   **ImageURL**: Delete the specified image based on the image URL.
    // *   **ImageId**: Delete the specified image based on the image ID.
    // *   **VideoId**: Delete the image that is associated with a video ID.
    @NameInMap("DeleteImageType")
    public String deleteImageType;

    // The ID of the image.
    // 
    // *   This parameter only takes effect when the **DeleteImageType** parameter is set to **ImageId**. In this case, you must set this parameter.
    // *   Separate multiple IDs with commas (,).
    @NameInMap("ImageIds")
    public String imageIds;

    // The type of the image. This parameter only takes effect when the **DeleteImageType** parameter is set to **VideoId**. In this case, you must set this parameter. Valid values:
    // 
    // *   **CoverSnapshot**: thumbnail snapshot.
    // *   **NormalSnapshot**: normal snapshot.
    // *   **SpriteSnapshot**: sprite snapshot.
    // *   **SpriteOriginSnapshot**: sprite source snapshot.
    // *   **All**: images of all the preceding types. If this parameter is not set to All, you can specify multiple types and separate them with commas (,).
    @NameInMap("ImageType")
    public String imageType;

    // The URL of the image.
    // 
    // *   This parameter only takes effect when the **DeleteImageType** parameter is set to **ImageURL**. In this case, you must set this parameter.
    // *   Encode multiple image URLs and separate them with commas (,).
    // *   The use of special characters in image URLs may lead to the failure to delete the images. To prevent such failure, you must encode the image URLs before you concatenate them into a string with commas (,).
    @NameInMap("ImageURLs")
    public String imageURLs;

    // The ID of the video. This parameter only takes effect when the **DeleteImageType** parameter is set to **VideoId**. In this case, you must set this parameter.
    @NameInMap("VideoId")
    public String videoId;

    public static DeleteImageRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteImageRequest self = new DeleteImageRequest();
        return TeaModel.build(map, self);
    }

    public DeleteImageRequest setDeleteImageType(String deleteImageType) {
        this.deleteImageType = deleteImageType;
        return this;
    }
    public String getDeleteImageType() {
        return this.deleteImageType;
    }

    public DeleteImageRequest setImageIds(String imageIds) {
        this.imageIds = imageIds;
        return this;
    }
    public String getImageIds() {
        return this.imageIds;
    }

    public DeleteImageRequest setImageType(String imageType) {
        this.imageType = imageType;
        return this;
    }
    public String getImageType() {
        return this.imageType;
    }

    public DeleteImageRequest setImageURLs(String imageURLs) {
        this.imageURLs = imageURLs;
        return this;
    }
    public String getImageURLs() {
        return this.imageURLs;
    }

    public DeleteImageRequest setVideoId(String videoId) {
        this.videoId = videoId;
        return this;
    }
    public String getVideoId() {
        return this.videoId;
    }

}
