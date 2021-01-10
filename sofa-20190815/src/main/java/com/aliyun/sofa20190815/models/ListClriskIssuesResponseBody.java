// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListClriskIssuesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("PageCount")
    public Long pageCount;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("TotalCount")
    public Long totalCount;

    @NameInMap("IssueList")
    public java.util.List<ListClriskIssuesResponseBodyIssueList> issueList;

    public static ListClriskIssuesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListClriskIssuesResponseBody self = new ListClriskIssuesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListClriskIssuesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListClriskIssuesResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListClriskIssuesResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ListClriskIssuesResponseBody setPageCount(Long pageCount) {
        this.pageCount = pageCount;
        return this;
    }
    public Long getPageCount() {
        return this.pageCount;
    }

    public ListClriskIssuesResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListClriskIssuesResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListClriskIssuesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public ListClriskIssuesResponseBody setIssueList(java.util.List<ListClriskIssuesResponseBodyIssueList> issueList) {
        this.issueList = issueList;
        return this;
    }
    public java.util.List<ListClriskIssuesResponseBodyIssueList> getIssueList() {
        return this.issueList;
    }

    public static class ListClriskIssuesResponseBodyIssueList extends TeaModel {
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("DiffSize")
        public Long diffSize;

        @NameInMap("IssueCode")
        public String issueCode;

        @NameInMap("IssueId")
        public Long issueId;

        @NameInMap("ModelCode")
        public String modelCode;

        @NameInMap("ProcessDuration")
        public String processDuration;

        @NameInMap("RuleCode")
        public String ruleCode;

        @NameInMap("RuleName")
        public String ruleName;

        @NameInMap("SceneId")
        public String sceneId;

        @NameInMap("SceneName")
        public String sceneName;

        @NameInMap("Status")
        public String status;

        @NameInMap("TriggerMode")
        public String triggerMode;

        public static ListClriskIssuesResponseBodyIssueList build(java.util.Map<String, ?> map) throws Exception {
            ListClriskIssuesResponseBodyIssueList self = new ListClriskIssuesResponseBodyIssueList();
            return TeaModel.build(map, self);
        }

        public ListClriskIssuesResponseBodyIssueList setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListClriskIssuesResponseBodyIssueList setDiffSize(Long diffSize) {
            this.diffSize = diffSize;
            return this;
        }
        public Long getDiffSize() {
            return this.diffSize;
        }

        public ListClriskIssuesResponseBodyIssueList setIssueCode(String issueCode) {
            this.issueCode = issueCode;
            return this;
        }
        public String getIssueCode() {
            return this.issueCode;
        }

        public ListClriskIssuesResponseBodyIssueList setIssueId(Long issueId) {
            this.issueId = issueId;
            return this;
        }
        public Long getIssueId() {
            return this.issueId;
        }

        public ListClriskIssuesResponseBodyIssueList setModelCode(String modelCode) {
            this.modelCode = modelCode;
            return this;
        }
        public String getModelCode() {
            return this.modelCode;
        }

        public ListClriskIssuesResponseBodyIssueList setProcessDuration(String processDuration) {
            this.processDuration = processDuration;
            return this;
        }
        public String getProcessDuration() {
            return this.processDuration;
        }

        public ListClriskIssuesResponseBodyIssueList setRuleCode(String ruleCode) {
            this.ruleCode = ruleCode;
            return this;
        }
        public String getRuleCode() {
            return this.ruleCode;
        }

        public ListClriskIssuesResponseBodyIssueList setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public ListClriskIssuesResponseBodyIssueList setSceneId(String sceneId) {
            this.sceneId = sceneId;
            return this;
        }
        public String getSceneId() {
            return this.sceneId;
        }

        public ListClriskIssuesResponseBodyIssueList setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

        public ListClriskIssuesResponseBodyIssueList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListClriskIssuesResponseBodyIssueList setTriggerMode(String triggerMode) {
            this.triggerMode = triggerMode;
            return this;
        }
        public String getTriggerMode() {
            return this.triggerMode;
        }

    }

}
