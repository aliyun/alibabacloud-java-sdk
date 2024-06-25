// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpcipam20230228.models;

import com.aliyun.tea.*;

public class UpdateIpamPoolResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>9DED57B9-7654-5B6D-93F7-BCA5839FEE38</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateIpamPoolResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateIpamPoolResponseBody self = new UpdateIpamPoolResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateIpamPoolResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
