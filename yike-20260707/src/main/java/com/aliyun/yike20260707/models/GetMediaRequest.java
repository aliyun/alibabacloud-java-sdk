// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260707.models;

import com.aliyun.tea.*;

public class GetMediaRequest extends TeaModel {
    /**
     * <p>The validity period of the signed file URL. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>3600</p>
     */
    @NameInMap("AuthTimeout")
    public Long authTimeout;

    /**
     * <p>Currently unavailable.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://example-bucket.oss-cn-shanghai.aliyuncs.com/example.mp4">https://example-bucket.oss-cn-shanghai.aliyuncs.com/example.mp4</a></p>
     */
    @NameInMap("InputURL")
    public String inputURL;

    /**
     * <p>The media asset ID. If this parameter is not empty, the system queries the media asset by this ID and validates whether the value is a valid MediaId.</p>
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
