// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeMachineCanRebootRequest extends TeaModel {
    @NameInMap("Type")
    public String type;

    @NameInMap("Uuid")
    public String uuid;

    public static DescribeMachineCanRebootRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeMachineCanRebootRequest self = new DescribeMachineCanRebootRequest();
        return TeaModel.build(map, self);
    }

    public DescribeMachineCanRebootRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public DescribeMachineCanRebootRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

}
