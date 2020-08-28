// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class CreateAuditResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static CreateAuditResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAuditResponse self = new CreateAuditResponse();
        return TeaModel.build(map, self);
    }

}
