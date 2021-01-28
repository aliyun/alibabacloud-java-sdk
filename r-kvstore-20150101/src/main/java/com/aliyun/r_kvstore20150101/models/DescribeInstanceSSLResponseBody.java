// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeInstanceSSLResponseBody extends TeaModel {
    @NameInMap("SSLExpiredTime")
    public String SSLExpiredTime;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SSLEnabled")
    public String SSLEnabled;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("CertCommonName")
    public String certCommonName;

    public static DescribeInstanceSSLResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceSSLResponseBody self = new DescribeInstanceSSLResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceSSLResponseBody setSSLExpiredTime(String SSLExpiredTime) {
        this.SSLExpiredTime = SSLExpiredTime;
        return this;
    }
    public String getSSLExpiredTime() {
        return this.SSLExpiredTime;
    }

    public DescribeInstanceSSLResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInstanceSSLResponseBody setSSLEnabled(String SSLEnabled) {
        this.SSLEnabled = SSLEnabled;
        return this;
    }
    public String getSSLEnabled() {
        return this.SSLEnabled;
    }

    public DescribeInstanceSSLResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeInstanceSSLResponseBody setCertCommonName(String certCommonName) {
        this.certCommonName = certCommonName;
        return this;
    }
    public String getCertCommonName() {
        return this.certCommonName;
    }

}
