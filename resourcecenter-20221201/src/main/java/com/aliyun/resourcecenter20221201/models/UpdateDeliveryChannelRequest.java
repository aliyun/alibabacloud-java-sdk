// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcecenter20221201.models;

import com.aliyun.tea.*;

public class UpdateDeliveryChannelRequest extends TeaModel {
    /**
     * <p>The description of the delivery channel.</p>
     */
    @NameInMap("DeliveryChannelDescription")
    public String deliveryChannelDescription;

    /**
     * <p>The effective scope of the delivery channel.</p>
     */
    @NameInMap("DeliveryChannelFilter")
    public UpdateDeliveryChannelRequestDeliveryChannelFilter deliveryChannelFilter;

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
     * <p>test-delivery-channel</p>
     */
    @NameInMap("DeliveryChannelName")
    public String deliveryChannelName;

    /**
     * <p>The configurations for delivery of resource configuration change events.</p>
     */
    @NameInMap("ResourceChangeDelivery")
    public UpdateDeliveryChannelRequestResourceChangeDelivery resourceChangeDelivery;

    /**
     * <p>The configurations for delivery of scheduled resource snapshots.</p>
     */
    @NameInMap("ResourceSnapshotDelivery")
    public UpdateDeliveryChannelRequestResourceSnapshotDelivery resourceSnapshotDelivery;

    public static UpdateDeliveryChannelRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDeliveryChannelRequest self = new UpdateDeliveryChannelRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDeliveryChannelRequest setDeliveryChannelDescription(String deliveryChannelDescription) {
        this.deliveryChannelDescription = deliveryChannelDescription;
        return this;
    }
    public String getDeliveryChannelDescription() {
        return this.deliveryChannelDescription;
    }

    public UpdateDeliveryChannelRequest setDeliveryChannelFilter(UpdateDeliveryChannelRequestDeliveryChannelFilter deliveryChannelFilter) {
        this.deliveryChannelFilter = deliveryChannelFilter;
        return this;
    }
    public UpdateDeliveryChannelRequestDeliveryChannelFilter getDeliveryChannelFilter() {
        return this.deliveryChannelFilter;
    }

    public UpdateDeliveryChannelRequest setDeliveryChannelId(String deliveryChannelId) {
        this.deliveryChannelId = deliveryChannelId;
        return this;
    }
    public String getDeliveryChannelId() {
        return this.deliveryChannelId;
    }

    public UpdateDeliveryChannelRequest setDeliveryChannelName(String deliveryChannelName) {
        this.deliveryChannelName = deliveryChannelName;
        return this;
    }
    public String getDeliveryChannelName() {
        return this.deliveryChannelName;
    }

    public UpdateDeliveryChannelRequest setResourceChangeDelivery(UpdateDeliveryChannelRequestResourceChangeDelivery resourceChangeDelivery) {
        this.resourceChangeDelivery = resourceChangeDelivery;
        return this;
    }
    public UpdateDeliveryChannelRequestResourceChangeDelivery getResourceChangeDelivery() {
        return this.resourceChangeDelivery;
    }

    public UpdateDeliveryChannelRequest setResourceSnapshotDelivery(UpdateDeliveryChannelRequestResourceSnapshotDelivery resourceSnapshotDelivery) {
        this.resourceSnapshotDelivery = resourceSnapshotDelivery;
        return this;
    }
    public UpdateDeliveryChannelRequestResourceSnapshotDelivery getResourceSnapshotDelivery() {
        return this.resourceSnapshotDelivery;
    }

    public static class UpdateDeliveryChannelRequestDeliveryChannelFilter extends TeaModel {
        /**
         * <p>The effective resource types of the delivery channel.</p>
         */
        @NameInMap("ResourceTypes")
        public java.util.List<String> resourceTypes;

        public static UpdateDeliveryChannelRequestDeliveryChannelFilter build(java.util.Map<String, ?> map) throws Exception {
            UpdateDeliveryChannelRequestDeliveryChannelFilter self = new UpdateDeliveryChannelRequestDeliveryChannelFilter();
            return TeaModel.build(map, self);
        }

        public UpdateDeliveryChannelRequestDeliveryChannelFilter setResourceTypes(java.util.List<String> resourceTypes) {
            this.resourceTypes = resourceTypes;
            return this;
        }
        public java.util.List<String> getResourceTypes() {
            return this.resourceTypes;
        }

    }

