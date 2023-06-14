// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeInstanceSSLResponseBody extends TeaModel {
    @NameInMap("CertCommonName")
    public String certCommonName;

    @NameInMap("CertDownloadURL")
    public String certDownloadURL;

    /**
     * <p>The operation that you want to perform. Set the value to **DescribeInstanceSSL**.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The expiration time of the SSL certificate.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the instance.</p>
     */
    @NameInMap("SSLEnabled")
    public String SSLEnabled;

    @NameInMap("SSLExpiredTime")
    public String SSLExpiredTime;

    public static DescribeInstanceSSLResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceSSLResponseBody self = new DescribeInstanceSSLResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceSSLResponseBody setCertCommonName(String certCommonName) {
        this.certCommonName = certCommonName;
        return this;
    }
    public String getCertCommonName() {
        return this.certCommonName;
    }

    public DescribeInstanceSSLResponseBody setCertDownloadURL(String certDownloadURL) {
        this.certDownloadURL = certDownloadURL;
        return this;
    }
    public String getCertDownloadURL() {
        return this.certDownloadURL;
    }

    public DescribeInstanceSSLResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
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

    public DescribeInstanceSSLResponseBody setSSLExpiredTime(String SSLExpiredTime) {
        this.SSLExpiredTime = SSLExpiredTime;
        return this;
    }
    public String getSSLExpiredTime() {
        return this.SSLExpiredTime;
    }

}
