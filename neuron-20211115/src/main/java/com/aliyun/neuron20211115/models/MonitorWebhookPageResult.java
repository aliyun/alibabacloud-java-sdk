// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class MonitorWebhookPageResult extends TeaModel {
    @NameInMap("data")
    public java.util.List<MonitorWebhook> data;

    @NameInMap("intTotal")
    public Integer intTotal;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("total")
    public Long total;

    public static MonitorWebhookPageResult build(java.util.Map<String, ?> map) throws Exception {
        MonitorWebhookPageResult self = new MonitorWebhookPageResult();
        return TeaModel.build(map, self);
    }

    public MonitorWebhookPageResult setData(java.util.List<MonitorWebhook> data) {
        this.data = data;
        return this;
    }
    public java.util.List<MonitorWebhook> getData() {
        return this.data;
    }

    public MonitorWebhookPageResult setIntTotal(Integer intTotal) {
        this.intTotal = intTotal;
        return this;
    }
    public Integer getIntTotal() {
        return this.intTotal;
    }

    public MonitorWebhookPageResult setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public MonitorWebhookPageResult setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

}
