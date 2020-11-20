// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyDbProxyInstanceSslRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("DbInstanceId")
    @Validation(required = true)
    public String dbInstanceId;

    @NameInMap("DbProxyEndpointId")
    @Validation(required = true)
    public String dbProxyEndpointId;

    @NameInMap("DbProxyConnectString")
    @Validation(required = true)
    public String dbProxyConnectString;

    @NameInMap("DbProxySslEnabled")
    @Validation(required = true)
    public String dbProxySslEnabled;

    public static ModifyDbProxyInstanceSslRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDbProxyInstanceSslRequest self = new ModifyDbProxyInstanceSslRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDbProxyInstanceSslRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyDbProxyInstanceSslRequest setDbInstanceId(String dbInstanceId) {
        this.dbInstanceId = dbInstanceId;
        return this;
    }
    public String getDbInstanceId() {
        return this.dbInstanceId;
    }

    public ModifyDbProxyInstanceSslRequest setDbProxyEndpointId(String dbProxyEndpointId) {
        this.dbProxyEndpointId = dbProxyEndpointId;
        return this;
    }
    public String getDbProxyEndpointId() {
        return this.dbProxyEndpointId;
    }

    public ModifyDbProxyInstanceSslRequest setDbProxyConnectString(String dbProxyConnectString) {
        this.dbProxyConnectString = dbProxyConnectString;
        return this;
    }
    public String getDbProxyConnectString() {
        return this.dbProxyConnectString;
    }

    public ModifyDbProxyInstanceSslRequest setDbProxySslEnabled(String dbProxySslEnabled) {
        this.dbProxySslEnabled = dbProxySslEnabled;
        return this;
    }
    public String getDbProxySslEnabled() {
        return this.dbProxySslEnabled;
    }

}
