// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class UpdateFailoverTestJobRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the value, but you must make sure that the value is unique among different requests. The client token can contain only ASCII characters.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system automatically uses the <strong>RequestId</strong> of the API request as the <strong>ClientToken</strong>. The <strong>RequestId</strong> of each API request is unique.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The description of the failover test job.</p>
     * <p>The description must be 0 to 256 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Specifies whether to only perform a dry run for the request. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The system performs a dry run without updating the failover test node. The system checks whether your AccessKey pair is valid, the authorization of the Resource Access Management (RAM) user, and whether the required parameters are specified. If the request fails the dry run, the system returns an error. If the request passes the dry run, the system returns the error code DryRunOperation.                             </li>
     * <li><strong>false</strong> (default): The system sends a Normal request. If the request passes the dry run, the system returns a 2xx HTTP status code and updates the failover test node.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The duration of the failover test job. Unit: minutes. Valid values: <strong>1</strong> to <strong>4320</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("JobDuration")
    public Integer jobDuration;

    /**
     * <p>The ID of the failover test job.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ftj-bp1yh6mvi13aq3g8w****</p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <p>The name of the failover test job.</p>
     * <p>The name must be 0 to 128 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the failover test job. </p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The list of resource IDs for the failover test job. You can add up to 16 resources.</p>
     */
    @NameInMap("ResourceId")
    public java.util.List<String> resourceId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    public static UpdateFailoverTestJobRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateFailoverTestJobRequest self = new UpdateFailoverTestJobRequest();
        return TeaModel.build(map, self);
    }

    public UpdateFailoverTestJobRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateFailoverTestJobRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateFailoverTestJobRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public UpdateFailoverTestJobRequest setJobDuration(Integer jobDuration) {
        this.jobDuration = jobDuration;
        return this;
    }
    public Integer getJobDuration() {
        return this.jobDuration;
    }

    public UpdateFailoverTestJobRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public UpdateFailoverTestJobRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateFailoverTestJobRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public UpdateFailoverTestJobRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UpdateFailoverTestJobRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateFailoverTestJobRequest setResourceId(java.util.List<String> resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public java.util.List<String> getResourceId() {
        return this.resourceId;
    }

    public UpdateFailoverTestJobRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

}
