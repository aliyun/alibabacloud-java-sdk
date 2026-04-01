// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DeleteDBProxyEndpointAddressRequest extends TeaModel {
    /**
     * <p>The instance ID. You can call the DescribeDBInstances operation to query the instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-t4n3a****</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The network type of the proxy endpoint. Valid values:</p>
     * <ul>
     * <li><strong>Public</strong>: Internet</li>
     * <li><strong>VPC</strong>: virtual private cloud (VPC)</li>
     * <li><strong>Classic</strong>: classic network</li>
     * </ul>
     * <p>If the instance runs MySQL, the default value of this parameter is <strong>Classic</strong>.</p>
     * <blockquote>
     * <p>If the instance runs PostgreSQL, you must set this parameter to <strong>Public</strong> or <strong>VPC</strong>.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Public</p>
     */
    @NameInMap("DBProxyConnectStringNetType")
    public String DBProxyConnectStringNetType;

    /**
     * <p>The proxy endpoint ID. You can call the DescribeDBProxyEndpoint operation to query the proxy endpoint ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ta9um4****</p>
     */
    @NameInMap("DBProxyEndpointId")
    public String DBProxyEndpointId;

    /**
     * <p>A reserved parameter. You do not need to specify this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>normal</p>
     */
    @NameInMap("DBProxyEngineType")
    public String DBProxyEngineType;

    /**
     * <p>The region ID. You can call the DescribeRegions operation to query the most recent region list.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
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
