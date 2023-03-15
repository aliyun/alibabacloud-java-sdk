// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class SettledUpdateCmd extends TeaModel {
    @NameInMap("status")
    public String status;

    public static SettledUpdateCmd build(java.util.Map<String, ?> map) throws Exception {
        SettledUpdateCmd self = new SettledUpdateCmd();
        return TeaModel.build(map, self);
    }

    public SettledUpdateCmd setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
