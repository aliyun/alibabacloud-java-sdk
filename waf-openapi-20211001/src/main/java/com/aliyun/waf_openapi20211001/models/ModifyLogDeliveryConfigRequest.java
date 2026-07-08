// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class ModifyLogDeliveryConfigRequest extends TeaModel {
    /**
     * <p>The details of the log delivery configuration, in JSON format.</p>
     * <blockquote>
     * <p>The value of this parameter is the same as the <strong>DeliveryDetail</strong> parameter of the <strong>CreateLogDeliveryConfig</strong> operation. For more information, see <a href="">CreateLogDeliveryConfig</a>.</p>
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
     * <p>The name of the log delivery configuration that you want to modify.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test1</p>
     */
    @NameInMap("DeliveryName")
    public String deliveryName;

    /**
     * <p>The type of the log delivery destination. Valid values:</p>
     * <ul>
     * <li><p><strong>syslog</strong>: delivers logs to a syslog server.</p>
     * </li>
     * <li><p><strong>kafka</strong>: delivers logs to a Kafka cluster.</p>
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
     * <p>The ID of the Web Application Firewall (WAF) instance.</p>
     * <blockquote>
     * <p>Call the <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> operation to query the ID of the WAF instance.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>waf_cdnsdf3****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The region in which the WAF instance resides. Valid values:</p>
     * <ul>
     * <li><p><strong>cn-hangzhou</strong>: Chinese mainland.</p>
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
     * <p>The ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfm***q</p>
     */
    @NameInMap("ResourceManagerResourceGroupId")
    public String resourceManagerResourceGroupId;

    public static ModifyLogDeliveryConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyLogDeliveryConfigRequest self = new ModifyLogDeliveryConfigRequest();
        return TeaModel.build(map, self);
    }

    public ModifyLogDeliveryConfigRequest setDeliveryDetail(String deliveryDetail) {
        this.deliveryDetail = deliveryDetail;
        return this;
    }
    public String getDeliveryDetail() {
        return this.deliveryDetail;
    }

    public ModifyLogDeliveryConfigRequest setDeliveryName(String deliveryName) {
        this.deliveryName = deliveryName;
        return this;
    }
    public String getDeliveryName() {
        return this.deliveryName;
    }

    public ModifyLogDeliveryConfigRequest setDeliveryType(String deliveryType) {
        this.deliveryType = deliveryType;
        return this;
    }
    public String getDeliveryType() {
        return this.deliveryType;
    }

    public ModifyLogDeliveryConfigRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyLogDeliveryConfigRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyLogDeliveryConfigRequest setResourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
        this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
        return this;
    }
    public String getResourceManagerResourceGroupId() {
        return this.resourceManagerResourceGroupId;
    }

}
