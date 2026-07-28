// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ListPhysicalConnectionFeaturesResponseBody extends TeaModel {
    /**
     * <p>The list of Express Connect circuit attributes.</p>
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
         * <p>The attribute key of the Express Connect circuit. Valid values:</p>
         * <ul>
         * <li><strong>SubifRateLimit</strong>: sub-interface rate limiting.</li>
         * <li><strong>BFD能力</strong>: Bidirectional Forwarding Detection (BFD) capability.</li>
         * <li><strong>DualStack</strong>: the capability to support both IPv4 and IPv6.</li>
         * <li><strong>CEN</strong>: when a Virtual Border Router (VBR) is attached to a Cloud Enterprise Network (CEN) instance, the original route attributes such as <strong>as-path</strong> and <strong>community</strong> can be carried when advertising BGP routes to the user side.</li>
         * <li><strong>CENv6</strong>: when a VBR is attached to an IPv6-enabled CEN instance, the original route attributes such as <strong>as-path</strong> and <strong>community</strong> can be carried when advertising BGP routes to the user side.</li>
         * <li><strong>QOS</strong>: the device supports configuring QoS policies on physical ports.</li>
         * <li><strong>MSHA</strong>: the device supports configuring a fast failover group between two VBRs.</li>
         * <li><strong>MULTI_MS_HA</strong>: the device supports configuring a fast failover group among up to 8 VBRs. These VBRs must be added to the same Express Connect Router (ECR).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SubifRateLimit</p>
         */
        @NameInMap("FeatureKey")
        public String featureKey;

        /**
         * <p>The attribute value of the Express Connect circuit. Valid values:</p>
         * <ul>
         * <li><strong>OK</strong>: Supported.</li>
         * <li><strong>NOK</strong>: Not supported.</li>
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
