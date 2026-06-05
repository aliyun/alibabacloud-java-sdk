// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeComfyUserDataUploadUrlResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Code")
    public Long code;

    /**
     * <strong>example:</strong>
     * <p>2026-08-28T16:00Z</p>
     */
    @NameInMap("ExpiredTime")
    public String expiredTime;

    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
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

    /**
     * <strong>example:</strong>
     * <p>oss-bucket.oss-cn-shanghai-cloudspe.aliyuncs.com/path/userid/test.png?x-oss-date=20260602T093618Z&amp;x-oss-expires=29&amp;x-oss-security-token=xxxxx%2F68FY2NI6nyNgueynMjneKjKXD6l5tS5h3S2%xxxxx%xxxx%xxxxxxx%2Fb%xxxx%sdffeeeaasdf%xxx%xx%xx%xxxx%2BeASOv2N8q%xxx%2B6XBxllroojFliSTfsqGI2YMHpoRwJmyfXK32BQPb2SvQ0AM23soq%2FspAI4f9vtFG0yv9fKWMw%xxxxxxxxx%xxxxxxxx%3D%3D&amp;x-oss-signature-version=OSS4-HMAC&amp;x-oss-credential=STS.xxxxx%2F20260dfa202%2Fcn-shanghai-cloud%2Foss%2Faliyun_v4_request&amp;x-oss-signature=xxxxxxxxxxxxxx</p>
     */
    @NameInMap("UploadUrl")
    public String uploadUrl;

    public static DescribeComfyUserDataUploadUrlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeComfyUserDataUploadUrlResponseBody self = new DescribeComfyUserDataUploadUrlResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeComfyUserDataUploadUrlResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public DescribeComfyUserDataUploadUrlResponseBody setExpiredTime(String expiredTime) {
        this.expiredTime = expiredTime;
        return this;
    }
    public String getExpiredTime() {
        return this.expiredTime;
    }

    public DescribeComfyUserDataUploadUrlResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeComfyUserDataUploadUrlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeComfyUserDataUploadUrlResponseBody setUploadUrl(String uploadUrl) {
        this.uploadUrl = uploadUrl;
        return this;
    }
    public String getUploadUrl() {
        return this.uploadUrl;
    }

}
