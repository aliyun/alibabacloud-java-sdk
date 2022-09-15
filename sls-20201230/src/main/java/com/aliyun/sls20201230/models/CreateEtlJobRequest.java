// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class CreateEtlJobRequest extends TeaModel {
    @NameInMap("enable")
    public Boolean enable;

    @NameInMap("etlJobName")
    public String etlJobName;

    @NameInMap("functionConfig")
    public CreateEtlJobRequestFunctionConfig functionConfig;

    @NameInMap("functionParameter")
    public java.util.Map<String, ?> functionParameter;

    @NameInMap("logConfig")
    public CreateEtlJobRequestLogConfig logConfig;

    @NameInMap("sourceConfig")
    public CreateEtlJobRequestSourceConfig sourceConfig;

    @NameInMap("triggerConfig")
    public CreateEtlJobRequestTriggerConfig triggerConfig;

    public static CreateEtlJobRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateEtlJobRequest self = new CreateEtlJobRequest();
        return TeaModel.build(map, self);
    }

    public CreateEtlJobRequest setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

    public CreateEtlJobRequest setEtlJobName(String etlJobName) {
        this.etlJobName = etlJobName;
        return this;
    }
    public String getEtlJobName() {
        return this.etlJobName;
    }

    public CreateEtlJobRequest setFunctionConfig(CreateEtlJobRequestFunctionConfig functionConfig) {
        this.functionConfig = functionConfig;
        return this;
    }
    public CreateEtlJobRequestFunctionConfig getFunctionConfig() {
        return this.functionConfig;
    }

    public CreateEtlJobRequest setFunctionParameter(java.util.Map<String, ?> functionParameter) {
        this.functionParameter = functionParameter;
        return this;
    }
    public java.util.Map<String, ?> getFunctionParameter() {
        return this.functionParameter;
    }

    public CreateEtlJobRequest setLogConfig(CreateEtlJobRequestLogConfig logConfig) {
        this.logConfig = logConfig;
        return this;
    }
    public CreateEtlJobRequestLogConfig getLogConfig() {
        return this.logConfig;
    }

    public CreateEtlJobRequest setSourceConfig(CreateEtlJobRequestSourceConfig sourceConfig) {
        this.sourceConfig = sourceConfig;
        return this;
    }
    public CreateEtlJobRequestSourceConfig getSourceConfig() {
        return this.sourceConfig;
    }

    public CreateEtlJobRequest setTriggerConfig(CreateEtlJobRequestTriggerConfig triggerConfig) {
        this.triggerConfig = triggerConfig;
        return this;
    }
    public CreateEtlJobRequestTriggerConfig getTriggerConfig() {
        return this.triggerConfig;
    }

    public static class CreateEtlJobRequestFunctionConfig extends TeaModel {
        @NameInMap("accountId")
        public String accountId;

        @NameInMap("endpoint")
        public String endpoint;

        @NameInMap("functionName")
        public String functionName;

        @NameInMap("functionProvider")
        public String functionProvider;

        @NameInMap("regionName")
        public String regionName;

        @NameInMap("roleArn")
        public String roleArn;

        @NameInMap("serviceName")
        public String serviceName;

        public static CreateEtlJobRequestFunctionConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateEtlJobRequestFunctionConfig self = new CreateEtlJobRequestFunctionConfig();
            return TeaModel.build(map, self);
        }

        public CreateEtlJobRequestFunctionConfig setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public CreateEtlJobRequestFunctionConfig setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public CreateEtlJobRequestFunctionConfig setFunctionName(String functionName) {
            this.functionName = functionName;
            return this;
        }
        public String getFunctionName() {
            return this.functionName;
        }

        public CreateEtlJobRequestFunctionConfig setFunctionProvider(String functionProvider) {
            this.functionProvider = functionProvider;
            return this;
        }
        public String getFunctionProvider() {
            return this.functionProvider;
        }

        public CreateEtlJobRequestFunctionConfig setRegionName(String regionName) {
            this.regionName = regionName;
            return this;
        }
        public String getRegionName() {
            return this.regionName;
        }

        public CreateEtlJobRequestFunctionConfig setRoleArn(String roleArn) {
            this.roleArn = roleArn;
            return this;
        }
        public String getRoleArn() {
            return this.roleArn;
        }

        public CreateEtlJobRequestFunctionConfig setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

    }

    public static class CreateEtlJobRequestLogConfig extends TeaModel {
        @NameInMap("endpoint")
        public String endpoint;

        @NameInMap("logstoreName")
        public String logstoreName;

        @NameInMap("projectName")
        public String projectName;

        public static CreateEtlJobRequestLogConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateEtlJobRequestLogConfig self = new CreateEtlJobRequestLogConfig();
            return TeaModel.build(map, self);
        }

        public CreateEtlJobRequestLogConfig setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public CreateEtlJobRequestLogConfig setLogstoreName(String logstoreName) {
            this.logstoreName = logstoreName;
            return this;
        }
        public String getLogstoreName() {
            return this.logstoreName;
        }

        public CreateEtlJobRequestLogConfig setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

    }

    public static class CreateEtlJobRequestSourceConfig extends TeaModel {
        @NameInMap("logstoreName")
        public String logstoreName;

        public static CreateEtlJobRequestSourceConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateEtlJobRequestSourceConfig self = new CreateEtlJobRequestSourceConfig();
            return TeaModel.build(map, self);
        }

        public CreateEtlJobRequestSourceConfig setLogstoreName(String logstoreName) {
            this.logstoreName = logstoreName;
            return this;
        }
        public String getLogstoreName() {
            return this.logstoreName;
        }

    }

    public static class CreateEtlJobRequestTriggerConfig extends TeaModel {
        @NameInMap("maxRetryTime")
        public Integer maxRetryTime;

        @NameInMap("roleArn")
        public String roleArn;

        @NameInMap("startingPosition")
        public String startingPosition;

        @NameInMap("startingUnixtime")
        public Long startingUnixtime;

        @NameInMap("triggerInterval")
        public Integer triggerInterval;

        public static CreateEtlJobRequestTriggerConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateEtlJobRequestTriggerConfig self = new CreateEtlJobRequestTriggerConfig();
            return TeaModel.build(map, self);
        }

        public CreateEtlJobRequestTriggerConfig setMaxRetryTime(Integer maxRetryTime) {
            this.maxRetryTime = maxRetryTime;
            return this;
        }
        public Integer getMaxRetryTime() {
            return this.maxRetryTime;
        }

        public CreateEtlJobRequestTriggerConfig setRoleArn(String roleArn) {
            this.roleArn = roleArn;
            return this;
        }
        public String getRoleArn() {
            return this.roleArn;
        }

        public CreateEtlJobRequestTriggerConfig setStartingPosition(String startingPosition) {
            this.startingPosition = startingPosition;
            return this;
        }
        public String getStartingPosition() {
            return this.startingPosition;
        }

        public CreateEtlJobRequestTriggerConfig setStartingUnixtime(Long startingUnixtime) {
            this.startingUnixtime = startingUnixtime;
            return this;
        }
        public Long getStartingUnixtime() {
            return this.startingUnixtime;
        }

        public CreateEtlJobRequestTriggerConfig setTriggerInterval(Integer triggerInterval) {
            this.triggerInterval = triggerInterval;
            return this;
        }
        public Integer getTriggerInterval() {
            return this.triggerInterval;
        }

    }

}
