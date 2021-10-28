// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class DescribeGatewayBlockVolumesRequest extends TeaModel {
    @NameInMap("GatewayId")
    public String gatewayId;

    @NameInMap("IndexId")
    public String indexId;

    @NameInMap("Refresh")
    public Boolean refresh;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static DescribeGatewayBlockVolumesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeGatewayBlockVolumesRequest self = new DescribeGatewayBlockVolumesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeGatewayBlockVolumesRequest setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public String getGatewayId() {
        return this.gatewayId;
    }

    public DescribeGatewayBlockVolumesRequest setIndexId(String indexId) {
        this.indexId = indexId;
        return this;
    }
    public String getIndexId() {
        return this.indexId;
    }

    public DescribeGatewayBlockVolumesRequest setRefresh(Boolean refresh) {
        this.refresh = refresh;
        return this;
    }
    public Boolean getRefresh() {
        return this.refresh;
    }

    public DescribeGatewayBlockVolumesRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
