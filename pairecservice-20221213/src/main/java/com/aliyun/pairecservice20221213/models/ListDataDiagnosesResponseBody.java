// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class ListDataDiagnosesResponseBody extends TeaModel {
    /**
     * <p>The list of data diagnoses.</p>
     */
    @NameInMap("DataDiagnoses")
    public java.util.List<ListDataDiagnosesResponseBodyDataDiagnoses> dataDiagnoses;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>728C5E01-ABF6-5AA8-B9FC-B3BA05DECC77</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListDataDiagnosesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDataDiagnosesResponseBody self = new ListDataDiagnosesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDataDiagnosesResponseBody setDataDiagnoses(java.util.List<ListDataDiagnosesResponseBodyDataDiagnoses> dataDiagnoses) {
        this.dataDiagnoses = dataDiagnoses;
        return this;
    }
    public java.util.List<ListDataDiagnosesResponseBodyDataDiagnoses> getDataDiagnoses() {
        return this.dataDiagnoses;
    }

    public ListDataDiagnosesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDataDiagnosesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListDataDiagnosesResponseBodyDataDiagnoses extends TeaModel {
        /**
         * <p>The configuration for the data diagnosis task, in JSON format. The required fields depend on the <code>Type</code> value:<br></p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;AnalysisField&quot;: &quot;userid&quot;,&quot;PartitionFieldFormat&quot;: &quot;yyyymmdd&quot;}</p>
         */
        @NameInMap("Config")
        public String config;

        /**
         * <p>The time at which the task is scheduled to run periodically. If this parameter is empty, the task runs only once.</p>
         * 
         * <strong>example:</strong>
         * <p>08:00</p>
         */
        @NameInMap("CycleTime")
        public String cycleTime;

        /**
         * <p>The data diagnosis ID.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("DataDiagnosisId")
        public String dataDiagnosisId;

        /**
         * <p>The time when the task was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-12-15T23:24:33.132+08:00</p>
         */
        @NameInMap("GmtCreateTime")
        public String gmtCreateTime;

        /**
         * <p>The time when the task was last updated.</p>
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
         * <p>The partition field of the left table.</p>
         * 
         * <strong>example:</strong>
         * <p>dt</p>
         */
        @NameInMap("LeftTablePartitionField")
        public String leftTablePartitionField;

        /**
         * <p>The name of the data diagnosis.</p>
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
         * <p>The data table ID.</p>
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
         * <p>The number of top results to return.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("TopNQuantity")
        public Long topNQuantity;

        /**
         * <p>The type of data diagnosis. Valid values:</p>
         * <ul>
         * <li><p><code>ChangeRate</code>: Change Rate Analysis.</p>
         * </li>
         * <li><p><code>PreferenceStatisticsCycle</code>: Preference Statistics Cycle Analysis.</p>
         * </li>
         * <li><p><code>JoinTables</code>: Join Tables Analysis.</p>
         * </li>
         * <li><p><code>BaseStatistics</code>: Base Statistics Analysis.</p>
         * </li>
         * <li><p><code>AbnormalBehavior</code>: Abnormal Behavior Analysis.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ChangeRate</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListDataDiagnosesResponseBodyDataDiagnoses build(java.util.Map<String, ?> map) throws Exception {
            ListDataDiagnosesResponseBodyDataDiagnoses self = new ListDataDiagnosesResponseBodyDataDiagnoses();
            return TeaModel.build(map, self);
        }

        public ListDataDiagnosesResponseBodyDataDiagnoses setConfig(String config) {
            this.config = config;
            return this;
        }
        public String getConfig() {
            return this.config;
        }

        public ListDataDiagnosesResponseBodyDataDiagnoses setCycleTime(String cycleTime) {
            this.cycleTime = cycleTime;
            return this;
        }
        public String getCycleTime() {
            return this.cycleTime;
        }

        public ListDataDiagnosesResponseBodyDataDiagnoses setDataDiagnosisId(String dataDiagnosisId) {
            this.dataDiagnosisId = dataDiagnosisId;
            return this;
        }
        public String getDataDiagnosisId() {
            return this.dataDiagnosisId;
        }

        public ListDataDiagnosesResponseBodyDataDiagnoses setGmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }
        public String getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        public ListDataDiagnosesResponseBodyDataDiagnoses setGmtModifiedTime(String gmtModifiedTime) {
            this.gmtModifiedTime = gmtModifiedTime;
            return this;
        }
        public String getGmtModifiedTime() {
            return this.gmtModifiedTime;
        }

        public ListDataDiagnosesResponseBodyDataDiagnoses setLeftTableMetaId(String leftTableMetaId) {
            this.leftTableMetaId = leftTableMetaId;
            return this;
        }
        public String getLeftTableMetaId() {
            return this.leftTableMetaId;
        }

        public ListDataDiagnosesResponseBodyDataDiagnoses setLeftTablePartitionField(String leftTablePartitionField) {
            this.leftTablePartitionField = leftTablePartitionField;
            return this;
        }
        public String getLeftTablePartitionField() {
            return this.leftTablePartitionField;
        }

        public ListDataDiagnosesResponseBodyDataDiagnoses setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListDataDiagnosesResponseBodyDataDiagnoses setPartitionField(String partitionField) {
            this.partitionField = partitionField;
            return this;
        }
        public String getPartitionField() {
            return this.partitionField;
        }

        public ListDataDiagnosesResponseBodyDataDiagnoses setRightTableMetaId(String rightTableMetaId) {
            this.rightTableMetaId = rightTableMetaId;
            return this;
        }
        public String getRightTableMetaId() {
            return this.rightTableMetaId;
        }

        public ListDataDiagnosesResponseBodyDataDiagnoses setRightTablePartitionField(String rightTablePartitionField) {
            this.rightTablePartitionField = rightTablePartitionField;
            return this;
        }
        public String getRightTablePartitionField() {
            return this.rightTablePartitionField;
        }

        public ListDataDiagnosesResponseBodyDataDiagnoses setTableMetaId(String tableMetaId) {
            this.tableMetaId = tableMetaId;
            return this;
        }
        public String getTableMetaId() {
            return this.tableMetaId;
        }

        public ListDataDiagnosesResponseBodyDataDiagnoses setTableMetaName(String tableMetaName) {
            this.tableMetaName = tableMetaName;
            return this;
        }
        public String getTableMetaName() {
            return this.tableMetaName;
        }

        public ListDataDiagnosesResponseBodyDataDiagnoses setTopNQuantity(Long topNQuantity) {
            this.topNQuantity = topNQuantity;
            return this;
        }
        public Long getTopNQuantity() {
            return this.topNQuantity;
        }

        public ListDataDiagnosesResponseBodyDataDiagnoses setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
