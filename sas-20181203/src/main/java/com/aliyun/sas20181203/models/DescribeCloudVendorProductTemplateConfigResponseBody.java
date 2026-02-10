// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeCloudVendorProductTemplateConfigResponseBody extends TeaModel {
    /**
     * <p>Template configuration. This parameter is a JSON structure that includes the following fields: - <strong>vendors</strong>: A collection of vendor template configuration information. - <strong>vendorType</strong>: Vendor code, <strong>CHAITIN</strong> takes the value <strong>100</strong>, <strong>FORTINET</strong> takes the value <strong>101</strong>, and <strong>THREATBOOK</strong> takes the value <strong>102</strong>. - <strong>vendor</strong>: Vendor. Takes the values <strong>CHAITIN</strong>, <strong>FORTINET</strong>, or <strong>THREATBOOK</strong>. - <strong>displayName</strong>: Display name. Takes the values <strong>Chaitin</strong>, <strong>Fortinet</strong>, or <strong>Threatbook</strong>. - <strong>products</strong>: A list of template configuration information. This parameter is a JSON structure that includes the following fields: - <strong>product</strong>: Product code. When <strong>vendor</strong> is <strong>CHAITIN</strong>, it takes the value <strong>webFirewall</strong>; when <strong>vendor</strong> is <strong>FORTINET</strong>, it takes the value <strong>fortigate</strong>; when <strong>vendor</strong> is <strong>THREATBOOK</strong>, it takes the value <strong>threatIntelligence</strong>. - <strong>displayName</strong>: Product display name. When <strong>vendor</strong> is <strong>CHAITIN</strong>, it takes the value <strong>WAF</strong>; when <strong>vendor</strong> is <strong>FORTINET</strong>, it takes the value <strong>FortiGate Firewall</strong>; when <strong>vendor</strong> is <strong>THREATBOOK</strong>, it takes the value <strong>Threat Intelligence API</strong>. - <strong>description</strong>: Link to the technical support document for the product. - <strong>backendConfig</strong>: A list of API field mapping rules. This parameter is a JSON structure that includes the following fields: - <strong>apiParams</strong>: API field mapping rules. This parameter is a Map structure where the key is the backend field mapping key. The value is a JSON structure that includes the following fields: - <strong>field</strong>: Property key. - <strong>format</strong>: Type of the property value, which can be <strong>text</strong> or <strong>json</strong>. - <strong>fields</strong>: Fields that need to be filled in the template. This parameter is a JSON structure that includes the following fields: - <strong>displayName</strong>: Field display name. - <strong>editable</strong>: Whether the field is editable. Takes the values <strong>true</strong> or <strong>false</strong>. <strong>true</strong> means editable, <strong>false</strong> means not editable. - <strong>fieldType</strong>: Type of the field value. Takes the values <strong>text</strong> or <strong>password</strong>. - <strong>required</strong>: Whether the field is required. Takes the values <strong>true</strong> or <strong>false</strong>. <strong>true</strong> means required, <strong>false</strong> means not required. - <strong>fieldId</strong>: Field key.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;vendors\&quot;:[{\&quot;vendorType\&quot;:100,\&quot;vendor\&quot;:\&quot;CHAITIN\&quot;,\&quot;displayName\&quot;:\&quot;Chaitin\&quot;,\&quot;products\&quot;:[{\&quot;product\&quot;:\&quot;webFirewall\&quot;,\&quot;displayName\&quot;:\&quot;WAF\&quot;,\&quot;backendConfig\&quot;:{\&quot;apiParams\&quot;:{\&quot;SecretKey\&quot;:{\&quot;field\&quot;:\&quot;apiToken\&quot;,\&quot;format\&quot;:\&quot;text\&quot;},\&quot;SecretId\&quot;:{\&quot;field\&quot;:\&quot;endpoint\&quot;,\&quot;format\&quot;:\&quot;text\&quot;},\&quot;Vendor\&quot;:{\&quot;field\&quot;:\&quot;vendor\&quot;,\&quot;format\&quot;:\&quot;text\&quot;},\&quot;CtdrCloudUserId\&quot;:{\&quot;field\&quot;:\&quot;ctdrCloudUserId\&quot;,\&quot;format\&quot;:\&quot;text\&quot;},\&quot;ExtendInfo\&quot;:{\&quot;format\&quot;:\&quot;json\&quot;,\&quot;fields\&quot;:[\&quot;product\&quot;,\&quot;remark\&quot;]}}},\&quot;description\&quot;:\&quot;<a href="https://docs.waf-ce.chaitin.cn/%E6%9B%B4%E5%A4%9A%E6%8A%80%E6%9C%AF%E6%96%87%E6%A1%A3/OPENAPI%5C%5C%22,%5C%5C%22fields%5C%5C%22:%5B%7B%5C%5C%22displayName%5C%5C%22:%5C%5C%22Endpoint%5C%5C%22,%5C%5C%22fieldType%5C%5C%22:%5C%5C%22text%5C%5C%22,%5C%5C%22prompt%5C%5C%22:%5C%5C%22Enter">https://docs.waf-ce.chaitin.cn/%E6%9B%B4%E5%A4%9A%E6%8A%80%E6%9C%AF%E6%96%87%E6%A1%A3/OPENAPI\\&quot;,\\&quot;fields\\&quot;:[{\\&quot;displayName\\&quot;:\\&quot;Endpoint\\&quot;,\\&quot;fieldType\\&quot;:\\&quot;text\\&quot;,\\&quot;prompt\\&quot;:\\&quot;Enter</a> an endpoint that is in the IP address:Port number format.\&quot;,\&quot;required\&quot;:true,\&quot;fieldId\&quot;:\&quot;endpoint\&quot;},{\&quot;displayName\&quot;:\&quot;API Token\&quot;,\&quot;fieldType\&quot;:\&quot;password\&quot;,\&quot;required\&quot;:true,\&quot;fieldId\&quot;:\&quot;apiToken\&quot;},{\&quot;displayName\&quot;:\&quot;‌Device Name‌ (The cloud_user_id field in the device connection logs will uniquely identify the device)\&quot;,\&quot;fieldType\&quot;:\&quot;text\&quot;,\&quot;required\&quot;:true,\&quot;fieldId\&quot;:\&quot;ctdrCloudUserId\&quot;},{\&quot;displayName\&quot;:\&quot;Remark\&quot;,\&quot;fieldType\&quot;:\&quot;text\&quot;,\&quot;required\&quot;:false,\&quot;fieldId\&quot;:\&quot;remark\&quot;}]}]}]}</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>The ID of this call request, which is a unique identifier generated by Alibaba Cloud for this request, and can be used to troubleshoot and locate issues.</p>
     * 
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
