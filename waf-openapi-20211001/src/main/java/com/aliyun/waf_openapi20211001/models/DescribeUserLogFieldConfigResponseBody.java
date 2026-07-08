// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeUserLogFieldConfigResponseBody extends TeaModel {
    /**
     * <p>The additional log fields that are added to the default configuration. Multiple fields are separated by commas (,) in the <code>a,b,c,...</code> format.</p>
     * 
     * <strong>example:</strong>
     * <p>acl_action,acl_rule_id</p>
     */
    @NameInMap("AddList")
    public String addList;

    /**
     * <p>The status of the log field configuration. Valid values:</p>
     * <ul>
     * <li><p><strong>initial</strong>: The log field configuration is being initialized.</p>
     * </li>
     * <li><p><strong>updating</strong>: The log field configuration is being updated.</p>
     * </li>
     * <li><p><strong>failed_finished</strong>: The log field configuration update failed.</p>
     * </li>
     * <li><p><strong>success_finished</strong>: The log field configuration update succeeded.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>success_finished</p>
     */
    @NameInMap("ConfigStatus")
    public String configStatus;

    /**
     * <p>The default log fields that are excluded from the log delivery configuration. Multiple fields are separated by commas (,) in the <code>a,b,c,...</code> format.</p>
     * 
     * <strong>example:</strong>
     * <p>waf_rule_id,waf_rule_type</p>
     */
    @NameInMap("DelList")
    public String delList;

    /**
     * <p>The log delivery type. Valid values:</p>
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
     * <p>The extended configuration for log delivery. The value is a JSON-formatted string that contains configuration key-value pairs, such as custom request headers.</p>
     * <blockquote>
     * <p>For more information, see the <strong>ExtendConfig</strong> parameter description in <a href="~~ModifyUserLogFieldConfig~~">ModifyUserLogFieldConfig</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;request_header\&quot;:\&quot;Ali-Cdn-Real-Ip\&quot;}</p>
     */
    @NameInMap("ExtendConfig")
    public String extendConfig;

    /**
     * <p>The complete list of log fields that are delivered. Multiple fields are separated by commas (,) in the <code>a,b,c,...</code> format.</p>
     * 
     * <strong>example:</strong>
     * <p>account,acl_action,acl_rule_id,acl_rule_type</p>
     */
    @NameInMap("FieldList")
    public String fieldList;

    /**
     * <p>The log delivery policies. Multiple policies are supported. The value is a JSON-formatted string that contains an array of policy objects.</p>
     * <blockquote>
     * <p>For more information, see the <strong>LogDeliveryStrategy</strong> parameter description in <a href="~~ModifyUserLogFieldConfig~~">ModifyUserLogFieldConfig</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>[{\&quot;logType\&quot;:\&quot;blockLog\&quot;,\&quot;rate\&quot;:100},{\&quot;logType\&quot;:\&quot;normalRequestLog\&quot;,\&quot;rate\&quot;:100},{\&quot;logType\&quot;:\&quot;checkLog\&quot;,\&quot;rate\&quot;:100}]</p>
     */
    @NameInMap("LogDeliveryStrategy")
    public String logDeliveryStrategy;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>653778B4-4D47-5223-855B-4E******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeUserLogFieldConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserLogFieldConfigResponseBody self = new DescribeUserLogFieldConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeUserLogFieldConfigResponseBody setAddList(String addList) {
        this.addList = addList;
        return this;
    }
    public String getAddList() {
        return this.addList;
    }

    public DescribeUserLogFieldConfigResponseBody setConfigStatus(String configStatus) {
        this.configStatus = configStatus;
        return this;
    }
    public String getConfigStatus() {
        return this.configStatus;
    }

    public DescribeUserLogFieldConfigResponseBody setDelList(String delList) {
        this.delList = delList;
        return this;
    }
    public String getDelList() {
        return this.delList;
    }

    public DescribeUserLogFieldConfigResponseBody setDeliveryType(String deliveryType) {
        this.deliveryType = deliveryType;
        return this;
    }
    public String getDeliveryType() {
        return this.deliveryType;
    }

    public DescribeUserLogFieldConfigResponseBody setExtendConfig(String extendConfig) {
        this.extendConfig = extendConfig;
        return this;
    }
    public String getExtendConfig() {
        return this.extendConfig;
    }

    public DescribeUserLogFieldConfigResponseBody setFieldList(String fieldList) {
        this.fieldList = fieldList;
        return this;
    }
    public String getFieldList() {
        return this.fieldList;
    }

    public DescribeUserLogFieldConfigResponseBody setLogDeliveryStrategy(String logDeliveryStrategy) {
        this.logDeliveryStrategy = logDeliveryStrategy;
        return this;
    }
    public String getLogDeliveryStrategy() {
        return this.logDeliveryStrategy;
    }

    public DescribeUserLogFieldConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
