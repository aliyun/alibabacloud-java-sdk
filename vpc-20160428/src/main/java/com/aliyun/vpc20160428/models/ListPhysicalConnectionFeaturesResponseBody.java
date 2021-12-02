// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ListPhysicalConnectionFeaturesResponseBody extends TeaModel {
    @NameInMap("PhysicalConnectionFeatures")
    public java.util.List<ListPhysicalConnectionFeaturesResponseBodyPhysicalConnectionFeatures> physicalConnectionFeatures;

    @NameInMap("RequestId")
    public String requestId;

    public static ListPhysicalConnectionFeaturesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPhysicalConnectionFeaturesResponseBody self = new ListPhysicalConnectionFeaturesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPhysicalConnectionFeaturesResponseBody setPhysicalConnectionFeatures(java.util.List<ListPhysicalConnectionFeaturesResponseBodyPhysicalConnectionFeatures> physicalConnectionFeatures) {
        this.physicalConnectionFeatures = physicalConnectionFeatures;
        return this;
    }
    public java.util.List<ListPhysicalConnectionFeaturesResponseBodyPhysicalConnectionFeatures> getPhysicalConnectionFeatures() {
        return this.physicalConnectionFeatures;
    }

    public ListPhysicalConnectionFeaturesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListPhysicalConnectionFeaturesResponseBodyPhysicalConnectionFeatures extends TeaModel {
        @NameInMap("FeatureKey")
        public String featureKey;

        @NameInMap("FeatureValue")
        public String featureValue;

        public static ListPhysicalConnectionFeaturesResponseBodyPhysicalConnectionFeatures build(java.util.Map<String, ?> map) throws Exception {
            ListPhysicalConnectionFeaturesResponseBodyPhysicalConnectionFeatures self = new ListPhysicalConnectionFeaturesResponseBodyPhysicalConnectionFeatures();
            return TeaModel.build(map, self);
        }

        public ListPhysicalConnectionFeaturesResponseBodyPhysicalConnectionFeatures setFeatureKey(String featureKey) {
            this.featureKey = featureKey;
            return this;
        }
        public String getFeatureKey() {
            return this.featureKey;
        }

        public ListPhysicalConnectionFeaturesResponseBodyPhysicalConnectionFeatures setFeatureValue(String featureValue) {
            this.featureValue = featureValue;
            return this;
        }
        public String getFeatureValue() {
            return this.featureValue;
        }

    }

}
