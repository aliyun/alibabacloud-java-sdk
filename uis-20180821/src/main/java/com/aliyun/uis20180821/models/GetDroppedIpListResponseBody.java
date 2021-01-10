// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.uis20180821.models;

import com.aliyun.tea.*;

public class GetDroppedIpListResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("DroppedIpListUrl")
    public String droppedIpListUrl;

    public static GetDroppedIpListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDroppedIpListResponseBody self = new GetDroppedIpListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDroppedIpListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDroppedIpListResponseBody setDroppedIpListUrl(String droppedIpListUrl) {
        this.droppedIpListUrl = droppedIpListUrl;
        return this;
    }
    public String getDroppedIpListUrl() {
        return this.droppedIpListUrl;
    }

}
