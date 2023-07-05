// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.privatelink20200415.models;

import com.aliyun.tea.*;

public class CheckProductOpenResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether PrivateLink is activated.</p>
     * <br>
     * <p>Only **true** is returned. The value indicates that PrivateLink is activated.</p>
     */
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
