// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeSslVpnClientCertResponseBody extends TeaModel {
    @NameInMap("CaCert")
    public String caCert;

    @NameInMap("ClientCert")
    public String clientCert;

    @NameInMap("ClientConfig")
    public String clientConfig;

    @NameInMap("ClientKey")
    public String clientKey;

    @NameInMap("CreateTime")
    public Long createTime;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("Name")
    public String name;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SslVpnClientCertId")
    public String sslVpnClientCertId;

    @NameInMap("SslVpnServerId")
    public String sslVpnServerId;

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
