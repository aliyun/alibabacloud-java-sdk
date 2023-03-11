// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeEmgUserAgreementResponseBody extends TeaModel {
    /**
     * <p>Indicates whether Security Center is authorized to scan for urgent vulnerabilities. Valid values:</p>
     * <br>
     * <p>*   **true**: yes</p>
     * <p>*   **false**: no</p>
     */
    @NameInMap("Auth")
    public Boolean auth;

    /**
     * <p>The ID of the request.</p>
     */
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
