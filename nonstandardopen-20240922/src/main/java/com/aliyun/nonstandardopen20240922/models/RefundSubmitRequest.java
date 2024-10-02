// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nonstandardopen20240922.models;

import com.aliyun.tea.*;

public class RefundSubmitRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>{
     *     &quot;itemId&quot;: 123456,
     *     &quot;skuId&quot;: 123456789,
     *     &quot;mobile&quot;: 13111111111,
     *     &quot;buyAmount&quot;: 1,
     *     &quot;outOrderId&quot;: &quot;123456789&quot;
     * }</p>
     */
    @NameInMap("bizParam")
    public String bizParam;

    public static RefundSubmitRequest build(java.util.Map<String, ?> map) throws Exception {
        RefundSubmitRequest self = new RefundSubmitRequest();
        return TeaModel.build(map, self);
    }

    public RefundSubmitRequest setBizParam(String bizParam) {
        this.bizParam = bizParam;
        return this;
    }
    public String getBizParam() {
        return this.bizParam;
    }

}
