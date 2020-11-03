// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.uisplus20200707.models;

import com.aliyun.tea.*;

public class DescribeVnetResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("UisId")
    @Validation(required = true)
    public String uisId;

    @NameInMap("Name")
    @Validation(required = true)
    public String name;

    @NameInMap("State")
    @Validation(required = true)
    public String state;

    @NameInMap("VnetId")
    @Validation(required = true)
    public String vnetId;

    @NameInMap("Cidrs")
    @Validation(required = true)
    public String cidrs;

    @NameInMap("MbpsQuota")
    @Validation(required = true)
    public String mbpsQuota;

    @NameInMap("KppsQuota")
    @Validation(required = true)
    public String kppsQuota;

    @NameInMap("FlowQuota")
    @Validation(required = true)
    public String flowQuota;

    public static DescribeVnetResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVnetResponse self = new DescribeVnetResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVnetResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVnetResponse setUisId(String uisId) {
        this.uisId = uisId;
        return this;
    }
    public String getUisId() {
        return this.uisId;
    }

    public DescribeVnetResponse setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeVnetResponse setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public DescribeVnetResponse setVnetId(String vnetId) {
        this.vnetId = vnetId;
        return this;
    }
    public String getVnetId() {
        return this.vnetId;
    }

    public DescribeVnetResponse setCidrs(String cidrs) {
        this.cidrs = cidrs;
        return this;
    }
    public String getCidrs() {
        return this.cidrs;
    }

    public DescribeVnetResponse setMbpsQuota(String mbpsQuota) {
        this.mbpsQuota = mbpsQuota;
        return this;
    }
    public String getMbpsQuota() {
        return this.mbpsQuota;
    }

    public DescribeVnetResponse setKppsQuota(String kppsQuota) {
        this.kppsQuota = kppsQuota;
        return this;
    }
    public String getKppsQuota() {
        return this.kppsQuota;
    }

    public DescribeVnetResponse setFlowQuota(String flowQuota) {
        this.flowQuota = flowQuota;
        return this;
    }
    public String getFlowQuota() {
        return this.flowQuota;
    }

}
