// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nlp_automl20190701.models;

import com.aliyun.tea.*;

public class InvokeActionRequest extends TeaModel {
    @NameInMap("InvokeProduct")
    public String invokeProduct;

    @NameInMap("InvokeRegion")
    public String invokeRegion;

    @NameInMap("InvokeAction")
    public String invokeAction;

    @NameInMap("InvokeParams")
    public String invokeParams;

    public static InvokeActionRequest build(java.util.Map<String, ?> map) throws Exception {
        InvokeActionRequest self = new InvokeActionRequest();
        return TeaModel.build(map, self);
    }

    public InvokeActionRequest setInvokeProduct(String invokeProduct) {
        this.invokeProduct = invokeProduct;
        return this;
    }
    public String getInvokeProduct() {
        return this.invokeProduct;
    }

    public InvokeActionRequest setInvokeRegion(String invokeRegion) {
        this.invokeRegion = invokeRegion;
        return this;
    }
    public String getInvokeRegion() {
        return this.invokeRegion;
    }

    public InvokeActionRequest setInvokeAction(String invokeAction) {
        this.invokeAction = invokeAction;
        return this;
    }
    public String getInvokeAction() {
        return this.invokeAction;
    }

    public InvokeActionRequest setInvokeParams(String invokeParams) {
        this.invokeParams = invokeParams;
        return this;
    }
    public String getInvokeParams() {
        return this.invokeParams;
    }

}
