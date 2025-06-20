// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcecenter20221201.models;

import com.aliyun.tea.*;

public class GetMultiAccountDeliveryChannelResponseBody extends TeaModel {
    @NameInMap("DeliveryChannelDescription")
    public String deliveryChannelDescription;

    @NameInMap("DeliveryChannelFilter")
    public GetMultiAccountDeliveryChannelResponseBodyDeliveryChannelFilter deliveryChannelFilter;

    /**
     * <strong>example:</strong>
     * <p>dc-6q79dm4o9***</p>
     */
    @NameInMap("DeliveryChannelId")
    public String deliveryChannelId;

    /**
     * <strong>example:</strong>
     * <p>test-delivery-channel</p>
     */
    @NameInMap("DeliveryChannelName")
    public String deliveryChannelName;

    /**
     * <strong>example:</strong>
     * <p>FE3EAB47-D3A6-5FEA-8353-31C8C0D36***</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResourceChangeDelivery")
    public GetMultiAccountDeliveryChannelResponseBodyResourceChangeDelivery resourceChangeDelivery;

    @NameInMap("ResourceSnapshotDelivery")
    public GetMultiAccountDeliveryChannelResponseBodyResourceSnapshotDelivery resourceSnapshotDelivery;

    public static GetMultiAccountDeliveryChannelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMultiAccountDeliveryChannelResponseBody self = new GetMultiAccountDeliveryChannelResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMultiAccountDeliveryChannelResponseBody setDeliveryChannelDescription(String deliveryChannelDescription) {
        this.deliveryChannelDescription = deliveryChannelDescription;
        return this;
    }
    public String getDeliveryChannelDescription() {
        return this.deliveryChannelDescription;
    }

    public GetMultiAccountDeliveryChannelResponseBody setDeliveryChannelFilter(GetMultiAccountDeliveryChannelResponseBodyDeliveryChannelFilter deliveryChannelFilter) {
        this.deliveryChannelFilter = deliveryChannelFilter;
        return this;
    }
    public GetMultiAccountDeliveryChannelResponseBodyDeliveryChannelFilter getDeliveryChannelFilter() {
        return this.deliveryChannelFilter;
    }

    public GetMultiAccountDeliveryChannelResponseBody setDeliveryChannelId(String deliveryChannelId) {
        this.deliveryChannelId = deliveryChannelId;
        return this;
    }
    public String getDeliveryChannelId() {
        return this.deliveryChannelId;
    }

    public GetMultiAccountDeliveryChannelResponseBody setDeliveryChannelName(String deliveryChannelName) {
        this.deliveryChannelName = deliveryChannelName;
        return this;
    }
    public String getDeliveryChannelName() {
        return this.deliveryChannelName;
    }

    public GetMultiAccountDeliveryChannelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMultiAccountDeliveryChannelResponseBody setResourceChangeDelivery(GetMultiAccountDeliveryChannelResponseBodyResourceChangeDelivery resourceChangeDelivery) {
        this.resourceChangeDelivery = resourceChangeDelivery;
        return this;
    }
    public GetMultiAccountDeliveryChannelResponseBodyResourceChangeDelivery getResourceChangeDelivery() {
        return this.resourceChangeDelivery;
    }

    public GetMultiAccountDeliveryChannelResponseBody setResourceSnapshotDelivery(GetMultiAccountDeliveryChannelResponseBodyResourceSnapshotDelivery resourceSnapshotDelivery) {
        this.resourceSnapshotDelivery = resourceSnapshotDelivery;
        return this;
    }
    public GetMultiAccountDeliveryChannelResponseBodyResourceSnapshotDelivery getResourceSnapshotDelivery() {
        return this.resourceSnapshotDelivery;
    }

    public static class GetMultiAccountDeliveryChannelResponseBodyDeliveryChannelFilter extends TeaModel {
        @NameInMap("AccountScopes")
        public java.util.List<String> accountScopes;

        @NameInMap("ResourceTypes")
        public java.util.List<String> resourceTypes;

        public static GetMultiAccountDeliveryChannelResponseBodyDeliveryChannelFilter build(java.util.Map<String, ?> map) throws Exception {
            GetMultiAccountDeliveryChannelResponseBodyDeliveryChannelFilter self = new GetMultiAccountDeliveryChannelResponseBodyDeliveryChannelFilter();
            return TeaModel.build(map, self);
        }

        public GetMultiAccountDeliveryChannelResponseBodyDeliveryChannelFilter setAccountScopes(java.util.List<String> accountScopes) {
            this.accountScopes = accountScopes;
            return this;
        }
        public java.util.List<String> getAccountScopes() {
            return this.accountScopes;
        }

        public GetMultiAccountDeliveryChannelResponseBodyDeliveryChannelFilter setResourceTypes(java.util.List<String> resourceTypes) {
            this.resourceTypes = resourceTypes;
            return this;
        }
        public java.util.List<String> getResourceTypes() {
            return this.resourceTypes;
        }

    }

    public static class GetMultiAccountDeliveryChannelResponseBodyResourceChangeDeliverySlsProperties extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>acs:oss:cn-hangzhou:1911422487776***:resourcecenter-oss</p>
         */
        @NameInMap("OversizedDataOssTargetArn")
        public String oversizedDataOssTargetArn;

