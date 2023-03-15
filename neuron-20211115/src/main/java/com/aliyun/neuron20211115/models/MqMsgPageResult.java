// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class MqMsgPageResult extends TeaModel {
    @NameInMap("MqMsgDigests")
    public java.util.List<MqMsgDigest> mqMsgDigests;

    @NameInMap("intTotal")
    public Integer intTotal;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("total")
    public Long total;

    public static MqMsgPageResult build(java.util.Map<String, ?> map) throws Exception {
        MqMsgPageResult self = new MqMsgPageResult();
        return TeaModel.build(map, self);
    }

    public MqMsgPageResult setMqMsgDigests(java.util.List<MqMsgDigest> mqMsgDigests) {
        this.mqMsgDigests = mqMsgDigests;
        return this;
    }
    public java.util.List<MqMsgDigest> getMqMsgDigests() {
        return this.mqMsgDigests;
    }

    public MqMsgPageResult setIntTotal(Integer intTotal) {
        this.intTotal = intTotal;
        return this;
    }
    public Integer getIntTotal() {
        return this.intTotal;
    }

    public MqMsgPageResult setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public MqMsgPageResult setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

}
