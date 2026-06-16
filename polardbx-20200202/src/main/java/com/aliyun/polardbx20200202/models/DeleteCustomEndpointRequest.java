// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DeleteCustomEndpointRequest extends TeaModel {
    /**
     * <p>The ID of the custom endpoint domain name.</p>
     * 
     * <strong>example:</strong>
     * <p>pxe-8if3zrfsu****hgw</p>
     */
    @NameInMap("CustomEndpointId")
    public String customEndpointId;

    /**
     * <p>The name of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>pxc-hzravgpt8q****</p>
     */
    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    /**
     * <p>The region in which the instance resides.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DeleteCustomEndpointRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteCustomEndpointRequest self = new DeleteCustomEndpointRequest();
        return TeaModel.build(map, self);
    }

    public DeleteCustomEndpointRequest setCustomEndpointId(String customEndpointId) {
        this.customEndpointId = customEndpointId;
        return this;
    }
    public String getCustomEndpointId() {
        return this.customEndpointId;
    }

    public DeleteCustomEndpointRequest setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
        return this;
    }
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    public DeleteCustomEndpointRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
