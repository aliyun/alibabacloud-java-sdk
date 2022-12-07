// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class RevokeInstanceFromVbrRequest extends TeaModel {
    @NameInMap("GrantType")
    public String grantType;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("VbrInstanceIds")
    public java.util.List<String> vbrInstanceIds;

    @NameInMap("VbrOwnerUid")
    public String vbrOwnerUid;

    @NameInMap("VbrRegionNo")
    public String vbrRegionNo;

    public static RevokeInstanceFromVbrRequest build(java.util.Map<String, ?> map) throws Exception {
        RevokeInstanceFromVbrRequest self = new RevokeInstanceFromVbrRequest();
        return TeaModel.build(map, self);
    }

    public RevokeInstanceFromVbrRequest setGrantType(String grantType) {
        this.grantType = grantType;
        return this;
    }
    public String getGrantType() {
        return this.grantType;
    }

    public RevokeInstanceFromVbrRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public RevokeInstanceFromVbrRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public RevokeInstanceFromVbrRequest setVbrInstanceIds(java.util.List<String> vbrInstanceIds) {
        this.vbrInstanceIds = vbrInstanceIds;
        return this;
    }
    public java.util.List<String> getVbrInstanceIds() {
        return this.vbrInstanceIds;
    }

    public RevokeInstanceFromVbrRequest setVbrOwnerUid(String vbrOwnerUid) {
        this.vbrOwnerUid = vbrOwnerUid;
        return this;
    }
    public String getVbrOwnerUid() {
        return this.vbrOwnerUid;
    }

    public RevokeInstanceFromVbrRequest setVbrRegionNo(String vbrRegionNo) {
        this.vbrRegionNo = vbrRegionNo;
        return this;
    }
    public String getVbrRegionNo() {
        return this.vbrRegionNo;
    }

}
