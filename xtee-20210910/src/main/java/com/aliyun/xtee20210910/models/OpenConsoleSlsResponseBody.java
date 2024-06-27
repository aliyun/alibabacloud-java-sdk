// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class OpenConsoleSlsResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("resultObject")
    public String resultObject;

    public static OpenConsoleSlsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OpenConsoleSlsResponseBody self = new OpenConsoleSlsResponseBody();
        return TeaModel.build(map, self);
    }

    public OpenConsoleSlsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public OpenConsoleSlsResponseBody setResultObject(String resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public String getResultObject() {
        return this.resultObject;
    }

}
