// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.webplus20190320.models;

import com.aliyun.tea.*;

public class DescribeApplicationsRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("AppName")
    public String appName;

    @NameInMap("AppSearch")
    public String appSearch;

    @NameInMap("EnvSearch")
    public String envSearch;

    @NameInMap("StackSearch")
    public String stackSearch;

    @NameInMap("CategorySearch")
    public String categorySearch;

    public static DescribeApplicationsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeApplicationsRequest self = new DescribeApplicationsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeApplicationsRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DescribeApplicationsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeApplicationsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeApplicationsRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public DescribeApplicationsRequest setAppSearch(String appSearch) {
        this.appSearch = appSearch;
        return this;
    }
    public String getAppSearch() {
        return this.appSearch;
    }

    public DescribeApplicationsRequest setEnvSearch(String envSearch) {
        this.envSearch = envSearch;
        return this;
    }
    public String getEnvSearch() {
        return this.envSearch;
    }

    public DescribeApplicationsRequest setStackSearch(String stackSearch) {
        this.stackSearch = stackSearch;
        return this;
    }
    public String getStackSearch() {
        return this.stackSearch;
    }

    public DescribeApplicationsRequest setCategorySearch(String categorySearch) {
        this.categorySearch = categorySearch;
        return this;
    }
    public String getCategorySearch() {
        return this.categorySearch;
    }

}
