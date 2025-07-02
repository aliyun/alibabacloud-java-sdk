// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpcipam20230228.models;

import com.aliyun.tea.*;

public class UpdateIpamPoolAllocationRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The client token can contain only ASCII characters.</p>
     * <blockquote>
     * <p> If you do not specify this parameter, the system automatically uses the request ID as the client token. The request ID may be different for each request.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to precheck this request. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: performs a dry run without modifying the CIDR blocks of IPAM pools. The system checks the required parameters, request syntax, and limits. If the request fails the dry run, an error message is returned. If the request passes the dry run, the DryRunOperation error code is returned.</li>
     * <li><strong>false</strong> (default): performs a dry run and the actual request. If the request passes the check, an HTTP 2xx status code is returned and the CIDR allocation information of the IPAM address pool is modified.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The description of the CIDR allocation of the IPAM pool.</p>
     * <p>The description must be 1 to 256 characters in length and start with a letter, but cannot start with a <code>http://</code> or <code>https://</code>. This parameter is empty by default.</p>
     * 
     * <strong>example:</strong>
     * <p>test description</p>
     */
    @NameInMap("IpamPoolAllocationDescription")
    public String ipamPoolAllocationDescription;

    /**
     * <p>The ID of the instance to which CIDR blocks are allocated from the IPAM pool.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ipam-pool-alloc-112za33e4****</p>
     */
    @NameInMap("IpamPoolAllocationId")
    public String ipamPoolAllocationId;

    /**
     * <p>The name of the CIDR allocation of the IPAM pool.</p>
     * <p>It must be 1 to 128 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>test name</p>
     */
    @NameInMap("IpamPoolAllocationName")
    public String ipamPoolAllocationName;

    /**
     * <p>The ID of the region where you want to perform the operation. You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static UpdateIpamPoolAllocationRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateIpamPoolAllocationRequest self = new UpdateIpamPoolAllocationRequest();
        return TeaModel.build(map, self);
    }

    public UpdateIpamPoolAllocationRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateIpamPoolAllocationRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public UpdateIpamPoolAllocationRequest setIpamPoolAllocationDescription(String ipamPoolAllocationDescription) {
        this.ipamPoolAllocationDescription = ipamPoolAllocationDescription;
        return this;
    }
    public String getIpamPoolAllocationDescription() {
        return this.ipamPoolAllocationDescription;
    }

    public UpdateIpamPoolAllocationRequest setIpamPoolAllocationId(String ipamPoolAllocationId) {
        this.ipamPoolAllocationId = ipamPoolAllocationId;
        return this;
    }
    public String getIpamPoolAllocationId() {
        return this.ipamPoolAllocationId;
    }

    public UpdateIpamPoolAllocationRequest setIpamPoolAllocationName(String ipamPoolAllocationName) {
        this.ipamPoolAllocationName = ipamPoolAllocationName;
        return this;
    }
    public String getIpamPoolAllocationName() {
        return this.ipamPoolAllocationName;
    }

    public UpdateIpamPoolAllocationRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
