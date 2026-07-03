// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class CreateSubCNInstanceRequest extends TeaModel {
    /**
     * <p>The instance ID. &gt; You can call the <a href="https://help.aliyun.com/document_detail/196830.html">DescribeDBInstances</a> operation to query the details of all instances in the specified region, including instance IDs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pxc-hzravgpt8q****</p>
     */
    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    /**
     * <p>Specifies whether to automatically calculate compute resource parameters. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>:</li>
     * </ul>
     */
    @NameInMap("IsAutoCreate")
    public Boolean isAutoCreate;

    /**
     * <p>The read/write type. Valid values:</p>
     * <ul>
     * <li>ReadWrite: row store read/write.</li>
     * <li>ColumnarRead: column store read-only.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ReadWrite</p>
     */
    @NameInMap("ReadType")
    public String readType;

    /**
     * <p>The region ID.</p>
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
