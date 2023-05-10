// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class ListStackResourceDriftsRequest extends TeaModel {
    /**
     * <p>The type of the resource.</p>
     */
    @NameInMap("MaxResults")
    public Long maxResults;

    /**
     * <p>The resource properties as defined in the template, in JSON format.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The time when the resource drift detection operation was initiated.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The drift status of the resource. Valid values:</p>
     * <br>
     * <p>*   DELETED: The actual configuration of the resource differs from its expected template configuration because the resource had been deleted.</p>
     * <p>*   MODIFIED: The actual configuration of the resource differs from its expected template configuration.</p>
     * <p>*   NOT_CHECKED: ROS has not checked whether the actual configuration of the resource differs from its expected template configuration.</p>
     * <p>*   IN_SYNC: The actual configuration of the resource matches its expected template configuration.</p>
     */
    @NameInMap("ResourceDriftStatus")
    public java.util.List<String> resourceDriftStatus;

    /**
     * <p>The physical ID of the resource.</p>
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
