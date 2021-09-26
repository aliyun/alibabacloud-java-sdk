// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class ChangeLogMaskConfigStateRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("MaskId")
    public Integer maskId;

    @NameInMap("MaskState")
    public Integer maskState;

    public static ChangeLogMaskConfigStateRequest build(java.util.Map<String, ?> map) throws Exception {
        ChangeLogMaskConfigStateRequest self = new ChangeLogMaskConfigStateRequest();
        return TeaModel.build(map, self);
    }

    public ChangeLogMaskConfigStateRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ChangeLogMaskConfigStateRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ChangeLogMaskConfigStateRequest setMaskId(Integer maskId) {
        this.maskId = maskId;
        return this;
    }
    public Integer getMaskId() {
        return this.maskId;
    }

    public ChangeLogMaskConfigStateRequest setMaskState(Integer maskState) {
        this.maskState = maskState;
        return this;
    }
    public Integer getMaskState() {
        return this.maskState;
    }

}
