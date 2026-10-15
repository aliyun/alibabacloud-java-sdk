// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sandbox20260820.models;

import com.aliyun.tea.*;

public class E2BVolume extends TeaModel {
    /**
     * <p>The AgenticBucket volume configuration.</p>
     */
    @NameInMap("agenticBucketVolumeConfig")
    public AgenticBucketVolumeConfig agenticBucketVolumeConfig;

    /**
     * <p>The AgenticFS volume configuration.</p>
     */
    @NameInMap("agenticFSVolumeConfig")
    public AgenticFSVolumeConfig agenticFSVolumeConfig;

    /**
     * <p>The time when the volume was created, in UTC. The time is in the yyyy-MM-ddTHH:mm:ss.SSSSSSZ format, with exactly 6 decimal places for fractional seconds (microsecond precision).</p>
     * 
     * <strong>example:</strong>
     * <p>2026-09-07T02:12:36.531000Z</p>
     */
    @NameInMap("createdAt")
    public String createdAt;

    /**
     * <p>The JuiceFS volume configuration.</p>
     */
    @NameInMap("juiceFSVolumeConfig")
    public JuiceFSVolumeConfig juiceFSVolumeConfig;

    /**
     * <p>The mount configuration.</p>
     */
    @NameInMap("mountConfig")
    public VolumeMountConfig mountConfig;

    /**
     * <p>The OSS volume configuration.</p>
     */
    @NameInMap("ossVolumeConfig")
    public OSSVolumeConfig ossVolumeConfig;

    /**
     * <p>The resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-****</p>
     */
    @NameInMap("resourceGroupID")
    public String resourceGroupID;

    /**
     * <p>The volume status. Valid values:</p>
     * <ul>
     * <li>AVAILABLE</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>AVAILABLE</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <p>The status reason.</p>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("statusReason")
    public String statusReason;

    /**
     * <p>The storage type. Valid values:</p>
     * <ul>
     * <li>OSS</li>
     * <li>AGENTIC_FS</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OSS</p>
     */
    @NameInMap("storageClass")
    public String storageClass;

    /**
     * <p>The unique identifier of the team.</p>
     * 
     * <strong>example:</strong>
     * <p>9f5a1fe9-****</p>
     */
    @NameInMap("teamID")
    public String teamID;

    /**
     * <p>The time when the volume was last updated, in UTC. The time is in the yyyy-MM-ddTHH:mm:ss.SSSSSSZ format, with exactly 6 decimal places for fractional seconds (microsecond precision).</p>
     * 
     * <strong>example:</strong>
     * <p>2026-09-07T03:48:05.274000Z</p>
     */
    @NameInMap("updatedAt")
    public String updatedAt;

    /**
     * <p>The UID of the creator.</p>
     * 
     * <strong>example:</strong>
     * <p>2000****</p>
     */
    @NameInMap("userID")
    public String userID;

    /**
     * <p>The unique identifier of the volume.</p>
     * 
     * <strong>example:</strong>
     * <p>25878d34-****</p>
     */
    @NameInMap("volumeID")
    public String volumeID;

    /**
     * <p>The name, which is unique within the team.</p>
     * 
     * <strong>example:</strong>
     * <p>workspace</p>
     */
    @NameInMap("volumeName")
    public String volumeName;

    public static E2BVolume build(java.util.Map<String, ?> map) throws Exception {
        E2BVolume self = new E2BVolume();
        return TeaModel.build(map, self);
    }

    public E2BVolume setAgenticBucketVolumeConfig(AgenticBucketVolumeConfig agenticBucketVolumeConfig) {
        this.agenticBucketVolumeConfig = agenticBucketVolumeConfig;
        return this;
    }
    public AgenticBucketVolumeConfig getAgenticBucketVolumeConfig() {
        return this.agenticBucketVolumeConfig;
    }

    public E2BVolume setAgenticFSVolumeConfig(AgenticFSVolumeConfig agenticFSVolumeConfig) {
        this.agenticFSVolumeConfig = agenticFSVolumeConfig;
        return this;
    }
    public AgenticFSVolumeConfig getAgenticFSVolumeConfig() {
        return this.agenticFSVolumeConfig;
    }

    public E2BVolume setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public String getCreatedAt() {
        return this.createdAt;
    }

    public E2BVolume setJuiceFSVolumeConfig(JuiceFSVolumeConfig juiceFSVolumeConfig) {
        this.juiceFSVolumeConfig = juiceFSVolumeConfig;
        return this;
    }
    public JuiceFSVolumeConfig getJuiceFSVolumeConfig() {
        return this.juiceFSVolumeConfig;
    }

    public E2BVolume setMountConfig(VolumeMountConfig mountConfig) {
        this.mountConfig = mountConfig;
        return this;
    }
    public VolumeMountConfig getMountConfig() {
        return this.mountConfig;
    }

    public E2BVolume setOssVolumeConfig(OSSVolumeConfig ossVolumeConfig) {
        this.ossVolumeConfig = ossVolumeConfig;
        return this;
    }
    public OSSVolumeConfig getOssVolumeConfig() {
        return this.ossVolumeConfig;
    }

    public E2BVolume setResourceGroupID(String resourceGroupID) {
        this.resourceGroupID = resourceGroupID;
        return this;
    }
    public String getResourceGroupID() {
        return this.resourceGroupID;
    }

    public E2BVolume setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public E2BVolume setStatusReason(String statusReason) {
        this.statusReason = statusReason;
        return this;
    }
    public String getStatusReason() {
        return this.statusReason;
    }

    public E2BVolume setStorageClass(String storageClass) {
        this.storageClass = storageClass;
        return this;
    }
    public String getStorageClass() {
        return this.storageClass;
    }

    public E2BVolume setTeamID(String teamID) {
        this.teamID = teamID;
        return this;
    }
    public String getTeamID() {
        return this.teamID;
    }

    public E2BVolume setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    public String getUpdatedAt() {
        return this.updatedAt;
    }

    public E2BVolume setUserID(String userID) {
        this.userID = userID;
        return this;
    }
    public String getUserID() {
        return this.userID;
    }

    public E2BVolume setVolumeID(String volumeID) {
        this.volumeID = volumeID;
        return this;
    }
    public String getVolumeID() {
        return this.volumeID;
    }

    public E2BVolume setVolumeName(String volumeName) {
        this.volumeName = volumeName;
        return this;
    }
    public String getVolumeName() {
        return this.volumeName;
    }

}
