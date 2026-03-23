// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class LogtailConfig extends TeaModel {
    /**
     * <p>Logtail配置的名称，在其所属Project内必须唯一。创建Logtail配置成功后，无法修改其名称。命名规则如下：</p>
     * <ul>
     * <li>只能包括小写字母、数字、短划线（-）和下划线（_）。</li>
     * <li>必须以小写字母或者数字开头和结尾。</li>
     * <li>长度必须在2~128字符之间。</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-config</p>
     */
    @NameInMap("configName")
    public String configName;

    /**
     * <p>Logtail配置创建时间。UNIX时间戳格式，表示从1970-1-1 00:00:00 UTC计算起的秒数。</p>
     * 
     * <strong>example:</strong>
     * <p>1655176807</p>
     */
    @NameInMap("createTime")
    public Long createTime;

    /**
     * <p>日志输入的相关配置。更多信息，请参见<a href="https://help.aliyun.com/document_detail/29058.html">inputDetail参数说明</a>。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;logType&quot;: &quot;common_reg_log&quot;, &quot;logPath&quot;: &quot;/var/log/httpd/&quot;, &quot;filePattern&quot;: &quot;access*.log&quot;, &quot;localStorage&quot;: true, &quot;timeFormat&quot;: &quot;%Y/%m/%d %H:%M:%S&quot;, &quot;logBeginRegex&quot;: &quot;.*&quot;, &quot;regex&quot;: &quot;(\w+)(\s+)&quot;, &quot;key&quot; :[&quot;key1&quot;, &quot;key2&quot;], &quot;filterKey&quot;:[&quot;key1&quot;], &quot;filterRegex&quot;:[&quot;regex1&quot;], &quot;fileEncoding&quot;:&quot;utf8&quot;, &quot;topicFormat&quot;: &quot;none&quot;</p>
     */
    @NameInMap("inputDetail")
    public java.util.Map<String, ?> inputDetail;

    /**
     * <p>日志输入的方式。可选值如下：</p>
     * <ul>
     * <li><strong>plugin</strong>：通过Logtail插件采集MySQL Binlog等日志。</li>
     * <li><strong>file</strong>：通过固定模式（正则模式、分隔符模式等）采集文本文件中的日志。</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>file</p>
     */
    @NameInMap("inputType")
    public String inputType;

    /**
     * <p>Logtail配置最后一次更新时间。UNIX时间戳格式，表示从1970-1-1 00:00:00 UTC计算起的秒数。</p>
     * 
     * <strong>example:</strong>
     * <p>1655176807</p>
     */
    @NameInMap("lastModifyTime")
    public Long lastModifyTime;

    /**
     * <p>日志样例。</p>
     * 
     * <strong>example:</strong>
     * <p>2022-06-14 11:13:29.796 | DEBUG    | <strong>main</strong>:<module>:1 - hello world</p>
     */
    @NameInMap("logSample")
    public String logSample;

    /**
     * <p>日志输出的相关配置。更多信息，请参见<a href="https://help.aliyun.com/document_detail/29058.html">outputDetail参数说明</a>。</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("outputDetail")
    public LogtailConfigOutputDetail outputDetail;

    /**
     * <p>日志输出的方式，只支持LogService，即只支持将数据上传到日志服务。</p>
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
         * <p>服务入口。更多信息，请参见<a href="https://help.aliyun.com/document_detail/29008.html">服务入口</a>。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-intranet.log.aliyuncs.com</p>
         */
        @NameInMap("endpoint")
        public String endpoint;

        /**
         * <p>Logstore名称。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test-logstore</p>
         */
        @NameInMap("logstoreName")
        public String logstoreName;

        /**
         * <p>地域ID。</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("region")
        public String region;

        /**
         * <p>目标 Logstore 的可观测数据类型。</p>
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
