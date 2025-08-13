// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class CreateSampleApiResponseBody extends TeaModel {
    /**
     * <p>Status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>Error message.</p>
     * 
     * <strong>example:</strong>
     * <p>ConsolePocQueryServiceImpl.queryServiceCodeName.arg0.tab tab Type error</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>ID of the request</p>
     * 
     * <strong>example:</strong>
     * <p>A32FE941-35F2-5378-B37C-4B8FDB16F094</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateSampleApiResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSampleApiResponseBody self = new CreateSampleApiResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateSampleApiResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public CreateSampleApiResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateSampleApiResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
