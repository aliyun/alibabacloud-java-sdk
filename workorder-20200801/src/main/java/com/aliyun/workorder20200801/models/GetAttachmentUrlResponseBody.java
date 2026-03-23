// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.workorder20200801.models;

import com.aliyun.tea.*;

public class GetAttachmentUrlResponseBody extends TeaModel {
    @NameInMap("AccessFileUrl")
    public String accessFileUrl;

    @NameInMap("RequestId")
    public String requestId;

    public static GetAttachmentUrlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAttachmentUrlResponseBody self = new GetAttachmentUrlResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAttachmentUrlResponseBody setAccessFileUrl(String accessFileUrl) {
        this.accessFileUrl = accessFileUrl;
        return this;
    }
    public String getAccessFileUrl() {
        return this.accessFileUrl;
    }

    public GetAttachmentUrlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
