// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class AddWorksAuthorizationResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>78C1AA***************C462E57A95</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>asdasf8****sda</p>
     */
    @NameInMap("Result")
    public String result;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static AddWorksAuthorizationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddWorksAuthorizationResponseBody self = new AddWorksAuthorizationResponseBody();
        return TeaModel.build(map, self);
    }

    public AddWorksAuthorizationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddWorksAuthorizationResponseBody setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

    public AddWorksAuthorizationResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
