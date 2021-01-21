// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class ListStackResourceDriftsRequest extends TeaModel {
    @NameInMap("StackId")
    @Validation(required = true)
    public String stackId;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("MaxResults")
    public Long maxResults;

    @NameInMap("ResourceDriftStatus")
    public java.util.List<String> resourceDriftStatus;

    @NameInMap("NextToken")
    public String nextToken;

    public static ListStackResourceDriftsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListStackResourceDriftsRequest self = new ListStackResourceDriftsRequest();
        return TeaModel.build(map, self);
    }

    public ListStackResourceDriftsRequest setStackId(String stackId) {
        this.stackId = stackId;
        return this;
    }
    public String getStackId() {
        return this.stackId;
    }

    public ListStackResourceDriftsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListStackResourceDriftsRequest setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public ListStackResourceDriftsRequest setResourceDriftStatus(java.util.List<String> resourceDriftStatus) {
        this.resourceDriftStatus = resourceDriftStatus;
        return this;
    }
    public java.util.List<String> getResourceDriftStatus() {
        return this.resourceDriftStatus;
    }

    public ListStackResourceDriftsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

}
