// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.webplus20190320.models;

import com.aliyun.tea.*;

public class DescribeChangesResponseBody extends TeaModel {
    @NameInMap("Changes")
    public DescribeChangesResponseBodyChanges changes;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Message")
    public String message;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("Code")
    public String code;

    public static DescribeChangesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeChangesResponseBody self = new DescribeChangesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeChangesResponseBody setChanges(DescribeChangesResponseBodyChanges changes) {
        this.changes = changes;
        return this;
    }
    public DescribeChangesResponseBodyChanges getChanges() {
        return this.changes;
    }

    public DescribeChangesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeChangesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeChangesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeChangesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeChangesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeChangesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public static class DescribeChangesResponseBodyChangesChange extends TeaModel {
        @NameInMap("ChangePaused")
        public Boolean changePaused;

        @NameInMap("ChangeDescription")
        public String changeDescription;

        @NameInMap("FinishTime")
        public Long finishTime;

        @NameInMap("UpdateTime")
        public Long updateTime;

        @NameInMap("ChangeTimedout")
        public Boolean changeTimedout;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("ChangeMessage")
        public String changeMessage;

        @NameInMap("ActionName")
        public String actionName;

        @NameInMap("ChangeFinished")
        public Boolean changeFinished;

        @NameInMap("CreateUsername")
        public String createUsername;

        @NameInMap("ChangeId")
        public String changeId;

        @NameInMap("ChangeAborted")
        public Boolean changeAborted;

        @NameInMap("ChangeSucceed")
        public Boolean changeSucceed;

        @NameInMap("EnvId")
        public String envId;

        @NameInMap("ChangeName")
        public String changeName;

        public static DescribeChangesResponseBodyChangesChange build(java.util.Map<String, ?> map) throws Exception {
            DescribeChangesResponseBodyChangesChange self = new DescribeChangesResponseBodyChangesChange();
            return TeaModel.build(map, self);
        }

        public DescribeChangesResponseBodyChangesChange setChangePaused(Boolean changePaused) {
            this.changePaused = changePaused;
            return this;
        }
        public Boolean getChangePaused() {
            return this.changePaused;
        }

        public DescribeChangesResponseBodyChangesChange setChangeDescription(String changeDescription) {
            this.changeDescription = changeDescription;
            return this;
        }
        public String getChangeDescription() {
            return this.changeDescription;
        }

        public DescribeChangesResponseBodyChangesChange setFinishTime(Long finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public Long getFinishTime() {
            return this.finishTime;
        }

        public DescribeChangesResponseBodyChangesChange setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public DescribeChangesResponseBodyChangesChange setChangeTimedout(Boolean changeTimedout) {
            this.changeTimedout = changeTimedout;
            return this;
        }
        public Boolean getChangeTimedout() {
            return this.changeTimedout;
        }

        public DescribeChangesResponseBodyChangesChange setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public DescribeChangesResponseBodyChangesChange setChangeMessage(String changeMessage) {
            this.changeMessage = changeMessage;
            return this;
        }
        public String getChangeMessage() {
            return this.changeMessage;
        }

        public DescribeChangesResponseBodyChangesChange setActionName(String actionName) {
            this.actionName = actionName;
            return this;
        }
        public String getActionName() {
            return this.actionName;
        }

        public DescribeChangesResponseBodyChangesChange setChangeFinished(Boolean changeFinished) {
            this.changeFinished = changeFinished;
            return this;
        }
        public Boolean getChangeFinished() {
            return this.changeFinished;
        }

        public DescribeChangesResponseBodyChangesChange setCreateUsername(String createUsername) {
            this.createUsername = createUsername;
            return this;
        }
        public String getCreateUsername() {
            return this.createUsername;
        }

        public DescribeChangesResponseBodyChangesChange setChangeId(String changeId) {
            this.changeId = changeId;
            return this;
        }
        public String getChangeId() {
            return this.changeId;
        }

        public DescribeChangesResponseBodyChangesChange setChangeAborted(Boolean changeAborted) {
            this.changeAborted = changeAborted;
            return this;
        }
        public Boolean getChangeAborted() {
            return this.changeAborted;
        }

        public DescribeChangesResponseBodyChangesChange setChangeSucceed(Boolean changeSucceed) {
            this.changeSucceed = changeSucceed;
            return this;
        }
        public Boolean getChangeSucceed() {
            return this.changeSucceed;
        }

        public DescribeChangesResponseBodyChangesChange setEnvId(String envId) {
            this.envId = envId;
            return this;
        }
        public String getEnvId() {
            return this.envId;
        }

        public DescribeChangesResponseBodyChangesChange setChangeName(String changeName) {
            this.changeName = changeName;
            return this;
        }
        public String getChangeName() {
            return this.changeName;
        }

    }

    public static class DescribeChangesResponseBodyChanges extends TeaModel {
        @NameInMap("Change")
        public java.util.List<DescribeChangesResponseBodyChangesChange> change;

        public static DescribeChangesResponseBodyChanges build(java.util.Map<String, ?> map) throws Exception {
            DescribeChangesResponseBodyChanges self = new DescribeChangesResponseBodyChanges();
            return TeaModel.build(map, self);
        }

        public DescribeChangesResponseBodyChanges setChange(java.util.List<DescribeChangesResponseBodyChangesChange> change) {
            this.change = change;
            return this;
        }
        public java.util.List<DescribeChangesResponseBodyChangesChange> getChange() {
            return this.change;
        }

    }

}
