// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class CopyApplicantResponseBody extends TeaModel {
    @NameInMap("Id")
    public Long id;

    @NameInMap("RequestId")
    public String requestId;

    public static CopyApplicantResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CopyApplicantResponseBody self = new CopyApplicantResponseBody();
        return TeaModel.build(map, self);
    }

    public CopyApplicantResponseBody setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public CopyApplicantResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
