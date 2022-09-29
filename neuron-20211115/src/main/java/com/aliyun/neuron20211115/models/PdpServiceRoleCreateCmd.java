// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class PdpServiceRoleCreateCmd extends TeaModel {
    @NameInMap("companyId")
    public Long companyId;

    @NameInMap("name")
    public String name;

    @NameInMap("pbcId")
    public Long pbcId;

    @NameInMap("serviceId")
    public Long serviceId;

    public static PdpServiceRoleCreateCmd build(java.util.Map<String, ?> map) throws Exception {
        PdpServiceRoleCreateCmd self = new PdpServiceRoleCreateCmd();
        return TeaModel.build(map, self);
    }

    public PdpServiceRoleCreateCmd setCompanyId(Long companyId) {
        this.companyId = companyId;
        return this;
    }
    public Long getCompanyId() {
        return this.companyId;
    }

    public PdpServiceRoleCreateCmd setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public PdpServiceRoleCreateCmd setPbcId(Long pbcId) {
        this.pbcId = pbcId;
        return this;
    }
    public Long getPbcId() {
        return this.pbcId;
    }

    public PdpServiceRoleCreateCmd setServiceId(Long serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public Long getServiceId() {
        return this.serviceId;
    }

}
