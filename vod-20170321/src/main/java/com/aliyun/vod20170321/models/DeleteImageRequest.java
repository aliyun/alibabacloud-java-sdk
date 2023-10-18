// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DeleteImageRequest extends TeaModel {
    /**
     * <p>The method that is used to delete images. Valid values:</p>
     * <br>
     * <p>*   **ImageURL**: deletes images based on URLs.</p>
     * <p>*   **ImageId**: deletes images based on image IDs.</p>
     * <p>*   **VideoId**: deletes images associated with a video based on the video ID.</p>
     */
    @NameInMap("DeleteImageType")
    public String deleteImageType;

    /**
     * <p>The ID of the image file. You can specify multiple image IDs. Separate multiple IDs with commas (,). You can use one of the following methods to obtain the image ID:</p>
     * <br>
     * <p>*   Log on to the [ApsaraVideo VOD console](https://vod.console.aliyun.com). In the left-side navigation pane, choose **Media Files** > **Image** to view the image ID. This method is applicable to images that are uploaded by using the ApsaraVideo VOD console.</p>
     * <p>*   Obtain the value of the ImageId parameter from the response to the [CreateUploadImage](~~55619~~) operation.</p>
     * <p>*   Obtain the value of the ImageId parameter from the response to the [SearchMedia](~~86044~~) operation after you upload images.</p>
     * <br>
     * <p>> This parameter is required only if you set **DeleteImageType** to **ImageId**.</p>
     */
    @NameInMap("ImageIds")
    public String imageIds;

    /**
     * <p>The type of images that you want to delete. The images are associated with the video. This parameter is required only if you set **DeleteImageType** to **VideoId**. Valid values:</p>
     * <br>
     * <p>*   **CoverSnapshot**: thumbnail snapshot.</p>
     * <p>*   **NormalSnapshot**: normal snapshot.</p>
     * <p>*   **SpriteSnapshot**: sprite snapshot.</p>
     * <p>*   **SpriteOriginSnapshot**: sprite source snapshot.</p>
     * <p>*   **All**: images of all the preceding types. If this parameter is not set to All, you can specify multiple types and separate the types with commas (,).</p>
     */
    @NameInMap("ImageType")
    public String imageType;

    /**
     * <p>The URL of the image. You can obtain the value of ImageURL from the response to the [CreateUploadImage](~~55619~~) operation. You can specify multiple URLs. Separate multiple URLs with commas (,).</p>
     * <br>
     * <p>> This parameter is required only if you set **DeleteImageType** to **ImageURL**.</p>
     */
    @NameInMap("ImageURLs")
    public String imageURLs;

    /**
     * <p>The ID of the video file. You can use one of the following methods to obtain the video ID:</p>
     * <br>
     * <p>*   Log on to the [ApsaraVideo VOD](https://vod.console.aliyun.com) console. In the left-side navigation pane, choose **Media Files** > **Audio/Video**. On the Video and Audio page, view the ID of the media file. This method is applicable to files that are uploaded by using the ApsaraVideo VOD console.</p>
     * <p>*   Obtain the value of the VideoId parameter from the response to the [CreateUploadVideo](~~55407~~) operation.</p>
     * <p>*   Obtain the value of the VideoId parameter from the response to the [SearchMedia](~~86044~~) operation after you upload media files.</p>
     * <br>
     * <p>> This parameter is required only if you set **DeleteImageType** to **VideoId**.</p>
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
