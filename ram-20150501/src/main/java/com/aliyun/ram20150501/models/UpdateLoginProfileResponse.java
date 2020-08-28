// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class UpdateLoginProfileResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static UpdateLoginProfileResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateLoginProfileResponse self = new UpdateLoginProfileResponse();
        return TeaModel.build(map, self);
    }

}
