// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListDTXWhitelistZonesRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("DsName")
    public String dsName;

    @NameInMap("InstanceId")
    public String instanceId;

    public static ListDTXWhitelistZonesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDTXWhitelistZonesRequest self = new ListDTXWhitelistZonesRequest();
        return TeaModel.build(map, self);
    }

    public ListDTXWhitelistZonesRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public ListDTXWhitelistZonesRequest setDsName(String dsName) {
        this.dsName = dsName;
        return this;
    }
    public String getDsName() {
        return this.dsName;
    }

    public ListDTXWhitelistZonesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
