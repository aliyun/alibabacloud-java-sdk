// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class KillProcessListResponseBody extends TeaModel {
    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public java.util.List<KillProcessListResponseBodyData> data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>EE205C00-30E4-XXXX-XXXX-87E3A8A2AA0C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static KillProcessListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        KillProcessListResponseBody self = new KillProcessListResponseBody();
        return TeaModel.build(map, self);
    }

    public KillProcessListResponseBody setData(java.util.List<KillProcessListResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<KillProcessListResponseBodyData> getData() {
        return this.data;
    }

    public KillProcessListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class KillProcessListResponseBodyData extends TeaModel {
        /**
         * <p>The client IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>127.0.0.1</p>
         */
        @NameInMap("ClientIp")
        public String clientIp;

        /**
         * <p>The start command for the container of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>select 1</p>
         */
        @NameInMap("Command")
        public String command;

        /**
         * <p>The name of the database.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Database")
        public String database;

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>Instance not found.</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>Execution time (UTC+8). If it is left empty, it means to execute immediately.</p>
         * 
         * <strong>example:</strong>
         * <p>142</p>
         */
        @NameInMap("ExecuteTime")
        public String executeTime;

        /**
         * <p>The IP address of the server.</p>
         * 
         * <strong>example:</strong>
         * <p>127.0.0.1</p>
         */
        @NameInMap("ServerIp")
        public String serverIp;

        /**
         * <p>The ID of the session.</p>
         * 
         * <strong>example:</strong>
         * <p>1123</p>
         */
        @NameInMap("SessionId")
        public Long sessionId;

        /**
         * <p>The SQL statement.</p>
         * 
         * <strong>example:</strong>
         * <p>:</p>
         */
        @NameInMap("SqlText")
        public String sqlText;

        /**
         * <p>The status of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>SLEEP</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The ID of the tenant.</p>
         * 
         * <strong>example:</strong>
         * <p>t3ogqv07a56n4</p>
         */
        @NameInMap("TenantId")
        public String tenantId;

        /**
         * <p>The database username.</p>
         * 
         * <strong>example:</strong>
         * <p>oas</p>
         */
        @NameInMap("User")
        public String user;

        public static KillProcessListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            KillProcessListResponseBodyData self = new KillProcessListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public KillProcessListResponseBodyData setClientIp(String clientIp) {
            this.clientIp = clientIp;
            return this;
        }
        public String getClientIp() {
            return this.clientIp;
        }

        public KillProcessListResponseBodyData setCommand(String command) {
            this.command = command;
            return this;
        }
        public String getCommand() {
            return this.command;
        }

        public KillProcessListResponseBodyData setDatabase(String database) {
            this.database = database;
            return this;
        }
        public String getDatabase() {
            return this.database;
        }

        public KillProcessListResponseBodyData setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public KillProcessListResponseBodyData setExecuteTime(String executeTime) {
            this.executeTime = executeTime;
            return this;
        }
        public String getExecuteTime() {
            return this.executeTime;
        }

        public KillProcessListResponseBodyData setServerIp(String serverIp) {
            this.serverIp = serverIp;
            return this;
        }
        public String getServerIp() {
            return this.serverIp;
        }

        public KillProcessListResponseBodyData setSessionId(Long sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public Long getSessionId() {
            return this.sessionId;
        }

        public KillProcessListResponseBodyData setSqlText(String sqlText) {
            this.sqlText = sqlText;
            return this;
        }
        public String getSqlText() {
            return this.sqlText;
        }

        public KillProcessListResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public KillProcessListResponseBodyData setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public KillProcessListResponseBodyData setUser(String user) {
            this.user = user;
            return this;
        }
        public String getUser() {
            return this.user;
        }

    }

}
