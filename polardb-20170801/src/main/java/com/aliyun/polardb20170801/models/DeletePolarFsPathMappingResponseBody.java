// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DeletePolarFsPathMappingResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>7E2FE3BB-C677-5FF9-9FC5-9CF364BD6BE5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeletePolarFsPathMappingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeletePolarFsPathMappingResponseBody self = new DeletePolarFsPathMappingResponseBody();
        return TeaModel.build(map, self);
    }

    public DeletePolarFsPathMappingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
