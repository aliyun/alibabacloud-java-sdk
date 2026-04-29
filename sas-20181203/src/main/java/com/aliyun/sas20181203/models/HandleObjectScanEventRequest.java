// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class HandleObjectScanEventRequest extends TeaModel {
    @NameInMap("BatchType")
    public String batchType;

    @NameInMap("EventId")
    public String eventId;

    @NameInMap("EventIdList")
    public java.util.List<Long> eventIdList;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("Remark")
    public String remark;

    @NameInMap("RuleConditionList")
    public java.util.List<HandleObjectScanEventRequestRuleConditionList> ruleConditionList;

    @NameInMap("Status")
    public Integer status;

    public static HandleObjectScanEventRequest build(java.util.Map<String, ?> map) throws Exception {
        HandleObjectScanEventRequest self = new HandleObjectScanEventRequest();
        return TeaModel.build(map, self);
    }

    public HandleObjectScanEventRequest setBatchType(String batchType) {
        this.batchType = batchType;
        return this;
    }
    public String getBatchType() {
        return this.batchType;
    }

    public HandleObjectScanEventRequest setEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }
    public String getEventId() {
        return this.eventId;
    }

    public HandleObjectScanEventRequest setEventIdList(java.util.List<Long> eventIdList) {
        this.eventIdList = eventIdList;
        return this;
    }
    public java.util.List<Long> getEventIdList() {
        return this.eventIdList;
    }

    public HandleObjectScanEventRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public HandleObjectScanEventRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public HandleObjectScanEventRequest setRuleConditionList(java.util.List<HandleObjectScanEventRequestRuleConditionList> ruleConditionList) {
        this.ruleConditionList = ruleConditionList;
        return this;
    }
    public java.util.List<HandleObjectScanEventRequestRuleConditionList> getRuleConditionList() {
        return this.ruleConditionList;
    }

    public HandleObjectScanEventRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public static class HandleObjectScanEventRequestRuleConditionList extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Operate")
        public String operate;

        @NameInMap("Value")
        public String value;

        public static HandleObjectScanEventRequestRuleConditionList build(java.util.Map<String, ?> map) throws Exception {
            HandleObjectScanEventRequestRuleConditionList self = new HandleObjectScanEventRequestRuleConditionList();
            return TeaModel.build(map, self);
        }

        public HandleObjectScanEventRequestRuleConditionList setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public HandleObjectScanEventRequestRuleConditionList setOperate(String operate) {
            this.operate = operate;
            return this;
        }
        public String getOperate() {
            return this.operate;
        }

        public HandleObjectScanEventRequestRuleConditionList setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
