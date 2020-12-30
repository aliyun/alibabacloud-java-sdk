// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.webplus20190320.models;

import com.aliyun.tea.*;

public class DescribeChangeResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Change")
    public DescribeChangeResponseBodyChange change;

    @NameInMap("Code")
    public String code;

    public static DescribeChangeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeChangeResponseBody self = new DescribeChangeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeChangeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeChangeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeChangeResponseBody setChange(DescribeChangeResponseBodyChange change) {
        this.change = change;
        return this;
    }
    public DescribeChangeResponseBodyChange getChange() {
        return this.change;
    }

    public DescribeChangeResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public static class DescribeChangeResponseBodyChange extends TeaModel {
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

        public static DescribeChangeResponseBodyChange build(java.util.Map<String, ?> map) throws Exception {
            DescribeChangeResponseBodyChange self = new DescribeChangeResponseBodyChange();
            return TeaModel.build(map, self);
        }

        public DescribeChangeResponseBodyChange setChangePaused(Boolean changePaused) {
            this.changePaused = changePaused;
            return this;
        }
        public Boolean getChangePaused() {
            return this.changePaused;
        }

        public DescribeChangeResponseBodyChange setChangeDescription(String changeDescription) {
            this.changeDescription = changeDescription;
            return this;
        }
        public String getChangeDescription() {
            return this.changeDescription;
        }

        public DescribeChangeResponseBodyChange setFinishTime(Long finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public Long getFinishTime() {
            return this.finishTime;
        }

        public DescribeChangeResponseBodyChange setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public DescribeChangeResponseBodyChange setChangeTimedout(Boolean changeTimedout) {
            this.changeTimedout = changeTimedout;
            return this;
        }
        public Boolean getChangeTimedout() {
            return this.changeTimedout;
        }

        public DescribeChangeResponseBodyChange setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public DescribeChangeResponseBodyChange setChangeMessage(String changeMessage) {
            this.changeMessage = changeMessage;
            return this;
        }
        public String getChangeMessage() {
            return this.changeMessage;
        }

        public DescribeChangeResponseBodyChange setActionName(String actionName) {
            this.actionName = actionName;
            return this;
        }
        public String getActionName() {
            return this.actionName;
        }

        public DescribeChangeResponseBodyChange setChangeFinished(Boolean changeFinished) {
            this.changeFinished = changeFinished;
            return this;
        }
        public Boolean getChangeFinished() {
            return this.changeFinished;
        }

        public DescribeChangeResponseBodyChange setCreateUsername(String createUsername) {
            this.createUsername = createUsername;
            return this;
        }
        public String getCreateUsername() {
            return this.createUsername;
        }

        public DescribeChangeResponseBodyChange setChangeId(String changeId) {
            this.changeId = changeId;
            return this;
        }
        public String getChangeId() {
            return this.changeId;
        }

        public DescribeChangeResponseBodyChange setChangeAborted(Boolean changeAborted) {
            this.changeAborted = changeAborted;
            return this;
        }
        public Boolean getChangeAborted() {
            return this.changeAborted;
        }

        public DescribeChangeResponseBodyChange setChangeSucceed(Boolean changeSucceed) {
            this.changeSucceed = changeSucceed;
            return this;
        }
        public Boolean getChangeSucceed() {
            return this.changeSucceed;
        }

        public DescribeChangeResponseBodyChange setEnvId(String envId) {
            this.envId = envId;
            return this;
        }
        public String getEnvId() {
            return this.envId;
        }

        public DescribeChangeResponseBodyChange setChangeName(String changeName) {
            this.changeName = changeName;
            return this;
        }
        public String getChangeName() {
            return this.changeName;
        }

    }

}
