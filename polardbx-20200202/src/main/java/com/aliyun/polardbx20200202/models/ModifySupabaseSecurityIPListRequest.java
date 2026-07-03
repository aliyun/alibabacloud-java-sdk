// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class ModifySupabaseSecurityIPListRequest extends TeaModel {
    /**
     * <p>The instance name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pxsp-*********</p>
     */
    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    /**
     * <p>The whitelist group name.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("GroupName")
    public String groupName;

    /**
     * <p>The modification mode. Valid values:</p>
     * <ul>
     * <li>Cover: overwrites the existing whitelist.</li>
     * <li>Append: appends entries to the existing whitelist.</li>
     * <li>Delete: deletes entries from the existing whitelist.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Append</p>
     */
    @NameInMap("ModifyMode")
    public String modifyMode;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The IP whitelist. Separate multiple IP addresses with commas (,).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>127.0.0.1,192.168.0.0</p>
     */
    @NameInMap("SecurityIPList")
    public String securityIPList;

    public static ModifySupabaseSecurityIPListRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifySupabaseSecurityIPListRequest self = new ModifySupabaseSecurityIPListRequest();
        return TeaModel.build(map, self);
    }

    public ModifySupabaseSecurityIPListRequest setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
        return this;
    }
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    public ModifySupabaseSecurityIPListRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public ModifySupabaseSecurityIPListRequest setModifyMode(String modifyMode) {
        this.modifyMode = modifyMode;
        return this;
    }
    public String getModifyMode() {
        return this.modifyMode;
    }

    public ModifySupabaseSecurityIPListRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifySupabaseSecurityIPListRequest setSecurityIPList(String securityIPList) {
        this.securityIPList = securityIPList;
        return this;
    }
    public String getSecurityIPList() {
        return this.securityIPList;
    }

}
