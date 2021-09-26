// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class GetLogStatisticsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("CountList")
    public java.util.List<GetLogStatisticsResponseBodyCountList> countList;

    public static GetLogStatisticsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLogStatisticsResponseBody self = new GetLogStatisticsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLogStatisticsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLogStatisticsResponseBody setCountList(java.util.List<GetLogStatisticsResponseBodyCountList> countList) {
        this.countList = countList;
        return this;
    }
    public java.util.List<GetLogStatisticsResponseBodyCountList> getCountList() {
        return this.countList;
    }

    public static class GetLogStatisticsResponseBodyCountList extends TeaModel {
        @NameInMap("SqlKeyword")
        public String sqlKeyword;

        @NameInMap("DbId")
        public Integer dbId;

        @NameInMap("DbName")
        public String dbName;

        @NameInMap("ClientProgram")
        public String clientProgram;

        @NameInMap("DbUser")
        public String dbUser;

        @NameInMap("ClientIp")
        public String clientIp;

        @NameInMap("SqlCount")
        public Long sqlCount;

        @NameInMap("RiskCount")
        public Long riskCount;

        @NameInMap("DbServer")
        public String dbServer;

        @NameInMap("SqlType")
        public String sqlType;

        public static GetLogStatisticsResponseBodyCountList build(java.util.Map<String, ?> map) throws Exception {
            GetLogStatisticsResponseBodyCountList self = new GetLogStatisticsResponseBodyCountList();
            return TeaModel.build(map, self);
        }

        public GetLogStatisticsResponseBodyCountList setSqlKeyword(String sqlKeyword) {
            this.sqlKeyword = sqlKeyword;
            return this;
        }
        public String getSqlKeyword() {
            return this.sqlKeyword;
        }

        public GetLogStatisticsResponseBodyCountList setDbId(Integer dbId) {
            this.dbId = dbId;
            return this;
        }
        public Integer getDbId() {
            return this.dbId;
        }

        public GetLogStatisticsResponseBodyCountList setDbName(String dbName) {
            this.dbName = dbName;
            return this;
        }
        public String getDbName() {
            return this.dbName;
        }

        public GetLogStatisticsResponseBodyCountList setClientProgram(String clientProgram) {
            this.clientProgram = clientProgram;
            return this;
        }
        public String getClientProgram() {
            return this.clientProgram;
        }

        public GetLogStatisticsResponseBodyCountList setDbUser(String dbUser) {
            this.dbUser = dbUser;
            return this;
        }
        public String getDbUser() {
            return this.dbUser;
        }

        public GetLogStatisticsResponseBodyCountList setClientIp(String clientIp) {
            this.clientIp = clientIp;
            return this;
        }
        public String getClientIp() {
            return this.clientIp;
        }

        public GetLogStatisticsResponseBodyCountList setSqlCount(Long sqlCount) {
            this.sqlCount = sqlCount;
            return this;
        }
        public Long getSqlCount() {
            return this.sqlCount;
        }

        public GetLogStatisticsResponseBodyCountList setRiskCount(Long riskCount) {
            this.riskCount = riskCount;
            return this;
        }
        public Long getRiskCount() {
            return this.riskCount;
        }

        public GetLogStatisticsResponseBodyCountList setDbServer(String dbServer) {
            this.dbServer = dbServer;
            return this;
        }
        public String getDbServer() {
            return this.dbServer;
        }

        public GetLogStatisticsResponseBodyCountList setSqlType(String sqlType) {
            this.sqlType = sqlType;
            return this;
        }
        public String getSqlType() {
            return this.sqlType;
        }

    }

}
