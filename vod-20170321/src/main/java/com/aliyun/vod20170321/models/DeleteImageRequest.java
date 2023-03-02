// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DeleteImageRequest extends TeaModel {
    /**
     * <p>The method that is used to delete images. Valid values:</p>
     * <br>
     * <p>*   **ImageURL**: Delete the specified image based on the image URL.</p>
     * <p>*   **ImageId**: Delete the specified image based on the image ID.</p>
     * <p>*   **VideoId**: Delete the image that is associated with a video ID.</p>
     */
    @NameInMap("DeleteImageType")
    public String deleteImageType;

    /**
     * <p>The ID of the image.</p>
     * <br>
     * <p>*   This parameter only takes effect when the **DeleteImageType** parameter is set to **ImageId**. In this case, you must set this parameter.</p>
     * <p>*   Separate multiple IDs with commas (,).</p>
     */
    @NameInMap("ImageIds")
    public String imageIds;

    /**
     * <p>The type of the image. This parameter only takes effect when the **DeleteImageType** parameter is set to **VideoId**. In this case, you must set this parameter. Valid values:</p>
     * <br>
     * <p>*   **CoverSnapshot**: thumbnail snapshot.</p>
     * <p>*   **NormalSnapshot**: normal snapshot.</p>
     * <p>*   **SpriteSnapshot**: sprite snapshot.</p>
     * <p>*   **SpriteOriginSnapshot**: sprite source snapshot.</p>
     * <p>*   **All**: images of all the preceding types. If this parameter is not set to All, you can specify multiple types and separate them with commas (,).</p>
     */
    @NameInMap("ImageType")
    public String imageType;

    /**
     * <p>The URL of the image.</p>
     * <br>
     * <p>*   This parameter only takes effect when the **DeleteImageType** parameter is set to **ImageURL**. In this case, you must set this parameter.</p>
     * <p>*   Encode multiple image URLs and separate them with commas (,).</p>
     * <p>*   The use of special characters in image URLs may lead to the failure to delete the images. To prevent such failure, you must encode the image URLs before you concatenate them into a string with commas (,).</p>
     */
    @NameInMap("ImageURLs")
    public String imageURLs;

    /**
     * <p>The ID of the video. This parameter only takes effect when the **DeleteImageType** parameter is set to **VideoId**. In this case, you must set this parameter.</p>
     */
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
