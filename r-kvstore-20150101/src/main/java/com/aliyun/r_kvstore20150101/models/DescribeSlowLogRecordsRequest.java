// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeSlowLogRecordsRequest extends TeaModel {
    /**
     * <p>The database name.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("DBName")
    public String DBName;

    /**
     * <p>The end time of the query. The end time must be later than the start time, and the time range cannot exceed one day. Set the time range to one hour. Specify the time in the <i>yyyy-MM-dd</i>T<i>HH:mm</i>Z format. The time must be in UTC.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-03-10T15:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>r-bp1zxszhcgatnx****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The node ID in the instance. Specify this parameter to query the slow logs of a specific node.</p>
     * <blockquote>
     * <p>This parameter is available only when the instance uses the read/write splitting or cluster architecture.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>r-bp1zxszhcgatnx****-db-0</p>
     */
    @NameInMap("NodeId")
    public String nodeId;

    /**
     * <p>The sort criterion of the returned results. Valid values:</p>
     * <ul>
     * <li><strong>execution_time</strong>: execution start time of the request (default)</li>
     * <li><strong>latency</strong>: execution duration of the request</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>execution_time</p>
     */
    @NameInMap("OrderBy")
    public String orderBy;

    /**
     * <p>The sort order of the returned results. Valid values:</p>
     * <ul>
     * <li><strong>ASC</strong>: ascending order</li>
     * <li><strong>DESC</strong>: descending order (default)</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ASC</p>
     */
    @NameInMap("OrderType")
    public String orderType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The page number. The value must be greater than <strong>0</strong> and cannot exceed the maximum value of the Integer data type. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The maximum number of entries to return on each page. Valid values: <strong>30</strong>, <strong>50</strong>, and <strong>100</strong>. Default value: <strong>30</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The keyword used to search the returned results. Specify a string value.</p>
     * 
     * <strong>example:</strong>
     * <p>keyword1</p>
     */
    @NameInMap("QueryKeyword")
    public String queryKeyword;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>The slow log type. Valid values:</p>
     * <ul>
     * <li><strong>proxy</strong>: slow logs of proxy nodes</li>
     * <li><strong>db</strong>: slow logs of data nodes (default)</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>proxy</p>
     */
    @NameInMap("SlowLogRecordType")
    public String slowLogRecordType;

    /**
     * <p>The start time of the query. Specify the time in the <i>yyyy-MM-dd</i>T<i>HH:mm</i>Z format. The time must be in UTC.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-03-10T14:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeSlowLogRecordsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSlowLogRecordsRequest self = new DescribeSlowLogRecordsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSlowLogRecordsRequest setDBName(String DBName) {
        this.DBName = DBName;
        return this;
    }
    public String getDBName() {
        return this.DBName;
    }

    public DescribeSlowLogRecordsRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeSlowLogRecordsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeSlowLogRecordsRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public DescribeSlowLogRecordsRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public DescribeSlowLogRecordsRequest setOrderType(String orderType) {
        this.orderType = orderType;
        return this;
    }
    public String getOrderType() {
        return this.orderType;
    }

    public DescribeSlowLogRecordsRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeSlowLogRecordsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeSlowLogRecordsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeSlowLogRecordsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeSlowLogRecordsRequest setQueryKeyword(String queryKeyword) {
        this.queryKeyword = queryKeyword;
        return this;
    }
    public String getQueryKeyword() {
        return this.queryKeyword;
    }

    public DescribeSlowLogRecordsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeSlowLogRecordsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeSlowLogRecordsRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public DescribeSlowLogRecordsRequest setSlowLogRecordType(String slowLogRecordType) {
        this.slowLogRecordType = slowLogRecordType;
        return this;
    }
    public String getSlowLogRecordType() {
        return this.slowLogRecordType;
    }

    public DescribeSlowLogRecordsRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
