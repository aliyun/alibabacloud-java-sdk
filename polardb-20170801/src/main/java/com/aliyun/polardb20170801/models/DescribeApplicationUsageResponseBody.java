// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeApplicationUsageResponseBody extends TeaModel {
    /**
     * <p>The Hermes application ID.</p>
     * 
     * <strong>example:</strong>
     * <p>pa-123456</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    /**
     * <p>The response status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The usage statistics grouped by UTC date.</p>
     */
    @NameInMap("DailyUsage")
    public java.util.List<DescribeApplicationUsageResponseBodyDailyUsage> dailyUsage;

    /**
     * <p>The number of days covered by this statistical period.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("Days")
    public Integer days;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The usage statistics grouped by model.</p>
     */
    @NameInMap("ModelUsage")
    public java.util.List<DescribeApplicationUsageResponseBodyModelUsage> modelUsage;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>F45FFACC-1234-5678-90AB-1234567890AB</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The current session runtime and storage statistics.</p>
     */
    @NameInMap("SessionSummary")
    public DescribeApplicationUsageResponseBodySessionSummary sessionSummary;

    /**
     * <p>The aggregated statistics of skill activities.</p>
     */
    @NameInMap("SkillUsage")
    public DescribeApplicationUsageResponseBodySkillUsage skillUsage;

    /**
     * <p>The aggregated usage within the query period.</p>
     */
    @NameInMap("Summary")
    public DescribeApplicationUsageResponseBodySummary summary;

    public static DescribeApplicationUsageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeApplicationUsageResponseBody self = new DescribeApplicationUsageResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeApplicationUsageResponseBody setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public DescribeApplicationUsageResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribeApplicationUsageResponseBody setDailyUsage(java.util.List<DescribeApplicationUsageResponseBodyDailyUsage> dailyUsage) {
        this.dailyUsage = dailyUsage;
        return this;
    }
    public java.util.List<DescribeApplicationUsageResponseBodyDailyUsage> getDailyUsage() {
        return this.dailyUsage;
    }

    public DescribeApplicationUsageResponseBody setDays(Integer days) {
        this.days = days;
        return this;
    }
    public Integer getDays() {
        return this.days;
    }

    public DescribeApplicationUsageResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeApplicationUsageResponseBody setModelUsage(java.util.List<DescribeApplicationUsageResponseBodyModelUsage> modelUsage) {
        this.modelUsage = modelUsage;
        return this;
    }
    public java.util.List<DescribeApplicationUsageResponseBodyModelUsage> getModelUsage() {
        return this.modelUsage;
    }

    public DescribeApplicationUsageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeApplicationUsageResponseBody setSessionSummary(DescribeApplicationUsageResponseBodySessionSummary sessionSummary) {
        this.sessionSummary = sessionSummary;
        return this;
    }
    public DescribeApplicationUsageResponseBodySessionSummary getSessionSummary() {
        return this.sessionSummary;
    }

    public DescribeApplicationUsageResponseBody setSkillUsage(DescribeApplicationUsageResponseBodySkillUsage skillUsage) {
        this.skillUsage = skillUsage;
        return this;
    }
    public DescribeApplicationUsageResponseBodySkillUsage getSkillUsage() {
        return this.skillUsage;
    }

    public DescribeApplicationUsageResponseBody setSummary(DescribeApplicationUsageResponseBodySummary summary) {
        this.summary = summary;
        return this;
    }
    public DescribeApplicationUsageResponseBodySummary getSummary() {
        return this.summary;
    }

    public static class DescribeApplicationUsageResponseBodyDailyUsage extends TeaModel {
        /**
         * <p>The number of model API calls for the day.</p>
         * 
         * <strong>example:</strong>
         * <p>48</p>
         */
        @NameInMap("APICalls")
        public Long APICalls;

        /**
         * <p>The number of tokens served from cache hits for the day.</p>
         * 
         * <strong>example:</strong>
         * <p>1800</p>
         */
        @NameInMap("CacheReadTokens")
        public Long cacheReadTokens;

        /**
         * <p>The UTC date.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-07-24</p>
         */
        @NameInMap("Date")
        public String date;

        /**
         * <p>The number of input tokens for the day.</p>
         * 
         * <strong>example:</strong>
         * <p>12000</p>
         */
        @NameInMap("InputTokens")
        public Long inputTokens;

        /**
         * <p>The number of output tokens for the day.</p>
         * 
         * <strong>example:</strong>
         * <p>3600</p>
         */
        @NameInMap("OutputTokens")
        public Long outputTokens;

        /**
         * <p>The number of reasoning tokens for the day.</p>
         * 
         * <strong>example:</strong>
         * <p>600</p>
         */
        @NameInMap("ReasoningTokens")
        public Long reasoningTokens;

        /**
         * <p>The number of sessions for the day.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("Sessions")
        public Long sessions;

        public static DescribeApplicationUsageResponseBodyDailyUsage build(java.util.Map<String, ?> map) throws Exception {
            DescribeApplicationUsageResponseBodyDailyUsage self = new DescribeApplicationUsageResponseBodyDailyUsage();
            return TeaModel.build(map, self);
        }

        public DescribeApplicationUsageResponseBodyDailyUsage setAPICalls(Long APICalls) {
            this.APICalls = APICalls;
            return this;
        }
        public Long getAPICalls() {
            return this.APICalls;
        }

        public DescribeApplicationUsageResponseBodyDailyUsage setCacheReadTokens(Long cacheReadTokens) {
            this.cacheReadTokens = cacheReadTokens;
            return this;
        }
        public Long getCacheReadTokens() {
            return this.cacheReadTokens;
        }

        public DescribeApplicationUsageResponseBodyDailyUsage setDate(String date) {
            this.date = date;
            return this;
        }
        public String getDate() {
            return this.date;
        }

        public DescribeApplicationUsageResponseBodyDailyUsage setInputTokens(Long inputTokens) {
            this.inputTokens = inputTokens;
            return this;
        }
        public Long getInputTokens() {
            return this.inputTokens;
        }

        public DescribeApplicationUsageResponseBodyDailyUsage setOutputTokens(Long outputTokens) {
            this.outputTokens = outputTokens;
            return this;
        }
        public Long getOutputTokens() {
            return this.outputTokens;
        }

        public DescribeApplicationUsageResponseBodyDailyUsage setReasoningTokens(Long reasoningTokens) {
            this.reasoningTokens = reasoningTokens;
            return this;
        }
        public Long getReasoningTokens() {
            return this.reasoningTokens;
        }

        public DescribeApplicationUsageResponseBodyDailyUsage setSessions(Long sessions) {
            this.sessions = sessions;
            return this;
        }
        public Long getSessions() {
            return this.sessions;
        }

    }

    public static class DescribeApplicationUsageResponseBodyModelUsage extends TeaModel {
        /**
         * <p>The number of API calls for this model.</p>
         * 
         * <strong>example:</strong>
         * <p>320</p>
         */
        @NameInMap("APICalls")
        public Long APICalls;

        /**
         * <p>The number of tokens served from cache hits for this model.</p>
         * 
         * <strong>example:</strong>
         * <p>12000</p>
         */
        @NameInMap("CacheReadTokens")
        public Long cacheReadTokens;

        /**
         * <p>The number of input tokens consumed by this model.</p>
         * 
         * <strong>example:</strong>
         * <p>80000</p>
         */
        @NameInMap("InputTokens")
        public Long inputTokens;

        /**
         * <p>The model identifier.</p>
         * 
         * <strong>example:</strong>
         * <p>qwen3-max</p>
         */
        @NameInMap("Model")
        public String model;

        /**
         * <p>The number of output tokens generated by this model.</p>
         * 
         * <strong>example:</strong>
         * <p>24000</p>
         */
        @NameInMap("OutputTokens")
        public Long outputTokens;

        /**
         * <p>The model provider.</p>
         * 
         * <strong>example:</strong>
         * <p>bailian</p>
         */
        @NameInMap("Provider")
        public String provider;

        /**
         * <p>The number of reasoning tokens generated by this model.</p>
         * 
         * <strong>example:</strong>
         * <p>4000</p>
         */
        @NameInMap("ReasoningTokens")
        public Long reasoningTokens;

        /**
         * <p>The number of sessions that used this model.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("Sessions")
        public Long sessions;

        public static DescribeApplicationUsageResponseBodyModelUsage build(java.util.Map<String, ?> map) throws Exception {
            DescribeApplicationUsageResponseBodyModelUsage self = new DescribeApplicationUsageResponseBodyModelUsage();
            return TeaModel.build(map, self);
        }

        public DescribeApplicationUsageResponseBodyModelUsage setAPICalls(Long APICalls) {
            this.APICalls = APICalls;
            return this;
        }
        public Long getAPICalls() {
            return this.APICalls;
        }

        public DescribeApplicationUsageResponseBodyModelUsage setCacheReadTokens(Long cacheReadTokens) {
            this.cacheReadTokens = cacheReadTokens;
            return this;
        }
        public Long getCacheReadTokens() {
            return this.cacheReadTokens;
        }

        public DescribeApplicationUsageResponseBodyModelUsage setInputTokens(Long inputTokens) {
            this.inputTokens = inputTokens;
            return this;
        }
        public Long getInputTokens() {
            return this.inputTokens;
        }

        public DescribeApplicationUsageResponseBodyModelUsage setModel(String model) {
            this.model = model;
            return this;
        }
        public String getModel() {
            return this.model;
        }

        public DescribeApplicationUsageResponseBodyModelUsage setOutputTokens(Long outputTokens) {
            this.outputTokens = outputTokens;
            return this;
        }
        public Long getOutputTokens() {
            return this.outputTokens;
        }

        public DescribeApplicationUsageResponseBodyModelUsage setProvider(String provider) {
            this.provider = provider;
            return this;
        }
        public String getProvider() {
            return this.provider;
        }

        public DescribeApplicationUsageResponseBodyModelUsage setReasoningTokens(Long reasoningTokens) {
            this.reasoningTokens = reasoningTokens;
            return this;
        }
        public Long getReasoningTokens() {
            return this.reasoningTokens;
        }

        public DescribeApplicationUsageResponseBodyModelUsage setSessions(Long sessions) {
            this.sessions = sessions;
            return this;
        }
        public Long getSessions() {
            return this.sessions;
        }

    }

    public static class DescribeApplicationUsageResponseBodySessionSummary extends TeaModel {
        /**
         * <p>The number of currently active sessions.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("ActiveSessions")
        public Long activeSessions;

        /**
         * <p>The total number of sessions in session storage.</p>
         * 
         * <strong>example:</strong>
         * <p>120</p>
         */
        @NameInMap("StoredSessions")
        public Long storedSessions;

        public static DescribeApplicationUsageResponseBodySessionSummary build(java.util.Map<String, ?> map) throws Exception {
            DescribeApplicationUsageResponseBodySessionSummary self = new DescribeApplicationUsageResponseBodySessionSummary();
            return TeaModel.build(map, self);
        }

        public DescribeApplicationUsageResponseBodySessionSummary setActiveSessions(Long activeSessions) {
            this.activeSessions = activeSessions;
            return this;
        }
        public Long getActiveSessions() {
            return this.activeSessions;
        }

        public DescribeApplicationUsageResponseBodySessionSummary setStoredSessions(Long storedSessions) {
            this.storedSessions = storedSessions;
            return this;
        }
        public Long getStoredSessions() {
            return this.storedSessions;
        }

    }

    public static class DescribeApplicationUsageResponseBodySkillUsage extends TeaModel {
        /**
         * <p>The number of distinct skills that have activity records.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("DistinctSkills")
        public Long distinctSkills;

        /**
         * <p>The total number of skill-related operations.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("TotalActions")
        public Long totalActions;

        /**
         * <p>The number of times skills were edited or managed.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("TotalEdits")
        public Long totalEdits;

        /**
         * <p>The number of times skills were loaded or viewed.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("TotalLoads")
        public Long totalLoads;

        public static DescribeApplicationUsageResponseBodySkillUsage build(java.util.Map<String, ?> map) throws Exception {
            DescribeApplicationUsageResponseBodySkillUsage self = new DescribeApplicationUsageResponseBodySkillUsage();
            return TeaModel.build(map, self);
        }

        public DescribeApplicationUsageResponseBodySkillUsage setDistinctSkills(Long distinctSkills) {
            this.distinctSkills = distinctSkills;
            return this;
        }
        public Long getDistinctSkills() {
            return this.distinctSkills;
        }

        public DescribeApplicationUsageResponseBodySkillUsage setTotalActions(Long totalActions) {
            this.totalActions = totalActions;
            return this;
        }
        public Long getTotalActions() {
            return this.totalActions;
        }

        public DescribeApplicationUsageResponseBodySkillUsage setTotalEdits(Long totalEdits) {
            this.totalEdits = totalEdits;
            return this;
        }
        public Long getTotalEdits() {
            return this.totalEdits;
        }

        public DescribeApplicationUsageResponseBodySkillUsage setTotalLoads(Long totalLoads) {
            this.totalLoads = totalLoads;
            return this;
        }
        public Long getTotalLoads() {
            return this.totalLoads;
        }

    }

    public static class DescribeApplicationUsageResponseBodySummary extends TeaModel {
        /**
         * <p>The number of model API calls.</p>
         * 
         * <strong>example:</strong>
         * <p>480</p>
         */
        @NameInMap("APICalls")
        public Long APICalls;

        /**
         * <p>The number of tokens served from cache hits.</p>
         * 
         * <strong>example:</strong>
         * <p>18000</p>
         */
        @NameInMap("CacheReadTokens")
        public Long cacheReadTokens;

        /**
         * <p>The number of input tokens.</p>
         * 
         * <strong>example:</strong>
         * <p>120000</p>
         */
        @NameInMap("InputTokens")
        public Long inputTokens;

        /**
         * <p>The number of output tokens.</p>
         * 
         * <strong>example:</strong>
         * <p>36000</p>
         */
        @NameInMap("OutputTokens")
        public Long outputTokens;

        /**
         * <p>The number of reasoning tokens.</p>
         * 
         * <strong>example:</strong>
         * <p>6000</p>
         */
        @NameInMap("ReasoningTokens")
        public Long reasoningTokens;

        /**
         * <p>The number of sessions.</p>
         * 
         * <strong>example:</strong>
         * <p>120</p>
         */
        @NameInMap("Sessions")
        public Long sessions;

        public static DescribeApplicationUsageResponseBodySummary build(java.util.Map<String, ?> map) throws Exception {
            DescribeApplicationUsageResponseBodySummary self = new DescribeApplicationUsageResponseBodySummary();
            return TeaModel.build(map, self);
        }

        public DescribeApplicationUsageResponseBodySummary setAPICalls(Long APICalls) {
            this.APICalls = APICalls;
            return this;
        }
        public Long getAPICalls() {
            return this.APICalls;
        }

        public DescribeApplicationUsageResponseBodySummary setCacheReadTokens(Long cacheReadTokens) {
            this.cacheReadTokens = cacheReadTokens;
            return this;
        }
        public Long getCacheReadTokens() {
            return this.cacheReadTokens;
        }

        public DescribeApplicationUsageResponseBodySummary setInputTokens(Long inputTokens) {
            this.inputTokens = inputTokens;
            return this;
        }
        public Long getInputTokens() {
            return this.inputTokens;
        }

        public DescribeApplicationUsageResponseBodySummary setOutputTokens(Long outputTokens) {
            this.outputTokens = outputTokens;
            return this;
        }
        public Long getOutputTokens() {
            return this.outputTokens;
        }

        public DescribeApplicationUsageResponseBodySummary setReasoningTokens(Long reasoningTokens) {
            this.reasoningTokens = reasoningTokens;
            return this;
        }
        public Long getReasoningTokens() {
            return this.reasoningTokens;
        }

        public DescribeApplicationUsageResponseBodySummary setSessions(Long sessions) {
            this.sessions = sessions;
            return this;
        }
        public Long getSessions() {
            return this.sessions;
        }

    }

}
