// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.uisplus20200707.models;

import com.aliyun.tea.*;

public class CreateVnetRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("UisId")
    @Validation(required = true)
    public String uisId;

    @NameInMap("Cidrs")
    @Validation(required = true)
    public String cidrs;

    @NameInMap("MbpsQuota")
    public Integer mbpsQuota;

    @NameInMap("KppsQuota")
    public Integer kppsQuota;

    @NameInMap("FlowQuota")
    public Integer flowQuota;

    @NameInMap("Name")
    public String name;

    public static CreateVnetRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateVnetRequest self = new CreateVnetRequest();
        return TeaModel.build(map, self);
    }

    public CreateVnetRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateVnetRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateVnetRequest setUisId(String uisId) {
        this.uisId = uisId;
        return this;
    }
    public String getUisId() {
        return this.uisId;
    }

    public CreateVnetRequest setCidrs(String cidrs) {
        this.cidrs = cidrs;
        return this;
    }
    public String getCidrs() {
        return this.cidrs;
    }

    public CreateVnetRequest setMbpsQuota(Integer mbpsQuota) {
        this.mbpsQuota = mbpsQuota;
        return this;
    }
    public Integer getMbpsQuota() {
        return this.mbpsQuota;
    }

    public CreateVnetRequest setKppsQuota(Integer kppsQuota) {
        this.kppsQuota = kppsQuota;
        return this;
    }
    public Integer getKppsQuota() {
        return this.kppsQuota;
    }

    public CreateVnetRequest setFlowQuota(Integer flowQuota) {
        this.flowQuota = flowQuota;
        return this;
    }
    public Integer getFlowQuota() {
        return this.flowQuota;
    }

    public CreateVnetRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
