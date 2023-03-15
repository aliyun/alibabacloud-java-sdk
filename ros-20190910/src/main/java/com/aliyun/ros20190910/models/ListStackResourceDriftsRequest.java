// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class ListStackResourceDriftsRequest extends TeaModel {
    /**
     * <p>The maximum number of results to be returned with a single call when the NextToken parameter is used for the query.</p>
     * <br>
     * <p>Valid values: 1 to 100.</p>
     * <br>
     * <p>Default value: 50.</p>
     */
    @NameInMap("MaxResults")
    public Long maxResults;

    /**
     * <p>The query token. Set this parameter to the NextToken value returned in the last API call.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The region ID of the stack. You can call the [DescribeRegions](~~131035~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceDriftStatus")
    public java.util.List<String> resourceDriftStatus;

    /**
     * <p>The ID of the stack.</p>
     */
    @NameInMap("StackId")
    public String stackId;

    public static ListStackResourceDriftsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListStackResourceDriftsRequest self = new ListStackResourceDriftsRequest();
        return TeaModel.build(map, self);
    }

    public ListStackResourceDriftsRequest setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public ListStackResourceDriftsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListStackResourceDriftsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListStackResourceDriftsRequest setResourceDriftStatus(java.util.List<String> resourceDriftStatus) {
        this.resourceDriftStatus = resourceDriftStatus;
        return this;
    }
    public java.util.List<String> getResourceDriftStatus() {
        return this.resourceDriftStatus;
    }

    public ListStackResourceDriftsRequest setStackId(String stackId) {
        this.stackId = stackId;
        return this;
    }
    public String getStackId() {
        return this.stackId;
    }

}
