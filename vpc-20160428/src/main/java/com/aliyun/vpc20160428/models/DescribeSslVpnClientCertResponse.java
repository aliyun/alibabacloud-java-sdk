// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeSslVpnClientCertResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("SslVpnClientCertId")
    @Validation(required = true)
    public String sslVpnClientCertId;

    @NameInMap("Name")
    @Validation(required = true)
    public String name;

    @NameInMap("SslVpnServerId")
    @Validation(required = true)
    public String sslVpnServerId;

    @NameInMap("CaCert")
    @Validation(required = true)
    public String caCert;

    @NameInMap("ClientCert")
    @Validation(required = true)
    public String clientCert;

    @NameInMap("ClientKey")
    @Validation(required = true)
    public String clientKey;

    @NameInMap("ClientConfig")
    @Validation(required = true)
    public String clientConfig;

    @NameInMap("CreateTime")
    @Validation(required = true)
    public Long createTime;

    @NameInMap("EndTime")
    @Validation(required = true)
    public Long endTime;

    @NameInMap("Status")
    @Validation(required = true)
    public String status;

    public static DescribeSslVpnClientCertResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSslVpnClientCertResponse self = new DescribeSslVpnClientCertResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSslVpnClientCertResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSslVpnClientCertResponse setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeSslVpnClientCertResponse setSslVpnClientCertId(String sslVpnClientCertId) {
        this.sslVpnClientCertId = sslVpnClientCertId;
        return this;
    }
    public String getSslVpnClientCertId() {
        return this.sslVpnClientCertId;
    }

    public DescribeSslVpnClientCertResponse setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeSslVpnClientCertResponse setSslVpnServerId(String sslVpnServerId) {
        this.sslVpnServerId = sslVpnServerId;
        return this;
    }
    public String getSslVpnServerId() {
        return this.sslVpnServerId;
    }

    public DescribeSslVpnClientCertResponse setCaCert(String caCert) {
        this.caCert = caCert;
        return this;
    }
    public String getCaCert() {
        return this.caCert;
    }

    public DescribeSslVpnClientCertResponse setClientCert(String clientCert) {
        this.clientCert = clientCert;
        return this;
    }
    public String getClientCert() {
        return this.clientCert;
    }

    public DescribeSslVpnClientCertResponse setClientKey(String clientKey) {
        this.clientKey = clientKey;
        return this;
    }
    public String getClientKey() {
        return this.clientKey;
    }

    public DescribeSslVpnClientCertResponse setClientConfig(String clientConfig) {
        this.clientConfig = clientConfig;
        return this;
    }
    public String getClientConfig() {
        return this.clientConfig;
    }

    public DescribeSslVpnClientCertResponse setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

    public DescribeSslVpnClientCertResponse setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribeSslVpnClientCertResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
