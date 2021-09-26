// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class DisableLogMaskConfigsRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("MaskIdList")
    public java.util.List<String> maskIdList;

    public static DisableLogMaskConfigsRequest build(java.util.Map<String, ?> map) throws Exception {
        DisableLogMaskConfigsRequest self = new DisableLogMaskConfigsRequest();
        return TeaModel.build(map, self);
    }

    public DisableLogMaskConfigsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DisableLogMaskConfigsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DisableLogMaskConfigsRequest setMaskIdList(java.util.List<String> maskIdList) {
        this.maskIdList = maskIdList;
        return this;
    }
    public java.util.List<String> getMaskIdList() {
        return this.maskIdList;
    }

}
