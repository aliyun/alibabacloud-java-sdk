// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DeleteHybridCloudGroupResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>D7861F61-5B61-46CE-A47C-*****60D5EB0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteHybridCloudGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteHybridCloudGroupResponseBody self = new DeleteHybridCloudGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteHybridCloudGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