        public static GetMultiAccountDeliveryChannelResponseBodyResourceChangeDeliverySlsProperties build(java.util.Map<String, ?> map) throws Exception {
            GetMultiAccountDeliveryChannelResponseBodyResourceChangeDeliverySlsProperties self = new GetMultiAccountDeliveryChannelResponseBodyResourceChangeDeliverySlsProperties();
            return TeaModel.build(map, self);
        }

        public GetMultiAccountDeliveryChannelResponseBodyResourceChangeDeliverySlsProperties setOversizedDataOssTargetArn(String oversizedDataOssTargetArn) {
            this.oversizedDataOssTargetArn = oversizedDataOssTargetArn;
            return this;
        }
        public String getOversizedDataOssTargetArn() {
            return this.oversizedDataOssTargetArn;
        }

    }

    public static class GetMultiAccountDeliveryChannelResponseBodyResourceChangeDelivery extends TeaModel {
        @NameInMap("SlsProperties")
        public GetMultiAccountDeliveryChannelResponseBodyResourceChangeDeliverySlsProperties slsProperties;

        /**
         * <strong>example:</strong>
         * <p>acs:log:cn-hangzhou: 1911422487776***:project/delivery/logstore/resourcecenter-sls</p>
         */
        @NameInMap("TargetArn")
        public String targetArn;

        /**
         * <strong>example:</strong>
         * <p>SLS</p>
         */
        @NameInMap("TargetType")
        public String targetType;

        public static GetMultiAccountDeliveryChannelResponseBodyResourceChangeDelivery build(java.util.Map<String, ?> map) throws Exception {
            GetMultiAccountDeliveryChannelResponseBodyResourceChangeDelivery self = new GetMultiAccountDeliveryChannelResponseBodyResourceChangeDelivery();
            return TeaModel.build(map, self);
        }

        public GetMultiAccountDeliveryChannelResponseBodyResourceChangeDelivery setSlsProperties(GetMultiAccountDeliveryChannelResponseBodyResourceChangeDeliverySlsProperties slsProperties) {
            this.slsProperties = slsProperties;
            return this;
        }
        public GetMultiAccountDeliveryChannelResponseBodyResourceChangeDeliverySlsProperties getSlsProperties() {
            return this.slsProperties;
        }

        public GetMultiAccountDeliveryChannelResponseBodyResourceChangeDelivery setTargetArn(String targetArn) {
            this.targetArn = targetArn;
            return this;
        }
        public String getTargetArn() {
            return this.targetArn;
        }

        public GetMultiAccountDeliveryChannelResponseBodyResourceChangeDelivery setTargetType(String targetType) {
            this.targetType = targetType;
            return this;
        }
        public String getTargetType() {
            return this.targetType;
        }

    }

    public static class GetMultiAccountDeliveryChannelResponseBodyResourceSnapshotDeliverySlsProperties extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>acs:oss:cn-hangzhou:1911422487776***:resourcecenter-oss</p>
         */
        @NameInMap("OversizedDataOssTargetArn")
        public String oversizedDataOssTargetArn;

        public static GetMultiAccountDeliveryChannelResponseBodyResourceSnapshotDeliverySlsProperties build(java.util.Map<String, ?> map) throws Exception {
            GetMultiAccountDeliveryChannelResponseBodyResourceSnapshotDeliverySlsProperties self = new GetMultiAccountDeliveryChannelResponseBodyResourceSnapshotDeliverySlsProperties();
            return TeaModel.build(map, self);
        }

        public GetMultiAccountDeliveryChannelResponseBodyResourceSnapshotDeliverySlsProperties setOversizedDataOssTargetArn(String oversizedDataOssTargetArn) {
            this.oversizedDataOssTargetArn = oversizedDataOssTargetArn;
            return this;
        }
        public String getOversizedDataOssTargetArn() {
            return this.oversizedDataOssTargetArn;
        }

    }

    public static class GetMultiAccountDeliveryChannelResponseBodyResourceSnapshotDelivery extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>select * from resources limit 100;</p>
         */
        @NameInMap("CustomExpression")
        public String customExpression;

        /**
         * <strong>example:</strong>
         * <p>09:00Z</p>
         */
        @NameInMap("DeliveryTime")
        public String deliveryTime;

        @NameInMap("SlsProperties")
        public GetMultiAccountDeliveryChannelResponseBodyResourceSnapshotDeliverySlsProperties slsProperties;

        /**
         * <strong>example:</strong>
         * <p>acs:oss:cn-hangzhou:1911422487776***:resourcecenter-oss</p>
         */
        @NameInMap("TargetArn")
        public String targetArn;

        /**
         * <strong>example:</strong>
         * <p>OSS</p>
         */
        @NameInMap("TargetType")
        public String targetType;

        public static GetMultiAccountDeliveryChannelResponseBodyResourceSnapshotDelivery build(java.util.Map<String, ?> map) throws Exception {
            GetMultiAccountDeliveryChannelResponseBodyResourceSnapshotDelivery self = new GetMultiAccountDeliveryChannelResponseBodyResourceSnapshotDelivery();
            return TeaModel.build(map, self);
        }

        public GetMultiAccountDeliveryChannelResponseBodyResourceSnapshotDelivery setCustomExpression(String customExpression) {
            this.customExpression = customExpression;
            return this;
        }
        public String getCustomExpression() {
            return this.customExpression;
        }

        public GetMultiAccountDeliveryChannelResponseBodyResourceSnapshotDelivery setDeliveryTime(String deliveryTime) {
            this.deliveryTime = deliveryTime;
            return this;
        }
        public String getDeliveryTime() {
            return this.deliveryTime;
        }

        public GetMultiAccountDeliveryChannelResponseBodyResourceSnapshotDelivery setSlsProperties(GetMultiAccountDeliveryChannelResponseBodyResourceSnapshotDeliverySlsProperties slsProperties) {
            this.slsProperties = slsProperties;
            return this;
        }
        public GetMultiAccountDeliveryChannelResponseBodyResourceSnapshotDeliverySlsProperties getSlsProperties() {
            return this.slsProperties;
        }

        public GetMultiAccountDeliveryChannelResponseBodyResourceSnapshotDelivery setTargetArn(String targetArn) {
            this.targetArn = targetArn;
            return this;
        }
        public String getTargetArn() {
            return this.targetArn;
        }

        public GetMultiAccountDeliveryChannelResponseBodyResourceSnapshotDelivery setTargetType(String targetType) {
            this.targetType = targetType;
            return this;
        }
        public String getTargetType() {
            return this.targetType;
        }

    }

}
