// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class ExportRecallManagementTableRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>pairec-test1</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("MaxcomputeProjectName")
    public String maxcomputeProjectName;

    /**
     * <p>maxcompute schema。</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("MaxcomputeSchema")
    public String maxcomputeSchema;

    /**
     * <strong>example:</strong>
     * <p>table-1</p>
     */
    @NameInMap("MaxcomputeTableName")
    public String maxcomputeTableName;

    @NameInMap("Partitions")
    public java.util.Map<String, String> partitions;

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

}
