// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeSampleBatchOssPolicyResponseBody extends TeaModel {
    /**
     * <p>OSS Access ID</p>
     * 
     * <strong>example:</strong>
     * <p>LTAI5tE7sActovY6Hvpu5oTh</p>
     */
    @NameInMap("AccessId")
    public String accessId;

    /**
     * <p>OSS Domain</p>
     * 
     * <strong>example:</strong>
     * <p>172.25.126.234</p>
     */
    @NameInMap("Host")
    public String host;

    /**
     * <p>Key required for file upload.</p>
     * 
     * <strong>example:</strong>
     * <p>saf/de/namelist/e924/ufzgsedX9bd3a7</p>
     */
    @NameInMap("Key")
    public String key;

    /**
     * <p>OSS Security Policy</p>
     * 
     * <strong>example:</strong>
     * <p>eyJleHBpcmF0aW9uIjoiMjAyNS0wNy0zMFQwNjowNTo0OS45NTRaIiwiY29uZGl0aW9ucyI6W1siY29udGVudC1sZW5ndGgtcmFuZ2UiLDAsMTA0ODU3NjAwMF0sWyJlcSIsIiRrZXkiLCJzYWZcL2RlXC9uYW1lbGlzdFwvZTkyNFwvdWZ6Z3NlZFg5Ymxxxxxxxxxxx</p>
     */
    @NameInMap("Policy")
    public String policy;

    /**
     * <p>ID of the request</p>
     * 
     * <strong>example:</strong>
     * <p>A32FE941-35F2-5378-B37C-4B8FDB16F094</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>OSS Signature</p>
     * 
     * <strong>example:</strong>
     * <p>PoAUQ//RusJJFIvCrn36O3+mM/U=</p>
     */
    @NameInMap("Signature")
    public String signature;

    public static DescribeSampleBatchOssPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSampleBatchOssPolicyResponseBody self = new DescribeSampleBatchOssPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSampleBatchOssPolicyResponseBody setAccessId(String accessId) {
        this.accessId = accessId;
        return this;
    }
    public String getAccessId() {
        return this.accessId;
    }

    public DescribeSampleBatchOssPolicyResponseBody setHost(String host) {
        this.host = host;
        return this;
    }
    public String getHost() {
        return this.host;
    }

    public DescribeSampleBatchOssPolicyResponseBody setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public DescribeSampleBatchOssPolicyResponseBody setPolicy(String policy) {
        this.policy = policy;
        return this;
    }
    public String getPolicy() {
        return this.policy;
    }

    public DescribeSampleBatchOssPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSampleBatchOssPolicyResponseBody setSignature(String signature) {
        this.signature = signature;
        return this;
    }
    public String getSignature() {
        return this.signature;
    }

}
