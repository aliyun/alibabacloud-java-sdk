// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeApplicationSessionLogsRequest extends TeaModel {
    /**
     * <p>The agent name. This parameter must be specified together with the SessionId parameter, or neither of them is specified.</p>
     * 
     * <strong>example:</strong>
     * <p>test-agent</p>
     */
    @NameInMap("Agent")
    public String agent;

    /**
     * <p>The application ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pa-**************</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    /**
     * <p>The end time of the query. Specify the time in the ISO 8601 standard in the YYYY-MM-DDTHH:mmZ format. The time must be in UTC. The end time cannot be earlier than the start time, and the query time span cannot exceed 30 days.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-11-04T02:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The page number. Pages start from page 1. Maximum value: 2147483647. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. Valid values: 30 to 100. Default value: 30.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The region ID of the application.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    /**
     * <p>The role filter for logs. Valid values: user, assistant, and toolResult.</p>
     * 
     * <strong>example:</strong>
     * <p>assistant</p>
     */
    @NameInMap("Role")
    public String role;

    /**
     * <p>The session ID. This parameter must be specified together with the Agent parameter, or neither of them is specified.</p>
     * 
     * <strong>example:</strong>
     * <p>session-123</p>
     */
    @NameInMap("SessionId")
    public String sessionId;

    /**
     * <p>The start time of the query. Specify the time in the ISO 8601 standard in the YYYY-MM-DDTHH:mmZ format. The time must be in UTC. The start time cannot be later than the current time, and the interval between the start time and the current time cannot exceed 31 days.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-11-04T01:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The log type. This API operation only queries session logs. Set the value to session.</p>
     * 
     * <strong>example:</strong>
     * <p>session</p>
     */
    @NameInMap("Type")
    public String type;

    public static DescribeApplicationSessionLogsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeApplicationSessionLogsRequest self = new DescribeApplicationSessionLogsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeApplicationSessionLogsRequest setAgent(String agent) {
        this.agent = agent;
        return this;
    }
    public String getAgent() {
        return this.agent;
    }

    public DescribeApplicationSessionLogsRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public DescribeApplicationSessionLogsRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeApplicationSessionLogsRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeApplicationSessionLogsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeApplicationSessionLogsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeApplicationSessionLogsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeApplicationSessionLogsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeApplicationSessionLogsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeApplicationSessionLogsRequest setRole(String role) {
        this.role = role;
        return this;
    }
    public String getRole() {
        return this.role;
    }

    public DescribeApplicationSessionLogsRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public DescribeApplicationSessionLogsRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeApplicationSessionLogsRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
