// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class DescribeCSGClientsRequest extends TeaModel {
    @NameInMap("ClientRegionId")
    public String clientRegionId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static DescribeCSGClientsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCSGClientsRequest self = new DescribeCSGClientsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCSGClientsRequest setClientRegionId(String clientRegionId) {
        this.clientRegionId = clientRegionId;
        return this;
    }
    public String getClientRegionId() {
        return this.clientRegionId;
    }

    public DescribeCSGClientsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeCSGClientsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeCSGClientsRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
