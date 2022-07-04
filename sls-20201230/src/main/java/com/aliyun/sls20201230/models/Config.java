// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class Config extends TeaModel {
    // configName
    @NameInMap("configName")
    public String configName;

    // 创建时间
    @NameInMap("createTime")
    public Long createTime;

    // inputDetail
    @NameInMap("inputDetail")
    public ConfigInputDetail inputDetail;

    // inputType
    @NameInMap("inputType")
    public String inputType;

    // 修改时间
    @NameInMap("lastModifyTime")
    public Long lastModifyTime;

    // 日志样例
    @NameInMap("logSample")
    public String logSample;

    // outputDetail
    @NameInMap("outputDetail")
    public ConfigOutputDetail outputDetail;

    // outputType
    @NameInMap("outputType")
    public String outputType;

    public static Config build(java.util.Map<String, ?> map) throws Exception {
        Config self = new Config();
        return TeaModel.build(map, self);
    }

    public Config setConfigName(String configName) {
        this.configName = configName;
        return this;
    }
    public String getConfigName() {
        return this.configName;
    }

    public Config setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

    public Config setInputDetail(ConfigInputDetail inputDetail) {
        this.inputDetail = inputDetail;
        return this;
    }
    public ConfigInputDetail getInputDetail() {
        return this.inputDetail;
    }

    public Config setInputType(String inputType) {
        this.inputType = inputType;
        return this;
    }
    public String getInputType() {
        return this.inputType;
    }

    public Config setLastModifyTime(Long lastModifyTime) {
        this.lastModifyTime = lastModifyTime;
        return this;
    }
    public Long getLastModifyTime() {
        return this.lastModifyTime;
    }

    public Config setLogSample(String logSample) {
        this.logSample = logSample;
        return this;
    }
    public String getLogSample() {
        return this.logSample;
    }

    public Config setOutputDetail(ConfigOutputDetail outputDetail) {
        this.outputDetail = outputDetail;
        return this;
    }
    public ConfigOutputDetail getOutputDetail() {
        return this.outputDetail;
    }

    public Config setOutputType(String outputType) {
        this.outputType = outputType;
        return this;
    }
    public String getOutputType() {
        return this.outputType;
    }

    public static class ConfigInputDetailSensitiveKeys extends TeaModel {
        // all
        @NameInMap("all")
        public Boolean all;

        // key
        @NameInMap("key")
        public String key;

        // regex_begin
        @NameInMap("regex_begin")
        public String regexBegin;

        // regex_content
        @NameInMap("regex_content")
        public String regexContent;

        // type
        @NameInMap("type")
        public String type;

        public static ConfigInputDetailSensitiveKeys build(java.util.Map<String, ?> map) throws Exception {
            ConfigInputDetailSensitiveKeys self = new ConfigInputDetailSensitiveKeys();
            return TeaModel.build(map, self);
        }

        public ConfigInputDetailSensitiveKeys setAll(Boolean all) {
            this.all = all;
            return this;
        }
        public Boolean getAll() {
            return this.all;
        }

        public ConfigInputDetailSensitiveKeys setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ConfigInputDetailSensitiveKeys setRegexBegin(String regexBegin) {
            this.regexBegin = regexBegin;
            return this;
        }
        public String getRegexBegin() {
            return this.regexBegin;
        }

        public ConfigInputDetailSensitiveKeys setRegexContent(String regexContent) {
            this.regexContent = regexContent;
            return this;
        }
        public String getRegexContent() {
            return this.regexContent;
        }

        public ConfigInputDetailSensitiveKeys setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ConfigInputDetail extends TeaModel {
        // adjustTimezone
        @NameInMap("adjustTimezone")
        public Boolean adjustTimezone;

        // delayAlarmBytes
        @NameInMap("delayAlarmBytes")
        public Long delayAlarmBytes;

        // enableTag
        @NameInMap("enableTag")
        public Boolean enableTag;

        // filePattern
        @NameInMap("filePattern")
        public String filePattern;

        // filterKey
        @NameInMap("filterKey")
        public java.util.List<String> filterKey;

        // filterRegex
        @NameInMap("filterRegex")
        public java.util.List<String> filterRegex;

        // localStorage
        @NameInMap("localStorage")
        public Boolean localStorage;

        // logBeginRegex
        @NameInMap("logBeginRegex")
        public String logBeginRegex;

        // logPath
        @NameInMap("logPath")
        public String logPath;

        // logTimezone
        @NameInMap("logTimezone")
        public String logTimezone;

        // logType
        @NameInMap("logType")
        public String logType;

        // maxSendRate
        @NameInMap("maxSendRate")
        public Integer maxSendRate;

        // mergeType
        @NameInMap("mergeType")
        public String mergeType;

        // priority
        @NameInMap("priority")
        public Integer priority;

        // sendRateExpire
        @NameInMap("sendRateExpire")
        public Integer sendRateExpire;

        // sensitive_keys
        @NameInMap("sensitive_keys")
        public java.util.List<ConfigInputDetailSensitiveKeys> sensitiveKeys;

        // shardHashKey
        @NameInMap("shardHashKey")
        public java.util.List<String> shardHashKey;

        // timeFormat
        @NameInMap("timeFormat")
        public String timeFormat;

        // topicFormat
        @NameInMap("topicFormat")
        public String topicFormat;

        public static ConfigInputDetail build(java.util.Map<String, ?> map) throws Exception {
            ConfigInputDetail self = new ConfigInputDetail();
            return TeaModel.build(map, self);
        }

        public ConfigInputDetail setAdjustTimezone(Boolean adjustTimezone) {
            this.adjustTimezone = adjustTimezone;
            return this;
        }
        public Boolean getAdjustTimezone() {
            return this.adjustTimezone;
        }

        public ConfigInputDetail setDelayAlarmBytes(Long delayAlarmBytes) {
            this.delayAlarmBytes = delayAlarmBytes;
            return this;
        }
        public Long getDelayAlarmBytes() {
            return this.delayAlarmBytes;
        }

        public ConfigInputDetail setEnableTag(Boolean enableTag) {
            this.enableTag = enableTag;
            return this;
        }
        public Boolean getEnableTag() {
            return this.enableTag;
        }

        public ConfigInputDetail setFilePattern(String filePattern) {
            this.filePattern = filePattern;
            return this;
        }
        public String getFilePattern() {
            return this.filePattern;
        }

        public ConfigInputDetail setFilterKey(java.util.List<String> filterKey) {
            this.filterKey = filterKey;
            return this;
        }
        public java.util.List<String> getFilterKey() {
            return this.filterKey;
        }

        public ConfigInputDetail setFilterRegex(java.util.List<String> filterRegex) {
            this.filterRegex = filterRegex;
            return this;
        }
        public java.util.List<String> getFilterRegex() {
            return this.filterRegex;
        }

        public ConfigInputDetail setLocalStorage(Boolean localStorage) {
            this.localStorage = localStorage;
            return this;
        }
        public Boolean getLocalStorage() {
            return this.localStorage;
        }

        public ConfigInputDetail setLogBeginRegex(String logBeginRegex) {
            this.logBeginRegex = logBeginRegex;
            return this;
        }
        public String getLogBeginRegex() {
            return this.logBeginRegex;
        }

        public ConfigInputDetail setLogPath(String logPath) {
            this.logPath = logPath;
            return this;
        }
        public String getLogPath() {
            return this.logPath;
        }

        public ConfigInputDetail setLogTimezone(String logTimezone) {
            this.logTimezone = logTimezone;
            return this;
        }
        public String getLogTimezone() {
            return this.logTimezone;
        }

        public ConfigInputDetail setLogType(String logType) {
            this.logType = logType;
            return this;
        }
        public String getLogType() {
            return this.logType;
        }

        public ConfigInputDetail setMaxSendRate(Integer maxSendRate) {
            this.maxSendRate = maxSendRate;
            return this;
        }
        public Integer getMaxSendRate() {
            return this.maxSendRate;
        }

        public ConfigInputDetail setMergeType(String mergeType) {
            this.mergeType = mergeType;
            return this;
        }
        public String getMergeType() {
            return this.mergeType;
        }

        public ConfigInputDetail setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public ConfigInputDetail setSendRateExpire(Integer sendRateExpire) {
            this.sendRateExpire = sendRateExpire;
            return this;
        }
        public Integer getSendRateExpire() {
            return this.sendRateExpire;
        }

        public ConfigInputDetail setSensitiveKeys(java.util.List<ConfigInputDetailSensitiveKeys> sensitiveKeys) {
            this.sensitiveKeys = sensitiveKeys;
            return this;
        }
        public java.util.List<ConfigInputDetailSensitiveKeys> getSensitiveKeys() {
            return this.sensitiveKeys;
        }

        public ConfigInputDetail setShardHashKey(java.util.List<String> shardHashKey) {
            this.shardHashKey = shardHashKey;
            return this;
        }
        public java.util.List<String> getShardHashKey() {
            return this.shardHashKey;
        }

        public ConfigInputDetail setTimeFormat(String timeFormat) {
            this.timeFormat = timeFormat;
            return this;
        }
        public String getTimeFormat() {
            return this.timeFormat;
        }

        public ConfigInputDetail setTopicFormat(String topicFormat) {
            this.topicFormat = topicFormat;
            return this;
        }
        public String getTopicFormat() {
            return this.topicFormat;
        }

    }

    public static class ConfigOutputDetail extends TeaModel {
        // endpoint
        @NameInMap("endpoint")
        public String endpoint;

        // logstore
        @NameInMap("logstore")
        public String logstore;

        public static ConfigOutputDetail build(java.util.Map<String, ?> map) throws Exception {
            ConfigOutputDetail self = new ConfigOutputDetail();
            return TeaModel.build(map, self);
        }

        public ConfigOutputDetail setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public ConfigOutputDetail setLogstore(String logstore) {
            this.logstore = logstore;
            return this;
        }
        public String getLogstore() {
            return this.logstore;
        }

    }

}
