// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class DeleteLabelTableResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>FFD39C0F-DD8D-51B2-864E-2842206DB0E8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteLabelTableResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteLabelTableResponseBody self = new DeleteLabelTableResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteLabelTableResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
