// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class SetRuleRequest extends TeaModel {
    /**
     * <p>The cookie that is configured on the server.</p>
     * <br>
     * <p>The cookie must be 1 to 200 characters in length and can contain only ASCII characters and digits. It cannot contain commas (,), semicolons (;), or space characters. It cannot start with a dollar sign ($).</p>
     * <br>
     * <p>>  This parameter is required and takes effect if **StickySession** is set to **on** and **StickySessionType** is set to **server**.</p>
     */
    @NameInMap("Cookie")
    public String cookie;

    /**
     * <p>The timeout period of a cookie. Unit: seconds. Valid values: **1** to **86400**.</p>
     * <br>
     * <p>>  This parameter is required and takes effect if **StickySession** is set to **on** and **StickySessionType** is set to **insert**.</p>
     */
    @NameInMap("CookieTimeout")
    public Integer cookieTimeout;

    /**
     * <p>Specifies whether to enable the health check feature. Valid values:</p>
     * <br>
     * <p>*   **on**: yes</p>
     * <p>*   **off**: no</p>
     * <br>
     * <p>>  This parameter is required and takes effect if the **ListenerSync** parameter is set to **off**.</p>
     */
    @NameInMap("HealthCheck")
    public String healthCheck;

    /**
     * <p>The port that is used for health checks. Valid values: **1** to **65535**.</p>
     * <br>
     * <p>>  This parameter takes effect when the **HealthCheck** parameter is set to **on**.</p>
     */
    @NameInMap("HealthCheckConnectPort")
    public Integer healthCheckConnectPort;

    /**
     * <p>The domain name that is used for health checks. Valid values:</p>
     * <br>
     * <p>*   **$\_ip**: the private IP address of a backend server. If you do not set this parameter or set the parameter to $\_ip, the SLB instance uses the private IP address of each backend server for health checks.</p>
     * <p>*   **domain**: The domain name must be 1 to 80 characters in length, and can contain letters, digits, periods (.), and hyphens (-).</p>
     * <br>
     * <p>>  This parameter takes effect if the **HealthCheck** parameter is set to **on**.</p>
     */
    @NameInMap("HealthCheckDomain")
    public String healthCheckDomain;

    /**
     * <p>The HTTP status code for a successful health check. Multiple HTTP status codes are separated by commas (,).</p>
     * <br>
     * <p>Valid values: **http\_2xx**, **http\_3xx**, **http\_4xx**, and **http\_5xx**.</p>
     * <br>
     * <p>>  This parameter is required and takes effect if the **HealthCheck** parameter is set to **on**.</p>
     */
    @NameInMap("HealthCheckHttpCode")
    public String healthCheckHttpCode;

    /**
     * <p>The interval between two consecutive health checks. Unit: seconds. Valid values: **1** to **50**.</p>
     * <br>
     * <p>>  This parameter is required and takes effect if the **HealthCheck** parameter is set to **on**.</p>
     */
    @NameInMap("HealthCheckInterval")
    public Integer healthCheckInterval;

    /**
     * <p>The timeout period of a health check response. If a backend server, such as an Elastic Compute Service (ECS) instance, does not return a health check response within the specified timeout period, the server fails the health check. Unit: seconds. Valid values: **1** to **300**.</p>
     * <br>
     * <p>>  This parameter is required and takes effect if the **HealthCheck** parameter is set to **on**.</p>
     */
    @NameInMap("HealthCheckTimeout")
    public Integer healthCheckTimeout;

    /**
     * <p>The URI that is used for health checks.</p>
     * <br>
     * <p>>  This parameter is required and takes effect if the **HealthCheck** parameter is set to **on**.</p>
     */
    @NameInMap("HealthCheckURI")
    public String healthCheckURI;

    /**
     * <p>The number of times that an unhealthy backend server must consecutively pass health checks before it is declared healthy. In this case, the health status is changed from **fail** to **success**.</p>
     * <br>
     * <p>Valid values: **2** to **10**.</p>
     * <br>
     * <p>>  This parameter is required and takes effect if the **HealthCheck** parameter is set to **on**.</p>
     */
    @NameInMap("HealthyThreshold")
    public Integer healthyThreshold;

    /**
     * <p>Specifies whether to use the scheduling algorithm, session persistence, and health check configurations of the listener. Valid values:</p>
     * <br>
     * <p>*   **on**: uses the configurations of the listener.</p>
     * <p>*   **off**: does not use the configurations of the listener. You can customize the health check and session persistence configurations for the forwarding rule.</p>
     */
    @NameInMap("ListenerSync")
    public String listenerSync;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The ID of the region where the Classic Load Balancer (CLB) instance is deployed.</p>
     * <br>
     * <p>You can call the [DescribeRegions](~~27584~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The ID of the forwarding rule.</p>
     */
    @NameInMap("RuleId")
    public String ruleId;

    /**
     * <p>The name of the forwarding rule. The name must be 1 to 80 characters in length and can contain letters, digits, hyphens (-), forward slashes (/), periods (.), and underscores (\_).</p>
     * <br>
     * <p>>  Forwarding rule names must be unique within the same listener.</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

    /**
     * <p>The scheduling algorithm. Valid values:</p>
     * <br>
     * <p>*   **wrr**: Backend servers with higher weights receive more requests than those with lower weights.</p>
     * <p>*   **rr**: Requests are distributed to backend servers in sequence.</p>
     * <br>
     * <p>>  This parameter is required and takes effect if the **ListenerSync** parameter is set to **off**.</p>
     */
    @NameInMap("Scheduler")
    public String scheduler;

    /**
     * <p>Specifies whether to enable session persistence. Valid values:</p>
     * <br>
     * <p>*   **on**: yes</p>
     * <p>*   **off**: no</p>
     * <br>
     * <p>This parameter is required and takes effect if the **ListenerSync** parameter is set to **off**.</p>
     */
    @NameInMap("StickySession")
    public String stickySession;

    /**
     * <p>The method that is used to handle a cookie. Valid values:</p>
     * <br>
     * <p>*   **insert**: inserts a cookie.</p>
     * <br>
     * <p>    CLB inserts the backend server ID as a cookie into the first HTTP or HTTPS response that is sent to a client. The next request from the client will contain this cookie, and the listener will distribute this request to the recorded backend server.</p>
     * <br>
     * <p>*   **server**: rewrites a cookie.</p>
     * <br>
     * <p>    When CLB detects a user-defined cookie, it overwrites the original cookie with the user-defined cookie. The next request from the client will contain the user-defined cookie, and the listener will distribute this request to the recorded backend server.</p>
     * <br>
     * <p>>  This parameter is required and takes effect if the **StickySession** parameter is set to **on**.</p>
     */
    @NameInMap("StickySessionType")
    public String stickySessionType;

    /**
     * <p>The number of times that a healthy backend server must consecutively fail health checks before it is declared unhealthy. In this case, the health status is changed from **success** to **fail**.</p>
     * <br>
     * <p>Valid values: **2** to **10**.</p>
     * <br>
     * <p>>  This parameter is required and takes effect if the **HealthCheck** parameter is set to **on**.</p>
     */
    @NameInMap("UnhealthyThreshold")
    public Integer unhealthyThreshold;

    /**
     * <p>The ID of the vServer group that is associated with the forwarding rule.</p>
     */
    @NameInMap("VServerGroupId")
    public String VServerGroupId;

    public static SetRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        SetRuleRequest self = new SetRuleRequest();
        return TeaModel.build(map, self);
    }

    public SetRuleRequest setCookie(String cookie) {
        this.cookie = cookie;
        return this;
    }
    public String getCookie() {
        return this.cookie;
    }

    public SetRuleRequest setCookieTimeout(Integer cookieTimeout) {
        this.cookieTimeout = cookieTimeout;
        return this;
    }
    public Integer getCookieTimeout() {
        return this.cookieTimeout;
    }

    public SetRuleRequest setHealthCheck(String healthCheck) {
        this.healthCheck = healthCheck;
        return this;
    }
    public String getHealthCheck() {
        return this.healthCheck;
    }

    public SetRuleRequest setHealthCheckConnectPort(Integer healthCheckConnectPort) {
        this.healthCheckConnectPort = healthCheckConnectPort;
        return this;
    }
    public Integer getHealthCheckConnectPort() {
        return this.healthCheckConnectPort;
    }

    public SetRuleRequest setHealthCheckDomain(String healthCheckDomain) {
        this.healthCheckDomain = healthCheckDomain;
        return this;
    }
    public String getHealthCheckDomain() {
        return this.healthCheckDomain;
    }

    public SetRuleRequest setHealthCheckHttpCode(String healthCheckHttpCode) {
        this.healthCheckHttpCode = healthCheckHttpCode;
        return this;
    }
    public String getHealthCheckHttpCode() {
        return this.healthCheckHttpCode;
    }

    public SetRuleRequest setHealthCheckInterval(Integer healthCheckInterval) {
        this.healthCheckInterval = healthCheckInterval;
        return this;
    }
    public Integer getHealthCheckInterval() {
        return this.healthCheckInterval;
    }

    public SetRuleRequest setHealthCheckTimeout(Integer healthCheckTimeout) {
        this.healthCheckTimeout = healthCheckTimeout;
        return this;
    }
    public Integer getHealthCheckTimeout() {
        return this.healthCheckTimeout;
    }

    public SetRuleRequest setHealthCheckURI(String healthCheckURI) {
        this.healthCheckURI = healthCheckURI;
        return this;
    }
    public String getHealthCheckURI() {
        return this.healthCheckURI;
    }

    public SetRuleRequest setHealthyThreshold(Integer healthyThreshold) {
        this.healthyThreshold = healthyThreshold;
        return this;
    }
    public Integer getHealthyThreshold() {
        return this.healthyThreshold;
    }

    public SetRuleRequest setListenerSync(String listenerSync) {
        this.listenerSync = listenerSync;
        return this;
    }
    public String getListenerSync() {
        return this.listenerSync;
    }

    public SetRuleRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public SetRuleRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public SetRuleRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public SetRuleRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public SetRuleRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public SetRuleRequest setRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public String getRuleId() {
        return this.ruleId;
    }

    public SetRuleRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public SetRuleRequest setScheduler(String scheduler) {
        this.scheduler = scheduler;
        return this;
    }
    public String getScheduler() {
        return this.scheduler;
    }

    public SetRuleRequest setStickySession(String stickySession) {
        this.stickySession = stickySession;
        return this;
    }
    public String getStickySession() {
        return this.stickySession;
    }

    public SetRuleRequest setStickySessionType(String stickySessionType) {
        this.stickySessionType = stickySessionType;
        return this;
    }
    public String getStickySessionType() {
        return this.stickySessionType;
    }

    public SetRuleRequest setUnhealthyThreshold(Integer unhealthyThreshold) {
        this.unhealthyThreshold = unhealthyThreshold;
        return this;
    }
    public Integer getUnhealthyThreshold() {
        return this.unhealthyThreshold;
    }

    public SetRuleRequest setVServerGroupId(String VServerGroupId) {
        this.VServerGroupId = VServerGroupId;
        return this;
    }
    public String getVServerGroupId() {
        return this.VServerGroupId;
    }

}
