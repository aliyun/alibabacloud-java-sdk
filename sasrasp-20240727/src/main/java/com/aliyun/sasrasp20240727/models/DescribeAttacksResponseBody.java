// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sasrasp20240727.models;

import com.aliyun.tea.*;

public class DescribeAttacksResponseBody extends TeaModel {
    @NameInMap("Attacks")
    public java.util.List<DescribeAttacksResponseBodyAttacks> attacks;

    /**
     * <strong>example:</strong>
     * <p>4E7772EA-1AD0-5583-BA55-A4E7B65F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>289</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribeAttacksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAttacksResponseBody self = new DescribeAttacksResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAttacksResponseBody setAttacks(java.util.List<DescribeAttacksResponseBodyAttacks> attacks) {
        this.attacks = attacks;
        return this;
    }
    public java.util.List<DescribeAttacksResponseBodyAttacks> getAttacks() {
        return this.attacks;
    }

    public DescribeAttacksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAttacksResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeAttacksResponseBodyAttacksInputParamItemList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>4E7772EA-1AD0-5583-BA55-A4****</p>
         */
        @NameInMap("ProcessedKey")
        public String processedKey;

        /**
         * <strong>example:</strong>
         * <p>4E7772EA-1AD0-5583-BA55-A4****</p>
         */
        @NameInMap("RawKey")
        public String rawKey;

        /**
         * <strong>example:</strong>
         * <p>10.101.9.189</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeAttacksResponseBodyAttacksInputParamItemList build(java.util.Map<String, ?> map) throws Exception {
            DescribeAttacksResponseBodyAttacksInputParamItemList self = new DescribeAttacksResponseBodyAttacksInputParamItemList();
            return TeaModel.build(map, self);
        }

        public DescribeAttacksResponseBodyAttacksInputParamItemList setProcessedKey(String processedKey) {
            this.processedKey = processedKey;
            return this;
        }
        public String getProcessedKey() {
            return this.processedKey;
        }

        public DescribeAttacksResponseBodyAttacksInputParamItemList setRawKey(String rawKey) {
            this.rawKey = rawKey;
            return this;
        }
        public String getRawKey() {
            return this.rawKey;
        }

        public DescribeAttacksResponseBodyAttacksInputParamItemList setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeAttacksResponseBodyAttacks extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>/app</p>
         */
        @NameInMap("AppDir")
        public String appDir;

        /**
         * <strong>example:</strong>
         * <p>661dece60bb1</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <strong>example:</strong>
         * <p>zhxy</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("Avd")
        public String avd;

        /**
         * <strong>example:</strong>
         * <p>jar</p>
         */
        @NameInMap("Cmdline")
        public String cmdline;

        /**
         * <strong>example:</strong>
         * <p>high</p>
         */
        @NameInMap("Confidence")
        public String confidence;

        /**
         * <strong>example:</strong>
         * <p>{\&quot;Exist\&quot;: \&quot;false\&quot;}</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <strong>example:</strong>
         * <p>1024</p>
         */
        @NameInMap("ContentLength")
        public Long contentLength;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Count")
        public Long count;

        /**
         * <strong>example:</strong>
         * <p>{\&quot;All\&quot;: 12, \&quot;Online\&quot;: 9}</p>
         */
        @NameInMap("Data")
        public String data;

        /**
         * <strong>example:</strong>
         * <p>{\&quot;X-Total-Count\&quot;: 1}</p>
         */
        @NameInMap("Headers")
        public String headers;

        /**
         * <strong>example:</strong>
         * <p>100.116.60.78</p>
         */
        @NameInMap("HostId")
        public String hostId;

        /**
         * <strong>example:</strong>
         * <p>hostnames</p>
         */
        @NameInMap("Hostname")
        public String hostname;

        @NameInMap("InputParamItemList")
        public java.util.List<DescribeAttacksResponseBodyAttacksInputParamItemList> inputParamItemList;

        @NameInMap("InstallType")
        public Long installType;

        /**
         * <strong>example:</strong>
         * <p>47.92.92.85</p>
         */
        @NameInMap("Ip")
        public String ip;

        /**
         * <strong>example:</strong>
         * <p>1.8.0_342</p>
         */
        @NameInMap("Jdk")
        public String jdk;

        /**
         * <strong>example:</strong>
         * <p>cn</p>
         */
        @NameInMap("Language")
        public String language;

        /**
         * <strong>example:</strong>
         * <p>1.0</p>
         */
        @NameInMap("LanguageVersion")
        public String languageVersion;

        /**
         * <strong>example:</strong>
         * <p>1727281449756</p>
         */
        @NameInMap("MaxTimestamp")
        public Long maxTimestamp;

        @NameInMap("Message")
        public String message;

        /**
         * <strong>example:</strong>
         * <p>POST</p>
         */
        @NameInMap("Method")
        public String method;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("MiddlewareInstanceId")
        public String middlewareInstanceId;

