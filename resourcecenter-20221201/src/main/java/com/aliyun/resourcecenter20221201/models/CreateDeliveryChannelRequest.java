// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcecenter20221201.models;

import com.aliyun.tea.*;

public class CreateDeliveryChannelRequest extends TeaModel {
    @NameInMap("DeliveryChannelDescription")
    public String deliveryChannelDescription;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DeliveryChannelFilter")
    public CreateDeliveryChannelRequestDeliveryChannelFilter deliveryChannelFilter;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-delivery</p>
     */
    @NameInMap("DeliveryChannelName")
    public String deliveryChannelName;

    @NameInMap("ResourceChangeDelivery")
    public CreateDeliveryChannelRequestResourceChangeDelivery resourceChangeDelivery;

    @NameInMap("ResourceSnapshotDelivery")
    public CreateDeliveryChannelRequestResourceSnapshotDelivery resourceSnapshotDelivery;

    public static CreateDeliveryChannelRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDeliveryChannelRequest self = new CreateDeliveryChannelRequest();
        return TeaModel.build(map, self);
    }

    public CreateDeliveryChannelRequest setDeliveryChannelDescription(String deliveryChannelDescription) {
        this.deliveryChannelDescription = deliveryChannelDescription;
        return this;
    }
    public String getDeliveryChannelDescription() {
        return this.deliveryChannelDescription;
    }

    public CreateDeliveryChannelRequest setDeliveryChannelFilter(CreateDeliveryChannelRequestDeliveryChannelFilter deliveryChannelFilter) {
        this.deliveryChannelFilter = deliveryChannelFilter;
        return this;
    }
    public CreateDeliveryChannelRequestDeliveryChannelFilter getDeliveryChannelFilter() {
        return this.deliveryChannelFilter;
    }

    public CreateDeliveryChannelRequest setDeliveryChannelName(String deliveryChannelName) {
        this.deliveryChannelName = deliveryChannelName;
        return this;
    }
    public String getDeliveryChannelName() {
        return this.deliveryChannelName;
    }

    public CreateDeliveryChannelRequest setResourceChangeDelivery(CreateDeliveryChannelRequestResourceChangeDelivery resourceChangeDelivery) {
        this.resourceChangeDelivery = resourceChangeDelivery;
        return this;
    }
    public CreateDeliveryChannelRequestResourceChangeDelivery getResourceChangeDelivery() {
        return this.resourceChangeDelivery;
    }

    public CreateDeliveryChannelRequest setResourceSnapshotDelivery(CreateDeliveryChannelRequestResourceSnapshotDelivery resourceSnapshotDelivery) {
        this.resourceSnapshotDelivery = resourceSnapshotDelivery;
        return this;
    }
    public CreateDeliveryChannelRequestResourceSnapshotDelivery getResourceSnapshotDelivery() {
        return this.resourceSnapshotDelivery;
    }

    public static class CreateDeliveryChannelRequestDeliveryChannelFilter extends TeaModel {
        @NameInMap("ResourceTypes")
        public java.util.List<String> resourceTypes;

        public static CreateDeliveryChannelRequestDeliveryChannelFilter build(java.util.Map<String, ?> map) throws Exception {
            CreateDeliveryChannelRequestDeliveryChannelFilter self = new CreateDeliveryChannelRequestDeliveryChannelFilter();
            return TeaModel.build(map, self);
        }

        public CreateDeliveryChannelRequestDeliveryChannelFilter setResourceTypes(java.util.List<String> resourceTypes) {
            this.resourceTypes = resourceTypes;
            return this;
        }
        public java.util.List<String> getResourceTypes() {
            return this.resourceTypes;
        }

    }

    public static class CreateDeliveryChannelRequestResourceChangeDeliverySlsProperties extends TeaModel {
        @NameInMap("OversizedDataOssTargetArn")
        public String oversizedDataOssTargetArn;

        public static CreateDeliveryChannelRequestResourceChangeDeliverySlsProperties build(java.util.Map<String, ?> map) throws Exception {
            CreateDeliveryChannelRequestResourceChangeDeliverySlsProperties self = new CreateDeliveryChannelRequestResourceChangeDeliverySlsProperties();
            return TeaModel.build(map, self);
        }

        public CreateDeliveryChannelRequestResourceChangeDeliverySlsProperties setOversizedDataOssTargetArn(String oversizedDataOssTargetArn) {
            this.oversizedDataOssTargetArn = oversizedDataOssTargetArn;
            return this;
        }
        public String getOversizedDataOssTargetArn() {
            return this.oversizedDataOssTargetArn;
        }

    }

    public static class CreateDeliveryChannelRequestResourceChangeDelivery extends TeaModel {
        @NameInMap("SlsProperties")
        public CreateDeliveryChannelRequestResourceChangeDeliverySlsProperties slsProperties;

        @NameInMap("TargetArn")
        public String targetArn;

        /**
         * <strong>example:</strong>
         * <p>SLS</p>
         */
        @NameInMap("TargetType")
        public String targetType;

        public static CreateDeliveryChannelRequestResourceChangeDelivery build(java.util.Map<String, ?> map) throws Exception {
            CreateDeliveryChannelRequestResourceChangeDelivery self = new CreateDeliveryChannelRequestResourceChangeDelivery();
            return TeaModel.build(map, self);
        }

        public CreateDeliveryChannelRequestResourceChangeDelivery setSlsProperties(CreateDeliveryChannelRequestResourceChangeDeliverySlsProperties slsProperties) {
            this.slsProperties = slsProperties;
            return this;
        }
        public CreateDeliveryChannelRequestResourceChangeDeliverySlsProperties getSlsProperties() {
            return this.slsProperties;
        }

        public CreateDeliveryChannelRequestResourceChangeDelivery setTargetArn(String targetArn) {
            this.targetArn = targetArn;
            return this;
        }
        public String getTargetArn() {
            return this.targetArn;
        }

        public CreateDeliveryChannelRequestResourceChangeDelivery setTargetType(String targetType) {
            this.targetType = targetType;
            return this;
        }
        public String getTargetType() {
            return this.targetType;
        }

    }

    public static class CreateDeliveryChannelRequestResourceSnapshotDeliverySlsProperties extends TeaModel {
        @NameInMap("OversizedDataOssTargetArn")
        public String oversizedDataOssTargetArn;

        public static CreateDeliveryChannelRequestResourceSnapshotDeliverySlsProperties build(java.util.Map<String, ?> map) throws Exception {
            CreateDeliveryChannelRequestResourceSnapshotDeliverySlsProperties self = new CreateDeliveryChannelRequestResourceSnapshotDeliverySlsProperties();
            return TeaModel.build(map, self);
        }

        public CreateDeliveryChannelRequestResourceSnapshotDeliverySlsProperties setOversizedDataOssTargetArn(String oversizedDataOssTargetArn) {
            this.oversizedDataOssTargetArn = oversizedDataOssTargetArn;
            return this;
        }
        public String getOversizedDataOssTargetArn() {
            return this.oversizedDataOssTargetArn;
        }

    }

    public static class CreateDeliveryChannelRequestResourceSnapshotDelivery extends TeaModel {
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
        public CreateDeliveryChannelRequestResourceSnapshotDeliverySlsProperties slsProperties;

        @NameInMap("TargetArn")
        public String targetArn;

        /**
         * <strong>example:</strong>
         * <p>OSS</p>
         */
        @NameInMap("TargetType")
        public String targetType;

        public static CreateDeliveryChannelRequestResourceSnapshotDelivery build(java.util.Map<String, ?> map) throws Exception {
            CreateDeliveryChannelRequestResourceSnapshotDelivery self = new CreateDeliveryChannelRequestResourceSnapshotDelivery();
            return TeaModel.build(map, self);
        }

        public CreateDeliveryChannelRequestResourceSnapshotDelivery setCustomExpression(String customExpression) {
            this.customExpression = customExpression;
            return this;
        }
        public String getCustomExpression() {
            return this.customExpression;
        }

        public CreateDeliveryChannelRequestResourceSnapshotDelivery setDeliveryTime(String deliveryTime) {
            this.deliveryTime = deliveryTime;
            return this;
        }
        public String getDeliveryTime() {
            return this.deliveryTime;
        }

        public CreateDeliveryChannelRequestResourceSnapshotDelivery setSlsProperties(CreateDeliveryChannelRequestResourceSnapshotDeliverySlsProperties slsProperties) {
            this.slsProperties = slsProperties;
            return this;
        }
        public CreateDeliveryChannelRequestResourceSnapshotDeliverySlsProperties getSlsProperties() {
            return this.slsProperties;
        }

        public CreateDeliveryChannelRequestResourceSnapshotDelivery setTargetArn(String targetArn) {
            this.targetArn = targetArn;
            return this;
        }
        public String getTargetArn() {
            return this.targetArn;
        }

        public CreateDeliveryChannelRequestResourceSnapshotDelivery setTargetType(String targetType) {
            this.targetType = targetType;
            return this;
        }
        public String getTargetType() {
            return this.targetType;
        }

    }

}
