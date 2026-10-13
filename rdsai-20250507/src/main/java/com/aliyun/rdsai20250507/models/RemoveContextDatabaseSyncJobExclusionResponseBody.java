// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class RemoveContextDatabaseSyncJobExclusionResponseBody extends TeaModel {
    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>Example value</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public RemoveContextDatabaseSyncJobExclusionResponseBodyData data;

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
     * <p>Example value</p>
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

    public static RemoveContextDatabaseSyncJobExclusionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RemoveContextDatabaseSyncJobExclusionResponseBody self = new RemoveContextDatabaseSyncJobExclusionResponseBody();
        return TeaModel.build(map, self);
    }

    public RemoveContextDatabaseSyncJobExclusionResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public RemoveContextDatabaseSyncJobExclusionResponseBody setData(RemoveContextDatabaseSyncJobExclusionResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RemoveContextDatabaseSyncJobExclusionResponseBodyData getData() {
        return this.data;
    }

    public RemoveContextDatabaseSyncJobExclusionResponseBody setHttpStatusCode(Long httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Long getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public RemoveContextDatabaseSyncJobExclusionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RemoveContextDatabaseSyncJobExclusionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RemoveContextDatabaseSyncJobExclusionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class RemoveContextDatabaseSyncJobExclusionResponseBodyData extends TeaModel {
        /**
         * <p>Indicates whether the data has changed.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Changed")
        public Boolean changed;

        /**
         * <p>The configuration version number.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("ConfigVersion")
        public Integer configVersion;

        /**
         * <p>The document ID.</p>
         * 
         * <strong>example:</strong>
         * <p>doc-as1llqmkol****</p>
         */
        @NameInMap("DocumentId")
        public String documentId;

        /**
         * <p>Indicates whether the item is excluded.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Excluded")
        public Boolean excluded;

        /**
         * <p>The job ID, which is a system-generated UUID.</p>
         * 
         * <strong>example:</strong>
         * <p>550e8400-e29b-41d4-a716-446655440000</p>
         */
        @NameInMap("JobId")
        public String jobId;

        public static RemoveContextDatabaseSyncJobExclusionResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RemoveContextDatabaseSyncJobExclusionResponseBodyData self = new RemoveContextDatabaseSyncJobExclusionResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RemoveContextDatabaseSyncJobExclusionResponseBodyData setChanged(Boolean changed) {
            this.changed = changed;
            return this;
        }
        public Boolean getChanged() {
            return this.changed;
        }

        public RemoveContextDatabaseSyncJobExclusionResponseBodyData setConfigVersion(Integer configVersion) {
            this.configVersion = configVersion;
            return this;
        }
        public Integer getConfigVersion() {
            return this.configVersion;
        }

        public RemoveContextDatabaseSyncJobExclusionResponseBodyData setDocumentId(String documentId) {
            this.documentId = documentId;
            return this;
        }
        public String getDocumentId() {
            return this.documentId;
        }

        public RemoveContextDatabaseSyncJobExclusionResponseBodyData setExcluded(Boolean excluded) {
            this.excluded = excluded;
            return this;
        }
        public Boolean getExcluded() {
            return this.excluded;
        }

        public RemoveContextDatabaseSyncJobExclusionResponseBodyData setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

    }

}
