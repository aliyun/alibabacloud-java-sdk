// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class CreatePxfsUserRequest extends TeaModel {
    /**
     * <p>The instance ID of the PolarDB-X instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pxc-xxxxxxxx</p>
     */
    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    /**
     * <p>The identity name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>agent-runtime</p>
     */
    @NameInMap("IdentityName")
    public String identityName;

    /**
     * <p>POSIX GID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("PosixGid")
    public Long posixGid;

    /**
     * <p>POSIX UID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("PosixUid")
    public Long posixUid;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The identity role.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>MEMBER</p>
     */
    @NameInMap("Role")
    public String role;

    /**
     * <p>The tenant ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>tenant-001</p>
     */
    @NameInMap("TenantId")
    public String tenantId;

    public static CreatePxfsUserRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePxfsUserRequest self = new CreatePxfsUserRequest();
        return TeaModel.build(map, self);
    }

    public CreatePxfsUserRequest setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
        return this;
    }
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    public CreatePxfsUserRequest setIdentityName(String identityName) {
        this.identityName = identityName;
        return this;
    }
    public String getIdentityName() {
        return this.identityName;
    }

    public CreatePxfsUserRequest setPosixGid(Long posixGid) {
        this.posixGid = posixGid;
        return this;
    }
    public Long getPosixGid() {
        return this.posixGid;
    }

    public CreatePxfsUserRequest setPosixUid(Long posixUid) {
        this.posixUid = posixUid;
        return this;
    }
    public Long getPosixUid() {
        return this.posixUid;
    }

    public CreatePxfsUserRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreatePxfsUserRequest setRole(String role) {
        this.role = role;
        return this;
    }
    public String getRole() {
        return this.role;
    }

    public CreatePxfsUserRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