    public static class UpdateDeliveryChannelRequestResourceChangeDeliverySlsProperties extends TeaModel {
        /**
         * <p>The ARN of the destination to which large files are delivered.</p>
         * <p>If the size of a resource configuration change event exceeds 1 MB, the event is delivered as an OSS object. You need to set this parameter to the ARN of a bucket whose name is prefixed with <code>resourcecenter-</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:oss:cn-hangzhou:1911422487776***:resourcecenter-oss</p>
         */
        @NameInMap("OversizedDataOssTargetArn")
        public String oversizedDataOssTargetArn;

        public static UpdateDeliveryChannelRequestResourceChangeDeliverySlsProperties build(java.util.Map<String, ?> map) throws Exception {
            UpdateDeliveryChannelRequestResourceChangeDeliverySlsProperties self = new UpdateDeliveryChannelRequestResourceChangeDeliverySlsProperties();
            return TeaModel.build(map, self);
        }

        public UpdateDeliveryChannelRequestResourceChangeDeliverySlsProperties setOversizedDataOssTargetArn(String oversizedDataOssTargetArn) {
            this.oversizedDataOssTargetArn = oversizedDataOssTargetArn;
            return this;
        }
        public String getOversizedDataOssTargetArn() {
            return this.oversizedDataOssTargetArn;
        }

    }

    public static class UpdateDeliveryChannelRequestResourceChangeDelivery extends TeaModel {
        /**
         * <p>Specifies whether to enable delivery of resource configuration change events. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Enabled")
        public String enabled;

        /**
         * <p>The Simple Log Service configurations.</p>
         */
        @NameInMap("SlsProperties")
        public UpdateDeliveryChannelRequestResourceChangeDeliverySlsProperties slsProperties;

        /**
         * <p>The ARN of the delivery destination. Valid values:</p>
         * <ul>
         * <li>If you set <code>TargetType</code> to <code>OSS</code>, you must set <code>TargetArn</code> to the ARN of a bucket whose name is prefixed with <code>resourcecenter-</code>.</li>
         * <li>If you set <code>TargetType</code> to <code>SLS</code>, you must set <code>TargetArn</code> to the ARN of a Logstore whose name is prefixed with <code>resourcecenter-</code>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>acs:log:cn-hangzhou: 1911422487776***:project/delivery/logstore/resourcecenter-sls</p>
         */
        @NameInMap("TargetArn")
        public String targetArn;

        /**
         * <p>The type of the delivery destination.</p>
         * <p>Set the value to <code>SLS</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>SLS</p>
         */
        @NameInMap("TargetType")
        public String targetType;

        public static UpdateDeliveryChannelRequestResourceChangeDelivery build(java.util.Map<String, ?> map) throws Exception {
            UpdateDeliveryChannelRequestResourceChangeDelivery self = new UpdateDeliveryChannelRequestResourceChangeDelivery();
            return TeaModel.build(map, self);
        }

        public UpdateDeliveryChannelRequestResourceChangeDelivery setEnabled(String enabled) {
            this.enabled = enabled;
            return this;
        }
        public String getEnabled() {
            return this.enabled;
        }

        public UpdateDeliveryChannelRequestResourceChangeDelivery setSlsProperties(UpdateDeliveryChannelRequestResourceChangeDeliverySlsProperties slsProperties) {
            this.slsProperties = slsProperties;
            return this;
        }
        public UpdateDeliveryChannelRequestResourceChangeDeliverySlsProperties getSlsProperties() {
            return this.slsProperties;
        }

        public UpdateDeliveryChannelRequestResourceChangeDelivery setTargetArn(String targetArn) {
            this.targetArn = targetArn;
            return this;
        }
        public String getTargetArn() {
            return this.targetArn;
        }

        public UpdateDeliveryChannelRequestResourceChangeDelivery setTargetType(String targetType) {
            this.targetType = targetType;
            return this;
        }
        public String getTargetType() {
            return this.targetType;
        }

    }

    public static class UpdateDeliveryChannelRequestResourceSnapshotDeliverySlsProperties extends TeaModel {
        /**
         * <p>The ARN of the destination to which large files are delivered.</p>
         * <p>If the size of a resource configuration change event exceeds 1 MB, the event is delivered as an OSS object. You need to set this parameter to the ARN of a bucket whose name is prefixed with <code>resourcecenter-</code>.</p>
         * <blockquote>
         * <p> This parameter takes effect only if you use custom delivery for scheduled resource snapshots. You do not need to configure this parameter if you use standard delivery for scheduled resource snapshots.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>acs:oss:cn-hangzhou:1911422487776***:resourcecenter-oss</p>
         */
        @NameInMap("OversizedDataOssTargetArn")
        public String oversizedDataOssTargetArn;

