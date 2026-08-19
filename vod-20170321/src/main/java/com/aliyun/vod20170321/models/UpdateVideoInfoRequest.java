// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class UpdateVideoInfoRequest extends TeaModel {
    /**
     * <p>The category ID. You can obtain the ID by using one of the following methods:</p>
     * <ul>
     * <li>Log on to the <a href="https://vod.console.aliyun.com">ApsaraVideo VOD console</a> and choose <strong>Configuration Management</strong> &gt; <strong>Media Management</strong> &gt; <strong>Categories</strong> to view the category ID.</li>
     * <li>Obtain the category ID from the value of the CateId response parameter when you call the <a href="https://help.aliyun.com/document_detail/56401.html">AddCategory</a> operation to create a category.</li>
     * <li>Call the <a href="https://help.aliyun.com/document_detail/56406.html">GetCategories</a> operation to query the category ID, which is the value of the CateId response parameter.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>384761111</p>
     */
    @NameInMap("CateId")
    public Long cateId;

    /**
     * <p>The thumbnail URL of the audio or video file.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://example.aliyundoc.com/****.jpg">https://example.aliyundoc.com/****.jpg</a></p>
     */
    @NameInMap("CoverURL")
    public String coverURL;

    /**
     * <p>The description of the audio or video file.</p>
     * <ul>
     * <li>The description can be up to 1024 bytes in length.</li>
     * <li>The value is encoded in UTF-8.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Alibaba Cloud VOD video description</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The custom ID. Only lowercase letters, uppercase letters, digits, hyphens, and underscores are supported. The value must be 6 to 64 characters in length and is unique at the user level.</p>
     * 
     * <strong>example:</strong>
     * <p>123-123</p>
     */
    @NameInMap("ReferenceId")
    public String referenceId;

    /**
     * <p>The tags.</p>
     * <ul>
     * <li>Each tag can be up to 32 bytes in length. A maximum of 16 tags can be specified.</li>
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
     * <li>The title can be up to 128 bytes in length.</li>
     * <li>The value is encoded in UTF-8.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Alibaba Cloud VOD Video Title</p>
     */
    @NameInMap("Title")
    public String title;

    /**
     * <p>The custom settings. The value is a JSON string that supports settings such as message callbacks and upload acceleration. For more information, see <a href="https://help.aliyun.com/document_detail/86952.html">UserData</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;MessageCallback&quot;:{&quot;CallbackURL&quot;:&quot;<a href="http://example.aliyundoc.com%22%7D,%22Extend%22:%7B%22localId%22:%22*****%22,%22test%22:%22www%22%7D%7D">http://example.aliyundoc.com&quot;},&quot;Extend&quot;:{&quot;localId&quot;:&quot;*****&quot;,&quot;test&quot;:&quot;www&quot;}}</a></p>
     */
    @NameInMap("UserData")
    public String userData;

    /**
     * <p>The audio or video ID. You can obtain the ID by using one of the following methods:</p>
     * <ul>
     * <li>For videos uploaded through the console, log on to the <a href="https://vod.console.aliyun.com">ApsaraVideo VOD console</a> and choose <strong>Media Files</strong> &gt; <strong>Audio/Video</strong> to view the audio or video ID.</li>
     * <li>Obtain the video ID from the value of the VideoId response parameter when you call the <a href="https://help.aliyun.com/document_detail/55407.html">CreateUploadVideo</a> operation to obtain the upload URL and credential.</li>
     * <li>After the video is uploaded, call the <a href="https://help.aliyun.com/document_detail/86044.html">SearchMedia</a> operation to query the audio or video ID, which is the value of the VideoId response parameter.</li>
     * </ul>
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

    public UpdateVideoInfoRequest setReferenceId(String referenceId) {
        this.referenceId = referenceId;
        return this;
    }
    public String getReferenceId() {
        return this.referenceId;
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
