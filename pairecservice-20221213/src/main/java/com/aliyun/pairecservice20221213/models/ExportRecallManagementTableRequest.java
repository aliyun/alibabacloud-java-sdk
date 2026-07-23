// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class ExportRecallManagementTableRequest extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>pairec-test1</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The MaxCompute project name.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("MaxcomputeProjectName")
    public String maxcomputeProjectName;

    /**
     * <p>The MaxCompute project schema.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("MaxcomputeSchema")
    public String maxcomputeSchema;

    /**
     * <p>The name of the destination table in MaxCompute.</p>
     * 
     * <strong>example:</strong>
     * <p>table-1</p>
     */
    @NameInMap("MaxcomputeTableName")
    public String maxcomputeTableName;

    /**
     * <p>The table partitions to export. The value must be a JSON object where each key is a partition field and its value is the corresponding partition value.</p>
     */
    @NameInMap("Partitions")
    public java.util.Map<String, String> partitions;

    /**
     * <p>The version ID of the recall management table. This parameter defaults to the current published version.</p>
     * 
     * <strong>example:</strong>
     * <p>20250213000000</p>
     */
    @NameInMap("RecallManagementTableVersionId")
    public String recallManagementTableVersionId;

    public static ExportRecallManagementTableRequest build(java.util.Map<String, ?> map) throws Exception {
        ExportRecallManagementTableRequest self = new ExportRecallManagementTableRequest();
        return TeaModel.build(map, self);
    }

    public ExportRecallManagementTableRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ExportRecallManagementTableRequest setMaxcomputeProjectName(String maxcomputeProjectName) {
        this.maxcomputeProjectName = maxcomputeProjectName;
        return this;
    }
    public String getMaxcomputeProjectName() {
        return this.maxcomputeProjectName;
    }

    public ExportRecallManagementTableRequest setMaxcomputeSchema(String maxcomputeSchema) {
        this.maxcomputeSchema = maxcomputeSchema;
        return this;
    }
    public String getMaxcomputeSchema() {
        return this.maxcomputeSchema;
    }

    public ExportRecallManagementTableRequest setMaxcomputeTableName(String maxcomputeTableName) {
        this.maxcomputeTableName = maxcomputeTableName;
        return this;
    }
    public String getMaxcomputeTableName() {
        return this.maxcomputeTableName;
    }

    public ExportRecallManagementTableRequest setPartitions(java.util.Map<String, String> partitions) {
        this.partitions = partitions;
        return this;
    }
    public java.util.Map<String, String> getPartitions() {
        return this.partitions;
    }

    public ExportRecallManagementTableRequest setRecallManagementTableVersionId(String recallManagementTableVersionId) {
        this.recallManagementTableVersionId = recallManagementTableVersionId;
        return this;
    }
    public String getRecallManagementTableVersionId() {
        return this.recallManagementTableVersionId;
    }

}
