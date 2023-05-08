// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeEmgUserAgreementResponseBody extends TeaModel {
    @NameInMap("Auth")
    public Boolean auth;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeEmgUserAgreementResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeEmgUserAgreementResponseBody self = new DescribeEmgUserAgreementResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeEmgUserAgreementResponseBody setAuth(Boolean auth) {
        this.auth = auth;
        return this;
    }
    public Boolean getAuth() {
        return this.auth;
    }

    public DescribeEmgUserAgreementResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
