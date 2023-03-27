// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DeleteDBProxyEndpointAddressRequest extends TeaModel {
    /**
     * <p>The ID of the instance. You can call the [DescribeDBInstances](~~26232~~) operation to query the ID of the instance.</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The network type of the proxy endpoint. Valid values:</p>
     * <br>
     * <p>*   **Public**: Internet</p>
     * <p>*   **VPC**: virtual private cloud (VPC)</p>
     * <p>*   **Classic**: classic network</p>
     * <br>
     * <p>Default value: **Classic**.</p>
     * <br>
     * <p>> </p>
     * <br>
     * <p>*   If the instance uses standard SSDs or enhanced SSDs (ESSDs) and the network type of the proxy endpoint is VPC, you cannot delete the proxy endpoint.</p>
     * <br>
     * <p>*   If the instance runs PostgreSQL, you can set this parameter to **Public** or **VPC**.</p>
     */
    @NameInMap("DBProxyConnectStringNetType")
    public String DBProxyConnectStringNetType;

    /**
     * <p>The ID of the proxy endpoint. You can call the [DescribeDBProxyEndpoint](~~140955~~) operation to query the ID of the proxy endpoint.</p>
     */
    @NameInMap("DBProxyEndpointId")
    public String DBProxyEndpointId;

    /**
     * <p>An internal parameter. You do not need to specify this parameter.</p>
     */
    @NameInMap("DBProxyEngineType")
    public String DBProxyEngineType;

    /**
     * <p>The region ID of the instance. You can call the [DescribeRegions](~~26243~~) operation to query most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DeleteDBProxyEndpointAddressRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDBProxyEndpointAddressRequest self = new DeleteDBProxyEndpointAddressRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDBProxyEndpointAddressRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public DeleteDBProxyEndpointAddressRequest setDBProxyConnectStringNetType(String DBProxyConnectStringNetType) {
        this.DBProxyConnectStringNetType = DBProxyConnectStringNetType;
        return this;
    }
    public String getDBProxyConnectStringNetType() {
        return this.DBProxyConnectStringNetType;
    }

    public DeleteDBProxyEndpointAddressRequest setDBProxyEndpointId(String DBProxyEndpointId) {
        this.DBProxyEndpointId = DBProxyEndpointId;
        return this;
    }
    public String getDBProxyEndpointId() {
        return this.DBProxyEndpointId;
    }

    public DeleteDBProxyEndpointAddressRequest setDBProxyEngineType(String DBProxyEngineType) {
        this.DBProxyEngineType = DBProxyEngineType;
        return this;
    }
    public String getDBProxyEngineType() {
        return this.DBProxyEngineType;
    }

    public DeleteDBProxyEndpointAddressRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
