// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class DeleteModelResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>022F36C7-9FB4-5D67-BEBC-3D14B0984463</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static DeleteModelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteModelResponseBody self = new DeleteModelResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteModelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
