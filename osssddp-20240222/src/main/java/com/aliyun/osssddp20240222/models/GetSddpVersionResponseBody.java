// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.osssddp20240222.models;

import com.aliyun.tea.*;

public class GetSddpVersionResponseBody extends TeaModel {
    @NameInMap("Content")
    public Integer content;

    @NameInMap("RequestId")
    public String requestId;

    public static GetSddpVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSddpVersionResponseBody self = new GetSddpVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSddpVersionResponseBody setContent(Integer content) {
        this.content = content;
        return this;
    }
    public Integer getContent() {
        return this.content;
    }

    public GetSddpVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
