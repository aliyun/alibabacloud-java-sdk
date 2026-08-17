// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20251111.models;

import com.aliyun.tea.*;

public class GetCampaignResponseBody extends TeaModel {
    /**
     * <p>The result code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The details of the outbound campaign.</p>
     */
    @NameInMap("Data")
    public GetCampaignResponseBodyData data;

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
     * <p>None</p>
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

    public static GetCampaignResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCampaignResponseBody self = new GetCampaignResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCampaignResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetCampaignResponseBody setData(GetCampaignResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetCampaignResponseBodyData getData() {
        return this.data;
    }

    public GetCampaignResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetCampaignResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetCampaignResponseBody setParams(java.util.List<String> params) {
        this.params = params;
        return this;
    }
    public java.util.List<String> getParams() {
        return this.params;
    }

    public GetCampaignResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetCampaignResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetCampaignResponseBodyData extends TeaModel {
        /**
         * <p>The actual end time.</p>
         * 
         * <strong>example:</strong>
         * <p>1634054500000</p>
         */
        @NameInMap("ActualEndTime")
        public Long actualEndTime;

        /**
         * <p>The actual start time.</p>
         * 
         * <strong>example:</strong>
         * <p>1634054400000</p>
         */
        @NameInMap("ActualStartTime")
        public Long actualStartTime;

        /**
         * <p>The campaign ID.</p>
         * 
         * <strong>example:</strong>
         * <p>6ac878ab-115b-4170-a5d8-547481273364</p>
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
         * <p>0.5</p>
         */
        @NameInMap("CompletedRate")
        public Double completedRate;

        /**
         * <p>The time when the campaign was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1735660800000</p>
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
         * <p>Satisfaction Survey</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The list of caller numbers.</p>
         */
        @NameInMap("Numbers")
        public java.util.List<String> numbers;

        /**
         * <p>The planned end time.</p>
         * 
         * <strong>example:</strong>
         * <p>1634054500000</p>
         */
        @NameInMap("PlannedEndTime")
        public Long plannedEndTime;

        /**
         * <p>The planned start time.</p>
         * 
         * <strong>example:</strong>
         * <p>1634054400000</p>
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
         * <p>The scenario ID.</p>
         * 
         * <strong>example:</strong>
         * <p>d13ad2d3-3fe6-4352-b38b-bd6559047de8</p>
         */
        @NameInMap("ScriptId")
        public String scriptId;

        /**
         * <p>The campaign state.</p>
         * 
         * <strong>example:</strong>
         * <p>Completed</p>
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
         * <p>1735660800000</p>
         */
        @NameInMap("UpdatedTime")
        public Long updatedTime;

        /**
         * <p>The campaign weight.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Weight")
        public Integer weight;

        public static GetCampaignResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetCampaignResponseBodyData self = new GetCampaignResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetCampaignResponseBodyData setActualEndTime(Long actualEndTime) {
            this.actualEndTime = actualEndTime;
            return this;
        }
        public Long getActualEndTime() {
            return this.actualEndTime;
        }

        public GetCampaignResponseBodyData setActualStartTime(Long actualStartTime) {
            this.actualStartTime = actualStartTime;
            return this;
        }
        public Long getActualStartTime() {
            return this.actualStartTime;
        }

        public GetCampaignResponseBodyData setCampaignId(String campaignId) {
            this.campaignId = campaignId;
            return this;
        }
        public String getCampaignId() {
            return this.campaignId;
        }

        public GetCampaignResponseBodyData setCasesAborted(Integer casesAborted) {
            this.casesAborted = casesAborted;
            return this;
        }
        public Integer getCasesAborted() {
            return this.casesAborted;
        }

        public GetCampaignResponseBodyData setCasesConnected(Integer casesConnected) {
            this.casesConnected = casesConnected;
            return this;
        }
        public Integer getCasesConnected() {
            return this.casesConnected;
        }

        public GetCampaignResponseBodyData setCasesUncompleted(Integer casesUncompleted) {
            this.casesUncompleted = casesUncompleted;
            return this;
        }
        public Integer getCasesUncompleted() {
            return this.casesUncompleted;
        }

        public GetCampaignResponseBodyData setCasesUncompletedAfterAttempted(Integer casesUncompletedAfterAttempted) {
            this.casesUncompletedAfterAttempted = casesUncompletedAfterAttempted;
            return this;
        }
        public Integer getCasesUncompletedAfterAttempted() {
            return this.casesUncompletedAfterAttempted;
        }

        public GetCampaignResponseBodyData setCompletedRate(Double completedRate) {
            this.completedRate = completedRate;
            return this;
        }
        public Double getCompletedRate() {
            return this.completedRate;
        }

        public GetCampaignResponseBodyData setCreatedTime(Long createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public Long getCreatedTime() {
            return this.createdTime;
        }

        public GetCampaignResponseBodyData setFixedQuota(Integer fixedQuota) {
            this.fixedQuota = fixedQuota;
            return this;
        }
        public Integer getFixedQuota() {
            return this.fixedQuota;
        }

        public GetCampaignResponseBodyData setMaxAttemptCount(Integer maxAttemptCount) {
            this.maxAttemptCount = maxAttemptCount;
            return this;
        }
        public Integer getMaxAttemptCount() {
            return this.maxAttemptCount;
        }

        public GetCampaignResponseBodyData setMinAttemptInterval(Integer minAttemptInterval) {
            this.minAttemptInterval = minAttemptInterval;
            return this;
        }
        public Integer getMinAttemptInterval() {
            return this.minAttemptInterval;
        }

        public GetCampaignResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetCampaignResponseBodyData setNumbers(java.util.List<String> numbers) {
            this.numbers = numbers;
            return this;
        }
        public java.util.List<String> getNumbers() {
            return this.numbers;
        }

        public GetCampaignResponseBodyData setPlannedEndTime(Long plannedEndTime) {
            this.plannedEndTime = plannedEndTime;
            return this;
        }
        public Long getPlannedEndTime() {
            return this.plannedEndTime;
        }

        public GetCampaignResponseBodyData setPlannedStartTime(Long plannedStartTime) {
            this.plannedStartTime = plannedStartTime;
            return this;
        }
        public Long getPlannedStartTime() {
            return this.plannedStartTime;
        }

        public GetCampaignResponseBodyData setRunUntilEndTime(Boolean runUntilEndTime) {
            this.runUntilEndTime = runUntilEndTime;
            return this;
        }
        public Boolean getRunUntilEndTime() {
            return this.runUntilEndTime;
        }

        public GetCampaignResponseBodyData setScriptId(String scriptId) {
            this.scriptId = scriptId;
            return this;
        }
        public String getScriptId() {
            return this.scriptId;
        }

        public GetCampaignResponseBodyData setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public GetCampaignResponseBodyData setTotalCases(Integer totalCases) {
            this.totalCases = totalCases;
            return this;
        }
        public Integer getTotalCases() {
            return this.totalCases;
        }

        public GetCampaignResponseBodyData setUpdatedTime(Long updatedTime) {
            this.updatedTime = updatedTime;
            return this;
        }
        public Long getUpdatedTime() {
            return this.updatedTime;
        }

        public GetCampaignResponseBodyData setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

    }

}
