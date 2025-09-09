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

    @NameInMap("LifecycleId")
    public String lifecycleId;

    /**
     * <strong>example:</strong>
     * <p>Error</p>
     */
    @NameInMap("LogLevel")
    public String logLevel;

    @NameInMap("LogRepository")
    public String logRepository;

    @NameInMap("Offset")
    public String offset;

    /**
     * <strong>example:</strong>
     * <p>ASC</p>
     */
    @NameInMap("Order")
    public String order;

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

    public ListSystemLogsRequest setLifecycleId(String lifecycleId) {
        this.lifecycleId = lifecycleId;
        return this;
    }
    public String getLifecycleId() {
        return this.lifecycleId;
    }

    public ListSystemLogsRequest setLogLevel(String logLevel) {
        this.logLevel = logLevel;
        return this;
    }
    public String getLogLevel() {
        return this.logLevel;
    }

    public ListSystemLogsRequest setLogRepository(String logRepository) {
        this.logRepository = logRepository;
        return this;
    }
    public String getLogRepository() {
        return this.logRepository;
    }

    public ListSystemLogsRequest setOffset(String offset) {
        this.offset = offset;
        return this;
    }
    public String getOffset() {
        return this.offset;
    }

    public ListSystemLogsRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
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

}
