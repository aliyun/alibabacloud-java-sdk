// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class ModifyFileResponseBody extends TeaModel {
    /**
     * <p>id of request</p>
     * 
     * <strong>example:</strong>
     * <p>89B968E6-1E41-58DF-BB25-5F98ECC759CE</p>
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

    public static ModifyFileResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyFileResponseBody self = new ModifyFileResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyFileResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyFileResponseBody setResult(java.util.Map<String, ?> result) {
        this.result = result;
        return this;
    }
    public java.util.Map<String, ?> getResult() {
        return this.result;
    }

}
