// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class ListStackResourceDriftsRequest extends TeaModel {
    /**
     * <p>The time when the resource drift detection operation was initiated.</p>
     */
    @NameInMap("MaxResults")
    public Long maxResults;

    /**
     * <p>The type of the resource.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The physical ID of the resource.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The resource properties as defined in the template, in JSON format.</p>
     */
    @NameInMap("ResourceDriftStatus")
    public java.util.List<String> resourceDriftStatus;

    /**
     * <p>The ID of the stack.</p>
     * <br>
     * <p>This parameter is required.</p>
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
