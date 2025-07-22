// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20220101.models;

import com.aliyun.tea.*;

public class ListSystemLogsRequest extends TeaModel {
    /**
     * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ss.SSSZ</p>
     * 
     * <strong>example:</strong>
     * <p>2020-12-08T16:00:00Z</p>
     */
    @NameInMap("GmtEndTime")
    public String gmtEndTime;

    /**
     * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ss.SSSZ</p>
     * 
     * <strong>example:</strong>
     * <p>2020-11-08T16:00:00Z</p>
     */
    @NameInMap("GmtStartTime")
    public String gmtStartTime;

    /**
     * <strong>example:</strong>
     * <p>dsw-730xxxxxxxxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>Error</p>
     */
    @NameInMap("LogLevel")
    public String logLevel;

    /**
     * <strong>example:</strong>
     * <p>ASC</p>
     */
    @NameInMap("Order")
    public String order;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <strong>example:</strong>
     * <p>InstanceStartFailed</p>
     */
    @NameInMap("ProblemCategory")
    public String problemCategory;

    /**
     * <strong>example:</strong>
     * <p>GmtCreateTime</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    /**
     * <strong>example:</strong>
     * <p>473469C7-******5-B3DB-A3DC0DE3C83E</p>
     */
    @NameInMap("SourceRequestId")
    public String sourceRequestId;

    /**
     * <strong>example:</strong>
     * <p>NotebookMainContainerLogs</p>
     */
    @NameInMap("SourceType")
    public String sourceType;

    public static ListSystemLogsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSystemLogsRequest self = new ListSystemLogsRequest();
        return TeaModel.build(map, self);
    }

    public ListSystemLogsRequest setGmtEndTime(String gmtEndTime) {
        this.gmtEndTime = gmtEndTime;
        return this;
    }
    public String getGmtEndTime() {
        return this.gmtEndTime;
    }

    public ListSystemLogsRequest setGmtStartTime(String gmtStartTime) {
        this.gmtStartTime = gmtStartTime;
        return this;
    }
    public String getGmtStartTime() {
        return this.gmtStartTime;
    }

    public ListSystemLogsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListSystemLogsRequest setLogLevel(String logLevel) {
        this.logLevel = logLevel;
        return this;
    }
    public String getLogLevel() {
        return this.logLevel;
    }

    public ListSystemLogsRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public ListSystemLogsRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListSystemLogsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListSystemLogsRequest setProblemCategory(String problemCategory) {
        this.problemCategory = problemCategory;
        return this;
    }
    public String getProblemCategory() {
        return this.problemCategory;
    }

    public ListSystemLogsRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public ListSystemLogsRequest setSourceRequestId(String sourceRequestId) {
        this.sourceRequestId = sourceRequestId;
        return this;
    }
    public String getSourceRequestId() {
        return this.sourceRequestId;
    }

    public ListSystemLogsRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

}
