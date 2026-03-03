// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class GetMonitorAlertHistoryRequest extends TeaModel {
    @NameInMap("alertRuleName")
    public String alertRuleName;

    @NameInMap("endTime")
    public String endTime;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("env")
    public String env;

    @NameInMap("orderBy")
    public String orderBy;

    @NameInMap("orderDirection")
    public String orderDirection;

    @NameInMap("pageNumber")
    public Integer pageNumber;

    @NameInMap("pageSize")
    public Integer pageSize;

    @NameInMap("pbcId")
    public Long pbcId;

    @NameInMap("serviceGroupId")
    public Long serviceGroupId;

    @NameInMap("startTime")
    public String startTime;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("type")
    public String type;

    public static GetMonitorAlertHistoryRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMonitorAlertHistoryRequest self = new GetMonitorAlertHistoryRequest();
        return TeaModel.build(map, self);
    }

    public GetMonitorAlertHistoryRequest setAlertRuleName(String alertRuleName) {
        this.alertRuleName = alertRuleName;
        return this;
    }
    public String getAlertRuleName() {
        return this.alertRuleName;
    }

    public GetMonitorAlertHistoryRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public GetMonitorAlertHistoryRequest setEnv(String env) {
        this.env = env;
        return this;
    }
    public String getEnv() {
        return this.env;
    }

    public GetMonitorAlertHistoryRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public GetMonitorAlertHistoryRequest setOrderDirection(String orderDirection) {
        this.orderDirection = orderDirection;
        return this;
    }
    public String getOrderDirection() {
        return this.orderDirection;
    }

    public GetMonitorAlertHistoryRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public GetMonitorAlertHistoryRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetMonitorAlertHistoryRequest setPbcId(Long pbcId) {
        this.pbcId = pbcId;
        return this;
    }
    public Long getPbcId() {
        return this.pbcId;
    }

    public GetMonitorAlertHistoryRequest setServiceGroupId(Long serviceGroupId) {
        this.serviceGroupId = serviceGroupId;
        return this;
    }
    public Long getServiceGroupId() {
        return this.serviceGroupId;
    }

    public GetMonitorAlertHistoryRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public GetMonitorAlertHistoryRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
