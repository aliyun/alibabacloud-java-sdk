// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20181029.models;

import com.aliyun.tea.*;

public class DescribeSessionLogsResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SessionLogs")
    public java.util.List<DescribeSessionLogsResponseBodySessionLogs> sessionLogs;

    public static DescribeSessionLogsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSessionLogsResponseBody self = new DescribeSessionLogsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSessionLogsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeSessionLogsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSessionLogsResponseBody setSessionLogs(java.util.List<DescribeSessionLogsResponseBodySessionLogs> sessionLogs) {
        this.sessionLogs = sessionLogs;
        return this;
    }
    public java.util.List<DescribeSessionLogsResponseBodySessionLogs> getSessionLogs() {
        return this.sessionLogs;
    }

    public static class DescribeSessionLogsResponseBodySessionLogs extends TeaModel {
        @NameInMap("ClientUser")
        public String clientUser;

        @NameInMap("SessionStatus")
        public Integer sessionStatus;

        @NameInMap("C5")
        public String c5;

        @NameInMap("ClientPrg")
        public String clientPrg;

        @NameInMap("Accessid")
        public String accessid;

        @NameInMap("C4")
        public String c4;

        @NameInMap("DbName")
        public String dbName;

        @NameInMap("RequestFlow")
        public Integer requestFlow;

        @NameInMap("ProCon")
        public Integer proCon;

        @NameInMap("C2")
        public String c2;

        @NameInMap("Dip")
        public String dip;

        @NameInMap("Sip")
        public String sip;

        @NameInMap("C3")
        public String c3;

        @NameInMap("HostName")
        public String hostName;

        @NameInMap("ResponseFlow")
        public Integer responseFlow;

        @NameInMap("Encode")
        public String encode;

        @NameInMap("NormalEnd")
        public Integer normalEnd;

        @NameInMap("EndTime")
        public Integer endTime;

        @NameInMap("Sport")
        public Integer sport;

        @NameInMap("StartTime")
        public Integer startTime;

        @NameInMap("DbType")
        public String dbType;

        @NameInMap("StrInfo")
        public String strInfo;

        @NameInMap("SqlCount")
        public Integer sqlCount;

        @NameInMap("Smac")
        public Integer smac;

        @NameInMap("Dport")
        public Integer dport;

        @NameInMap("Dmac")
        public Integer dmac;

        @NameInMap("C1")
        public String c1;

        @NameInMap("LoginUser")
        public String loginUser;

        @NameInMap("Sessionid")
        public String sessionid;

        public static DescribeSessionLogsResponseBodySessionLogs build(java.util.Map<String, ?> map) throws Exception {
            DescribeSessionLogsResponseBodySessionLogs self = new DescribeSessionLogsResponseBodySessionLogs();
            return TeaModel.build(map, self);
        }

        public DescribeSessionLogsResponseBodySessionLogs setClientUser(String clientUser) {
            this.clientUser = clientUser;
            return this;
        }
        public String getClientUser() {
            return this.clientUser;
        }

        public DescribeSessionLogsResponseBodySessionLogs setSessionStatus(Integer sessionStatus) {
            this.sessionStatus = sessionStatus;
            return this;
        }
        public Integer getSessionStatus() {
            return this.sessionStatus;
        }

        public DescribeSessionLogsResponseBodySessionLogs setC5(String c5) {
            this.c5 = c5;
            return this;
        }
        public String getC5() {
            return this.c5;
        }

        public DescribeSessionLogsResponseBodySessionLogs setClientPrg(String clientPrg) {
            this.clientPrg = clientPrg;
            return this;
        }
        public String getClientPrg() {
            return this.clientPrg;
        }

        public DescribeSessionLogsResponseBodySessionLogs setAccessid(String accessid) {
            this.accessid = accessid;
            return this;
        }
        public String getAccessid() {
            return this.accessid;
        }

        public DescribeSessionLogsResponseBodySessionLogs setC4(String c4) {
            this.c4 = c4;
            return this;
        }
        public String getC4() {
            return this.c4;
        }

        public DescribeSessionLogsResponseBodySessionLogs setDbName(String dbName) {
            this.dbName = dbName;
            return this;
        }
        public String getDbName() {
            return this.dbName;
        }

        public DescribeSessionLogsResponseBodySessionLogs setRequestFlow(Integer requestFlow) {
            this.requestFlow = requestFlow;
            return this;
        }
        public Integer getRequestFlow() {
            return this.requestFlow;
        }

        public DescribeSessionLogsResponseBodySessionLogs setProCon(Integer proCon) {
            this.proCon = proCon;
            return this;
        }
        public Integer getProCon() {
            return this.proCon;
        }

        public DescribeSessionLogsResponseBodySessionLogs setC2(String c2) {
            this.c2 = c2;
            return this;
        }
        public String getC2() {
            return this.c2;
        }

        public DescribeSessionLogsResponseBodySessionLogs setDip(String dip) {
            this.dip = dip;
            return this;
        }
        public String getDip() {
            return this.dip;
        }

        public DescribeSessionLogsResponseBodySessionLogs setSip(String sip) {
            this.sip = sip;
            return this;
        }
        public String getSip() {
            return this.sip;
        }

        public DescribeSessionLogsResponseBodySessionLogs setC3(String c3) {
            this.c3 = c3;
            return this;
        }
        public String getC3() {
            return this.c3;
        }

        public DescribeSessionLogsResponseBodySessionLogs setHostName(String hostName) {
            this.hostName = hostName;
            return this;
        }
        public String getHostName() {
            return this.hostName;
        }

        public DescribeSessionLogsResponseBodySessionLogs setResponseFlow(Integer responseFlow) {
            this.responseFlow = responseFlow;
            return this;
        }
        public Integer getResponseFlow() {
            return this.responseFlow;
        }

        public DescribeSessionLogsResponseBodySessionLogs setEncode(String encode) {
            this.encode = encode;
            return this;
        }
        public String getEncode() {
            return this.encode;
        }

        public DescribeSessionLogsResponseBodySessionLogs setNormalEnd(Integer normalEnd) {
            this.normalEnd = normalEnd;
            return this;
        }
        public Integer getNormalEnd() {
            return this.normalEnd;
        }

        public DescribeSessionLogsResponseBodySessionLogs setEndTime(Integer endTime) {
            this.endTime = endTime;
            return this;
        }
        public Integer getEndTime() {
            return this.endTime;
        }

        public DescribeSessionLogsResponseBodySessionLogs setSport(Integer sport) {
            this.sport = sport;
            return this;
        }
        public Integer getSport() {
            return this.sport;
        }

        public DescribeSessionLogsResponseBodySessionLogs setStartTime(Integer startTime) {
            this.startTime = startTime;
            return this;
        }
        public Integer getStartTime() {
            return this.startTime;
        }

        public DescribeSessionLogsResponseBodySessionLogs setDbType(String dbType) {
            this.dbType = dbType;
            return this;
        }
        public String getDbType() {
            return this.dbType;
        }

        public DescribeSessionLogsResponseBodySessionLogs setStrInfo(String strInfo) {
            this.strInfo = strInfo;
            return this;
        }
        public String getStrInfo() {
            return this.strInfo;
        }

        public DescribeSessionLogsResponseBodySessionLogs setSqlCount(Integer sqlCount) {
            this.sqlCount = sqlCount;
            return this;
        }
        public Integer getSqlCount() {
            return this.sqlCount;
        }

        public DescribeSessionLogsResponseBodySessionLogs setSmac(Integer smac) {
            this.smac = smac;
            return this;
        }
        public Integer getSmac() {
            return this.smac;
        }

        public DescribeSessionLogsResponseBodySessionLogs setDport(Integer dport) {
            this.dport = dport;
            return this;
        }
        public Integer getDport() {
            return this.dport;
        }

        public DescribeSessionLogsResponseBodySessionLogs setDmac(Integer dmac) {
            this.dmac = dmac;
            return this;
        }
        public Integer getDmac() {
            return this.dmac;
        }

        public DescribeSessionLogsResponseBodySessionLogs setC1(String c1) {
            this.c1 = c1;
            return this;
        }
        public String getC1() {
            return this.c1;
        }

        public DescribeSessionLogsResponseBodySessionLogs setLoginUser(String loginUser) {
            this.loginUser = loginUser;
            return this;
        }
        public String getLoginUser() {
            return this.loginUser;
        }

        public DescribeSessionLogsResponseBodySessionLogs setSessionid(String sessionid) {
            this.sessionid = sessionid;
            return this;
        }
        public String getSessionid() {
            return this.sessionid;
        }

    }

}
