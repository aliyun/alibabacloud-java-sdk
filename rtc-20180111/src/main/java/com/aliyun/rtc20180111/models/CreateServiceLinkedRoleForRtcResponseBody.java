// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class CreateServiceLinkedRoleForRtcResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static CreateServiceLinkedRoleForRtcResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateServiceLinkedRoleForRtcResponseBody self = new CreateServiceLinkedRoleForRtcResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateServiceLinkedRoleForRtcResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
