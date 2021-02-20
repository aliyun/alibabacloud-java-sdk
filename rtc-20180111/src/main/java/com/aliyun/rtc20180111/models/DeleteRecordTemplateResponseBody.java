// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DeleteRecordTemplateResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteRecordTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteRecordTemplateResponseBody self = new DeleteRecordTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteRecordTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
