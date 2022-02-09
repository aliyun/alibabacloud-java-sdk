// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ValidateOmsEndpointConnectionByInfoV2Request extends TeaModel {
    @NameInMap("Master")
    public String master;

    @NameInMap("Slave")
    public String slave;

    public static ValidateOmsEndpointConnectionByInfoV2Request build(java.util.Map<String, ?> map) throws Exception {
        ValidateOmsEndpointConnectionByInfoV2Request self = new ValidateOmsEndpointConnectionByInfoV2Request();
        return TeaModel.build(map, self);
    }

    public ValidateOmsEndpointConnectionByInfoV2Request setMaster(String master) {
        this.master = master;
        return this;
    }
    public String getMaster() {
        return this.master;
    }

    public ValidateOmsEndpointConnectionByInfoV2Request setSlave(String slave) {
        this.slave = slave;
        return this;
    }
    public String getSlave() {
        return this.slave;
    }

}
