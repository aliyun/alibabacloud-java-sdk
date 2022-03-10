// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryWorksBloodRelationshipResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.List<QueryWorksBloodRelationshipResponseBodyResult> result;

    @NameInMap("Success")
    public Boolean success;

    public static QueryWorksBloodRelationshipResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryWorksBloodRelationshipResponseBody self = new QueryWorksBloodRelationshipResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryWorksBloodRelationshipResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryWorksBloodRelationshipResponseBody setResult(java.util.List<QueryWorksBloodRelationshipResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<QueryWorksBloodRelationshipResponseBodyResult> getResult() {
        return this.result;
    }

    public QueryWorksBloodRelationshipResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryWorksBloodRelationshipResponseBodyResultQueryParams extends TeaModel {
        // 所属位置：
        @NameInMap("AreaId")
        public String areaId;

        @NameInMap("AreaName")
        public String areaName;

        // 字段显示名称
        @NameInMap("Caption")
        public String caption;

        // 字段类型
        @NameInMap("DataType")
        public String dataType;

        // 是否是度量
        @NameInMap("IsMeasure")
        public Boolean isMeasure;

        // 全局唯一的PathId。位于cube的level中pathId
        @NameInMap("PathId")
        public String pathId;

        // 字段唯一ID。即cube中的name
        @NameInMap("Uid")
        public String uid;

        public static QueryWorksBloodRelationshipResponseBodyResultQueryParams build(java.util.Map<String, ?> map) throws Exception {
            QueryWorksBloodRelationshipResponseBodyResultQueryParams self = new QueryWorksBloodRelationshipResponseBodyResultQueryParams();
            return TeaModel.build(map, self);
        }

        public QueryWorksBloodRelationshipResponseBodyResultQueryParams setAreaId(String areaId) {
            this.areaId = areaId;
            return this;
        }
        public String getAreaId() {
            return this.areaId;
        }

        public QueryWorksBloodRelationshipResponseBodyResultQueryParams setAreaName(String areaName) {
            this.areaName = areaName;
            return this;
        }
        public String getAreaName() {
            return this.areaName;
        }

        public QueryWorksBloodRelationshipResponseBodyResultQueryParams setCaption(String caption) {
            this.caption = caption;
            return this;
        }
        public String getCaption() {
            return this.caption;
        }

        public QueryWorksBloodRelationshipResponseBodyResultQueryParams setDataType(String dataType) {
            this.dataType = dataType;
            return this;
        }
        public String getDataType() {
            return this.dataType;
        }

        public QueryWorksBloodRelationshipResponseBodyResultQueryParams setIsMeasure(Boolean isMeasure) {
            this.isMeasure = isMeasure;
            return this;
        }
        public Boolean getIsMeasure() {
            return this.isMeasure;
        }

        public QueryWorksBloodRelationshipResponseBodyResultQueryParams setPathId(String pathId) {
            this.pathId = pathId;
            return this;
        }
        public String getPathId() {
            return this.pathId;
        }

        public QueryWorksBloodRelationshipResponseBodyResultQueryParams setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

    }

    public static class QueryWorksBloodRelationshipResponseBodyResult extends TeaModel {
        // 组件ID or  sheetId
        @NameInMap("ComponentId")
        public String componentId;

        @NameInMap("ComponentName")
        public String componentName;

        // 组件类型
        @NameInMap("ComponentType")
        public Integer componentType;

        @NameInMap("ComponentTypeName")
        public String componentTypeName;

        // 数据集ID
        @NameInMap("DatasetId")
        public String datasetId;

        // 查询参数引用的列信息
        @NameInMap("QueryParams")
        public java.util.List<QueryWorksBloodRelationshipResponseBodyResultQueryParams> queryParams;

        public static QueryWorksBloodRelationshipResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            QueryWorksBloodRelationshipResponseBodyResult self = new QueryWorksBloodRelationshipResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public QueryWorksBloodRelationshipResponseBodyResult setComponentId(String componentId) {
            this.componentId = componentId;
            return this;
        }
        public String getComponentId() {
            return this.componentId;
        }

        public QueryWorksBloodRelationshipResponseBodyResult setComponentName(String componentName) {
            this.componentName = componentName;
            return this;
        }
        public String getComponentName() {
            return this.componentName;
        }

        public QueryWorksBloodRelationshipResponseBodyResult setComponentType(Integer componentType) {
            this.componentType = componentType;
            return this;
        }
        public Integer getComponentType() {
            return this.componentType;
        }

        public QueryWorksBloodRelationshipResponseBodyResult setComponentTypeName(String componentTypeName) {
            this.componentTypeName = componentTypeName;
            return this;
        }
        public String getComponentTypeName() {
            return this.componentTypeName;
        }

        public QueryWorksBloodRelationshipResponseBodyResult setDatasetId(String datasetId) {
            this.datasetId = datasetId;
            return this;
        }
        public String getDatasetId() {
            return this.datasetId;
        }

        public QueryWorksBloodRelationshipResponseBodyResult setQueryParams(java.util.List<QueryWorksBloodRelationshipResponseBodyResultQueryParams> queryParams) {
            this.queryParams = queryParams;
            return this;
        }
        public java.util.List<QueryWorksBloodRelationshipResponseBodyResultQueryParams> getQueryParams() {
            return this.queryParams;
        }

    }

}
