// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class PdpMetadataRoleCreateCmd extends TeaModel {
    @NameInMap("companyId")
    public Long companyId;

    @NameInMap("name")
    public String name;

    @NameInMap("pbcId")
    public Long pbcId;

    public static PdpMetadataRoleCreateCmd build(java.util.Map<String, ?> map) throws Exception {
        PdpMetadataRoleCreateCmd self = new PdpMetadataRoleCreateCmd();
        return TeaModel.build(map, self);
    }

    public PdpMetadataRoleCreateCmd setCompanyId(Long companyId) {
        this.companyId = companyId;
        return this;
    }
    public Long getCompanyId() {
        return this.companyId;
    }

    public PdpMetadataRoleCreateCmd setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public PdpMetadataRoleCreateCmd setPbcId(Long pbcId) {
        this.pbcId = pbcId;
        return this;
    }
    public Long getPbcId() {
        return this.pbcId;
    }

}
