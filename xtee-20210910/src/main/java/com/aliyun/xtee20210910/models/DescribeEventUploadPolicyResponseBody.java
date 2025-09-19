// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeEventUploadPolicyResponseBody extends TeaModel {
    /**
     * <p>ID for accessing OSS</p>
     * 
     * <strong>example:</strong>
     * <p>LTAxxxxxxxxxxxx</p>
     */
    @NameInMap("AccessId")
    public String accessId;

    /**
     * <p>OSS host.</p>
     * 
     * <strong>example:</strong>
     * <p>172.16.0.44</p>
     */
    @NameInMap("Host")
    public String host;

    /**
     * <p>The Key required for file upload.</p>
     * 
     * <strong>example:</strong>
     * <p>saf/de/namelist/e924/ufzgsedX9bd3a7</p>
     */
    @NameInMap("Key")
    public String key;

    /**
     * <p>OSS security policy</p>
     * 
     * <strong>example:</strong>
     * <p>eyJleHBpcmF0aW9uIjoiMjAyNS0wNy0zMFQwNjowNTo0OS45NTRaIiwiY29uZGl0aW9ucyI6W1siY29udGVudC1sZW5ndGgtcmFuZ2UiLDAsMTA0ODU3NjAwMF0sWyJlcSIsIiRrZXkiLCJzYWZcL2RlXC9uYW1lbGlzdFwvZTkyNFwvdWZ6Z3NlZFg5Ymxxxxxxxxxxx</p>
     */
    @NameInMap("Policy")
    public String policy;

    /**
     * <p>Request ID</p>
     * 
     * <strong>example:</strong>
     * <p>A32FE941-35F2-5378-B37C-4B8FDB16F094</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Signature data.</p>
     * 
     * <strong>example:</strong>
     * <p>7aXmkd2Z3oksCXOS9uvKlJuOKaY=</p>
     */
    @NameInMap("Signature")
    public String signature;

    /**
     * <p>Temporary identity credential.</p>
     * 
     * <strong>example:</strong>
     * <p>tT44bMQxxxxxxxxxxxxxxx</p>
     */
    @NameInMap("StsToken")
    public String stsToken;

    public static DescribeEventUploadPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeEventUploadPolicyResponseBody self = new DescribeEventUploadPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeEventUploadPolicyResponseBody setAccessId(String accessId) {
        this.accessId = accessId;
        return this;
    }
    public String getAccessId() {
        return this.accessId;
    }

    public DescribeEventUploadPolicyResponseBody setHost(String host) {
        this.host = host;
        return this;
    }
    public String getHost() {
        return this.host;
    }

    public DescribeEventUploadPolicyResponseBody setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public DescribeEventUploadPolicyResponseBody setPolicy(String policy) {
        this.policy = policy;
        return this;
    }
    public String getPolicy() {
        return this.policy;
    }

    public DescribeEventUploadPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeEventUploadPolicyResponseBody setSignature(String signature) {
        this.signature = signature;
        return this;
    }
    public String getSignature() {
        return this.signature;
    }

    public DescribeEventUploadPolicyResponseBody setStsToken(String stsToken) {
        this.stsToken = stsToken;
        return this;
    }
    public String getStsToken() {
        return this.stsToken;
    }

}
