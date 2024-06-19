// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DisableRightsSeparationRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pxc-sprcym7g7w****</p>
     */
    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>account_1</p>
     */
    @NameInMap("DbaAccountName")
    public String dbaAccountName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("DbaAccountPassword")
    public String dbaAccountPassword;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hanghzou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DisableRightsSeparationRequest build(java.util.Map<String, ?> map) throws Exception {
        DisableRightsSeparationRequest self = new DisableRightsSeparationRequest();
        return TeaModel.build(map, self);
    }

    public DisableRightsSeparationRequest setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
        return this;
    }
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    public DisableRightsSeparationRequest setDbaAccountName(String dbaAccountName) {
        this.dbaAccountName = dbaAccountName;
        return this;
    }
    public String getDbaAccountName() {
        return this.dbaAccountName;
    }

    public DisableRightsSeparationRequest setDbaAccountPassword(String dbaAccountPassword) {
        this.dbaAccountPassword = dbaAccountPassword;
        return this;
    }
    public String getDbaAccountPassword() {
        return this.dbaAccountPassword;
    }

    public DisableRightsSeparationRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
