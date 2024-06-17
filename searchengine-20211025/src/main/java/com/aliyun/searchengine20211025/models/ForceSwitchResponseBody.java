// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class ForceSwitchResponseBody extends TeaModel {
    /**
     * <p>id of request</p>
     * 
     * <strong>example:</strong>
     * <p>0B1FF998-BB8D-5182-BFC0-E471AA77095A</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The information about the index</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("result")
    public java.util.Map<String, ?> result;

    public static ForceSwitchResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ForceSwitchResponseBody self = new ForceSwitchResponseBody();
        return TeaModel.build(map, self);
    }

    public ForceSwitchResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ForceSwitchResponseBody setResult(java.util.Map<String, ?> result) {
        this.result = result;
        return this;
    }
    public java.util.Map<String, ?> getResult() {
        return this.result;
    }

}
