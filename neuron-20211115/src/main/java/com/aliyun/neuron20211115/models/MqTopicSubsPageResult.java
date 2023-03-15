// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class MqTopicSubsPageResult extends TeaModel {
    @NameInMap("MqTopicSubsDigests")
    public java.util.List<MqTopicSubsDigest> mqTopicSubsDigests;

    @NameInMap("intTotal")
    public Integer intTotal;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("total")
    public Long total;

    public static MqTopicSubsPageResult build(java.util.Map<String, ?> map) throws Exception {
        MqTopicSubsPageResult self = new MqTopicSubsPageResult();
        return TeaModel.build(map, self);
    }

    public MqTopicSubsPageResult setMqTopicSubsDigests(java.util.List<MqTopicSubsDigest> mqTopicSubsDigests) {
        this.mqTopicSubsDigests = mqTopicSubsDigests;
        return this;
    }
    public java.util.List<MqTopicSubsDigest> getMqTopicSubsDigests() {
        return this.mqTopicSubsDigests;
    }

    public MqTopicSubsPageResult setIntTotal(Integer intTotal) {
        this.intTotal = intTotal;
        return this;
    }
    public Integer getIntTotal() {
        return this.intTotal;
    }

    public MqTopicSubsPageResult setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public MqTopicSubsPageResult setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

}
