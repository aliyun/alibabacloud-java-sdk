// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyNoticeConfigResponseBody extends TeaModel {
    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>5989D067-621F-51E2-A636-D94D1388****</p>
     */
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
