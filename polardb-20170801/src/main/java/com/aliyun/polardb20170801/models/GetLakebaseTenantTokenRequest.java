// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class GetLakebaseTenantTokenRequest extends TeaModel {
    /**
     * <p>The associated PolarDB instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-xxx</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The PolarFS instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pfs-xxx</p>
     */
    @NameInMap("PolarFsInstanceId")
    public String polarFsInstanceId;

    /**
     * <p>The mount subdirectory. Specify an absolute path.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>/home/project/p1</p>
     */
    @NameInMap("Subdir")
    public String subdir;

    /**
     * <p>The tenant identifier.</p>
     * 
     * <strong>example:</strong>
     * <p>tenant-xxx</p>
     */
    @NameInMap("Tenant")
    public String tenant;

    public static GetLakebaseTenantTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLakebaseTenantTokenRequest self = new GetLakebaseTenantTokenRequest();
        return TeaModel.build(map, self);
    }

    public GetLakebaseTenantTokenRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public GetLakebaseTenantTokenRequest setPolarFsInstanceId(String polarFsInstanceId) {
        this.polarFsInstanceId = polarFsInstanceId;
        return this;
    }
    public String getPolarFsInstanceId() {
        return this.polarFsInstanceId;
    }

    public GetLakebaseTenantTokenRequest setSubdir(String subdir) {
        this.subdir = subdir;
        return this;
    }
    public String getSubdir() {
        return this.subdir;
    }

    public GetLakebaseTenantTokenRequest setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

}
