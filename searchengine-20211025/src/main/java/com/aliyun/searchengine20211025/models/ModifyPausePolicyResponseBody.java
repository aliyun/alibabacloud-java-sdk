// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class ModifyPausePolicyResponseBody extends TeaModel {
    /**
     * <p>id of request</p>
     * 
     * <strong>example:</strong>
     * <p>0B1FF998-BB8D-5182-BFC0-E471AA77095A</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Map</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("result")
    public java.util.Map<String, ?> result;

    public static ModifyPausePolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyPausePolicyResponseBody self = new ModifyPausePolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyPausePolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyPausePolicyResponseBody setResult(java.util.Map<String, ?> result) {
        this.result = result;
        return this;
    }
    public java.util.Map<String, ?> getResult() {
        return this.result;
    }

}
