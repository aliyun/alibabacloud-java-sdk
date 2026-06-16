// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class CreateStructureImportTaskRequest extends TeaModel {
    /**
     * <p>The configuration information.</p>
     * 
     * <strong>example:</strong>
     * <p>[{\&quot;schemaName\&quot;:\&quot;transfer_test\&quot;,\&quot;tableList\&quot;:[]}]</p>
     */
    @NameInMap("Config")
    public String config;

    /**
     * <p>The instance ID. &gt; You can call the <a href="https://help.aliyun.com/document_detail/196830.html">DescribeDBInstances</a> operation to query the details of all instances in the specified region, including instance IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>pxc-********</p>
     */
    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    /**
     * <p>The region in which the instance resides.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the target task. &gt; You can call the <a href="https://help.aliyun.com/document_detail/196830.html">DescribeSlinkTasks</a> operation to query the execution status of the target task, including the task ID.</p>
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
