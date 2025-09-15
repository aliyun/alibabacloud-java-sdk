// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class ModifyUserLogFieldConfigRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>sls</p>
     */
    @NameInMap("DeliveryType")
    public String deliveryType;

    /**
     * <strong>example:</strong>
     * <p>{\&quot;request_header\&quot;:\&quot;App-Id,channelCode\&quot;}</p>
     */
    @NameInMap("ExtendConfig")
    public String extendConfig;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>account,acl_action,acl_rule_id,acl_rule_type,acl_test,antiscan_action,antiscan_rule_id,antiscan_rule_type,antiscan_test,body_bytes_sent,bypass_matched_ids</p>
     */
    @NameInMap("FieldList")
    public String fieldList;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>waf_v2_public_cn-fou****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>[{\&quot;logType\&quot;:\&quot;blockLog\&quot;,\&quot;rate\&quot;:100},{\&quot;logType\&quot;:\&quot;normalRequestLog\&quot;,\&quot;rate\&quot;:100},{\&quot;logType\&quot;:\&quot;checkLog\&quot;,\&quot;rate\&quot;:100}]</p>
     */
    @NameInMap("LogDeliveryStrategy")
    public String logDeliveryStrategy;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
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
