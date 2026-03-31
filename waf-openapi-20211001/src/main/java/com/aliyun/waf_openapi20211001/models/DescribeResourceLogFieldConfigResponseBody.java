// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeResourceLogFieldConfigResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>acl_test,acl_action,acl_rule_id,waf_test,acl_rule_type</p>
     */
    @NameInMap("AddList")
    public String addList;

    /**
     * <strong>example:</strong>
     * <p>waf_rule_id,waf_rule_type</p>
     */
    @NameInMap("DelList")
    public String delList;

    /**
     * <strong>example:</strong>
     * <p>sls</p>
     */
    @NameInMap("DeliveryType")
    public String deliveryType;

    /**
     * <strong>example:</strong>
     * <p>{\&quot;request_header\&quot;:\&quot;Ali-Cdn-Real-Ip\&quot;}</p>
     */
    @NameInMap("ExtendConfig")
    public String extendConfig;

    /**
     * <strong>example:</strong>
     * <p>account,acl_action,acl_rule_id,acl_rule_type,acl_test,antiscan_action,antiscan_rule_id,antiscan_rule_type,antiscan_test,body_bytes_sent,bypass_matched_ids</p>
     */
    @NameInMap("FieldList")
    public String fieldList;

    /**
     * <strong>example:</strong>
     * <p>[{\&quot;logType\&quot;:\&quot;blockLog\&quot;,\&quot;rate\&quot;:100},{\&quot;logType\&quot;:\&quot;normalRequestLog\&quot;,\&quot;rate\&quot;:100},{\&quot;logType\&quot;:\&quot;checkLog\&quot;,\&quot;rate\&quot;:100}]</p>
     */
    @NameInMap("LogDeliveryStrategy")
    public String logDeliveryStrategy;

    /**
     * <strong>example:</strong>
     * <p>7B53B47C-D368-5344-BB5E-79******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeResourceLogFieldConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeResourceLogFieldConfigResponseBody self = new DescribeResourceLogFieldConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeResourceLogFieldConfigResponseBody setAddList(String addList) {
        this.addList = addList;
        return this;
    }
    public String getAddList() {
        return this.addList;
    }

    public DescribeResourceLogFieldConfigResponseBody setDelList(String delList) {
        this.delList = delList;
        return this;
    }
    public String getDelList() {
        return this.delList;
    }

    public DescribeResourceLogFieldConfigResponseBody setDeliveryType(String deliveryType) {
        this.deliveryType = deliveryType;
        return this;
    }
    public String getDeliveryType() {
        return this.deliveryType;
    }

    public DescribeResourceLogFieldConfigResponseBody setExtendConfig(String extendConfig) {
        this.extendConfig = extendConfig;
        return this;
    }
    public String getExtendConfig() {
        return this.extendConfig;
    }

    public DescribeResourceLogFieldConfigResponseBody setFieldList(String fieldList) {
        this.fieldList = fieldList;
        return this;
    }
    public String getFieldList() {
        return this.fieldList;
    }

    public DescribeResourceLogFieldConfigResponseBody setLogDeliveryStrategy(String logDeliveryStrategy) {
        this.logDeliveryStrategy = logDeliveryStrategy;
        return this;
    }
    public String getLogDeliveryStrategy() {
        return this.logDeliveryStrategy;
    }

    public DescribeResourceLogFieldConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
