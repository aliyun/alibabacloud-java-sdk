// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcecenter20221201.models;

import com.aliyun.tea.*;

public class CreateDeliveryChannelRequest extends TeaModel {
    /**
     * <p>The description of the delivery channel.</p>
     * 
     * <strong>example:</strong>
     * <p>测试投递</p>
     */
    @NameInMap("DeliveryChannelDescription")
    public String deliveryChannelDescription;

    /**
     * <p>The effective scope of the delivery channel.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DeliveryChannelFilter")
    public CreateDeliveryChannelRequestDeliveryChannelFilter deliveryChannelFilter;

    /**
     * <p>The name of the delivery channel.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-delivery</p>
     */
    @NameInMap("DeliveryChannelName")
    public String deliveryChannelName;

    /**
     * <p>The delivery of resource configuration changes.</p>
     */
    @NameInMap("ResourceChangeDelivery")
    public CreateDeliveryChannelRequestResourceChangeDelivery resourceChangeDelivery;

    /**
     * <p>The scheduled delivery of resource snapshots.</p>
     */
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
        /**
         * <p>The list of resource types to be delivered.</p>
         */
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
        /**
         * <p>The ARN of the destination OSS bucket for oversized files.</p>
         * <p>If the size of a resource configuration change event exceeds 1 MB, the event is delivered as an OSS object. Set this parameter to the ARN of an OSS bucket that has the <code>resourcecenter-</code> prefix.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:oss:cn-hangzhou:191142248777****:resourcecenter-oss</p>
         */
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
        /**
         * <p>The SLS configurations.</p>
         */
        @NameInMap("SlsProperties")
        public CreateDeliveryChannelRequestResourceChangeDeliverySlsProperties slsProperties;

        /**
         * <p>The ARN of the destination. Valid values:</p>
         * <ul>
         * <li><p>If you set <code>TargetType</code> to <code>OSS</code>, set <code>TargetArn</code> to the ARN of an OSS bucket that has the <code>resourcecenter-</code> prefix.</p>
         * </li>
         * <li><p>If you set <code>TargetType</code> to <code>SLS</code>, set <code>TargetArn</code> to the ARN of an SLS Logstore that has the <code>resourcecenter-</code> prefix.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>acs:log:cn-hangzhou: 191142248777****:project/delivery/logstore/resourcecenter-sls</p>
         */
        @NameInMap("TargetArn")
        public String targetArn;

        /**
         * <p>The type of the destination.</p>
         * <p>Valid value: <code>SLS</code>.</p>
         * 
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
        /**
         * <p>The ARN of the destination OSS bucket for oversized files.</p>
         * <p>If the size of a resource configuration change event exceeds 1 MB, the event is delivered as an OSS object. Set this parameter to the ARN of an OSS bucket that has the <code>resourcecenter-</code> prefix.</p>
         * <blockquote>
         * <p>This parameter is valid only for custom scheduled delivery. You do not need to specify this parameter for standard scheduled delivery.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>acs:oss:cn-hangzhou:191142248777****:resourcecenter-oss</p>
         */
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
         * <p>The SLS configurations.</p>
         */
        @NameInMap("SlsProperties")
        public CreateDeliveryChannelRequestResourceSnapshotDeliverySlsProperties slsProperties;

        /**
         * <p>The Alibaba Cloud Resource Name (ARN) of the destination. Valid values:</p>
         * <ul>
         * <li><p>If you set <code>TargetType</code> to <code>OSS</code>, set <code>TargetArn</code> to the ARN of an Object Storage Service (OSS) bucket that has the <code>resourcecenter-</code> prefix. Example: <code>acs:oss:cn-hangzhou:191142248777****:resourcecenter-oss</code>.</p>
         * </li>
         * <li><p>If you set <code>TargetType</code> to <code>SLS</code>, set <code>TargetArn</code> to the ARN of a Simple Log Service (SLS) Logstore that has the <code>resourcecenter-</code> prefix. Example: <code>acs:log:cn-hangzhou: 191142248777****:project/delivery/logstore/resourcecenter-sls</code>.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>acs:log:cn-hangzhou: 191142248777****:project/delivery/logstore/resourcecenter-sls</p>
         */
        @NameInMap("TargetArn")
        public String targetArn;

        /**
         * <p>The type of the destination. Valid values:</p>
         * <ul>
         * <li><p>For standard scheduled delivery, set this parameter to <code>OSS</code>.</p>
         * </li>
         * <li><p>For custom scheduled delivery, set this parameter to <code>OSS</code> or <code>SLS</code>.</p>
         * </li>
         * </ul>
         * 
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
