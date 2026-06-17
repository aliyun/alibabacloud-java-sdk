// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeHALogsRequest extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-****************</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The node ID.</p>
     * <blockquote>
     * <p>这是一个optional 字段，需要增加一个条件If specified,If specified, queries the high availability (HA) switchover records of <code>DBNodeId</code>. You can call the <a href="https://help.aliyun.com/document_detail/98094.html">DescribeDBClusters</a> operation to view the detailed information about all clusters under your account, including node IDs.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>pi-****************</p>
     */
    @NameInMap("DBNodeId")
    public String DBNodeId;

    /**
     * <p>The end of the time range to query. The end time must be later than the start time. The time follows the <code>YYYY-MM-DDThh:mm:ssZ</code> format (UTC time).</p>
     * 
     * <strong>example:</strong>
     * <p>2025-05-23T01:01:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The log type.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>HaSwitchLogList</p>
     */
    @NameInMap("LogType")
    public String logType;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. Valid values: 5 to 50. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The beginning of the time range to query. The time follows the <code>YYYY-MM-DDThh:mm:ssZ</code> format (UTC time).</p>
     * 
     * <strong>example:</strong>
     * <p>2025-05-01T00:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeHALogsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeHALogsRequest self = new DescribeHALogsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeHALogsRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribeHALogsRequest setDBNodeId(String DBNodeId) {
        this.DBNodeId = DBNodeId;
        return this;
    }
    public String getDBNodeId() {
        return this.DBNodeId;
    }

    public DescribeHALogsRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeHALogsRequest setLogType(String logType) {
        this.logType = logType;
        return this;
    }
    public String getLogType() {
        return this.logType;
    }

    public DescribeHALogsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeHALogsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeHALogsRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
