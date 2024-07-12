// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class ListModelFeatureAvailableFeaturesResponseBody extends TeaModel {
    @NameInMap("AvaliableFeatures")
    public java.util.List<ListModelFeatureAvailableFeaturesResponseBodyAvaliableFeatures> avaliableFeatures;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    /**
     * <strong>example:</strong>
     * <p>ED4DEA2F-F216-57F0-AE28-08D791233280</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ListModelFeatureAvailableFeaturesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListModelFeatureAvailableFeaturesResponseBody self = new ListModelFeatureAvailableFeaturesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListModelFeatureAvailableFeaturesResponseBody setAvaliableFeatures(java.util.List<ListModelFeatureAvailableFeaturesResponseBodyAvaliableFeatures> avaliableFeatures) {
        this.avaliableFeatures = avaliableFeatures;
        return this;
    }
    public java.util.List<ListModelFeatureAvailableFeaturesResponseBodyAvaliableFeatures> getAvaliableFeatures() {
        return this.avaliableFeatures;
    }

    public ListModelFeatureAvailableFeaturesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public ListModelFeatureAvailableFeaturesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListModelFeatureAvailableFeaturesResponseBodyAvaliableFeatures extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>age</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>user_fea</p>
         */
        @NameInMap("SourceName")
        public String sourceName;

        /**
         * <strong>example:</strong>
         * <p>FeatureView</p>
         */
        @NameInMap("SourceType")
        public String sourceType;

        /**
         * <strong>example:</strong>
         * <p>STRING</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListModelFeatureAvailableFeaturesResponseBodyAvaliableFeatures build(java.util.Map<String, ?> map) throws Exception {
            ListModelFeatureAvailableFeaturesResponseBodyAvaliableFeatures self = new ListModelFeatureAvailableFeaturesResponseBodyAvaliableFeatures();
            return TeaModel.build(map, self);
        }

        public ListModelFeatureAvailableFeaturesResponseBodyAvaliableFeatures setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListModelFeatureAvailableFeaturesResponseBodyAvaliableFeatures setSourceName(String sourceName) {
            this.sourceName = sourceName;
            return this;
        }
        public String getSourceName() {
            return this.sourceName;
        }

        public ListModelFeatureAvailableFeaturesResponseBodyAvaliableFeatures setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public ListModelFeatureAvailableFeaturesResponseBodyAvaliableFeatures setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
