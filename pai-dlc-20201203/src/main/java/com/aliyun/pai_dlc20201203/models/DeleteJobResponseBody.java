// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class DeleteJobResponseBody extends TeaModel {
    @NameInMap("HttpCode")
    public String httpCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public String data;

    public static DeleteJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteJobResponseBody self = new DeleteJobResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteJobResponseBody setHttpCode(String httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public String getHttpCode() {
        return this.httpCode;
    }

    public DeleteJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteJobResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

}
