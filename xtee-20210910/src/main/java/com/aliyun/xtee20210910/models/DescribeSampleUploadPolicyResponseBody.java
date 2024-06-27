// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeSampleUploadPolicyResponseBody extends TeaModel {
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

    public static DescribeSampleUploadPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSampleUploadPolicyResponseBody self = new DescribeSampleUploadPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSampleUploadPolicyResponseBody setAccessId(String accessId) {
        this.accessId = accessId;
        return this;
    }
    public String getAccessId() {
        return this.accessId;
    }

    public DescribeSampleUploadPolicyResponseBody setHost(String host) {
        this.host = host;
        return this;
    }
    public String getHost() {
        return this.host;
    }

    public DescribeSampleUploadPolicyResponseBody setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public DescribeSampleUploadPolicyResponseBody setPolicy(String policy) {
        this.policy = policy;
        return this;
    }
    public String getPolicy() {
        return this.policy;
    }

    public DescribeSampleUploadPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSampleUploadPolicyResponseBody setSignature(String signature) {
        this.signature = signature;
        return this;
    }
    public String getSignature() {
        return this.signature;
    }

    public DescribeSampleUploadPolicyResponseBody setStsToken(String stsToken) {
        this.stsToken = stsToken;
        return this;
    }
    public String getStsToken() {
        return this.stsToken;
    }

}
