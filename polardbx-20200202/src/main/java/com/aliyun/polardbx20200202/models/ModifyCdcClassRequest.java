// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class ModifyCdcClassRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CDCNodeCount")
    public String CDCNodeCount;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>premium</p>
     */
    @NameInMap("CdcClass")
    public String cdcClass;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pxc-hzrh51fze****pon-cdc</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("SwitchMode")
    public String switchMode;

    public static ModifyCdcClassRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyCdcClassRequest self = new ModifyCdcClassRequest();
        return TeaModel.build(map, self);
    }

    public ModifyCdcClassRequest setCDCNodeCount(String CDCNodeCount) {
        this.CDCNodeCount = CDCNodeCount;
        return this;
    }
    public String getCDCNodeCount() {
        return this.CDCNodeCount;
    }

    public ModifyCdcClassRequest setCdcClass(String cdcClass) {
        this.cdcClass = cdcClass;
        return this;
    }
    public String getCdcClass() {
        return this.cdcClass;
    }

    public ModifyCdcClassRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public ModifyCdcClassRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyCdcClassRequest setSwitchMode(String switchMode) {
        this.switchMode = switchMode;
        return this;
    }
    public String getSwitchMode() {
        return this.switchMode;
    }

}
