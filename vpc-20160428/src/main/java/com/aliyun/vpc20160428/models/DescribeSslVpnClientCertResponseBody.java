// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeSslVpnClientCertResponseBody extends TeaModel {
    /**
     * <p>The CA certificate.</p>
     */
    @NameInMap("CaCert")
    public String caCert;

    /**
     * <p>The client certificate.</p>
     */
    @NameInMap("ClientCert")
    public String clientCert;

    /**
     * <p>The client configuration.</p>
     */
    @NameInMap("ClientConfig")
    public String clientConfig;

    /**
     * <p>The client key.</p>
     */
    @NameInMap("ClientKey")
    public String clientKey;

    /**
     * <p>The timestamp that indicates when the SSL client certificate was created. Unit: milliseconds.</p>
     * <br>
     * <p>This value is a UNIX timestamp representing the number of milliseconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.</p>
     */
    @NameInMap("CreateTime")
    public Long createTime;

    /**
     * <p>The timestamp that indicates when the SSL client certificate expires. Unit: milliseconds.</p>
     * <br>
     * <p>This value is a UNIX timestamp representing the number of milliseconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The name of the SSL client certificate.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The ID of the region where the SSL client certificate is created.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The ID of the SSL client certificate.</p>
     */
    @NameInMap("SslVpnClientCertId")
    public String sslVpnClientCertId;

    /**
     * <p>The ID of the SSL server.</p>
     */
    @NameInMap("SslVpnServerId")
    public String sslVpnServerId;

    /**
     * <p>The status of the SSL client certificate. Valid values:</p>
     * <br>
     * <p>*   **expiring-soon**</p>
     * <p>*   **normal**</p>
     * <p>*   **expired**</p>
     */
    @NameInMap("Status")
    public String status;

    public static DescribeSslVpnClientCertResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSslVpnClientCertResponseBody self = new DescribeSslVpnClientCertResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSslVpnClientCertResponseBody setCaCert(String caCert) {
        this.caCert = caCert;
        return this;
    }
    public String getCaCert() {
        return this.caCert;
    }

    public DescribeSslVpnClientCertResponseBody setClientCert(String clientCert) {
        this.clientCert = clientCert;
        return this;
    }
    public String getClientCert() {
        return this.clientCert;
    }

    public DescribeSslVpnClientCertResponseBody setClientConfig(String clientConfig) {
        this.clientConfig = clientConfig;
        return this;
    }
    public String getClientConfig() {
        return this.clientConfig;
    }

    public DescribeSslVpnClientCertResponseBody setClientKey(String clientKey) {
        this.clientKey = clientKey;
        return this;
    }
    public String getClientKey() {
        return this.clientKey;
    }

    public DescribeSslVpnClientCertResponseBody setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

    public DescribeSslVpnClientCertResponseBody setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribeSslVpnClientCertResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeSslVpnClientCertResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeSslVpnClientCertResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSslVpnClientCertResponseBody setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeSslVpnClientCertResponseBody setSslVpnClientCertId(String sslVpnClientCertId) {
        this.sslVpnClientCertId = sslVpnClientCertId;
        return this;
    }
    public String getSslVpnClientCertId() {
        return this.sslVpnClientCertId;
    }

    public DescribeSslVpnClientCertResponseBody setSslVpnServerId(String sslVpnServerId) {
        this.sslVpnServerId = sslVpnServerId;
        return this;
    }
    public String getSslVpnServerId() {
        return this.sslVpnServerId;
    }

    public DescribeSslVpnClientCertResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
