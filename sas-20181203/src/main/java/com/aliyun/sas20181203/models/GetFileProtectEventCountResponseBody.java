// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetFileProtectEventCountResponseBody extends TeaModel {
    /**
     * <p>The data returned if the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>16</p>
     */
    @NameInMap("Data")
    public Integer data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>9B28EC81-2FA7-5097-80D9-0DBE1A3DBD59</p>
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
