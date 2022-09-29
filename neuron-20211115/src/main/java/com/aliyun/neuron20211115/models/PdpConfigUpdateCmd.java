// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class PdpConfigUpdateCmd extends TeaModel {
    @NameInMap("accountId")
    public String accountId;

    @NameInMap("context")
    public String context;

    @NameInMap("id")
    public Long id;

    public static PdpConfigUpdateCmd build(java.util.Map<String, ?> map) throws Exception {
        PdpConfigUpdateCmd self = new PdpConfigUpdateCmd();
        return TeaModel.build(map, self);
    }

    public PdpConfigUpdateCmd setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public PdpConfigUpdateCmd setContext(String context) {
        this.context = context;
        return this;
    }
    public String getContext() {
        return this.context;
    }

    public PdpConfigUpdateCmd setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

}
