// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nlb20220430.models;

import com.aliyun.tea.*;

public class UpdateLoadBalancerProtectionRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system automatically uses the <strong>request ID</strong> as the <strong>client token</strong>. The <strong>request ID</strong> may be different for each request.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to enable deletion protection. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DeletionProtectionEnabled")
    public Boolean deletionProtectionEnabled;

    /**
     * <p>The reason why deletion protection is enabled. The reason must be 2 to 128 characters in length, and can contain letters, digits, periods (.), underscores (_), and hyphens (-). The reason must start with a letter.</p>
     * <blockquote>
     * <p>This parameter takes effect only when <strong>DeletionProtectionEnabled</strong> is set to <strong>true</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Instance_Is_Bound_By_Acceleration_Instance</p>
     */
    @NameInMap("DeletionProtectionReason")
    public String deletionProtectionReason;

    /**
     * <p>Specifies whether to perform a dry run, without performing the actual request. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: performs only a dry run. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, and service limits. If the request fails the dry run, an error message is returned. If the request passes the dry run, the <code>DryRunOperation</code> error code is returned.</li>
     * <li><strong>false</strong>(default): performs a dry run and performs the actual request. If the request passes the dry run, a 2xx HTTP status code is returned and the operation is performed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The NLB instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>nlb-83ckzc8d4xlp8o****</p>
     */
    @NameInMap("LoadBalancerId")
    public String loadBalancerId;

    /**
     * <p>The reason why the configuration read-only mode is enabled. The reason must be 2 to 128 characters in length, and can contain letters, digits, periods (.), underscores (_), and hyphens (-). The reason must start with a letter.</p>
     * <blockquote>
     * <p>This parameter takes effect only if <strong>Status</strong> is set to <strong>ConsoleProtection</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ConsoleProtection</p>
     */
    @NameInMap("ModificationProtectionReason")
    public String modificationProtectionReason;

    /**
     * <p>Specifies whether to enable the configuration read-only mode. Valid values:</p>
     * <ul>
     * <li><strong>NonProtection</strong>: disables the configuration read-only mode. In this case, you cannot set the <strong>ModificationProtectionReason</strong> parameter. If you specify <strong>ModificationProtectionReason</strong>, the value is cleared.</li>
     * <li><strong>ConsoleProtection</strong>: enables the configuration read-only mode. In this case, you can specify <strong>ModificationProtectionReason</strong>.</li>
     * </ul>
     * <blockquote>
     * <p>If you set this parameter to <strong>ConsoleProtection</strong>, you cannot use the NLB console to modify instance configurations. However, you can call API operations to modify instance configurations.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ConsoleProtection</p>
     */
    @NameInMap("ModificationProtectionStatus")
    public String modificationProtectionStatus;

    /**
     * <p>The region ID of the NLB instance.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/443657.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static UpdateLoadBalancerProtectionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLoadBalancerProtectionRequest self = new UpdateLoadBalancerProtectionRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLoadBalancerProtectionRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateLoadBalancerProtectionRequest setDeletionProtectionEnabled(Boolean deletionProtectionEnabled) {
        this.deletionProtectionEnabled = deletionProtectionEnabled;
        return this;
    }
    public Boolean getDeletionProtectionEnabled() {
        return this.deletionProtectionEnabled;
    }

    public UpdateLoadBalancerProtectionRequest setDeletionProtectionReason(String deletionProtectionReason) {
        this.deletionProtectionReason = deletionProtectionReason;
        return this;
    }
    public String getDeletionProtectionReason() {
        return this.deletionProtectionReason;
    }

    public UpdateLoadBalancerProtectionRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public UpdateLoadBalancerProtectionRequest setLoadBalancerId(String loadBalancerId) {
        this.loadBalancerId = loadBalancerId;
        return this;
    }
    public String getLoadBalancerId() {
        return this.loadBalancerId;
    }

    public UpdateLoadBalancerProtectionRequest setModificationProtectionReason(String modificationProtectionReason) {
        this.modificationProtectionReason = modificationProtectionReason;
        return this;
    }
    public String getModificationProtectionReason() {
        return this.modificationProtectionReason;
    }

    public UpdateLoadBalancerProtectionRequest setModificationProtectionStatus(String modificationProtectionStatus) {
        this.modificationProtectionStatus = modificationProtectionStatus;
        return this;
    }
    public String getModificationProtectionStatus() {
        return this.modificationProtectionStatus;
    }

    public UpdateLoadBalancerProtectionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
