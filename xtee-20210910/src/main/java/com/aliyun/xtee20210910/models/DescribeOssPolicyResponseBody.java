// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeOssPolicyResponseBody extends TeaModel {
    @NameInMap("AccessId")
    public String accessId;

    @NameInMap("Host")
    public String host;

    @NameInMap("Key")
    public String key;

    @NameInMap("Policy")
    public String policy;

    @NameInMap("Signature")
    public String signature;

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
