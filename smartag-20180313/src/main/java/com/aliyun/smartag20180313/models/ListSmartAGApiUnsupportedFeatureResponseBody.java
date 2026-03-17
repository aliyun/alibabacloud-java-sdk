// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ListSmartAGApiUnsupportedFeatureResponseBody extends TeaModel {
    /**
     * <p>A list of unsupported features.</p>
     */
    @NameInMap("Features")
    public java.util.List<ListSmartAGApiUnsupportedFeatureResponseBodyFeatures> features;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>7459545D-2F0D-43E6-9957-CB7E0223332B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListSmartAGApiUnsupportedFeatureResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSmartAGApiUnsupportedFeatureResponseBody self = new ListSmartAGApiUnsupportedFeatureResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSmartAGApiUnsupportedFeatureResponseBody setFeatures(java.util.List<ListSmartAGApiUnsupportedFeatureResponseBodyFeatures> features) {
        this.features = features;
        return this;
    }
    public java.util.List<ListSmartAGApiUnsupportedFeatureResponseBodyFeatures> getFeatures() {
        return this.features;
    }

    public ListSmartAGApiUnsupportedFeatureResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListSmartAGApiUnsupportedFeatureResponseBodyFeatures extends TeaModel {
        /**
         * <p>The unsupported feature.</p>
         * <p>For more information about the description of each feature, see the related API reference.</p>
         * 
         * <strong>example:</strong>
         * <p>ISP</p>
         */
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
