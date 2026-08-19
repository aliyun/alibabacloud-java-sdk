// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DeleteImageRequest extends TeaModel {
    /**
     * <p>The type of image deletion operation. Valid values:</p>
     * <ul>
     * <li><strong>ImageURL</strong>: deletes images based on image URLs.</li>
     * <li><strong>ImageId</strong>: deletes images based on image IDs.</li>
     * <li><strong>VideoId</strong>: deletes images associated with a video based on the video ID.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>VideoId</p>
     */
    @NameInMap("DeleteImageType")
    public String deleteImageType;

    /**
     * <p>The image IDs. Separate multiple IDs with commas (,). A maximum of 20 IDs are supported. You can obtain image IDs by using the following methods:</p>
     * <ul>
     * <li>Log on to the <a href="https://vod.console.aliyun.com">ApsaraVideo VOD console</a> and choose <strong>Media Files</strong> &gt; <strong>Image</strong> to view the IDs.</li>
     * <li>Obtain the IDs from the response of the <a href="~~CreateUploadImage~~">CreateUploadImage</a> operation that is called to obtain the upload URL and credential.</li>
     * <li>Obtain the IDs from the response of the <a href="~~SearchMedia~~">SearchMedia</a> operation that is called to query images.</li>
     * </ul>
     * <blockquote>
     * <p>This parameter is available and required only when <strong>DeleteImageType</strong> is set to <strong>ImageId</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>bbc65bba53fed90de118a7849****,594228cdd14b4d069fc17a8c4a****</p>
     */
    @NameInMap("ImageIds")
    public String imageIds;

    /**
     * <p>The type of images associated with the video that you want to delete. Valid values:</p>
     * <ul>
     * <li><strong>CoverSnapshot</strong>: thumbnail snapshot.</li>
     * <li><strong>NormalSnapshot</strong>: regular snapshot.</li>
     * <li><strong>SpriteSnapshot</strong>: sprite snapshot.</li>
     * <li><strong>SpriteOriginSnapshot</strong>: sprite source image.</li>
     * <li><strong>All</strong>: all of the preceding image types. If the value is not <code>All</code>, you can specify multiple image types. Separate multiple values with commas (,).</li>
     * </ul>
     * <blockquote>
     * <p>This parameter is available and required only when <strong>DeleteImageType</strong> is set to <strong>VideoId</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>All</p>
     */
    @NameInMap("ImageType")
    public String imageType;

    /**
     * <p>The image URLs. The value is the <code>ImageURL</code> parameter returned by the <a href="~~CreateUploadImage~~">CreateUploadImage</a> operation. Separate multiple URLs with commas (,). A maximum of 20 URLs are supported.</p>
     * <blockquote>
     * <p>This parameter is available and required only when <strong>DeleteImageType</strong> is set to <strong>ImageURL</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p><a href="https://example.aliyundoc.com/image/default/41AE7ADABBE*****.png">https://example.aliyundoc.com/image/default/41AE7ADABBE*****.png</a></p>
     */
    @NameInMap("ImageURLs")
    public String imageURLs;

    /**
     * <p>The video ID. Only a single video ID is supported. You can obtain the video ID by using the following methods:</p>
     * <ul>
     * <li>Log on to the <a href="https://vod.console.aliyun.com">ApsaraVideo VOD console</a> and choose <strong>Media Files</strong> &gt; <strong>Audio/Video</strong> to view the video ID.</li>
     * <li>Obtain the ID from the response of the <a href="~~CreateUploadVideo~~">CreateUploadVideo</a> operation that is called to obtain the upload URL and credential.</li>
     * <li>Obtain the ID from the response of the <a href="~~SearchMedia~~">SearchMedia</a> operation that is called to query videos.</li>
     * </ul>
     * <blockquote>
     * <p>This parameter is available and required only when <strong>DeleteImageType</strong> is set to <strong>VideoId</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>eb1861d2c9a8842340e989dd56****</p>
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
