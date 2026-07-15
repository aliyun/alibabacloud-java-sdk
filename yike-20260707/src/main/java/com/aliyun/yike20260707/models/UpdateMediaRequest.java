// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260707.models;

import com.aliyun.tea.*;

public class UpdateMediaRequest extends TeaModel {
    @NameInMap("AppendTags")
    public Boolean appendTags;

    /**
     * <strong>example:</strong>
     * <p><a href="https://bullet-time-20240910.oss-cn-shanghai.aliyuncs.com/ice-generated/a97255309a7c71f093d3e7f6d75a6302/snapshots/normal/2a4030b1950443048f3e3f81489d57eb-00001.jpg">https://bullet-time-20240910.oss-cn-shanghai.aliyuncs.com/ice-generated/a97255309a7c71f093d3e7f6d75a6302/snapshots/normal/2a4030b1950443048f3e3f81489d57eb-00001.jpg</a></p>
     */
    @NameInMap("CoverURL")
    public String coverURL;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("DynamicMetaData")
    public String dynamicMetaData;

    /**
     * <strong>example:</strong>
     * <p><a href="https://example-bucket.oss-cn-shanghai.aliyuncs.com/example.mp4">https://example-bucket.oss-cn-shanghai.aliyuncs.com/example.mp4</a></p>
     */
    @NameInMap("InputURL")
    public String inputURL;

    /**
     * <strong>example:</strong>
     * <p><strong><strong>20b48fb04483915d4f2cd8ac</strong></strong></p>
     */
    @NameInMap("MediaId")
    public String mediaId;

    /**
     * <strong>example:</strong>
     * <p>剪映动画</p>
     */
    @NameInMap("MediaTags")
    public String mediaTags;

    /**
     * <strong>example:</strong>
     * <p>title</p>
     */
    @NameInMap("Title")
    public String title;

    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("UserData")
    public String userData;

    public static UpdateMediaRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMediaRequest self = new UpdateMediaRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMediaRequest setAppendTags(Boolean appendTags) {
        this.appendTags = appendTags;
        return this;
    }
    public Boolean getAppendTags() {
        return this.appendTags;
    }

    public UpdateMediaRequest setCoverURL(String coverURL) {
        this.coverURL = coverURL;
        return this;
    }
    public String getCoverURL() {
        return this.coverURL;
    }

    public UpdateMediaRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateMediaRequest setDynamicMetaData(String dynamicMetaData) {
        this.dynamicMetaData = dynamicMetaData;
        return this;
    }
    public String getDynamicMetaData() {
        return this.dynamicMetaData;
    }

    public UpdateMediaRequest setInputURL(String inputURL) {
        this.inputURL = inputURL;
        return this;
    }
    public String getInputURL() {
        return this.inputURL;
    }

    public UpdateMediaRequest setMediaId(String mediaId) {
        this.mediaId = mediaId;
        return this;
    }
    public String getMediaId() {
        return this.mediaId;
    }

    public UpdateMediaRequest setMediaTags(String mediaTags) {
        this.mediaTags = mediaTags;
        return this;
    }
    public String getMediaTags() {
        return this.mediaTags;
    }

    public UpdateMediaRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public UpdateMediaRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

}
