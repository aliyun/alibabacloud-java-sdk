// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class ModifyColumnarClassRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>polarx.n8.large.col</p>
     */
    @NameInMap("ColumnarClass")
    public String columnarClass;

    /**
     * <strong>example:</strong>
     * <p>**</p>
     */
    @NameInMap("ColumnarNodeCount")
    public String columnarNodeCount;

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

    public static ModifyColumnarClassRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyColumnarClassRequest self = new ModifyColumnarClassRequest();
        return TeaModel.build(map, self);
    }

    public ModifyColumnarClassRequest setColumnarClass(String columnarClass) {
        this.columnarClass = columnarClass;
        return this;
    }
    public String getColumnarClass() {
        return this.columnarClass;
    }

    public ModifyColumnarClassRequest setColumnarNodeCount(String columnarNodeCount) {
        this.columnarNodeCount = columnarNodeCount;
        return this;
    }
    public String getColumnarNodeCount() {
        return this.columnarNodeCount;
    }

    public ModifyColumnarClassRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public ModifyColumnarClassRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyColumnarClassRequest setSwitchMode(String switchMode) {
        this.switchMode = switchMode;
        return this;
    }
    public String getSwitchMode() {
        return this.switchMode;
    }

}
