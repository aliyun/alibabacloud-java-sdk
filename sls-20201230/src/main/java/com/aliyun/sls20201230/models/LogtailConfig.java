// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class LogtailConfig extends TeaModel {
    // configName
    @NameInMap("configName")
    public String configName;

    // 创建时间
    @NameInMap("createTime")
    public Long createTime;

    // inputDetail
    @NameInMap("inputDetail")
    public LogtailConfigInputDetail inputDetail;

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
    public LogtailConfigOutputDetail outputDetail;

    // outputType
    @NameInMap("outputType")
    public String outputType;

    public static LogtailConfig build(java.util.Map<String, ?> map) throws Exception {
        LogtailConfig self = new LogtailConfig();
        return TeaModel.build(map, self);
    }

    public LogtailConfig setConfigName(String configName) {
        this.configName = configName;
        return this;
    }
    public String getConfigName() {
        return this.configName;
    }

    public LogtailConfig setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

    public LogtailConfig setInputDetail(LogtailConfigInputDetail inputDetail) {
        this.inputDetail = inputDetail;
        return this;
    }
    public LogtailConfigInputDetail getInputDetail() {
        return this.inputDetail;
    }

    public LogtailConfig setInputType(String inputType) {
        this.inputType = inputType;
        return this;
    }
    public String getInputType() {
        return this.inputType;
    }

    public LogtailConfig setLastModifyTime(Long lastModifyTime) {
        this.lastModifyTime = lastModifyTime;
        return this;
    }
    public Long getLastModifyTime() {
        return this.lastModifyTime;
    }

    public LogtailConfig setLogSample(String logSample) {
        this.logSample = logSample;
        return this;
    }
    public String getLogSample() {
        return this.logSample;
    }

    public LogtailConfig setOutputDetail(LogtailConfigOutputDetail outputDetail) {
        this.outputDetail = outputDetail;
        return this;
    }
    public LogtailConfigOutputDetail getOutputDetail() {
        return this.outputDetail;
    }

    public LogtailConfig setOutputType(String outputType) {
        this.outputType = outputType;
        return this;
    }
    public String getOutputType() {
        return this.outputType;
    }

    public static class LogtailConfigInputDetailSensitiveKeys extends TeaModel {
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

        public static LogtailConfigInputDetailSensitiveKeys build(java.util.Map<String, ?> map) throws Exception {
            LogtailConfigInputDetailSensitiveKeys self = new LogtailConfigInputDetailSensitiveKeys();
            return TeaModel.build(map, self);
        }

        public LogtailConfigInputDetailSensitiveKeys setAll(Boolean all) {
            this.all = all;
            return this;
        }
        public Boolean getAll() {
            return this.all;
        }

        public LogtailConfigInputDetailSensitiveKeys setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public LogtailConfigInputDetailSensitiveKeys setRegexBegin(String regexBegin) {
            this.regexBegin = regexBegin;
            return this;
        }
        public String getRegexBegin() {
            return this.regexBegin;
        }

        public LogtailConfigInputDetailSensitiveKeys setRegexContent(String regexContent) {
            this.regexContent = regexContent;
            return this;
        }
        public String getRegexContent() {
            return this.regexContent;
        }

        public LogtailConfigInputDetailSensitiveKeys setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class LogtailConfigInputDetail extends TeaModel {
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
        public java.util.List<LogtailConfigInputDetailSensitiveKeys> sensitiveKeys;

        // shardHashKey
        @NameInMap("shardHashKey")
        public java.util.List<String> shardHashKey;

        // timeFormat
        @NameInMap("timeFormat")
        public String timeFormat;

        // topicFormat
        @NameInMap("topicFormat")
        public String topicFormat;

        public static LogtailConfigInputDetail build(java.util.Map<String, ?> map) throws Exception {
            LogtailConfigInputDetail self = new LogtailConfigInputDetail();
            return TeaModel.build(map, self);
        }

        public LogtailConfigInputDetail setAdjustTimezone(Boolean adjustTimezone) {
            this.adjustTimezone = adjustTimezone;
            return this;
        }
        public Boolean getAdjustTimezone() {
            return this.adjustTimezone;
        }

        public LogtailConfigInputDetail setDelayAlarmBytes(Long delayAlarmBytes) {
            this.delayAlarmBytes = delayAlarmBytes;
            return this;
        }
        public Long getDelayAlarmBytes() {
            return this.delayAlarmBytes;
        }

        public LogtailConfigInputDetail setEnableTag(Boolean enableTag) {
            this.enableTag = enableTag;
            return this;
        }
        public Boolean getEnableTag() {
            return this.enableTag;
        }

        public LogtailConfigInputDetail setFilePattern(String filePattern) {
            this.filePattern = filePattern;
            return this;
        }
        public String getFilePattern() {
            return this.filePattern;
        }

        public LogtailConfigInputDetail setFilterKey(java.util.List<String> filterKey) {
            this.filterKey = filterKey;
            return this;
        }
        public java.util.List<String> getFilterKey() {
            return this.filterKey;
        }

        public LogtailConfigInputDetail setFilterRegex(java.util.List<String> filterRegex) {
            this.filterRegex = filterRegex;
            return this;
        }
        public java.util.List<String> getFilterRegex() {
            return this.filterRegex;
        }

        public LogtailConfigInputDetail setLocalStorage(Boolean localStorage) {
            this.localStorage = localStorage;
            return this;
        }
        public Boolean getLocalStorage() {
            return this.localStorage;
        }

        public LogtailConfigInputDetail setLogBeginRegex(String logBeginRegex) {
            this.logBeginRegex = logBeginRegex;
            return this;
        }
        public String getLogBeginRegex() {
            return this.logBeginRegex;
        }

        public LogtailConfigInputDetail setLogPath(String logPath) {
            this.logPath = logPath;
            return this;
        }
        public String getLogPath() {
            return this.logPath;
        }

        public LogtailConfigInputDetail setLogTimezone(String logTimezone) {
            this.logTimezone = logTimezone;
            return this;
        }
        public String getLogTimezone() {
            return this.logTimezone;
        }

        public LogtailConfigInputDetail setLogType(String logType) {
            this.logType = logType;
            return this;
        }
        public String getLogType() {
            return this.logType;
        }

        public LogtailConfigInputDetail setMaxSendRate(Integer maxSendRate) {
            this.maxSendRate = maxSendRate;
            return this;
        }
        public Integer getMaxSendRate() {
            return this.maxSendRate;
        }

        public LogtailConfigInputDetail setMergeType(String mergeType) {
            this.mergeType = mergeType;
            return this;
        }
        public String getMergeType() {
            return this.mergeType;
        }

        public LogtailConfigInputDetail setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public LogtailConfigInputDetail setSendRateExpire(Integer sendRateExpire) {
            this.sendRateExpire = sendRateExpire;
            return this;
        }
        public Integer getSendRateExpire() {
            return this.sendRateExpire;
        }

        public LogtailConfigInputDetail setSensitiveKeys(java.util.List<LogtailConfigInputDetailSensitiveKeys> sensitiveKeys) {
            this.sensitiveKeys = sensitiveKeys;
            return this;
        }
        public java.util.List<LogtailConfigInputDetailSensitiveKeys> getSensitiveKeys() {
            return this.sensitiveKeys;
        }

        public LogtailConfigInputDetail setShardHashKey(java.util.List<String> shardHashKey) {
            this.shardHashKey = shardHashKey;
            return this;
        }
        public java.util.List<String> getShardHashKey() {
            return this.shardHashKey;
        }

        public LogtailConfigInputDetail setTimeFormat(String timeFormat) {
            this.timeFormat = timeFormat;
            return this;
        }
        public String getTimeFormat() {
            return this.timeFormat;
        }

        public LogtailConfigInputDetail setTopicFormat(String topicFormat) {
            this.topicFormat = topicFormat;
            return this;
        }
        public String getTopicFormat() {
            return this.topicFormat;
        }

    }

    public static class LogtailConfigOutputDetail extends TeaModel {
        // endpoint
        @NameInMap("endpoint")
        public String endpoint;

        // logstore
        @NameInMap("logstore")
        public String logstore;

        public static LogtailConfigOutputDetail build(java.util.Map<String, ?> map) throws Exception {
            LogtailConfigOutputDetail self = new LogtailConfigOutputDetail();
            return TeaModel.build(map, self);
        }

        public LogtailConfigOutputDetail setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public LogtailConfigOutputDetail setLogstore(String logstore) {
            this.logstore = logstore;
            return this;
        }
        public String getLogstore() {
            return this.logstore;
        }

    }

}
