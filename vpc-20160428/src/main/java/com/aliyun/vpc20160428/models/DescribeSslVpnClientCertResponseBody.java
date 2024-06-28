// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeSslVpnClientCertResponseBody extends TeaModel {
    /**
     * <p>The CA certificate.</p>
     * 
     * <strong>example:</strong>
     * <p>CA certificate</p>
     */
    @NameInMap("CaCert")
    public String caCert;

    /**
     * <p>The client certificate.</p>
     * 
     * <strong>example:</strong>
     * <p>Client certificate</p>
     */
    @NameInMap("ClientCert")
    public String clientCert;

    /**
     * <p>The client configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>Client configuration</p>
     */
    @NameInMap("ClientConfig")
    public String clientConfig;

    /**
     * <p>The client key.</p>
     * 
     * <strong>example:</strong>
     * <p>The key of the client</p>
     */
    @NameInMap("ClientKey")
    public String clientKey;

    /**
     * <p>The timestamp that indicates when the SSL client certificate was created. Unit: milliseconds.</p>
     * <p>This value is a UNIX timestamp representing the number of milliseconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>1552550980000</p>
     */
    @NameInMap("CreateTime")
    public Long createTime;

    /**
     * <p>The timestamp that indicates when the SSL client certificate expires. Unit: milliseconds.</p>
     * <p>This value is a UNIX timestamp representing the number of milliseconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>1647158980000</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The name of the SSL client certificate.</p>
     * 
     * <strong>example:</strong>
     * <p>nametest</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The ID of the region where the SSL client certificate is created.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>5BE01CD7-5A50-472D-AC14-CA181C5C03BE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the resource group to which the SSL client certificate belongs.</p>
     * <p>The SSL client certificate and the SSL server associated with the SSL client certificate belong to the same resource group. You can call the <a href="https://help.aliyun.com/document_detail/158855.html">ListResourceGroups</a> operation to query resource groups.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmzs372yg****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The ID of the SSL client certificate.</p>
     * 
     * <strong>example:</strong>
     * <p>vsc-bp13k5mp4tg8v3z9b****</p>
     */
    @NameInMap("SslVpnClientCertId")
    public String sslVpnClientCertId;

    /**
     * <p>The ID of the SSL server.</p>
     * 
     * <strong>example:</strong>
     * <p>vss-bp155e9yclsg1xgq4****</p>
     */
    @NameInMap("SslVpnServerId")
    public String sslVpnServerId;

    /**
     * <p>The status of the SSL client certificate. Valid values:</p>
     * <ul>
     * <li><strong>expiring-soon</strong></li>
     * <li><strong>normal</strong></li>
     * <li><strong>expired</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>normal</p>
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
