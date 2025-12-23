// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpcipam20230228.models;

import com.aliyun.tea.*;

public class AddIpamMembersResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>BB2C39DE-CEB8-595A-981A-F2EFCBE7324E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AddIpamMembersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddIpamMembersResponseBody self = new AddIpamMembersResponseBody();
        return TeaModel.build(map, self);
    }

    public AddIpamMembersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
