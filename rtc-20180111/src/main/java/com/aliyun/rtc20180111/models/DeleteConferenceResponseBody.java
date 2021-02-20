// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DeleteConferenceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteConferenceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteConferenceResponseBody self = new DeleteConferenceResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteConferenceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
