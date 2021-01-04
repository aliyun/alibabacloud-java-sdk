// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ListSmartAGApiUnsupportedFeatureResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Features")
    public java.util.List<ListSmartAGApiUnsupportedFeatureResponseBodyFeatures> features;

    public static ListSmartAGApiUnsupportedFeatureResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSmartAGApiUnsupportedFeatureResponseBody self = new ListSmartAGApiUnsupportedFeatureResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSmartAGApiUnsupportedFeatureResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSmartAGApiUnsupportedFeatureResponseBody setFeatures(java.util.List<ListSmartAGApiUnsupportedFeatureResponseBodyFeatures> features) {
        this.features = features;
        return this;
    }
    public java.util.List<ListSmartAGApiUnsupportedFeatureResponseBodyFeatures> getFeatures() {
        return this.features;
    }

    public static class ListSmartAGApiUnsupportedFeatureResponseBodyFeatures extends TeaModel {
        @NameInMap("Feature")
        public String feature;

        public static ListSmartAGApiUnsupportedFeatureResponseBodyFeatures build(java.util.Map<String, ?> map) throws Exception {
            ListSmartAGApiUnsupportedFeatureResponseBodyFeatures self = new ListSmartAGApiUnsupportedFeatureResponseBodyFeatures();
            return TeaModel.build(map, self);
        }

        public ListSmartAGApiUnsupportedFeatureResponseBodyFeatures setFeature(String feature) {
            this.feature = feature;
            return this;
        }
        public String getFeature() {
            return this.feature;
        }

    }

}
