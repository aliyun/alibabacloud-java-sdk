// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.selectdb20230522.models;

import com.aliyun.tea.*;

public class DeleteDBClusterBindingResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>F8900A96-67F7-5274-A41B-7722E1ECF8C9</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteDBClusterBindingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteDBClusterBindingResponseBody self = new DeleteDBClusterBindingResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteDBClusterBindingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
