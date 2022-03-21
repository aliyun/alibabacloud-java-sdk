// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeSqlAuditsRequest extends TeaModel {
    // 客户端IP
    @NameInMap("ClientIp")
    public String clientIp;

    // 数据库
    @NameInMap("DbName")
    public String dbName;

    // 结束时间
    @NameInMap("EndTime")
    public String endTime;

    // 执行耗时最大值
    @NameInMap("ExecuteTimeMax")
    public Long executeTimeMax;

    // 执行耗时最小值
    @NameInMap("ExecuteTimeMin")
    public Long executeTimeMin;

    @NameInMap("InstanceId")
    public String instanceId;

    // 返回的SQL文本是否需要脱敏
    @NameInMap("NeedMasking")
    public Boolean needMasking;

    // 节点，用逗号分隔
    @NameInMap("NodeIp")
    public String nodeIp;

    // 操作类型，用逗号分隔
    @NameInMap("OperatorType")
    public String operatorType;

    // 分页页码
    @NameInMap("PageNumber")
    public Long pageNumber;

    // 分页大小
    @NameInMap("PageSize")
    public Long pageSize;

    // 扫描记录数最大值
    @NameInMap("ScanRowsMax")
    public Long scanRowsMax;

    // 扫描记录数最小值
    @NameInMap("ScanRowsMin")
    public Long scanRowsMin;

    // 关键词
    @NameInMap("SearchKeyWord")
    public String searchKeyWord;

    // 关键词关系 and/or
    @NameInMap("SearchKeyWordMethod")
    public String searchKeyWordMethod;

    // 开始时间
    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("TenantId")
    public String tenantId;

    // 用户名
    @NameInMap("UserName")
    public String userName;

    public static DescribeSqlAuditsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSqlAuditsRequest self = new DescribeSqlAuditsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSqlAuditsRequest setClientIp(String clientIp) {
        this.clientIp = clientIp;
        return this;
    }
    public String getClientIp() {
        return this.clientIp;
    }

    public DescribeSqlAuditsRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public DescribeSqlAuditsRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeSqlAuditsRequest setExecuteTimeMax(Long executeTimeMax) {
        this.executeTimeMax = executeTimeMax;
        return this;
    }
    public Long getExecuteTimeMax() {
        return this.executeTimeMax;
    }

    public DescribeSqlAuditsRequest setExecuteTimeMin(Long executeTimeMin) {
        this.executeTimeMin = executeTimeMin;
        return this;
    }
    public Long getExecuteTimeMin() {
        return this.executeTimeMin;
    }

    public DescribeSqlAuditsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeSqlAuditsRequest setNeedMasking(Boolean needMasking) {
        this.needMasking = needMasking;
        return this;
    }
    public Boolean getNeedMasking() {
        return this.needMasking;
    }

    public DescribeSqlAuditsRequest setNodeIp(String nodeIp) {
        this.nodeIp = nodeIp;
        return this;
    }
    public String getNodeIp() {
        return this.nodeIp;
    }

    public DescribeSqlAuditsRequest setOperatorType(String operatorType) {
        this.operatorType = operatorType;
        return this;
    }
    public String getOperatorType() {
        return this.operatorType;
    }

    public DescribeSqlAuditsRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribeSqlAuditsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeSqlAuditsRequest setScanRowsMax(Long scanRowsMax) {
        this.scanRowsMax = scanRowsMax;
        return this;
    }
    public Long getScanRowsMax() {
        return this.scanRowsMax;
    }

    public DescribeSqlAuditsRequest setScanRowsMin(Long scanRowsMin) {
        this.scanRowsMin = scanRowsMin;
        return this;
    }
    public Long getScanRowsMin() {
        return this.scanRowsMin;
    }

    public DescribeSqlAuditsRequest setSearchKeyWord(String searchKeyWord) {
        this.searchKeyWord = searchKeyWord;
        return this;
    }
    public String getSearchKeyWord() {
        return this.searchKeyWord;
    }

    public DescribeSqlAuditsRequest setSearchKeyWordMethod(String searchKeyWordMethod) {
        this.searchKeyWordMethod = searchKeyWordMethod;
        return this;
    }
    public String getSearchKeyWordMethod() {
        return this.searchKeyWordMethod;
    }

    public DescribeSqlAuditsRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeSqlAuditsRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public DescribeSqlAuditsRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
