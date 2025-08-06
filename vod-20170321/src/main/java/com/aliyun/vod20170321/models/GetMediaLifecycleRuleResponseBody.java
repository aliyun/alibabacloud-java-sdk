// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetMediaLifecycleRuleResponseBody extends TeaModel {
    @NameInMap("ForbiddenRuleIds")
    public java.util.List<String> forbiddenRuleIds;

    @NameInMap("NonExistRuleIds")
    public java.util.List<String> nonExistRuleIds;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RuleList")
    public java.util.List<GetMediaLifecycleRuleResponseBodyRuleList> ruleList;

    public static GetMediaLifecycleRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMediaLifecycleRuleResponseBody self = new GetMediaLifecycleRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMediaLifecycleRuleResponseBody setForbiddenRuleIds(java.util.List<String> forbiddenRuleIds) {
        this.forbiddenRuleIds = forbiddenRuleIds;
        return this;
    }
    public java.util.List<String> getForbiddenRuleIds() {
        return this.forbiddenRuleIds;
    }

    public GetMediaLifecycleRuleResponseBody setNonExistRuleIds(java.util.List<String> nonExistRuleIds) {
        this.nonExistRuleIds = nonExistRuleIds;
        return this;
    }
    public java.util.List<String> getNonExistRuleIds() {
        return this.nonExistRuleIds;
    }

    public GetMediaLifecycleRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMediaLifecycleRuleResponseBody setRuleList(java.util.List<GetMediaLifecycleRuleResponseBodyRuleList> ruleList) {
        this.ruleList = ruleList;
        return this;
    }
    public java.util.List<GetMediaLifecycleRuleResponseBodyRuleList> getRuleList() {
        return this.ruleList;
    }

    public static class GetMediaLifecycleRuleResponseBodyRuleList extends TeaModel {
        @NameInMap("AppId")
        public String appId;

        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("ModificationTime")
        public String modificationTime;

        @NameInMap("RuleContent")
        public String ruleContent;

        @NameInMap("RuleId")
        public String ruleId;

        @NameInMap("RuleType")
        public String ruleType;

        @NameInMap("Status")
        public String status;

        public static GetMediaLifecycleRuleResponseBodyRuleList build(java.util.Map<String, ?> map) throws Exception {
            GetMediaLifecycleRuleResponseBodyRuleList self = new GetMediaLifecycleRuleResponseBodyRuleList();
            return TeaModel.build(map, self);
        }

        public GetMediaLifecycleRuleResponseBodyRuleList setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public GetMediaLifecycleRuleResponseBodyRuleList setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public GetMediaLifecycleRuleResponseBodyRuleList setModificationTime(String modificationTime) {
            this.modificationTime = modificationTime;
            return this;
        }
        public String getModificationTime() {
            return this.modificationTime;
        }

        public GetMediaLifecycleRuleResponseBodyRuleList setRuleContent(String ruleContent) {
            this.ruleContent = ruleContent;
            return this;
        }
        public String getRuleContent() {
            return this.ruleContent;
        }

        public GetMediaLifecycleRuleResponseBodyRuleList setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

        public GetMediaLifecycleRuleResponseBodyRuleList setRuleType(String ruleType) {
            this.ruleType = ruleType;
            return this;
        }
        public String getRuleType() {
            return this.ruleType;
        }

        public GetMediaLifecycleRuleResponseBodyRuleList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
