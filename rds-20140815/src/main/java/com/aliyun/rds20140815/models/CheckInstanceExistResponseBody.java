// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CheckInstanceExistResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("IsExistInstance")
    public Boolean isExistInstance;

    public static CheckInstanceExistResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckInstanceExistResponseBody self = new CheckInstanceExistResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckInstanceExistResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckInstanceExistResponseBody setIsExistInstance(Boolean isExistInstance) {
        this.isExistInstance = isExistInstance;
        return this;
    }
    public Boolean getIsExistInstance() {
        return this.isExistInstance;
    }

}
