// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class CheckZoneNameResponseBody extends TeaModel {
    @NameInMap("Check")
    public Boolean check;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static CheckZoneNameResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckZoneNameResponseBody self = new CheckZoneNameResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckZoneNameResponseBody setCheck(Boolean check) {
        this.check = check;
        return this;
    }
    public Boolean getCheck() {
        return this.check;
    }

    public CheckZoneNameResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckZoneNameResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
