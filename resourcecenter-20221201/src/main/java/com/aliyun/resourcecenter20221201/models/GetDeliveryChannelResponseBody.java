// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcecenter20221201.models;

import com.aliyun.tea.*;

public class GetDeliveryChannelResponseBody extends TeaModel {
    /**
     * <p>The description of the delivery channel.</p>
     */
    @NameInMap("DeliveryChannelDescription")
    public String deliveryChannelDescription;

    /**
     * <p>The effective scope of the delivery channel.</p>
     */
    @NameInMap("DeliveryChannelFilter")
    public GetDeliveryChannelResponseBodyDeliveryChannelFilter deliveryChannelFilter;

    /**
     * <p>The ID of the delivery channel.</p>
     * 
     * <strong>example:</strong>
     * <p>dc-6q79dm4o9***</p>
     */
    @NameInMap("DeliveryChannelId")
    public String deliveryChannelId;

    /**
     * <p>The name of the delivery channel.</p>
     * 
     * <strong>example:</strong>
     * <p>test-delivery-channel</p>
     */
    @NameInMap("DeliveryChannelName")
    public String deliveryChannelName;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>17502A1B-7026-5551-8E1C-CCABD0CBC***</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The configurations for delivery of resource configuration change events.</p>
     */
    @NameInMap("ResourceChangeDelivery")
    public GetDeliveryChannelResponseBodyResourceChangeDelivery resourceChangeDelivery;

    /**
     * <p>The configurations for delivery of scheduled resource snapshots.</p>
     */
    @NameInMap("ResourceSnapshotDelivery")
    public GetDeliveryChannelResponseBodyResourceSnapshotDelivery resourceSnapshotDelivery;

    public static GetDeliveryChannelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDeliveryChannelResponseBody self = new GetDeliveryChannelResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDeliveryChannelResponseBody setDeliveryChannelDescription(String deliveryChannelDescription) {
        this.deliveryChannelDescription = deliveryChannelDescription;
        return this;
    }
    public String getDeliveryChannelDescription() {
        return this.deliveryChannelDescription;
    }

    public GetDeliveryChannelResponseBody setDeliveryChannelFilter(GetDeliveryChannelResponseBodyDeliveryChannelFilter deliveryChannelFilter) {
        this.deliveryChannelFilter = deliveryChannelFilter;
        return this;
    }
    public GetDeliveryChannelResponseBodyDeliveryChannelFilter getDeliveryChannelFilter() {
        return this.deliveryChannelFilter;
    }

    public GetDeliveryChannelResponseBody setDeliveryChannelId(String deliveryChannelId) {
        this.deliveryChannelId = deliveryChannelId;
        return this;
    }
    public String getDeliveryChannelId() {
        return this.deliveryChannelId;
    }

    public GetDeliveryChannelResponseBody setDeliveryChannelName(String deliveryChannelName) {
        this.deliveryChannelName = deliveryChannelName;
        return this;
    }
    public String getDeliveryChannelName() {
        return this.deliveryChannelName;
    }

    public GetDeliveryChannelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDeliveryChannelResponseBody setResourceChangeDelivery(GetDeliveryChannelResponseBodyResourceChangeDelivery resourceChangeDelivery) {
        this.resourceChangeDelivery = resourceChangeDelivery;
        return this;
    }
    public GetDeliveryChannelResponseBodyResourceChangeDelivery getResourceChangeDelivery() {
        return this.resourceChangeDelivery;
    }

    public GetDeliveryChannelResponseBody setResourceSnapshotDelivery(GetDeliveryChannelResponseBodyResourceSnapshotDelivery resourceSnapshotDelivery) {
        this.resourceSnapshotDelivery = resourceSnapshotDelivery;
        return this;
    }
    public GetDeliveryChannelResponseBodyResourceSnapshotDelivery getResourceSnapshotDelivery() {
        return this.resourceSnapshotDelivery;
    }

