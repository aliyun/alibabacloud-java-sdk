// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcedirectorymaster20220419.models;

import com.aliyun.tea.*;

public class DeleteInvalidCloudAccountRecordResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteInvalidCloudAccountRecordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteInvalidCloudAccountRecordResponseBody self = new DeleteInvalidCloudAccountRecordResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteInvalidCloudAccountRecordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
