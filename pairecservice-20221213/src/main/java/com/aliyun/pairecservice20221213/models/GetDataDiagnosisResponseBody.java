// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class GetDataDiagnosisResponseBody extends TeaModel {
    /**
     * <p>The configuration of the data diagnosis task.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;AnalysisField&quot;:&quot;userid&quot;,&quot;PartitionFieldFormat&quot;:&quot;yyyymmdd&quot;}</p>
     */
    @NameInMap("Config")
    public String config;

    /**
     * <p>The time for periodic execution. If this field is empty, the task does not execute periodically.</p>
     * 
     * <strong>example:</strong>
     * <p>08:00</p>
     */
    @NameInMap("CycleTime")
    public String cycleTime;

    /**
     * <p>The creation time.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-12-15T23:24:33.132+08:00</p>
     */
    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    /**
     * <p>The modification time.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-12-15T23:24:33.132+08:00</p>
     */
    @NameInMap("GmtModifiedTime")
    public String gmtModifiedTime;

    /**
     * <p>The ID of the left data table.</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("LeftTableMetaId")
    public String leftTableMetaId;

    /**
     * <p>The partition field of the left data table.</p>
     * 
     * <strong>example:</strong>
     * <p>dt</p>
     */
    @NameInMap("LeftTablePartitionField")
    public String leftTablePartitionField;

    /**
     * <p>The name of the data diagnosis task.</p>
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
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>728C5E01-ABF6-5AA8-B9FC-B3BA05DECC77</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the right data table.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("RightTableMetaId")
    public String rightTableMetaId;

    /**
     * <p>The partition field of the right data table.</p>
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
     * <p>The name of the data table.</p>
     * 
     * <strong>example:</strong>
     * <p>table_meta_1</p>
     */
    @NameInMap("TableMetaName")
    public String tableMetaName;

    /**
     * <p>The Top-N quantity.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TopNQuantity")
    public Long topNQuantity;

    /**
     * <p>The type of the data diagnosis task.</p>
     * 
     * <strong>example:</strong>
     * <p>ChangeRate</p>
     */
    @NameInMap("Type")
    public String type;

    public static GetDataDiagnosisResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDataDiagnosisResponseBody self = new GetDataDiagnosisResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDataDiagnosisResponseBody setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public GetDataDiagnosisResponseBody setCycleTime(String cycleTime) {
        this.cycleTime = cycleTime;
        return this;
    }
    public String getCycleTime() {
        return this.cycleTime;
    }

    public GetDataDiagnosisResponseBody setGmtCreateTime(String gmtCreateTime) {
        this.gmtCreateTime = gmtCreateTime;
        return this;
    }
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    public GetDataDiagnosisResponseBody setGmtModifiedTime(String gmtModifiedTime) {
        this.gmtModifiedTime = gmtModifiedTime;
        return this;
    }
    public String getGmtModifiedTime() {
        return this.gmtModifiedTime;
    }

    public GetDataDiagnosisResponseBody setLeftTableMetaId(String leftTableMetaId) {
        this.leftTableMetaId = leftTableMetaId;
        return this;
    }
    public String getLeftTableMetaId() {
        return this.leftTableMetaId;
    }

    public GetDataDiagnosisResponseBody setLeftTablePartitionField(String leftTablePartitionField) {
        this.leftTablePartitionField = leftTablePartitionField;
        return this;
    }
    public String getLeftTablePartitionField() {
        return this.leftTablePartitionField;
    }

    public GetDataDiagnosisResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetDataDiagnosisResponseBody setPartitionField(String partitionField) {
        this.partitionField = partitionField;
        return this;
    }
    public String getPartitionField() {
        return this.partitionField;
    }

    public GetDataDiagnosisResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDataDiagnosisResponseBody setRightTableMetaId(String rightTableMetaId) {
        this.rightTableMetaId = rightTableMetaId;
        return this;
    }
    public String getRightTableMetaId() {
        return this.rightTableMetaId;
    }

    public GetDataDiagnosisResponseBody setRightTablePartitionField(String rightTablePartitionField) {
        this.rightTablePartitionField = rightTablePartitionField;
        return this;
    }
    public String getRightTablePartitionField() {
        return this.rightTablePartitionField;
    }

    public GetDataDiagnosisResponseBody setTableMetaId(String tableMetaId) {
        this.tableMetaId = tableMetaId;
        return this;
    }
    public String getTableMetaId() {
        return this.tableMetaId;
    }

    public GetDataDiagnosisResponseBody setTableMetaName(String tableMetaName) {
        this.tableMetaName = tableMetaName;
        return this;
    }
    public String getTableMetaName() {
        return this.tableMetaName;
    }

    public GetDataDiagnosisResponseBody setTopNQuantity(Long topNQuantity) {
        this.topNQuantity = topNQuantity;
        return this;
    }
    public Long getTopNQuantity() {
        return this.topNQuantity;
    }

    public GetDataDiagnosisResponseBody setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
