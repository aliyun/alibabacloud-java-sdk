// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLDCFlowRecordResponseBody extends TeaModel {
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

    @NameInMap("TotalCount")
    public Long totalCount;

    @NameInMap("Data")
    public java.util.List<QueryLDCFlowRecordResponseBodyData> data;

    public static QueryLDCFlowRecordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryLDCFlowRecordResponseBody self = new QueryLDCFlowRecordResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryLDCFlowRecordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryLDCFlowRecordResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryLDCFlowRecordResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryLDCFlowRecordResponseBody setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public QueryLDCFlowRecordResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryLDCFlowRecordResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public QueryLDCFlowRecordResponseBody setData(java.util.List<QueryLDCFlowRecordResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryLDCFlowRecordResponseBodyData> getData() {
        return this.data;
    }

    public static class QueryLDCFlowRecordResponseBodyData extends TeaModel {
        @NameInMap("Operator")
        public String operator;

        @NameInMap("PushTime")
        public String pushTime;

        @NameInMap("ResultCode")
        public String resultCode;

        @NameInMap("ResultMsg")
        public String resultMsg;

        @NameInMap("RuleType")
        public String ruleType;

        @NameInMap("Value")
        public String value;

        @NameInMap("Apps")
        public java.util.List<String> apps;

        @NameInMap("Targets")
        public java.util.List<String> targets;

        public static QueryLDCFlowRecordResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryLDCFlowRecordResponseBodyData self = new QueryLDCFlowRecordResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryLDCFlowRecordResponseBodyData setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public QueryLDCFlowRecordResponseBodyData setPushTime(String pushTime) {
            this.pushTime = pushTime;
            return this;
        }
        public String getPushTime() {
            return this.pushTime;
        }

        public QueryLDCFlowRecordResponseBodyData setResultCode(String resultCode) {
            this.resultCode = resultCode;
            return this;
        }
        public String getResultCode() {
            return this.resultCode;
        }

        public QueryLDCFlowRecordResponseBodyData setResultMsg(String resultMsg) {
            this.resultMsg = resultMsg;
            return this;
        }
        public String getResultMsg() {
            return this.resultMsg;
        }

        public QueryLDCFlowRecordResponseBodyData setRuleType(String ruleType) {
            this.ruleType = ruleType;
            return this;
        }
        public String getRuleType() {
            return this.ruleType;
        }

        public QueryLDCFlowRecordResponseBodyData setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public QueryLDCFlowRecordResponseBodyData setApps(java.util.List<String> apps) {
            this.apps = apps;
            return this;
        }
        public java.util.List<String> getApps() {
            return this.apps;
        }

        public QueryLDCFlowRecordResponseBodyData setTargets(java.util.List<String> targets) {
            this.targets = targets;
            return this;
        }
        public java.util.List<String> getTargets() {
            return this.targets;
        }

    }

}
