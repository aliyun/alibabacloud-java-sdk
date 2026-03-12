// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starrocks20221019.models;

import com.aliyun.tea.*;

public class DescribeConfigHistoryResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>{     &quot;PolicyType&quot;: &quot;AccountLevelIdentityBasedPolicy&quot;,     &quot;AuthPrincipalOwnerId&quot;: &quot;xxx&quot;,     &quot;EncodedDiagnosticMessage&quot;: &quot;xxx&quot;,     &quot;AuthPrincipalType&quot;: &quot;xxx&quot;,     &quot;AuthPrincipalDisplayName&quot;: &quot;xxx&quot;,     &quot;NoPermissionType&quot;: &quot;ImplicitDeny&quot;,     &quot;AuthAction&quot;: &quot;sr:xxx&quot;   }</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    @NameInMap("Data")
    public java.util.List<DescribeConfigHistoryResponseBodyData> data;

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

    public static DescribeConfigHistoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeConfigHistoryResponseBody self = new DescribeConfigHistoryResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeConfigHistoryResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public DescribeConfigHistoryResponseBody setData(java.util.List<DescribeConfigHistoryResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeConfigHistoryResponseBodyData> getData() {
        return this.data;
    }

    public DescribeConfigHistoryResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public DescribeConfigHistoryResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public DescribeConfigHistoryResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeConfigHistoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeConfigHistoryResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeConfigHistoryResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class DescribeConfigHistoryResponseBodyDataConfigHistoryEffectDetails extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>effective</p>
         */
        @NameInMap("EffectStatus")
        public String effectStatus;

        /**
         * <strong>example:</strong>
         * <p>ng-e6e15d2cdefdb38c</p>
         */
        @NameInMap("NodeGroupId")
        public String nodeGroupId;

        /**
         * <strong>example:</strong>
         * <p>10000367486</p>
         */
        @NameInMap("NodeId")
        public String nodeId;

        public static DescribeConfigHistoryResponseBodyDataConfigHistoryEffectDetails build(java.util.Map<String, ?> map) throws Exception {
            DescribeConfigHistoryResponseBodyDataConfigHistoryEffectDetails self = new DescribeConfigHistoryResponseBodyDataConfigHistoryEffectDetails();
            return TeaModel.build(map, self);
        }

        public DescribeConfigHistoryResponseBodyDataConfigHistoryEffectDetails setEffectStatus(String effectStatus) {
            this.effectStatus = effectStatus;
            return this;
        }
        public String getEffectStatus() {
            return this.effectStatus;
        }

        public DescribeConfigHistoryResponseBodyDataConfigHistoryEffectDetails setNodeGroupId(String nodeGroupId) {
            this.nodeGroupId = nodeGroupId;
            return this;
        }
        public String getNodeGroupId() {
            return this.nodeGroupId;
        }

        public DescribeConfigHistoryResponseBodyDataConfigHistoryEffectDetails setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

    }

    public static class DescribeConfigHistoryResponseBodyDataConfigMementos extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>MODIFY</p>
         */
        @NameInMap("Action")
        public String action;

        /**
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("After")
        public String after;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Before")
        public String before;

        /**
         * <strong>example:</strong>
         * <p>create_tablet_worker_count</p>
         */
        @NameInMap("ConfigKey")
        public String configKey;

        /**
         * <strong>example:</strong>
         * <p>FE</p>
         */
        @NameInMap("ConfigType")
        public String configType;

        public static DescribeConfigHistoryResponseBodyDataConfigMementos build(java.util.Map<String, ?> map) throws Exception {
            DescribeConfigHistoryResponseBodyDataConfigMementos self = new DescribeConfigHistoryResponseBodyDataConfigMementos();
            return TeaModel.build(map, self);
        }

        public DescribeConfigHistoryResponseBodyDataConfigMementos setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public DescribeConfigHistoryResponseBodyDataConfigMementos setAfter(String after) {
            this.after = after;
            return this;
        }
        public String getAfter() {
            return this.after;
        }

        public DescribeConfigHistoryResponseBodyDataConfigMementos setBefore(String before) {
            this.before = before;
            return this;
        }
        public String getBefore() {
            return this.before;
        }

        public DescribeConfigHistoryResponseBodyDataConfigMementos setConfigKey(String configKey) {
            this.configKey = configKey;
            return this;
        }
        public String getConfigKey() {
            return this.configKey;
        }

        public DescribeConfigHistoryResponseBodyDataConfigMementos setConfigType(String configType) {
            this.configType = configType;
            return this;
        }
        public String getConfigType() {
            return this.configType;
        }

    }

    public static class DescribeConfigHistoryResponseBodyData extends TeaModel {
        @NameInMap("ConfigHistoryEffectDetails")
        public java.util.List<DescribeConfigHistoryResponseBodyDataConfigHistoryEffectDetails> configHistoryEffectDetails;

        /**
         * <strong>example:</strong>
         * <p>6838</p>
         */
        @NameInMap("ConfigHistoryId")
        public String configHistoryId;

        @NameInMap("ConfigMementos")
        public java.util.List<DescribeConfigHistoryResponseBodyDataConfigMementos> configMementos;

        /**
         * <strong>example:</strong>
         * <p>effective</p>
         */
        @NameInMap("EffectStatus")
        public String effectStatus;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Effected")
        public Boolean effected;

        /**
         * <strong>example:</strong>
         * <p>1742178604000</p>
         */
        @NameInMap("GmtCreate")
        public Long gmtCreate;

        /**
         * <strong>example:</strong>
         * <p>149920818483****</p>
         */
        @NameInMap("OperatorId")
        public String operatorId;

        /**
         * <strong>example:</strong>
         * <p>Test.</p>
         */
        @NameInMap("Reason")
        public String reason;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Rollback")
        public Boolean rollback;

        public static DescribeConfigHistoryResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeConfigHistoryResponseBodyData self = new DescribeConfigHistoryResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeConfigHistoryResponseBodyData setConfigHistoryEffectDetails(java.util.List<DescribeConfigHistoryResponseBodyDataConfigHistoryEffectDetails> configHistoryEffectDetails) {
            this.configHistoryEffectDetails = configHistoryEffectDetails;
            return this;
        }
        public java.util.List<DescribeConfigHistoryResponseBodyDataConfigHistoryEffectDetails> getConfigHistoryEffectDetails() {
            return this.configHistoryEffectDetails;
        }

        public DescribeConfigHistoryResponseBodyData setConfigHistoryId(String configHistoryId) {
            this.configHistoryId = configHistoryId;
            return this;
        }
        public String getConfigHistoryId() {
            return this.configHistoryId;
        }

        public DescribeConfigHistoryResponseBodyData setConfigMementos(java.util.List<DescribeConfigHistoryResponseBodyDataConfigMementos> configMementos) {
            this.configMementos = configMementos;
            return this;
        }
        public java.util.List<DescribeConfigHistoryResponseBodyDataConfigMementos> getConfigMementos() {
            return this.configMementos;
        }

        public DescribeConfigHistoryResponseBodyData setEffectStatus(String effectStatus) {
            this.effectStatus = effectStatus;
            return this;
        }
        public String getEffectStatus() {
            return this.effectStatus;
        }

        public DescribeConfigHistoryResponseBodyData setEffected(Boolean effected) {
            this.effected = effected;
            return this;
        }
        public Boolean getEffected() {
            return this.effected;
        }

        public DescribeConfigHistoryResponseBodyData setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeConfigHistoryResponseBodyData setOperatorId(String operatorId) {
            this.operatorId = operatorId;
            return this;
        }
        public String getOperatorId() {
            return this.operatorId;
        }

        public DescribeConfigHistoryResponseBodyData setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public DescribeConfigHistoryResponseBodyData setRollback(Boolean rollback) {
            this.rollback = rollback;
            return this;
        }
        public Boolean getRollback() {
            return this.rollback;
        }

    }

}
