// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class UpdateDataDiagnosisRequest extends TeaModel {
    /**
     * <p>The configuration details of the data diagnostic task. If <code>Type</code> is set to <code>ChangeRate</code>, include the analysis field (<code>AnalysisField</code>) and partition field format (<code>PartitionFieldFormat</code>). If <code>Type</code> is set to <code>PreferenceStatisticsCycle</code>, include the user ID field (<code>UserIdField</code>), single-day retention rate statistical period (<code>RemainDays</code>), appearance rate statistical period (<code>EverAppearedDays</code>), periodic retention rate statistical period (<code>RemainRatePeriods</code>), and partition field format (<code>PartitionFieldFormat</code>). If <code>Type</code> is set to <code>JoinTables</code>, include the left table analysis field (<code>LeftTableAnalysisField</code>), right table analysis field (<code>RightTableAnalysisField</code>), left table JOIN field (<code>LeftJoinField</code>), right table JOIN field (<code>RightJoinField</code>), sample quantity for display (<code>SampleQuantity</code>), left table partition field format (<code>LeftTablePartitionFieldFormat</code>), and right table partition field format (<code>RightTablePartitionFieldFormat</code>). If <code>Type</code> is set to <code>BaseStatistics</code>, include the Tag field (<code>TagField</code>), Tag field separator (<code>TagFieldSeparator</code>), KV field (<code>KVField</code>), KV field separator (<code>KVFieldSeparator</code>), KV pair separator (<code>KVPairSeparator</code>), Text field (<code>TextField</code>), data percentile distribution (<code>Quantiles</code>), default value for the string type (<code>DefaultValueOfString</code>), null value field for the string type (<code>NullStringField</code>), and partition field format (<code>PartitionFieldFormat</code>). If <code>Type</code> is set to <code>AbnormalBehavior</code>, include the user ID field (<code>UserId</code>), item ID field (<code>ItemId</code>), behavior field (<code>EventField</code>), upstream behavior value (<code>UpStreamBehavior</code>), downstream behavior value (<code>DownstreamBehavior</code>), number of buckets (<code>NumericHistogramBins</code>), and partition field format (<code>PartitionFieldFormat</code>).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;AnalysisField&quot;:&quot;userid&quot;,&quot;PartitionFieldFormat&quot;:&quot;yyyymmdd&quot;}</p>
     */
    @NameInMap("Config")
    public String config;

    /**
     * <p>The periodic execution time. If this field is left empty, the task does not run periodically. Format: HH:mm.</p>
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
     * <p>The ID of the left table.</p>
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
     * <p>The name of the data diagnostic task configuration.</p>
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
     * <p>The ID of the right table.</p>
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
     * <p>The Top N quantity.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TopNQuantity")
    public Long topNQuantity;

    /**
     * <p>The type of the data diagnostic task. Valid values:</p>
     * <ul>
     * <li>ChangeRate: item or user change rate analysis</li>
     * <li>PreferenceStatisticsCycle: user preference statistical period analysis</li>
     * <li>JoinTables: two-table association analysis</li>
     * <li>BaseStatistics: basic statistical analysis</li>
     * <li>AbnormalBehavior: abnormal behavior analysis</li>
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
