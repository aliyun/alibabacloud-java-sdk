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
     * <p>The retention period of the image, in days. This parameter takes effect only for host detection and does not take effect for user snapshot detection or custom image detection.</p>
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
     * <p>The source of the API call. This parameter is used to collect statistics on the number of scan tasks and the amount of scanned data by source. If this parameter is not specified, it is left empty.</p>
     * 
     * <strong>example:</strong>
     * <p>image-console</p>
     */
    @NameInMap("From")
    public String from;

    /**
     * <p>The region ID. This parameter is usually automatically populated by the gateway.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>Specifies whether to enable the cost-saving mode. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Enable.</li>
     * <li><strong>false</strong>: Disable.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ReleaseAfterScan")
    public Boolean releaseAfterScan;

    /**
     * <p>The region ID of the resource to be detected, such as cn-hangzhou.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("ResourceRegionId")
    public String resourceRegionId;

    /**
     * <p>Specifies whether to detect data cloud disks. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Yes.</li>
     * <li><strong>false</strong>: No.</li>
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
     * <li><strong>1</strong>: Host detection by using snapshots.</li>
     * <li><strong>2</strong>: Host detection by using images.</li>
     * <li><strong>3</strong>: User snapshot detection.</li>
     * <li><strong>2</strong>: Custom image detection.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("TargetType")
    public Integer targetType;

    /**
     * <p>The list of targets for image security remediation. Each target specifies the source image, the region, the name of the remediated image, and the identifiers of the vulnerabilities to be remediated.</p>
     */
    @NameInMap("Targets")
    public java.util.List<CreateAgentlessScanTaskRequestTargets> targets;

    /**
     * <p>The UUIDs of the assets to be detected.</p>
     * <blockquote>
     * <p>You can call the <a href="~~DescribeCloudCenterInstances~~">DescribeCloudCenterInstances</a> operation to obtain the UUID of the server.</p>
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

    public CreateAgentlessScanTaskRequest setFrom(String from) {
        this.from = from;
        return this;
    }
    public String getFrom() {
        return this.from;
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

    public CreateAgentlessScanTaskRequest setResourceRegionId(String resourceRegionId) {
        this.resourceRegionId = resourceRegionId;
        return this;
    }
    public String getResourceRegionId() {
        return this.resourceRegionId;
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

    public CreateAgentlessScanTaskRequest setTargets(java.util.List<CreateAgentlessScanTaskRequestTargets> targets) {
        this.targets = targets;
        return this;
    }
    public java.util.List<CreateAgentlessScanTaskRequestTargets> getTargets() {
        return this.targets;
    }

    public CreateAgentlessScanTaskRequest setUuidList(java.util.List<String> uuidList) {
        this.uuidList = uuidList;
        return this;
    }
    public java.util.List<String> getUuidList() {
        return this.uuidList;
    }

    public static class CreateAgentlessScanTaskRequestTargets extends TeaModel {
        /**
         * <p>The ID of the source ECS custom image to be remediated. The image must be located in the region specified by the RegionId parameter of the target.</p>
         * 
         * <strong>example:</strong>
         * <p>m-bp1example123456789</p>
         */
        @NameInMap("ImageId")
        public String imageId;

        /**
         * <p>The name of the source ECS custom image to be remediated.</p>
         * 
         * <strong>example:</strong>
         * <p>source-image</p>
         */
        @NameInMap("OriginImageName")
        public String originImageName;

        /**
         * <p>The name of the ECS image generated after the remediation is completed.</p>
         * 
         * <strong>example:</strong>
         * <p>patched-image-20260909</p>
         */
        @NameInMap("OutputImageName")
        public String outputImageName;

        /**
         * <p>The region ID of the source image to be remediated, such as cn-hangzhou.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The list of vulnerability identifiers to be remediated in this task. You must specify at least one vulnerability identifier. The identifiers cannot be empty or duplicate.</p>
         */
        @NameInMap("VulnerabilityIds")
        public java.util.List<String> vulnerabilityIds;

        public static CreateAgentlessScanTaskRequestTargets build(java.util.Map<String, ?> map) throws Exception {
            CreateAgentlessScanTaskRequestTargets self = new CreateAgentlessScanTaskRequestTargets();
            return TeaModel.build(map, self);
        }

        public CreateAgentlessScanTaskRequestTargets setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public CreateAgentlessScanTaskRequestTargets setOriginImageName(String originImageName) {
            this.originImageName = originImageName;
            return this;
        }
        public String getOriginImageName() {
            return this.originImageName;
        }

        public CreateAgentlessScanTaskRequestTargets setOutputImageName(String outputImageName) {
            this.outputImageName = outputImageName;
            return this;
        }
        public String getOutputImageName() {
            return this.outputImageName;
        }

        public CreateAgentlessScanTaskRequestTargets setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public CreateAgentlessScanTaskRequestTargets setVulnerabilityIds(java.util.List<String> vulnerabilityIds) {
            this.vulnerabilityIds = vulnerabilityIds;
            return this;
        }
        public java.util.List<String> getVulnerabilityIds() {
            return this.vulnerabilityIds;
        }

    }

}
