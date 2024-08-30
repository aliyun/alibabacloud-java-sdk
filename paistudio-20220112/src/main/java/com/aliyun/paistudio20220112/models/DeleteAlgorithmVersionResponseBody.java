// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class DeleteAlgorithmVersionResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>F082BD0D-21E1-5F9B-81A0-AB07485B03CD</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteAlgorithmVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteAlgorithmVersionResponseBody self = new DeleteAlgorithmVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteAlgorithmVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
