// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class CreateSampleApiResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
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

    public CreateSampleApiResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
