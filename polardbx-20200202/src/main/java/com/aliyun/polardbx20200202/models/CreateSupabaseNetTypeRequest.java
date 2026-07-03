// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class CreateSupabaseNetTypeRequest extends TeaModel {
    /**
     * <p>The custom endpoint prefix.</p>
     * 
     * <strong>example:</strong>
     * <p>pxsp-*********</p>
     */
    @NameInMap("ConnectionString")
    public String connectionString;

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
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static CreateSupabaseNetTypeRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSupabaseNetTypeRequest self = new CreateSupabaseNetTypeRequest();
        return TeaModel.build(map, self);
    }

    public CreateSupabaseNetTypeRequest setConnectionString(String connectionString) {
        this.connectionString = connectionString;
        return this;
    }
    public String getConnectionString() {
        return this.connectionString;
    }

    public CreateSupabaseNetTypeRequest setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
        return this;
    }
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    public CreateSupabaseNetTypeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
