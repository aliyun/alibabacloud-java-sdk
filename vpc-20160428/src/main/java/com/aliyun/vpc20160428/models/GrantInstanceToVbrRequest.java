// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class GrantInstanceToVbrRequest extends TeaModel {
    /**
     * <p>The VBRs that need to acquire permissions on the VPC. Valid values:</p>
     * <br>
     * <p>*   **All**: Permissions on the VPC are granted to all VBRs that belong to the specified region and Alibaba Cloud account. In this case, you can leave **VbrInstanceIds** empty.</p>
     * <p>*   **Specify**: Permissions on the VPC are granted to the specified VBRs. **VbrInstanceIds** must be assigned a value.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("GrantType")
    public String grantType;

    /**
     * <p>The ID of the VPC.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the region where the VPC is deployed.</p>
     * <br>
     * <p>You can call the [DescribeRegions](https://help.aliyun.com/document_detail/36063.html) operation to query the most recent region list.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The information about the VBRs.</p>
     */
    @NameInMap("VbrInstanceIds")
    public java.util.List<String> vbrInstanceIds;

    /**
     * <p>The ID of the Alibaba Cloud account to which the VBR belongs.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("VbrOwnerUid")
    public Long vbrOwnerUid;

    /**
     * <p>The ID of the region where the VBR is deployed.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("VbrRegionNo")
    public String vbrRegionNo;

    public static GrantInstanceToVbrRequest build(java.util.Map<String, ?> map) throws Exception {
        GrantInstanceToVbrRequest self = new GrantInstanceToVbrRequest();
        return TeaModel.build(map, self);
    }

    public GrantInstanceToVbrRequest setGrantType(String grantType) {
        this.grantType = grantType;
        return this;
    }
    public String getGrantType() {
        return this.grantType;
    }

    public GrantInstanceToVbrRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GrantInstanceToVbrRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GrantInstanceToVbrRequest setVbrInstanceIds(java.util.List<String> vbrInstanceIds) {
        this.vbrInstanceIds = vbrInstanceIds;
        return this;
    }
    public java.util.List<String> getVbrInstanceIds() {
        return this.vbrInstanceIds;
    }

    public GrantInstanceToVbrRequest setVbrOwnerUid(Long vbrOwnerUid) {
        this.vbrOwnerUid = vbrOwnerUid;
        return this;
    }
    public Long getVbrOwnerUid() {
        return this.vbrOwnerUid;
    }

    public GrantInstanceToVbrRequest setVbrRegionNo(String vbrRegionNo) {
        this.vbrRegionNo = vbrRegionNo;
        return this;
    }
    public String getVbrRegionNo() {
        return this.vbrRegionNo;
    }

}
