// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class DeleteStateConfigurationsResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>12345B731-0FCE-48BA-8D42-605abcde</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteStateConfigurationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteStateConfigurationsResponseBody self = new DeleteStateConfigurationsResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteStateConfigurationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
