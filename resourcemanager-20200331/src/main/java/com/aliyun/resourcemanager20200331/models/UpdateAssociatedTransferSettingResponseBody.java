// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class UpdateAssociatedTransferSettingResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateAssociatedTransferSettingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateAssociatedTransferSettingResponseBody self = new UpdateAssociatedTransferSettingResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateAssociatedTransferSettingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
