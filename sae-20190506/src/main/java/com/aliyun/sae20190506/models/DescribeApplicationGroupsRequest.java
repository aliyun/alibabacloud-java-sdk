// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeApplicationGroupsRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static DescribeApplicationGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeApplicationGroupsRequest self = new DescribeApplicationGroupsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeApplicationGroupsRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DescribeApplicationGroupsRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeApplicationGroupsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
