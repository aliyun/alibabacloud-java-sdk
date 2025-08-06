// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class CreateDNADBResponseBody extends TeaModel {
    @NameInMap("DBId")
    public String DBId;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateDNADBResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDNADBResponseBody self = new CreateDNADBResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDNADBResponseBody setDBId(String DBId) {
        this.DBId = DBId;
        return this;
    }
    public String getDBId() {
        return this.DBId;
    }

    public CreateDNADBResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
