// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class LogtailConfig extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-config</p>
     */
    @NameInMap("configName")
    public String configName;

    /**
     * <strong>example:</strong>
     * <p>1655176807</p>
     */
    @NameInMap("createTime")
    public Long createTime;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("inputDetail")
    public java.util.Map<String, ?> inputDetail;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>file</p>
     */
    @NameInMap("inputType")
    public String inputType;

    /**
     * <strong>example:</strong>
     * <p>1655176807</p>
     */
    @NameInMap("lastModifyTime")
    public Long lastModifyTime;

    /**
     * <strong>example:</strong>
     * <p>2022-06-14 11:13:29.796 | DEBUG    | <strong>main</strong>:<module>:1 - hello world</p>
     */
    @NameInMap("logSample")
    public String logSample;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("outputDetail")
    public LogtailConfigOutputDetail outputDetail;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>LogService</p>
     */
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
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-intranet.log.aliyuncs.com</p>
         */
        @NameInMap("endpoint")
        public String endpoint;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test-logstore</p>
         */
        @NameInMap("logstoreName")
        public String logstoreName;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("region")
        public String region;

        /**
         * <strong>example:</strong>
         * <p>logs</p>
         */
        @NameInMap("telemetryType")
        public String telemetryType;

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

        public LogtailConfigOutputDetail setTelemetryType(String telemetryType) {
            this.telemetryType = telemetryType;
            return this;
        }
        public String getTelemetryType() {
            return this.telemetryType;
        }

    }

}
