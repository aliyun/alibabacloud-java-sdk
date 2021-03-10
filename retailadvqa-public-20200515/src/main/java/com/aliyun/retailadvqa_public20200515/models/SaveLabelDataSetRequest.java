// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa_public20200515.models;

import com.aliyun.tea.*;

public class SaveLabelDataSetRequest extends TeaModel {
    @NameInMap("DsId")
    public String dsId;

    @NameInMap("CubeName")
    public String cubeName;

    @NameInMap("CubeId")
    public String cubeId;

    @NameInMap("AccessId")
    public String accessId;

    @NameInMap("TableName")
    public String tableName;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    @NameInMap("DatasetLabelList")
    public java.util.List<SaveLabelDataSetRequestDatasetLabelList> datasetLabelList;

    public static SaveLabelDataSetRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveLabelDataSetRequest self = new SaveLabelDataSetRequest();
        return TeaModel.build(map, self);
    }

    public SaveLabelDataSetRequest setDsId(String dsId) {
        this.dsId = dsId;
        return this;
    }
    public String getDsId() {
        return this.dsId;
    }

    public SaveLabelDataSetRequest setCubeName(String cubeName) {
        this.cubeName = cubeName;
        return this;
    }
    public String getCubeName() {
        return this.cubeName;
    }

    public SaveLabelDataSetRequest setCubeId(String cubeId) {
        this.cubeId = cubeId;
        return this;
    }
    public String getCubeId() {
        return this.cubeId;
    }

    public SaveLabelDataSetRequest setAccessId(String accessId) {
        this.accessId = accessId;
        return this;
    }
    public String getAccessId() {
        return this.accessId;
    }

    public SaveLabelDataSetRequest setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

    public SaveLabelDataSetRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public SaveLabelDataSetRequest setDatasetLabelList(java.util.List<SaveLabelDataSetRequestDatasetLabelList> datasetLabelList) {
        this.datasetLabelList = datasetLabelList;
        return this;
    }
    public java.util.List<SaveLabelDataSetRequestDatasetLabelList> getDatasetLabelList() {
        return this.datasetLabelList;
    }

    public static class SaveLabelDataSetRequestDatasetLabelList extends TeaModel {
        @NameInMap("ColumnName")
        public String columnName;

        @NameInMap("ColumnComment")
        public String columnComment;

        @NameInMap("Remark")
        public String remark;

        @NameInMap("ColumnType")
        public String columnType;

        @NameInMap("MappingType")
        public String mappingType;

        @NameInMap("UniqueIdentification")
        public String uniqueIdentification;

        public static SaveLabelDataSetRequestDatasetLabelList build(java.util.Map<String, ?> map) throws Exception {
            SaveLabelDataSetRequestDatasetLabelList self = new SaveLabelDataSetRequestDatasetLabelList();
            return TeaModel.build(map, self);
        }

        public SaveLabelDataSetRequestDatasetLabelList setColumnName(String columnName) {
            this.columnName = columnName;
            return this;
        }
        public String getColumnName() {
            return this.columnName;
        }

        public SaveLabelDataSetRequestDatasetLabelList setColumnComment(String columnComment) {
            this.columnComment = columnComment;
            return this;
        }
        public String getColumnComment() {
            return this.columnComment;
        }

        public SaveLabelDataSetRequestDatasetLabelList setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public SaveLabelDataSetRequestDatasetLabelList setColumnType(String columnType) {
            this.columnType = columnType;
            return this;
        }
        public String getColumnType() {
            return this.columnType;
        }

        public SaveLabelDataSetRequestDatasetLabelList setMappingType(String mappingType) {
            this.mappingType = mappingType;
            return this;
        }
        public String getMappingType() {
            return this.mappingType;
        }

        public SaveLabelDataSetRequestDatasetLabelList setUniqueIdentification(String uniqueIdentification) {
            this.uniqueIdentification = uniqueIdentification;
            return this;
        }
        public String getUniqueIdentification() {
            return this.uniqueIdentification;
        }

    }

}
