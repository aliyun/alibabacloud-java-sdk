// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeSafConsoleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("bizData")
    public java.util.List<String> bizData;

    public static DescribeSafConsoleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSafConsoleResponseBody self = new DescribeSafConsoleResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSafConsoleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSafConsoleResponseBody setBizData(java.util.List<String> bizData) {
        this.bizData = bizData;
        return this;
    }
    public java.util.List<String> getBizData() {
        return this.bizData;
    }

}
