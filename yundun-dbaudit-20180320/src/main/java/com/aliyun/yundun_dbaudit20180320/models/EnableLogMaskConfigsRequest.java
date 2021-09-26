// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class EnableLogMaskConfigsRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("MaskIdList")
    public java.util.List<String> maskIdList;

    public static EnableLogMaskConfigsRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableLogMaskConfigsRequest self = new EnableLogMaskConfigsRequest();
        return TeaModel.build(map, self);
    }

    public EnableLogMaskConfigsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public EnableLogMaskConfigsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public EnableLogMaskConfigsRequest setMaskIdList(java.util.List<String> maskIdList) {
        this.maskIdList = maskIdList;
        return this;
    }
    public java.util.List<String> getMaskIdList() {
        return this.maskIdList;
    }

}
