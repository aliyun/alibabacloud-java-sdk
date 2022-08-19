// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DeleteVpcPrefixListResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteVpcPrefixListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteVpcPrefixListResponseBody self = new DeleteVpcPrefixListResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteVpcPrefixListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
