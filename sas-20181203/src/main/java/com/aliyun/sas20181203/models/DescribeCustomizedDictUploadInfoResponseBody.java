// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeCustomizedDictUploadInfoResponseBody extends TeaModel {
    /**
     * <p>The AccessKey ID that is required to access the OSS object.</p>
     * 
     * <strong>example:</strong>
     * <p>LTAI4G1mgPbjvG********</p>
     */
    @NameInMap("Accessid")
    public String accessid;

    /**
     * <p>The time when the OSS signature expires. This value is a UNIX timestamp.</p>
     * 
     * <strong>example:</strong>
     * <p>1719921470</p>
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
     * <p>The key of the OSS object.</p>
     * 
     * <strong>example:</strong>
     * <p>HC_CUSTOMIZED_DICT/176618589410****.tmp</p>
     */
    @NameInMap("Key")
    public String key;

    /**
     * <p>The policy of the OSS bucket.</p>
     * 
     * <strong>example:</strong>
     * <p>eyJleHBpcmF0aW9uIjoiMjAyNC0wNy0wMlQxMTo1Nzo1MC44MzJaIiwiY29uZGl0aW9ucyI6W1siY29udGVudC1sZW5ndGgtcmFuZ2UiLDAsNDA5NjBdLFsiZXEiLCIka2V5IiwiSENfQ1VTVE9NSVpFRF9ESUNUXC8xNzY2MTg1ODk0MTA0Njc1LnRtc****</p>
     */
    @NameInMap("Policy")
    public String policy;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>BDEDEEE7-AC25-559E-8C12-5168B139****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The security token.</p>
     * 
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>The OSS signature.</p>
     * 
     * <strong>example:</strong>
     * <p>mWGRgn0CtdbVf8UuJbTXOmo2****</p>
     */
    @NameInMap("Signature")
    public String signature;

    public static DescribeCustomizedDictUploadInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCustomizedDictUploadInfoResponseBody self = new DescribeCustomizedDictUploadInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCustomizedDictUploadInfoResponseBody setAccessid(String accessid) {
        this.accessid = accessid;
        return this;
    }
    public String getAccessid() {
        return this.accessid;
    }

    public DescribeCustomizedDictUploadInfoResponseBody setExpire(String expire) {
        this.expire = expire;
        return this;
    }
    public String getExpire() {
        return this.expire;
    }

    public DescribeCustomizedDictUploadInfoResponseBody setHost(String host) {
        this.host = host;
        return this;
    }
    public String getHost() {
        return this.host;
    }

    public DescribeCustomizedDictUploadInfoResponseBody setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public DescribeCustomizedDictUploadInfoResponseBody setPolicy(String policy) {
        this.policy = policy;
        return this;
    }
    public String getPolicy() {
        return this.policy;
    }

    public DescribeCustomizedDictUploadInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCustomizedDictUploadInfoResponseBody setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public DescribeCustomizedDictUploadInfoResponseBody setSignature(String signature) {
        this.signature = signature;
        return this;
    }
    public String getSignature() {
        return this.signature;
    }

}
