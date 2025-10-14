// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class CloseEngineMigrationResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CloseEngineMigrationResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public String httpStatusCode;

    /**
     * <strong>example:</strong>
     * <hr>
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
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("SuccessResponse")
    public String successResponse;

    public static CloseEngineMigrationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CloseEngineMigrationResponseBody self = new CloseEngineMigrationResponseBody();
        return TeaModel.build(map, self);
    }

    public CloseEngineMigrationResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CloseEngineMigrationResponseBody setData(CloseEngineMigrationResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CloseEngineMigrationResponseBodyData getData() {
        return this.data;
    }

    public CloseEngineMigrationResponseBody setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public CloseEngineMigrationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CloseEngineMigrationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CloseEngineMigrationResponseBody setSuccessResponse(String successResponse) {
        this.successResponse = successResponse;
        return this;
    }
    public String getSuccessResponse() {
        return this.successResponse;
    }

    public static class CloseEngineMigrationResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>pxc-hzjasd****</p>
         */
        @NameInMap("DBInstanceName")
        public String DBInstanceName;

        /**
         * <strong>example:</strong>
         * <p>2209883</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        public static CloseEngineMigrationResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CloseEngineMigrationResponseBodyData self = new CloseEngineMigrationResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CloseEngineMigrationResponseBodyData setDBInstanceName(String DBInstanceName) {
            this.DBInstanceName = DBInstanceName;
            return this;
        }
        public String getDBInstanceName() {
            return this.DBInstanceName;
        }

        public CloseEngineMigrationResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
