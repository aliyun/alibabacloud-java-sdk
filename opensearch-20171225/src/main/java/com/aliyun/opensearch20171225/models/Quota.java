// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class Quota extends TeaModel {
    @NameInMap("computeResource")
    public Integer computeResource;

    @NameInMap("docSize")
    public Integer docSize;

    @NameInMap("orderType")
    public String orderType;

    @NameInMap("spec")
    public String spec;

    public static Quota build(java.util.Map<String, ?> map) throws Exception {
        Quota self = new Quota();
        return TeaModel.build(map, self);
    }

    public Quota setComputeResource(Integer computeResource) {
        this.computeResource = computeResource;
        return this;
    }
    public Integer getComputeResource() {
        return this.computeResource;
    }

    public Quota setDocSize(Integer docSize) {
        this.docSize = docSize;
        return this;
    }
    public Integer getDocSize() {
        return this.docSize;
    }

    public Quota setOrderType(String orderType) {
        this.orderType = orderType;
        return this;
    }
    public String getOrderType() {
        return this.orderType;
    }

    public Quota setSpec(String spec) {
        this.spec = spec;
        return this;
    }
    public String getSpec() {
        return this.spec;
    }

}
