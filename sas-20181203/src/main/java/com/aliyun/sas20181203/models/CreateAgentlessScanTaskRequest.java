// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateAgentlessScanTaskRequest extends TeaModel {
    /**
     * <p>Identification of asset selection.</p>
     * 
     * <strong>example:</strong>
     * <p>AGENTLESS_SCAN_ONCE_TASK_1720145******</p>
     */
    @NameInMap("AssetSelectionType")
    public String assetSelectionType;

    /**
     * <p>The retention period of images. Unit: days.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AutoDeleteDays")
    public Integer autoDeleteDays;

    /**
     * <p>Specifies whether to enable the cost-saving mode. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ReleaseAfterScan")
    public Boolean releaseAfterScan;

    /**
     * <p>Specifies whether to check data disks. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ScanDataDisk")
    public Boolean scanDataDisk;

    /**
     * <p>The type of the detection object. Valid values:</p>
     * <ul>
     * <li><strong>2</strong>: image</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("TargetType")
    public Integer targetType;

    /**
     * <p>The UUIDs of the assets on which you want to run the detection task.</p>
     * <blockquote>
     * <p> You can call the <a href="~~DescribeCloudCenterInstances~~">DescribeCloudCenterInstances</a> operation to query the UUIDs of servers.</p>
     * </blockquote>
     */
    @NameInMap("UuidList")
    public java.util.List<String> uuidList;

    public static CreateAgentlessScanTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAgentlessScanTaskRequest self = new CreateAgentlessScanTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateAgentlessScanTaskRequest setAssetSelectionType(String assetSelectionType) {
        this.assetSelectionType = assetSelectionType;
        return this;
    }
    public String getAssetSelectionType() {
        return this.assetSelectionType;
    }

    public CreateAgentlessScanTaskRequest setAutoDeleteDays(Integer autoDeleteDays) {
        this.autoDeleteDays = autoDeleteDays;
        return this;
    }
    public Integer getAutoDeleteDays() {
        return this.autoDeleteDays;
    }

    public CreateAgentlessScanTaskRequest setReleaseAfterScan(Boolean releaseAfterScan) {
        this.releaseAfterScan = releaseAfterScan;
        return this;
    }
    public Boolean getReleaseAfterScan() {
        return this.releaseAfterScan;
    }

    public CreateAgentlessScanTaskRequest setScanDataDisk(Boolean scanDataDisk) {
        this.scanDataDisk = scanDataDisk;
        return this;
    }
    public Boolean getScanDataDisk() {
        return this.scanDataDisk;
    }

    public CreateAgentlessScanTaskRequest setTargetType(Integer targetType) {
        this.targetType = targetType;
        return this;
    }
    public Integer getTargetType() {
        return this.targetType;
    }

    public CreateAgentlessScanTaskRequest setUuidList(java.util.List<String> uuidList) {
        this.uuidList = uuidList;
        return this;
    }
    public java.util.List<String> getUuidList() {
        return this.uuidList;
    }

}
