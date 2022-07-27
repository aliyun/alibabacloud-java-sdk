// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class ListApplicationGroupsRequest extends TeaModel {
    @NameInMap("ApplicationName")
    public String applicationName;

    @NameInMap("DeployRegionId")
    public String deployRegionId;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RegionId")
    public String regionId;

    public static ListApplicationGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListApplicationGroupsRequest self = new ListApplicationGroupsRequest();
        return TeaModel.build(map, self);
    }

    public ListApplicationGroupsRequest setApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }
    public String getApplicationName() {
        return this.applicationName;
    }

    public ListApplicationGroupsRequest setDeployRegionId(String deployRegionId) {
        this.deployRegionId = deployRegionId;
        return this;
    }
    public String getDeployRegionId() {
        return this.deployRegionId;
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

    public ListApplicationGroupsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
