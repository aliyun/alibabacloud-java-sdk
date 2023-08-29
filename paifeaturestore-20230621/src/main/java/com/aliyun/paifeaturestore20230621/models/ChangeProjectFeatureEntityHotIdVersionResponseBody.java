// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class ChangeProjectFeatureEntityHotIdVersionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ChangeProjectFeatureEntityHotIdVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ChangeProjectFeatureEntityHotIdVersionResponseBody self = new ChangeProjectFeatureEntityHotIdVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public ChangeProjectFeatureEntityHotIdVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
