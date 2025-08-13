// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeOssTokenResponseBody extends TeaModel {
    /**
     * <p>AccessKeyId for OSS file upload.</p>
     * 
     * <strong>example:</strong>
     * <p>LTAI5tJWSnmmTpJGN6sJCNG3</p>
     */
    @NameInMap("AccessId")
    public String accessId;

    /**
     * <p>Host address.</p>
     * 
     * <strong>example:</strong>
     * <p>kf.sunwoosoft.com</p>
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
     * <p>Permission policy for ossbucket.</p>
     * 
     * <strong>example:</strong>
     * <p>eyJleHBpcmF0aW9uIjoiMjAyNS0wNy0zMFQwNjowNTo0OS45NTRaIiwiY29uZGl0aW9ucyI6W1siY29udGVudC1sZW5ndGgtcmFuZ2UiLDAsMTA0ODU3NjAwMF0sWyJlcSIsIiRrZXkiLCJzYWZcL2RlXC9uYW1lbGlzdFwvZTkyNFwvdWZ6Z3NlZFg5Ymxxxxxxxxxxx</p>
     */
    @NameInMap("Policy")
    public String policy;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A32FE941-35F2-5378-B37C-4B8FDB16F094</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>OSS signature.</p>
     * 
     * <strong>example:</strong>
     * <p>n29by5MWBmAjcweVoPEY/OHktog=</p>
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

    public static DescribeOssTokenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeOssTokenResponseBody self = new DescribeOssTokenResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeOssTokenResponseBody setAccessId(String accessId) {
        this.accessId = accessId;
        return this;
    }
    public String getAccessId() {
        return this.accessId;
    }

    public DescribeOssTokenResponseBody setHost(String host) {
        this.host = host;
        return this;
    }
    public String getHost() {
        return this.host;
    }

    public DescribeOssTokenResponseBody setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public DescribeOssTokenResponseBody setPolicy(String policy) {
        this.policy = policy;
        return this;
    }
    public String getPolicy() {
        return this.policy;
    }

    public DescribeOssTokenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeOssTokenResponseBody setSignature(String signature) {
        this.signature = signature;
        return this;
    }
    public String getSignature() {
        return this.signature;
    }

    public DescribeOssTokenResponseBody setStsToken(String stsToken) {
        this.stsToken = stsToken;
        return this;
    }
    public String getStsToken() {
        return this.stsToken;
    }

}
