// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starrocks20221019.models;

import com.aliyun.tea.*;

public class GetNodeGroupFeatureGateResponseBody extends TeaModel {
    /**
     * <p>AccessDeniedDetail</p>
     * 
     * <strong>example:</strong>
     * <p>{     &quot;PolicyType&quot;: &quot;AccountLevelIdentityBasedPolicy&quot;,     &quot;AuthPrincipalOwnerId&quot;: &quot;xxx&quot;,     &quot;EncodedDiagnosticMessage&quot;: &quot;xxx&quot;,     &quot;AuthPrincipalType&quot;: &quot;xxx&quot;,     &quot;AuthPrincipalDisplayName&quot;: &quot;xxx&quot;,     &quot;NoPermissionType&quot;: &quot;ImplicitDeny&quot;,     &quot;AuthAction&quot;: &quot;sr:xxx&quot;   }</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    @NameInMap("Data")
    public GetNodeGroupFeatureGateResponseBodyData data;

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

    /**
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("Total")
    public Integer total;

    public static GetNodeGroupFeatureGateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetNodeGroupFeatureGateResponseBody self = new GetNodeGroupFeatureGateResponseBody();
        return TeaModel.build(map, self);
    }

    public GetNodeGroupFeatureGateResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public GetNodeGroupFeatureGateResponseBody setData(GetNodeGroupFeatureGateResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetNodeGroupFeatureGateResponseBodyData getData() {
        return this.data;
    }

    public GetNodeGroupFeatureGateResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public GetNodeGroupFeatureGateResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public GetNodeGroupFeatureGateResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetNodeGroupFeatureGateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetNodeGroupFeatureGateResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetNodeGroupFeatureGateResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class GetNodeGroupFeatureGateResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("NeedRestartAfterModifyDiskSize")
        public Boolean needRestartAfterModifyDiskSize;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("SupportFastModeModifyResource")
        public Boolean supportFastModeModifyResource;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("SupportFastRestart")
        public Boolean supportFastRestart;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("SupportModifySpecType")
        public Boolean supportModifySpecType;

        public static GetNodeGroupFeatureGateResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetNodeGroupFeatureGateResponseBodyData self = new GetNodeGroupFeatureGateResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetNodeGroupFeatureGateResponseBodyData setNeedRestartAfterModifyDiskSize(Boolean needRestartAfterModifyDiskSize) {
            this.needRestartAfterModifyDiskSize = needRestartAfterModifyDiskSize;
            return this;
        }
        public Boolean getNeedRestartAfterModifyDiskSize() {
            return this.needRestartAfterModifyDiskSize;
        }

        public GetNodeGroupFeatureGateResponseBodyData setSupportFastModeModifyResource(Boolean supportFastModeModifyResource) {
            this.supportFastModeModifyResource = supportFastModeModifyResource;
            return this;
        }
        public Boolean getSupportFastModeModifyResource() {
            return this.supportFastModeModifyResource;
        }

        public GetNodeGroupFeatureGateResponseBodyData setSupportFastRestart(Boolean supportFastRestart) {
            this.supportFastRestart = supportFastRestart;
            return this;
        }
        public Boolean getSupportFastRestart() {
            return this.supportFastRestart;
        }

        public GetNodeGroupFeatureGateResponseBodyData setSupportModifySpecType(Boolean supportModifySpecType) {
            this.supportModifySpecType = supportModifySpecType;
            return this;
        }
        public Boolean getSupportModifySpecType() {
            return this.supportModifySpecType;
        }

    }

}
