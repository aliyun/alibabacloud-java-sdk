// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcecenter20221201.models;

import com.aliyun.tea.*;

public class UpdateMultiAccountDeliveryChannelRequest extends TeaModel {
    /**
     * <p>The description of the delivery channel.</p>
     * 
     * <strong>example:</strong>
     * <p>This is a description.</p>
     */
    @NameInMap("DeliveryChannelDescription")
    public String deliveryChannelDescription;

    /**
     * <p>The effective scope of the delivery channel.</p>
     */
    @NameInMap("DeliveryChannelFilter")
    public UpdateMultiAccountDeliveryChannelRequestDeliveryChannelFilter deliveryChannelFilter;

    /**
     * <p>The ID of the delivery channel.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dc-4m6ffpkgu***</p>
     */
    @NameInMap("DeliveryChannelId")
    public String deliveryChannelId;

    /**
     * <p>The name of the delivery channel.</p>
     * 
     * <strong>example:</strong>
     * <p>test-multi-account-delivery-channel</p>
     */
    @NameInMap("DeliveryChannelName")
    public String deliveryChannelName;

    /**
     * <p>The configurations for delivery of resource configuration change events.</p>
     */
    @NameInMap("ResourceChangeDelivery")
    public UpdateMultiAccountDeliveryChannelRequestResourceChangeDelivery resourceChangeDelivery;

    /**
     * <p>The configurations for scheduled delivery of resource snapshots.</p>
     */
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
        /**
         * <p>The account scopes of the delivery channel.</p>
         */
        @NameInMap("AccountScopes")
        public java.util.List<String> accountScopes;

        /**
         * <p>The effective resource type of the delivery channel.</p>
         */
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
        /**
         * <p>The ARN of the delivery destination for oversized data.</p>
         * <p>If the size of a resource configuration change event exceeds 1 MB, the event is delivered as an OSS object. You must enter the ARN of an OSS bucket that has a prefix of <code>resourcecenter-</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:oss:cn-hangzhou:1911422487776***:resourcecenter-oss</p>
         */
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
         * <p>Specifies whether to enable delivery of resource configuration change events. Valid values:</p>
         * <ul>
         * <li><p>true</p>
         * </li>
         * <li><p>false</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Enabled")
        public String enabled;

        /**
         * <p>The SLS configurations.</p>
         */
        @NameInMap("SlsProperties")
        public UpdateMultiAccountDeliveryChannelRequestResourceChangeDeliverySlsProperties slsProperties;

        /**
         * <p>The ARN of the delivery destination. Valid values:</p>
         * <ul>
         * <li><p>If you set <code>TargetType</code> to <code>OSS</code>, you must set <code>TargetArn</code> to the ARN of a OSS bucket that has a prefix of <code>resourcecenter-</code>.</p>
         * </li>
         * <li><p>If you set <code>TargetType</code> to <code>SLS</code>, you must set <code>TargetArn</code> to the ARN of a SLS Logstore that has a prefix of <code>resourcecenter-</code>.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>acs:log:cn-hangzhou: 1911422487776***:project/delivery/logstore/resourcecenter-sls</p>
         */
        @NameInMap("TargetArn")
        public String targetArn;

        /**
         * <p>The type of the delivery destination.</p>
         * <p>Valid value: <code>SLS</code>.</p>
         * 
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
        /**
         * <p>The ARN of the delivery destination for oversized data.</p>
         * <p>If the size of a resource configuration change event exceeds 1 MB, the event is delivered as an OSS object. You must enter the ARN of an OSS bucket that has a prefix of <code>resourcecenter-</code>.</p>
         * <blockquote>
         * <p>This parameter takes effect only when you create a custom scheduled delivery task for resource snapshots. You do not need to specify this parameter when you create a standard scheduled delivery task for resource snapshots.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>acs:oss:cn-hangzhou:1911422487776***:resourcecenter-oss</p>
         */
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
         * <p>Specifies whether to enable scheduled delivery of resource snapshots. Valid values:</p>
         * <ul>
         * <li><p>true</p>
         * </li>
         * <li><p>false</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Enabled")
        public String enabled;

        /**
         * <p>The Simple Log Service (SLS) configurations.</p>
         */
        @NameInMap("SlsProperties")
        public UpdateMultiAccountDeliveryChannelRequestResourceSnapshotDeliverySlsProperties slsProperties;

        /**
         * <p>The Alibaba Cloud Resource Name (ARN) of the delivery destination. Valid values:</p>
         * <ul>
         * <li><p>If you set <code>TargetType</code> to <code>OSS</code>, you must set <code>TargetArn</code> to the ARN of a OSS bucket that has a prefix of <code>resourcecenter-</code>. Example: <code>acs:oss:cn-hangzhou:191142248777****:resourcecenter-oss</code>.</p>
         * </li>
         * <li><p>If you set <code>TargetType</code> to <code>SLS</code>, you must set <code>TargetArn</code> to the ARN of a SLS Logstore that has a prefix of <code>resourcecenter-</code>. Example: <code>acs:log:cn-hangzhou: 191142248777****:project/delivery/logstore/resourcecenter-sls</code>.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>acs:oss:cn-hangzhou:1911422487776***:resourcecenter-oss</p>
         */
        @NameInMap("TargetArn")
        public String targetArn;

        /**
         * <p>The type of the delivery destination. Valid values:</p>
         * <ul>
         * <li><p><code>OSS</code> for standard delivery</p>
         * </li>
         * <li><p><code>OSS</code> or <code>SLS</code> for custom delivery</p>
         * </li>
         * </ul>
         * 
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
