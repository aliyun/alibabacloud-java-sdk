// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class RestoreDdrTableResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static RestoreDdrTableResponse build(java.util.Map<String, ?> map) throws Exception {
        RestoreDdrTableResponse self = new RestoreDdrTableResponse();
        return TeaModel.build(map, self);
    }

}
