// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbftestpop20210916_103600223.models;

import com.aliyun.tea.*;

public class ResolveOpenApiResponseBody extends TeaModel {
    @NameInMap("success")
    public Boolean success;

    @NameInMap("errorCode")
    public String errorCode;

    @NameInMap("errorMsg")
    public String errorMsg;

    public static ResolveOpenApiResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ResolveOpenApiResponseBody self = new ResolveOpenApiResponseBody();
        return TeaModel.build(map, self);
    }

    public ResolveOpenApiResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ResolveOpenApiResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ResolveOpenApiResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

}
