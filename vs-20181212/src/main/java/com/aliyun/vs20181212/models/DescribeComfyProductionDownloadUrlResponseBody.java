// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeComfyProductionDownloadUrlResponseBody extends TeaModel {
    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Code")
    public Long code;

    /**
     * <p>The download URL of the production. Use the Alibaba Cloud OSS SDK to download the production.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://xxx.xxx.xxx">https://xxx.xxx.xxx</a></p>
     */
    @NameInMap("DownloadUrl")
    public String downloadUrl;

    /**
     * <p>The expiration time of the download URL. The time is in UTC and follows the ISO 8601 standard in the YYYY-MM-DDTHH:mmZ format.</p>
     * 
     * <strong>example:</strong>
     * <p>2029-03-28T16:00Z</p>
     */
    @NameInMap("ExpiredTime")
    public String expiredTime;

    /**
     * <p>The description.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>BEA5625F-8FCF-48F4-851B-CA63946DA664</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeComfyProductionDownloadUrlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeComfyProductionDownloadUrlResponseBody self = new DescribeComfyProductionDownloadUrlResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeComfyProductionDownloadUrlResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public DescribeComfyProductionDownloadUrlResponseBody setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
        return this;
    }
    public String getDownloadUrl() {
        return this.downloadUrl;
    }

    public DescribeComfyProductionDownloadUrlResponseBody setExpiredTime(String expiredTime) {
        this.expiredTime = expiredTime;
        return this;
    }
    public String getExpiredTime() {
        return this.expiredTime;
    }

    public DescribeComfyProductionDownloadUrlResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeComfyProductionDownloadUrlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
