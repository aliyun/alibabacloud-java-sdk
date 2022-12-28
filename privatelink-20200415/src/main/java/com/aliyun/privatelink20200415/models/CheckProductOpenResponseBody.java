// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.privatelink20200415.models;

import com.aliyun.tea.*;

public class CheckProductOpenResponseBody extends TeaModel {
    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // Indicates whether PrivateLink is activated.
    // 
    // Only **true** is returned, which indicates that PrivateLink is activated.
    @NameInMap("Success")
    public Boolean success;

    public static CheckProductOpenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckProductOpenResponseBody self = new CheckProductOpenResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckProductOpenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckProductOpenResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
