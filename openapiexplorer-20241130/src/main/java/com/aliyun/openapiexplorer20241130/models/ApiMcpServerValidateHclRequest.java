// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openapiexplorer20241130.models;

import com.aliyun.tea.*;

public class ApiMcpServerValidateHclRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>variable &quot;name&quot; {
     *   default = &quot;terraform-example&quot;
     * }</p>
     * <p>provider &quot;alicloud&quot; {
     *   region = &quot;cn-beijing&quot;
     * }</p>
     * <p>resource &quot;alicloud_vpc&quot; &quot;default&quot; {
     *   ipv6_isp    = &quot;BGP&quot;
     *   description = &quot;test&quot;
     *   cidr_block  = &quot;10.0.0.0/8&quot;
     *   vpc_name    = var.name
     *   enable_ipv6 = true
     * }</p>
     */
    @NameInMap("code")
    public String code;

    public static ApiMcpServerValidateHclRequest build(java.util.Map<String, ?> map) throws Exception {
        ApiMcpServerValidateHclRequest self = new ApiMcpServerValidateHclRequest();
        return TeaModel.build(map, self);
    }

    public ApiMcpServerValidateHclRequest setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

}
