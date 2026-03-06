// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openapiexplorer20241130.models;

import com.aliyun.tea.*;

public class ListApiDefinitionsRequest extends TeaModel {
    /**
     * <p>The version of the API.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2014-05-26</p>
     */
    @NameInMap("apiVersion")
    public String apiVersion;

    /**
     * <p>The product code.</p>
     * <ul>
     * <li><p>Call the GetRequestLog operation to obtain the product code from the response.</p>
     * </li>
     * <li><p>Find the product code in the URL of the OpenAPI Portal. For example, &lt;props=&quot;china&quot;&gt;the URL of the OpenAPI Portal for Short Message Service is https\://api.aliyun.com/product/Dysmsapi. The product code for Short Message Service is Dysmsapi.
     * &lt;props=&quot;intl&quot;&gt;the URL of the OpenAPI Portal for Short Message Service is https\://api.alibabacloud.com/product/Dysmsapi. The product code for Short Message Service is Dysmsapi.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Ecs</p>
     */
    @NameInMap("product")
    public String product;

    public static ListApiDefinitionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListApiDefinitionsRequest self = new ListApiDefinitionsRequest();
        return TeaModel.build(map, self);
    }

    public ListApiDefinitionsRequest setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }
    public String getApiVersion() {
        return this.apiVersion;
    }

    public ListApiDefinitionsRequest setProduct(String product) {
        this.product = product;
        return this;
    }
    public String getProduct() {
        return this.product;
    }

}
