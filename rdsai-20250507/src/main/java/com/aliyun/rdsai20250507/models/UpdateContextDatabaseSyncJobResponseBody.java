// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class UpdateContextDatabaseSyncJobResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>示例值</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public UpdateContextDatabaseSyncJobResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("HttpStatusCode")
    public Long httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>示例值</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>id-001</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static UpdateContextDatabaseSyncJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateContextDatabaseSyncJobResponseBody self = new UpdateContextDatabaseSyncJobResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateContextDatabaseSyncJobResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateContextDatabaseSyncJobResponseBody setData(UpdateContextDatabaseSyncJobResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdateContextDatabaseSyncJobResponseBodyData getData() {
        return this.data;
    }

    public UpdateContextDatabaseSyncJobResponseBody setHttpStatusCode(Long httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Long getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public UpdateContextDatabaseSyncJobResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateContextDatabaseSyncJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateContextDatabaseSyncJobResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class UpdateContextDatabaseSyncJobResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("ConfigVersion")
        public Integer configVersion;

        /**
         * <strong>example:</strong>
         * <p>550e8400-e29b-41d4-a716-446655440000</p>
         */
        @NameInMap("Id")
        public String id;

        public static UpdateContextDatabaseSyncJobResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateContextDatabaseSyncJobResponseBodyData self = new UpdateContextDatabaseSyncJobResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateContextDatabaseSyncJobResponseBodyData setConfigVersion(Integer configVersion) {
            this.configVersion = configVersion;
            return this;
        }
        public Integer getConfigVersion() {
            return this.configVersion;
        }

        public UpdateContextDatabaseSyncJobResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}
