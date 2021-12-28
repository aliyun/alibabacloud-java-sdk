// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeControlPlaneLogAlertRulesResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<DescribeControlPlaneLogAlertRulesResponseBodyData> data;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeControlPlaneLogAlertRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeControlPlaneLogAlertRulesResponseBody self = new DescribeControlPlaneLogAlertRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeControlPlaneLogAlertRulesResponseBody setData(java.util.List<DescribeControlPlaneLogAlertRulesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeControlPlaneLogAlertRulesResponseBodyData> getData() {
        return this.data;
    }

    public DescribeControlPlaneLogAlertRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeControlPlaneLogAlertRulesResponseBodyDataInfo extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("Title")
        public String title;

        public static DescribeControlPlaneLogAlertRulesResponseBodyDataInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeControlPlaneLogAlertRulesResponseBodyDataInfo self = new DescribeControlPlaneLogAlertRulesResponseBodyDataInfo();
            return TeaModel.build(map, self);
        }

        public DescribeControlPlaneLogAlertRulesResponseBodyDataInfo setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeControlPlaneLogAlertRulesResponseBodyDataInfo setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class DescribeControlPlaneLogAlertRulesResponseBodyData extends TeaModel {
        @NameInMap("ActionPolicyId")
        public String actionPolicyId;

        @NameInMap("Enabled")
        public Boolean enabled;

        @NameInMap("Info")
        public DescribeControlPlaneLogAlertRulesResponseBodyDataInfo info;

        @NameInMap("RuleId")
        public String ruleId;

        public static DescribeControlPlaneLogAlertRulesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeControlPlaneLogAlertRulesResponseBodyData self = new DescribeControlPlaneLogAlertRulesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeControlPlaneLogAlertRulesResponseBodyData setActionPolicyId(String actionPolicyId) {
            this.actionPolicyId = actionPolicyId;
            return this;
        }
        public String getActionPolicyId() {
            return this.actionPolicyId;
        }

        public DescribeControlPlaneLogAlertRulesResponseBodyData setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public DescribeControlPlaneLogAlertRulesResponseBodyData setInfo(DescribeControlPlaneLogAlertRulesResponseBodyDataInfo info) {
            this.info = info;
            return this;
        }
        public DescribeControlPlaneLogAlertRulesResponseBodyDataInfo getInfo() {
            return this.info;
        }

        public DescribeControlPlaneLogAlertRulesResponseBodyData setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

    }

}
