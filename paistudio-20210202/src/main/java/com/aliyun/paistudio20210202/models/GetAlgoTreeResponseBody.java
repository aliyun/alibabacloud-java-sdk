// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20210202.models;

import com.aliyun.tea.*;

public class GetAlgoTreeResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>[{}]</p>
     */
    @NameInMap("Data")
    public java.util.Map<String, ?> data;

    /**
     * <strong>example:</strong>
     * <p>8CAA642F-EFEB-5F87-8F2F-ACD58B15FA03</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetAlgoTreeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAlgoTreeResponseBody self = new GetAlgoTreeResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAlgoTreeResponseBody setData(java.util.Map<String, ?> data) {
        this.data = data;
        return this;
    }
    public java.util.Map<String, ?> getData() {
        return this.data;
    }

    public GetAlgoTreeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
