// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class EditLogMaskConfigRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("MaskId")
    public Integer maskId;

    @NameInMap("MaskName")
    public String maskName;

    @NameInMap("MaskRegex")
    public String maskRegex;

    @NameInMap("MaskTxt")
    public String maskTxt;

    @NameInMap("MaskDescription")
    public String maskDescription;

    public static EditLogMaskConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        EditLogMaskConfigRequest self = new EditLogMaskConfigRequest();
        return TeaModel.build(map, self);
    }

    public EditLogMaskConfigRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public EditLogMaskConfigRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public EditLogMaskConfigRequest setMaskId(Integer maskId) {
        this.maskId = maskId;
        return this;
    }
    public Integer getMaskId() {
        return this.maskId;
    }

    public EditLogMaskConfigRequest setMaskName(String maskName) {
        this.maskName = maskName;
        return this;
    }
    public String getMaskName() {
        return this.maskName;
    }

    public EditLogMaskConfigRequest setMaskRegex(String maskRegex) {
        this.maskRegex = maskRegex;
        return this;
    }
    public String getMaskRegex() {
        return this.maskRegex;
    }

    public EditLogMaskConfigRequest setMaskTxt(String maskTxt) {
        this.maskTxt = maskTxt;
        return this;
    }
    public String getMaskTxt() {
        return this.maskTxt;
    }

    public EditLogMaskConfigRequest setMaskDescription(String maskDescription) {
        this.maskDescription = maskDescription;
        return this;
    }
    public String getMaskDescription() {
        return this.maskDescription;
    }

}
