// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class HandleObjectScanEventRequest extends TeaModel {
    /**
     * <p>Specifies the type for batch processing of similar alerts. Valid values:</p>
     * <ul>
     * <li><strong>sha256</strong>: by file content</li>
     * <li><strong>eventName</strong>: by alert name.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>sha256</p>
     */
    @NameInMap("BatchType")
    public String batchType;

    /**
     * <p>The event ID.</p>
     * 
     * <strong>example:</strong>
     * <p>81****</p>
     */
    @NameInMap("EventId")
    public String eventId;

    /**
     * <p>The list of event IDs.</p>
     */
    @NameInMap("EventIdList")
    public java.util.List<Long> eventIdList;

    /**
     * <p>The language of the content in the request and response. Default value: <strong>zh</strong>. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese</li>
     * <li><strong>en</strong>: English.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The remarks.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Remark")
    public String remark;

    /**
     * <p>The list of whitelist rules. This parameter takes effect only when the alert is whitelisted.</p>
     */
    @NameInMap("RuleConditionList")
    public java.util.List<HandleObjectScanEventRequestRuleConditionList> ruleConditionList;

    /**
     * <p>The target status. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: Unhandled.</li>
     * <li><strong>1</strong>: Manually handled.</li>
     * <li><strong>2</strong>: Whitelisted.</li>
     * <li><strong>3</strong>: Ignored.</li>
     * <li><strong>4</strong>: Access denied.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
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
        /**
         * <p>The whitelist field. Valid values:</p>
         * <ul>
         * <li><strong>ossKey</strong>: file path</li>
         * <li><strong>bucketName</strong>: bucket name</li>
         * <li><strong>md5</strong>: file MD5</li>
         * <li><strong>sha256</strong>: file SHA-256.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ossKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The operator. Valid values:</p>
         * <ul>
         * <li><strong>contains</strong>: Contains.</li>
         * <li><strong>not_contains</strong>: Does not contain.</li>
         * <li><strong>str_equal</strong>: Equals.</li>
         * <li><strong>str_not_equal</strong>: Does not equal.</li>
         * <li><strong>regex</strong>: Regular expression.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>contains</p>
         */
        @NameInMap("Operate")
        public String operate;

        /**
         * <p>The value to match.</p>
         * 
         * <strong>example:</strong>
         * <p>sshe</p>
         */
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
