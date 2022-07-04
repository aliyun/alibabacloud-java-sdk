// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class EtlJob extends TeaModel {
    // 是否启用
    @NameInMap("enable")
    public Boolean enable;

    // 任务名称
    @NameInMap("etlJobName")
    public String etlJobName;

    // 运行函数配置
    @NameInMap("functionConfig")
    public EtlJobFunctionConfig functionConfig;

    // 参数列表
    @NameInMap("functionParameter")
    public java.util.Map<String, String> functionParameter;

    // 日志配置
    @NameInMap("logConfig")
    public EtlJobLogConfig logConfig;

    // 配置数据来源
    @NameInMap("sourceConfig")
    public EtlJobSourceConfig sourceConfig;

    // 触发器配置
    @NameInMap("triggerConfig")
    public EtlJobTriggerConfig triggerConfig;

    public static EtlJob build(java.util.Map<String, ?> map) throws Exception {
        EtlJob self = new EtlJob();
        return TeaModel.build(map, self);
    }

    public EtlJob setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

    public EtlJob setEtlJobName(String etlJobName) {
        this.etlJobName = etlJobName;
        return this;
    }
    public String getEtlJobName() {
        return this.etlJobName;
    }

    public EtlJob setFunctionConfig(EtlJobFunctionConfig functionConfig) {
        this.functionConfig = functionConfig;
        return this;
    }
    public EtlJobFunctionConfig getFunctionConfig() {
        return this.functionConfig;
    }

    public EtlJob setFunctionParameter(java.util.Map<String, String> functionParameter) {
        this.functionParameter = functionParameter;
        return this;
    }
    public java.util.Map<String, String> getFunctionParameter() {
        return this.functionParameter;
    }

    public EtlJob setLogConfig(EtlJobLogConfig logConfig) {
        this.logConfig = logConfig;
        return this;
    }
    public EtlJobLogConfig getLogConfig() {
        return this.logConfig;
    }

    public EtlJob setSourceConfig(EtlJobSourceConfig sourceConfig) {
        this.sourceConfig = sourceConfig;
        return this;
    }
    public EtlJobSourceConfig getSourceConfig() {
        return this.sourceConfig;
    }

    public EtlJob setTriggerConfig(EtlJobTriggerConfig triggerConfig) {
        this.triggerConfig = triggerConfig;
        return this;
    }
    public EtlJobTriggerConfig getTriggerConfig() {
        return this.triggerConfig;
    }

    public static class EtlJobFunctionConfig extends TeaModel {
        // 账户 id
        @NameInMap("accountId")
        public String accountId;

        // endpoint
        @NameInMap("endpoint")
        public String endpoint;

        // 函数名
        @NameInMap("functionName")
        public String functionName;

        // 函数 provider
        @NameInMap("functionProvider")
        public String functionProvider;

        // 地域
        @NameInMap("regionName")
        public String regionName;

        // 角色授权
        @NameInMap("roleArn")
        public String roleArn;

        // 服务名
        @NameInMap("serviceName")
        public String serviceName;

        public static EtlJobFunctionConfig build(java.util.Map<String, ?> map) throws Exception {
            EtlJobFunctionConfig self = new EtlJobFunctionConfig();
            return TeaModel.build(map, self);
        }

        public EtlJobFunctionConfig setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public EtlJobFunctionConfig setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public EtlJobFunctionConfig setFunctionName(String functionName) {
            this.functionName = functionName;
            return this;
        }
        public String getFunctionName() {
            return this.functionName;
        }

        public EtlJobFunctionConfig setFunctionProvider(String functionProvider) {
            this.functionProvider = functionProvider;
            return this;
        }
        public String getFunctionProvider() {
            return this.functionProvider;
        }

        public EtlJobFunctionConfig setRegionName(String regionName) {
            this.regionName = regionName;
            return this;
        }
        public String getRegionName() {
            return this.regionName;
        }

        public EtlJobFunctionConfig setRoleArn(String roleArn) {
            this.roleArn = roleArn;
            return this;
        }
        public String getRoleArn() {
            return this.roleArn;
        }

        public EtlJobFunctionConfig setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

    }

    public static class EtlJobLogConfig extends TeaModel {
        // endpoint
        @NameInMap("endpoint")
        public String endpoint;

        // logstore 名称
        @NameInMap("logstoreName")
        public String logstoreName;

        // project 名称
        @NameInMap("projectName")
        public String projectName;

        public static EtlJobLogConfig build(java.util.Map<String, ?> map) throws Exception {
            EtlJobLogConfig self = new EtlJobLogConfig();
            return TeaModel.build(map, self);
        }

        public EtlJobLogConfig setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public EtlJobLogConfig setLogstoreName(String logstoreName) {
            this.logstoreName = logstoreName;
            return this;
        }
        public String getLogstoreName() {
            return this.logstoreName;
        }

        public EtlJobLogConfig setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

    }

    public static class EtlJobSourceConfig extends TeaModel {
        // logstore 名称
        @NameInMap("logstoreName")
        public String logstoreName;

        public static EtlJobSourceConfig build(java.util.Map<String, ?> map) throws Exception {
            EtlJobSourceConfig self = new EtlJobSourceConfig();
            return TeaModel.build(map, self);
        }

        public EtlJobSourceConfig setLogstoreName(String logstoreName) {
            this.logstoreName = logstoreName;
            return this;
        }
        public String getLogstoreName() {
            return this.logstoreName;
        }

    }

    public static class EtlJobTriggerConfig extends TeaModel {
        // 最大重试次数
        @NameInMap("maxRetryTime")
        public Integer maxRetryTime;

        // 角色授权配置
        @NameInMap("roleArn")
        public String roleArn;

        // 开始位置
        @NameInMap("startingPosition")
        public String startingPosition;

        // 开始时间
        @NameInMap("startingUnixtime")
        public Long startingUnixtime;

        // 触发间隔
        @NameInMap("triggerInterval")
        public Integer triggerInterval;

        public static EtlJobTriggerConfig build(java.util.Map<String, ?> map) throws Exception {
            EtlJobTriggerConfig self = new EtlJobTriggerConfig();
            return TeaModel.build(map, self);
        }

        public EtlJobTriggerConfig setMaxRetryTime(Integer maxRetryTime) {
            this.maxRetryTime = maxRetryTime;
            return this;
        }
        public Integer getMaxRetryTime() {
            return this.maxRetryTime;
        }

        public EtlJobTriggerConfig setRoleArn(String roleArn) {
            this.roleArn = roleArn;
            return this;
        }
        public String getRoleArn() {
            return this.roleArn;
        }

        public EtlJobTriggerConfig setStartingPosition(String startingPosition) {
            this.startingPosition = startingPosition;
            return this;
        }
        public String getStartingPosition() {
            return this.startingPosition;
        }

        public EtlJobTriggerConfig setStartingUnixtime(Long startingUnixtime) {
            this.startingUnixtime = startingUnixtime;
            return this;
        }
        public Long getStartingUnixtime() {
            return this.startingUnixtime;
        }

        public EtlJobTriggerConfig setTriggerInterval(Integer triggerInterval) {
            this.triggerInterval = triggerInterval;
            return this;
        }
        public Integer getTriggerInterval() {
            return this.triggerInterval;
        }

    }

}
