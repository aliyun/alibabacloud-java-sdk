// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class MqTopicPageResult extends TeaModel {
    @NameInMap("MqTopicDigests")
    public java.util.List<MqTopicDigest> mqTopicDigests;

    @NameInMap("intTotal")
    public Integer intTotal;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("total")
    public Long total;

    public static MqTopicPageResult build(java.util.Map<String, ?> map) throws Exception {
        MqTopicPageResult self = new MqTopicPageResult();
        return TeaModel.build(map, self);
    }

    public MqTopicPageResult setMqTopicDigests(java.util.List<MqTopicDigest> mqTopicDigests) {
        this.mqTopicDigests = mqTopicDigests;
        return this;
    }
    public java.util.List<MqTopicDigest> getMqTopicDigests() {
        return this.mqTopicDigests;
    }

    public MqTopicPageResult setIntTotal(Integer intTotal) {
        this.intTotal = intTotal;
        return this;
    }
    public Integer getIntTotal() {
        return this.intTotal;
    }

    public MqTopicPageResult setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public MqTopicPageResult setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

}
