// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeCloudVendorProductTemplateConfigResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>{\&quot;vendors\&quot;:[{\&quot;vendorType\&quot;:100,\&quot;vendor\&quot;:\&quot;CHAITIN\&quot;,\&quot;displayName\&quot;:\&quot;Chaitin\&quot;,\&quot;products\&quot;:[{\&quot;product\&quot;:\&quot;webFirewall\&quot;,\&quot;displayName\&quot;:\&quot;WAF\&quot;,\&quot;backendConfig\&quot;:{\&quot;apiParams\&quot;:{\&quot;SecretKey\&quot;:{\&quot;field\&quot;:\&quot;apiToken\&quot;,\&quot;format\&quot;:\&quot;text\&quot;},\&quot;SecretId\&quot;:{\&quot;field\&quot;:\&quot;endpoint\&quot;,\&quot;format\&quot;:\&quot;text\&quot;},\&quot;Vendor\&quot;:{\&quot;field\&quot;:\&quot;vendor\&quot;,\&quot;format\&quot;:\&quot;text\&quot;},\&quot;CtdrCloudUserId\&quot;:{\&quot;field\&quot;:\&quot;ctdrCloudUserId\&quot;,\&quot;format\&quot;:\&quot;text\&quot;},\&quot;ExtendInfo\&quot;:{\&quot;format\&quot;:\&quot;json\&quot;,\&quot;fields\&quot;:[\&quot;product\&quot;,\&quot;remark\&quot;]}}},\&quot;description\&quot;:\&quot;<a href="https://docs.waf-ce.chaitin.cn/%E6%9B%B4%E5%A4%9A%E6%8A%80%E6%9C%AF%E6%96%87%E6%A1%A3/OPENAPI%5C%5C%22,%5C%5C%22fields%5C%5C%22:%5B%7B%5C%5C%22displayName%5C%5C%22:%5C%5C%22Endpoint%5C%5C%22,%5C%5C%22fieldType%5C%5C%22:%5C%5C%22text%5C%5C%22,%5C%5C%22prompt%5C%5C%22:%5C%5C%22Enter">https://docs.waf-ce.chaitin.cn/%E6%9B%B4%E5%A4%9A%E6%8A%80%E6%9C%AF%E6%96%87%E6%A1%A3/OPENAPI\\&quot;,\\&quot;fields\\&quot;:[{\\&quot;displayName\\&quot;:\\&quot;Endpoint\\&quot;,\\&quot;fieldType\\&quot;:\\&quot;text\\&quot;,\\&quot;prompt\\&quot;:\\&quot;Enter</a> an endpoint that is in the IP address:Port number format.\&quot;,\&quot;required\&quot;:true,\&quot;fieldId\&quot;:\&quot;endpoint\&quot;},{\&quot;displayName\&quot;:\&quot;API Token\&quot;,\&quot;fieldType\&quot;:\&quot;password\&quot;,\&quot;required\&quot;:true,\&quot;fieldId\&quot;:\&quot;apiToken\&quot;},{\&quot;displayName\&quot;:\&quot;‌Device Name‌ (The cloud_user_id field in the device connection logs will uniquely identify the device)\&quot;,\&quot;fieldType\&quot;:\&quot;text\&quot;,\&quot;required\&quot;:true,\&quot;fieldId\&quot;:\&quot;ctdrCloudUserId\&quot;},{\&quot;displayName\&quot;:\&quot;Remark\&quot;,\&quot;fieldType\&quot;:\&quot;text\&quot;,\&quot;required\&quot;:false,\&quot;fieldId\&quot;:\&quot;remark\&quot;}]}]}]}</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <strong>example:</strong>
     * <p>CD380235-A0B8-540D-A0D5-D6288446****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeCloudVendorProductTemplateConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCloudVendorProductTemplateConfigResponseBody self = new DescribeCloudVendorProductTemplateConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCloudVendorProductTemplateConfigResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public DescribeCloudVendorProductTemplateConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
