// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class UpdateTrafficMirrorFilterAttributeResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>5816D35F-94D5-48CE-838F-2327C8EE8D49</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateTrafficMirrorFilterAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateTrafficMirrorFilterAttributeResponseBody self = new UpdateTrafficMirrorFilterAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateTrafficMirrorFilterAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
