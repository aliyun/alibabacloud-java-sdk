// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class ServerInstanceResult extends TeaModel {
    @NameInMap("intTotal")
    public Integer intTotal;

    @NameInMap("ips")
    public java.util.List<String> ips;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("total")
    public Long total;

    public static ServerInstanceResult build(java.util.Map<String, ?> map) throws Exception {
        ServerInstanceResult self = new ServerInstanceResult();
        return TeaModel.build(map, self);
    }

    public ServerInstanceResult setIntTotal(Integer intTotal) {
        this.intTotal = intTotal;
        return this;
    }
    public Integer getIntTotal() {
        return this.intTotal;
    }

    public ServerInstanceResult setIps(java.util.List<String> ips) {
        this.ips = ips;
        return this;
    }
    public java.util.List<String> getIps() {
        return this.ips;
    }

    public ServerInstanceResult setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ServerInstanceResult setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

}
