// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class RegisterBucUserCmd extends TeaModel {
    @NameInMap("enterpriseId")
    public Long enterpriseId;

    @NameInMap("enterpriseName")
    public String enterpriseName;

    public static RegisterBucUserCmd build(java.util.Map<String, ?> map) throws Exception {
        RegisterBucUserCmd self = new RegisterBucUserCmd();
        return TeaModel.build(map, self);
    }

    public RegisterBucUserCmd setEnterpriseId(Long enterpriseId) {
        this.enterpriseId = enterpriseId;
        return this;
    }
    public Long getEnterpriseId() {
        return this.enterpriseId;
    }

    public RegisterBucUserCmd setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName;
        return this;
    }
    public String getEnterpriseName() {
        return this.enterpriseName;
    }

}
