// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeInstanceSSLResponseBody extends TeaModel {
    /**
     * <p>The common name of the SSL certificate, which is the domain name for which you want to apply for the SSL certificate. The default value is the internal endpoint of the instance.</p>
     */
    @NameInMap("CertCommonName")
    public String certCommonName;

    /**
     * <p>Download URL for CA certificate.</p>
     */
    @NameInMap("CertDownloadURL")
    public String certDownloadURL;

    /**
     * <p>The ID of the instance.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether SSL encryption is enabled. Valid values:</p>
     * <br>
     * <p>*   **Enable**: SSL encryption is enabled.</p>
     * <p>*   **Disable**: SSL encryption is disabled.</p>
     */
    @NameInMap("SSLEnabled")
    public String SSLEnabled;

    /**
     * <p>The expiration time of the SSL certificate.</p>
     */
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
