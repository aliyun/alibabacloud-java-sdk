// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ModifyInstanceSSLRequest extends TeaModel {
    @NameInMap("EnableSSL")
    public String enableSSL;

    @NameInMap("InstanceId")
    public String instanceId;

    public static ModifyInstanceSSLRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceSSLRequest self = new ModifyInstanceSSLRequest();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceSSLRequest setEnableSSL(String enableSSL) {
        this.enableSSL = enableSSL;
        return this;
    }
    public String getEnableSSL() {
        return this.enableSSL;
    }

    public ModifyInstanceSSLRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
