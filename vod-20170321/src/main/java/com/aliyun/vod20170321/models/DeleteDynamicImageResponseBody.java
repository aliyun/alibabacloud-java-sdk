// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DeleteDynamicImageResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>0C8F0FDD-A99F-4188-B41934C97A54****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteDynamicImageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteDynamicImageResponseBody self = new DeleteDynamicImageResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteDynamicImageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
