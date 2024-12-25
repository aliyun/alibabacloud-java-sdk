// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class RemoveAccessControlListEntryResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>988CB45E-1643-48C0-87B4-928DDF77EA49</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RemoveAccessControlListEntryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RemoveAccessControlListEntryResponseBody self = new RemoveAccessControlListEntryResponseBody();
        return TeaModel.build(map, self);
    }

    public RemoveAccessControlListEntryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
