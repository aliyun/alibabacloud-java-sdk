// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CheckInstanceExistResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("IsExistInstance")
    @Validation(required = true)
    public Boolean isExistInstance;

    public static CheckInstanceExistResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckInstanceExistResponse self = new CheckInstanceExistResponse();
        return TeaModel.build(map, self);
    }

}
