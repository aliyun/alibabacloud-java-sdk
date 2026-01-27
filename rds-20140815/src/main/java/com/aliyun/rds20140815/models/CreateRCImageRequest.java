// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CreateRCImageRequest extends TeaModel {
    /**
     * <p>The name of the custom image.</p>
     * 
     * <strong>example:</strong>
     * <p>Created_from_rc-vma9w5z699x9********</p>
     */
    @NameInMap("ImageName")
    public String imageName;

    /**
     * <p>The ID of the RDS Custom instance.</p>
     * 
     * <strong>example:</strong>
     * <p>rc-vma9w5z699x93204****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The region ID. You can call the DescribeRegions operation to query the most recent region list.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the snapshot from which to create the custom image. You can call the DescribeRCSnapshots operation to query the snapshot ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rcds-c9bjdl79vz5dx********</p>
     */
    @NameInMap("SnapshotId")
    public String snapshotId;

    public static CreateRCImageRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRCImageRequest self = new CreateRCImageRequest();
        return TeaModel.build(map, self);
    }

    public CreateRCImageRequest setImageName(String imageName) {
        this.imageName = imageName;
        return this;
    }
    public String getImageName() {
        return this.imageName;
    }

    public CreateRCImageRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateRCImageRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateRCImageRequest setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
        return this;
    }
    public String getSnapshotId() {
        return this.snapshotId;
    }

}
