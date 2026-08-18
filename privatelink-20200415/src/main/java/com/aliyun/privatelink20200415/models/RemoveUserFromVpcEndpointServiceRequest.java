// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.privatelink20200415.models;

import com.aliyun.tea.*;

public class RemoveUserFromVpcEndpointServiceRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The <strong>ClientToken</strong> value can contain only ASCII characters.</p>
     * 
     * <strong>example:</strong>
     * <p>0c593ea1-3bea-11e9-b96b-88e9fe637760</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to perform a dry run. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: performs a dry run. The system checks the required parameters, request syntax, and limits. If the request fails the dry run, an error message is returned. If the request passes the dry run, the <code>DryRunOperation</code> error code is returned. The dry run checks whether the AccessKey pair is valid, whether the Resource Access Management (RAM) user is granted the required permissions (authorization), and whether the required parameters are specified.</p>
     * </li>
     * <li><p><strong>false</strong> (default): sends a Normal request. If the request passes the check, a 2xx HTTP status code is returned and the user account is removed from the service whitelist.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The region ID of the endpoint service from which you want to remove the service whitelist. You can call the <a href="https://help.aliyun.com/document_detail/120468.html">DescribeRegions</a> operation to query the region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>eu-west-1</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the endpoint service.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>epsrv-hp3vpx8yqxblby3i****</p>
     */
    @NameInMap("ServiceId")
    public String serviceId;

    /**
     * <p>The user whitelist in ARN format.</p>
     * 
     * <strong>example:</strong>
     * <p>acs:ram:<em>:<account-id>:</em></p>
     */
    @NameInMap("UserARN")
    public String userARN;

    /**
     * <p>The ID of the account to remove from the service whitelist.</p>
     * 
     * <strong>example:</strong>
     * <p>12345678</p>
     */
    @NameInMap("UserId")
    public Long userId;

    public static RemoveUserFromVpcEndpointServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveUserFromVpcEndpointServiceRequest self = new RemoveUserFromVpcEndpointServiceRequest();
        return TeaModel.build(map, self);
    }

    public RemoveUserFromVpcEndpointServiceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public RemoveUserFromVpcEndpointServiceRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public RemoveUserFromVpcEndpointServiceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public RemoveUserFromVpcEndpointServiceRequest setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

    public RemoveUserFromVpcEndpointServiceRequest setUserARN(String userARN) {
        this.userARN = userARN;
        return this;
    }
    public String getUserARN() {
        return this.userARN;
    }

    public RemoveUserFromVpcEndpointServiceRequest setUserId(Long userId) {
        this.userId = userId;
        return this;
    }
    public Long getUserId() {
        return this.userId;
    }

}
