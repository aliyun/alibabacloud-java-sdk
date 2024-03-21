// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20190902.models;

import com.aliyun.tea.*;

public class BindApplicantResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static BindApplicantResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BindApplicantResponseBody self = new BindApplicantResponseBody();
        return TeaModel.build(map, self);
    }

    public BindApplicantResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
