// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ListPhysicalConnectionFeaturesResponseBody extends TeaModel {
    /**
     * <p>The list of Express Connect circuit features.</p>
     */
    @NameInMap("PhysicalConnectionFeatures")
    public java.util.List<ListPhysicalConnectionFeaturesResponseBodyPhysicalConnectionFeatures> physicalConnectionFeatures;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A599D38F-3618-18FD-9427-108FB9B5BD26</p>
     */
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
        /**
         * <p>The feature key of the Express Connect circuit. Valid values:</p>
         * <ul>
         * <li><strong>SubifRateLimit</strong>: subinterface throttling</li>
         * <li><strong>BFD Capability</strong>: Bidirectional Forwarding Detection (BFD)</li>
         * <li><strong>DualStack</strong>: Dual stack</li>
         * <li><strong>CEN</strong>: When a virtual border router (VBR) is attached to a Cloud Enterprise Network (CEN) instance and BGP routes are advertised on the user side, attributes such as <strong>as-path</strong> and <strong>community</strong> are carried.</li>
         * <li><strong>CENv6</strong>: When a VBR is attached to an IPv6 CEN instance and BGP routes are advertised on the user side, attributes such as <strong>as-path</strong> and <strong>community</strong> are carried.</li>
         * <li><strong>QOS</strong>: The device supports configuring QOS policies on physical ports.</li>
         * <li><strong>MSHA</strong>: The device supports fast switching groups between two VBRs.</li>
         * <li><strong>MULTI_MS_HA</strong>: The device supports a maximum of eight VBRs that can be added to the same ECR.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SubifRateLimit</p>
         */
        @NameInMap("FeatureKey")
        public String featureKey;

        /**
         * <p>The feature value of the Express Connect circuit. Valid values:</p>
         * <ul>
         * <li><strong>OK</strong>: Supported</li>
         * <li><strong>NOK</strong>: Not supported</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
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
