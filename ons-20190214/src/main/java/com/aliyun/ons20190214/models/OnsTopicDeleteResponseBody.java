// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsTopicDeleteResponseBody extends TeaModel {
    /**
     * <p>The ID of the request. This parameter is a common parameter. Each request has a unique ID. You can use this ID to troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>4189D4A6-231A-4028-8D89-F66A76C1****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static OnsTopicDeleteResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OnsTopicDeleteResponseBody self = new OnsTopicDeleteResponseBody();
        return TeaModel.build(map, self);
    }

    public OnsTopicDeleteResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
