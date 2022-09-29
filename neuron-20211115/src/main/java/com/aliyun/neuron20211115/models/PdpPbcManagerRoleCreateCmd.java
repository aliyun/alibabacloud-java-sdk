// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class PdpPbcManagerRoleCreateCmd extends TeaModel {
    @NameInMap("companyId")
    public Long companyId;

    @NameInMap("name")
    public String name;

    @NameInMap("pbcId")
    public Long pbcId;

    public static PdpPbcManagerRoleCreateCmd build(java.util.Map<String, ?> map) throws Exception {
        PdpPbcManagerRoleCreateCmd self = new PdpPbcManagerRoleCreateCmd();
        return TeaModel.build(map, self);
    }

    public PdpPbcManagerRoleCreateCmd setCompanyId(Long companyId) {
        this.companyId = companyId;
        return this;
    }
    public Long getCompanyId() {
        return this.companyId;
    }

    public PdpPbcManagerRoleCreateCmd setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public PdpPbcManagerRoleCreateCmd setPbcId(Long pbcId) {
        this.pbcId = pbcId;
        return this;
    }
    public Long getPbcId() {
        return this.pbcId;
    }

}
