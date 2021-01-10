// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class PushLDCFlowRuleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Gray")
    public Boolean gray;

    @NameInMap("RuleResultList")
    public java.util.List<PushLDCFlowRuleResponseBodyRuleResultList> ruleResultList;

    public static PushLDCFlowRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PushLDCFlowRuleResponseBody self = new PushLDCFlowRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public PushLDCFlowRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PushLDCFlowRuleResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public PushLDCFlowRuleResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public PushLDCFlowRuleResponseBody setGray(Boolean gray) {
        this.gray = gray;
        return this;
    }
    public Boolean getGray() {
        return this.gray;
    }

    public PushLDCFlowRuleResponseBody setRuleResultList(java.util.List<PushLDCFlowRuleResponseBodyRuleResultList> ruleResultList) {
        this.ruleResultList = ruleResultList;
        return this;
    }
    public java.util.List<PushLDCFlowRuleResponseBodyRuleResultList> getRuleResultList() {
        return this.ruleResultList;
    }

    public static class PushLDCFlowRuleResponseBodyRuleResultList extends TeaModel {
        @NameInMap("Desc")
        public String desc;

        @NameInMap("Name")
        public String name;

        @NameInMap("FailedList")
        public java.util.List<String> failedList;

        @NameInMap("SucceedList")
        public java.util.List<String> succeedList;

        public static PushLDCFlowRuleResponseBodyRuleResultList build(java.util.Map<String, ?> map) throws Exception {
            PushLDCFlowRuleResponseBodyRuleResultList self = new PushLDCFlowRuleResponseBodyRuleResultList();
            return TeaModel.build(map, self);
        }

        public PushLDCFlowRuleResponseBodyRuleResultList setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public PushLDCFlowRuleResponseBodyRuleResultList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public PushLDCFlowRuleResponseBodyRuleResultList setFailedList(java.util.List<String> failedList) {
            this.failedList = failedList;
            return this;
        }
        public java.util.List<String> getFailedList() {
            return this.failedList;
        }

        public PushLDCFlowRuleResponseBodyRuleResultList setSucceedList(java.util.List<String> succeedList) {
            this.succeedList = succeedList;
            return this;
        }
        public java.util.List<String> getSucceedList() {
            return this.succeedList;
        }

    }

}
