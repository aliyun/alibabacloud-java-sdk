// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class GetContextDatabaseSyncJobResponseBody extends TeaModel {
    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>Sample value</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public GetContextDatabaseSyncJobResponseBodyData data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("HttpStatusCode")
    public Long httpStatusCode;

    /**
     * <p>The message.</p>
     * 
     * <strong>example:</strong>
     * <p>Sample value</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>id-001</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetContextDatabaseSyncJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetContextDatabaseSyncJobResponseBody self = new GetContextDatabaseSyncJobResponseBody();
        return TeaModel.build(map, self);
    }

    public GetContextDatabaseSyncJobResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetContextDatabaseSyncJobResponseBody setData(GetContextDatabaseSyncJobResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetContextDatabaseSyncJobResponseBodyData getData() {
        return this.data;
    }

    public GetContextDatabaseSyncJobResponseBody setHttpStatusCode(Long httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Long getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetContextDatabaseSyncJobResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetContextDatabaseSyncJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetContextDatabaseSyncJobResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetContextDatabaseSyncJobResponseBodyDataFilters extends TeaModel {
        /**
         * <p>The list of exclusion rules.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;/Archived documents&quot;]</p>
         */
        @NameInMap("Exclude")
        public java.util.List<String> exclude;

        /**
         * <p>The list of excluded document IDs.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;doc-as1llqmkol****&quot;]</p>
         */
        @NameInMap("ExcludedDocumentIds")
        public java.util.List<String> excludedDocumentIds;

        /**
         * <p>The list of inclusion rules.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;/R&amp;D documents&quot;]</p>
         */
        @NameInMap("Include")
        public java.util.List<String> include;

        /**
         * <p>The size limit in bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>2147483648</p>
         */
        @NameInMap("SizeLimit")
        public Long sizeLimit;

        /**
         * <p>The list of allowed document types.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;docx&quot;, &quot;pdf&quot;]</p>
         */
        @NameInMap("TypeAllowlist")
        public java.util.List<String> typeAllowlist;

        public static GetContextDatabaseSyncJobResponseBodyDataFilters build(java.util.Map<String, ?> map) throws Exception {
            GetContextDatabaseSyncJobResponseBodyDataFilters self = new GetContextDatabaseSyncJobResponseBodyDataFilters();
            return TeaModel.build(map, self);
        }

        public GetContextDatabaseSyncJobResponseBodyDataFilters setExclude(java.util.List<String> exclude) {
            this.exclude = exclude;
            return this;
        }
        public java.util.List<String> getExclude() {
            return this.exclude;
        }

        public GetContextDatabaseSyncJobResponseBodyDataFilters setExcludedDocumentIds(java.util.List<String> excludedDocumentIds) {
            this.excludedDocumentIds = excludedDocumentIds;
            return this;
        }
        public java.util.List<String> getExcludedDocumentIds() {
            return this.excludedDocumentIds;
        }

        public GetContextDatabaseSyncJobResponseBodyDataFilters setInclude(java.util.List<String> include) {
            this.include = include;
            return this;
        }
        public java.util.List<String> getInclude() {
            return this.include;
        }

        public GetContextDatabaseSyncJobResponseBodyDataFilters setSizeLimit(Long sizeLimit) {
            this.sizeLimit = sizeLimit;
            return this;
        }
        public Long getSizeLimit() {
            return this.sizeLimit;
        }

        public GetContextDatabaseSyncJobResponseBodyDataFilters setTypeAllowlist(java.util.List<String> typeAllowlist) {
            this.typeAllowlist = typeAllowlist;
            return this;
        }
        public java.util.List<String> getTypeAllowlist() {
            return this.typeAllowlist;
        }

    }

    public static class GetContextDatabaseSyncJobResponseBodyData extends TeaModel {
        /**
         * <p>The reason for the automatic pause.</p>
         * 
         * <strong>example:</strong>
         * <p>3 consecutive execution failures</p>
         */
        @NameInMap("AutoPauseReason")
        public String autoPauseReason;

        /**
         * <p>Indicates whether the job is automatically paused.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AutoPaused")
        public Boolean autoPaused;

        /**
         * <p>The configuration version number.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("ConfigVersion")
        public Integer configVersion;

        /**
         * <p>Indicates whether the job is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Enabled")
        public Boolean enabled;

        /**
         * <p>The filter conditions.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;include&quot;:[&quot;/R&amp;D documents/<strong>&quot;],&quot;exclude&quot;:[&quot;/Archived documents/</strong>&quot;],&quot;excludedDocumentIds&quot;:[],&quot;sizeLimit&quot;:2147483648,&quot;typeAllowlist&quot;:[&quot;docx&quot;,&quot;pdf&quot;]}</p>
         */
        @NameInMap("Filters")
        public GetContextDatabaseSyncJobResponseBodyDataFilters filters;

        /**
         * <p>The job ID, which is a system-generated UUID.</p>
         * 
         * <strong>example:</strong>
         * <p>550e8400-e29b-41d4-a716-446655440000</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The target knowledge base ID.</p>
         * 
         * <strong>example:</strong>
         * <p>kb-as1llqmkol****</p>
         */
        @NameInMap("KnowledgeBaseId")
        public String knowledgeBaseId;

        /**
         * <p>The name.</p>
         * 
         * <strong>example:</strong>
         * <p>R&amp;D team document import</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The next execution time.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-09-23T10:00:00+08:00</p>
         */
        @NameInMap("NextRunAt")
        public String nextRunAt;

        /**
         * <p>The schedule type. Valid values: interval and daily-times.</p>
         * 
         * <strong>example:</strong>
         * <p>daily-times</p>
         */
        @NameInMap("ScheduleType")
        public String scheduleType;

        /**
         * <p>The data source ID, which is a system-generated UUID.</p>
         * 
         * <strong>example:</strong>
         * <p>550e8400-e29b-41d4-a716-446655440000</p>
         */
        @NameInMap("SourceId")
        public String sourceId;

        /**
         * <p>The target ID, which is a system-generated UUID.</p>
         * 
         * <strong>example:</strong>
         * <p>550e8400-e29b-41d4-a716-446655440000</p>
         */
        @NameInMap("TargetId")
        public String targetId;

        public static GetContextDatabaseSyncJobResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetContextDatabaseSyncJobResponseBodyData self = new GetContextDatabaseSyncJobResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetContextDatabaseSyncJobResponseBodyData setAutoPauseReason(String autoPauseReason) {
            this.autoPauseReason = autoPauseReason;
            return this;
        }
        public String getAutoPauseReason() {
            return this.autoPauseReason;
        }

        public GetContextDatabaseSyncJobResponseBodyData setAutoPaused(Boolean autoPaused) {
            this.autoPaused = autoPaused;
            return this;
        }
        public Boolean getAutoPaused() {
            return this.autoPaused;
        }

        public GetContextDatabaseSyncJobResponseBodyData setConfigVersion(Integer configVersion) {
            this.configVersion = configVersion;
            return this;
        }
        public Integer getConfigVersion() {
            return this.configVersion;
        }

        public GetContextDatabaseSyncJobResponseBodyData setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public GetContextDatabaseSyncJobResponseBodyData setFilters(GetContextDatabaseSyncJobResponseBodyDataFilters filters) {
            this.filters = filters;
            return this;
        }
        public GetContextDatabaseSyncJobResponseBodyDataFilters getFilters() {
            return this.filters;
        }

        public GetContextDatabaseSyncJobResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetContextDatabaseSyncJobResponseBodyData setKnowledgeBaseId(String knowledgeBaseId) {
            this.knowledgeBaseId = knowledgeBaseId;
            return this;
        }
        public String getKnowledgeBaseId() {
            return this.knowledgeBaseId;
        }

        public GetContextDatabaseSyncJobResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetContextDatabaseSyncJobResponseBodyData setNextRunAt(String nextRunAt) {
            this.nextRunAt = nextRunAt;
            return this;
        }
        public String getNextRunAt() {
            return this.nextRunAt;
        }

        public GetContextDatabaseSyncJobResponseBodyData setScheduleType(String scheduleType) {
            this.scheduleType = scheduleType;
            return this;
        }
        public String getScheduleType() {
            return this.scheduleType;
        }

        public GetContextDatabaseSyncJobResponseBodyData setSourceId(String sourceId) {
            this.sourceId = sourceId;
            return this;
        }
        public String getSourceId() {
            return this.sourceId;
        }

        public GetContextDatabaseSyncJobResponseBodyData setTargetId(String targetId) {
            this.targetId = targetId;
            return this;
        }
        public String getTargetId() {
            return this.targetId;
        }

    }

}
