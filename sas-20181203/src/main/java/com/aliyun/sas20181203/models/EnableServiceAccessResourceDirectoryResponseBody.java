// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class EnableServiceAccessResourceDirectoryResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>52870893-48A7-5A9E-9E05-6253E5B6****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static EnableServiceAccessResourceDirectoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EnableServiceAccessResourceDirectoryResponseBody self = new EnableServiceAccessResourceDirectoryResponseBody();
        return TeaModel.build(map, self);
    }

    public EnableServiceAccessResourceDirectoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
