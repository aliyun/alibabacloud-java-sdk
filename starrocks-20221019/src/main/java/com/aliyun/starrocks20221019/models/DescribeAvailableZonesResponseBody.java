// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starrocks20221019.models;

import com.aliyun.tea.*;

public class DescribeAvailableZonesResponseBody extends TeaModel {
    /**
     * <p>AccessDeniedDetail</p>
     * 
     * <strong>example:</strong>
     * <p>{     &quot;PolicyType&quot;: &quot;AccountLevelIdentityBasedPolicy&quot;,     &quot;AuthPrincipalOwnerId&quot;: &quot;xxx&quot;,     &quot;EncodedDiagnosticMessage&quot;: &quot;xxx&quot;,     &quot;AuthPrincipalType&quot;: &quot;xxx&quot;,     &quot;AuthPrincipalDisplayName&quot;: &quot;xxx&quot;,     &quot;NoPermissionType&quot;: &quot;ImplicitDeny&quot;,     &quot;AuthAction&quot;: &quot;sr:xxx&quot;   }</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    @NameInMap("Data")
    public DescribeAvailableZonesResponseBodyData data;

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

    public static DescribeAvailableZonesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAvailableZonesResponseBody self = new DescribeAvailableZonesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAvailableZonesResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public DescribeAvailableZonesResponseBody setData(DescribeAvailableZonesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeAvailableZonesResponseBodyData getData() {
        return this.data;
    }

    public DescribeAvailableZonesResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public DescribeAvailableZonesResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public DescribeAvailableZonesResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeAvailableZonesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAvailableZonesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeAvailableZonesResponseBodyData extends TeaModel {
        @NameInMap("OfficialAvailableZones")
        public java.util.List<String> officialAvailableZones;

        @NameInMap("TrialAvailableZones")
        public java.util.List<String> trialAvailableZones;

        public static DescribeAvailableZonesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableZonesResponseBodyData self = new DescribeAvailableZonesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableZonesResponseBodyData setOfficialAvailableZones(java.util.List<String> officialAvailableZones) {
            this.officialAvailableZones = officialAvailableZones;
            return this;
        }
        public java.util.List<String> getOfficialAvailableZones() {
            return this.officialAvailableZones;
        }

        public DescribeAvailableZonesResponseBodyData setTrialAvailableZones(java.util.List<String> trialAvailableZones) {
            this.trialAvailableZones = trialAvailableZones;
            return this;
        }
        public java.util.List<String> getTrialAvailableZones() {
            return this.trialAvailableZones;
        }

    }

}
