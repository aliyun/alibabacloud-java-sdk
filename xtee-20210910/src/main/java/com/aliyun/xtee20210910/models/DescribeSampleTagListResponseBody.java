// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeSampleTagListResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("resultObject")
    public Boolean resultObject;

    public static DescribeSampleTagListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSampleTagListResponseBody self = new DescribeSampleTagListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSampleTagListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSampleTagListResponseBody setResultObject(Boolean resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public Boolean getResultObject() {
        return this.resultObject;
    }

}
