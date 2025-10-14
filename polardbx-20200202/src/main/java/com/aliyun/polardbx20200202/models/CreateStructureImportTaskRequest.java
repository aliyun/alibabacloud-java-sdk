// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class CreateStructureImportTaskRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>[{\&quot;schemaName\&quot;:\&quot;transfer_test\&quot;,\&quot;tableList\&quot;:[]}]</p>
     */
    @NameInMap("Config")
    public String config;

    /**
     * <strong>example:</strong>
     * <p>pxc-********</p>
     */
    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>etx-szr2rr6i*****</p>
     */
    @NameInMap("SlinkTaskId")
    public String slinkTaskId;

    public static CreateStructureImportTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateStructureImportTaskRequest self = new CreateStructureImportTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateStructureImportTaskRequest setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public CreateStructureImportTaskRequest setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
        return this;
    }
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    public CreateStructureImportTaskRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateStructureImportTaskRequest setSlinkTaskId(String slinkTaskId) {
        this.slinkTaskId = slinkTaskId;
        return this;
    }
    public String getSlinkTaskId() {
        return this.slinkTaskId;
    }

}
