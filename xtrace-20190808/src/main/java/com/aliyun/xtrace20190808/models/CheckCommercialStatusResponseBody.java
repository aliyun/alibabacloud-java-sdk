// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtrace20190808.models;

import com.aliyun.tea.*;

public class CheckCommercialStatusResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>1E2B6A4C-6B83-4062-8B6F-AEEC1FC47DED</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CheckCommercialStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckCommercialStatusResponseBody self = new CheckCommercialStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckCommercialStatusResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public CheckCommercialStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
