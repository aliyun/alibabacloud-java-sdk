// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class ListAutoGroupingRemediationsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2022-01-01 00:00:00</p>
     */
    @NameInMap("EarliestRemediationTime")
    public String earliestRemediationTime;

    /**
     * <strong>example:</strong>
     * <p>2022-02-01 00:00:00</p>
     */
    @NameInMap("LatestRemediationTime")
    public String latestRemediationTime;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>TGlzdFJlc291cm****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>i-23v38****</p>
     */
    @NameInMap("ResourceId")
    public String resourceId;

    /**
     * <strong>example:</strong>
     * <p>instance</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>gr-acfnugygwms32yy</p>
     */
    @NameInMap("RuleId")
    public String ruleId;

    /**
     * <strong>example:</strong>
     * <p>ecs</p>
     */
    @NameInMap("Service")
    public String service;

    /**
     * <strong>example:</strong>
     * <p>rg-aekz26emqhc****</p>
     */
    @NameInMap("TargetResourceGroupId")
    public String targetResourceGroupId;

    public static ListAutoGroupingRemediationsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAutoGroupingRemediationsRequest self = new ListAutoGroupingRemediationsRequest();
        return TeaModel.build(map, self);
    }

    public ListAutoGroupingRemediationsRequest setEarliestRemediationTime(String earliestRemediationTime) {
        this.earliestRemediationTime = earliestRemediationTime;
        return this;
    }
    public String getEarliestRemediationTime() {
        return this.earliestRemediationTime;
    }

    public ListAutoGroupingRemediationsRequest setLatestRemediationTime(String latestRemediationTime) {
        this.latestRemediationTime = latestRemediationTime;
        return this;
    }
    public String getLatestRemediationTime() {
        return this.latestRemediationTime;
    }

    public ListAutoGroupingRemediationsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListAutoGroupingRemediationsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListAutoGroupingRemediationsRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public ListAutoGroupingRemediationsRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public ListAutoGroupingRemediationsRequest setRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public String getRuleId() {
        return this.ruleId;
    }

    public ListAutoGroupingRemediationsRequest setService(String service) {
        this.service = service;
        return this;
    }
    public String getService() {
        return this.service;
    }

    public ListAutoGroupingRemediationsRequest setTargetResourceGroupId(String targetResourceGroupId) {
        this.targetResourceGroupId = targetResourceGroupId;
        return this;
    }
    public String getTargetResourceGroupId() {
        return this.targetResourceGroupId;
    }

}
