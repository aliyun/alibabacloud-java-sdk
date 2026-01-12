// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class DescribeInstanceSSLResponseBody extends TeaModel {
    /**
     * <p>The type of the certificate. Set the value to <strong>custom</strong>, which indicates that a custom certificate is used.</p>
     * 
     * <strong>example:</strong>
     * <p>custom</p>
     */
    @NameInMap("CAType")
    public String CAType;

    /**
     * <p>The ID of the RDS Supabase instance.</p>
     * 
     * <strong>example:</strong>
     * <p>ra-supabase-8moov5lxba****</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>32DEFB4A-861F-5D1D-ADD5-918E4FD7AB8C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Specifies whether to enable SSL encryption. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: enables SSL encryption.</li>
     * <li><strong>0</strong>: disables SSL encryption.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SSLEnabled")
    public String SSLEnabled;

    /**
     * <p>The content of the custom certificate.</p>
     * 
     * <strong>example:</strong>
     * <p>-----BEGIN CERTIFICATE-----MIID*****QqEP-----END CERTIFICATE-----</p>
     */
    @NameInMap("ServerCert")
    public String serverCert;

    /**
     * <p>The private key of the certificate.</p>
     * 
     * <strong>example:</strong>
     * <p>-----BEGIN PRIVATE KEY-----MIIE****ihfg==-----END PRIVATE KEY-----</p>
     */
    @NameInMap("ServerKey")
    public String serverKey;

    public static DescribeInstanceSSLResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceSSLResponseBody self = new DescribeInstanceSSLResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceSSLResponseBody setCAType(String CAType) {
        this.CAType = CAType;
        return this;
    }
    public String getCAType() {
        return this.CAType;
    }

    public DescribeInstanceSSLResponseBody setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
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

    public DescribeInstanceSSLResponseBody setServerCert(String serverCert) {
        this.serverCert = serverCert;
        return this;
    }
    public String getServerCert() {
        return this.serverCert;
    }

    public DescribeInstanceSSLResponseBody setServerKey(String serverKey) {
        this.serverKey = serverKey;
        return this;
    }
    public String getServerKey() {
        return this.serverKey;
    }

}
