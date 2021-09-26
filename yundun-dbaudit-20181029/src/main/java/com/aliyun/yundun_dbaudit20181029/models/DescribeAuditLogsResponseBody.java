// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20181029.models;

import com.aliyun.tea.*;

public class DescribeAuditLogsResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("AuditLogs")
    public java.util.List<DescribeAuditLogsResponseBodyAuditLogs> auditLogs;

    public static DescribeAuditLogsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAuditLogsResponseBody self = new DescribeAuditLogsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAuditLogsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeAuditLogsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAuditLogsResponseBody setAuditLogs(java.util.List<DescribeAuditLogsResponseBodyAuditLogs> auditLogs) {
        this.auditLogs = auditLogs;
        return this;
    }
    public java.util.List<DescribeAuditLogsResponseBodyAuditLogs> getAuditLogs() {
        return this.auditLogs;
    }

    public static class DescribeAuditLogsResponseBodyAuditLogs extends TeaModel {
        @NameInMap("ClientUser")
        public String clientUser;

        @NameInMap("EffectRow")
        public Integer effectRow;

        @NameInMap("C5")
        public String c5;

        @NameInMap("ClientPrg")
        public String clientPrg;

        @NameInMap("Accessid")
        public String accessid;

        @NameInMap("ResultDesc")
        public String resultDesc;

        @NameInMap("SqlLen")
        public Integer sqlLen;

        @NameInMap("Payload")
        public String payload;

        @NameInMap("C4")
        public String c4;

        @NameInMap("DateTime")
        public String dateTime;

        @NameInMap("DbName")
        public String dbName;

        @NameInMap("DataSet")
        public String dataSet;

        @NameInMap("Sqlid")
        public String sqlid;

        @NameInMap("RelateIp")
        public String relateIp;

        @NameInMap("AlarmLevel")
        public Integer alarmLevel;

        @NameInMap("C2")
        public String c2;

        @NameInMap("Dip")
        public String dip;

        @NameInMap("Result")
        public Integer result;

        @NameInMap("Cost")
        public Integer cost;

        @NameInMap("RelateUser")
        public String relateUser;

        @NameInMap("Sip")
        public String sip;

        @NameInMap("C3")
        public String c3;

        @NameInMap("HostName")
        public String hostName;

        @NameInMap("AlarmName")
        public String alarmName;

        @NameInMap("PickIp")
        public String pickIp;

        @NameInMap("RelateInfo")
        public String relateInfo;

        @NameInMap("PickUser")
        public String pickUser;

        @NameInMap("OpType")
        public String opType;

        @NameInMap("Sport")
        public Integer sport;

        @NameInMap("DataSetSize")
        public Integer dataSetSize;

        @NameInMap("DbType")
        public String dbType;

        @NameInMap("AlarmFlag")
        public Integer alarmFlag;

        @NameInMap("Smac")
        public Integer smac;

        @NameInMap("Dport")
        public Integer dport;

        @NameInMap("C1")
        public String c1;

        @NameInMap("Dmac")
        public Integer dmac;

        @NameInMap("LoginUser")
        public String loginUser;

        @NameInMap("Sessionid")
        public String sessionid;

        public static DescribeAuditLogsResponseBodyAuditLogs build(java.util.Map<String, ?> map) throws Exception {
            DescribeAuditLogsResponseBodyAuditLogs self = new DescribeAuditLogsResponseBodyAuditLogs();
            return TeaModel.build(map, self);
        }

        public DescribeAuditLogsResponseBodyAuditLogs setClientUser(String clientUser) {
            this.clientUser = clientUser;
            return this;
        }
        public String getClientUser() {
            return this.clientUser;
        }

        public DescribeAuditLogsResponseBodyAuditLogs setEffectRow(Integer effectRow) {
            this.effectRow = effectRow;
            return this;
        }
        public Integer getEffectRow() {
            return this.effectRow;
        }

        public DescribeAuditLogsResponseBodyAuditLogs setC5(String c5) {
            this.c5 = c5;
            return this;
        }
        public String getC5() {
            return this.c5;
        }

        public DescribeAuditLogsResponseBodyAuditLogs setClientPrg(String clientPrg) {
            this.clientPrg = clientPrg;
            return this;
        }
        public String getClientPrg() {
            return this.clientPrg;
        }

        public DescribeAuditLogsResponseBodyAuditLogs setAccessid(String accessid) {
            this.accessid = accessid;
            return this;
        }
        public String getAccessid() {
            return this.accessid;
        }

        public DescribeAuditLogsResponseBodyAuditLogs setResultDesc(String resultDesc) {
            this.resultDesc = resultDesc;
            return this;
        }
        public String getResultDesc() {
            return this.resultDesc;
        }

        public DescribeAuditLogsResponseBodyAuditLogs setSqlLen(Integer sqlLen) {
            this.sqlLen = sqlLen;
            return this;
        }
        public Integer getSqlLen() {
            return this.sqlLen;
        }

        public DescribeAuditLogsResponseBodyAuditLogs setPayload(String payload) {
            this.payload = payload;
            return this;
        }
        public String getPayload() {
            return this.payload;
        }

        public DescribeAuditLogsResponseBodyAuditLogs setC4(String c4) {
            this.c4 = c4;
            return this;
        }
        public String getC4() {
            return this.c4;
        }

        public DescribeAuditLogsResponseBodyAuditLogs setDateTime(String dateTime) {
            this.dateTime = dateTime;
            return this;
        }
        public String getDateTime() {
            return this.dateTime;
        }

        public DescribeAuditLogsResponseBodyAuditLogs setDbName(String dbName) {
            this.dbName = dbName;
            return this;
        }
        public String getDbName() {
            return this.dbName;
        }

        public DescribeAuditLogsResponseBodyAuditLogs setDataSet(String dataSet) {
            this.dataSet = dataSet;
            return this;
        }
        public String getDataSet() {
            return this.dataSet;
        }

        public DescribeAuditLogsResponseBodyAuditLogs setSqlid(String sqlid) {
            this.sqlid = sqlid;
            return this;
        }
        public String getSqlid() {
            return this.sqlid;
        }

        public DescribeAuditLogsResponseBodyAuditLogs setRelateIp(String relateIp) {
            this.relateIp = relateIp;
            return this;
        }
        public String getRelateIp() {
            return this.relateIp;
        }

        public DescribeAuditLogsResponseBodyAuditLogs setAlarmLevel(Integer alarmLevel) {
            this.alarmLevel = alarmLevel;
            return this;
        }
        public Integer getAlarmLevel() {
            return this.alarmLevel;
        }

        public DescribeAuditLogsResponseBodyAuditLogs setC2(String c2) {
            this.c2 = c2;
            return this;
        }
        public String getC2() {
            return this.c2;
        }

        public DescribeAuditLogsResponseBodyAuditLogs setDip(String dip) {
            this.dip = dip;
            return this;
        }
        public String getDip() {
            return this.dip;
        }

        public DescribeAuditLogsResponseBodyAuditLogs setResult(Integer result) {
            this.result = result;
            return this;
        }
        public Integer getResult() {
            return this.result;
        }

        public DescribeAuditLogsResponseBodyAuditLogs setCost(Integer cost) {
            this.cost = cost;
            return this;
        }
        public Integer getCost() {
            return this.cost;
        }

        public DescribeAuditLogsResponseBodyAuditLogs setRelateUser(String relateUser) {
            this.relateUser = relateUser;
            return this;
        }
        public String getRelateUser() {
            return this.relateUser;
        }

        public DescribeAuditLogsResponseBodyAuditLogs setSip(String sip) {
            this.sip = sip;
            return this;
        }
        public String getSip() {
            return this.sip;
        }

        public DescribeAuditLogsResponseBodyAuditLogs setC3(String c3) {
            this.c3 = c3;
            return this;
        }
        public String getC3() {
            return this.c3;
        }

        public DescribeAuditLogsResponseBodyAuditLogs setHostName(String hostName) {
            this.hostName = hostName;
            return this;
        }
        public String getHostName() {
            return this.hostName;
        }

        public DescribeAuditLogsResponseBodyAuditLogs setAlarmName(String alarmName) {
            this.alarmName = alarmName;
            return this;
        }
        public String getAlarmName() {
            return this.alarmName;
        }

        public DescribeAuditLogsResponseBodyAuditLogs setPickIp(String pickIp) {
            this.pickIp = pickIp;
            return this;
        }
        public String getPickIp() {
            return this.pickIp;
        }

        public DescribeAuditLogsResponseBodyAuditLogs setRelateInfo(String relateInfo) {
            this.relateInfo = relateInfo;
            return this;
        }
        public String getRelateInfo() {
            return this.relateInfo;
        }

        public DescribeAuditLogsResponseBodyAuditLogs setPickUser(String pickUser) {
            this.pickUser = pickUser;
            return this;
        }
        public String getPickUser() {
            return this.pickUser;
        }

        public DescribeAuditLogsResponseBodyAuditLogs setOpType(String opType) {
            this.opType = opType;
            return this;
        }
        public String getOpType() {
            return this.opType;
        }

        public DescribeAuditLogsResponseBodyAuditLogs setSport(Integer sport) {
            this.sport = sport;
            return this;
        }
        public Integer getSport() {
            return this.sport;
        }

        public DescribeAuditLogsResponseBodyAuditLogs setDataSetSize(Integer dataSetSize) {
            this.dataSetSize = dataSetSize;
            return this;
        }
        public Integer getDataSetSize() {
            return this.dataSetSize;
        }

        public DescribeAuditLogsResponseBodyAuditLogs setDbType(String dbType) {
            this.dbType = dbType;
            return this;
        }
        public String getDbType() {
            return this.dbType;
        }

        public DescribeAuditLogsResponseBodyAuditLogs setAlarmFlag(Integer alarmFlag) {
            this.alarmFlag = alarmFlag;
            return this;
        }
        public Integer getAlarmFlag() {
            return this.alarmFlag;
        }

        public DescribeAuditLogsResponseBodyAuditLogs setSmac(Integer smac) {
            this.smac = smac;
            return this;
        }
        public Integer getSmac() {
            return this.smac;
        }

        public DescribeAuditLogsResponseBodyAuditLogs setDport(Integer dport) {
            this.dport = dport;
            return this;
        }
        public Integer getDport() {
            return this.dport;
        }

        public DescribeAuditLogsResponseBodyAuditLogs setC1(String c1) {
            this.c1 = c1;
            return this;
        }
        public String getC1() {
            return this.c1;
        }

        public DescribeAuditLogsResponseBodyAuditLogs setDmac(Integer dmac) {
            this.dmac = dmac;
            return this;
        }
        public Integer getDmac() {
            return this.dmac;
        }

        public DescribeAuditLogsResponseBodyAuditLogs setLoginUser(String loginUser) {
            this.loginUser = loginUser;
            return this;
        }
        public String getLoginUser() {
            return this.loginUser;
        }

        public DescribeAuditLogsResponseBodyAuditLogs setSessionid(String sessionid) {
            this.sessionid = sessionid;
            return this;
        }
        public String getSessionid() {
            return this.sessionid;
        }

    }

}
