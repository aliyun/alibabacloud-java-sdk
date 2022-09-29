// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class EnterpriseTransferCmd extends TeaModel {
    @NameInMap("accountId")
    public String accountId;

    @NameInMap("id")
    public Long id;

    public static EnterpriseTransferCmd build(java.util.Map<String, ?> map) throws Exception {
        EnterpriseTransferCmd self = new EnterpriseTransferCmd();
        return TeaModel.build(map, self);
    }

    public EnterpriseTransferCmd setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public EnterpriseTransferCmd setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

}
