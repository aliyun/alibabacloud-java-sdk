// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class ModifyIndexPartitionResponseBody extends TeaModel {
    /**
     * <p>id of request</p>
     * 
     * <strong>example:</strong>
     * <p>93A9E542-8CF8-5BA6-99AB-94C0FE520429</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Map</p>
     * 
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("result")
    public java.util.Map<String, ?> result;

    public static ModifyIndexPartitionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyIndexPartitionResponseBody self = new ModifyIndexPartitionResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyIndexPartitionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyIndexPartitionResponseBody setResult(java.util.Map<String, ?> result) {
        this.result = result;
        return this;
    }
    public java.util.Map<String, ?> getResult() {
        return this.result;
    }

}
