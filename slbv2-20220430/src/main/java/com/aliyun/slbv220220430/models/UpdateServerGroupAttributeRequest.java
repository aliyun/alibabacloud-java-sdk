// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slbv220220430.models;

import com.aliyun.tea.*;

public class UpdateServerGroupAttributeRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    // 是否开启连接优雅中断
    @NameInMap("ConnectionDrainEnable")
    public Boolean connectionDrainEnable;

    // 连接优雅中断超时时间
    @NameInMap("ConnectionDrainTimeout")
    public Integer connectionDrainTimeout;

    @NameInMap("DryRun")
    public Boolean dryRun;

    // 健康检查配置
    @NameInMap("HealthCheckConfig")
    public UpdateServerGroupAttributeRequestHealthCheckConfig healthCheckConfig;

    // 是否开启会话保持
    @NameInMap("PersistenceEnable")
    public Boolean persistenceEnable;

    // 会话保持超时时间
    @NameInMap("PersistenceTimeout")
    public Integer persistenceTimeout;

    @NameInMap("RegionId")
    public String regionId;

    // 调度类型
    @NameInMap("Scheduler")
    public String scheduler;

    // 服务器组ID
    @NameInMap("ServerGroupId")
    public String serverGroupId;

    public static UpdateServerGroupAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateServerGroupAttributeRequest self = new UpdateServerGroupAttributeRequest();
        return TeaModel.build(map, self);
    }

    public UpdateServerGroupAttributeRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateServerGroupAttributeRequest setConnectionDrainEnable(Boolean connectionDrainEnable) {
        this.connectionDrainEnable = connectionDrainEnable;
        return this;
    }
    public Boolean getConnectionDrainEnable() {
        return this.connectionDrainEnable;
    }

    public UpdateServerGroupAttributeRequest setConnectionDrainTimeout(Integer connectionDrainTimeout) {
        this.connectionDrainTimeout = connectionDrainTimeout;
        return this;
    }
    public Integer getConnectionDrainTimeout() {
        return this.connectionDrainTimeout;
    }

    public UpdateServerGroupAttributeRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public UpdateServerGroupAttributeRequest setHealthCheckConfig(UpdateServerGroupAttributeRequestHealthCheckConfig healthCheckConfig) {
        this.healthCheckConfig = healthCheckConfig;
        return this;
    }
    public UpdateServerGroupAttributeRequestHealthCheckConfig getHealthCheckConfig() {
        return this.healthCheckConfig;
    }

    public UpdateServerGroupAttributeRequest setPersistenceEnable(Boolean persistenceEnable) {
        this.persistenceEnable = persistenceEnable;
        return this;
    }
    public Boolean getPersistenceEnable() {
        return this.persistenceEnable;
    }

    public UpdateServerGroupAttributeRequest setPersistenceTimeout(Integer persistenceTimeout) {
        this.persistenceTimeout = persistenceTimeout;
        return this;
    }
    public Integer getPersistenceTimeout() {
        return this.persistenceTimeout;
    }

    public UpdateServerGroupAttributeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateServerGroupAttributeRequest setScheduler(String scheduler) {
        this.scheduler = scheduler;
        return this;
    }
    public String getScheduler() {
        return this.scheduler;
    }

    public UpdateServerGroupAttributeRequest setServerGroupId(String serverGroupId) {
        this.serverGroupId = serverGroupId;
        return this;
    }
    public String getServerGroupId() {
        return this.serverGroupId;
    }

    public static class UpdateServerGroupAttributeRequestHealthCheckConfig extends TeaModel {
        // 健康检查使用的端口
        @NameInMap("HealthCheckConnectPort")
        public Integer healthCheckConnectPort;

        // 健康检查响应的最大超时时间
        @NameInMap("HealthCheckConnectTimeout")
        public Integer healthCheckConnectTimeout;

        // 健康检查的域名
        @NameInMap("HealthCheckDomain")
        public String healthCheckDomain;

        // 是否开启健康检查
        @NameInMap("HealthCheckEnabled")
        public Boolean healthCheckEnabled;

        // 状态码，多个状态码用逗号分隔
        @NameInMap("HealthCheckHttpCode")
        public java.util.List<String> healthCheckHttpCode;

        // 健康检查时间间隔
        @NameInMap("HealthCheckInterval")
        public Integer healthCheckInterval;

        // 健康检查协议类型
        @NameInMap("HealthCheckType")
        public String healthCheckType;

        // 健康检查的url
        @NameInMap("HealthCheckUrl")
        public String healthCheckUrl;

        // 健康检查连续成功多少次后，将后端服务器的健康检查状态由fail判定为success
        @NameInMap("HealthyThreshold")
        public Integer healthyThreshold;

        // 健康检查连续失败多少次后，将后端服务器的健康检查状态由success判定为fail
        @NameInMap("UnhealthyThreshold")
        public Integer unhealthyThreshold;

        public static UpdateServerGroupAttributeRequestHealthCheckConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateServerGroupAttributeRequestHealthCheckConfig self = new UpdateServerGroupAttributeRequestHealthCheckConfig();
            return TeaModel.build(map, self);
        }

        public UpdateServerGroupAttributeRequestHealthCheckConfig setHealthCheckConnectPort(Integer healthCheckConnectPort) {
            this.healthCheckConnectPort = healthCheckConnectPort;
            return this;
        }
        public Integer getHealthCheckConnectPort() {
            return this.healthCheckConnectPort;
        }

        public UpdateServerGroupAttributeRequestHealthCheckConfig setHealthCheckConnectTimeout(Integer healthCheckConnectTimeout) {
            this.healthCheckConnectTimeout = healthCheckConnectTimeout;
            return this;
        }
        public Integer getHealthCheckConnectTimeout() {
            return this.healthCheckConnectTimeout;
        }

        public UpdateServerGroupAttributeRequestHealthCheckConfig setHealthCheckDomain(String healthCheckDomain) {
            this.healthCheckDomain = healthCheckDomain;
            return this;
        }
        public String getHealthCheckDomain() {
            return this.healthCheckDomain;
        }

        public UpdateServerGroupAttributeRequestHealthCheckConfig setHealthCheckEnabled(Boolean healthCheckEnabled) {
            this.healthCheckEnabled = healthCheckEnabled;
            return this;
        }
        public Boolean getHealthCheckEnabled() {
            return this.healthCheckEnabled;
        }

        public UpdateServerGroupAttributeRequestHealthCheckConfig setHealthCheckHttpCode(java.util.List<String> healthCheckHttpCode) {
            this.healthCheckHttpCode = healthCheckHttpCode;
            return this;
        }
        public java.util.List<String> getHealthCheckHttpCode() {
            return this.healthCheckHttpCode;
        }

        public UpdateServerGroupAttributeRequestHealthCheckConfig setHealthCheckInterval(Integer healthCheckInterval) {
            this.healthCheckInterval = healthCheckInterval;
            return this;
        }
        public Integer getHealthCheckInterval() {
            return this.healthCheckInterval;
        }

        public UpdateServerGroupAttributeRequestHealthCheckConfig setHealthCheckType(String healthCheckType) {
            this.healthCheckType = healthCheckType;
            return this;
        }
        public String getHealthCheckType() {
            return this.healthCheckType;
        }

        public UpdateServerGroupAttributeRequestHealthCheckConfig setHealthCheckUrl(String healthCheckUrl) {
            this.healthCheckUrl = healthCheckUrl;
            return this;
        }
        public String getHealthCheckUrl() {
            return this.healthCheckUrl;
        }

        public UpdateServerGroupAttributeRequestHealthCheckConfig setHealthyThreshold(Integer healthyThreshold) {
            this.healthyThreshold = healthyThreshold;
            return this;
        }
        public Integer getHealthyThreshold() {
            return this.healthyThreshold;
        }

        public UpdateServerGroupAttributeRequestHealthCheckConfig setUnhealthyThreshold(Integer unhealthyThreshold) {
            this.unhealthyThreshold = unhealthyThreshold;
            return this;
        }
        public Integer getUnhealthyThreshold() {
            return this.unhealthyThreshold;
        }

    }

}
