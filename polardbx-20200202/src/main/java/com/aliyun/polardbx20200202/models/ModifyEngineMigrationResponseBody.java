// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class ModifyEngineMigrationResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public ModifyEngineMigrationResponseBodyData data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public String httpStatusCode;

    /**
     * <p>The additional information. The value success is returned if the request succeeds. Otherwise, an error code is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>C458B1E8-1683-3645-B154-6BA32080EEA</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("SuccessResponse")
    public String successResponse;

    public static ModifyEngineMigrationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyEngineMigrationResponseBody self = new ModifyEngineMigrationResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyEngineMigrationResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ModifyEngineMigrationResponseBody setData(ModifyEngineMigrationResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ModifyEngineMigrationResponseBodyData getData() {
        return this.data;
    }

    public ModifyEngineMigrationResponseBody setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ModifyEngineMigrationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ModifyEngineMigrationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyEngineMigrationResponseBody setSuccessResponse(String successResponse) {
        this.successResponse = successResponse;
        return this;
    }
    public String getSuccessResponse() {
        return this.successResponse;
    }

    public static class ModifyEngineMigrationResponseBodyData extends TeaModel {
        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>pxc-*********</p>
         */
        @NameInMap("DBInstanceName")
        public String DBInstanceName;

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>42292****</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        public static ModifyEngineMigrationResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ModifyEngineMigrationResponseBodyData self = new ModifyEngineMigrationResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ModifyEngineMigrationResponseBodyData setDBInstanceName(String DBInstanceName) {
            this.DBInstanceName = DBInstanceName;
            return this;
        }
        public String getDBInstanceName() {
            return this.DBInstanceName;
        }

        public ModifyEngineMigrationResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
