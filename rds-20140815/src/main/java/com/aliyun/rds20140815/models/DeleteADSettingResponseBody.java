// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DeleteADSettingResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteADSettingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteADSettingResponseBody self = new DeleteADSettingResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteADSettingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
