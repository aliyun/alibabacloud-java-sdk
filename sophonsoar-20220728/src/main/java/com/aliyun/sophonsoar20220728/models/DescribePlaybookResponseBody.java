// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class DescribePlaybookResponseBody extends TeaModel {
    @NameInMap("Playbook")
    public DescribePlaybookResponseBodyPlaybook playbook;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribePlaybookResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePlaybookResponseBody self = new DescribePlaybookResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePlaybookResponseBody setPlaybook(DescribePlaybookResponseBodyPlaybook playbook) {
        this.playbook = playbook;
        return this;
    }
    public DescribePlaybookResponseBodyPlaybook getPlaybook() {
        return this.playbook;
    }

    public DescribePlaybookResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribePlaybookResponseBodyPlaybook extends TeaModel {
        @NameInMap("Creator")
        public String creator;

        @NameInMap("Description")
        public String description;

        @NameInMap("DisplayName")
        public String displayName;

        @NameInMap("FailExeNum")
        public Integer failExeNum;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("InputParams")
        public String inputParams;

        @NameInMap("LastExeTime")
        public Long lastExeTime;

        @NameInMap("Modifier")
        public String modifier;

        @NameInMap("OnlineActive")
        public Boolean onlineActive;

        @NameInMap("OnlineReleaseTaskflowMd5")
        public String onlineReleaseTaskflowMd5;

        @NameInMap("OwnType")
        public String ownType;

        @NameInMap("PlaybookUuid")
        public String playbookUuid;

        @NameInMap("SuccessExeNum")
        public Integer successExeNum;

        @NameInMap("Taskflow")
        public String taskflow;

        public static DescribePlaybookResponseBodyPlaybook build(java.util.Map<String, ?> map) throws Exception {
            DescribePlaybookResponseBodyPlaybook self = new DescribePlaybookResponseBodyPlaybook();
            return TeaModel.build(map, self);
        }

        public DescribePlaybookResponseBodyPlaybook setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public DescribePlaybookResponseBodyPlaybook setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribePlaybookResponseBodyPlaybook setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public DescribePlaybookResponseBodyPlaybook setFailExeNum(Integer failExeNum) {
            this.failExeNum = failExeNum;
            return this;
        }
        public Integer getFailExeNum() {
            return this.failExeNum;
        }

        public DescribePlaybookResponseBodyPlaybook setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribePlaybookResponseBodyPlaybook setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public DescribePlaybookResponseBodyPlaybook setInputParams(String inputParams) {
            this.inputParams = inputParams;
            return this;
        }
        public String getInputParams() {
            return this.inputParams;
        }

        public DescribePlaybookResponseBodyPlaybook setLastExeTime(Long lastExeTime) {
            this.lastExeTime = lastExeTime;
            return this;
        }
        public Long getLastExeTime() {
            return this.lastExeTime;
        }

        public DescribePlaybookResponseBodyPlaybook setModifier(String modifier) {
            this.modifier = modifier;
            return this;
        }
        public String getModifier() {
            return this.modifier;
        }

        public DescribePlaybookResponseBodyPlaybook setOnlineActive(Boolean onlineActive) {
            this.onlineActive = onlineActive;
            return this;
        }
        public Boolean getOnlineActive() {
            return this.onlineActive;
        }

        public DescribePlaybookResponseBodyPlaybook setOnlineReleaseTaskflowMd5(String onlineReleaseTaskflowMd5) {
            this.onlineReleaseTaskflowMd5 = onlineReleaseTaskflowMd5;
            return this;
        }
        public String getOnlineReleaseTaskflowMd5() {
            return this.onlineReleaseTaskflowMd5;
        }

        public DescribePlaybookResponseBodyPlaybook setOwnType(String ownType) {
            this.ownType = ownType;
            return this;
        }
        public String getOwnType() {
            return this.ownType;
        }

        public DescribePlaybookResponseBodyPlaybook setPlaybookUuid(String playbookUuid) {
            this.playbookUuid = playbookUuid;
            return this;
        }
        public String getPlaybookUuid() {
            return this.playbookUuid;
        }

        public DescribePlaybookResponseBodyPlaybook setSuccessExeNum(Integer successExeNum) {
            this.successExeNum = successExeNum;
            return this;
        }
        public Integer getSuccessExeNum() {
            return this.successExeNum;
        }

        public DescribePlaybookResponseBodyPlaybook setTaskflow(String taskflow) {
            this.taskflow = taskflow;
            return this;
        }
        public String getTaskflow() {
            return this.taskflow;
        }

    }

}
