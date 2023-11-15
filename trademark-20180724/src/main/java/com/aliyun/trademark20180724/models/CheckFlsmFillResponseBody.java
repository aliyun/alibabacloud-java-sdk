// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class CheckFlsmFillResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Tips")
    public String tips;

    public static CheckFlsmFillResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckFlsmFillResponseBody self = new CheckFlsmFillResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckFlsmFillResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckFlsmFillResponseBody setTips(String tips) {
        this.tips = tips;
        return this;
    }
    public String getTips() {
        return this.tips;
    }

}
