// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeUserLogFieldConfigResponseBody extends TeaModel {
    /**
     * <p>The list of log fields that are configured in addition to the default log fields, in the format of &quot;a,b,c,...&quot;.</p>
     * 
     * <strong>example:</strong>
     * <p>acl_action,acl_rule_id</p>
     */
    @NameInMap("AddList")
    public String addList;

    /**
     * <p>The status of the log field configuration. Valid values:</p>
     * <ul>
     * <li><strong>initial</strong>: The configuration is in the initialization state.</li>
     * <li><strong>updating</strong>: The configuration is being updated.</li>
     * <li><strong>failed_finished</strong>: The configuration failed.</li>
     * <li><strong>success_finished</strong>: The configuration succeeded.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>success_finished</p>
     */
    @NameInMap("ConfigStatus")
    public String configStatus;

    /**
     * <p>The list of log fields that are excluded from the default log fields, in the format of &quot;a,b,c,...&quot;.</p>
     * 
     * <strong>example:</strong>
     * <p>waf_rule_id,waf_rule_type</p>
     */
    @NameInMap("DelList")
    public String delList;

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
     * <p>The extended configuration for log delivery. The value is a string converted from a JSON object constructed with a series of parameters.</p>
     * <blockquote>
     * <p>For more information about the parameters, see the <strong>ExtendConfig</strong> parameter description in the <a href="~~ModifyUserLogFieldConfig~~">ModifyUserLogFieldConfig</a> operation.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;request_header\&quot;:\&quot;Ali-Cdn-Real-Ip\&quot;}</p>
     */
    @NameInMap("ExtendConfig")
    public String extendConfig;

    /**
     * <p>The list of log fields to be delivered, in the format of &quot;a,b,c,...&quot;.</p>
     * 
     * <strong>example:</strong>
     * <p>account,acl_action,acl_rule_id,acl_rule_type</p>
     */
    @NameInMap("FieldList")
    public String fieldList;

    /**
     * <p>The log delivery strategy. Multiple strategies are supported. The value is a string converted from a JSON array constructed with a series of parameters.</p>
     * <blockquote>
     * <p>For more information about the parameters, see the <strong>LogDeliveryStrategy</strong> parameter description in the <a href="~~ModifyUserLogFieldConfig~~">ModifyUserLogFieldConfig</a> operation.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>[{\&quot;logType\&quot;:\&quot;blockLog\&quot;,\&quot;rate\&quot;:100},{\&quot;logType\&quot;:\&quot;normalRequestLog\&quot;,\&quot;rate\&quot;:100},{\&quot;logType\&quot;:\&quot;checkLog\&quot;,\&quot;rate\&quot;:100}]</p>
     */
    @NameInMap("LogDeliveryStrategy")
    public String logDeliveryStrategy;

    /**
     * <p>The request ID.</p>
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