        /**
         * <strong>example:</strong>
         * <p>1727281449756</p>
         */
        @NameInMap("MinTimestamp")
        public Long minTimestamp;

        /**
         * <strong>example:</strong>
         * <p>linux</p>
         */
        @NameInMap("Os")
        public String os;

        /**
         * <strong>example:</strong>
         * <p>linux</p>
         */
        @NameInMap("OsArch")
        public String osArch;

        /**
         * <strong>example:</strong>
         * <p>aliyun_V3_5.1</p>
         */
        @NameInMap("OsVersion")
        public String osVersion;

        /**
         * <strong>example:</strong>
         * <p>PUBLIC_CLOUD</p>
         */
        @NameInMap("Param")
        public String param;

        /**
         * <strong>example:</strong>
         * <p>245256</p>
         */
        @NameInMap("Payload")
        public String payload;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("PayloadLength")
        public Long payloadLength;

        /**
         * <strong>example:</strong>
         * <p>29719</p>
         */
        @NameInMap("Pid")
        public String pid;

        /**
         * <strong>example:</strong>
         * <p>php</p>
         */
        @NameInMap("RaspVersion")
        public String raspVersion;

        /**
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <strong>example:</strong>
         * <p>192.168.1.1</p>
         */
        @NameInMap("Remote")
        public String remote;

        /**
         * <strong>example:</strong>
         * <p>[{\&quot;TagKey\&quot;: \&quot;acs:rm:rgId\&quot;, \&quot;TagValue\&quot;: \&quot;rg-aek25bwhtt22cjq\&quot;}]</p>
         */
        @NameInMap("Result")
        public String result;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("RuleResult")
        public String ruleResult;

        /**
         * <strong>example:</strong>
         * <p>low</p>
         */
        @NameInMap("Severity")
        public String severity;

        @NameInMap("Stacktrace")
        public java.util.List<String> stacktrace;

        /**
         * <strong>example:</strong>
         * <p>1724033134746</p>
         */
        @NameInMap("Time")
        public String time;

        /**
         * <strong>example:</strong>
         * <p>1712284140</p>
         */
        @NameInMap("Timestamp")
        public Long timestamp;

        /**
         * <strong>example:</strong>
         * <p>exact</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>unionId。</p>
         * 
         * <strong>example:</strong>
         * <p>23yaet4dg6ek3s7aj</p>
         */
        @NameInMap("UnionId")
        public String unionId;

        /**
         * <strong>example:</strong>
         * <p><a href="https://other-general-huadong1.oss-cn-hangzhou.aliyuncs.com/uploadWidget/TaxiInvoice_01.jpeg">https://other-general-huadong1.oss-cn-hangzhou.aliyuncs.com/uploadWidget/TaxiInvoice_01.jpeg</a></p>
         */
        @NameInMap("Url")
        public String url;

        public static DescribeAttacksResponseBodyAttacks build(java.util.Map<String, ?> map) throws Exception {
            DescribeAttacksResponseBodyAttacks self = new DescribeAttacksResponseBodyAttacks();
            return TeaModel.build(map, self);
        }

        public DescribeAttacksResponseBodyAttacks setAppDir(String appDir) {
            this.appDir = appDir;
            return this;
        }
        public String getAppDir() {
            return this.appDir;
        }

        public DescribeAttacksResponseBodyAttacks setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public DescribeAttacksResponseBodyAttacks setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public DescribeAttacksResponseBodyAttacks setAvd(String avd) {
            this.avd = avd;
            return this;
        }
        public String getAvd() {
            return this.avd;
        }

        public DescribeAttacksResponseBodyAttacks setCmdline(String cmdline) {
            this.cmdline = cmdline;
            return this;
        }
        public String getCmdline() {
            return this.cmdline;
        }

        public DescribeAttacksResponseBodyAttacks setConfidence(String confidence) {
            this.confidence = confidence;
            return this;
        }
        public String getConfidence() {
            return this.confidence;
        }

        public DescribeAttacksResponseBodyAttacks setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public DescribeAttacksResponseBodyAttacks setContentLength(Long contentLength) {
            this.contentLength = contentLength;
            return this;
        }
        public Long getContentLength() {
            return this.contentLength;
        }

        public DescribeAttacksResponseBodyAttacks setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public DescribeAttacksResponseBodyAttacks setData(String data) {
            this.data = data;
            return this;
        }
        public String getData() {
            return this.data;
        }

        public DescribeAttacksResponseBodyAttacks setHeaders(String headers) {
            this.headers = headers;
            return this;
        }
        public String getHeaders() {
            return this.headers;
        }

        public DescribeAttacksResponseBodyAttacks setHostId(String hostId) {
            this.hostId = hostId;
            return this;
        }
        public String getHostId() {
            return this.hostId;
        }

        public DescribeAttacksResponseBodyAttacks setHostname(String hostname) {
            this.hostname = hostname;
            return this;
        }
        public String getHostname() {
            return this.hostname;
        }

