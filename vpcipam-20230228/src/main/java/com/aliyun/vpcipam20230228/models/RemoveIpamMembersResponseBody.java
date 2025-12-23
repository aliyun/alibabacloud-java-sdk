// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpcipam20230228.models;

import com.aliyun.tea.*;

public class RemoveIpamMembersResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>3F814C37-B032-5477-AF5A-2925D0593CD4</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RemoveIpamMembersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RemoveIpamMembersResponseBody self = new RemoveIpamMembersResponseBody();
        return TeaModel.build(map, self);
    }

    public RemoveIpamMembersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
