// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class ETLConfiguration extends TeaModel {
    /**
     * <p>The AccessKey ID that is required to read data from the source Logstore. This parameter is required. If you use a RAM role for authorization, set this parameter to an empty string.</p>
     */
    @NameInMap("accessKeyId")
    @Deprecated
    public String accessKeyId;

    /**
     * <p>The AccessKey secret that is required to read data from the source Logstore. This parameter is required. If you use a RAM role for authorization, set this parameter to an empty string.</p>
     */
    @NameInMap("accessKeySecret")
    @Deprecated
    public String accessKeySecret;

    /**
     * <p>The start time of the data transformation. The value is a UNIX timestamp. Unit: seconds. This parameter is required. To start the data transformation from the earliest log in the source Logstore, set this parameter to 0.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("fromTime")
    public Long fromTime;

    /**
     * <p>The language of the data transformation script.</p>
     * 
     * <strong>example:</strong>
     * <p>SPL</p>
     */
    @NameInMap("lang")
    public String lang;

    /**
     * <p>The name of the source Logstore.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-logstore</p>
     */
    @NameInMap("logstore")
    public String logstore;

    /**
     * <p>Advanced parameters.</p>
     * 
     * <strong>example:</strong>
     * <p>config.vpc.vpc_id.test1：vpc-uf6mskb0b****n9yj</p>
     */
    @NameInMap("parameters")
    public java.util.Map<String, ?> parameters;

    /**
     * <p>The ARN of the RAM role that is authorized to read data from the source Logstore.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>acs:ram::13234:role/logtarget</p>
     */
    @NameInMap("roleArn")
    public String roleArn;

    /**
     * <p>The data transformation script.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li>| extend key=\&quot;value\&quot;</li>
     * </ul>
     */
    @NameInMap("script")
    public String script;

    /**
     * <p>The output destinations of the data transformation.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("sinks")
    public java.util.List<ETLConfigurationSink> sinks;

    /**
     * <p>The end time of the data transformation. The value is a UNIX timestamp. Unit: seconds. This parameter is required. To continuously perform the data transformation until you manually stop it, set this parameter to 0.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("toTime")
    public Long toTime;

    public static ETLConfiguration build(java.util.Map<String, ?> map) throws Exception {
        ETLConfiguration self = new ETLConfiguration();
        return TeaModel.build(map, self);
    }

    @Deprecated
    public ETLConfiguration setAccessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
        return this;
    }
    public String getAccessKeyId() {
        return this.accessKeyId;
    }

    @Deprecated
    public ETLConfiguration setAccessKeySecret(String accessKeySecret) {
        this.accessKeySecret = accessKeySecret;
        return this;
    }
    public String getAccessKeySecret() {
        return this.accessKeySecret;
    }

    public ETLConfiguration setFromTime(Long fromTime) {
        this.fromTime = fromTime;
        return this;
    }
    public Long getFromTime() {
        return this.fromTime;
    }

    public ETLConfiguration setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ETLConfiguration setLogstore(String logstore) {
        this.logstore = logstore;
        return this;
    }
    public String getLogstore() {
        return this.logstore;
    }

    public ETLConfiguration setParameters(java.util.Map<String, ?> parameters) {
        this.parameters = parameters;
        return this;
    }
    public java.util.Map<String, ?> getParameters() {
        return this.parameters;
    }

    public ETLConfiguration setRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }
    public String getRoleArn() {
        return this.roleArn;
    }

    public ETLConfiguration setScript(String script) {
        this.script = script;
        return this;
    }
    public String getScript() {
        return this.script;
    }

    public ETLConfiguration setSinks(java.util.List<ETLConfigurationSink> sinks) {
        this.sinks = sinks;
        return this;
    }
    public java.util.List<ETLConfigurationSink> getSinks() {
        return this.sinks;
    }

    public ETLConfiguration setToTime(Long toTime) {
        this.toTime = toTime;
        return this;
    }
    public Long getToTime() {
        return this.toTime;
    }

}
