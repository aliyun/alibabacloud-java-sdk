// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20251111.models;

import com.aliyun.tea.*;

public class ListCampaignsResponseBody extends TeaModel {
    /**
     * <p>The result code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The paged query result.</p>
     */
    @NameInMap("Data")
    public ListCampaignsResponseBodyData data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The list of error message parameters.</p>
     */
    @NameInMap("Params")
    public java.util.List<String> params;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>254EB995-DEDF-48A4-9101-9CA5B72FFBCC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListCampaignsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCampaignsResponseBody self = new ListCampaignsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCampaignsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListCampaignsResponseBody setData(ListCampaignsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListCampaignsResponseBodyData getData() {
        return this.data;
    }

    public ListCampaignsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListCampaignsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListCampaignsResponseBody setParams(java.util.List<String> params) {
        this.params = params;
        return this;
    }
    public java.util.List<String> getParams() {
        return this.params;
    }

    public ListCampaignsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCampaignsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListCampaignsResponseBodyDataList extends TeaModel {
        /**
         * <p>The actual end time.</p>
         * 
         * <strong>example:</strong>
         * <p>1634008800000</p>
         */
        @NameInMap("ActualEndTime")
        public Long actualEndTime;

        /**
         * <p>The actual start time.</p>
         * 
         * <strong>example:</strong>
         * <p>1634008800000</p>
         */
        @NameInMap("ActualStartTime")
        public Long actualStartTime;

        /**
         * <p>The campaign ID.</p>
         * 
         * <strong>example:</strong>
         * <p>7607dae1-91ad-47ea-ad76-3d81ac34f729</p>
         */
        @NameInMap("CampaignId")
        public String campaignId;

        /**
         * <p>The number of aborted cases.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CasesAborted")
        public Integer casesAborted;

        /**
         * <p>The number of connected cases.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("CasesConnected")
        public Integer casesConnected;

        /**
         * <p>The number of uncompleted cases.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CasesUncompleted")
        public Integer casesUncompleted;

        /**
         * <p>The number of cases that were attempted but not completed.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CasesUncompletedAfterAttempted")
        public Integer casesUncompletedAfterAttempted;

        /**
         * <p>The completion rate.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("CompletedRate")
        public Double completedRate;

        /**
         * <p>The time when the campaign was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-07-27T11:25:15+08:00</p>
         */
        @NameInMap("CreatedTime")
        public Long createdTime;

        /**
         * <p>The fixed number of concurrent calls.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("FixedQuota")
        public Integer fixedQuota;

        /**
         * <p>The maximum number of retries.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("MaxAttemptCount")
        public Integer maxAttemptCount;

        /**
         * <p>The minimum retry interval.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("MinAttemptInterval")
        public Integer minAttemptInterval;

        /**
         * <p>The campaign name.</p>
         * 
         * <strong>example:</strong>
         * <p>Kiaconnect本月到期续费外呼话术-OPIO_20260727_102718</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The planned end time.</p>
         * 
         * <strong>example:</strong>
         * <p>1634008800000</p>
         */
        @NameInMap("PlannedEndTime")
        public Long plannedEndTime;

        /**
         * <p>The planned start time.</p>
         * 
         * <strong>example:</strong>
         * <p>1634008800000</p>
         */
        @NameInMap("PlannedStartTime")
        public Long plannedStartTime;

        /**
         * <p>Indicates whether the campaign continues to run until the planned end time after all contacts have been called.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("RunUntilEndTime")
        public Boolean runUntilEndTime;

        /**
         * <p>The IVR flow ID.</p>
         * 
         * <strong>example:</strong>
         * <p>8a988bd4-6c6e-45c6-b3a5-3def5ca3bc6f</p>
         */
        @NameInMap("ScriptId")
        public String scriptId;

        /**
         * <p>The campaign status.</p>
         * 
         * <strong>example:</strong>
         * <p>Executing</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <p>The total number of cases.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("TotalCases")
        public Integer totalCases;

        /**
         * <p>The time when the campaign was last updated.</p>
         * 
         * <strong>example:</strong>
         * <p>1760272478</p>
         */
        @NameInMap("UpdatedTime")
        public Long updatedTime;

        /**
         * <p>The weight of the campaign.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Weight")
        public Integer weight;

        public static ListCampaignsResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            ListCampaignsResponseBodyDataList self = new ListCampaignsResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public ListCampaignsResponseBodyDataList setActualEndTime(Long actualEndTime) {
            this.actualEndTime = actualEndTime;
            return this;
        }
        public Long getActualEndTime() {
            return this.actualEndTime;
        }

        public ListCampaignsResponseBodyDataList setActualStartTime(Long actualStartTime) {
            this.actualStartTime = actualStartTime;
            return this;
        }
        public Long getActualStartTime() {
            return this.actualStartTime;
        }

        public ListCampaignsResponseBodyDataList setCampaignId(String campaignId) {
            this.campaignId = campaignId;
            return this;
        }
        public String getCampaignId() {
            return this.campaignId;
        }

        public ListCampaignsResponseBodyDataList setCasesAborted(Integer casesAborted) {
            this.casesAborted = casesAborted;
            return this;
        }
        public Integer getCasesAborted() {
            return this.casesAborted;
        }

        public ListCampaignsResponseBodyDataList setCasesConnected(Integer casesConnected) {
            this.casesConnected = casesConnected;
            return this;
        }
        public Integer getCasesConnected() {
            return this.casesConnected;
        }

        public ListCampaignsResponseBodyDataList setCasesUncompleted(Integer casesUncompleted) {
            this.casesUncompleted = casesUncompleted;
            return this;
        }
        public Integer getCasesUncompleted() {
            return this.casesUncompleted;
        }

        public ListCampaignsResponseBodyDataList setCasesUncompletedAfterAttempted(Integer casesUncompletedAfterAttempted) {
            this.casesUncompletedAfterAttempted = casesUncompletedAfterAttempted;
            return this;
        }
        public Integer getCasesUncompletedAfterAttempted() {
            return this.casesUncompletedAfterAttempted;
        }

        public ListCampaignsResponseBodyDataList setCompletedRate(Double completedRate) {
            this.completedRate = completedRate;
            return this;
        }
        public Double getCompletedRate() {
            return this.completedRate;
        }

        public ListCampaignsResponseBodyDataList setCreatedTime(Long createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public Long getCreatedTime() {
            return this.createdTime;
        }

        public ListCampaignsResponseBodyDataList setFixedQuota(Integer fixedQuota) {
            this.fixedQuota = fixedQuota;
            return this;
        }
        public Integer getFixedQuota() {
            return this.fixedQuota;
        }

        public ListCampaignsResponseBodyDataList setMaxAttemptCount(Integer maxAttemptCount) {
            this.maxAttemptCount = maxAttemptCount;
            return this;
        }
        public Integer getMaxAttemptCount() {
            return this.maxAttemptCount;
        }

        public ListCampaignsResponseBodyDataList setMinAttemptInterval(Integer minAttemptInterval) {
            this.minAttemptInterval = minAttemptInterval;
            return this;
        }
        public Integer getMinAttemptInterval() {
            return this.minAttemptInterval;
        }

        public ListCampaignsResponseBodyDataList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListCampaignsResponseBodyDataList setPlannedEndTime(Long plannedEndTime) {
            this.plannedEndTime = plannedEndTime;
            return this;
        }
        public Long getPlannedEndTime() {
            return this.plannedEndTime;
        }

        public ListCampaignsResponseBodyDataList setPlannedStartTime(Long plannedStartTime) {
            this.plannedStartTime = plannedStartTime;
            return this;
        }
        public Long getPlannedStartTime() {
            return this.plannedStartTime;
        }

        public ListCampaignsResponseBodyDataList setRunUntilEndTime(Boolean runUntilEndTime) {
            this.runUntilEndTime = runUntilEndTime;
            return this;
        }
        public Boolean getRunUntilEndTime() {
            return this.runUntilEndTime;
        }

        public ListCampaignsResponseBodyDataList setScriptId(String scriptId) {
            this.scriptId = scriptId;
            return this;
        }
        public String getScriptId() {
            return this.scriptId;
        }

        public ListCampaignsResponseBodyDataList setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public ListCampaignsResponseBodyDataList setTotalCases(Integer totalCases) {
            this.totalCases = totalCases;
            return this;
        }
        public Integer getTotalCases() {
            return this.totalCases;
        }

        public ListCampaignsResponseBodyDataList setUpdatedTime(Long updatedTime) {
            this.updatedTime = updatedTime;
            return this;
        }
        public Long getUpdatedTime() {
            return this.updatedTime;
        }

        public ListCampaignsResponseBodyDataList setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

    }

    public static class ListCampaignsResponseBodyData extends TeaModel {
        /**
         * <p>The list of outbound campaigns.</p>
         */
        @NameInMap("List")
        public java.util.List<ListCampaignsResponseBodyDataList> list;

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of records.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListCampaignsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListCampaignsResponseBodyData self = new ListCampaignsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListCampaignsResponseBodyData setList(java.util.List<ListCampaignsResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ListCampaignsResponseBodyDataList> getList() {
            return this.list;
        }

        public ListCampaignsResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListCampaignsResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListCampaignsResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
