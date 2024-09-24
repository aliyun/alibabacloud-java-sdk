// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.osssddp20240222.models;

import com.aliyun.tea.*;

public class UpgradeSddpVersionResponseBody extends TeaModel {
    @NameInMap("Content")
    public String content;

    @NameInMap("RequestId")
    public String requestId;

    public static UpgradeSddpVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpgradeSddpVersionResponseBody self = new UpgradeSddpVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public UpgradeSddpVersionResponseBody setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public UpgradeSddpVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
