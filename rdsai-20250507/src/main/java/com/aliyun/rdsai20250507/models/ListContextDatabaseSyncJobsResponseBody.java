// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class ListContextDatabaseSyncJobsResponseBody extends TeaModel {
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
    public ListContextDatabaseSyncJobsResponseBodyData data;

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

    public static ListContextDatabaseSyncJobsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListContextDatabaseSyncJobsResponseBody self = new ListContextDatabaseSyncJobsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListContextDatabaseSyncJobsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListContextDatabaseSyncJobsResponseBody setData(ListContextDatabaseSyncJobsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListContextDatabaseSyncJobsResponseBodyData getData() {
        return this.data;
    }

    public ListContextDatabaseSyncJobsResponseBody setHttpStatusCode(Long httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Long getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListContextDatabaseSyncJobsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListContextDatabaseSyncJobsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListContextDatabaseSyncJobsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListContextDatabaseSyncJobsResponseBodyDataJobsFilters extends TeaModel {
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

        public static ListContextDatabaseSyncJobsResponseBodyDataJobsFilters build(java.util.Map<String, ?> map) throws Exception {
            ListContextDatabaseSyncJobsResponseBodyDataJobsFilters self = new ListContextDatabaseSyncJobsResponseBodyDataJobsFilters();
            return TeaModel.build(map, self);
        }

        public ListContextDatabaseSyncJobsResponseBodyDataJobsFilters setExclude(java.util.List<String> exclude) {
            this.exclude = exclude;
            return this;
        }
        public java.util.List<String> getExclude() {
            return this.exclude;
        }

        public ListContextDatabaseSyncJobsResponseBodyDataJobsFilters setExcludedDocumentIds(java.util.List<String> excludedDocumentIds) {
            this.excludedDocumentIds = excludedDocumentIds;
            return this;
        }
        public java.util.List<String> getExcludedDocumentIds() {
            return this.excludedDocumentIds;
        }

        public ListContextDatabaseSyncJobsResponseBodyDataJobsFilters setInclude(java.util.List<String> include) {
            this.include = include;
            return this;
        }
        public java.util.List<String> getInclude() {
            return this.include;
        }

        public ListContextDatabaseSyncJobsResponseBodyDataJobsFilters setSizeLimit(Long sizeLimit) {
            this.sizeLimit = sizeLimit;
            return this;
        }
        public Long getSizeLimit() {
            return this.sizeLimit;
        }

        public ListContextDatabaseSyncJobsResponseBodyDataJobsFilters setTypeAllowlist(java.util.List<String> typeAllowlist) {
            this.typeAllowlist = typeAllowlist;
            return this;
        }
        public java.util.List<String> getTypeAllowlist() {
            return this.typeAllowlist;
        }

    }

    public static class ListContextDatabaseSyncJobsResponseBodyDataJobs extends TeaModel {
        /**
         * <p>The auto-pause reason.</p>
         * 
         * <strong>example:</strong>
         * <p>Three consecutive run failures</p>
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
        public ListContextDatabaseSyncJobsResponseBodyDataJobsFilters filters;

        /**
         * <p>The job ID, which is a system-generated UUID.</p>
         * 
         * <strong>example:</strong>
         * <p>550e8400-e29b-41d4-a716-446655440000</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The destination knowledge base ID.</p>
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
         * <p>The next run time.</p>
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
         * <p>The destination ID, which is a system-generated UUID.</p>
         * 
         * <strong>example:</strong>
         * <p>550e8400-e29b-41d4-a716-446655440000</p>
         */
        @NameInMap("TargetId")
        public String targetId;

        public static ListContextDatabaseSyncJobsResponseBodyDataJobs build(java.util.Map<String, ?> map) throws Exception {
            ListContextDatabaseSyncJobsResponseBodyDataJobs self = new ListContextDatabaseSyncJobsResponseBodyDataJobs();
            return TeaModel.build(map, self);
        }

        public ListContextDatabaseSyncJobsResponseBodyDataJobs setAutoPauseReason(String autoPauseReason) {
            this.autoPauseReason = autoPauseReason;
            return this;
        }
        public String getAutoPauseReason() {
            return this.autoPauseReason;
        }

        public ListContextDatabaseSyncJobsResponseBodyDataJobs setAutoPaused(Boolean autoPaused) {
            this.autoPaused = autoPaused;
            return this;
        }
        public Boolean getAutoPaused() {
            return this.autoPaused;
        }

        public ListContextDatabaseSyncJobsResponseBodyDataJobs setConfigVersion(Integer configVersion) {
            this.configVersion = configVersion;
            return this;
        }
        public Integer getConfigVersion() {
            return this.configVersion;
        }

        public ListContextDatabaseSyncJobsResponseBodyDataJobs setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public ListContextDatabaseSyncJobsResponseBodyDataJobs setFilters(ListContextDatabaseSyncJobsResponseBodyDataJobsFilters filters) {
            this.filters = filters;
            return this;
        }
        public ListContextDatabaseSyncJobsResponseBodyDataJobsFilters getFilters() {
            return this.filters;
        }

        public ListContextDatabaseSyncJobsResponseBodyDataJobs setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListContextDatabaseSyncJobsResponseBodyDataJobs setKnowledgeBaseId(String knowledgeBaseId) {
            this.knowledgeBaseId = knowledgeBaseId;
            return this;
        }
        public String getKnowledgeBaseId() {
            return this.knowledgeBaseId;
        }

        public ListContextDatabaseSyncJobsResponseBodyDataJobs setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListContextDatabaseSyncJobsResponseBodyDataJobs setNextRunAt(String nextRunAt) {
            this.nextRunAt = nextRunAt;
            return this;
        }
        public String getNextRunAt() {
            return this.nextRunAt;
        }

        public ListContextDatabaseSyncJobsResponseBodyDataJobs setScheduleType(String scheduleType) {
            this.scheduleType = scheduleType;
            return this;
        }
        public String getScheduleType() {
            return this.scheduleType;
        }

        public ListContextDatabaseSyncJobsResponseBodyDataJobs setSourceId(String sourceId) {
            this.sourceId = sourceId;
            return this;
        }
        public String getSourceId() {
            return this.sourceId;
        }

        public ListContextDatabaseSyncJobsResponseBodyDataJobs setTargetId(String targetId) {
            this.targetId = targetId;
            return this;
        }
        public String getTargetId() {
            return this.targetId;
        }

    }

    public static class ListContextDatabaseSyncJobsResponseBodyData extends TeaModel {
        /**
         * <p>The list of import jobs.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;Id&quot;:&quot;job-as1llqmkol****&quot;, &quot;SourceId&quot;:&quot;src-as1llqmkol****&quot;, &quot;TargetId&quot;:&quot;tg-as1llqmkol****&quot;, &quot;KnowledgeBaseId&quot;:&quot;kb-as1llqmkol****&quot;}]</p>
         */
        @NameInMap("Jobs")
        public java.util.List<ListContextDatabaseSyncJobsResponseBodyDataJobs> jobs;

        /**
         * <p>The page number, starting from 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Page")
        public Integer page;

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Total")
        public Integer total;

        public static ListContextDatabaseSyncJobsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListContextDatabaseSyncJobsResponseBodyData self = new ListContextDatabaseSyncJobsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListContextDatabaseSyncJobsResponseBodyData setJobs(java.util.List<ListContextDatabaseSyncJobsResponseBodyDataJobs> jobs) {
            this.jobs = jobs;
            return this;
        }
        public java.util.List<ListContextDatabaseSyncJobsResponseBodyDataJobs> getJobs() {
            return this.jobs;
        }

        public ListContextDatabaseSyncJobsResponseBodyData setPage(Integer page) {
            this.page = page;
            return this;
        }
        public Integer getPage() {
            return this.page;
        }

        public ListContextDatabaseSyncJobsResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListContextDatabaseSyncJobsResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
