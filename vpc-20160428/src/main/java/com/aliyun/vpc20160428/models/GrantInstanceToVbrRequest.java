// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class GrantInstanceToVbrRequest extends TeaModel {
    @NameInMap("GrantType")
    public String grantType;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("VbrInstanceIds")
    public java.util.List<String> vbrInstanceIds;

    @NameInMap("VbrOwnerUid")
    public Long vbrOwnerUid;

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
