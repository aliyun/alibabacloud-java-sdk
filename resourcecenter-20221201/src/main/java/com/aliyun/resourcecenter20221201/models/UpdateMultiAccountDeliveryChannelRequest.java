// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcecenter20221201.models;

import com.aliyun.tea.*;

public class UpdateMultiAccountDeliveryChannelRequest extends TeaModel {
    @NameInMap("DeliveryChannelDescription")
    public String deliveryChannelDescription;

    @NameInMap("DeliveryChannelFilter")
    public UpdateMultiAccountDeliveryChannelRequestDeliveryChannelFilter deliveryChannelFilter;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dc-4m6ffpkgu***</p>
     */
    @NameInMap("DeliveryChannelId")
    public String deliveryChannelId;

    /**
     * <strong>example:</strong>
     * <p>test-multi-account-delivery-channel</p>
     */
    @NameInMap("DeliveryChannelName")
    public String deliveryChannelName;

    @NameInMap("ResourceChangeDelivery")
    public UpdateMultiAccountDeliveryChannelRequestResourceChangeDelivery resourceChangeDelivery;

    @NameInMap("ResourceSnapshotDelivery")
    public UpdateMultiAccountDeliveryChannelRequestResourceSnapshotDelivery resourceSnapshotDelivery;

    public static UpdateMultiAccountDeliveryChannelRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMultiAccountDeliveryChannelRequest self = new UpdateMultiAccountDeliveryChannelRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMultiAccountDeliveryChannelRequest setDeliveryChannelDescription(String deliveryChannelDescription) {
        this.deliveryChannelDescription = deliveryChannelDescription;
        return this;
    }
    public String getDeliveryChannelDescription() {
        return this.deliveryChannelDescription;
    }

    public UpdateMultiAccountDeliveryChannelRequest setDeliveryChannelFilter(UpdateMultiAccountDeliveryChannelRequestDeliveryChannelFilter deliveryChannelFilter) {
        this.deliveryChannelFilter = deliveryChannelFilter;
        return this;
    }
    public UpdateMultiAccountDeliveryChannelRequestDeliveryChannelFilter getDeliveryChannelFilter() {
        return this.deliveryChannelFilter;
    }

    public UpdateMultiAccountDeliveryChannelRequest setDeliveryChannelId(String deliveryChannelId) {
        this.deliveryChannelId = deliveryChannelId;
        return this;
    }
    public String getDeliveryChannelId() {
        return this.deliveryChannelId;
    }

    public UpdateMultiAccountDeliveryChannelRequest setDeliveryChannelName(String deliveryChannelName) {
        this.deliveryChannelName = deliveryChannelName;
        return this;
    }
    public String getDeliveryChannelName() {
        return this.deliveryChannelName;
    }

    public UpdateMultiAccountDeliveryChannelRequest setResourceChangeDelivery(UpdateMultiAccountDeliveryChannelRequestResourceChangeDelivery resourceChangeDelivery) {
        this.resourceChangeDelivery = resourceChangeDelivery;
        return this;
    }
    public UpdateMultiAccountDeliveryChannelRequestResourceChangeDelivery getResourceChangeDelivery() {
        return this.resourceChangeDelivery;
    }

    public UpdateMultiAccountDeliveryChannelRequest setResourceSnapshotDelivery(UpdateMultiAccountDeliveryChannelRequestResourceSnapshotDelivery resourceSnapshotDelivery) {
        this.resourceSnapshotDelivery = resourceSnapshotDelivery;
        return this;
    }
    public UpdateMultiAccountDeliveryChannelRequestResourceSnapshotDelivery getResourceSnapshotDelivery() {
        return this.resourceSnapshotDelivery;
    }

    public static class UpdateMultiAccountDeliveryChannelRequestDeliveryChannelFilter extends TeaModel {
        @NameInMap("AccountScopes")
        public java.util.List<String> accountScopes;

        @NameInMap("ResourceTypes")
        public java.util.List<String> resourceTypes;

        public static UpdateMultiAccountDeliveryChannelRequestDeliveryChannelFilter build(java.util.Map<String, ?> map) throws Exception {
            UpdateMultiAccountDeliveryChannelRequestDeliveryChannelFilter self = new UpdateMultiAccountDeliveryChannelRequestDeliveryChannelFilter();
            return TeaModel.build(map, self);
        }

        public UpdateMultiAccountDeliveryChannelRequestDeliveryChannelFilter setAccountScopes(java.util.List<String> accountScopes) {
            this.accountScopes = accountScopes;
            return this;
        }
        public java.util.List<String> getAccountScopes() {
            return this.accountScopes;
        }

        public UpdateMultiAccountDeliveryChannelRequestDeliveryChannelFilter setResourceTypes(java.util.List<String> resourceTypes) {
            this.resourceTypes = resourceTypes;
            return this;
        }
        public java.util.List<String> getResourceTypes() {
            return this.resourceTypes;
        }

    }

    public static class UpdateMultiAccountDeliveryChannelRequestResourceChangeDeliverySlsProperties extends TeaModel {
        @NameInMap("OversizedDataOssTargetArn")
        public String oversizedDataOssTargetArn;

        public static UpdateMultiAccountDeliveryChannelRequestResourceChangeDeliverySlsProperties build(java.util.Map<String, ?> map) throws Exception {
            UpdateMultiAccountDeliveryChannelRequestResourceChangeDeliverySlsProperties self = new UpdateMultiAccountDeliveryChannelRequestResourceChangeDeliverySlsProperties();
            return TeaModel.build(map, self);
        }

        public UpdateMultiAccountDeliveryChannelRequestResourceChangeDeliverySlsProperties setOversizedDataOssTargetArn(String oversizedDataOssTargetArn) {
            this.oversizedDataOssTargetArn = oversizedDataOssTargetArn;
            return this;
        }
        public String getOversizedDataOssTargetArn() {
            return this.oversizedDataOssTargetArn;
        }

    }

