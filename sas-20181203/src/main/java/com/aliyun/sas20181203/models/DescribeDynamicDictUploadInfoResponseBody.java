// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeDynamicDictUploadInfoResponseBody extends TeaModel {
    /**
     * <p>The AccessKey ID that is used to access OSS.</p>
     * 
     * <strong>example:</strong>
     * <p>yourAccessKeyID</p>
     */
    @NameInMap("Accessid")
    public String accessid;

    /**
     * <p>The validity period of the signature. The value is a UNIX timestamp.</p>
     * 
     * <strong>example:</strong>
     * <p>1719919893</p>
     */
    @NameInMap("Expire")
    public String expire;

    /**
     * <p>The OSS endpoint.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://aegis-update-static-file.oss-cn-hangzhou.aliyuncs.com">https://aegis-update-static-file.oss-cn-hangzhou.aliyuncs.com</a></p>
     */
    @NameInMap("Host")
    public String host;

    /**
     * <p>The name of the OSS object.</p>
     * 
     * <strong>example:</strong>
     * <p>DegradePool_Offset_****</p>
     */
    @NameInMap("Key")
    public String key;

    /**
     * <p>The OSS security policy.</p>
     * 
     * <strong>example:</strong>
     * <p>eyJleHBpcmF0aW9uIjoiMjAyNC0wNy0wMlQxMTozMTozMy40MjlaIiwiY29uZGl0aW9********</p>
     */
    @NameInMap("Policy")
    public String policy;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A3D7C47D-3F11-57BB-90E8-E5C20C61***</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The signature that is calculated based on <strong>AccessKeySecret</strong> and <strong>Policy</strong>. When you call an OSS API operation, OSS uses the signature information to check the validity of the POST request.</p>
     * 
     * <strong>example:</strong>
     * <p>wBiwkhd5LGcLzijtc3FhI****</p>
     */
    @NameInMap("Signature")
    public String signature;

    public static DescribeDynamicDictUploadInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDynamicDictUploadInfoResponseBody self = new DescribeDynamicDictUploadInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDynamicDictUploadInfoResponseBody setAccessid(String accessid) {
        this.accessid = accessid;
        return this;
    }
    public String getAccessid() {
        return this.accessid;
    }

    public DescribeDynamicDictUploadInfoResponseBody setExpire(String expire) {
        this.expire = expire;
        return this;
    }
    public String getExpire() {
        return this.expire;
    }

    public DescribeDynamicDictUploadInfoResponseBody setHost(String host) {
        this.host = host;
        return this;
    }
    public String getHost() {
        return this.host;
    }

    public DescribeDynamicDictUploadInfoResponseBody setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public DescribeDynamicDictUploadInfoResponseBody setPolicy(String policy) {
        this.policy = policy;
        return this;
    }
    public String getPolicy() {
        return this.policy;
    }

    public DescribeDynamicDictUploadInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDynamicDictUploadInfoResponseBody setSignature(String signature) {
        this.signature = signature;
        return this;
    }
    public String getSignature() {
        return this.signature;
    }

}
