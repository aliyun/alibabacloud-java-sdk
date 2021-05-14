// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyNoticeConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyNoticeConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyNoticeConfigResponseBody self = new ModifyNoticeConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyNoticeConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
