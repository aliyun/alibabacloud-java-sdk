// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class ServiceMetricPageResult extends TeaModel {
    @NameInMap("data")
    public java.util.List<MetricData> data;

    @NameInMap("intTotal")
    public Integer intTotal;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("total")
    public Long total;

    public static ServiceMetricPageResult build(java.util.Map<String, ?> map) throws Exception {
        ServiceMetricPageResult self = new ServiceMetricPageResult();
        return TeaModel.build(map, self);
    }

    public ServiceMetricPageResult setData(java.util.List<MetricData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<MetricData> getData() {
        return this.data;
    }

    public ServiceMetricPageResult setIntTotal(Integer intTotal) {
        this.intTotal = intTotal;
        return this;
    }
    public Integer getIntTotal() {
        return this.intTotal;
    }

    public ServiceMetricPageResult setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ServiceMetricPageResult setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

}
