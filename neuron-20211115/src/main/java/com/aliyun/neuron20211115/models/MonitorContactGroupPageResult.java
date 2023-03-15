// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class MonitorContactGroupPageResult extends TeaModel {
    @NameInMap("data")
    public java.util.List<MonitorContactGroup> data;

    @NameInMap("intTotal")
    public Integer intTotal;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("total")
    public Long total;

    public static MonitorContactGroupPageResult build(java.util.Map<String, ?> map) throws Exception {
        MonitorContactGroupPageResult self = new MonitorContactGroupPageResult();
        return TeaModel.build(map, self);
    }

    public MonitorContactGroupPageResult setData(java.util.List<MonitorContactGroup> data) {
        this.data = data;
        return this;
    }
    public java.util.List<MonitorContactGroup> getData() {
        return this.data;
    }

    public MonitorContactGroupPageResult setIntTotal(Integer intTotal) {
        this.intTotal = intTotal;
        return this;
    }
    public Integer getIntTotal() {
        return this.intTotal;
    }

    public MonitorContactGroupPageResult setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public MonitorContactGroupPageResult setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

}
