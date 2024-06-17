// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class ModifyIndexVersionResponseBody extends TeaModel {
    /**
     * <p>id of request</p>
     * 
     * <strong>example:</strong>
     * <p>F43E8AB4-419C-5F4C-90D6-615590DFAA3C</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>result</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("result")
    public java.util.Map<String, ?> result;

    public static ModifyIndexVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyIndexVersionResponseBody self = new ModifyIndexVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyIndexVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyIndexVersionResponseBody setResult(java.util.Map<String, ?> result) {
        this.result = result;
        return this;
    }
    public java.util.Map<String, ?> getResult() {
        return this.result;
    }

}
