// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeVbrHaRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <br>
     * <p>You can use the client to generate the value, but you must ensure that it is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to precheck the request. Valid values:</p>
     * <br>
     * <p>*   **true**: prechecks the request without performing the operation. The system checks the request format, instance status, and whether the required parameters are specified. An error message is returned if the request fails the precheck. If the request passes the precheck, `DRYRUN.SUCCESS` is returned.</p>
     * <p>*   **false**: prechecks the request. After the request passes the precheck, the operation is performed.</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The ID of the region where the VBR is deployed.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The ID of the VBR failover group.</p>
     */
    @NameInMap("VbrHaId")
    public String vbrHaId;

    /**
     * <p>The ID of the VBR.</p>
     */
    @NameInMap("VbrId")
    public String vbrId;

    public static DescribeVbrHaRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVbrHaRequest self = new DescribeVbrHaRequest();
        return TeaModel.build(map, self);
    }

    public DescribeVbrHaRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DescribeVbrHaRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public DescribeVbrHaRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeVbrHaRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeVbrHaRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeVbrHaRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeVbrHaRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeVbrHaRequest setVbrHaId(String vbrHaId) {
        this.vbrHaId = vbrHaId;
        return this;
    }
    public String getVbrHaId() {
        return this.vbrHaId;
    }

    public DescribeVbrHaRequest setVbrId(String vbrId) {
        this.vbrId = vbrId;
        return this;
    }
    public String getVbrId() {
        return this.vbrId;
    }

}
