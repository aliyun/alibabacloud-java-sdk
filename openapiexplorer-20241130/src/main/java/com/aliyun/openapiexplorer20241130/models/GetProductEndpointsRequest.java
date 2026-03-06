// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openapiexplorer20241130.models;

import com.aliyun.tea.*;

public class GetProductEndpointsRequest extends TeaModel {
    /**
     * <p>The product code.</p>
     * <ul>
     * <li><p>Call the GetRequestLog operation and find the product code in the response.</p>
     * </li>
     * <li><p>Find the product code in the URL of the OpenAPI Portal page for the product. For example, &lt;props=&quot;china&quot;&gt;the URL for the Short Message Service (SMS) OpenAPI Portal page is https\://api.aliyun.com/product/Dysmsapi. The product code is Dysmsapi.
     * &lt;props=&quot;intl&quot;&gt;the URL for the Short Message Service (SMS) OpenAPI Portal page is https\://api.alibabacloud.com/product/Dysmsapi. The product code is Dysmsapi.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Ecs</p>
     */
    @NameInMap("product")
    public String product;

    public static GetProductEndpointsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetProductEndpointsRequest self = new GetProductEndpointsRequest();
        return TeaModel.build(map, self);
    }

    public GetProductEndpointsRequest setProduct(String product) {
        this.product = product;
        return this;
    }
    public String getProduct() {
        return this.product;
    }

}
