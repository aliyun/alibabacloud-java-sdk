// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UpdateStrictEventNameResponseBody extends TeaModel {
    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>7532B7EE-7CE7-5F4D-BF04-B12447DD****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateStrictEventNameResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateStrictEventNameResponseBody self = new UpdateStrictEventNameResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateStrictEventNameResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
