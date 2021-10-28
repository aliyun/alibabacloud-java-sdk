// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class DescribeGatewaysForCmsRequest extends TeaModel {
    @NameInMap("GatewayRegionId")
    public String gatewayRegionId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static DescribeGatewaysForCmsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeGatewaysForCmsRequest self = new DescribeGatewaysForCmsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeGatewaysForCmsRequest setGatewayRegionId(String gatewayRegionId) {
        this.gatewayRegionId = gatewayRegionId;
        return this;
    }
    public String getGatewayRegionId() {
        return this.gatewayRegionId;
    }

    public DescribeGatewaysForCmsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeGatewaysForCmsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeGatewaysForCmsRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
