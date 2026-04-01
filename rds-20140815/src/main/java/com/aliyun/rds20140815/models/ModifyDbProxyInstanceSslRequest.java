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
     * <p>The instance ID. You can call the DescribeDBInstances operation to query the instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-t4n3axxxxx</p>
     */
    @NameInMap("DbInstanceId")
    public String dbInstanceId;

    /**
     * <p>The dedicated proxy endpoint of the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test123456.rwlb.rds.aliyuncs.com</p>
     */
    @NameInMap("DbProxyConnectString")
    public String dbProxyConnectString;

    /**
     * <p>The ID of the proxy endpoint. You can call the DescribeDBProxyEndpoint operation to query the ID of the proxy endpoint.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ta9um4xxxxx</p>
     */
    @NameInMap("DbProxyEndpointId")
    public String dbProxyEndpointId;

    /**
     * <p>The SSL configuration setting that you want to apply on the instance. Valid values:</p>
     * <ul>
     * <li>0: disables SSL encryption.</li>
     * <li>1: enables SSL encryption or modifies the endpoint that requires SSL encryption.</li>
     * <li>2: updates the validity period of the SSL certificate.</li>
     * </ul>
     * <blockquote>
     * <p>This setting causes your instance to restart. Proceed with caution.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("DbProxySslEnabled")
    public String dbProxySslEnabled;

    /**
     * <p>The region ID. You can call the DescribeRegions operation to query the most recent region list.</p>
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
