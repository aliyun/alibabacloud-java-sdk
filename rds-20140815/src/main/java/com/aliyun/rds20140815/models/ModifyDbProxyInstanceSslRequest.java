// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyDbProxyInstanceSslRequest extends TeaModel {
    /**
     * <p>An internal parameter. You do not need to specify this parameter.</p>
     */
    @NameInMap("DBProxyEngineType")
    public String DBProxyEngineType;

    /**
     * <p>The ID of the instance. You can call the [DescribeDBInstances](~~26232~~) operation to query the ID of the instance.</p>
     */
    @NameInMap("DbInstanceId")
    public String dbInstanceId;

    /**
     * <p>The dedicated proxy endpoint of the instance.</p>
     */
    @NameInMap("DbProxyConnectString")
    public String dbProxyConnectString;

    /**
     * <p>The ID of the proxy endpoint. You can call the [DescribeDBProxyEndpoint](~~140955~~) operation to query the ID of the proxy endpoint.</p>
     */
    @NameInMap("DbProxyEndpointId")
    public String dbProxyEndpointId;

    /**
     * <p>The SSL configuration setting that you want to apply on the instance. Valid values:</p>
     * <br>
     * <p>*   0: disables SSL encryption.</p>
     * <p>*   1: enables SSL encryption or modifies the endpoint that requires SSL encryption.</p>
     * <p>*   2: updates the validity period of the SSL certificate.</p>
     * <br>
     * <p>> This setting causes your instance to restart. Proceed with caution.</p>
     */
    @NameInMap("DbProxySslEnabled")
    public String dbProxySslEnabled;

    /**
     * <p>The region ID of the instance. You can call the [DescribeRegions](~~26243~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ModifyDbProxyInstanceSslRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDbProxyInstanceSslRequest self = new ModifyDbProxyInstanceSslRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDbProxyInstanceSslRequest setDBProxyEngineType(String DBProxyEngineType) {
        this.DBProxyEngineType = DBProxyEngineType;
        return this;
    }
    public String getDBProxyEngineType() {
        return this.DBProxyEngineType;
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
