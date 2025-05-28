// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryDatasetInfoResponseBody extends TeaModel {
    /**
     * <p>Whether the operation is successfully returned. Valid values:</p>
     * <ul>
     * <li>true: The call is successful.</li>
     * <li>false: The call fails.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>a4d1a221d-41za1-****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("Result")
    public QueryDatasetInfoResponseBodyResult result;

    /**
     * <p>The unique ID of the dataset.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QueryDatasetInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryDatasetInfoResponseBody self = new QueryDatasetInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryDatasetInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDatasetInfoResponseBody setResult(QueryDatasetInfoResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public QueryDatasetInfoResponseBodyResult getResult() {
        return this.result;
    }

    public QueryDatasetInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryDatasetInfoResponseBodyResultCubeTableList extends TeaModel {
        /**
         * <p>Indicates whether the data source table is valid. Valid values:</p>
         * <ul>
         * <li>true: data source table</li>
         * <li>false: custom table</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>odps_40</p>
         */
        @NameInMap("Caption")
        public String caption;

        /**
         * <p>The display name of the table.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Customsql")
        public Boolean customsql;

        /**
         * <p>The name of the table.</p>
         * 
         * <strong>example:</strong>
         * <p>dfefd7f4-fc6e-42c9-b4******</p>
         */
        @NameInMap("DatasourceId")
        public String datasourceId;

        /**
         * <p>The ID of the data source.</p>
         * 
         * <strong>example:</strong>
         * <p>maxcompute</p>
         */
        @NameInMap("DsType")
        public String dsType;

        /**
         * <p>The unique ID of the table.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("FactTable")
        public Boolean factTable;

        /**
         * <p>Indicates whether the table is a custom SQL table. Valid values:</p>
         * <ul>
         * <li>true: custom SQL table</li>
         * <li>false: non-custom SQL table</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>select * from ****</p>
         */
        @NameInMap("Sql")
        public String sql;

        /**
         * <p>The list of tables used by the dataset.</p>
         * 
         * <strong>example:</strong>
         * <p>viewdasb8494aab2612473cb74992159fe****</p>
         */
        @NameInMap("TableName")
        public String tableName;

        /**
         * <p>The type of the data source. Valid values:</p>
         * <ul>
         * <li>mysql</li>
         * <li>odps</li>
         * <li>oracle</li>
         * <li>... and other data source types supported by Quick BI</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>7a62530b36</p>
         */
        @NameInMap("UniqueId")
        public String uniqueId;

        public static QueryDatasetInfoResponseBodyResultCubeTableList build(java.util.Map<String, ?> map) throws Exception {
            QueryDatasetInfoResponseBodyResultCubeTableList self = new QueryDatasetInfoResponseBodyResultCubeTableList();
            return TeaModel.build(map, self);
        }

        public QueryDatasetInfoResponseBodyResultCubeTableList setCaption(String caption) {
            this.caption = caption;
            return this;
        }
        public String getCaption() {
            return this.caption;
        }

        public QueryDatasetInfoResponseBodyResultCubeTableList setCustomsql(Boolean customsql) {
            this.customsql = customsql;
            return this;
        }
        public Boolean getCustomsql() {
            return this.customsql;
        }

        public QueryDatasetInfoResponseBodyResultCubeTableList setDatasourceId(String datasourceId) {
            this.datasourceId = datasourceId;
            return this;
        }
        public String getDatasourceId() {
            return this.datasourceId;
        }

        public QueryDatasetInfoResponseBodyResultCubeTableList setDsType(String dsType) {
            this.dsType = dsType;
            return this;
        }
        public String getDsType() {
            return this.dsType;
        }

        public QueryDatasetInfoResponseBodyResultCubeTableList setFactTable(Boolean factTable) {
            this.factTable = factTable;
            return this;
        }
        public Boolean getFactTable() {
            return this.factTable;
        }

        public QueryDatasetInfoResponseBodyResultCubeTableList setSql(String sql) {
            this.sql = sql;
            return this;
        }
        public String getSql() {
            return this.sql;
        }

        public QueryDatasetInfoResponseBodyResultCubeTableList setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

        public QueryDatasetInfoResponseBodyResultCubeTableList setUniqueId(String uniqueId) {
            this.uniqueId = uniqueId;
            return this;
        }
        public String getUniqueId() {
            return this.uniqueId;
        }

    }

    public static class QueryDatasetInfoResponseBodyResultDimensionList extends TeaModel {
        /**
         * <p>The unique ID of the field that is referenced by the group measure. Non-NULL if and only if the metric is a grouping metric.</p>
         * 
         * <strong>example:</strong>
         * <p>city</p>
         */
        @NameInMap("Caption")
        public String caption;

        /**
         * <p>A list of all dimensions in the dataset.</p>
         * 
         * <strong>example:</strong>
         * <p>string</p>
         */
        @NameInMap("DataType")
        public String dataType;

        /**
         * <p>The actual physical field.</p>
         * 
         * <strong>example:</strong>
         * <p>group_dimension</p>
         */
        @NameInMap("DimensionType")
        public String dimensionType;

        /**
         * <p>Data type; value:</p>
         * <ul>
         * <li>string: character</li>
         * <li>number: a number</li>
         * <li>datetime: time</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>example_expression</p>
         */
        @NameInMap("Expression")
        public String expression;

        /**
         * <strong>if can be null:</strong>
         * <p>true</p>
         */
        @NameInMap("ExpressionV2")
        public String expressionV2;

        /**
         * <p>Expression for a calculated dimension; valid only for calculated dimensions.</p>
         * 
         * <strong>example:</strong>
         * <p>city</p>
         */
        @NameInMap("FactColumn")
        public String factColumn;

        /**
         * <strong>example:</strong>
         * <p>hhhh</p>
         */
        @NameInMap("FieldDescription")
        public String fieldDescription;

        /**
         * <p>The type of the dimension. Valid values:</p>
         * <ul>
         * <li>standard_dimension: General Dimension</li>
         * <li>calculate_dimension: calculating dimensions</li>
         * <li>group_dimension: grouping dimensions</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>example_granularity</p>
         */
        @NameInMap("Granularity")
        public String granularity;

        /**
         * <p>The granularity.</p>
         * 
         * <strong>example:</strong>
         * <p>308f7****</p>
         */
        @NameInMap("RefUid")
        public String refUid;

        /**
         * <p>The ARN.</p>
         * 
         * <strong>example:</strong>
         * <p>7a62530***</p>
         */
        @NameInMap("TableUniqueId")
        public String tableUniqueId;

        /**
         * <p>The display name of the dimension.</p>
         * 
         * <strong>example:</strong>
         * <p>a69774***</p>
         */
        @NameInMap("Uid")
        public String uid;

        public static QueryDatasetInfoResponseBodyResultDimensionList build(java.util.Map<String, ?> map) throws Exception {
            QueryDatasetInfoResponseBodyResultDimensionList self = new QueryDatasetInfoResponseBodyResultDimensionList();
            return TeaModel.build(map, self);
        }

        public QueryDatasetInfoResponseBodyResultDimensionList setCaption(String caption) {
            this.caption = caption;
            return this;
        }
        public String getCaption() {
            return this.caption;
        }

        public QueryDatasetInfoResponseBodyResultDimensionList setDataType(String dataType) {
            this.dataType = dataType;
            return this;
        }
        public String getDataType() {
            return this.dataType;
        }

        public QueryDatasetInfoResponseBodyResultDimensionList setDimensionType(String dimensionType) {
            this.dimensionType = dimensionType;
            return this;
        }
        public String getDimensionType() {
            return this.dimensionType;
        }

        public QueryDatasetInfoResponseBodyResultDimensionList setExpression(String expression) {
            this.expression = expression;
            return this;
        }
        public String getExpression() {
            return this.expression;
        }

        public QueryDatasetInfoResponseBodyResultDimensionList setExpressionV2(String expressionV2) {
            this.expressionV2 = expressionV2;
            return this;
        }
        public String getExpressionV2() {
            return this.expressionV2;
        }

        public QueryDatasetInfoResponseBodyResultDimensionList setFactColumn(String factColumn) {
            this.factColumn = factColumn;
            return this;
        }
        public String getFactColumn() {
            return this.factColumn;
        }

        public QueryDatasetInfoResponseBodyResultDimensionList setFieldDescription(String fieldDescription) {
            this.fieldDescription = fieldDescription;
            return this;
        }
        public String getFieldDescription() {
            return this.fieldDescription;
        }

        public QueryDatasetInfoResponseBodyResultDimensionList setGranularity(String granularity) {
            this.granularity = granularity;
            return this;
        }
        public String getGranularity() {
            return this.granularity;
        }

        public QueryDatasetInfoResponseBodyResultDimensionList setRefUid(String refUid) {
            this.refUid = refUid;
            return this;
        }
        public String getRefUid() {
            return this.refUid;
        }

        public QueryDatasetInfoResponseBodyResultDimensionList setTableUniqueId(String tableUniqueId) {
            this.tableUniqueId = tableUniqueId;
            return this;
        }
        public String getTableUniqueId() {
            return this.tableUniqueId;
        }

        public QueryDatasetInfoResponseBodyResultDimensionList setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

    }

    public static class QueryDatasetInfoResponseBodyResultDirectory extends TeaModel {
        /**
         * <p>Test directory</p>
         * 
         * <strong>example:</strong>
         * <p>a3eecab7-618d-4f9f-*****</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>Test directory</p>
         * 
         * <strong>example:</strong>
         * <p>The name of the directory.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The information about the directory to which the dataset belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>88b680****</p>
         */
        @NameInMap("PathId")
        public String pathId;

        /**
         * <p>The path of the directory ID, for example, aa/bb/cc/dd.</p>
         * 
         * <strong>example:</strong>
         * <p>The path name of the directory ID, for example, one-level directory /two-level directory.</p>
         */
        @NameInMap("PathName")
        public String pathName;

        public static QueryDatasetInfoResponseBodyResultDirectory build(java.util.Map<String, ?> map) throws Exception {
            QueryDatasetInfoResponseBodyResultDirectory self = new QueryDatasetInfoResponseBodyResultDirectory();
            return TeaModel.build(map, self);
        }

        public QueryDatasetInfoResponseBodyResultDirectory setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryDatasetInfoResponseBodyResultDirectory setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryDatasetInfoResponseBodyResultDirectory setPathId(String pathId) {
            this.pathId = pathId;
            return this;
        }
        public String getPathId() {
            return this.pathId;
        }

        public QueryDatasetInfoResponseBodyResultDirectory setPathName(String pathName) {
            this.pathName = pathName;
            return this;
        }
        public String getPathName() {
            return this.pathName;
        }

    }

    public static class QueryDatasetInfoResponseBodyResultMeasureList extends TeaModel {
        /**
         * <p>The actual physical field.</p>
         * 
         * <strong>example:</strong>
         * <p>profit_amt</p>
         */
        @NameInMap("Caption")
        public String caption;

        /**
         * <p>A list of all measures for the dataset.</p>
         * 
         * <strong>example:</strong>
         * <p>string</p>
         */
        @NameInMap("DataType")
        public String dataType;

        /**
         * <p>Data type; value:</p>
         * <ul>
         * <li>string: character</li>
         * <li>number: a number</li>
         * <li>datetime: time</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>example_expression</p>
         */
        @NameInMap("Expression")
        public String expression;

        /**
         * <strong>if can be null:</strong>
         * <p>true</p>
         */
        @NameInMap("ExpressionV2")
        public String expressionV2;

        /**
         * <p>The type of the measure. Valid values:</p>
         * <ul>
         * <li>standard_measure: General Metrics</li>
         * <li>calculate_measure: Calculating Measures</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>profit_amt</p>
         */
        @NameInMap("FactColumn")
        public String factColumn;

        /**
         * <strong>example:</strong>
         * <p>hhhh</p>
         */
        @NameInMap("FieldDescription")
        public String fieldDescription;

        /**
         * <p>An expression that calculates a measure; valid only for calculated measures.</p>
         * 
         * <strong>example:</strong>
         * <p>calculate_measure</p>
         */
        @NameInMap("MeasureType")
        public String measureType;

        /**
         * <p>The display name of the metric.</p>
         * 
         * <strong>example:</strong>
         * <p>7a62530b36</p>
         */
        @NameInMap("TableUniqueId")
        public String tableUniqueId;

        /**
         * <p>The unique ID of the table to which the table belongs, which corresponds to the UniqueId of the CubeTypeList.</p>
         * 
         * <strong>example:</strong>
         * <p>88b680****</p>
         */
        @NameInMap("Uid")
        public String uid;

        public static QueryDatasetInfoResponseBodyResultMeasureList build(java.util.Map<String, ?> map) throws Exception {
            QueryDatasetInfoResponseBodyResultMeasureList self = new QueryDatasetInfoResponseBodyResultMeasureList();
            return TeaModel.build(map, self);
        }

        public QueryDatasetInfoResponseBodyResultMeasureList setCaption(String caption) {
            this.caption = caption;
            return this;
        }
        public String getCaption() {
            return this.caption;
        }

        public QueryDatasetInfoResponseBodyResultMeasureList setDataType(String dataType) {
            this.dataType = dataType;
            return this;
        }
        public String getDataType() {
            return this.dataType;
        }

        public QueryDatasetInfoResponseBodyResultMeasureList setExpression(String expression) {
            this.expression = expression;
            return this;
        }
        public String getExpression() {
            return this.expression;
        }

        public QueryDatasetInfoResponseBodyResultMeasureList setExpressionV2(String expressionV2) {
            this.expressionV2 = expressionV2;
            return this;
        }
        public String getExpressionV2() {
            return this.expressionV2;
        }

        public QueryDatasetInfoResponseBodyResultMeasureList setFactColumn(String factColumn) {
            this.factColumn = factColumn;
            return this;
        }
        public String getFactColumn() {
            return this.factColumn;
        }

        public QueryDatasetInfoResponseBodyResultMeasureList setFieldDescription(String fieldDescription) {
            this.fieldDescription = fieldDescription;
            return this;
        }
        public String getFieldDescription() {
            return this.fieldDescription;
        }

        public QueryDatasetInfoResponseBodyResultMeasureList setMeasureType(String measureType) {
            this.measureType = measureType;
            return this;
        }
        public String getMeasureType() {
            return this.measureType;
        }

        public QueryDatasetInfoResponseBodyResultMeasureList setTableUniqueId(String tableUniqueId) {
            this.tableUniqueId = tableUniqueId;
            return this;
        }
        public String getTableUniqueId() {
            return this.tableUniqueId;
        }

        public QueryDatasetInfoResponseBodyResultMeasureList setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

    }

    public static class QueryDatasetInfoResponseBodyResult extends TeaModel {
        /**
         * <p>The unique ID of the dataset.</p>
         */
        @NameInMap("CubeTableList")
        public java.util.List<QueryDatasetInfoResponseBodyResultCubeTableList> cubeTableList;

        /**
         * <p>The unique ID of the workspace to which the dataset belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("CustimzeSql")
        public Boolean custimzeSql;

        /**
         * <p>The type of the data source. Valid values:</p>
         * <ul>
         * <li>mysql</li>
         * <li>odps</li>
         * <li>oracle</li>
         * <li>... Data source types supported by Quick BI such as</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>a201c85c-******</p>
         */
        @NameInMap("DatasetId")
        public String datasetId;

        /**
         * <p>The user ID of the dataset owner in the Quick BI.</p>
         * 
         * <strong>example:</strong>
         * <p>opds_40</p>
         */
        @NameInMap("DatasetName")
        public String datasetName;

        /**
         * <p>If it is a custom SQL table, this is the specific SQL.</p>
         */
        @NameInMap("DimensionList")
        public java.util.List<QueryDatasetInfoResponseBodyResultDimensionList> dimensionList;

        /**
         * <p>The unique ID of the metric.</p>
         */
        @NameInMap("Directory")
        public QueryDatasetInfoResponseBodyResultDirectory directory;

        /**
         * <p>The name of the data source.</p>
         * 
         * <strong>example:</strong>
         * <p>a201c85c-******</p>
         */
        @NameInMap("DsId")
        public String dsId;

        /**
         * <p>The time when the dataset was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>odps</p>
         */
        @NameInMap("DsName")
        public String dsName;

        /**
         * <p>The point in time when the training dataset was created.</p>
         * 
         * <strong>example:</strong>
         * <p>odps</p>
         */
        @NameInMap("DsType")
        public String dsType;

        /**
         * <p>Indicates whether to customize SQL statements. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1629450382000</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The information about the dataset.</p>
         * 
         * <strong>example:</strong>
         * <p>1629450382000</p>
         */
        @NameInMap("GmtModify")
        public String gmtModify;

        /**
         * <p>The unique ID of the table to which the table belongs, which corresponds to the UniqueId of the CubeTypeList.</p>
         */
        @NameInMap("MeasureList")
        public java.util.List<QueryDatasetInfoResponseBodyResultMeasureList> measureList;

        @NameInMap("OpenOfflineAcceleration")
        public Boolean openOfflineAcceleration;

        /**
         * <p>Test Space</p>
         * 
         * <strong>example:</strong>
         * <p>b8494aab26124*****</p>
         */
        @NameInMap("OwnerId")
        public String ownerId;

        /**
         * <p>The unique ID of the data source.</p>
         * 
         * <strong>example:</strong>
         * <p>The name of the dataset owner.</p>
         */
        @NameInMap("OwnerName")
        public String ownerName;

        /**
         * <p>The name of the training dataset.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("RowLevel")
        public Boolean rowLevel;

        /**
         * <p>Whether row-level permissions are enabled. Valid values:</p>
         * <ul>
         * <li>true: The VIP Netty channel is enabled.</li>
         * <li>false: The VIP Netty channel is disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>420abef4-a79b-4289-b12****</p>
         */
        @NameInMap("WorkspaceId")
        public String workspaceId;

        /**
         * <p>Big Baby</p>
         * 
         * <strong>example:</strong>
         * <p>The name of the workspace in which the dataset resides.</p>
         */
        @NameInMap("WorkspaceName")
        public String workspaceName;

        public static QueryDatasetInfoResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            QueryDatasetInfoResponseBodyResult self = new QueryDatasetInfoResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public QueryDatasetInfoResponseBodyResult setCubeTableList(java.util.List<QueryDatasetInfoResponseBodyResultCubeTableList> cubeTableList) {
            this.cubeTableList = cubeTableList;
            return this;
        }
        public java.util.List<QueryDatasetInfoResponseBodyResultCubeTableList> getCubeTableList() {
            return this.cubeTableList;
        }

        public QueryDatasetInfoResponseBodyResult setCustimzeSql(Boolean custimzeSql) {
            this.custimzeSql = custimzeSql;
            return this;
        }
        public Boolean getCustimzeSql() {
            return this.custimzeSql;
        }

        public QueryDatasetInfoResponseBodyResult setDatasetId(String datasetId) {
            this.datasetId = datasetId;
            return this;
        }
        public String getDatasetId() {
            return this.datasetId;
        }

        public QueryDatasetInfoResponseBodyResult setDatasetName(String datasetName) {
            this.datasetName = datasetName;
            return this;
        }
        public String getDatasetName() {
            return this.datasetName;
        }

        public QueryDatasetInfoResponseBodyResult setDimensionList(java.util.List<QueryDatasetInfoResponseBodyResultDimensionList> dimensionList) {
            this.dimensionList = dimensionList;
            return this;
        }
        public java.util.List<QueryDatasetInfoResponseBodyResultDimensionList> getDimensionList() {
            return this.dimensionList;
        }

        public QueryDatasetInfoResponseBodyResult setDirectory(QueryDatasetInfoResponseBodyResultDirectory directory) {
            this.directory = directory;
            return this;
        }
        public QueryDatasetInfoResponseBodyResultDirectory getDirectory() {
            return this.directory;
        }

        public QueryDatasetInfoResponseBodyResult setDsId(String dsId) {
            this.dsId = dsId;
            return this;
        }
        public String getDsId() {
            return this.dsId;
        }

        public QueryDatasetInfoResponseBodyResult setDsName(String dsName) {
            this.dsName = dsName;
            return this;
        }
        public String getDsName() {
            return this.dsName;
        }

        public QueryDatasetInfoResponseBodyResult setDsType(String dsType) {
            this.dsType = dsType;
            return this;
        }
        public String getDsType() {
            return this.dsType;
        }

        public QueryDatasetInfoResponseBodyResult setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public QueryDatasetInfoResponseBodyResult setGmtModify(String gmtModify) {
            this.gmtModify = gmtModify;
            return this;
        }
        public String getGmtModify() {
            return this.gmtModify;
        }

        public QueryDatasetInfoResponseBodyResult setMeasureList(java.util.List<QueryDatasetInfoResponseBodyResultMeasureList> measureList) {
            this.measureList = measureList;
            return this;
        }
        public java.util.List<QueryDatasetInfoResponseBodyResultMeasureList> getMeasureList() {
            return this.measureList;
        }

        public QueryDatasetInfoResponseBodyResult setOpenOfflineAcceleration(Boolean openOfflineAcceleration) {
            this.openOfflineAcceleration = openOfflineAcceleration;
            return this;
        }
        public Boolean getOpenOfflineAcceleration() {
            return this.openOfflineAcceleration;
        }

        public QueryDatasetInfoResponseBodyResult setOwnerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public String getOwnerId() {
            return this.ownerId;
        }

        public QueryDatasetInfoResponseBodyResult setOwnerName(String ownerName) {
            this.ownerName = ownerName;
            return this;
        }
        public String getOwnerName() {
            return this.ownerName;
        }

        public QueryDatasetInfoResponseBodyResult setRowLevel(Boolean rowLevel) {
            this.rowLevel = rowLevel;
            return this;
        }
        public Boolean getRowLevel() {
            return this.rowLevel;
        }

        public QueryDatasetInfoResponseBodyResult setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public QueryDatasetInfoResponseBodyResult setWorkspaceName(String workspaceName) {
            this.workspaceName = workspaceName;
            return this;
        }
        public String getWorkspaceName() {
            return this.workspaceName;
        }

    }

}
