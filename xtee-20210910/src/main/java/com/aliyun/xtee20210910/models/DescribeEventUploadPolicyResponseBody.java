// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeEventUploadPolicyResponseBody extends TeaModel {
    @NameInMap("AccessId")
    public String accessId;

    @NameInMap("Host")
    public String host;

    @NameInMap("Key")
    public String key;

    @NameInMap("Policy")
    public String policy;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Signature")
    public String signature;

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
