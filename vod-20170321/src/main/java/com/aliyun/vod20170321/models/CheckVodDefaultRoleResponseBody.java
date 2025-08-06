// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class CheckVodDefaultRoleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static CheckVodDefaultRoleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckVodDefaultRoleResponseBody self = new CheckVodDefaultRoleResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckVodDefaultRoleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckVodDefaultRoleResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
