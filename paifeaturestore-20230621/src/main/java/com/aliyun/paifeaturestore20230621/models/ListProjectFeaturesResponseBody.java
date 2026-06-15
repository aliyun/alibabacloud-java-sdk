// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class ListProjectFeaturesResponseBody extends TeaModel {
    /**
     * <p>The list of returned features.</p>
     */
    @NameInMap("Features")
    public java.util.List<ListProjectFeaturesResponseBodyFeatures> features;

    /**
     * <p>The total number of features that match the query criteria.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>7D497816-607C-5B67-97B1-61354B6ACB2B</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ListProjectFeaturesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListProjectFeaturesResponseBody self = new ListProjectFeaturesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListProjectFeaturesResponseBody setFeatures(java.util.List<ListProjectFeaturesResponseBodyFeatures> features) {
        this.features = features;
        return this;
    }
    public java.util.List<ListProjectFeaturesResponseBodyFeatures> getFeatures() {
        return this.features;
    }

    public ListProjectFeaturesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListProjectFeaturesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListProjectFeaturesResponseBodyFeatures extends TeaModel {
        /**
         * <p>A comma-separated list of aliases for the feature.</p>
         * 
         * <strong>example:</strong>
         * <p>age1,age2</p>
         */
        @NameInMap("AliasNames")
        public String aliasNames;

        /**
         * <p>The ID of the parent feature view.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("FeatureViewId")
        public String featureViewId;

        /**
         * <p>The name of the parent feature view.</p>
         * 
         * <strong>example:</strong>
         * <p>fv1</p>
         */
        @NameInMap("FeatureViewName")
        public String featureViewName;

        /**
         * <p>The time the feature was created, in ISO 8601 format.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-12-15T23:24:33.132+08:00</p>
         */
        @NameInMap("GmtCreateTime")
        public String gmtCreateTime;

        /**
         * <p>The number of model features that reference this feature.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("ModelFeatureCount")
        public Integer modelFeatureCount;

        /**
         * <p>The name of the feature.</p>
         * 
         * <strong>example:</strong>
         * <p>f1</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The owner of the feature.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        @NameInMap("Owner")
        public String owner;

        /**
         * <p>The data type of the feature.</p>
         * 
         * <strong>example:</strong>
         * <p>STRING</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListProjectFeaturesResponseBodyFeatures build(java.util.Map<String, ?> map) throws Exception {
            ListProjectFeaturesResponseBodyFeatures self = new ListProjectFeaturesResponseBodyFeatures();
            return TeaModel.build(map, self);
        }

        public ListProjectFeaturesResponseBodyFeatures setAliasNames(String aliasNames) {
            this.aliasNames = aliasNames;
            return this;
        }
        public String getAliasNames() {
            return this.aliasNames;
        }

        public ListProjectFeaturesResponseBodyFeatures setFeatureViewId(String featureViewId) {
            this.featureViewId = featureViewId;
            return this;
        }
        public String getFeatureViewId() {
            return this.featureViewId;
        }

        public ListProjectFeaturesResponseBodyFeatures setFeatureViewName(String featureViewName) {
            this.featureViewName = featureViewName;
            return this;
        }
        public String getFeatureViewName() {
            return this.featureViewName;
        }

        public ListProjectFeaturesResponseBodyFeatures setGmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }
        public String getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        public ListProjectFeaturesResponseBodyFeatures setModelFeatureCount(Integer modelFeatureCount) {
            this.modelFeatureCount = modelFeatureCount;
            return this;
        }
        public Integer getModelFeatureCount() {
            return this.modelFeatureCount;
        }

        public ListProjectFeaturesResponseBodyFeatures setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListProjectFeaturesResponseBodyFeatures setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public ListProjectFeaturesResponseBodyFeatures setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
