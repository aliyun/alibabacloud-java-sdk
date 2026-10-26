// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class CreateDataDiagnosisRequest extends TeaModel {
    /**
     * <p>The configuration content of the data modeling diagnostic task.</p>
     * <ul>
     * <li><p>If Type is set to ChangeRate, the configuration must include: analysis field (AnalysisField) and partition field format (PartitionFieldFormat).</p>
     * </li>
     * <li><p>If Type is set to PreferenceStatisticsCycle, the configuration must include: user ID field (UserIdField), single-day retention rate statistical period (RemainDays), ever-appeared rate statistical period (EverAppearedDays), periodic retention rate statistical period (RemainRatePeriods), and partition field format (PartitionFieldFormat).</p>
     * </li>
     * <li><p>If Type is set to JoinTables, the configuration must include: left table analysis field (LeftTableAnalysisField), right table analysis field (RightTableAnalysisField), left table JOIN field (LeftJoinField), right table JOIN field (RightJoinField), display sample quantity (SampleQuantity), left table partition field format (LeftTablePartitionFieldFormat), and right table partition field format (RightTablePartitionFieldFormat).</p>
     * </li>
     * <li><p>If Type is set to BaseStatistics, the configuration must include: tag field (TagField), tag field separator (TagFieldSeparator), KV field (KVField), KV field separator (KVFieldSeparator), KV pair separator (KVPairSeparator), text field (TextField), data percentile distribution (Quantiles), default value for string type (DefaultValueOfString), null string field for string type (NullStringField), and partition field format (PartitionFieldFormat).</p>
     * </li>
     * <li><p>If Type is set to AbnormalBehavior, the configuration must include: user ID field (UserId), item ID field (ItemId), behavior field (EventField), upstream behavior value (UpStreamBehavior), downstream behavior value (DownstreamBehavior), number of histogram bins (NumericHistogramBins), and partition field format (PartitionFieldFormat).</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{ &quot;AnalysisField&quot;: &quot;userid&quot;, &quot;PartitionFieldFormat&quot;: &quot;yyyymmdd&quot; }</p>
     */
    @NameInMap("Config")
    public String config;

    /**
     * <p>The periodic run time. If this field is empty, the task does not run periodically. The format is HH:mm.</p>
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
     * <p>The name of the data modeling diagnostic task configuration.</p>
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
     * <p>The number of top N results.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TopNQuantity")
    public Long topNQuantity;

    /**
     * <p>The type of the data diagnostic task. Valid values:</p>
     * <ul>
     * <li><p>ChangeRate: item/user change rate analysis.</p>
     * </li>
     * <li><p>PreferenceStatisticsCycle: user preference statistical period analysis.</p>
     * </li>
     * <li><p>JoinTables: join table analysis.</p>
     * </li>
     * <li><p>BaseStatistics: basic statistics analysis.</p>
     * </li>
     * <li><p>AbnormalBehavior: abnormal behavior analysis.</p>
     * </li>
     * </ul>
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