    public static class GetDeliveryChannelResponseBodyDeliveryChannelFilter extends TeaModel {
        /**
         * <p>The effective resource types of the delivery channel.</p>
         */
        @NameInMap("ResourceTypes")
        public java.util.List<String> resourceTypes;

        public static GetDeliveryChannelResponseBodyDeliveryChannelFilter build(java.util.Map<String, ?> map) throws Exception {
            GetDeliveryChannelResponseBodyDeliveryChannelFilter self = new GetDeliveryChannelResponseBodyDeliveryChannelFilter();
            return TeaModel.build(map, self);
        }

        public GetDeliveryChannelResponseBodyDeliveryChannelFilter setResourceTypes(java.util.List<String> resourceTypes) {
            this.resourceTypes = resourceTypes;
            return this;
        }
        public java.util.List<String> getResourceTypes() {
            return this.resourceTypes;
        }

    }

    public static class GetDeliveryChannelResponseBodyResourceChangeDeliverySlsProperties extends TeaModel {
        /**
         * <p>The Alibaba Cloud Resource Name (ARN) of the destination to which large files are delivered.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:oss:cn-hangzhou:1911422487776***:resourcecenter-oss</p>
         */
        @NameInMap("OversizedDataOssTargetArn")
        public String oversizedDataOssTargetArn;

        public static GetDeliveryChannelResponseBodyResourceChangeDeliverySlsProperties build(java.util.Map<String, ?> map) throws Exception {
            GetDeliveryChannelResponseBodyResourceChangeDeliverySlsProperties self = new GetDeliveryChannelResponseBodyResourceChangeDeliverySlsProperties();
            return TeaModel.build(map, self);
        }

        public GetDeliveryChannelResponseBodyResourceChangeDeliverySlsProperties setOversizedDataOssTargetArn(String oversizedDataOssTargetArn) {
            this.oversizedDataOssTargetArn = oversizedDataOssTargetArn;
            return this;
        }
        public String getOversizedDataOssTargetArn() {
            return this.oversizedDataOssTargetArn;
        }

    }

    public static class GetDeliveryChannelResponseBodyResourceChangeDelivery extends TeaModel {
        /**
         * <p>The Simple Log Service configurations.</p>
         */
        @NameInMap("SlsProperties")
        public GetDeliveryChannelResponseBodyResourceChangeDeliverySlsProperties slsProperties;

        /**
         * <p>The ARN of the delivery destination.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:log:cn-hangzhou: 1911422487776***:project/delivery/logstore/resourcecenter-sls</p>
         */
        @NameInMap("TargetArn")
        public String targetArn;

        /**
         * <p>The type of the destination.</p>
         * 
         * <strong>example:</strong>
         * <p>SLS</p>
         */
        @NameInMap("TargetType")
        public String targetType;

        public static GetDeliveryChannelResponseBodyResourceChangeDelivery build(java.util.Map<String, ?> map) throws Exception {
            GetDeliveryChannelResponseBodyResourceChangeDelivery self = new GetDeliveryChannelResponseBodyResourceChangeDelivery();
            return TeaModel.build(map, self);
        }

        public GetDeliveryChannelResponseBodyResourceChangeDelivery setSlsProperties(GetDeliveryChannelResponseBodyResourceChangeDeliverySlsProperties slsProperties) {
            this.slsProperties = slsProperties;
            return this;
        }
        public GetDeliveryChannelResponseBodyResourceChangeDeliverySlsProperties getSlsProperties() {
            return this.slsProperties;
        }

        public GetDeliveryChannelResponseBodyResourceChangeDelivery setTargetArn(String targetArn) {
            this.targetArn = targetArn;
            return this;
        }
        public String getTargetArn() {
            return this.targetArn;
        }

        public GetDeliveryChannelResponseBodyResourceChangeDelivery setTargetType(String targetType) {
            this.targetType = targetType;
            return this;
        }
        public String getTargetType() {
            return this.targetType;
        }

    }

