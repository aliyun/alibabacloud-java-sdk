// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class MonitorContactPageResult extends TeaModel {
    @NameInMap("data")
    public java.util.List<MonitorContact> data;

    @NameInMap("intTotal")
    public Integer intTotal;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("total")
    public Long total;

    public static MonitorContactPageResult build(java.util.Map<String, ?> map) throws Exception {
        MonitorContactPageResult self = new MonitorContactPageResult();
        return TeaModel.build(map, self);
    }

    public MonitorContactPageResult setData(java.util.List<MonitorContact> data) {
        this.data = data;
        return this;
    }
    public java.util.List<MonitorContact> getData() {
        return this.data;
    }

    public MonitorContactPageResult setIntTotal(Integer intTotal) {
        this.intTotal = intTotal;
        return this;
    }
    public Integer getIntTotal() {
        return this.intTotal;
    }

    public MonitorContactPageResult setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public MonitorContactPageResult setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

}
