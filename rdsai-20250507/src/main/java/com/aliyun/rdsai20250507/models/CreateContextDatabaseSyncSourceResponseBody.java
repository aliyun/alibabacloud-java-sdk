// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class CreateContextDatabaseSyncSourceResponseBody extends TeaModel {
    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>SampleValue</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public CreateContextDatabaseSyncSourceResponseBodyData data;

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
     * <p>SampleValue</p>
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
     * <p>Indicates whether the request was successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CreateContextDatabaseSyncSourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateContextDatabaseSyncSourceResponseBody self = new CreateContextDatabaseSyncSourceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateContextDatabaseSyncSourceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateContextDatabaseSyncSourceResponseBody setData(CreateContextDatabaseSyncSourceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateContextDatabaseSyncSourceResponseBodyData getData() {
        return this.data;
    }

    public CreateContextDatabaseSyncSourceResponseBody setHttpStatusCode(Long httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Long getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public CreateContextDatabaseSyncSourceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateContextDatabaseSyncSourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateContextDatabaseSyncSourceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateContextDatabaseSyncSourceResponseBodyData extends TeaModel {
        /**
         * <p>The data source ID, a system-generated UUID.</p>
         * 
         * <strong>example:</strong>
         * <p>550e8400-e29b-41d4-a716-446655440000</p>
         */
        @NameInMap("Id")
        public String id;

        public static CreateContextDatabaseSyncSourceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateContextDatabaseSyncSourceResponseBodyData self = new CreateContextDatabaseSyncSourceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateContextDatabaseSyncSourceResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}
