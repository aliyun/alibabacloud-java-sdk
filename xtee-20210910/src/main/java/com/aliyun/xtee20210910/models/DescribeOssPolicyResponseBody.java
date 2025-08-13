// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeOssPolicyResponseBody extends TeaModel {
    /**
     * <p>accessId, a parameter used in OSS SDK uploads, corresponding to OSSAccessKeyId</p>
     * 
     * <strong>example:</strong>
     * <p>LTAIpeYTKEbC0v10</p>
     */
    @NameInMap("AccessId")
    public String accessId;

    /**
     * <p>OSS host ID.</p>
     * 
     * <strong>example:</strong>
     * <p>testvm.biubiubiuu.com</p>
     */
    @NameInMap("Host")
    public String host;

    /**
     * <p>Key required for file upload.</p>
     * 
     * <strong>example:</strong>
     * <p>saf/a/uid/ccc</p>
     */
    @NameInMap("Key")
    public String key;

    /**
     * <p>OSS security policy</p>
     * 
     * <strong>example:</strong>
     * <p>eyJleHBpxxxxxx</p>
     */
    @NameInMap("Policy")
    public String policy;

    /**
     * <p>Signature data.</p>
     * 
     * <strong>example:</strong>
     * <p>tzl1wL4q8rR/xxxxxx</p>
     */
    @NameInMap("Signature")
    public String signature;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>AE7E6105-7DEB-5125-9B24-DCBC139F6CD2</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static DescribeOssPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeOssPolicyResponseBody self = new DescribeOssPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeOssPolicyResponseBody setAccessId(String accessId) {
        this.accessId = accessId;
        return this;
    }
    public String getAccessId() {
        return this.accessId;
    }

    public DescribeOssPolicyResponseBody setHost(String host) {
        this.host = host;
        return this;
    }
    public String getHost() {
        return this.host;
    }

    public DescribeOssPolicyResponseBody setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public DescribeOssPolicyResponseBody setPolicy(String policy) {
        this.policy = policy;
        return this;
    }
    public String getPolicy() {
        return this.policy;
    }

    public DescribeOssPolicyResponseBody setSignature(String signature) {
        this.signature = signature;
        return this;
    }
    public String getSignature() {
        return this.signature;
    }

    public DescribeOssPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
