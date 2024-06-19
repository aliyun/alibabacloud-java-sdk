// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeInstanceSSLResponseBody extends TeaModel {
    /**
     * <p>The common name of the CA certificate. The default value is the internal endpoint of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>r-bp1zxszhcgatnx****.redis.rds.aliyuncs.com</p>
     */
    @NameInMap("CertCommonName")
    public String certCommonName;

    /**
     * <p>The download URL of the CA certificate.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://apsaradb-public.oss-ap-sout****-1.aliy****.com/ApsaraDB-CA-Chain.zip">https://apsaradb-public.oss-ap-sout****-1.aliy****.com/ApsaraDB-CA-Chain.zip</a></p>
     */
    @NameInMap("CertDownloadURL")
    public String certDownloadURL;

    /**
     * <p>The ID of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>r-bp1zxszhcgatnx****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>02260F96-913E-4655-9BA5-A3651CAF****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The status of the TLS (SSL) encryption feature. Valid values:</p>
     * <ul>
     * <li><strong>Enable</strong>: SSL encryption is enabled.</li>
     * <li><strong>Disable</strong>: SSL encryption is disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Enable</p>
     */
    @NameInMap("SSLEnabled")
    public String SSLEnabled;

    /**
     * <p>The time when the CA certificate expires.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-08-05T09:05:53Z</p>
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
