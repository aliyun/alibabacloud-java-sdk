// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ListPhysicalConnectionFeaturesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("PhysicalConnectionFeatures")
    @Validation(required = true)
    public java.util.List<ListPhysicalConnectionFeaturesResponsePhysicalConnectionFeatures> physicalConnectionFeatures;

    public static ListPhysicalConnectionFeaturesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPhysicalConnectionFeaturesResponse self = new ListPhysicalConnectionFeaturesResponse();
        return TeaModel.build(map, self);
    }

    public ListPhysicalConnectionFeaturesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPhysicalConnectionFeaturesResponse setPhysicalConnectionFeatures(java.util.List<ListPhysicalConnectionFeaturesResponsePhysicalConnectionFeatures> physicalConnectionFeatures) {
        this.physicalConnectionFeatures = physicalConnectionFeatures;
        return this;
    }
    public java.util.List<ListPhysicalConnectionFeaturesResponsePhysicalConnectionFeatures> getPhysicalConnectionFeatures() {
        return this.physicalConnectionFeatures;
    }

    public static class ListPhysicalConnectionFeaturesResponsePhysicalConnectionFeatures extends TeaModel {
        @NameInMap("FeatureKey")
        @Validation(required = true)
        public String featureKey;

        @NameInMap("FeatureValue")
        @Validation(required = true)
        public String featureValue;

        public static ListPhysicalConnectionFeaturesResponsePhysicalConnectionFeatures build(java.util.Map<String, ?> map) throws Exception {
            ListPhysicalConnectionFeaturesResponsePhysicalConnectionFeatures self = new ListPhysicalConnectionFeaturesResponsePhysicalConnectionFeatures();
            return TeaModel.build(map, self);
        }

        public ListPhysicalConnectionFeaturesResponsePhysicalConnectionFeatures setFeatureKey(String featureKey) {
            this.featureKey = featureKey;
            return this;
        }
        public String getFeatureKey() {
            return this.featureKey;
        }

        public ListPhysicalConnectionFeaturesResponsePhysicalConnectionFeatures setFeatureValue(String featureValue) {
            this.featureValue = featureValue;
            return this;
        }
        public String getFeatureValue() {
            return this.featureValue;
        }

    }

}
