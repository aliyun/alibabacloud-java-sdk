// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class GetLogTopStatisticsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("CountList")
    public java.util.List<GetLogTopStatisticsResponseBodyCountList> countList;

    public static GetLogTopStatisticsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLogTopStatisticsResponseBody self = new GetLogTopStatisticsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLogTopStatisticsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLogTopStatisticsResponseBody setCountList(java.util.List<GetLogTopStatisticsResponseBodyCountList> countList) {
        this.countList = countList;
        return this;
    }
    public java.util.List<GetLogTopStatisticsResponseBodyCountList> getCountList() {
        return this.countList;
    }

    public static class GetLogTopStatisticsResponseBodyCountList extends TeaModel {
        @NameInMap("ClientIp")
        public String clientIp;

        @NameInMap("DbUser")
        public String dbUser;

        @NameInMap("SqlCount")
        public Long sqlCount;

        @NameInMap("ClientProgram")
        public String clientProgram;

        public static GetLogTopStatisticsResponseBodyCountList build(java.util.Map<String, ?> map) throws Exception {
            GetLogTopStatisticsResponseBodyCountList self = new GetLogTopStatisticsResponseBodyCountList();
            return TeaModel.build(map, self);
        }

        public GetLogTopStatisticsResponseBodyCountList setClientIp(String clientIp) {
            this.clientIp = clientIp;
            return this;
        }
        public String getClientIp() {
            return this.clientIp;
        }

        public GetLogTopStatisticsResponseBodyCountList setDbUser(String dbUser) {
            this.dbUser = dbUser;
            return this;
        }
        public String getDbUser() {
            return this.dbUser;
        }

        public GetLogTopStatisticsResponseBodyCountList setSqlCount(Long sqlCount) {
            this.sqlCount = sqlCount;
            return this;
        }
        public Long getSqlCount() {
            return this.sqlCount;
        }

        public GetLogTopStatisticsResponseBodyCountList setClientProgram(String clientProgram) {
            this.clientProgram = clientProgram;
            return this;
        }
        public String getClientProgram() {
            return this.clientProgram;
        }

    }

}
