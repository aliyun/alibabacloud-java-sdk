// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class SearchOmsOpenAPIMonitorMetricRequest extends TeaModel {
    /**
     * <p>The query start time, which is a second-level timestamp.</p>
     */
    @NameInMap("BeginTime")
    public Long beginTime;

    /**
     * <p>The query end time, which is a second-level timestamp.</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The maximum number of query points.</p>
     */
    @NameInMap("MaxPointNum")
    public Long maxPointNum;

    /**
     * <p>The query metric. For example, if you want to query the incremental transactions per second (TPS), set the value to CONNECTOR_TPS. Valid values: CONNECTOR_TPS: the TPS of the Connector component; CONNECTOR_DELAY: the latency of the Connector component; CONNECTOR_SOURCE_QUEUE_SIZE: the queue size of the Connector source; CONNECTOR_IOPS: the Connector IOPS; CONNECTOR_WRITE_COST: the time spent in writing at the Connector destination; CONNECTOR_SOURCE_READ_COST: the time spent in reading at the Connector source; JDBCWRITER_DELAY: the latency of the JDBCWriter; JDBCWRITER_IOPS: the IOPS of the JDBCWriter; JDBCWRITER_RPS: the requests per second (RPS) of the JDBCWriter; STORE_DELAY: the latency of the Store component; STORE_CONN: the number of store connections; STORE_IOPS: the IOPS of the Store component; STORE_TPS: the TPS of the Store component; CHECKER_SOURCE_NONE_RPS: the instantaneous RPS of the Checker component at the source end during full migration; CHECKER_SOURCE_AVG_RPS: the average RPS of the Checker component at the source end during full migration; CHECKER_DEST_NONE_RPS: the instantaneous RPS of the Checker component at the destination end during full migration; CHECKER_DEST_AVG_RPS: the average RPS of the Checker component at the destination end during full migration; CHECKER_SOURCE_NONE_RT: the instantaneous response time (RT) of the Checker component at the source end during full migration; CHECKER_SOURCE_AVG_RT: the average RT of the Checker component at the source end during full migration; CHECKER_DEST_NONE_RT: the instantaneous RT of the Checker component at the destination end during full migration; CHECKER_DEST_AVG_RT: the average RT of the Checker component at the destination end during full migration; CHECKER_SOURCE_NONE_READ_IOPS: the instantaneous read IOPS of the Checker component at the source end during full migration; CHECKER_SOURCE_AVG_READ_IOPS: the average read IOPS of the Checker component at the source end during full migration; CHECKER_DEST_NONE_WRITE_IOPS: the instantaneous write IOPS of the Checker component at the destination end during full migration; CHECKER_DEST_AVG_WRITE_IOPS: the average write IOPS of the Checker component at the destination end during full migration; CHECKER_VERIFY_SOURCE_NONE_RPS: the instantaneous RPS of the Checker-Verify component at the source end during full verification; CHECKER_VERIFY_SOURCE_AVG_RPS: the average RPS of the Checker-Verify component at the source end during full verification; CHECKER_VERIFY_DEST_NONE_RPS: the instantaneous RPS of the Checker-Verify component at the destination end during full verification; CHECKER_VERIFY_DEST_AVG_RPS: the average RPS of the Checker-Verify component at the destination end during full verification; CHECKER_VERIFY_SOURCE_NONE_RT: the instantaneous RT of the Checker-Verify component at the source end during full verification; CHECKER_VERIFY_SOURCE_AVG_RT: the average RT of the Checker-Verify component at the source end during full verification; CHECKER_VERIFY_DEST_NONE_RT: the instantaneous RT of the Checker-Verify component at the destination end during full verification; CHECKER_VERIFY_DEST_AVG_RT: the average RT of the Checker-Verify component at the destination end during full verification; CHECKER_VERIFY_SOURCE_NONE_READ_IOPS: the instantaneous read IOPS of the Checker-Verify component at the source end during full verification; CHECKER_VERIFY_SOURCE_AVG_READ_IOPS: the average read IOPS of the Checker-Verify component at the source end during full verification; CHECKER_VERIFY_DEST_NONE_READ_IOPS: the instantaneous read IOPS of the Checker-Verify component at the destination end during full verification; and CHECKER_VERIFY_DEST_AVG_READ_IOPS: the average read IOPS of the Checker-Verify component at the destination end during full verification.</p>
     */
    @NameInMap("Metric")
    public String metric;

    /**
     * <p>The page number, which takes effect in a pagination query.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The page size, which takes effect in a pagination query.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the project to query.</p>
     */
    @NameInMap("ProjectId")
    public String projectId;

    /**
     * <p>The ID of the migration instance. Generally, if you want to create a project on a public cloud, you must first purchase a migration instance.</p>
     */
    @NameInMap("WorkerGradeId")
    public String workerGradeId;

    public static SearchOmsOpenAPIMonitorMetricRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchOmsOpenAPIMonitorMetricRequest self = new SearchOmsOpenAPIMonitorMetricRequest();
        return TeaModel.build(map, self);
    }

    public SearchOmsOpenAPIMonitorMetricRequest setBeginTime(Long beginTime) {
        this.beginTime = beginTime;
        return this;
    }
    public Long getBeginTime() {
        return this.beginTime;
    }

    public SearchOmsOpenAPIMonitorMetricRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public SearchOmsOpenAPIMonitorMetricRequest setMaxPointNum(Long maxPointNum) {
        this.maxPointNum = maxPointNum;
        return this;
    }
    public Long getMaxPointNum() {
        return this.maxPointNum;
    }

    public SearchOmsOpenAPIMonitorMetricRequest setMetric(String metric) {
        this.metric = metric;
        return this;
    }
    public String getMetric() {
        return this.metric;
    }

    public SearchOmsOpenAPIMonitorMetricRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public SearchOmsOpenAPIMonitorMetricRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public SearchOmsOpenAPIMonitorMetricRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public SearchOmsOpenAPIMonitorMetricRequest setWorkerGradeId(String workerGradeId) {
        this.workerGradeId = workerGradeId;
        return this;
    }
    public String getWorkerGradeId() {
        return this.workerGradeId;
    }

}
