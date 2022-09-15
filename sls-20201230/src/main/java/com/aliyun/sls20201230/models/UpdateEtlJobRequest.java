// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class UpdateEtlJobRequest extends TeaModel {
    @NameInMap("enable")
    public Boolean enable;

    @NameInMap("etlJobName")
    public String etlJobName;

    @NameInMap("functionConfig")
    public UpdateEtlJobRequestFunctionConfig functionConfig;

    @NameInMap("functionParameter")
    public java.util.Map<String, ?> functionParameter;

    @NameInMap("logConfig")
    public UpdateEtlJobRequestLogConfig logConfig;

    @NameInMap("sourceConfig")
    public UpdateEtlJobRequestSourceConfig sourceConfig;

    @NameInMap("triggerConfig")
    public UpdateEtlJobRequestTriggerConfig triggerConfig;

    public static UpdateEtlJobRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateEtlJobRequest self = new UpdateEtlJobRequest();
        return TeaModel.build(map, self);
    }

    public UpdateEtlJobRequest setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

    public UpdateEtlJobRequest setEtlJobName(String etlJobName) {
        this.etlJobName = etlJobName;
        return this;
    }
    public String getEtlJobName() {
        return this.etlJobName;
    }

    public UpdateEtlJobRequest setFunctionConfig(UpdateEtlJobRequestFunctionConfig functionConfig) {
        this.functionConfig = functionConfig;
        return this;
    }
    public UpdateEtlJobRequestFunctionConfig getFunctionConfig() {
        return this.functionConfig;
    }

    public UpdateEtlJobRequest setFunctionParameter(java.util.Map<String, ?> functionParameter) {
        this.functionParameter = functionParameter;
        return this;
    }
    public java.util.Map<String, ?> getFunctionParameter() {
        return this.functionParameter;
    }

    public UpdateEtlJobRequest setLogConfig(UpdateEtlJobRequestLogConfig logConfig) {
        this.logConfig = logConfig;
        return this;
    }
    public UpdateEtlJobRequestLogConfig getLogConfig() {
        return this.logConfig;
    }

    public UpdateEtlJobRequest setSourceConfig(UpdateEtlJobRequestSourceConfig sourceConfig) {
        this.sourceConfig = sourceConfig;
        return this;
    }
    public UpdateEtlJobRequestSourceConfig getSourceConfig() {
        return this.sourceConfig;
    }

    public UpdateEtlJobRequest setTriggerConfig(UpdateEtlJobRequestTriggerConfig triggerConfig) {
        this.triggerConfig = triggerConfig;
        return this;
    }
    public UpdateEtlJobRequestTriggerConfig getTriggerConfig() {
        return this.triggerConfig;
    }

    public static class UpdateEtlJobRequestFunctionConfig extends TeaModel {
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

        public static UpdateEtlJobRequestFunctionConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateEtlJobRequestFunctionConfig self = new UpdateEtlJobRequestFunctionConfig();
            return TeaModel.build(map, self);
        }

        public UpdateEtlJobRequestFunctionConfig setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public UpdateEtlJobRequestFunctionConfig setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public UpdateEtlJobRequestFunctionConfig setFunctionName(String functionName) {
            this.functionName = functionName;
            return this;
        }
        public String getFunctionName() {
            return this.functionName;
        }

        public UpdateEtlJobRequestFunctionConfig setFunctionProvider(String functionProvider) {
            this.functionProvider = functionProvider;
            return this;
        }
        public String getFunctionProvider() {
            return this.functionProvider;
        }

        public UpdateEtlJobRequestFunctionConfig setRegionName(String regionName) {
            this.regionName = regionName;
            return this;
        }
        public String getRegionName() {
            return this.regionName;
        }

        public UpdateEtlJobRequestFunctionConfig setRoleArn(String roleArn) {
            this.roleArn = roleArn;
            return this;
        }
        public String getRoleArn() {
            return this.roleArn;
        }

        public UpdateEtlJobRequestFunctionConfig setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

    }

    public static class UpdateEtlJobRequestLogConfig extends TeaModel {
        @NameInMap("endpoint")
        public String endpoint;

        @NameInMap("logstoreName")
        public String logstoreName;

        @NameInMap("projectName")
        public String projectName;

        public static UpdateEtlJobRequestLogConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateEtlJobRequestLogConfig self = new UpdateEtlJobRequestLogConfig();
            return TeaModel.build(map, self);
        }

        public UpdateEtlJobRequestLogConfig setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public UpdateEtlJobRequestLogConfig setLogstoreName(String logstoreName) {
            this.logstoreName = logstoreName;
            return this;
        }
        public String getLogstoreName() {
            return this.logstoreName;
        }

        public UpdateEtlJobRequestLogConfig setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

    }

    public static class UpdateEtlJobRequestSourceConfig extends TeaModel {
        @NameInMap("logstoreName")
        public String logstoreName;

        public static UpdateEtlJobRequestSourceConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateEtlJobRequestSourceConfig self = new UpdateEtlJobRequestSourceConfig();
            return TeaModel.build(map, self);
        }

        public UpdateEtlJobRequestSourceConfig setLogstoreName(String logstoreName) {
            this.logstoreName = logstoreName;
            return this;
        }
        public String getLogstoreName() {
            return this.logstoreName;
        }

    }

    public static class UpdateEtlJobRequestTriggerConfig extends TeaModel {
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

        public static UpdateEtlJobRequestTriggerConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateEtlJobRequestTriggerConfig self = new UpdateEtlJobRequestTriggerConfig();
            return TeaModel.build(map, self);
        }

        public UpdateEtlJobRequestTriggerConfig setMaxRetryTime(Integer maxRetryTime) {
            this.maxRetryTime = maxRetryTime;
            return this;
        }
        public Integer getMaxRetryTime() {
            return this.maxRetryTime;
        }

        public UpdateEtlJobRequestTriggerConfig setRoleArn(String roleArn) {
            this.roleArn = roleArn;
            return this;
        }
        public String getRoleArn() {
            return this.roleArn;
        }

        public UpdateEtlJobRequestTriggerConfig setStartingPosition(String startingPosition) {
            this.startingPosition = startingPosition;
            return this;
        }
        public String getStartingPosition() {
            return this.startingPosition;
        }

        public UpdateEtlJobRequestTriggerConfig setStartingUnixtime(Long startingUnixtime) {
            this.startingUnixtime = startingUnixtime;
            return this;
        }
        public Long getStartingUnixtime() {
            return this.startingUnixtime;
        }

        public UpdateEtlJobRequestTriggerConfig setTriggerInterval(Integer triggerInterval) {
            this.triggerInterval = triggerInterval;
            return this;
        }
        public Integer getTriggerInterval() {
            return this.triggerInterval;
        }

    }

}
