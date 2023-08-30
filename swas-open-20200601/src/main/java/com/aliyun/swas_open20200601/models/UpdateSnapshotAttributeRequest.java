// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class UpdateSnapshotAttributeRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The value of **ClientToken** can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see [How to ensure idempotence](~~25693~~).</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The region ID of the simple application server. You can call the [ListRegions](~~189315~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The remarks of the snapshot of the simple application server.</p>
     */
    @NameInMap("Remark")
    public String remark;

    /**
     * <p>The snapshot ID. You can call the ListSnapshots operation to query the snapshot ID.</p>
     */
    @NameInMap("SnapshotId")
    public String snapshotId;

    public static UpdateSnapshotAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSnapshotAttributeRequest self = new UpdateSnapshotAttributeRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSnapshotAttributeRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateSnapshotAttributeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateSnapshotAttributeRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public UpdateSnapshotAttributeRequest setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
        return this;
    }
    public String getSnapshotId() {
        return this.snapshotId;
    }

}
