// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class DescribeGatewayFileSharesRequest extends TeaModel {
    @NameInMap("GatewayId")
    public String gatewayId;

    @NameInMap("IndexId")
    public String indexId;

    @NameInMap("Refresh")
    public Boolean refresh;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static DescribeGatewayFileSharesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeGatewayFileSharesRequest self = new DescribeGatewayFileSharesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeGatewayFileSharesRequest setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public String getGatewayId() {
        return this.gatewayId;
    }

    public DescribeGatewayFileSharesRequest setIndexId(String indexId) {
        this.indexId = indexId;
        return this;
    }
    public String getIndexId() {
        return this.indexId;
    }

    public DescribeGatewayFileSharesRequest setRefresh(Boolean refresh) {
        this.refresh = refresh;
        return this;
    }
    public Boolean getRefresh() {
        return this.refresh;
    }

    public DescribeGatewayFileSharesRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
