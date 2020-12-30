// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.webplus20190320.models;

import com.aliyun.tea.*;

public class DescribeAppEnvsRequest extends TeaModel {
    @NameInMap("EnvId")
    public String envId;

    @NameInMap("AppId")
    public String appId;

    @NameInMap("IncludeTerminated")
    public Boolean includeTerminated;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("EnvName")
    public String envName;

    @NameInMap("EnvSearch")
    public String envSearch;

    @NameInMap("RecentUpdated")
    public Boolean recentUpdated;

    @NameInMap("StackSearch")
    public String stackSearch;

    public static DescribeAppEnvsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAppEnvsRequest self = new DescribeAppEnvsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAppEnvsRequest setEnvId(String envId) {
        this.envId = envId;
        return this;
    }
    public String getEnvId() {
        return this.envId;
    }

    public DescribeAppEnvsRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DescribeAppEnvsRequest setIncludeTerminated(Boolean includeTerminated) {
        this.includeTerminated = includeTerminated;
        return this;
    }
    public Boolean getIncludeTerminated() {
        return this.includeTerminated;
    }

    public DescribeAppEnvsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeAppEnvsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeAppEnvsRequest setEnvName(String envName) {
        this.envName = envName;
        return this;
    }
    public String getEnvName() {
        return this.envName;
    }

    public DescribeAppEnvsRequest setEnvSearch(String envSearch) {
        this.envSearch = envSearch;
        return this;
    }
    public String getEnvSearch() {
        return this.envSearch;
    }

    public DescribeAppEnvsRequest setRecentUpdated(Boolean recentUpdated) {
        this.recentUpdated = recentUpdated;
        return this;
    }
    public Boolean getRecentUpdated() {
        return this.recentUpdated;
    }

    public DescribeAppEnvsRequest setStackSearch(String stackSearch) {
        this.stackSearch = stackSearch;
        return this;
    }
    public String getStackSearch() {
        return this.stackSearch;
    }

}
