// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class DescribeInstanceKeyPairResponseBody extends TeaModel {
    /**
     * <p>The fingerprint of the key pair.</p>
     * 
     * <strong>example:</strong>
     * <p>4f:70:62:e9:0c:72:f7:ee:74:ce:e3:bf:e0:82:<strong>:</strong></p>
     */
    @NameInMap("Fingerprint")
    public String fingerprint;

    /**
     * <p>The name of the key pair.</p>
     * 
     * <strong>example:</strong>
     * <p>KeyPairName</p>
     */
    @NameInMap("KeyPairName")
    public String keyPairName;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>20758A-585D-4A41-A9B2-28DA8F4F****</p>
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