        public static UpdateDeliveryChannelRequestResourceSnapshotDeliverySlsProperties build(java.util.Map<String, ?> map) throws Exception {
            UpdateDeliveryChannelRequestResourceSnapshotDeliverySlsProperties self = new UpdateDeliveryChannelRequestResourceSnapshotDeliverySlsProperties();
            return TeaModel.build(map, self);
        }

        public UpdateDeliveryChannelRequestResourceSnapshotDeliverySlsProperties setOversizedDataOssTargetArn(String oversizedDataOssTargetArn) {
            this.oversizedDataOssTargetArn = oversizedDataOssTargetArn;
            return this;
        }
        public String getOversizedDataOssTargetArn() {
            return this.oversizedDataOssTargetArn;
        }

    }

    public static class UpdateDeliveryChannelRequestResourceSnapshotDelivery extends TeaModel {
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
         * <p>Specifies whether to enable delivery of scheduled resource snapshots. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Enabled")
        public String enabled;

        /**
         * <p>The Simple Log Service configurations.</p>
         */
        @NameInMap("SlsProperties")
        public UpdateDeliveryChannelRequestResourceSnapshotDeliverySlsProperties slsProperties;

        /**
         * <p>The Alibaba Cloud Resource Name (ARN) of the delivery destination. Valid values:</p>
         * <ul>
         * <li>If you set <code>TargetType</code> to <code>OSS</code>, you must set <code>TargetArn</code> to the ARN of a bucket whose name is prefixed with <code>resourcecenter-</code>. Example: <code>acs:oss:cn-hangzhou:191142248777****:resourcecenter-oss</code>.</li>
         * <li>If you set <code>TargetType</code> to <code>SLS</code>, you must set <code>TargetArn</code> to the ARN of a Logstore whose name is prefixed with <code>resourcecenter-</code>. Example: <code>acs:log:cn-hangzhou: 191142248777****:project/delivery/logstore/resourcecenter-sls</code>.</li>
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
         * <li><code>OSS</code> for standard delivery</li>
         * <li><code>OSS</code> or <code>SLS</code> for custom delivery</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OSS</p>
         */
        @NameInMap("TargetType")
        public String targetType;

        public static UpdateDeliveryChannelRequestResourceSnapshotDelivery build(java.util.Map<String, ?> map) throws Exception {
            UpdateDeliveryChannelRequestResourceSnapshotDelivery self = new UpdateDeliveryChannelRequestResourceSnapshotDelivery();
            return TeaModel.build(map, self);
        }

        public UpdateDeliveryChannelRequestResourceSnapshotDelivery setCustomExpression(String customExpression) {
            this.customExpression = customExpression;
            return this;
        }
        public String getCustomExpression() {
            return this.customExpression;
        }

        public UpdateDeliveryChannelRequestResourceSnapshotDelivery setDeliveryTime(String deliveryTime) {
            this.deliveryTime = deliveryTime;
            return this;
        }
        public String getDeliveryTime() {
            return this.deliveryTime;
        }

        public UpdateDeliveryChannelRequestResourceSnapshotDelivery setEnabled(String enabled) {
            this.enabled = enabled;
            return this;
        }
        public String getEnabled() {
            return this.enabled;
        }

        public UpdateDeliveryChannelRequestResourceSnapshotDelivery setSlsProperties(UpdateDeliveryChannelRequestResourceSnapshotDeliverySlsProperties slsProperties) {
            this.slsProperties = slsProperties;
            return this;
        }
        public UpdateDeliveryChannelRequestResourceSnapshotDeliverySlsProperties getSlsProperties() {
            return this.slsProperties;
        }

        public UpdateDeliveryChannelRequestResourceSnapshotDelivery setTargetArn(String targetArn) {
            this.targetArn = targetArn;
            return this;
        }
        public String getTargetArn() {
            return this.targetArn;
        }

        public UpdateDeliveryChannelRequestResourceSnapshotDelivery setTargetType(String targetType) {
            this.targetType = targetType;
            return this;
        }
        public String getTargetType() {
            return this.targetType;
        }

    }

}
