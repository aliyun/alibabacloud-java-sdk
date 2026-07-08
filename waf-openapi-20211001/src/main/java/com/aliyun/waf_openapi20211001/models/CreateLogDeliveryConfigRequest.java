// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class CreateLogDeliveryConfigRequest extends TeaModel {
    /**
     * <p>The details of the log delivery configuration. The value is a JSON string that is generated from a series of parameters.</p>
     * <blockquote>
     * <p>The parameters vary based on the value of <strong>DeliveryType</strong>. For more information, see <strong>Parameters for log delivery configuration details</strong>.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *   &quot;rfcVersion&quot;: &quot;rfc3164&quot;,
     *   &quot;protocol&quot;: &quot;tcp&quot;,
     *   &quot;servers&quot;: [
     *     {
     *       &quot;address&quot;: &quot;1.1.1.1&quot;,
     *       &quot;port&quot;: 20
     *     }
     *   ]
     * }</p>
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
     * <li><p><strong>syslog</strong>: Delivers logs to a syslog service.</p>
     * </li>
     * <li><p><strong>kafka</strong>: Delivers logs to a Kafka service.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>syslog</p>
     */
    @NameInMap("DeliveryType")
    public String deliveryType;

    /**
     * <p>The ID of the WAF instance.</p>
     * <blockquote>
     * <p>Call the <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> operation to query the ID of the WAF instance.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>waf_elasticity-cn-0xldbqt****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The region where the WAF instance resides. Valid values:</p>
     * <ul>
     * <li><p><strong>cn-hangzhou</strong>: the Chinese mainland.</p>
     * </li>
     * <li><p><strong>ap-southeast-1</strong>: outside the Chinese mainland.</p>
     * </li>
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
