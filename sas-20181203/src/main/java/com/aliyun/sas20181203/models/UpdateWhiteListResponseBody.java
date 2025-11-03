// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UpdateWhiteListResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Data")
    public Boolean data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>576EF709-71CE-500F-95FC-7F7A297D****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateWhiteListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateWhiteListResponseBody self = new UpdateWhiteListResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateWhiteListResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public UpdateWhiteListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
