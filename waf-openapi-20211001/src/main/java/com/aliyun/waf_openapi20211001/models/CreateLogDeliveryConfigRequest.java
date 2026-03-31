// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class CreateLogDeliveryConfigRequest extends TeaModel {
    /**
     * <p>The content of the log delivery configuration. Set the value to a JSON string that contains multiple parameters.</p>
     * <blockquote>
     * <p> The parameters vary based on the type of the <strong>log delivery configuration</strong> specified by <strong>DeliveryType</strong>. For more information, see <strong>Parameter description for log delivery configuration</strong>.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DeliveryDetail")
    public String deliveryDetail;

    /**
     * <p>The name of the log delivery configuration.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test1</p>
     */
    @NameInMap("DeliveryName")
    public String deliveryName;

    /**
     * <p>The type of the log delivery configuration. Valid values:</p>
     * <ul>
     * <li><strong>syslog</strong>: Logs are delivered to a syslog service.</li>
     * <li><strong>kafka</strong>: Logs are delivered to a Kafka service.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>kafka</p>
     */
    @NameInMap("DeliveryType")
    public String deliveryType;

    /**
     * <p>The ID of the Web Application Firewall (WAF) instance.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> operation to query the ID of the WAF instance.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>waf_elasticity-cn-0xldbqt****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The region ID of the WAF instance. Valid values:</p>
     * <ul>
     * <li><strong>cn-hangzhou</strong>: the Chinese mainland.</li>
     * <li><strong>ap-southeast-1</strong>: outside the Chinese mainland.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the Alibaba Cloud resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfm***q</p>
     */
    @NameInMap("ResourceManagerResourceGroupId")
    public String resourceManagerResourceGroupId;

    public static CreateLogDeliveryConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLogDeliveryConfigRequest self = new CreateLogDeliveryConfigRequest();
        return TeaModel.build(map, self);
    }

    public CreateLogDeliveryConfigRequest setDeliveryDetail(String deliveryDetail) {
        this.deliveryDetail = deliveryDetail;
        return this;
    }
    public String getDeliveryDetail() {
        return this.deliveryDetail;
    }

    public CreateLogDeliveryConfigRequest setDeliveryName(String deliveryName) {
        this.deliveryName = deliveryName;
        return this;
    }
    public String getDeliveryName() {
        return this.deliveryName;
    }

    public CreateLogDeliveryConfigRequest setDeliveryType(String deliveryType) {
        this.deliveryType = deliveryType;
        return this;
    }
    public String getDeliveryType() {
        return this.deliveryType;
    }

    public CreateLogDeliveryConfigRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateLogDeliveryConfigRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateLogDeliveryConfigRequest setResourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
        this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
        return this;
    }
    public String getResourceManagerResourceGroupId() {
        return this.resourceManagerResourceGroupId;
    }

}
