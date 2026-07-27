// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class DeleteAppInstanceRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. The client generates the value of this parameter to prevent duplicate requests from being submitted.</p>
     * 
     * <strong>example:</strong>
     * <p>ETnLKlblzczshOTUbOCz****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to delete the corresponding database instance.</p>
     */
    @NameInMap("DeleteDBInstance")
    public Boolean deleteDBInstance;

    /**
     * <p>The instance ID of the AI application.</p>
     * 
     * <strong>example:</strong>
     * <p>ra-supabase-8moov5lxba****</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DeleteAppInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAppInstanceRequest self = new DeleteAppInstanceRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAppInstanceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DeleteAppInstanceRequest setDeleteDBInstance(Boolean deleteDBInstance) {
        this.deleteDBInstance = deleteDBInstance;
        return this;
    }
    public Boolean getDeleteDBInstance() {
        return this.deleteDBInstance;
    }

    public DeleteAppInstanceRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public DeleteAppInstanceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
