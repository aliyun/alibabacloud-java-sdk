// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CreateYouhuiForOrderResponseBody extends TeaModel {
    /**
     * <p>The response parameters.</p>
     * 
     * <strong>example:</strong>
     * <p>Successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0688F1D2-CDA8-5617-A43C-ADAC61D80D43</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The coupon ID.</p>
     * 
     * <strong>example:</strong>
     * <p>221201******</p>
     */
    @NameInMap("YouhuiId")
    public String youhuiId;

    public static CreateYouhuiForOrderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateYouhuiForOrderResponseBody self = new CreateYouhuiForOrderResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateYouhuiForOrderResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateYouhuiForOrderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateYouhuiForOrderResponseBody setYouhuiId(String youhuiId) {
        this.youhuiId = youhuiId;
        return this;
    }
    public String getYouhuiId() {
        return this.youhuiId;
    }

}
