// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryWorksBloodRelationshipResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the request is successful. Valid values:</p>
     * <br>
     * <p>*   true: The request was successful.</p>
     * <p>*   false: The request failed.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("Result")
    public java.util.List<QueryWorksBloodRelationshipResponseBodyResult> result;

    /**
     * <p>The response.</p>
     */
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
        /**
         * <p>Indices whether the metric. Valid values:</p>
         * <br>
         * <p>true false</p>
         */
        @NameInMap("AreaId")
        public String areaId;

        /**
         * <p>The ID of the owning location.</p>
         */
        @NameInMap("AreaName")
        public String areaName;

        /**
         * <p>The globally unique PathId.</p>
         */
        @NameInMap("Caption")
        public String caption;

        /**
         * <p>The display name of the field.</p>
         */
        @NameInMap("DataType")
        public String dataType;

        /**
         * <p>The type of the field. Valid values:</p>
         * <br>
         * <p>*   string: string type</p>
         * <p>*   date: a date type that contains only the year, month, and day parts</p>
         * <p>*   datetime: a common date type</p>
         * <p>*   time: a date type that contains only hours, minutes, and seconds.</p>
         * <p>*   number: numeric</p>
         * <p>*   boolean: Boolean type</p>
         * <p>*   geographical: geographical location</p>
         * <p>*   url: string type</p>
         * <p>*   imageUrl: the type of the image link.</p>
         * <p>*   multivalue: a multi-value column</p>
         */
        @NameInMap("IsMeasure")
        public Boolean isMeasure;

        /**
         * <p>The unique ID of the field.</p>
         */
        @NameInMap("PathId")
        public String pathId;

        /**
         * <p>A list of query parameter reference columns.</p>
         */
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
        /**
         * <p>List of work blood information.</p>
         */
        @NameInMap("ComponentId")
        public String componentId;

        /**
         * <p>The ID of the component that you want to modify.</p>
         */
        @NameInMap("ComponentName")
        public String componentName;

        /**
         * <p>Line</p>
         */
        @NameInMap("ComponentType")
        public Integer componentType;

        /**
         * <p>The type of the image component.</p>
         */
        @NameInMap("ComponentTypeName")
        public String componentTypeName;

        /**
         * <p>Column (Measure)</p>
         */
        @NameInMap("DatasetId")
        public String datasetId;

        /**
         * <p>The name of the component type.</p>
         */
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
