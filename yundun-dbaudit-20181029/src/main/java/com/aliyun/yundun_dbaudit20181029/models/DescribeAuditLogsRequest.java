// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20181029.models;

import com.aliyun.tea.*;

public class DescribeAuditLogsRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Sort")
    public String sort;

    @NameInMap("Dir")
    public String dir;

    @NameInMap("DbId")
    public String dbId;

    @NameInMap("QueryString")
    public String queryString;

    @NameInMap("Payload")
    public String payload;

    @NameInMap("LoginUser")
    public String loginUser;

    @NameInMap("OpType")
    public String opType;

    @NameInMap("Sip")
    public String sip;

    @NameInMap("Dip")
    public String dip;

    @NameInMap("Result")
    public String result;

    @NameInMap("Accessid")
    public String accessid;

    @NameInMap("Sessionid")
    public String sessionid;

    @NameInMap("Sqlid")
    public String sqlid;

    @NameInMap("DbType")
    public String dbType;

    @NameInMap("Sport")
    public String sport;

    @NameInMap("Dport")
    public String dport;

    @NameInMap("Smac")
    public String smac;

    @NameInMap("Dmac")
    public String dmac;

    @NameInMap("DbName")
    public String dbName;

    @NameInMap("ClientPrg")
    public String clientPrg;

    @NameInMap("HostName")
    public String hostName;

    @NameInMap("ClientUser")
    public String clientUser;

    @NameInMap("SqlLen")
    public String sqlLen;

    @NameInMap("EffectRow")
    public String effectRow;

    @NameInMap("Cost")
    public String cost;

    @NameInMap("ResultDesc")
    public String resultDesc;

    @NameInMap("DataSet")
    public String dataSet;

    @NameInMap("AlarmName")
    public String alarmName;

    @NameInMap("AlarmLevel")
    public String alarmLevel;

    public static DescribeAuditLogsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAuditLogsRequest self = new DescribeAuditLogsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAuditLogsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeAuditLogsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeAuditLogsRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeAuditLogsRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeAuditLogsRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeAuditLogsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeAuditLogsRequest setSort(String sort) {
        this.sort = sort;
        return this;
    }
    public String getSort() {
        return this.sort;
    }

    public DescribeAuditLogsRequest setDir(String dir) {
        this.dir = dir;
        return this;
    }
    public String getDir() {
        return this.dir;
    }

    public DescribeAuditLogsRequest setDbId(String dbId) {
        this.dbId = dbId;
        return this;
    }
    public String getDbId() {
        return this.dbId;
    }

    public DescribeAuditLogsRequest setQueryString(String queryString) {
        this.queryString = queryString;
        return this;
    }
    public String getQueryString() {
        return this.queryString;
    }

    public DescribeAuditLogsRequest setPayload(String payload) {
        this.payload = payload;
        return this;
    }
    public String getPayload() {
        return this.payload;
    }

    public DescribeAuditLogsRequest setLoginUser(String loginUser) {
        this.loginUser = loginUser;
        return this;
    }
    public String getLoginUser() {
        return this.loginUser;
    }

    public DescribeAuditLogsRequest setOpType(String opType) {
        this.opType = opType;
        return this;
    }
    public String getOpType() {
        return this.opType;
    }

    public DescribeAuditLogsRequest setSip(String sip) {
        this.sip = sip;
        return this;
    }
    public String getSip() {
        return this.sip;
    }

    public DescribeAuditLogsRequest setDip(String dip) {
        this.dip = dip;
        return this;
    }
    public String getDip() {
        return this.dip;
    }

    public DescribeAuditLogsRequest setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

    public DescribeAuditLogsRequest setAccessid(String accessid) {
        this.accessid = accessid;
        return this;
    }
    public String getAccessid() {
        return this.accessid;
    }

    public DescribeAuditLogsRequest setSessionid(String sessionid) {
        this.sessionid = sessionid;
        return this;
    }
    public String getSessionid() {
        return this.sessionid;
    }

    public DescribeAuditLogsRequest setSqlid(String sqlid) {
        this.sqlid = sqlid;
        return this;
    }
    public String getSqlid() {
        return this.sqlid;
    }

    public DescribeAuditLogsRequest setDbType(String dbType) {
        this.dbType = dbType;
        return this;
    }
    public String getDbType() {
        return this.dbType;
    }

    public DescribeAuditLogsRequest setSport(String sport) {
        this.sport = sport;
        return this;
    }
    public String getSport() {
        return this.sport;
    }

    public DescribeAuditLogsRequest setDport(String dport) {
        this.dport = dport;
        return this;
    }
    public String getDport() {
        return this.dport;
    }

    public DescribeAuditLogsRequest setSmac(String smac) {
        this.smac = smac;
        return this;
    }
    public String getSmac() {
        return this.smac;
    }

    public DescribeAuditLogsRequest setDmac(String dmac) {
        this.dmac = dmac;
        return this;
    }
    public String getDmac() {
        return this.dmac;
    }

    public DescribeAuditLogsRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public DescribeAuditLogsRequest setClientPrg(String clientPrg) {
        this.clientPrg = clientPrg;
        return this;
    }
    public String getClientPrg() {
        return this.clientPrg;
    }

    public DescribeAuditLogsRequest setHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }
    public String getHostName() {
        return this.hostName;
    }

    public DescribeAuditLogsRequest setClientUser(String clientUser) {
        this.clientUser = clientUser;
        return this;
    }
    public String getClientUser() {
        return this.clientUser;
    }

    public DescribeAuditLogsRequest setSqlLen(String sqlLen) {
        this.sqlLen = sqlLen;
        return this;
    }
    public String getSqlLen() {
        return this.sqlLen;
    }

    public DescribeAuditLogsRequest setEffectRow(String effectRow) {
        this.effectRow = effectRow;
        return this;
    }
    public String getEffectRow() {
        return this.effectRow;
    }

    public DescribeAuditLogsRequest setCost(String cost) {
        this.cost = cost;
        return this;
    }
    public String getCost() {
        return this.cost;
    }

    public DescribeAuditLogsRequest setResultDesc(String resultDesc) {
        this.resultDesc = resultDesc;
        return this;
    }
    public String getResultDesc() {
        return this.resultDesc;
    }

    public DescribeAuditLogsRequest setDataSet(String dataSet) {
        this.dataSet = dataSet;
        return this;
    }
    public String getDataSet() {
        return this.dataSet;
    }

    public DescribeAuditLogsRequest setAlarmName(String alarmName) {
        this.alarmName = alarmName;
        return this;
    }
    public String getAlarmName() {
        return this.alarmName;
    }

    public DescribeAuditLogsRequest setAlarmLevel(String alarmLevel) {
        this.alarmLevel = alarmLevel;
        return this;
    }
    public String getAlarmLevel() {
        return this.alarmLevel;
    }

}
