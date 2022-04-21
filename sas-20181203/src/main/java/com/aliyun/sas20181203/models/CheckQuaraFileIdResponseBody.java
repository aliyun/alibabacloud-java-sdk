// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CheckQuaraFileIdResponseBody extends TeaModel {
    @NameInMap("Data")
    public Boolean data;

    @NameInMap("RequestId")
    public String requestId;

    public static CheckQuaraFileIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckQuaraFileIdResponseBody self = new CheckQuaraFileIdResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckQuaraFileIdResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public CheckQuaraFileIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