    public static class UpdateMultiAccountDeliveryChannelRequestResourceChangeDelivery extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Enabled")
        public String enabled;

        @NameInMap("SlsProperties")
        public UpdateMultiAccountDeliveryChannelRequestResourceChangeDeliverySlsProperties slsProperties;

        @NameInMap("TargetArn")
        public String targetArn;

        /**
         * <strong>example:</strong>
         * <p>SLS</p>
         */
        @NameInMap("TargetType")
        public String targetType;

        public static UpdateMultiAccountDeliveryChannelRequestResourceChangeDelivery build(java.util.Map<String, ?> map) throws Exception {
            UpdateMultiAccountDeliveryChannelRequestResourceChangeDelivery self = new UpdateMultiAccountDeliveryChannelRequestResourceChangeDelivery();
            return TeaModel.build(map, self);
        }

        public UpdateMultiAccountDeliveryChannelRequestResourceChangeDelivery setEnabled(String enabled) {
            this.enabled = enabled;
            return this;
        }
        public String getEnabled() {
            return this.enabled;
        }

        public UpdateMultiAccountDeliveryChannelRequestResourceChangeDelivery setSlsProperties(UpdateMultiAccountDeliveryChannelRequestResourceChangeDeliverySlsProperties slsProperties) {
            this.slsProperties = slsProperties;
            return this;
        }
        public UpdateMultiAccountDeliveryChannelRequestResourceChangeDeliverySlsProperties getSlsProperties() {
            return this.slsProperties;
        }

        public UpdateMultiAccountDeliveryChannelRequestResourceChangeDelivery setTargetArn(String targetArn) {
            this.targetArn = targetArn;
            return this;
        }
        public String getTargetArn() {
            return this.targetArn;
        }

        public UpdateMultiAccountDeliveryChannelRequestResourceChangeDelivery setTargetType(String targetType) {
            this.targetType = targetType;
            return this;
        }
        public String getTargetType() {
            return this.targetType;
        }

    }

    public static class UpdateMultiAccountDeliveryChannelRequestResourceSnapshotDeliverySlsProperties extends TeaModel {
        @NameInMap("OversizedDataOssTargetArn")
        public String oversizedDataOssTargetArn;

        public static UpdateMultiAccountDeliveryChannelRequestResourceSnapshotDeliverySlsProperties build(java.util.Map<String, ?> map) throws Exception {
            UpdateMultiAccountDeliveryChannelRequestResourceSnapshotDeliverySlsProperties self = new UpdateMultiAccountDeliveryChannelRequestResourceSnapshotDeliverySlsProperties();
            return TeaModel.build(map, self);
        }

        public UpdateMultiAccountDeliveryChannelRequestResourceSnapshotDeliverySlsProperties setOversizedDataOssTargetArn(String oversizedDataOssTargetArn) {
            this.oversizedDataOssTargetArn = oversizedDataOssTargetArn;
            return this;
        }
        public String getOversizedDataOssTargetArn() {
            return this.oversizedDataOssTargetArn;
        }

    }

    public static class UpdateMultiAccountDeliveryChannelRequestResourceSnapshotDelivery extends TeaModel {
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

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Enabled")
        public String enabled;

        @NameInMap("SlsProperties")
        public UpdateMultiAccountDeliveryChannelRequestResourceSnapshotDeliverySlsProperties slsProperties;

        @NameInMap("TargetArn")
        public String targetArn;

        /**
         * <strong>example:</strong>
         * <p>OSS</p>
         */
        @NameInMap("TargetType")
        public String targetType;

        public static UpdateMultiAccountDeliveryChannelRequestResourceSnapshotDelivery build(java.util.Map<String, ?> map) throws Exception {
            UpdateMultiAccountDeliveryChannelRequestResourceSnapshotDelivery self = new UpdateMultiAccountDeliveryChannelRequestResourceSnapshotDelivery();
            return TeaModel.build(map, self);
        }

        public UpdateMultiAccountDeliveryChannelRequestResourceSnapshotDelivery setCustomExpression(String customExpression) {
            this.customExpression = customExpression;
            return this;
        }
        public String getCustomExpression() {
            return this.customExpression;
        }

        public UpdateMultiAccountDeliveryChannelRequestResourceSnapshotDelivery setDeliveryTime(String deliveryTime) {
            this.deliveryTime = deliveryTime;
            return this;
        }
        public String getDeliveryTime() {
            return this.deliveryTime;
        }

        public UpdateMultiAccountDeliveryChannelRequestResourceSnapshotDelivery setEnabled(String enabled) {
            this.enabled = enabled;
            return this;
        }
        public String getEnabled() {
            return this.enabled;
        }

        public UpdateMultiAccountDeliveryChannelRequestResourceSnapshotDelivery setSlsProperties(UpdateMultiAccountDeliveryChannelRequestResourceSnapshotDeliverySlsProperties slsProperties) {
            this.slsProperties = slsProperties;
            return this;
        }
        public UpdateMultiAccountDeliveryChannelRequestResourceSnapshotDeliverySlsProperties getSlsProperties() {
            return this.slsProperties;
        }

        public UpdateMultiAccountDeliveryChannelRequestResourceSnapshotDelivery setTargetArn(String targetArn) {
            this.targetArn = targetArn;
            return this;
        }
        public String getTargetArn() {
            return this.targetArn;
        }

        public UpdateMultiAccountDeliveryChannelRequestResourceSnapshotDelivery setTargetType(String targetType) {
            this.targetType = targetType;
            return this;
        }
        public String getTargetType() {
            return this.targetType;
        }

    }

}
