// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260707.models;

import com.aliyun.tea.*;

public class GetMediaRequest extends TeaModel {
    /**
     * <p>Specifies the validity period, in seconds, of the file URL that requires authentication for access.</p>
     * 
     * <strong>example:</strong>
     * <p>3600</p>
     */
    @NameInMap("AuthTimeout")
    public Long authTimeout;

    @NameInMap("BizConfig")
    public String bizConfig;

    /**
     * <p>This parameter is currently unavailable.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://example-bucket.oss-cn-shanghai.aliyuncs.com/example.mp4">https://example-bucket.oss-cn-shanghai.aliyuncs.com/example.mp4</a></p>
     */
    @NameInMap("InputURL")
    public String inputURL;

    /**
     * <p>The ID of the media asset. If this parameter is specified, the query is performed based on this ID and the system verifies whether it is a valid media asset ID.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong>20b48fb04483915d4f2cd8ac</strong></strong></p>
     */
    @NameInMap("MediaId")
    public String mediaId;

    public static GetMediaRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMediaRequest self = new GetMediaRequest();
        return TeaModel.build(map, self);
    }

    public GetMediaRequest setAuthTimeout(Long authTimeout) {
        this.authTimeout = authTimeout;
        return this;
    }
    public Long getAuthTimeout() {
        return this.authTimeout;
    }

    public GetMediaRequest setBizConfig(String bizConfig) {
        this.bizConfig = bizConfig;
        return this;
    }
    public String getBizConfig() {
        return this.bizConfig;
    }

    public GetMediaRequest setInputURL(String inputURL) {
        this.inputURL = inputURL;
        return this;
    }
    public String getInputURL() {
        return this.inputURL;
    }

    public GetMediaRequest setMediaId(String mediaId) {
        this.mediaId = mediaId;
        return this;
    }
    public String getMediaId() {
        return this.mediaId;
    }

}
