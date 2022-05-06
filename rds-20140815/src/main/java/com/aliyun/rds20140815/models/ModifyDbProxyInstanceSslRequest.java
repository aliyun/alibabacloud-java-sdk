// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyDbProxyInstanceSslRequest extends TeaModel {
    @NameInMap("DbInstanceId")
    public String dbInstanceId;

    @NameInMap("DbProxyConnectString")
    public String dbProxyConnectString;

    @NameInMap("DbProxyEndpointId")
    public String dbProxyEndpointId;

    @NameInMap("DbProxySslEnabled")
    public String dbProxySslEnabled;

    @NameInMap("RegionId")
    public String regionId;

    public static ModifyDbProxyInstanceSslRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDbProxyInstanceSslRequest self = new ModifyDbProxyInstanceSslRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDbProxyInstanceSslRequest setDbInstanceId(String dbInstanceId) {
        this.dbInstanceId = dbInstanceId;
        return this;
    }
    public String getDbInstanceId() {
        return this.dbInstanceId;
    }

    public ModifyDbProxyInstanceSslRequest setDbProxyConnectString(String dbProxyConnectString) {
        this.dbProxyConnectString = dbProxyConnectString;
        return this;
    }
    public String getDbProxyConnectString() {
        return this.dbProxyConnectString;
    }

    public ModifyDbProxyInstanceSslRequest setDbProxyEndpointId(String dbProxyEndpointId) {
        this.dbProxyEndpointId = dbProxyEndpointId;
        return this;
    }
    public String getDbProxyEndpointId() {
        return this.dbProxyEndpointId;
    }

    public ModifyDbProxyInstanceSslRequest setDbProxySslEnabled(String dbProxySslEnabled) {
        this.dbProxySslEnabled = dbProxySslEnabled;
        return this;
    }
    public String getDbProxySslEnabled() {
        return this.dbProxySslEnabled;
    }

    public ModifyDbProxyInstanceSslRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
