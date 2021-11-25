// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class ListSecurityGroupsRequest extends TeaModel {
    // 取第几页的数据
    @NameInMap("PageNumber")
    public Integer pageNumber;

    // 分页大小
    @NameInMap("PageSize")
    public Integer pageSize;

    // 所属Vpc
    @NameInMap("VpcId")
    public String vpcId;

    public static ListSecurityGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSecurityGroupsRequest self = new ListSecurityGroupsRequest();
        return TeaModel.build(map, self);
    }

    public ListSecurityGroupsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListSecurityGroupsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListSecurityGroupsRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

}
