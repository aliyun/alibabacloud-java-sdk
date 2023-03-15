// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class MicroServicePageResult extends TeaModel {
    @NameInMap("MicroServiceDigests")
    public java.util.List<MicroServiceDigest> microServiceDigests;

    @NameInMap("intTotal")
    public Integer intTotal;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("total")
    public Long total;

    public static MicroServicePageResult build(java.util.Map<String, ?> map) throws Exception {
        MicroServicePageResult self = new MicroServicePageResult();
        return TeaModel.build(map, self);
    }

    public MicroServicePageResult setMicroServiceDigests(java.util.List<MicroServiceDigest> microServiceDigests) {
        this.microServiceDigests = microServiceDigests;
        return this;
    }
    public java.util.List<MicroServiceDigest> getMicroServiceDigests() {
        return this.microServiceDigests;
    }

    public MicroServicePageResult setIntTotal(Integer intTotal) {
        this.intTotal = intTotal;
        return this;
    }
    public Integer getIntTotal() {
        return this.intTotal;
    }

    public MicroServicePageResult setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public MicroServicePageResult setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

}
