// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starrocks20221019.models;

import com.aliyun.tea.*;

public class DescribeBackupPoliciesResponseBody extends TeaModel {
    /**
     * <p>AccessDeniedDetail</p>
     * 
     * <strong>example:</strong>
     * <p>{     &quot;PolicyType&quot;: &quot;AccountLevelIdentityBasedPolicy&quot;,     &quot;AuthPrincipalOwnerId&quot;: &quot;xxx&quot;,     &quot;EncodedDiagnosticMessage&quot;: &quot;xxx&quot;,     &quot;AuthPrincipalType&quot;: &quot;xxx&quot;,     &quot;AuthPrincipalDisplayName&quot;: &quot;xxx&quot;,     &quot;NoPermissionType&quot;: &quot;ImplicitDeny&quot;,     &quot;AuthAction&quot;: &quot;sr:xxx&quot;   }</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    @NameInMap("Data")
    public java.util.List<DescribeBackupPoliciesResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>InvalidParams</p>
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

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("Total")
    public Integer total;

    public static DescribeBackupPoliciesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackupPoliciesResponseBody self = new DescribeBackupPoliciesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBackupPoliciesResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public DescribeBackupPoliciesResponseBody setData(java.util.List<DescribeBackupPoliciesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeBackupPoliciesResponseBodyData> getData() {
        return this.data;
    }

    public DescribeBackupPoliciesResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public DescribeBackupPoliciesResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public DescribeBackupPoliciesResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeBackupPoliciesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeBackupPoliciesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeBackupPoliciesResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class DescribeBackupPoliciesResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>7</p>
         */
        @NameInMap("ExpireDays")
        public Integer expireDays;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Hour")
        public String hour;

        /**
         * <strong>example:</strong>
         * <p>c-96f3bc7f04b2****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("Minute")
        public String minute;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PolicyId")
        public String policyId;

        @NameInMap("RecurrenceValues")
        public java.util.List<Integer> recurrenceValues;

        /**
         * <strong>example:</strong>
         * <p>3600</p>
         */
        @NameInMap("TimeoutSeconds")
        public Integer timeoutSeconds;

        public static DescribeBackupPoliciesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackupPoliciesResponseBodyData self = new DescribeBackupPoliciesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeBackupPoliciesResponseBodyData setExpireDays(Integer expireDays) {
            this.expireDays = expireDays;
            return this;
        }
        public Integer getExpireDays() {
            return this.expireDays;
        }

        public DescribeBackupPoliciesResponseBodyData setHour(String hour) {
            this.hour = hour;
            return this;
        }
        public String getHour() {
            return this.hour;
        }

        public DescribeBackupPoliciesResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeBackupPoliciesResponseBodyData setMinute(String minute) {
            this.minute = minute;
            return this;
        }
        public String getMinute() {
            return this.minute;
        }

        public DescribeBackupPoliciesResponseBodyData setPolicyId(String policyId) {
            this.policyId = policyId;
            return this;
        }
        public String getPolicyId() {
            return this.policyId;
        }

        public DescribeBackupPoliciesResponseBodyData setRecurrenceValues(java.util.List<Integer> recurrenceValues) {
            this.recurrenceValues = recurrenceValues;
            return this;
        }
        public java.util.List<Integer> getRecurrenceValues() {
            return this.recurrenceValues;
        }

        public DescribeBackupPoliciesResponseBodyData setTimeoutSeconds(Integer timeoutSeconds) {
            this.timeoutSeconds = timeoutSeconds;
            return this;
        }
        public Integer getTimeoutSeconds() {
            return this.timeoutSeconds;
        }

    }

}
