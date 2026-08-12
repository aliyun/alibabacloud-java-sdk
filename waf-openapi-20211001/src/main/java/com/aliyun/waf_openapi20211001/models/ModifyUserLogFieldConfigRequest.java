// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class ModifyUserLogFieldConfigRequest extends TeaModel {
    /**
     * <p>The delivery type. Valid values:</p>
     * <ul>
     * <li><strong>sls</strong>: Simple Log Service.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>sls</p>
     */
    @NameInMap("DeliveryType")
    public String deliveryType;

    /**
     * <p>The extended configuration for log delivery. The value is a JSON string constructed from a set of parameters.</p>
     * <blockquote>
     * <p>For more information, see the <strong>Log delivery extended configuration</strong> parameter description.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;request_header\&quot;:\&quot;App-Id,channelCode\&quot;}</p>
     */
    @NameInMap("ExtendConfig")
    public String extendConfig;

    /**
     * <p>The list of log fields to deliver. Specify the fields in the &quot;a,b,c,...&quot; format.</p>
     * <blockquote>
     * <ul>
     * <li>All required log fields must be included. You can invoke the <a href="~~DescribeCommonLogFields~~">DescribeCommonLogFields</a> operation to query the log fields supported by Simple Log Service for WAF. </li>
     * <li>If the log fields include <strong>request_header</strong>, use the <strong>delivery extension configuration</strong> (<strong>ExtendConfig</strong>) parameter to specify the request headers to deliver.</li>
     * </ul>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>account,acl_action,acl_rule_id,acl_rule_type,acl_test,antiscan_action,antiscan_rule_id,antiscan_rule_type,antiscan_test,body_bytes_sent,bypass_matched_ids</p>
     */
    @NameInMap("FieldList")
    public String fieldList;

    /**
     * <p>Instance ID of the WAF instance.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> operation to query instance ID of the current WAF instance.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>waf_v2_public_cn-fou****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The log delivery strategy. Multiple strategies are supported. The value is a JSON array string constructed from a set of parameters.</p>
     * <blockquote>
     * <p>For more information, see the <strong>Log delivery strategy</strong> parameter description.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>[{\&quot;logType\&quot;:\&quot;blockLog\&quot;,\&quot;rate\&quot;:100},{\&quot;logType\&quot;:\&quot;normalRequestLog\&quot;,\&quot;rate\&quot;:100},{\&quot;logType\&quot;:\&quot;checkLog\&quot;,\&quot;rate\&quot;:100}]</p>
     */
    @NameInMap("LogDeliveryStrategy")
    public String logDeliveryStrategy;

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

    public static ModifyUserLogFieldConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyUserLogFieldConfigRequest self = new ModifyUserLogFieldConfigRequest();
        return TeaModel.build(map, self);
    }

    public ModifyUserLogFieldConfigRequest setDeliveryType(String deliveryType) {
        this.deliveryType = deliveryType;
        return this;
    }
    public String getDeliveryType() {
        return this.deliveryType;
    }

    public ModifyUserLogFieldConfigRequest setExtendConfig(String extendConfig) {
        this.extendConfig = extendConfig;
        return this;
    }
    public String getExtendConfig() {
        return this.extendConfig;
    }

    public ModifyUserLogFieldConfigRequest setFieldList(String fieldList) {
        this.fieldList = fieldList;
        return this;
    }
    public String getFieldList() {
        return this.fieldList;
    }

    public ModifyUserLogFieldConfigRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyUserLogFieldConfigRequest setLogDeliveryStrategy(String logDeliveryStrategy) {
        this.logDeliveryStrategy = logDeliveryStrategy;
        return this;
    }
    public String getLogDeliveryStrategy() {
        return this.logDeliveryStrategy;
    }

    public ModifyUserLogFieldConfigRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyUserLogFieldConfigRequest setResourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
        this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
        return this;
    }
    public String getResourceManagerResourceGroupId() {
        return this.resourceManagerResourceGroupId;
    }

}
