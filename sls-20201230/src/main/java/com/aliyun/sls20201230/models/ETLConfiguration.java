// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class ETLConfiguration extends TeaModel {
    /**
     * <p>The AccessKey ID used to grant the permissions to read data from the source logstore. This parameter is required. If you use a role to grant the required permissions, specify an empty string.</p>
     */
    @NameInMap("accessKeyId")
    @Deprecated
    public String accessKeyId;

    /**
     * <p>The AccessKey secret used to grant the permissions to read data from the source logstore. This parameter is required. If you use a role to grant the required permissions, specify an empty string.</p>
     */
    @NameInMap("accessKeySecret")
    @Deprecated
    public String accessKeySecret;

    /**
     * <p>The beginning of the time range for transformation. Specify a Unix timestamp that is accurate to the second. This parameter is required. If you want to transform data from the first log in the source logstore, enter 0.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("fromTime")
    public Long fromTime;

    /**
     * <p>The type of the data transformation syntax.</p>
     * 
     * <strong>example:</strong>
     * <p>SPL</p>
     */
    @NameInMap("lang")
    public String lang;

    /**
     * <p>The name of the source logstore.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-logstore</p>
     */
    @NameInMap("logstore")
    public String logstore;

    /**
     * <p>The advanced parameter settings.</p>
     * 
     * <strong>example:</strong>
     * <p>config.vpc.vpc_id.test1:vpc-uf6mskb0b****n9yj</p>
     */
    @NameInMap("parameters")
    public java.util.Map<String, ?> parameters;

    /**
     * <p>The Alibaba Cloud Resource Name (ARN) of the role that is used to grant the permissions to read data from the source logstore.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>acs:ram::13234:role/logtarget</p>
     */
    @NameInMap("roleArn")
    public String roleArn;

    /**
     * <p>The transformation script.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>e_set(&quot;key&quot;,&quot;value&quot;)</p>
     */
    @NameInMap("script")
    public String script;

    /**
     * <p>The storage destinations.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("sinks")
    public java.util.List<ETLConfigurationSink> sinks;

    /**
     * <p>The end of the time range for transformation. Specify a Unix timestamp that is accurate to the second. This parameter is required. If you want to transform data until the data transformation job is manually stopped, enter 0.</p>
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
