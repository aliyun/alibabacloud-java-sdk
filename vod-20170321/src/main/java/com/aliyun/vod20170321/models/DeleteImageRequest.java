// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DeleteImageRequest extends TeaModel {
    /**
     * <p>The method that is used to delete images. Valid values:</p>
     * <ul>
     * <li><strong>ImageURL</strong>: deletes images based on URLs.</li>
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
     * <p>The ID of the image. You can specify up to 20 image IDs and separate them with commas (,). You can use one of the following methods to obtain the image ID:</p>
     * <ul>
     * <li>Log on to the <a href="https://vod.console.aliyun.com">ApsaraVideo VOD console</a>. In the left-side navigation pane, choose <strong>Media Files</strong> &gt; <strong>Image</strong> to view the image ID.</li>
     * <li>Obtain the image ID from the response to the <a href="~~CreateUploadImage~~">CreateUploadImage</a> operation that you call to obtain the upload credential and URL.</li>
     * <li>Obtain the image ID from the response to the <a href="~~SearchMedia~~">SearchMedia</a> operation that you call to query images.</li>
     * </ul>
     * <blockquote>
     * <p> This parameter takes effect and is required only if you set <strong>DeleteImageType</strong> to <strong>ImageId</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>bbc65bba53fed90de118a7849****,594228cdd14b4d069fc17a8c4a****</p>
     */
    @NameInMap("ImageIds")
    public String imageIds;

    /**
     * <p>The type of images that you want to delete. The images are associated with the video. Valid values:</p>
     * <ul>
     * <li><strong>CoverSnapshot</strong>: thumbnail snapshot.</li>
     * <li><strong>NormalSnapshot</strong>: regular snapshot.</li>
     * <li><strong>SpriteSnapshot</strong>: sprite snapshot.</li>
     * <li><strong>SpriteOriginSnapshot</strong>: sprite source snapshot.</li>
     * <li><strong>All</strong>: images of all the preceding types. You can specify multiple types other than <code>All</code> for this parameter. Separate multiple types with commas (,).</li>
     * </ul>
     * <blockquote>
     * <p> This parameter takes effect and is required only if you set <strong>DeleteImageType</strong> to <strong>VideoId</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>All</p>
     */
    @NameInMap("ImageType")
    public String imageType;

    /**
     * <p>The URL of the image. You can obtain the value of <code>ImageURL</code> from the response to the <a href="~~CreateUploadImage~~">CreateUploadImage</a> operation. You can specify up to 20 URLs and separate them with commas (,).</p>
     * <blockquote>
     * <p> This parameter takes effect and is required only if you set <strong>DeleteImageType</strong> to <strong>ImageURL</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p><a href="https://example.aliyundoc.com/image/default/41AE7ADABBE*****.png">https://example.aliyundoc.com/image/default/41AE7ADABBE*****.png</a></p>
     */
    @NameInMap("ImageURLs")
    public String imageURLs;

    /**
     * <p>The ID of the video. You can specify only one ID. You can use one of the following methods to obtain the ID:</p>
     * <ul>
     * <li>Log on to the <a href="https://vod.console.aliyun.com">ApsaraVideo VOD console</a>. In the left-side navigation pane, choose <strong>Media Files</strong> &gt; <strong>Audio/Video</strong>. On the Video and Audio page, view the ID of the media file.</li>
     * <li>Obtain the video ID from the response to the <a href="~~CreateUploadVideo~~">CreateUploadVideo</a> operation that you call to obtain the upload credential and URL.</li>
     * <li>Obtain the video ID from the response to the <a href="~~SearchMedia~~">SearchMedia</a> operation that you call to query videos.</li>
     * </ul>
     * <blockquote>
     * <p> This parameter takes effect and is required only if you set <strong>DeleteImageType</strong> to <strong>VideoId</strong>.</p>
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
