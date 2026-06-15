// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class ListProjectFeatureViewsResponseBody extends TeaModel {
    /**
     * <p>The list of feature views.</p>
     */
    @NameInMap("FeatureViews")
    public java.util.List<ListProjectFeatureViewsResponseBodyFeatureViews> featureViews;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>AE2AF33E-0C0D-51A8-B89B-C5F1DF261D92</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total count of feature views.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListProjectFeatureViewsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListProjectFeatureViewsResponseBody self = new ListProjectFeatureViewsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListProjectFeatureViewsResponseBody setFeatureViews(java.util.List<ListProjectFeatureViewsResponseBodyFeatureViews> featureViews) {
        this.featureViews = featureViews;
        return this;
    }
    public java.util.List<ListProjectFeatureViewsResponseBodyFeatureViews> getFeatureViews() {
        return this.featureViews;
    }

    public ListProjectFeatureViewsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListProjectFeatureViewsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListProjectFeatureViewsResponseBodyFeatureViewsFeatures extends TeaModel {
        /**
         * <p>A list of field attributes. Valid values:</p>
         * <ul>
         * <li><p>Partition: Indicates that the feature is a partition field.</p>
         * </li>
         * <li><p>PrimaryKey: Indicates that the feature is a primary key.</p>
         * </li>
         * <li><p>EventTime: Indicates that the feature represents the event time.</p>
         * </li>
         * </ul>
         */
        @NameInMap("Attributes")
        public java.util.List<String> attributes;

        /**
         * <p>The feature name.</p>
         * 
         * <strong>example:</strong>
         * <p>f1</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The feature type. Valid values include:</p>
         * <ul>
         * <li><p>INT32</p>
         * </li>
         * <li><p>INT64</p>
         * </li>
         * <li><p>FLOAT</p>
         * </li>
         * <li><p>DOUBLE</p>
         * </li>
         * <li><p>STRING</p>
         * </li>
         * <li><p>BOOLEAN</p>
         * </li>
         * <li><p>TIMESTAMP</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>INT32</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListProjectFeatureViewsResponseBodyFeatureViewsFeatures build(java.util.Map<String, ?> map) throws Exception {
            ListProjectFeatureViewsResponseBodyFeatureViewsFeatures self = new ListProjectFeatureViewsResponseBodyFeatureViewsFeatures();
            return TeaModel.build(map, self);
        }

        public ListProjectFeatureViewsResponseBodyFeatureViewsFeatures setAttributes(java.util.List<String> attributes) {
            this.attributes = attributes;
            return this;
        }
        public java.util.List<String> getAttributes() {
            return this.attributes;
        }

        public ListProjectFeatureViewsResponseBodyFeatureViewsFeatures setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListProjectFeatureViewsResponseBodyFeatureViewsFeatures setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListProjectFeatureViewsResponseBodyFeatureViews extends TeaModel {
        /**
         * <p>The feature view ID.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("FeatureViewId")
        public String featureViewId;

        /**
         * <p>A list of features.</p>
         */
        @NameInMap("Features")
        public java.util.List<ListProjectFeatureViewsResponseBodyFeatureViewsFeatures> features;

        /**
         * <p>The join ID of the feature entity.</p>
         * 
         * <strong>example:</strong>
         * <p>item_id</p>
         */
        @NameInMap("JoinId")
        public String joinId;

        /**
         * <p>The feature view name.</p>
         * 
         * <strong>example:</strong>
         * <p>feature_view1</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The join ID of the parent feature entity.</p>
         * 
         * <strong>example:</strong>
         * <p>item_id</p>
         */
        @NameInMap("ParentJoinId")
        public String parentJoinId;

        /**
         * <p>The type of the feature view.</p>
         * <ul>
         * <li><p>Batch: A feature view that processes data in batches.</p>
         * </li>
         * <li><p>Stream: A feature view that processes data as a stream.</p>
         * </li>
         * <li><p>Sequence: A feature view that represents a sequence of features.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Batch</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListProjectFeatureViewsResponseBodyFeatureViews build(java.util.Map<String, ?> map) throws Exception {
            ListProjectFeatureViewsResponseBodyFeatureViews self = new ListProjectFeatureViewsResponseBodyFeatureViews();
            return TeaModel.build(map, self);
        }

        public ListProjectFeatureViewsResponseBodyFeatureViews setFeatureViewId(String featureViewId) {
            this.featureViewId = featureViewId;
            return this;
        }
        public String getFeatureViewId() {
            return this.featureViewId;
        }

        public ListProjectFeatureViewsResponseBodyFeatureViews setFeatures(java.util.List<ListProjectFeatureViewsResponseBodyFeatureViewsFeatures> features) {
            this.features = features;
            return this;
        }
        public java.util.List<ListProjectFeatureViewsResponseBodyFeatureViewsFeatures> getFeatures() {
            return this.features;
        }

        public ListProjectFeatureViewsResponseBodyFeatureViews setJoinId(String joinId) {
            this.joinId = joinId;
            return this;
        }
        public String getJoinId() {
            return this.joinId;
        }

        public ListProjectFeatureViewsResponseBodyFeatureViews setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListProjectFeatureViewsResponseBodyFeatureViews setParentJoinId(String parentJoinId) {
            this.parentJoinId = parentJoinId;
            return this;
        }
        public String getParentJoinId() {
            return this.parentJoinId;
        }

        public ListProjectFeatureViewsResponseBodyFeatureViews setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
