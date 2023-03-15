// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class MonitorNotifyAlertPageResult extends TeaModel {
    @NameInMap("intTotal")
    public Integer intTotal;

    @NameInMap("notifyAlerts")
    public java.util.List<MonitorNotifyAlert> notifyAlerts;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("total")
    public Long total;

    public static MonitorNotifyAlertPageResult build(java.util.Map<String, ?> map) throws Exception {
        MonitorNotifyAlertPageResult self = new MonitorNotifyAlertPageResult();
        return TeaModel.build(map, self);
    }

    public MonitorNotifyAlertPageResult setIntTotal(Integer intTotal) {
        this.intTotal = intTotal;
        return this;
    }
    public Integer getIntTotal() {
        return this.intTotal;
    }

    public MonitorNotifyAlertPageResult setNotifyAlerts(java.util.List<MonitorNotifyAlert> notifyAlerts) {
        this.notifyAlerts = notifyAlerts;
        return this;
    }
    public java.util.List<MonitorNotifyAlert> getNotifyAlerts() {
        return this.notifyAlerts;
    }

    public MonitorNotifyAlertPageResult setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public MonitorNotifyAlertPageResult setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

}
