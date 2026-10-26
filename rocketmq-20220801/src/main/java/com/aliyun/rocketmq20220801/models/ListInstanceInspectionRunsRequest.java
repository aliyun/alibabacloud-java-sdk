// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class ListInstanceInspectionRunsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2026-09-08T00:00:00Z</p>
     */
    @NameInMap("endTime")
    public String endTime;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>eyJvZmZzZXQiOjIwfQ</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("regionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>Succeeded</p>
     */
    @NameInMap("reportStatus")
    public String reportStatus;

    /**
     * <strong>example:</strong>
     * <p>risk</p>
     */
    @NameInMap("result")
    public String result;

    /**
     * <strong>example:</strong>
     * <p>reportFinishedAt</p>
     */
    @NameInMap("sortBy")
    public String sortBy;

    /**
     * <strong>example:</strong>
     * <p>2026-09-01T00:00:00Z</p>
     */
    @NameInMap("startTime")
    public String startTime;

    /**
     * <strong>example:</strong>
     * <p>Succeeded</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <strong>example:</strong>
     * <p>rmq.consumer-health</p>
     */
    @NameInMap("templateCode")
    public String templateCode;

    public static ListInstanceInspectionRunsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListInstanceInspectionRunsRequest self = new ListInstanceInspectionRunsRequest();
        return TeaModel.build(map, self);
    }

    public ListInstanceInspectionRunsRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public ListInstanceInspectionRunsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListInstanceInspectionRunsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListInstanceInspectionRunsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListInstanceInspectionRunsRequest setReportStatus(String reportStatus) {
        this.reportStatus = reportStatus;
        return this;
    }
    public String getReportStatus() {
        return this.reportStatus;
    }

    public ListInstanceInspectionRunsRequest setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

    public ListInstanceInspectionRunsRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public ListInstanceInspectionRunsRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public ListInstanceInspectionRunsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListInstanceInspectionRunsRequest setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
        return this;
    }
    public String getTemplateCode() {
        return this.templateCode;
    }

}
