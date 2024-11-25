// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ReplaceRCInstanceSystemDiskResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ReplaceRCInstanceSystemDiskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ReplaceRCInstanceSystemDiskResponseBody self = new ReplaceRCInstanceSystemDiskResponseBody();
        return TeaModel.build(map, self);
    }

    public ReplaceRCInstanceSystemDiskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
