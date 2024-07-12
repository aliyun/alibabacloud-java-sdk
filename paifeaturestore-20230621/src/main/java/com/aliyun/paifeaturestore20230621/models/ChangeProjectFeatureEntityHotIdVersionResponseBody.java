// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class ChangeProjectFeatureEntityHotIdVersionResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>CD377C31-372F-5CCD-ADB9-A31D6E118CA1</p>
     */
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
