// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class CreateCustomImageRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must ensure that it is unique among different requests. The **ClientToken** value can only contain ASCII characters and cannot exceed 64 characters in length. For more information, see [How to ensure idempotence](~~25693~~).</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The ID of the data disk snapshot.</p>
     */
    @NameInMap("DataSnapshotId")
    public String dataSnapshotId;

    /**
     * <p>The description of the custom image.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The name of the custom image. The name must be 2 to 128 characters in length, and can contain letters, digits, colons (:), underscores (\_), and hyphens (-). The name must start with a letter or a digit.</p>
     * <br>
     * <p>This parameter is empty by default.</p>
     */
    @NameInMap("ImageName")
    public String imageName;

    /**
     * <p>The ID of the simple application server.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The region ID of the simple application server. You can call the [ListRegions](~~189315~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the system disk snapshot.</p>
     */
    @NameInMap("SystemSnapshotId")
    public String systemSnapshotId;

    public static CreateCustomImageRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCustomImageRequest self = new CreateCustomImageRequest();
        return TeaModel.build(map, self);
    }

    public CreateCustomImageRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateCustomImageRequest setDataSnapshotId(String dataSnapshotId) {
        this.dataSnapshotId = dataSnapshotId;
        return this;
    }
    public String getDataSnapshotId() {
        return this.dataSnapshotId;
    }

    public CreateCustomImageRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateCustomImageRequest setImageName(String imageName) {
        this.imageName = imageName;
        return this;
    }
    public String getImageName() {
        return this.imageName;
    }

    public CreateCustomImageRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateCustomImageRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateCustomImageRequest setSystemSnapshotId(String systemSnapshotId) {
        this.systemSnapshotId = systemSnapshotId;
        return this;
    }
    public String getSystemSnapshotId() {
        return this.systemSnapshotId;
    }

}
