// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryMsGuardianRulePushHistorysResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("CurrentPage")
    public Long currentPage;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("StartIndex")
    public Long startIndex;

    @NameInMap("TotalSize")
    public Long totalSize;

    @NameInMap("PushHistories")
    public java.util.List<QueryMsGuardianRulePushHistorysResponseBodyPushHistories> pushHistories;

    public static QueryMsGuardianRulePushHistorysResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryMsGuardianRulePushHistorysResponseBody self = new QueryMsGuardianRulePushHistorysResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryMsGuardianRulePushHistorysResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryMsGuardianRulePushHistorysResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryMsGuardianRulePushHistorysResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryMsGuardianRulePushHistorysResponseBody setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public QueryMsGuardianRulePushHistorysResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryMsGuardianRulePushHistorysResponseBody setStartIndex(Long startIndex) {
        this.startIndex = startIndex;
        return this;
    }
    public Long getStartIndex() {
        return this.startIndex;
    }

    public QueryMsGuardianRulePushHistorysResponseBody setTotalSize(Long totalSize) {
        this.totalSize = totalSize;
        return this;
    }
    public Long getTotalSize() {
        return this.totalSize;
    }

    public QueryMsGuardianRulePushHistorysResponseBody setPushHistories(java.util.List<QueryMsGuardianRulePushHistorysResponseBodyPushHistories> pushHistories) {
        this.pushHistories = pushHistories;
        return this;
    }
    public java.util.List<QueryMsGuardianRulePushHistorysResponseBodyPushHistories> getPushHistories() {
        return this.pushHistories;
    }

    public static class QueryMsGuardianRulePushHistorysResponseBodyPushHistories extends TeaModel {
        @NameInMap("AppName")
        public String appName;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("Id")
        public Long id;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Operator")
        public String operator;

        @NameInMap("PushContent")
        public String pushContent;

        @NameInMap("RuleIds")
        public String ruleIds;

        @NameInMap("Success")
        public Boolean success;

        @NameInMap("Target")
        public String target;

        public static QueryMsGuardianRulePushHistorysResponseBodyPushHistories build(java.util.Map<String, ?> map) throws Exception {
            QueryMsGuardianRulePushHistorysResponseBodyPushHistories self = new QueryMsGuardianRulePushHistorysResponseBodyPushHistories();
            return TeaModel.build(map, self);
        }

        public QueryMsGuardianRulePushHistorysResponseBodyPushHistories setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public QueryMsGuardianRulePushHistorysResponseBodyPushHistories setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public QueryMsGuardianRulePushHistorysResponseBodyPushHistories setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryMsGuardianRulePushHistorysResponseBodyPushHistories setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public QueryMsGuardianRulePushHistorysResponseBodyPushHistories setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public QueryMsGuardianRulePushHistorysResponseBodyPushHistories setPushContent(String pushContent) {
            this.pushContent = pushContent;
            return this;
        }
        public String getPushContent() {
            return this.pushContent;
        }

        public QueryMsGuardianRulePushHistorysResponseBodyPushHistories setRuleIds(String ruleIds) {
            this.ruleIds = ruleIds;
            return this;
        }
        public String getRuleIds() {
            return this.ruleIds;
        }

        public QueryMsGuardianRulePushHistorysResponseBodyPushHistories setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public QueryMsGuardianRulePushHistorysResponseBodyPushHistories setTarget(String target) {
            this.target = target;
            return this;
        }
        public String getTarget() {
            return this.target;
        }

    }

}
