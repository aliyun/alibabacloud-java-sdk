// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ModifyModelResponseBody extends TeaModel {
    @NameInMap("result")
    public String result;

    @NameInMap("requestId")
    public String requestId;

    public static ModifyModelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyModelResponseBody self = new ModifyModelResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyModelResponseBody setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

    public ModifyModelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
