// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeApplicationInstancesRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Reverse")
    public Boolean reverse;

    public static DescribeApplicationInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeApplicationInstancesRequest self = new DescribeApplicationInstancesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeApplicationInstancesRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DescribeApplicationInstancesRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeApplicationInstancesRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public DescribeApplicationInstancesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeApplicationInstancesRequest setReverse(Boolean reverse) {
        this.reverse = reverse;
        return this;
    }
    public Boolean getReverse() {
        return this.reverse;
    }

}
