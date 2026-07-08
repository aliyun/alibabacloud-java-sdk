// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeComfyUserDataDownloadUrlResponseBody extends TeaModel {
    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Code")
    public Long code;

    /**
     * <p>The download URL for the application package.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://xxx.xxx.xxx">https://xxx.xxx.xxx</a>.</p>
     */
    @NameInMap("DownloadUrl")
    public String downloadUrl;

    /**
     * <p>The expiration time for the download link.</p>
     * 
     * <strong>example:</strong>
     * <p>1752805579553</p>
     */
    @NameInMap("ExpiredTime")
    public String expiredTime;

    /**
     * <p>The result message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>BEA5625F-8FCF-48F4-851B-CA63946DA664</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeComfyUserDataDownloadUrlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeComfyUserDataDownloadUrlResponseBody self = new DescribeComfyUserDataDownloadUrlResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeComfyUserDataDownloadUrlResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public DescribeComfyUserDataDownloadUrlResponseBody setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
        return this;
    }
    public String getDownloadUrl() {
        return this.downloadUrl;
    }

    public DescribeComfyUserDataDownloadUrlResponseBody setExpiredTime(String expiredTime) {
        this.expiredTime = expiredTime;
        return this;
    }
    public String getExpiredTime() {
        return this.expiredTime;
    }

    public DescribeComfyUserDataDownloadUrlResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeComfyUserDataDownloadUrlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
