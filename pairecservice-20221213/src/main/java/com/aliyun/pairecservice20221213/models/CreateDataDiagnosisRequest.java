// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class CreateDataDiagnosisRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{ &quot;AnalysisField&quot;: &quot;userid&quot;, &quot;PartitionFieldFormat&quot;: &quot;yyyymmdd&quot; }</p>
     */
    @NameInMap("Config")
    public String config;

    /**
     * <strong>example:</strong>
     * <p>08:00</p>
     */
    @NameInMap("CycleTime")
    public String cycleTime;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>learn-pairec-xxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("LeftTableMetaId")
    public String leftTableMetaId;

    /**
     * <strong>example:</strong>
     * <p>dt</p>
     */
    @NameInMap("LeftTablePartitionField")
    public String leftTablePartitionField;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>data_diagnosis_job1</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>dt</p>
     */
    @NameInMap("PartitionField")
    public String partitionField;

    /**
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("RightTableMetaId")
    public String rightTableMetaId;

    /**
     * <strong>example:</strong>
     * <p>dt</p>
     */
    @NameInMap("RightTablePartitionField")
    public String rightTablePartitionField;

    /**
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("TableMetaId")
    public String tableMetaId;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TopNQuantity")
    public Long topNQuantity;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ChangeRate</p>
     */
    @NameInMap("Type")
    public String type;

    public static CreateDataDiagnosisRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDataDiagnosisRequest self = new CreateDataDiagnosisRequest();
        return TeaModel.build(map, self);
    }

    public CreateDataDiagnosisRequest setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public CreateDataDiagnosisRequest setCycleTime(String cycleTime) {
        this.cycleTime = cycleTime;
        return this;
    }
    public String getCycleTime() {
        return this.cycleTime;
    }

    public CreateDataDiagnosisRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateDataDiagnosisRequest setLeftTableMetaId(String leftTableMetaId) {
        this.leftTableMetaId = leftTableMetaId;
        return this;
    }
    public String getLeftTableMetaId() {
        return this.leftTableMetaId;
    }

    public CreateDataDiagnosisRequest setLeftTablePartitionField(String leftTablePartitionField) {
        this.leftTablePartitionField = leftTablePartitionField;
        return this;
    }
    public String getLeftTablePartitionField() {
        return this.leftTablePartitionField;
    }

    public CreateDataDiagnosisRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateDataDiagnosisRequest setPartitionField(String partitionField) {
        this.partitionField = partitionField;
        return this;
    }
    public String getPartitionField() {
        return this.partitionField;
    }

    public CreateDataDiagnosisRequest setRightTableMetaId(String rightTableMetaId) {
        this.rightTableMetaId = rightTableMetaId;
        return this;
    }
    public String getRightTableMetaId() {
        return this.rightTableMetaId;
    }

    public CreateDataDiagnosisRequest setRightTablePartitionField(String rightTablePartitionField) {
        this.rightTablePartitionField = rightTablePartitionField;
        return this;
    }
    public String getRightTablePartitionField() {
        return this.rightTablePartitionField;
    }

    public CreateDataDiagnosisRequest setTableMetaId(String tableMetaId) {
        this.tableMetaId = tableMetaId;
        return this;
    }
    public String getTableMetaId() {
        return this.tableMetaId;
    }

    public CreateDataDiagnosisRequest setTopNQuantity(Long topNQuantity) {
        this.topNQuantity = topNQuantity;
        return this;
    }
    public Long getTopNQuantity() {
        return this.topNQuantity;
    }

    public CreateDataDiagnosisRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
