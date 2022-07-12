// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class LogtailConfig extends TeaModel {
    // logtail 配置的名称。
    @NameInMap("configName")
    public String configName;

    // 创建时间，unix 时间戳。
    @NameInMap("createTime")
    public Long createTime;

    // logtail 输入的详细配置。
    @NameInMap("inputDetail")
    public java.util.Map<String, ?> inputDetail;

    // logtail 读取日志的输入类型。
    @NameInMap("inputType")
    public String inputType;

    // 最后一次修改时间，unix 时间戳。
    @NameInMap("lastModifyTime")
    public Long lastModifyTime;

    // 日志样例，可以用于自动生成正则捕获字段。
    @NameInMap("logSample")
    public String logSample;

    // logtail 输出的详细配置。
    @NameInMap("outputDetail")
    public LogtailConfigOutputDetail outputDetail;

    // logtail 输出的目标类型。这里固定选择 LogService。
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

    public LogtailConfig setInputDetail(java.util.Map<String, ?> inputDetail) {
        this.inputDetail = inputDetail;
        return this;
    }
    public java.util.Map<String, ?> getInputDetail() {
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

    public static class LogtailConfigOutputDetail extends TeaModel {
        // 日志项目的 endpoint。
        @NameInMap("endpoint")
        public String endpoint;

        // 输出的目标 logstore 名称。
        @NameInMap("logstoreName")
        public String logstoreName;

        // 地域。
        @NameInMap("region")
        public String region;

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

        public LogtailConfigOutputDetail setLogstoreName(String logstoreName) {
            this.logstoreName = logstoreName;
            return this;
        }
        public String getLogstoreName() {
            return this.logstoreName;
        }

        public LogtailConfigOutputDetail setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

    }

}
