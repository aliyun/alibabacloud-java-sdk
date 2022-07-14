// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class RebootMachineRequest extends TeaModel {
    @NameInMap("Uuid")
    public String uuid;

    public static RebootMachineRequest build(java.util.Map<String, ?> map) throws Exception {
        RebootMachineRequest self = new RebootMachineRequest();
        return TeaModel.build(map, self);
    }

    public RebootMachineRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

}
