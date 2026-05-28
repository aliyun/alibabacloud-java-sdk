// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class LogtailConfig extends TeaModel {
    /**
     * <p>The name of the Logtail configuration. The name must be unique in the project to which the Logtail configuration belongs. After the Logtail configuration is created, you cannot change the name of the Logtail configuration. The name must meet the following requirements:</p>
     * <ul>
     * <li>The name can contain only lowercase letters, digits, hyphens (-), and underscores (_).</li>
     * <li>The name must start and end with a lowercase letter or a digit.</li>
     * <li>The name must be 2 to 128 characters in length.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-config</p>
     */
    @NameInMap("configName")
    public String configName;

    /**
     * <p>The time at which the Logtail configuration was created. The value is a UNIX timestamp representing the number of seconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>1655176807</p>
     */
    @NameInMap("createTime")
    public Long createTime;

    /**
     * <p>The detailed settings of the data source. For more information, see <a href="https://help.aliyun.com/document_detail/29058.html">inputDetail</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;logType&quot;: &quot;common_reg_log&quot;, &quot;logPath&quot;: &quot;/var/log/httpd/&quot;, &quot;filePattern&quot;: &quot;access*.log&quot;, &quot;localStorage&quot;: true, &quot;timeFormat&quot;: &quot;%Y/%m/%d %H:%M:%S&quot;, &quot;logBeginRegex&quot;: &quot;.*&quot;, &quot;regex&quot;: &quot;(\w+)(\s+)&quot;, &quot;key&quot; :[&quot;key1&quot;, &quot;key2&quot;], &quot;filterKey&quot;:[&quot;key1&quot;], &quot;filterRegex&quot;:[&quot;regex1&quot;], &quot;fileEncoding&quot;:&quot;utf8&quot;, &quot;topicFormat&quot;: &quot;none&quot;</p>
     */
    @NameInMap("inputDetail")
    public java.util.Map<String, ?> inputDetail;

    /**
     * <p>The type of the data source. Valid values:</p>
     * <ul>
     * <li><strong>plugin</strong>: Logs such as MySQL binary logs are collected by using Logtail plug-ins.</li>
     * <li><strong>file</strong>: Logs from text files are collected by using existing modes, including the full regex mode and delimiter mode.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>file</p>
     */
    @NameInMap("inputType")
    public String inputType;

    /**
     * <p>The time at which the Logtail configuration was last modified. The value is a UNIX timestamp representing the number of seconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>1655176807</p>
     */
    @NameInMap("lastModifyTime")
    public Long lastModifyTime;

    /**
     * <p>The sample log.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-06-14 11:13:29.796 | DEBUG    | <strong>main</strong>:<module>:1 - hello world</p>
     */
    @NameInMap("logSample")
    public String logSample;

    /**
     * <p>The detailed settings of the data destination. For more information, see <a href="https://help.aliyun.com/document_detail/29058.html">outputDetail</a>.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("outputDetail")
    public LogtailConfigOutputDetail outputDetail;

    /**
     * <p>The type of the data destination. Set the value to LogService. Collected logs can be uploaded to only Simple Log Service.</p>
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
         * <p>The endpoint. For more information, see <a href="https://help.aliyun.com/document_detail/29008.html">Endpoints</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-intranet.log.aliyuncs.com</p>
         */
        @NameInMap("endpoint")
        public String endpoint;

        /**
         * <p>The name of the Logstore.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test-logstore</p>
         */
        @NameInMap("logstoreName")
        public String logstoreName;

        /**
         * <p>The ID of the region.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("region")
        public String region;

        /**
         * <p>The type of observable data in the Logstore.</p>
         * 
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
