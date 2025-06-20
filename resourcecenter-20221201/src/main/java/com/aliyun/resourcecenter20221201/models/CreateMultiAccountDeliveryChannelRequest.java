// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcecenter20221201.models;

import com.aliyun.tea.*;

public class CreateMultiAccountDeliveryChannelRequest extends TeaModel {
    @NameInMap("DeliveryChannelDescription")
    public String deliveryChannelDescription;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DeliveryChannelFilter")
    public CreateMultiAccountDeliveryChannelRequestDeliveryChannelFilter deliveryChannelFilter;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-multi-account-delivery</p>
     */
    @NameInMap("DeliveryChannelName")
    public String deliveryChannelName;

    @NameInMap("ResourceChangeDelivery")
    public CreateMultiAccountDeliveryChannelRequestResourceChangeDelivery resourceChangeDelivery;

    @NameInMap("ResourceSnapshotDelivery")
    public CreateMultiAccountDeliveryChannelRequestResourceSnapshotDelivery resourceSnapshotDelivery;

    public static CreateMultiAccountDeliveryChannelRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMultiAccountDeliveryChannelRequest self = new CreateMultiAccountDeliveryChannelRequest();
        return TeaModel.build(map, self);
    }

    public CreateMultiAccountDeliveryChannelRequest setDeliveryChannelDescription(String deliveryChannelDescription) {
        this.deliveryChannelDescription = deliveryChannelDescription;
        return this;
    }
    public String getDeliveryChannelDescription() {
        return this.deliveryChannelDescription;
    }

    public CreateMultiAccountDeliveryChannelRequest setDeliveryChannelFilter(CreateMultiAccountDeliveryChannelRequestDeliveryChannelFilter deliveryChannelFilter) {
        this.deliveryChannelFilter = deliveryChannelFilter;
        return this;
    }
    public CreateMultiAccountDeliveryChannelRequestDeliveryChannelFilter getDeliveryChannelFilter() {
        return this.deliveryChannelFilter;
    }

    public CreateMultiAccountDeliveryChannelRequest setDeliveryChannelName(String deliveryChannelName) {
        this.deliveryChannelName = deliveryChannelName;
        return this;
    }
    public String getDeliveryChannelName() {
        return this.deliveryChannelName;
    }

    public CreateMultiAccountDeliveryChannelRequest setResourceChangeDelivery(CreateMultiAccountDeliveryChannelRequestResourceChangeDelivery resourceChangeDelivery) {
        this.resourceChangeDelivery = resourceChangeDelivery;
        return this;
    }
    public CreateMultiAccountDeliveryChannelRequestResourceChangeDelivery getResourceChangeDelivery() {
        return this.resourceChangeDelivery;
    }

    public CreateMultiAccountDeliveryChannelRequest setResourceSnapshotDelivery(CreateMultiAccountDeliveryChannelRequestResourceSnapshotDelivery resourceSnapshotDelivery) {
        this.resourceSnapshotDelivery = resourceSnapshotDelivery;
        return this;
    }
    public CreateMultiAccountDeliveryChannelRequestResourceSnapshotDelivery getResourceSnapshotDelivery() {
        return this.resourceSnapshotDelivery;
    }

    public static class CreateMultiAccountDeliveryChannelRequestDeliveryChannelFilter extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("AccountScopes")
        public java.util.List<String> accountScopes;

        @NameInMap("ResourceTypes")
        public java.util.List<String> resourceTypes;

        public static CreateMultiAccountDeliveryChannelRequestDeliveryChannelFilter build(java.util.Map<String, ?> map) throws Exception {
            CreateMultiAccountDeliveryChannelRequestDeliveryChannelFilter self = new CreateMultiAccountDeliveryChannelRequestDeliveryChannelFilter();
            return TeaModel.build(map, self);
        }

        public CreateMultiAccountDeliveryChannelRequestDeliveryChannelFilter setAccountScopes(java.util.List<String> accountScopes) {
            this.accountScopes = accountScopes;
            return this;
        }
        public java.util.List<String> getAccountScopes() {
            return this.accountScopes;
        }

        public CreateMultiAccountDeliveryChannelRequestDeliveryChannelFilter setResourceTypes(java.util.List<String> resourceTypes) {
            this.resourceTypes = resourceTypes;
            return this;
        }
        public java.util.List<String> getResourceTypes() {
            return this.resourceTypes;
        }

    }

    public static class CreateMultiAccountDeliveryChannelRequestResourceChangeDeliverySlsProperties extends TeaModel {
        @NameInMap("OversizedDataOssTargetArn")
        public String oversizedDataOssTargetArn;

        public static CreateMultiAccountDeliveryChannelRequestResourceChangeDeliverySlsProperties build(java.util.Map<String, ?> map) throws Exception {
            CreateMultiAccountDeliveryChannelRequestResourceChangeDeliverySlsProperties self = new CreateMultiAccountDeliveryChannelRequestResourceChangeDeliverySlsProperties();
            return TeaModel.build(map, self);
        }

        public CreateMultiAccountDeliveryChannelRequestResourceChangeDeliverySlsProperties setOversizedDataOssTargetArn(String oversizedDataOssTargetArn) {
            this.oversizedDataOssTargetArn = oversizedDataOssTargetArn;
            return this;
        }
        public String getOversizedDataOssTargetArn() {
            return this.oversizedDataOssTargetArn;
        }

    }

    public static class CreateMultiAccountDeliveryChannelRequestResourceChangeDelivery extends TeaModel {
        @NameInMap("SlsProperties")
        public CreateMultiAccountDeliveryChannelRequestResourceChangeDeliverySlsProperties slsProperties;

        @NameInMap("TargetArn")
        public String targetArn;

        /**
         * <strong>example:</strong>
         * <p>SLS</p>
         */
        @NameInMap("TargetType")
        public String targetType;

        public static CreateMultiAccountDeliveryChannelRequestResourceChangeDelivery build(java.util.Map<String, ?> map) throws Exception {
            CreateMultiAccountDeliveryChannelRequestResourceChangeDelivery self = new CreateMultiAccountDeliveryChannelRequestResourceChangeDelivery();
            return TeaModel.build(map, self);
        }

        public CreateMultiAccountDeliveryChannelRequestResourceChangeDelivery setSlsProperties(CreateMultiAccountDeliveryChannelRequestResourceChangeDeliverySlsProperties slsProperties) {
            this.slsProperties = slsProperties;
            return this;
        }
        public CreateMultiAccountDeliveryChannelRequestResourceChangeDeliverySlsProperties getSlsProperties() {
            return this.slsProperties;
        }

        public CreateMultiAccountDeliveryChannelRequestResourceChangeDelivery setTargetArn(String targetArn) {
            this.targetArn = targetArn;
            return this;
        }
        public String getTargetArn() {
            return this.targetArn;
        }

        public CreateMultiAccountDeliveryChannelRequestResourceChangeDelivery setTargetType(String targetType) {
            this.targetType = targetType;
            return this;
        }
        public String getTargetType() {
            return this.targetType;
        }

    }

    public static class CreateMultiAccountDeliveryChannelRequestResourceSnapshotDeliverySlsProperties extends TeaModel {
        @NameInMap("OversizedDataOssTargetArn")
        public String oversizedDataOssTargetArn;

        public static CreateMultiAccountDeliveryChannelRequestResourceSnapshotDeliverySlsProperties build(java.util.Map<String, ?> map) throws Exception {
            CreateMultiAccountDeliveryChannelRequestResourceSnapshotDeliverySlsProperties self = new CreateMultiAccountDeliveryChannelRequestResourceSnapshotDeliverySlsProperties();
            return TeaModel.build(map, self);
        }

        public CreateMultiAccountDeliveryChannelRequestResourceSnapshotDeliverySlsProperties setOversizedDataOssTargetArn(String oversizedDataOssTargetArn) {
            this.oversizedDataOssTargetArn = oversizedDataOssTargetArn;
            return this;
        }
        public String getOversizedDataOssTargetArn() {
            return this.oversizedDataOssTargetArn;
        }

    }

    public static class CreateMultiAccountDeliveryChannelRequestResourceSnapshotDelivery extends TeaModel {
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
        public CreateMultiAccountDeliveryChannelRequestResourceSnapshotDeliverySlsProperties slsProperties;

        @NameInMap("TargetArn")
        public String targetArn;

        /**
         * <strong>example:</strong>
         * <p>OSS</p>
         */
        @NameInMap("TargetType")
        public String targetType;

        public static CreateMultiAccountDeliveryChannelRequestResourceSnapshotDelivery build(java.util.Map<String, ?> map) throws Exception {
            CreateMultiAccountDeliveryChannelRequestResourceSnapshotDelivery self = new CreateMultiAccountDeliveryChannelRequestResourceSnapshotDelivery();
            return TeaModel.build(map, self);
        }

        public CreateMultiAccountDeliveryChannelRequestResourceSnapshotDelivery setCustomExpression(String customExpression) {
            this.customExpression = customExpression;
            return this;
        }
        public String getCustomExpression() {
            return this.customExpression;
        }

        public CreateMultiAccountDeliveryChannelRequestResourceSnapshotDelivery setDeliveryTime(String deliveryTime) {
            this.deliveryTime = deliveryTime;
            return this;
        }
        public String getDeliveryTime() {
            return this.deliveryTime;
        }

        public CreateMultiAccountDeliveryChannelRequestResourceSnapshotDelivery setSlsProperties(CreateMultiAccountDeliveryChannelRequestResourceSnapshotDeliverySlsProperties slsProperties) {
            this.slsProperties = slsProperties;
            return this;
        }
        public CreateMultiAccountDeliveryChannelRequestResourceSnapshotDeliverySlsProperties getSlsProperties() {
            return this.slsProperties;
        }

        public CreateMultiAccountDeliveryChannelRequestResourceSnapshotDelivery setTargetArn(String targetArn) {
            this.targetArn = targetArn;
            return this;
        }
        public String getTargetArn() {
            return this.targetArn;
        }

        public CreateMultiAccountDeliveryChannelRequestResourceSnapshotDelivery setTargetType(String targetType) {
            this.targetType = targetType;
            return this;
        }
        public String getTargetType() {
            return this.targetType;
        }

    }

}
