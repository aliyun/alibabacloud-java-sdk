// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20181029.models;

import com.aliyun.tea.*;

public class DescribeSessionLogsRequest extends TeaModel {
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

    @NameInMap("Sip")
    public String sip;

    @NameInMap("Sport")
    public String sport;

    @NameInMap("LoginUser")
    public String loginUser;

    @NameInMap("Dip")
    public String dip;

    @NameInMap("Dport")
    public String dport;

    @NameInMap("Sessionid")
    public String sessionid;

    @NameInMap("DbType")
    public String dbType;

    @NameInMap("Smac")
    public String smac;

    @NameInMap("Dmac")
    public String dmac;

    @NameInMap("ClientPrg")
    public String clientPrg;

    @NameInMap("HostName")
    public String hostName;

    @NameInMap("ClientUser")
    public String clientUser;

    @NameInMap("DbName")
    public String dbName;

    @NameInMap("SessionStatus")
    public String sessionStatus;

    @NameInMap("SqlCount")
    public String sqlCount;

    @NameInMap("ReqFlow")
    public String reqFlow;

    @NameInMap("RspFlow")
    public String rspFlow;

    public static DescribeSessionLogsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSessionLogsRequest self = new DescribeSessionLogsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSessionLogsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeSessionLogsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeSessionLogsRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeSessionLogsRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeSessionLogsRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeSessionLogsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeSessionLogsRequest setSort(String sort) {
        this.sort = sort;
        return this;
    }
    public String getSort() {
        return this.sort;
    }

    public DescribeSessionLogsRequest setDir(String dir) {
        this.dir = dir;
        return this;
    }
    public String getDir() {
        return this.dir;
    }

    public DescribeSessionLogsRequest setDbId(String dbId) {
        this.dbId = dbId;
        return this;
    }
    public String getDbId() {
        return this.dbId;
    }

    public DescribeSessionLogsRequest setSip(String sip) {
        this.sip = sip;
        return this;
    }
    public String getSip() {
        return this.sip;
    }

    public DescribeSessionLogsRequest setSport(String sport) {
        this.sport = sport;
        return this;
    }
    public String getSport() {
        return this.sport;
    }

    public DescribeSessionLogsRequest setLoginUser(String loginUser) {
        this.loginUser = loginUser;
        return this;
    }
    public String getLoginUser() {
        return this.loginUser;
    }

    public DescribeSessionLogsRequest setDip(String dip) {
        this.dip = dip;
        return this;
    }
    public String getDip() {
        return this.dip;
    }

    public DescribeSessionLogsRequest setDport(String dport) {
        this.dport = dport;
        return this;
    }
    public String getDport() {
        return this.dport;
    }

    public DescribeSessionLogsRequest setSessionid(String sessionid) {
        this.sessionid = sessionid;
        return this;
    }
    public String getSessionid() {
        return this.sessionid;
    }

    public DescribeSessionLogsRequest setDbType(String dbType) {
        this.dbType = dbType;
        return this;
    }
    public String getDbType() {
        return this.dbType;
    }

    public DescribeSessionLogsRequest setSmac(String smac) {
        this.smac = smac;
        return this;
    }
    public String getSmac() {
        return this.smac;
    }

    public DescribeSessionLogsRequest setDmac(String dmac) {
        this.dmac = dmac;
        return this;
    }
    public String getDmac() {
        return this.dmac;
    }

    public DescribeSessionLogsRequest setClientPrg(String clientPrg) {
        this.clientPrg = clientPrg;
        return this;
    }
    public String getClientPrg() {
        return this.clientPrg;
    }

    public DescribeSessionLogsRequest setHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }
    public String getHostName() {
        return this.hostName;
    }

    public DescribeSessionLogsRequest setClientUser(String clientUser) {
        this.clientUser = clientUser;
        return this;
    }
    public String getClientUser() {
        return this.clientUser;
    }

    public DescribeSessionLogsRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public DescribeSessionLogsRequest setSessionStatus(String sessionStatus) {
        this.sessionStatus = sessionStatus;
        return this;
    }
    public String getSessionStatus() {
        return this.sessionStatus;
    }

    public DescribeSessionLogsRequest setSqlCount(String sqlCount) {
        this.sqlCount = sqlCount;
        return this;
    }
    public String getSqlCount() {
        return this.sqlCount;
    }

    public DescribeSessionLogsRequest setReqFlow(String reqFlow) {
        this.reqFlow = reqFlow;
        return this;
    }
    public String getReqFlow() {
        return this.reqFlow;
    }

    public DescribeSessionLogsRequest setRspFlow(String rspFlow) {
        this.rspFlow = rspFlow;
        return this;
    }
    public String getRspFlow() {
        return this.rspFlow;
    }

}
