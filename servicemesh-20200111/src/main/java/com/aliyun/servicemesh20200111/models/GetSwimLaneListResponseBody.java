// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class GetSwimLaneListResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SwimLaneList")
    public java.util.List<String> swimLaneList;

    public static GetSwimLaneListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSwimLaneListResponseBody self = new GetSwimLaneListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSwimLaneListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSwimLaneListResponseBody setSwimLaneList(java.util.List<String> swimLaneList) {
        this.swimLaneList = swimLaneList;
        return this;
    }
    public java.util.List<String> getSwimLaneList() {
        return this.swimLaneList;
    }

}
