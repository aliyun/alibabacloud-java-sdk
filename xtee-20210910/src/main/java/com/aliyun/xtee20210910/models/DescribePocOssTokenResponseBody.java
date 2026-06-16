// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribePocOssTokenResponseBody extends TeaModel {
    /**
     * <p>The AccessKey ID used to upload files to OSS.</p>
     * 
     * <strong>example:</strong>
     * <p>LTAxxxxxxxxx</p>
     */
    @NameInMap("AccessId")
    public String accessId;

    /**
     * <p>The host address.</p>
     * 
     * <strong>example:</strong>
     * <p>192.168.34.191</p>
     */
    @NameInMap("Host")
    public String host;

    /**
     * <p>The key required for file upload.</p>
     * 
     * <strong>example:</strong>
     * <p>saf/de/namelist/e924/ufzgsedX9bd3a7</p>
     */
    @NameInMap("Key")
    public String key;

    /**
     * <p>The OSS security policy.</p>
     * 
     * <strong>example:</strong>
     * <p>eyJleHBpxxxcmF0aW9xxxIjoiMjAyNS0wNy0zMFQxxxxxwNjowNTo0OSxxxxx45NTRaIiwiY29uxxxZGl0a5Ymxxxxxxxxxxxxx</p>
     */
    @NameInMap("Policy")
    public String policy;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A32FE941-35F2-5378-B37C-4B8FDB16F094</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The signature information for the upload.</p>
     * 
     * <strong>example:</strong>
     * <p>0lxQEWM0BqHd476JJE0fNXdS3UA=</p>
     */
    @NameInMap("Signature")
    public String signature;

    /**
     * <p>The returned result.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("resultObject")
    public Boolean resultObject;

    public static DescribePocOssTokenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePocOssTokenResponseBody self = new DescribePocOssTokenResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePocOssTokenResponseBody setAccessId(String accessId) {
        this.accessId = accessId;
        return this;
    }
    public String getAccessId() {
        return this.accessId;
    }

    public DescribePocOssTokenResponseBody setHost(String host) {
        this.host = host;
        return this;
    }
    public String getHost() {
        return this.host;
    }

    public DescribePocOssTokenResponseBody setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public DescribePocOssTokenResponseBody setPolicy(String policy) {
        this.policy = policy;
        return this;
    }
    public String getPolicy() {
        return this.policy;
    }

    public DescribePocOssTokenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePocOssTokenResponseBody setSignature(String signature) {
        this.signature = signature;
        return this;
    }
    public String getSignature() {
        return this.signature;
    }

    public DescribePocOssTokenResponseBody setResultObject(Boolean resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public Boolean getResultObject() {
        return this.resultObject;
    }

}