        public DescribeAttacksResponseBodyAttacks setInputParamItemList(java.util.List<DescribeAttacksResponseBodyAttacksInputParamItemList> inputParamItemList) {
            this.inputParamItemList = inputParamItemList;
            return this;
        }
        public java.util.List<DescribeAttacksResponseBodyAttacksInputParamItemList> getInputParamItemList() {
            return this.inputParamItemList;
        }

        public DescribeAttacksResponseBodyAttacks setInstallType(Long installType) {
            this.installType = installType;
            return this;
        }
        public Long getInstallType() {
            return this.installType;
        }

        public DescribeAttacksResponseBodyAttacks setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public DescribeAttacksResponseBodyAttacks setJdk(String jdk) {
            this.jdk = jdk;
            return this;
        }
        public String getJdk() {
            return this.jdk;
        }

        public DescribeAttacksResponseBodyAttacks setLanguage(String language) {
            this.language = language;
            return this;
        }
        public String getLanguage() {
            return this.language;
        }

        public DescribeAttacksResponseBodyAttacks setLanguageVersion(String languageVersion) {
            this.languageVersion = languageVersion;
            return this;
        }
        public String getLanguageVersion() {
            return this.languageVersion;
        }

        public DescribeAttacksResponseBodyAttacks setMaxTimestamp(Long maxTimestamp) {
            this.maxTimestamp = maxTimestamp;
            return this;
        }
        public Long getMaxTimestamp() {
            return this.maxTimestamp;
        }

        public DescribeAttacksResponseBodyAttacks setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DescribeAttacksResponseBodyAttacks setMethod(String method) {
            this.method = method;
            return this;
        }
        public String getMethod() {
            return this.method;
        }

        public DescribeAttacksResponseBodyAttacks setMiddlewareInstanceId(String middlewareInstanceId) {
            this.middlewareInstanceId = middlewareInstanceId;
            return this;
        }
        public String getMiddlewareInstanceId() {
            return this.middlewareInstanceId;
        }

        public DescribeAttacksResponseBodyAttacks setMinTimestamp(Long minTimestamp) {
            this.minTimestamp = minTimestamp;
            return this;
        }
        public Long getMinTimestamp() {
            return this.minTimestamp;
        }

        public DescribeAttacksResponseBodyAttacks setOs(String os) {
            this.os = os;
            return this;
        }
        public String getOs() {
            return this.os;
        }

        public DescribeAttacksResponseBodyAttacks setOsArch(String osArch) {
            this.osArch = osArch;
            return this;
        }
        public String getOsArch() {
            return this.osArch;
        }

        public DescribeAttacksResponseBodyAttacks setOsVersion(String osVersion) {
            this.osVersion = osVersion;
            return this;
        }
        public String getOsVersion() {
            return this.osVersion;
        }

        public DescribeAttacksResponseBodyAttacks setParam(String param) {
            this.param = param;
            return this;
        }
        public String getParam() {
            return this.param;
        }

        public DescribeAttacksResponseBodyAttacks setPayload(String payload) {
            this.payload = payload;
            return this;
        }
        public String getPayload() {
            return this.payload;
        }

        public DescribeAttacksResponseBodyAttacks setPayloadLength(Long payloadLength) {
            this.payloadLength = payloadLength;
            return this;
        }
        public Long getPayloadLength() {
            return this.payloadLength;
        }

        public DescribeAttacksResponseBodyAttacks setPid(String pid) {
            this.pid = pid;
            return this;
        }
        public String getPid() {
            return this.pid;
        }

        public DescribeAttacksResponseBodyAttacks setRaspVersion(String raspVersion) {
            this.raspVersion = raspVersion;
            return this;
        }
        public String getRaspVersion() {
            return this.raspVersion;
        }

        public DescribeAttacksResponseBodyAttacks setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public DescribeAttacksResponseBodyAttacks setRemote(String remote) {
            this.remote = remote;
            return this;
        }
        public String getRemote() {
            return this.remote;
        }

        public DescribeAttacksResponseBodyAttacks setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

        public DescribeAttacksResponseBodyAttacks setRuleResult(String ruleResult) {
            this.ruleResult = ruleResult;
            return this;
        }
        public String getRuleResult() {
            return this.ruleResult;
        }

        public DescribeAttacksResponseBodyAttacks setSeverity(String severity) {
            this.severity = severity;
            return this;
        }
        public String getSeverity() {
            return this.severity;
        }

        public DescribeAttacksResponseBodyAttacks setStacktrace(java.util.List<String> stacktrace) {
            this.stacktrace = stacktrace;
            return this;
        }
        public java.util.List<String> getStacktrace() {
            return this.stacktrace;
        }

        public DescribeAttacksResponseBodyAttacks setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

        public DescribeAttacksResponseBodyAttacks setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public DescribeAttacksResponseBodyAttacks setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeAttacksResponseBodyAttacks setUnionId(String unionId) {
            this.unionId = unionId;
            return this;
        }
        public String getUnionId() {
            return this.unionId;
        }

        public DescribeAttacksResponseBodyAttacks setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
