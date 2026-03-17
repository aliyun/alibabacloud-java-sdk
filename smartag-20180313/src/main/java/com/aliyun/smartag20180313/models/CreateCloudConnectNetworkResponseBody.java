// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class CreateCloudConnectNetworkResponseBody extends TeaModel {
    /**
     * <p>The ID of the CCN instance.</p>
     * 
     * <strong>example:</strong>
     * <p>ccn-l9340rlu5ens*****</p>
     */
    @NameInMap("CcnId")
    public String ccnId;

    /**
     * <p>The private CIDR block.</p>
     * 
     * <strong>example:</strong>
     * <p>172.XX.XX.0/24</p>
     */
    @NameInMap("CidrBlock")
    public String cidrBlock;

    /**
     * <p>The description about the CCN instance.</p>
     * 
     * <strong>example:</strong>
     * <p>ccndesc</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The name of the CCN instance.</p>
     * 
     * <strong>example:</strong>
     * <p>ccnname</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>C48E8EB2-37A4-495B-A95C-29CA1FD26C82</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the resource group to which the CCN instance belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfm2iu4fnc****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The private CIDR block used for SNAT.</p>
     * 
     * <strong>example:</strong>
     * <p>172.XX.XX.0/25</p>
     */
    @NameInMap("SnatCidrBlock")
    public String snatCidrBlock;

    /**
     * <p>The status of the CCN instance. Valid values:</p>
     * <ul>
     * <li><strong>Active</strong>: indicates the CNN instance running as expected.</li>
     * <li><strong>Pending</strong>: indicates the CCN instance is to be created.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Active</p>
     */
    @NameInMap("Status")
    public String status;

    public static CreateCloudConnectNetworkResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateCloudConnectNetworkResponseBody self = new CreateCloudConnectNetworkResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateCloudConnectNetworkResponseBody setCcnId(String ccnId) {
        this.ccnId = ccnId;
        return this;
    }
    public String getCcnId() {
        return this.ccnId;
    }

    public CreateCloudConnectNetworkResponseBody setCidrBlock(String cidrBlock) {
        this.cidrBlock = cidrBlock;
        return this;
    }
    public String getCidrBlock() {
        return this.cidrBlock;
    }

    public CreateCloudConnectNetworkResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateCloudConnectNetworkResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateCloudConnectNetworkResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateCloudConnectNetworkResponseBody setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateCloudConnectNetworkResponseBody setSnatCidrBlock(String snatCidrBlock) {
        this.snatCidrBlock = snatCidrBlock;
        return this;
    }
    public String getSnatCidrBlock() {
        return this.snatCidrBlock;
    }

    public CreateCloudConnectNetworkResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
