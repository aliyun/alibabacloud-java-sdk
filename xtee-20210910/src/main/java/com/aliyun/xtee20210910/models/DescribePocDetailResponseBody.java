// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribePocDetailResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("resultObject")
    public Boolean resultObject;

    public static DescribePocDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePocDetailResponseBody self = new DescribePocDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePocDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePocDetailResponseBody setResultObject(Boolean resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public Boolean getResultObject() {
        return this.resultObject;
    }

}
