// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateAgentlessScanTaskRequest extends TeaModel {
    /**
     * <p>The asset selection identifier.</p>
     * 
     * <strong>example:</strong>
     * <p>AGENTLESS_SCAN_ONCE_TASK_1720145******</p>
     */
    @NameInMap("AssetSelectionType")
    public String assetSelectionType;

    /**
     * <p>The image retention period, in days. This parameter takes effect only for host detection and does not take effect for user snapshot detection or user custom image detection.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AutoDeleteDays")
    public Integer autoDeleteDays;

    /**
     * <p>The idempotency key.</p>
     * 
     * <strong>example:</strong>
     * <p>66a9c708-d4a4-4fe</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The region ID of the instance to query. Valid values:</p>
     * <ul>
     * <li><strong>cn-hangzhou</strong> (default): China.</li>
     * <li><strong>ap-southeast-1</strong>: outside China.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>Specifies whether to enable the cost-saving mode. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Enabled.</li>
     * <li><strong>false</strong>: Disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ReleaseAfterScan")
    public Boolean releaseAfterScan;

    /**
     * <p>Specifies whether to detect data cloud disks. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Detected.</li>
     * <li><strong>false</strong>: Not detected.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ScanDataDisk")
    public Boolean scanDataDisk;

    /**
     * <p>The target type. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: Host detection - detection by snapshot.</li>
     * <li><strong>2</strong>: Host detection - detection by image.</li>
     * <li><strong>3</strong>: User snapshot detection.</li>
     * <li><strong>2</strong>: User custom image detection.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("TargetType")
    public Integer targetType;

    /**
     * <p>The UUIDs of the assets to be detected.</p>
     * <blockquote>
     * <p>You can call the <a href="~~DescribeCloudCenterInstances~~">DescribeCloudCenterInstances</a> operation to obtain the UUIDs of servers.</p>
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

    public CreateAgentlessScanTaskRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateAgentlessScanTaskRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
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
