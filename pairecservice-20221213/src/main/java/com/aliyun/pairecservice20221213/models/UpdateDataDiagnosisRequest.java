// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class UpdateDataDiagnosisRequest extends TeaModel {
    /**
     * <p>The configuration of the data diagnosis task, provided as a JSON string. The required fields vary based on the <code>Type</code> parameter. For <code>ChangeRate</code>, specify <code>AnalysisField</code> and <code>PartitionFieldFormat</code>. For <code>PreferenceStatisticsCycle</code>, specify <code>UserIdField</code>, <code>RemainDays</code>, <code>EverAppearedDays</code>, <code>RemainRatePeriods</code>, and <code>PartitionFieldFormat</code>. For <code>JoinTables</code>, specify <code>LeftTableAnalysisField</code>, <code>RightTableAnalysisField</code>, <code>LeftJoinField</code>, <code>RightJoinField</code>, <code>SampleQuantity</code>, <code>LeftTablePartitionFieldFormat</code>, and <code>RightTablePartitionFieldFormat</code>. For <code>BaseStatistics</code>, specify <code>TagField</code>, <code>TagFieldSeparator</code>, <code>KVField</code>, <code>KVFieldSeparator</code>, <code>KVPairSeparator</code>, <code>TextField</code>, <code>Quantiles</code>, <code>DefaultValueOfString</code>, <code>NullStringField</code>, and <code>PartitionFieldFormat</code>. For <code>AbnormalBehavior</code>, specify <code>UserId</code>, <code>ItemId</code>, <code>EventField</code>, <code>UpStreamBehavior</code>, <code>DownstreamBehavior</code>, <code>NumericHistogramBins</code>, and <code>PartitionFieldFormat</code>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;AnalysisField&quot;:&quot;userid&quot;,&quot;PartitionFieldFormat&quot;:&quot;yyyymmdd&quot;}</p>
     */
    @NameInMap("Config")
    public String config;

    /**
     * <p>The execution time for periodic runs. If this field is omitted, the task does not run periodically.</p>
     * 
     * <strong>example:</strong>
     * <p>08:00</p>
     */
    @NameInMap("CycleTime")
    public String cycleTime;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>learn-pairec-xxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the left data table.</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("LeftTableMetaId")
    public String leftTableMetaId;

    /**
     * <p>The partition field of the left table.</p>
     * 
     * <strong>example:</strong>
     * <p>dt</p>
     */
    @NameInMap("LeftTablePartitionField")
    public String leftTablePartitionField;

    /**
     * <p>The name of the data diagnosis task.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>data_diagnosis_job1</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The partition field.</p>
     * 
     * <strong>example:</strong>
     * <p>dt</p>
     */
    @NameInMap("PartitionField")
    public String partitionField;

    /**
     * <p>The ID of the right data table.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("RightTableMetaId")
    public String rightTableMetaId;

    /**
     * <p>The partition field of the right table.</p>
     * 
     * <strong>example:</strong>
     * <p>dt</p>
     */
    @NameInMap("RightTablePartitionField")
    public String rightTablePartitionField;

    /**
     * <p>The ID of the data table.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("TableMetaId")
    public String tableMetaId;

    /**
     * <p>The number of top-ranked results to return.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TopNQuantity")
    public Long topNQuantity;

    /**
     * <p>The type of the data diagnosis task. Valid values:</p>
     * <ul>
     * <li><p><code>ChangeRate</code>: item/user change rate analysis.</p>
     * </li>
     * <li><p><code>PreferenceStatisticsCycle</code>: user preference statistics cycle analysis.</p>
     * </li>
     * <li><p><code>JoinTables</code>: two-table join analysis.</p>
     * </li>
     * <li><p><code>BaseStatistics</code>: basic statistical analysis.</p>
     * </li>
     * <li><p><code>AbnormalBehavior</code>: abnormal behavior analysis.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ChangeRate</p>
     */
    @NameInMap("Type")
    public String type;

    public static UpdateDataDiagnosisRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDataDiagnosisRequest self = new UpdateDataDiagnosisRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDataDiagnosisRequest setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public UpdateDataDiagnosisRequest setCycleTime(String cycleTime) {
        this.cycleTime = cycleTime;
        return this;
    }
    public String getCycleTime() {
        return this.cycleTime;
    }

    public UpdateDataDiagnosisRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateDataDiagnosisRequest setLeftTableMetaId(String leftTableMetaId) {
        this.leftTableMetaId = leftTableMetaId;
        return this;
    }
    public String getLeftTableMetaId() {
        return this.leftTableMetaId;
    }

    public UpdateDataDiagnosisRequest setLeftTablePartitionField(String leftTablePartitionField) {
        this.leftTablePartitionField = leftTablePartitionField;
        return this;
    }
    public String getLeftTablePartitionField() {
        return this.leftTablePartitionField;
    }

    public UpdateDataDiagnosisRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateDataDiagnosisRequest setPartitionField(String partitionField) {
        this.partitionField = partitionField;
        return this;
    }
    public String getPartitionField() {
        return this.partitionField;
    }

    public UpdateDataDiagnosisRequest setRightTableMetaId(String rightTableMetaId) {
        this.rightTableMetaId = rightTableMetaId;
        return this;
    }
    public String getRightTableMetaId() {
        return this.rightTableMetaId;
    }

    public UpdateDataDiagnosisRequest setRightTablePartitionField(String rightTablePartitionField) {
        this.rightTablePartitionField = rightTablePartitionField;
        return this;
    }
    public String getRightTablePartitionField() {
        return this.rightTablePartitionField;
    }

    public UpdateDataDiagnosisRequest setTableMetaId(String tableMetaId) {
        this.tableMetaId = tableMetaId;
        return this;
    }
    public String getTableMetaId() {
        return this.tableMetaId;
    }

    public UpdateDataDiagnosisRequest setTopNQuantity(Long topNQuantity) {
        this.topNQuantity = topNQuantity;
        return this;
    }
    public Long getTopNQuantity() {
        return this.topNQuantity;
    }

    public UpdateDataDiagnosisRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
