// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class CreateParamResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("ParamId")
    public Long paramId;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>F8F613A9-DF1C-551A-88E1-397A3981A785</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateParamResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateParamResponseBody self = new CreateParamResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateParamResponseBody setParamId(Long paramId) {
        this.paramId = paramId;
        return this;
    }
    public Long getParamId() {
        return this.paramId;
    }

    public CreateParamResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
