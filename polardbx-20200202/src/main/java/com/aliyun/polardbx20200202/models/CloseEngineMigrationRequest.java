// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class CloseEngineMigrationRequest extends TeaModel {
    /**
     * <p>Specifies whether to keep binlog enabled. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Keeps binlog enabled.</li>
     * <li><strong>false</strong>: Disables binlog.</li>
     * </ul>
     * <p>Default value: <strong>true</strong>.</p>
     * <blockquote>
     * <p>Disabling binlog restarts your PolarDB cluster.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ContinueEnableBinlog")
    public String continueEnableBinlog;

    /**
     * <p>The name of the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pxc-htri0****r4k9p</p>
     */
    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static CloseEngineMigrationRequest build(java.util.Map<String, ?> map) throws Exception {
        CloseEngineMigrationRequest self = new CloseEngineMigrationRequest();
        return TeaModel.build(map, self);
    }

    public CloseEngineMigrationRequest setContinueEnableBinlog(String continueEnableBinlog) {
        this.continueEnableBinlog = continueEnableBinlog;
        return this;
    }
    public String getContinueEnableBinlog() {
        return this.continueEnableBinlog;
    }

    public CloseEngineMigrationRequest setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
        return this;
    }
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    public CloseEngineMigrationRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
