// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class DescribeCSGClientTasksRequest extends TeaModel {
    @NameInMap("ClientId")
    public String clientId;

    @NameInMap("ClientRegionId")
    public String clientRegionId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static DescribeCSGClientTasksRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCSGClientTasksRequest self = new DescribeCSGClientTasksRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCSGClientTasksRequest setClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    public String getClientId() {
        return this.clientId;
    }

    public DescribeCSGClientTasksRequest setClientRegionId(String clientRegionId) {
        this.clientRegionId = clientRegionId;
        return this;
    }
    public String getClientRegionId() {
        return this.clientRegionId;
    }

    public DescribeCSGClientTasksRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeCSGClientTasksRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeCSGClientTasksRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
