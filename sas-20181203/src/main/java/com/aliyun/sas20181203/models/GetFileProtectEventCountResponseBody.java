// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetFileProtectEventCountResponseBody extends TeaModel {
    /**
     * <p>The data returned if the request is successful.</p>
     */
    @NameInMap("Data")
    public Integer data;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetFileProtectEventCountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetFileProtectEventCountResponseBody self = new GetFileProtectEventCountResponseBody();
        return TeaModel.build(map, self);
    }

    public GetFileProtectEventCountResponseBody setData(Integer data) {
        this.data = data;
        return this;
    }
    public Integer getData() {
        return this.data;
    }

    public GetFileProtectEventCountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
