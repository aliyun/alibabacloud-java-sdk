// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryDatasetInfoResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public QueryDatasetInfoResponseBodyResult result;

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
        @NameInMap("Caption")
        public String caption;

        @NameInMap("Customsql")
        public Boolean customsql;

        @NameInMap("DatasourceId")
        public String datasourceId;

        @NameInMap("DsType")
        public String dsType;

        @NameInMap("FactTable")
        public Boolean factTable;

        @NameInMap("Sql")
        public String sql;

        @NameInMap("TableName")
        public String tableName;

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
        @NameInMap("Caption")
        public String caption;

        @NameInMap("DataType")
        public String dataType;

        @NameInMap("DimensionType")
        public String dimensionType;

        @NameInMap("Expression")
        public String expression;

        @NameInMap("FactColumn")
        public String factColumn;

        @NameInMap("Granularity")
        public String granularity;

        @NameInMap("RefUid")
        public String refUid;

        @NameInMap("TableUniqueId")
        public String tableUniqueId;

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

        public QueryDatasetInfoResponseBodyResultDimensionList setFactColumn(String factColumn) {
            this.factColumn = factColumn;
            return this;
        }
        public String getFactColumn() {
            return this.factColumn;
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
        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        @NameInMap("PathId")
        public String pathId;

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
        @NameInMap("Caption")
        public String caption;

        @NameInMap("DataType")
        public String dataType;

        @NameInMap("Expression")
        public String expression;

        @NameInMap("FactColumn")
        public String factColumn;

        @NameInMap("MeasureType")
        public String measureType;

        @NameInMap("TableUniqueId")
        public String tableUniqueId;

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

        public QueryDatasetInfoResponseBodyResultMeasureList setFactColumn(String factColumn) {
            this.factColumn = factColumn;
            return this;
        }
        public String getFactColumn() {
            return this.factColumn;
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
        @NameInMap("CubeTableList")
        public java.util.List<QueryDatasetInfoResponseBodyResultCubeTableList> cubeTableList;

        @NameInMap("CustimzeSql")
        public Boolean custimzeSql;

        @NameInMap("DatasetId")
        public String datasetId;

        @NameInMap("DatasetName")
        public String datasetName;

        @NameInMap("DimensionList")
        public java.util.List<QueryDatasetInfoResponseBodyResultDimensionList> dimensionList;

        @NameInMap("Directory")
        public QueryDatasetInfoResponseBodyResultDirectory directory;

        @NameInMap("DsId")
        public String dsId;

        @NameInMap("DsName")
        public String dsName;

        @NameInMap("DsType")
        public String dsType;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModify")
        public String gmtModify;

        @NameInMap("MeasureList")
        public java.util.List<QueryDatasetInfoResponseBodyResultMeasureList> measureList;

        @NameInMap("OwnerId")
        public String ownerId;

        @NameInMap("OwnerName")
        public String ownerName;

        @NameInMap("RowLevel")
        public Boolean rowLevel;

        @NameInMap("WorkspaceId")
        public String workspaceId;

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
