// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nonstandardopen20240922.models;

import com.aliyun.tea.*;

public class InitCardRequest extends TeaModel {
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

    public static InitCardRequest build(java.util.Map<String, ?> map) throws Exception {
        InitCardRequest self = new InitCardRequest();
        return TeaModel.build(map, self);
    }

    public InitCardRequest setBizParam(String bizParam) {
        this.bizParam = bizParam;
        return this;
    }
    public String getBizParam() {
        return this.bizParam;
    }

}