    public static class GetDeliveryChannelResponseBodyResourceSnapshotDeliverySlsProperties extends TeaModel {
        /**
         * <p>The ARN of the destination to which large files are delivered.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:oss:cn-hangzhou:1911422487776***:resourcecenter-oss</p>
         */
        @NameInMap("OversizedDataOssTargetArn")
        public String oversizedDataOssTargetArn;

        public static GetDeliveryChannelResponseBodyResourceSnapshotDeliverySlsProperties build(java.util.Map<String, ?> map) throws Exception {
            GetDeliveryChannelResponseBodyResourceSnapshotDeliverySlsProperties self = new GetDeliveryChannelResponseBodyResourceSnapshotDeliverySlsProperties();
            return TeaModel.build(map, self);
        }

        public GetDeliveryChannelResponseBodyResourceSnapshotDeliverySlsProperties setOversizedDataOssTargetArn(String oversizedDataOssTargetArn) {
            this.oversizedDataOssTargetArn = oversizedDataOssTargetArn;
            return this;
        }
        public String getOversizedDataOssTargetArn() {
            return this.oversizedDataOssTargetArn;
        }

    }

    public static class GetDeliveryChannelResponseBodyResourceSnapshotDelivery extends TeaModel {
        /**
         * <p>The custom expression.</p>
         * 
         * <strong>example:</strong>
         * <p>select * from resources limit 100;</p>
         */
        @NameInMap("CustomExpression")
        public String customExpression;

        /**
         * <p>The delivery time.</p>
         * 
         * <strong>example:</strong>
         * <p>09:00Z</p>
         */
        @NameInMap("DeliveryTime")
        public String deliveryTime;

        /**
         * <p>The Simple Log Service configurations.</p>
         */
        @NameInMap("SlsProperties")
        public GetDeliveryChannelResponseBodyResourceSnapshotDeliverySlsProperties slsProperties;

        /**
         * <p>The ARN of the delivery destination.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:oss:cn-hangzhou:1911422487776***:resourcecenter-oss</p>
         */
        @NameInMap("TargetArn")
        public String targetArn;

        /**
         * <p>The type of the destination.</p>
         * 
         * <strong>example:</strong>
         * <p>OSS</p>
         */
        @NameInMap("TargetType")
        public String targetType;

        public static GetDeliveryChannelResponseBodyResourceSnapshotDelivery build(java.util.Map<String, ?> map) throws Exception {
            GetDeliveryChannelResponseBodyResourceSnapshotDelivery self = new GetDeliveryChannelResponseBodyResourceSnapshotDelivery();
            return TeaModel.build(map, self);
        }

        public GetDeliveryChannelResponseBodyResourceSnapshotDelivery setCustomExpression(String customExpression) {
            this.customExpression = customExpression;
            return this;
        }
        public String getCustomExpression() {
            return this.customExpression;
        }

        public GetDeliveryChannelResponseBodyResourceSnapshotDelivery setDeliveryTime(String deliveryTime) {
            this.deliveryTime = deliveryTime;
            return this;
        }
        public String getDeliveryTime() {
            return this.deliveryTime;
        }

        public GetDeliveryChannelResponseBodyResourceSnapshotDelivery setSlsProperties(GetDeliveryChannelResponseBodyResourceSnapshotDeliverySlsProperties slsProperties) {
            this.slsProperties = slsProperties;
            return this;
        }
        public GetDeliveryChannelResponseBodyResourceSnapshotDeliverySlsProperties getSlsProperties() {
            return this.slsProperties;
        }

        public GetDeliveryChannelResponseBodyResourceSnapshotDelivery setTargetArn(String targetArn) {
            this.targetArn = targetArn;
            return this;
        }
        public String getTargetArn() {
            return this.targetArn;
        }

        public GetDeliveryChannelResponseBodyResourceSnapshotDelivery setTargetType(String targetType) {
            this.targetType = targetType;
            return this;
        }
        public String getTargetType() {
            return this.targetType;
        }

    }

}
