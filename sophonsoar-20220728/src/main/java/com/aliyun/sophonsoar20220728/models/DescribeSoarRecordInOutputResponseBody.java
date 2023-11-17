// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class DescribeSoarRecordInOutputResponseBody extends TeaModel {
    @NameInMap("InOutputInfo")
    public String inOutputInfo;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeSoarRecordInOutputResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSoarRecordInOutputResponseBody self = new DescribeSoarRecordInOutputResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSoarRecordInOutputResponseBody setInOutputInfo(String inOutputInfo) {
        this.inOutputInfo = inOutputInfo;
        return this;
    }
    public String getInOutputInfo() {
        return this.inOutputInfo;
    }

    public DescribeSoarRecordInOutputResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
