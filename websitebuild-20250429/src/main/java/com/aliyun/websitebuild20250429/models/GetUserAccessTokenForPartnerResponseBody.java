// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class GetUserAccessTokenForPartnerResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("Module")
    public GetUserAccessTokenForPartnerResponseBodyModule module;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>6C6B99AC-39EC-5350-874C-204128C905E6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public String success;

    public static GetUserAccessTokenForPartnerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetUserAccessTokenForPartnerResponseBody self = new GetUserAccessTokenForPartnerResponseBody();
        return TeaModel.build(map, self);
    }

    public GetUserAccessTokenForPartnerResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetUserAccessTokenForPartnerResponseBody setModule(GetUserAccessTokenForPartnerResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public GetUserAccessTokenForPartnerResponseBodyModule getModule() {
        return this.module;
    }

    public GetUserAccessTokenForPartnerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetUserAccessTokenForPartnerResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class GetUserAccessTokenForPartnerResponseBodyModule extends TeaModel {
        @NameInMap("TokenValue")
        public String tokenValue;

        public static GetUserAccessTokenForPartnerResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            GetUserAccessTokenForPartnerResponseBodyModule self = new GetUserAccessTokenForPartnerResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public GetUserAccessTokenForPartnerResponseBodyModule setTokenValue(String tokenValue) {
            this.tokenValue = tokenValue;
            return this;
        }
        public String getTokenValue() {
            return this.tokenValue;
        }

    }

}
