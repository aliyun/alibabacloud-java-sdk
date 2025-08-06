// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ListMediaLifecycleRuleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RuleList")
    public java.util.List<ListMediaLifecycleRuleResponseBodyRuleList> ruleList;

    @NameInMap("Total")
    public Long total;

    public static ListMediaLifecycleRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMediaLifecycleRuleResponseBody self = new ListMediaLifecycleRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMediaLifecycleRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListMediaLifecycleRuleResponseBody setRuleList(java.util.List<ListMediaLifecycleRuleResponseBodyRuleList> ruleList) {
        this.ruleList = ruleList;
        return this;
    }
    public java.util.List<ListMediaLifecycleRuleResponseBodyRuleList> getRuleList() {
        return this.ruleList;
    }

    public ListMediaLifecycleRuleResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class ListMediaLifecycleRuleResponseBodyRuleList extends TeaModel {
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

        public static ListMediaLifecycleRuleResponseBodyRuleList build(java.util.Map<String, ?> map) throws Exception {
            ListMediaLifecycleRuleResponseBodyRuleList self = new ListMediaLifecycleRuleResponseBodyRuleList();
            return TeaModel.build(map, self);
        }

        public ListMediaLifecycleRuleResponseBodyRuleList setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public ListMediaLifecycleRuleResponseBodyRuleList setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public ListMediaLifecycleRuleResponseBodyRuleList setModificationTime(String modificationTime) {
            this.modificationTime = modificationTime;
            return this;
        }
        public String getModificationTime() {
            return this.modificationTime;
        }

        public ListMediaLifecycleRuleResponseBodyRuleList setRuleContent(String ruleContent) {
            this.ruleContent = ruleContent;
            return this;
        }
        public String getRuleContent() {
            return this.ruleContent;
        }

        public ListMediaLifecycleRuleResponseBodyRuleList setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

        public ListMediaLifecycleRuleResponseBodyRuleList setRuleType(String ruleType) {
            this.ruleType = ruleType;
            return this;
        }
        public String getRuleType() {
            return this.ruleType;
        }

        public ListMediaLifecycleRuleResponseBodyRuleList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
