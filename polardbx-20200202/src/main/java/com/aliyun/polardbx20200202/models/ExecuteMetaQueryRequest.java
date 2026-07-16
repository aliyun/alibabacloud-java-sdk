// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class ExecuteMetaQueryRequest extends TeaModel {
    /**
     * <p>The primary instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pxsp-*********</p>
     */
    @NameInMap("DBInstanceName")
    public String DBInstanceName;

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
     * <p>The SQL statement to execute.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>show databases;</p>
     */
    @NameInMap("Sql")
    public String sql;

    /**
     * <p>The data node (DN) instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>pxc-xdb-s-*</p>
     */
    @NameInMap("StorageInstId")
    public String storageInstId;

    public static ExecuteMetaQueryRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecuteMetaQueryRequest self = new ExecuteMetaQueryRequest();
        return TeaModel.build(map, self);
    }

    public ExecuteMetaQueryRequest setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
        return this;
    }
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    public ExecuteMetaQueryRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ExecuteMetaQueryRequest setSql(String sql) {
        this.sql = sql;
        return this;
    }
    public String getSql() {
        return this.sql;
    }

    public ExecuteMetaQueryRequest setStorageInstId(String storageInstId) {
        this.storageInstId = storageInstId;
        return this;
    }
    public String getStorageInstId() {
        return this.storageInstId;
    }

}
