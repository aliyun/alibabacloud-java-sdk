// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class UpdateDNADBResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateDNADBResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateDNADBResponseBody self = new UpdateDNADBResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateDNADBResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
