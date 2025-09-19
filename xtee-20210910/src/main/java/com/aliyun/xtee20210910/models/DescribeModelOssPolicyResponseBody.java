// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeModelOssPolicyResponseBody extends TeaModel {
    /**
     * <p>Access ID for OSS.</p>
     * 
     * <strong>example:</strong>
     * <p>LTAxxxxxxxxxxxx</p>
     */
    @NameInMap("AccessId")
    public String accessId;

    /**
     * <p>Address.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://xxxxxxxx-xxxxxxx.aliyuncs.com">https://xxxxxxxx-xxxxxxx.aliyuncs.com</a></p>
     */
    @NameInMap("Host")
    public String host;

    /**
     * <p>OSS access key secret.</p>
     * 
     * <strong>example:</strong>
     * <p>saf/a/uid/ccc</p>
     */
    @NameInMap("Key")
    public String key;

    /**
     * <p>Error message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The policy for user form upload, which is a base64-encoded string.</p>
     * 
     * <strong>example:</strong>
     * <p>eyJleHBpxxxxxx</p>
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
     * <p>Signature information.</p>
     * 
     * <strong>example:</strong>
     * <p>tzl1wL4q8rR/xxxxxx</p>
     */
    @NameInMap("Signature")
    public String signature;

    /**
     * <p>Return result.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("resultObject")
    public Boolean resultObject;

    public static DescribeModelOssPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeModelOssPolicyResponseBody self = new DescribeModelOssPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeModelOssPolicyResponseBody setAccessId(String accessId) {
        this.accessId = accessId;
        return this;
    }
    public String getAccessId() {
        return this.accessId;
    }

    public DescribeModelOssPolicyResponseBody setHost(String host) {
        this.host = host;
        return this;
    }
    public String getHost() {
        return this.host;
    }

    public DescribeModelOssPolicyResponseBody setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public DescribeModelOssPolicyResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeModelOssPolicyResponseBody setPolicy(String policy) {
        this.policy = policy;
        return this;
    }
    public String getPolicy() {
        return this.policy;
    }

    public DescribeModelOssPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeModelOssPolicyResponseBody setSignature(String signature) {
        this.signature = signature;
        return this;
    }
    public String getSignature() {
        return this.signature;
    }

    public DescribeModelOssPolicyResponseBody setResultObject(Boolean resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public Boolean getResultObject() {
        return this.resultObject;
    }

}
