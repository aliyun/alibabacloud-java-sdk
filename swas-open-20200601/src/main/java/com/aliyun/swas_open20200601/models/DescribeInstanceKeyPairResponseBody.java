// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class DescribeInstanceKeyPairResponseBody extends TeaModel {
    /**
     * <p>The fingerprint of the key pair.</p>
     */
    @NameInMap("Fingerprint")
    public String fingerprint;

    /**
     * <p>The name of the key pair.</p>
     */
    @NameInMap("KeyPairName")
    public String keyPairName;

    /**
     * <p>The request ID.</p>
     */
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
