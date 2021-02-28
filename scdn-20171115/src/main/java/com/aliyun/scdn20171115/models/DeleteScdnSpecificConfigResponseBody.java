// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scdn20171115.models;

import com.aliyun.tea.*;

public class DeleteScdnSpecificConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteScdnSpecificConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteScdnSpecificConfigResponseBody self = new DeleteScdnSpecificConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteScdnSpecificConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
