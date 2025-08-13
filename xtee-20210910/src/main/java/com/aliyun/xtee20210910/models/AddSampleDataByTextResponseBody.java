// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class AddSampleDataByTextResponseBody extends TeaModel {
    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A32FE941-35F2-5378-B37C-4B8FDB16F094</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AddSampleDataByTextResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddSampleDataByTextResponseBody self = new AddSampleDataByTextResponseBody();
        return TeaModel.build(map, self);
    }

    public AddSampleDataByTextResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
