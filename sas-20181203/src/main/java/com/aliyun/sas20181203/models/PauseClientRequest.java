// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class PauseClientRequest extends TeaModel {
    // The list of servers for which you want to enable or disable the Security Center agent.
    @NameInMap("Uuids")
    public String uuids;

    // The status of the Security Center agent. Valid values:
    // - **0**: disabled
    // - **1**: enabled
    @NameInMap("Value")
    public String value;

    public static PauseClientRequest build(java.util.Map<String, ?> map) throws Exception {
        PauseClientRequest self = new PauseClientRequest();
        return TeaModel.build(map, self);
    }

    public PauseClientRequest setUuids(String uuids) {
        this.uuids = uuids;
        return this;
    }
    public String getUuids() {
        return this.uuids;
    }

    public PauseClientRequest setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
