// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class ListWarningConfigResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ListWarningConfigResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>82C91484-B2D5-4D2A-A21F-A6D73F4D55C6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListWarningConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListWarningConfigResponseBody self = new ListWarningConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public ListWarningConfigResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListWarningConfigResponseBody setData(ListWarningConfigResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListWarningConfigResponseBodyData getData() {
        return this.data;
    }

    public ListWarningConfigResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListWarningConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListWarningConfigResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListWarningConfigResponseBodyDataWarningConfigInfoChannelsChannel extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Type")
        public Integer type;

        /**
         * <strong>example:</strong>
         * <p>oapi.dingtalk.com/robot/send?access_token=c55628f700eb9ad2a3ca</p>
         */
        @NameInMap("Url")
        public String url;

        public static ListWarningConfigResponseBodyDataWarningConfigInfoChannelsChannel build(java.util.Map<String, ?> map) throws Exception {
            ListWarningConfigResponseBodyDataWarningConfigInfoChannelsChannel self = new ListWarningConfigResponseBodyDataWarningConfigInfoChannelsChannel();
            return TeaModel.build(map, self);
        }

        public ListWarningConfigResponseBodyDataWarningConfigInfoChannelsChannel setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

        public ListWarningConfigResponseBodyDataWarningConfigInfoChannelsChannel setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class ListWarningConfigResponseBodyDataWarningConfigInfoChannels extends TeaModel {
        @NameInMap("Channel")
        public java.util.List<ListWarningConfigResponseBodyDataWarningConfigInfoChannelsChannel> channel;

        public static ListWarningConfigResponseBodyDataWarningConfigInfoChannels build(java.util.Map<String, ?> map) throws Exception {
            ListWarningConfigResponseBodyDataWarningConfigInfoChannels self = new ListWarningConfigResponseBodyDataWarningConfigInfoChannels();
            return TeaModel.build(map, self);
        }

        public ListWarningConfigResponseBodyDataWarningConfigInfoChannels setChannel(java.util.List<ListWarningConfigResponseBodyDataWarningConfigInfoChannelsChannel> channel) {
            this.channel = channel;
            return this;
        }
        public java.util.List<ListWarningConfigResponseBodyDataWarningConfigInfoChannelsChannel> getChannel() {
            return this.channel;
        }

    }

    public static class ListWarningConfigResponseBodyDataWarningConfigInfoRidList extends TeaModel {
        @NameInMap("RidList")
        public java.util.List<String> ridList;

        public static ListWarningConfigResponseBodyDataWarningConfigInfoRidList build(java.util.Map<String, ?> map) throws Exception {
            ListWarningConfigResponseBodyDataWarningConfigInfoRidList self = new ListWarningConfigResponseBodyDataWarningConfigInfoRidList();
            return TeaModel.build(map, self);
        }

        public ListWarningConfigResponseBodyDataWarningConfigInfoRidList setRidList(java.util.List<String> ridList) {
            this.ridList = ridList;
            return this;
        }
        public java.util.List<String> getRidList() {
            return this.ridList;
        }

    }

    public static class ListWarningConfigResponseBodyDataWarningConfigInfoRuleListWarningRule extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>33452</p>
         */
        @NameInMap("Rid")
        public Long rid;

        @NameInMap("RuleName")
        public String ruleName;

        public static ListWarningConfigResponseBodyDataWarningConfigInfoRuleListWarningRule build(java.util.Map<String, ?> map) throws Exception {
            ListWarningConfigResponseBodyDataWarningConfigInfoRuleListWarningRule self = new ListWarningConfigResponseBodyDataWarningConfigInfoRuleListWarningRule();
            return TeaModel.build(map, self);
        }

        public ListWarningConfigResponseBodyDataWarningConfigInfoRuleListWarningRule setRid(Long rid) {
            this.rid = rid;
            return this;
        }
        public Long getRid() {
            return this.rid;
        }

        public ListWarningConfigResponseBodyDataWarningConfigInfoRuleListWarningRule setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

    }

    public static class ListWarningConfigResponseBodyDataWarningConfigInfoRuleList extends TeaModel {
        @NameInMap("WarningRule")
        public java.util.List<ListWarningConfigResponseBodyDataWarningConfigInfoRuleListWarningRule> warningRule;

        public static ListWarningConfigResponseBodyDataWarningConfigInfoRuleList build(java.util.Map<String, ?> map) throws Exception {
            ListWarningConfigResponseBodyDataWarningConfigInfoRuleList self = new ListWarningConfigResponseBodyDataWarningConfigInfoRuleList();
            return TeaModel.build(map, self);
        }

        public ListWarningConfigResponseBodyDataWarningConfigInfoRuleList setWarningRule(java.util.List<ListWarningConfigResponseBodyDataWarningConfigInfoRuleListWarningRule> warningRule) {
            this.warningRule = warningRule;
            return this;
        }
        public java.util.List<ListWarningConfigResponseBodyDataWarningConfigInfoRuleListWarningRule> getWarningRule() {
            return this.warningRule;
        }

    }

    public static class ListWarningConfigResponseBodyDataWarningConfigInfo extends TeaModel {
        @NameInMap("Channels")
        public ListWarningConfigResponseBodyDataWarningConfigInfoChannels channels;

        /**
         * <strong>example:</strong>
         * <p>32</p>
         */
        @NameInMap("ConfigId")
        public Long configId;

        @NameInMap("ConfigName")
        public String configName;

        /**
         * <strong>example:</strong>
         * <p>2019-10-29T15:30Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("RidList")
        public ListWarningConfigResponseBodyDataWarningConfigInfoRidList ridList;

        @NameInMap("RuleList")
        public ListWarningConfigResponseBodyDataWarningConfigInfoRuleList ruleList;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <strong>example:</strong>
         * <p>2019-10-29T17:24Z</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        public static ListWarningConfigResponseBodyDataWarningConfigInfo build(java.util.Map<String, ?> map) throws Exception {
            ListWarningConfigResponseBodyDataWarningConfigInfo self = new ListWarningConfigResponseBodyDataWarningConfigInfo();
            return TeaModel.build(map, self);
        }

        public ListWarningConfigResponseBodyDataWarningConfigInfo setChannels(ListWarningConfigResponseBodyDataWarningConfigInfoChannels channels) {
            this.channels = channels;
            return this;
        }
        public ListWarningConfigResponseBodyDataWarningConfigInfoChannels getChannels() {
            return this.channels;
        }

        public ListWarningConfigResponseBodyDataWarningConfigInfo setConfigId(Long configId) {
            this.configId = configId;
            return this;
        }
        public Long getConfigId() {
            return this.configId;
        }

        public ListWarningConfigResponseBodyDataWarningConfigInfo setConfigName(String configName) {
            this.configName = configName;
            return this;
        }
        public String getConfigName() {
            return this.configName;
        }

        public ListWarningConfigResponseBodyDataWarningConfigInfo setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListWarningConfigResponseBodyDataWarningConfigInfo setRidList(ListWarningConfigResponseBodyDataWarningConfigInfoRidList ridList) {
            this.ridList = ridList;
            return this;
        }
        public ListWarningConfigResponseBodyDataWarningConfigInfoRidList getRidList() {
            return this.ridList;
        }

        public ListWarningConfigResponseBodyDataWarningConfigInfo setRuleList(ListWarningConfigResponseBodyDataWarningConfigInfoRuleList ruleList) {
            this.ruleList = ruleList;
            return this;
        }
        public ListWarningConfigResponseBodyDataWarningConfigInfoRuleList getRuleList() {
            return this.ruleList;
        }

        public ListWarningConfigResponseBodyDataWarningConfigInfo setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListWarningConfigResponseBodyDataWarningConfigInfo setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

    public static class ListWarningConfigResponseBodyData extends TeaModel {
        @NameInMap("WarningConfigInfo")
        public java.util.List<ListWarningConfigResponseBodyDataWarningConfigInfo> warningConfigInfo;

        public static ListWarningConfigResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListWarningConfigResponseBodyData self = new ListWarningConfigResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListWarningConfigResponseBodyData setWarningConfigInfo(java.util.List<ListWarningConfigResponseBodyDataWarningConfigInfo> warningConfigInfo) {
            this.warningConfigInfo = warningConfigInfo;
            return this;
        }
        public java.util.List<ListWarningConfigResponseBodyDataWarningConfigInfo> getWarningConfigInfo() {
            return this.warningConfigInfo;
        }

    }

}
