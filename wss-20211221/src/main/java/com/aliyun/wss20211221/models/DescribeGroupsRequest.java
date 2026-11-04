// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wss20211221.models;

import com.aliyun.tea.*;

public class DescribeGroupsRequest extends TeaModel {
    /**
     * <p>The end time of the period.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-03-28T02:06:00Z</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The list of group resource types.</p>
     */
    @NameInMap("GroupResourceTypes")
    public java.util.List<String> groupResourceTypes;

    /**
     * <p>The group type.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>DEFAULT</p>
     */
    @NameInMap("GroupType")
    public String groupType;

    /**
     * <p>The Lingxiao instance ID.</p>
     */
    @NameInMap("InstanceIds")
    public java.util.List<String> instanceIds;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public String maxResults;

    /**
     * <p>The pagination token. Leave this parameter empty for the first request. For subsequent requests, use the <code>nextToken</code> value returned in the previous response.</p>
     * 
     * <strong>example:</strong>
     * <p>eyJvZmZzZXQiOjIwfQ==</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The list of resource IDs.</p>
     */
    @NameInMap("ResourceIds")
    public java.util.List<String> resourceIds;

    /**
     * <p>The start time of the period.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-03-25 10:26:44</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    /**
     * <p>The list of states.</p>
     */
    @NameInMap("States")
    public java.util.List<String> states;

    /**
     * <p>The effective period used for the query.</p>
     * 
     * <strong>example:</strong>
     * <p>true/false</p>
     */
    @NameInMap("TimeUsingPeriod")
    public Boolean timeUsingPeriod;

    public static DescribeGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeGroupsRequest self = new DescribeGroupsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeGroupsRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribeGroupsRequest setGroupResourceTypes(java.util.List<String> groupResourceTypes) {
        this.groupResourceTypes = groupResourceTypes;
        return this;
    }
    public java.util.List<String> getGroupResourceTypes() {
        return this.groupResourceTypes;
    }

    public DescribeGroupsRequest setGroupType(String groupType) {
        this.groupType = groupType;
        return this;
    }
    public String getGroupType() {
        return this.groupType;
    }

    public DescribeGroupsRequest setInstanceIds(java.util.List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

    public DescribeGroupsRequest setMaxResults(String maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public String getMaxResults() {
        return this.maxResults;
    }

    public DescribeGroupsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeGroupsRequest setResourceIds(java.util.List<String> resourceIds) {
        this.resourceIds = resourceIds;
        return this;
    }
    public java.util.List<String> getResourceIds() {
        return this.resourceIds;
    }

    public DescribeGroupsRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public DescribeGroupsRequest setStates(java.util.List<String> states) {
        this.states = states;
        return this;
    }
    public java.util.List<String> getStates() {
        return this.states;
    }

    public DescribeGroupsRequest setTimeUsingPeriod(Boolean timeUsingPeriod) {
        this.timeUsingPeriod = timeUsingPeriod;
        return this;
    }
    public Boolean getTimeUsingPeriod() {
        return this.timeUsingPeriod;
    }

}
