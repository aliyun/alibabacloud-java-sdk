// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DeleteTrafficMirrorSessionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteTrafficMirrorSessionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteTrafficMirrorSessionResponseBody self = new DeleteTrafficMirrorSessionResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteTrafficMirrorSessionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
