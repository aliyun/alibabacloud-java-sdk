// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddMSDdcsDataResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static AddMSDdcsDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddMSDdcsDataResponseBody self = new AddMSDdcsDataResponseBody();
        return TeaModel.build(map, self);
    }

    public AddMSDdcsDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
