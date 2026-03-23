// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class ETLConfiguration extends TeaModel {
    /**
     * <p>授权读取源Logstore的AccessKey ID，必填。使用角色授权时，填入空字符串</p>
     */
    @NameInMap("accessKeyId")
    @Deprecated
    public String accessKeyId;

    /**
     * <p>授权读取源Logstore的AccessKey Secret，必填。使用角色授权时，填入空字符串。</p>
     */
    @NameInMap("accessKeySecret")
    @Deprecated
    public String accessKeySecret;

    /**
     * <p>加工时间起点时间戳（精确到秒），必填。从源Logstore中最早接收到的第一条日志开始消费时，填入0</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("fromTime")
    public Long fromTime;

    /**
     * <p>数据加工语法类型</p>
     * 
     * <strong>example:</strong>
     * <p>SPL</p>
     */
    @NameInMap("lang")
    public String lang;

    /**
     * <p>源Logstore名称</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-logstore</p>
     */
    @NameInMap("logstore")
    public String logstore;

    /**
     * <p>高级参数配置</p>
     * 
     * <strong>example:</strong>
     * <p>config.vpc.vpc_id.test1：vpc-uf6mskb0b****n9yj</p>
     */
    @NameInMap("parameters")
    public java.util.Map<String, ?> parameters;

    /**
     * <p>授权读取源Logstore的角色ARN</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>acs:ram::13234:role/logtarget</p>
     */
    @NameInMap("roleArn")
    public String roleArn;

    /**
     * <p>加工脚本</p>
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
     * <p>加工结果输出目标列表</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("sinks")
    public java.util.List<ETLConfigurationSink> sinks;

    /**
     * <p>加工时间结束时间戳（精确到秒），必填。持续消费至手动停止时，填入0</p>
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
