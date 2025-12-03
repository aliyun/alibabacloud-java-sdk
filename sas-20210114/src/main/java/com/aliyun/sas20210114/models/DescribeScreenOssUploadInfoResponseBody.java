// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20210114.models;

import com.aliyun.tea.*;

public class DescribeScreenOssUploadInfoResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>LTAI5txxxxxxx</p>
     */
    @NameInMap("AccessId")
    public String accessId;

    /**
     * <strong>example:</strong>
     * <p>1719919893</p>
     */
    @NameInMap("Expire")
    public Integer expire;

    /**
     * <strong>example:</strong>
     * <p><a href="https://oss-cipxxxxxxxxxliyuncs.com">https://oss-cipxxxxxxxxxliyuncs.com</a></p>
     */
    @NameInMap("Host")
    public String host;

    /**
     * <strong>example:</strong>
     * <p>DegradePool_Offset_****</p>
     */
    @NameInMap("Key")
    public String key;

    /**
     * <strong>example:</strong>
     * <p>eyJleHBpcmF0aW9uIjoiMjAyNC0wOC0xNVQwOToxMTo1My40MDVaIiwiY29uZGl0aW9ucyI6W1siY29udGVudC1sZW5ndGgtcmFuZ2UiLDAsMTA0ODU3NjAwMF0sWyJzdGFydHMtd2l0aCIsIiRrZXkiLCJzY3JlZW5Mb2dvXC8xNzY2MTg1ODkxxxx</p>
     */
    @NameInMap("Policy")
    public String policy;

    /**
     * <strong>example:</strong>
     * <p>30CBF632-109F-596F-97F2-451C8B2A****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <strong>example:</strong>
     * <p>wBiwkhd5LGcLzijtc3FhI****</p>
     */
    @NameInMap("Signature")
    public String signature;

    public static DescribeScreenOssUploadInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeScreenOssUploadInfoResponseBody self = new DescribeScreenOssUploadInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeScreenOssUploadInfoResponseBody setAccessId(String accessId) {
        this.accessId = accessId;
        return this;
    }
    public String getAccessId() {
        return this.accessId;
    }

    public DescribeScreenOssUploadInfoResponseBody setExpire(Integer expire) {
        this.expire = expire;
        return this;
    }
    public Integer getExpire() {
        return this.expire;
    }

    public DescribeScreenOssUploadInfoResponseBody setHost(String host) {
        this.host = host;
        return this;
    }
    public String getHost() {
        return this.host;
    }

    public DescribeScreenOssUploadInfoResponseBody setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public DescribeScreenOssUploadInfoResponseBody setPolicy(String policy) {
        this.policy = policy;
        return this;
    }
    public String getPolicy() {
        return this.policy;
    }

    public DescribeScreenOssUploadInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeScreenOssUploadInfoResponseBody setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public DescribeScreenOssUploadInfoResponseBody setSignature(String signature) {
        this.signature = signature;
        return this;
    }
    public String getSignature() {
        return this.signature;
    }

}
