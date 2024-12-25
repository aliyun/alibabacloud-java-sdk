// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class DeleteAccessControlListResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>988CB45E-1643-48C0-87B4-928DDF77EA49</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteAccessControlListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteAccessControlListResponseBody self = new DeleteAccessControlListResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteAccessControlListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
