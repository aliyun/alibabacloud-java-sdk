// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class CheckOrganizationMemberResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>D787E1A**********DF8D885</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Result")
    public Boolean result;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CheckOrganizationMemberResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckOrganizationMemberResponseBody self = new CheckOrganizationMemberResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckOrganizationMemberResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckOrganizationMemberResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

    public CheckOrganizationMemberResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
