// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ModifyOmsEndpointV2Request extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("Master")
    public String master;

    @NameInMap("Slave")
    public String slave;

    public static ModifyOmsEndpointV2Request build(java.util.Map<String, ?> map) throws Exception {
        ModifyOmsEndpointV2Request self = new ModifyOmsEndpointV2Request();
        return TeaModel.build(map, self);
    }

    public ModifyOmsEndpointV2Request setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ModifyOmsEndpointV2Request setMaster(String master) {
        this.master = master;
        return this;
    }
    public String getMaster() {
        return this.master;
    }

    public ModifyOmsEndpointV2Request setSlave(String slave) {
        this.slave = slave;
        return this;
    }
    public String getSlave() {
        return this.slave;
    }

}
