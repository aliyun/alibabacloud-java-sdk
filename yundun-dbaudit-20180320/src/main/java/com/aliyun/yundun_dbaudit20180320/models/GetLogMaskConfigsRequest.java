// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class GetLogMaskConfigsRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("MaskName")
    public String maskName;

    @NameInMap("MaskType")
    public Integer maskType;

    @NameInMap("MaskState")
    public Integer maskState;

    public static GetLogMaskConfigsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLogMaskConfigsRequest self = new GetLogMaskConfigsRequest();
        return TeaModel.build(map, self);
    }

    public GetLogMaskConfigsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetLogMaskConfigsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetLogMaskConfigsRequest setMaskName(String maskName) {
        this.maskName = maskName;
        return this;
    }
    public String getMaskName() {
        return this.maskName;
    }

    public GetLogMaskConfigsRequest setMaskType(Integer maskType) {
        this.maskType = maskType;
        return this;
    }
    public Integer getMaskType() {
        return this.maskType;
    }

    public GetLogMaskConfigsRequest setMaskState(Integer maskState) {
        this.maskState = maskState;
        return this;
    }
    public Integer getMaskState() {
        return this.maskState;
    }

}
