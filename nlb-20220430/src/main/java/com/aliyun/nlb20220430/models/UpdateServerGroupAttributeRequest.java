// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nlb20220430.models;

import com.aliyun.tea.*;

public class UpdateServerGroupAttributeRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <br>
     * <p>You can use the client to generate the value, but you must ensure that it is unique among different requests. The token can contain only ASCII characters.</p>
     * <br>
     * <p>>  If you do not specify this parameter, the system automatically sets **ClientToken** to the value of **RequestId**. **RequestId** may be different for each API request.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to enable connection draining. Valid values:</p>
     * <br>
     * <p>*   **true**: enables connection draining.</p>
     * <p>*   **false**: disables connection draining.</p>
     */
    @NameInMap("ConnectionDrainEnabled")
    public Boolean connectionDrainEnabled;

    /**
     * <p>The timeout period of connection draining. Unit: seconds. Valid values: **10** to **900**.</p>
     */
    @NameInMap("ConnectionDrainTimeout")
    public Integer connectionDrainTimeout;

    /**
     * <p>Specifies whether to only precheck the request. Valid values:</p>
     * <br>
     * <p>*   **true**: checks the request without performing the UpdateServerGroupAttribute operation. The system checks the required parameters, request syntax, and limits. If the request fails the check, an error message is returned. If the request passes the check, the `DryRunOperation` error code is returned.</p>
     * <p>*   **false** (default): sends the request. If the request passes the check, a 2xx HTTP status code is returned and the UpdateServerGroupAttribute operation is performed.</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("HealthCheckConfig")
    public UpdateServerGroupAttributeRequestHealthCheckConfig healthCheckConfig;

    /**
     * <p>Specifies whether to enable client IP preservation. Valid values:</p>
     * <br>
     * <p>*   **true**: enables client IP preservation.</p>
     * <p>*   **false**: disables client IP preservation.</p>
     */
    @NameInMap("PreserveClientIpEnabled")
    public Boolean preserveClientIpEnabled;

    /**
     * <p>The ID of the region where the NLB instance is deployed.</p>
     * <br>
     * <p>You can call the [DescribeRegions](~~443657~~) operation to query the available regions.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The scheduling algorithm. Valid values:</p>
     * <br>
     * <p>*   **Wrr**: Backend servers with higher weights receive more requests than backend servers with lower weights.</p>
     * <p>*   **rr**: Requests are forwarded to backend servers in sequence.</p>
     * <p>*   **sch**: Requests from the same source IP address are forwarded to the same backend server.</p>
     * <p>*   **tch**: Four-element hashing is used. This value specifies consistent hashing that is based on four factors: source IP address, destination IP address, source port, and destination port. Requests that contain the same information based on the four factors are forwarded to the same backend server.</p>
     * <p>*   **qch**: Requests that contain the same QUIC ID are forwarded to the same backend server.</p>
     */
    @NameInMap("Scheduler")
    public String scheduler;

    /**
     * <p>The ID of the server group.</p>
     */
    @NameInMap("ServerGroupId")
    public String serverGroupId;

    /**
     * <p>The new name of the server group.</p>
     * <br>
     * <p>The name must be 2 to 128 characters in length and can contain letters, digits, periods (.), underscores (\_), and hyphens (-). The name must start with a letter.</p>
     */
    @NameInMap("ServerGroupName")
    public String serverGroupName;

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

    public UpdateServerGroupAttributeRequest setConnectionDrainEnabled(Boolean connectionDrainEnabled) {
        this.connectionDrainEnabled = connectionDrainEnabled;
        return this;
    }
    public Boolean getConnectionDrainEnabled() {
        return this.connectionDrainEnabled;
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

    public UpdateServerGroupAttributeRequest setPreserveClientIpEnabled(Boolean preserveClientIpEnabled) {
        this.preserveClientIpEnabled = preserveClientIpEnabled;
        return this;
    }
    public Boolean getPreserveClientIpEnabled() {
        return this.preserveClientIpEnabled;
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

    public UpdateServerGroupAttributeRequest setServerGroupName(String serverGroupName) {
        this.serverGroupName = serverGroupName;
        return this;
    }
    public String getServerGroupName() {
        return this.serverGroupName;
    }

    public static class UpdateServerGroupAttributeRequestHealthCheckConfig extends TeaModel {
        /**
         * <p>The backend port that is used for health checks. Valid values: **0** to **65535**. If you set the value to **0**, the ports of backend servers are used for health checks.</p>
         */
        @NameInMap("HealthCheckConnectPort")
        public Integer healthCheckConnectPort;

        /**
         * <p>The maximum timeout period of a health check response. Unit: seconds. Valid values: **1** to **300**.</p>
         */
        @NameInMap("HealthCheckConnectTimeout")
        public Integer healthCheckConnectTimeout;

        /**
         * <p>The domain name that is used for health checks. Valid values:</p>
         * <br>
         * <p>*   **$SERVER_IP**: the private IP address of a backend server.</p>
         * <p>*   **domain**: a specific domain name. The domain name must be 1 to 80 characters in length and can contain lowercase letters, digits, hyphens (-), and periods (.).</p>
         * <br>
         * <p>>  This parameter takes effect only when you set **HealthCheckType** to **HTTP**.</p>
         */
        @NameInMap("HealthCheckDomain")
        public String healthCheckDomain;

        /**
         * <p>Specifies whether to enable the health check feature. Valid values:</p>
         * <br>
         * <p>*   **true**: enables the health check feature.</p>
         * <p>*   **false**: disables the health check feature.</p>
         */
        @NameInMap("HealthCheckEnabled")
        public Boolean healthCheckEnabled;

        @NameInMap("HealthCheckHttpCode")
        public java.util.List<String> healthCheckHttpCode;

        /**
         * <p>The interval between two consecutive health checks. Unit: seconds.</p>
         * <br>
         * <p>Valid values: **5** to **50**.</p>
         */
        @NameInMap("HealthCheckInterval")
        public Integer healthCheckInterval;

        /**
         * <p>The protocol that is used for health checks. Valid values: **TCP** and **HTTP**.</p>
         */
        @NameInMap("HealthCheckType")
        public String healthCheckType;

        /**
         * <p>The path to which health check requests are sent.</p>
         * <br>
         * <p>The path must be 1 to 80 characters in length, and can contain only letters, digits, and the following special characters: `- / . % ? # & =`. The path can also contain the following extended characters: `_ ; ~ ! ( ) * [ ] @ $ ^ : \" , +`. The path must start with a forward slash (/).</p>
         * <br>
         * <p>>  This parameter takes effect only when you set **HealthCheckType** to **HTTP**.</p>
         */
        @NameInMap("HealthCheckUrl")
        public String healthCheckUrl;

        /**
         * <p>The number of times that an unhealthy backend server must consecutively pass health checks before it is declared healthy. In this case, the health status is changed from **fail** to **success**. Valid values: **2** to **10**.</p>
         */
        @NameInMap("HealthyThreshold")
        public Integer healthyThreshold;

        /**
         * <p>The HTTP method that is used for health checks. Valid values: **GET** and **HEAD**.</p>
         * <br>
         * <p>>  This parameter takes effect only when you set **HealthCheckType** to **HTTP**.</p>
         */
        @NameInMap("HttpCheckMethod")
        public String httpCheckMethod;

        /**
         * <p>The number of times that a healthy backend server must consecutively fail health checks before it is declared unhealthy. In this case, the health status is changed from **success** to **fail**. Valid values: **2** to **10**.</p>
         */
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

        public UpdateServerGroupAttributeRequestHealthCheckConfig setHttpCheckMethod(String httpCheckMethod) {
            this.httpCheckMethod = httpCheckMethod;
            return this;
        }
        public String getHttpCheckMethod() {
            return this.httpCheckMethod;
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
