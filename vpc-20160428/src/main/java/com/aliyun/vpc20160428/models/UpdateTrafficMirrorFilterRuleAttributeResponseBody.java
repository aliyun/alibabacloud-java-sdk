// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class UpdateTrafficMirrorFilterRuleAttributeResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>02EB8585-D4DC-4E29-A0F4-7C588C82863C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateTrafficMirrorFilterRuleAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateTrafficMirrorFilterRuleAttributeResponseBody self = new UpdateTrafficMirrorFilterRuleAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateTrafficMirrorFilterRuleAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
