// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class CreateSubCNInstanceRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pxc-hzravgpt8q****</p>
     */
    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    @NameInMap("IsAutoCreate")
    public Boolean isAutoCreate;

    /**
     * <strong>example:</strong>
     * <p>ReadWrite</p>
     */
    @NameInMap("ReadType")
    public String readType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static CreateSubCNInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSubCNInstanceRequest self = new CreateSubCNInstanceRequest();
        return TeaModel.build(map, self);
    }

    public CreateSubCNInstanceRequest setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
        return this;
    }
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    public CreateSubCNInstanceRequest setIsAutoCreate(Boolean isAutoCreate) {
        this.isAutoCreate = isAutoCreate;
        return this;
    }
    public Boolean getIsAutoCreate() {
        return this.isAutoCreate;
    }

    public CreateSubCNInstanceRequest setReadType(String readType) {
        this.readType = readType;
        return this;
    }
    public String getReadType() {
        return this.readType;
    }

    public CreateSubCNInstanceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
