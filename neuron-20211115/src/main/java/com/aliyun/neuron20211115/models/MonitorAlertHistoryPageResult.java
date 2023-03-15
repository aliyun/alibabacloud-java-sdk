// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class MonitorAlertHistoryPageResult extends TeaModel {
    @NameInMap("alertHistories")
    public java.util.List<MonitorAlertHistory> alertHistories;

    @NameInMap("intTotal")
    public Integer intTotal;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("total")
    public Long total;

    public static MonitorAlertHistoryPageResult build(java.util.Map<String, ?> map) throws Exception {
        MonitorAlertHistoryPageResult self = new MonitorAlertHistoryPageResult();
        return TeaModel.build(map, self);
    }

    public MonitorAlertHistoryPageResult setAlertHistories(java.util.List<MonitorAlertHistory> alertHistories) {
        this.alertHistories = alertHistories;
        return this;
    }
    public java.util.List<MonitorAlertHistory> getAlertHistories() {
        return this.alertHistories;
    }

    public MonitorAlertHistoryPageResult setIntTotal(Integer intTotal) {
        this.intTotal = intTotal;
        return this;
    }
    public Integer getIntTotal() {
        return this.intTotal;
    }

    public MonitorAlertHistoryPageResult setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public MonitorAlertHistoryPageResult setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

}
