// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openapiexplorer20241130.models;

import com.aliyun.tea.*;

public class GetErrorCodeSolutionsRequest extends TeaModel {
    /**
     * <p>The language of the solution. Valid values: zh-CN and en-US. Not all of the solutions are available in English. If you set this parameter to en-US, but the corresponding solution is actually not available in English, no response is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>zh-CN</p>
     */
    @NameInMap("acceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The error code based on which you want to query a solution.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>IncorrectStatus.TransitRouter</p>
     */
    @NameInMap("errorCode")
    public String errorCode;

    /**
     * <p>The error message for which you want to query a solution. This parameter must be configured together with the errorCode parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>The resource is not in a valid state for the operation.</p>
     */
    @NameInMap("errorMessage")
    public String errorMessage;

    /**
     * <p>The product code. You can use one of the following methods to query a product code:</p>
     * <ul>
     * <li><p>Call the GetRequestLog operation to query a product code from the response.</p>
     * </li>
     * <li><p>Query the code of a product in the OpenAPI Explorer URL of the product. For example, the OpenAPI Explorer URL of Short Message Service (SMS) is https\://api.alibabacloud.com/product/Dysmsapi. Therefore, the product code of SMS is Dysmsapi.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Ecs</p>
     */
    @NameInMap("product")
    public String product;

    public static GetErrorCodeSolutionsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetErrorCodeSolutionsRequest self = new GetErrorCodeSolutionsRequest();
        return TeaModel.build(map, self);
    }

    public GetErrorCodeSolutionsRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public GetErrorCodeSolutionsRequest setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetErrorCodeSolutionsRequest setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetErrorCodeSolutionsRequest setProduct(String product) {
        this.product = product;
        return this;
    }
    public String getProduct() {
        return this.product;
    }

}
