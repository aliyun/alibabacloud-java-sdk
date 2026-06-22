// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeEmgUserAgreementResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the emergency vulnerability scan is authorized. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Authorized.</li>
     * <li><strong>false</strong>: Not authorized.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Auth")
    public Boolean auth;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>768BB9F5-8AF3-557F-A489-9BDD64CB3E4C</p>
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
