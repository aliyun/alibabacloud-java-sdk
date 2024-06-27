// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryWorksBloodRelationshipResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the request is successful. Valid values:</p>
     * <ul>
     * <li>true: The request was successful.</li>
     * <li>false: The request failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>D787E1A3-A93C-424A-B626-C2B05DF8D885</p>
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
     * 
     * <strong>example:</strong>
     * <p>true</p>
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
         * <p>true false</p>
         * 
         * <strong>example:</strong>
         * <p>area_column</p>
         */
        @NameInMap("AreaId")
        public String areaId;

        /**
         * <p>The ID of the owning location.</p>
         * 
         * <strong>example:</strong>
         * <p>The name of the owning location.</p>
         */
        @NameInMap("AreaName")
        public String areaName;

        /**
         * <p>The globally unique PathId.</p>
         * 
         * <strong>example:</strong>
         * <p>order_number</p>
         */
        @NameInMap("Caption")
        public String caption;

        /**
         * <p>The display name of the field.</p>
         * 
         * <strong>example:</strong>
         * <p>number</p>
         */
        @NameInMap("DataType")
        public String dataType;

        /**
         * <p>The type of the field. Valid values:</p>
         * <ul>
         * <li>string: string type</li>
         * <li>date: a date type that contains only the year, month, and day parts</li>
         * <li>datetime: a common date type</li>
         * <li>time: a date type that contains only hours, minutes, and seconds.</li>
         * <li>number: numeric</li>
         * <li>boolean: Boolean type</li>
         * <li>geographical: geographical location</li>
         * <li>url: string type</li>
         * <li>imageUrl: the type of the image link.</li>
         * <li>multivalue: a multi-value column</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsMeasure")
        public Boolean isMeasure;

        /**
         * <p>The unique ID of the field.</p>
         * 
         * <strong>example:</strong>
         * <p>schema7d1944eb-443e-48c6-8123-bf45a99e7e74.dc78a4ed-880d-452e-b017-90cfc10c83e5_company_sales_record.[Ndc78a4_order_level].[Ndc78a4_order_level].[Ndc78a4_order_level]</p>
         */
        @NameInMap("PathId")
        public String pathId;

        /**
         * <p>A list of query parameter reference columns.</p>
         * 
         * <strong>example:</strong>
         * <p>Ndc78a4_order_number</p>
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
         * 
         * <strong>example:</strong>
         * <p>0696083a-ca72-4d89-8e7a-c017910e0***</p>
         */
        @NameInMap("ComponentId")
        public String componentId;

        /**
         * <p>The ID of the component that you want to modify.</p>
         * 
         * <strong>example:</strong>
         * <p>The name of the component.</p>
         */
        @NameInMap("ComponentName")
        public String componentName;

        /**
         * <p>Line</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("ComponentType")
        public Integer componentType;

        /**
         * <p>The type of the image component.</p>
         * 
         * <strong>example:</strong>
         * <p>LINE</p>
         */
        @NameInMap("ComponentTypeName")
        public String componentTypeName;

        /**
         * <p>Column (Measure)</p>
         * 
         * <strong>example:</strong>
         * <p>dc78a4ed-880d-452e-b017-90cfc10c83e5_company_sales_record</p>
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
