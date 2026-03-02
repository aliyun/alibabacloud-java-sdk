// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class Logging extends TeaModel {
    /**
     * <p>Custom log templates.</p>
     */
    @NameInMap("log4j2ConfigurationTemplate")
    public String log4j2ConfigurationTemplate;

    /**
     * <p>The Log4j configuration.</p>
     */
    @NameInMap("log4jLoggers")
    public java.util.List<Log4jLogger> log4jLoggers;

    /**
     * <p>The log retention policy.</p>
     */
    @NameInMap("logReservePolicy")
    public LogReservePolicy logReservePolicy;

    /**
     * <p>The type of the system log template.</p>
     * <ul>
     * <li>default: The default template is used.</li>
     * <li>oss: Logs are delivered to Object Storage Service (OSS).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>oss</p>
     */
    @NameInMap("loggingProfile")
    public String loggingProfile;

    public static Logging build(java.util.Map<String, ?> map) throws Exception {
        Logging self = new Logging();
        return TeaModel.build(map, self);
    }

    public Logging setLog4j2ConfigurationTemplate(String log4j2ConfigurationTemplate) {
        this.log4j2ConfigurationTemplate = log4j2ConfigurationTemplate;
        return this;
    }
    public String getLog4j2ConfigurationTemplate() {
        return this.log4j2ConfigurationTemplate;
    }

    public Logging setLog4jLoggers(java.util.List<Log4jLogger> log4jLoggers) {
        this.log4jLoggers = log4jLoggers;
        return this;
    }
    public java.util.List<Log4jLogger> getLog4jLoggers() {
        return this.log4jLoggers;
    }

    public Logging setLogReservePolicy(LogReservePolicy logReservePolicy) {
        this.logReservePolicy = logReservePolicy;
        return this;
    }
    public LogReservePolicy getLogReservePolicy() {
        return this.logReservePolicy;
    }

    public Logging setLoggingProfile(String loggingProfile) {
        this.loggingProfile = loggingProfile;
        return this;
    }
    public String getLoggingProfile() {
        return this.loggingProfile;
    }

}
