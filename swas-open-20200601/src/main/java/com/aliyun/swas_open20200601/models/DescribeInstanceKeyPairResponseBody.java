// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class DescribeInstanceKeyPairResponseBody extends TeaModel {
    @NameInMap("Fingerprint")
    public String fingerprint;

    @NameInMap("KeyPairName")
    public String keyPairName;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeInstanceKeyPairResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceKeyPairResponseBody self = new DescribeInstanceKeyPairResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceKeyPairResponseBody setFingerprint(String fingerprint) {
        this.fingerprint = fingerprint;
        return this;
    }
    public String getFingerprint() {
        return this.fingerprint;
    }

    public DescribeInstanceKeyPairResponseBody setKeyPairName(String keyPairName) {
        this.keyPairName = keyPairName;
        return this;
    }
    public String getKeyPairName() {
        return this.keyPairName;
    }

    public DescribeInstanceKeyPairResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
