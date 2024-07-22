// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20180612.models;

import com.aliyun.tea.*;

public class EnableInstanceResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>3a530dc0-7cfa-48f6-9539-bf9001e77b16</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Status")
    public String status;

    public static EnableInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EnableInstanceResponseBody self = new EnableInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public EnableInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public EnableInstanceResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
