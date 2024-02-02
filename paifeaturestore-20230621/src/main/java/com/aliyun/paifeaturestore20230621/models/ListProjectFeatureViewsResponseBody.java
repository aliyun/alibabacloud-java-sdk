// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class ListProjectFeatureViewsResponseBody extends TeaModel {
    @NameInMap("FeatureViews")
    public java.util.List<ListProjectFeatureViewsResponseBodyFeatureViews> featureViews;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("Attributes")
        public java.util.List<String> attributes;

        @NameInMap("Name")
        public String name;

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
        @NameInMap("FeatureViewId")
        public String featureViewId;

        @NameInMap("Features")
        public java.util.List<ListProjectFeatureViewsResponseBodyFeatureViewsFeatures> features;

        @NameInMap("Name")
        public String name;

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

        public ListProjectFeatureViewsResponseBodyFeatureViews setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
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
