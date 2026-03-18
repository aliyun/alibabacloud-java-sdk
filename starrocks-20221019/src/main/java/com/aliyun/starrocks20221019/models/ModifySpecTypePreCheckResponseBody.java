// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starrocks20221019.models;

import com.aliyun.tea.*;

public class ModifySpecTypePreCheckResponseBody extends TeaModel {
    /**
     * <p>AccessDeniedDetail</p>
     * 
     * <strong>example:</strong>
     * <p>{     &quot;PolicyType&quot;: &quot;AccountLevelIdentityBasedPolicy&quot;,     &quot;AuthPrincipalOwnerId&quot;: &quot;xxx&quot;,     &quot;EncodedDiagnosticMessage&quot;: &quot;xxx&quot;,     &quot;AuthPrincipalType&quot;: &quot;xxx&quot;,     &quot;AuthPrincipalDisplayName&quot;: &quot;xxx&quot;,     &quot;NoPermissionType&quot;: &quot;ImplicitDeny&quot;,     &quot;AuthAction&quot;: &quot;sr:xxx&quot;   }</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    @NameInMap("Data")
    public ModifySpecTypePreCheckResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("ErrCode")
    public String errCode;

    /**
     * <strong>example:</strong>
     * <p>Invalid params: [Region id should be select from set [cn-beijing, cn-hangzhou]]</p>
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

    public static ModifySpecTypePreCheckResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifySpecTypePreCheckResponseBody self = new ModifySpecTypePreCheckResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifySpecTypePreCheckResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public ModifySpecTypePreCheckResponseBody setData(ModifySpecTypePreCheckResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ModifySpecTypePreCheckResponseBodyData getData() {
        return this.data;
    }

    public ModifySpecTypePreCheckResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public ModifySpecTypePreCheckResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public ModifySpecTypePreCheckResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ModifySpecTypePreCheckResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifySpecTypePreCheckResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ModifySpecTypePreCheckResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Allow")
        public Boolean allow;

        /**
         * <strong>example:</strong>
         * <p>Failed to find node group[ng-3d5ce6454354****].</p>
         */
        @NameInMap("Reason")
        public String reason;

        public static ModifySpecTypePreCheckResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ModifySpecTypePreCheckResponseBodyData self = new ModifySpecTypePreCheckResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ModifySpecTypePreCheckResponseBodyData setAllow(Boolean allow) {
            this.allow = allow;
            return this;
        }
        public Boolean getAllow() {
            return this.allow;
        }

        public ModifySpecTypePreCheckResponseBodyData setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

    }

}
