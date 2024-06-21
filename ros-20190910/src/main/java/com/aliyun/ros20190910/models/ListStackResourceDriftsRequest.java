// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class ListStackResourceDriftsRequest extends TeaModel {
    /**
     * <p>The time when the resource drift detection operation was initiated.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("MaxResults")
    public Long maxResults;

    /**
     * <p>The type of the resource.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAdDWBF2****w==</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The physical ID of the resource.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The resource properties as defined in the template, in JSON format.</p>
     * 
     * <strong>example:</strong>
     * <p>MODIFIED</p>
     */
    @NameInMap("ResourceDriftStatus")
    public java.util.List<String> resourceDriftStatus;

    /**
     * <p>The ID of the stack.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>4a6c9851-3b0f-4f5f-b4ca-a14bf691****</p>
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
