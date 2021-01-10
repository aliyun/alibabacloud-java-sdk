// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryODPSchemasConnPropsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Data")
    public QueryODPSchemasConnPropsResponseBodyData data;

    public static QueryODPSchemasConnPropsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryODPSchemasConnPropsResponseBody self = new QueryODPSchemasConnPropsResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryODPSchemasConnPropsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryODPSchemasConnPropsResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryODPSchemasConnPropsResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryODPSchemasConnPropsResponseBody setData(QueryODPSchemasConnPropsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryODPSchemasConnPropsResponseBodyData getData() {
        return this.data;
    }

    public static class QueryODPSchemasConnPropsResponseBodyData extends TeaModel {
        @NameInMap("AllowMinPoolTimeout")
        public Boolean allowMinPoolTimeout;

        @NameInMap("BackgroundValidation")
        public Boolean backgroundValidation;

        @NameInMap("BackgroundValidationMinutes")
        public Long backgroundValidationMinutes;

        @NameInMap("BlockingTimeoutMillis")
        public Long blockingTimeoutMillis;

        @NameInMap("IdleTimeoutMinutes")
        public Long idleTimeoutMinutes;

        @NameInMap("MaxConn")
        public Long maxConn;

        @NameInMap("MinConn")
        public Long minConn;

        @NameInMap("NewConnectionSql")
        public String newConnectionSql;

        @NameInMap("Others")
        public String others;

        @NameInMap("Prefill")
        public Boolean prefill;

        @NameInMap("QueryTimeout")
        public Long queryTimeout;

        @NameInMap("TestOnBorrow")
        public Boolean testOnBorrow;

        @NameInMap("ValidationQuery")
        public String validationQuery;

        @NameInMap("ValidationQueryTimeout")
        public Long validationQueryTimeout;

        public static QueryODPSchemasConnPropsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryODPSchemasConnPropsResponseBodyData self = new QueryODPSchemasConnPropsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryODPSchemasConnPropsResponseBodyData setAllowMinPoolTimeout(Boolean allowMinPoolTimeout) {
            this.allowMinPoolTimeout = allowMinPoolTimeout;
            return this;
        }
        public Boolean getAllowMinPoolTimeout() {
            return this.allowMinPoolTimeout;
        }

        public QueryODPSchemasConnPropsResponseBodyData setBackgroundValidation(Boolean backgroundValidation) {
            this.backgroundValidation = backgroundValidation;
            return this;
        }
        public Boolean getBackgroundValidation() {
            return this.backgroundValidation;
        }

        public QueryODPSchemasConnPropsResponseBodyData setBackgroundValidationMinutes(Long backgroundValidationMinutes) {
            this.backgroundValidationMinutes = backgroundValidationMinutes;
            return this;
        }
        public Long getBackgroundValidationMinutes() {
            return this.backgroundValidationMinutes;
        }

        public QueryODPSchemasConnPropsResponseBodyData setBlockingTimeoutMillis(Long blockingTimeoutMillis) {
            this.blockingTimeoutMillis = blockingTimeoutMillis;
            return this;
        }
        public Long getBlockingTimeoutMillis() {
            return this.blockingTimeoutMillis;
        }

        public QueryODPSchemasConnPropsResponseBodyData setIdleTimeoutMinutes(Long idleTimeoutMinutes) {
            this.idleTimeoutMinutes = idleTimeoutMinutes;
            return this;
        }
        public Long getIdleTimeoutMinutes() {
            return this.idleTimeoutMinutes;
        }

        public QueryODPSchemasConnPropsResponseBodyData setMaxConn(Long maxConn) {
            this.maxConn = maxConn;
            return this;
        }
        public Long getMaxConn() {
            return this.maxConn;
        }

        public QueryODPSchemasConnPropsResponseBodyData setMinConn(Long minConn) {
            this.minConn = minConn;
            return this;
        }
        public Long getMinConn() {
            return this.minConn;
        }

        public QueryODPSchemasConnPropsResponseBodyData setNewConnectionSql(String newConnectionSql) {
            this.newConnectionSql = newConnectionSql;
            return this;
        }
        public String getNewConnectionSql() {
            return this.newConnectionSql;
        }

        public QueryODPSchemasConnPropsResponseBodyData setOthers(String others) {
            this.others = others;
            return this;
        }
        public String getOthers() {
            return this.others;
        }

        public QueryODPSchemasConnPropsResponseBodyData setPrefill(Boolean prefill) {
            this.prefill = prefill;
            return this;
        }
        public Boolean getPrefill() {
            return this.prefill;
        }

        public QueryODPSchemasConnPropsResponseBodyData setQueryTimeout(Long queryTimeout) {
            this.queryTimeout = queryTimeout;
            return this;
        }
        public Long getQueryTimeout() {
            return this.queryTimeout;
        }

        public QueryODPSchemasConnPropsResponseBodyData setTestOnBorrow(Boolean testOnBorrow) {
            this.testOnBorrow = testOnBorrow;
            return this;
        }
        public Boolean getTestOnBorrow() {
            return this.testOnBorrow;
        }

        public QueryODPSchemasConnPropsResponseBodyData setValidationQuery(String validationQuery) {
            this.validationQuery = validationQuery;
            return this;
        }
        public String getValidationQuery() {
            return this.validationQuery;
        }

        public QueryODPSchemasConnPropsResponseBodyData setValidationQueryTimeout(Long validationQueryTimeout) {
            this.validationQueryTimeout = validationQueryTimeout;
            return this;
        }
        public Long getValidationQueryTimeout() {
            return this.validationQueryTimeout;
        }

    }

}
