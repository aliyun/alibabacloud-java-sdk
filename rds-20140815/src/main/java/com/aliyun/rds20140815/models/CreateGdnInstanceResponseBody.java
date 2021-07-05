// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CreateGdnInstanceResponseBody extends TeaModel {
    @NameInMap("GdnInstanceId")
    public Long gdnInstanceId;

    @NameInMap("GdnInstanceName")
    public String gdnInstanceName;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateGdnInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateGdnInstanceResponseBody self = new CreateGdnInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateGdnInstanceResponseBody setGdnInstanceId(Long gdnInstanceId) {
        this.gdnInstanceId = gdnInstanceId;
        return this;
    }
    public Long getGdnInstanceId() {
        return this.gdnInstanceId;
    }

    public CreateGdnInstanceResponseBody setGdnInstanceName(String gdnInstanceName) {
        this.gdnInstanceName = gdnInstanceName;
        return this;
    }
    public String getGdnInstanceName() {
        return this.gdnInstanceName;
    }

    public CreateGdnInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
