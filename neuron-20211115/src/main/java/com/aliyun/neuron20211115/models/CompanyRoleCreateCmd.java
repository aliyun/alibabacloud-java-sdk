// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class CompanyRoleCreateCmd extends TeaModel {
    @NameInMap("companyId")
    public Long companyId;

    @NameInMap("name")
    public String name;

    public static CompanyRoleCreateCmd build(java.util.Map<String, ?> map) throws Exception {
        CompanyRoleCreateCmd self = new CompanyRoleCreateCmd();
        return TeaModel.build(map, self);
    }

    public CompanyRoleCreateCmd setCompanyId(Long companyId) {
        this.companyId = companyId;
        return this;
    }
    public Long getCompanyId() {
        return this.companyId;
    }

    public CompanyRoleCreateCmd setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
