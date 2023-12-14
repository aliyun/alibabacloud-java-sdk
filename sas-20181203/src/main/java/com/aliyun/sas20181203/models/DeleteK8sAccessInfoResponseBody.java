// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteK8sAccessInfoResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the request was successful. Valid value:</p>
     * <br>
     * <p>*   **true**</p>
     * <p>*   **false**</p>
     */
    @NameInMap("Data")
    public Boolean data;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteK8sAccessInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteK8sAccessInfoResponseBody self = new DeleteK8sAccessInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteK8sAccessInfoResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public DeleteK8sAccessInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
