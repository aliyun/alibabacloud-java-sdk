// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class AddSourcesToTrafficMirrorSessionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static AddSourcesToTrafficMirrorSessionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddSourcesToTrafficMirrorSessionResponseBody self = new AddSourcesToTrafficMirrorSessionResponseBody();
        return TeaModel.build(map, self);
    }

    public AddSourcesToTrafficMirrorSessionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
