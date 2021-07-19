// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class ListApplicationGroupsRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ApplicationName")
    public String applicationName;

    @NameInMap("DeployRegionId")
    public Boolean deployRegionId;

    @NameInMap("Environment")
    public Boolean environment;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    public static ListApplicationGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListApplicationGroupsRequest self = new ListApplicationGroupsRequest();
        return TeaModel.build(map, self);
    }

    public ListApplicationGroupsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListApplicationGroupsRequest setApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }
    public String getApplicationName() {
        return this.applicationName;
    }

    public ListApplicationGroupsRequest setDeployRegionId(Boolean deployRegionId) {
        this.deployRegionId = deployRegionId;
        return this;
    }
    public Boolean getDeployRegionId() {
        return this.deployRegionId;
    }

    public ListApplicationGroupsRequest setEnvironment(Boolean environment) {
        this.environment = environment;
        return this;
    }
    public Boolean getEnvironment() {
        return this.environment;
    }

    public ListApplicationGroupsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListApplicationGroupsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

}
