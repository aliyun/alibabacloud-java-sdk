// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyDbProxyInstanceSslRequest extends TeaModel {
    /**
     * <p>A reserved parameter. You do not need to specify this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>normal</p>
     */
    @NameInMap("DBProxyEngineType")
    public String DBProxyEngineType;

    /**
     * <p>The instance ID. You can call DescribeDBInstances to query the instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-t4n3a****</p>
     */
    @NameInMap("DbInstanceId")
    public String dbInstanceId;

    /**
     * <p>The endpoint for which you want to enable SSL encryption.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test123456.rwlb.rds.aliyuncs.com</p>
     */
    @NameInMap("DbProxyConnectString")
    public String dbProxyConnectString;

    /**
     * <p>The ID of the database proxy endpoint. You can call DescribeDBProxyEndpoint to query the ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ta9um4****</p>
     */
    @NameInMap("DbProxyEndpointId")
    public String dbProxyEndpointId;

    /**
     * <p>The operation that you want to perform on SSL encryption. Valid values:</p>
     * <ul>
     * <li>0: Disables SSL encryption.</li>
     * <li>1: Enables SSL encryption or changes the endpoint for which SSL encryption is enabled.</li>
     * <li>2: Updates the validity period of the SSL certificate.</li>
     * </ul>
     * <blockquote>
     * <p>The preceding operations restart the instance. Proceed with caution.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("DbProxySslEnabled")
    public String dbProxySslEnabled;

    /**
     * <p>The region ID. You can call DescribeRegions to query the most recent region list.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
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
