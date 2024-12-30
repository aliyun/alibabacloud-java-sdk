// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starrocks20221019.models;

import com.aliyun.tea.*;

public class ModifyNodeNumberPreCheckResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>{     &quot;PolicyType&quot;: &quot;AccountLevelIdentityBasedPolicy&quot;,     &quot;AuthPrincipalOwnerId&quot;: &quot;xxx&quot;,     &quot;EncodedDiagnosticMessage&quot;: &quot;xxx&quot;,     &quot;AuthPrincipalType&quot;: &quot;xxx&quot;,     &quot;AuthPrincipalDisplayName&quot;: &quot;xxx&quot;,     &quot;NoPermissionType&quot;: &quot;ImplicitDeny&quot;,     &quot;AuthAction&quot;: &quot;sr:xxx&quot;   }</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    @NameInMap("Data")
    public ModifyNodeNumberPreCheckResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>InvalidParams</p>
     */
    @NameInMap("ErrCode")
    public String errCode;

    /**
     * <strong>example:</strong>
     * <p>Invalid params: [instance not exists].</p>
     */
    @NameInMap("ErrMessage")
    public String errMessage;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>32A44F0D-BFF6-5664-999A-218BBDE7****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ModifyNodeNumberPreCheckResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyNodeNumberPreCheckResponseBody self = new ModifyNodeNumberPreCheckResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyNodeNumberPreCheckResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public ModifyNodeNumberPreCheckResponseBody setData(ModifyNodeNumberPreCheckResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ModifyNodeNumberPreCheckResponseBodyData getData() {
        return this.data;
    }

    public ModifyNodeNumberPreCheckResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public ModifyNodeNumberPreCheckResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public ModifyNodeNumberPreCheckResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ModifyNodeNumberPreCheckResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyNodeNumberPreCheckResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ModifyNodeNumberPreCheckResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Allow")
        public Boolean allow;

        /**
         * <strong>example:</strong>
         * <p>Failed to find node group[ng-3d5ce6454354****].</p>
         */
        @NameInMap("Reason")
        public String reason;

        public static ModifyNodeNumberPreCheckResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ModifyNodeNumberPreCheckResponseBodyData self = new ModifyNodeNumberPreCheckResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ModifyNodeNumberPreCheckResponseBodyData setAllow(Boolean allow) {
            this.allow = allow;
            return this;
        }
        public Boolean getAllow() {
            return this.allow;
        }

        public ModifyNodeNumberPreCheckResponseBodyData setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

    }

}
