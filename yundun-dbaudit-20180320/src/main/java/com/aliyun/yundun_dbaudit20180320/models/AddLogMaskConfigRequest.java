// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class AddLogMaskConfigRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("MaskName")
    public String maskName;

    @NameInMap("MaskRegex")
    public String maskRegex;

    @NameInMap("MaskTxt")
    public String maskTxt;

    @NameInMap("MaskDescription")
    public String maskDescription;

    public static AddLogMaskConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        AddLogMaskConfigRequest self = new AddLogMaskConfigRequest();
        return TeaModel.build(map, self);
    }

    public AddLogMaskConfigRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public AddLogMaskConfigRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AddLogMaskConfigRequest setMaskName(String maskName) {
        this.maskName = maskName;
        return this;
    }
    public String getMaskName() {
        return this.maskName;
    }

    public AddLogMaskConfigRequest setMaskRegex(String maskRegex) {
        this.maskRegex = maskRegex;
        return this;
    }
    public String getMaskRegex() {
        return this.maskRegex;
    }

    public AddLogMaskConfigRequest setMaskTxt(String maskTxt) {
        this.maskTxt = maskTxt;
        return this;
    }
    public String getMaskTxt() {
        return this.maskTxt;
    }

    public AddLogMaskConfigRequest setMaskDescription(String maskDescription) {
        this.maskDescription = maskDescription;
        return this;
    }
    public String getMaskDescription() {
        return this.maskDescription;
    }

}
