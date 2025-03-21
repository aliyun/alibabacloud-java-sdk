// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class UpdateVideoInfoRequest extends TeaModel {
    /**
     * <p>The category ID. You can use one of the following methods to obtain the ID:</p>
     * <ul>
     * <li>Log on to the <a href="https://vod.console.aliyun.com">ApsaraVideo VOD console</a>. In the left-side navigation pane, choose <strong>Configuration Management</strong> &gt; <strong>Media Management</strong> &gt; <strong>Categories</strong> to view the category ID of the media file.</li>
     * <li>View the value of the CateId parameter returned by the <a href="https://help.aliyun.com/document_detail/56401.html">AddCategory</a> operation that you called to create a category.</li>
     * <li>View the value of the CateId parameter returned by the <a href="https://help.aliyun.com/document_detail/56406.html">GetCategories</a> operation that you called to query a category.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>384761111</p>
     */
    @NameInMap("CateId")
    public Long cateId;

    /**
     * <p>The URL of the audio/video thumbnail.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://example.aliyundoc.com/****.jpg">https://example.aliyundoc.com/****.jpg</a></p>
     */
    @NameInMap("CoverURL")
    public String coverURL;

    /**
     * <p>The description of the audio or video file.</p>
     * <ul>
     * <li>The description can be up to 1,024 bytes in length.</li>
     * <li>The value is encoded in UTF-8.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>video description</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The tags of the media file.</p>
     * <ul>
     * <li>Each tag can be up to 32 bytes in length. You can specify up to 16 tags.</li>
     * <li>Separate multiple tags with commas (,).</li>
     * <li>The value is encoded in UTF-8.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>tag1,tag2</p>
     */
    @NameInMap("Tags")
    public String tags;

    /**
     * <p>The title of the audio or video file.</p>
     * <ul>
     * <li>The name cannot exceed 128 bytes.</li>
     * <li>The value is encoded in UTF-8.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>video title</p>
     */
    @NameInMap("Title")
    public String title;

    /**
     * <p>Custom settings. This is a JSON string that supports message callbacks, upload acceleration, and other settings. For more information, please refer to <a href="https://help.aliyun.com/document_detail/86952.html">UserData</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;MessageCallback&quot;:{&quot;CallbackURL&quot;:&quot;<a href="http://example.aliyundoc.com%22%7D,%22Extend%22:%7B%22localId%22:%22*****%22,%22test%22:%22www%22%7D%7D">http://example.aliyundoc.com&quot;},&quot;Extend&quot;:{&quot;localId&quot;:&quot;*****&quot;,&quot;test&quot;:&quot;www&quot;}}</a></p>
     */
    @NameInMap("UserData")
    public String userData;

    /**
     * <p>The ID of the audio or video file. Perform the following operations to obtain the storage address:</p>
     * <ul>
     * <li>Log on to the <a href="https://vod.console.aliyun.com">ApsaraVideo VOD console</a>. In the left-side navigation pane, choose <strong>Media Files</strong> &gt; <strong>Audio/Video</strong>. On the Video and Audio page, view the ID of the audio or video file. This method is applicable to files that are uploaded by using the ApsaraVideo VOD console.</li>
     * <li>Obtain the value of VideoId from the response to the <a href="https://help.aliyun.com/document_detail/55407.html">CreateUploadVideo</a> operation that you called to obtain the upload URL and credential.</li>
     * <li>View the value of the VideoId parameter returned by the <a href="https://help.aliyun.com/document_detail/86044.html">SearchMedia</a> operation that you called to query media information after the audio or video file is uploaded.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2deda93265312baf9b0ed810d****</p>
     */
    @NameInMap("VideoId")
    public String videoId;

    public static UpdateVideoInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateVideoInfoRequest self = new UpdateVideoInfoRequest();
        return TeaModel.build(map, self);
    }

    public UpdateVideoInfoRequest setCateId(Long cateId) {
        this.cateId = cateId;
        return this;
    }
    public Long getCateId() {
        return this.cateId;
    }

    public UpdateVideoInfoRequest setCoverURL(String coverURL) {
        this.coverURL = coverURL;
        return this;
    }
    public String getCoverURL() {
        return this.coverURL;
    }

    public UpdateVideoInfoRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateVideoInfoRequest setTags(String tags) {
        this.tags = tags;
        return this;
    }
    public String getTags() {
        return this.tags;
    }

    public UpdateVideoInfoRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public UpdateVideoInfoRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

    public UpdateVideoInfoRequest setVideoId(String videoId) {
        this.videoId = videoId;
        return this;
    }
    public String getVideoId() {
        return this.videoId;
    }

}
