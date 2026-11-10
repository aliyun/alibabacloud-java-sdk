// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sandbox20260820.models;

import com.aliyun.tea.*;

public class E2BSnapshot extends TeaModel {
    /**
     * <p>The CPU specifications of the snapshot.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("cpuCount")
    public Float cpuCount;

    /**
     * <p>The creation time of the snapshot.</p>
     * 
     * <strong>example:</strong>
     * <p>1793685726000</p>
     */
    @NameInMap("createdTime")
    public String createdTime;

    /**
     * <p>The expiration time of the snapshot.</p>
     * 
     * <strong>example:</strong>
     * <p>1796277726000</p>
     */
    @NameInMap("expiredTime")
    public String expiredTime;

    /**
     * <p>The memory specifications of the snapshot.</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("memoryMB")
    public Integer memoryMB;

    /**
     * <p>The short name of the snapshot.</p>
     * 
     * <strong>example:</strong>
     * <p>name</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-****</p>
     */
    @NameInMap("resourceGroupID")
    public String resourceGroupID;

    /**
     * <p>The snapshot ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0d66****b374</p>
     */
    @NameInMap("snapshotID")
    public String snapshotID;

    /**
     * <p>The source sandbox ID.</p>
     * 
     * <strong>example:</strong>
     * <p>sbx-****</p>
     */
    @NameInMap("sourceSandboxID")
    public String sourceSandboxID;

    /**
     * <p>The snapshot status.</p>
     * 
     * <strong>example:</strong>
     * <p>Available</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <p>The snapshot tag.</p>
     * 
     * <strong>example:</strong>
     * <p>tag</p>
     */
    @NameInMap("tag")
    public String tag;

    /**
     * <p>The team ID.</p>
     * 
     * <strong>example:</strong>
     * <p>9A66****b892</p>
     */
    @NameInMap("teamID")
    public String teamID;

    /**
     * <p>The team name.</p>
     * 
     * <strong>example:</strong>
     * <p>teamName</p>
     */
    @NameInMap("teamName")
    public String teamName;

    /**
     * <p>The Alibaba Cloud account ID.</p>
     * 
     * <strong>example:</strong>
     * <p>155****</p>
     */
    @NameInMap("userID")
    public String userID;

    public static E2BSnapshot build(java.util.Map<String, ?> map) throws Exception {
        E2BSnapshot self = new E2BSnapshot();
        return TeaModel.build(map, self);
    }

    public E2BSnapshot setCpuCount(Float cpuCount) {
        this.cpuCount = cpuCount;
        return this;
    }
    public Float getCpuCount() {
        return this.cpuCount;
    }

    public E2BSnapshot setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }
    public String getCreatedTime() {
        return this.createdTime;
    }

    public E2BSnapshot setExpiredTime(String expiredTime) {
        this.expiredTime = expiredTime;
        return this;
    }
    public String getExpiredTime() {
        return this.expiredTime;
    }

    public E2BSnapshot setMemoryMB(Integer memoryMB) {
        this.memoryMB = memoryMB;
        return this;
    }
    public Integer getMemoryMB() {
        return this.memoryMB;
    }

    public E2BSnapshot setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public E2BSnapshot setResourceGroupID(String resourceGroupID) {
        this.resourceGroupID = resourceGroupID;
        return this;
    }
    public String getResourceGroupID() {
        return this.resourceGroupID;
    }

    public E2BSnapshot setSnapshotID(String snapshotID) {
        this.snapshotID = snapshotID;
        return this;
    }
    public String getSnapshotID() {
        return this.snapshotID;
    }

    public E2BSnapshot setSourceSandboxID(String sourceSandboxID) {
        this.sourceSandboxID = sourceSandboxID;
        return this;
    }
    public String getSourceSandboxID() {
        return this.sourceSandboxID;
    }

    public E2BSnapshot setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public E2BSnapshot setTag(String tag) {
        this.tag = tag;
        return this;
    }
    public String getTag() {
        return this.tag;
    }

    public E2BSnapshot setTeamID(String teamID) {
        this.teamID = teamID;
        return this;
    }
    public String getTeamID() {
        return this.teamID;
    }

    public E2BSnapshot setTeamName(String teamName) {
        this.teamName = teamName;
        return this;
    }
    public String getTeamName() {
        return this.teamName;
    }

    public E2BSnapshot setUserID(String userID) {
        this.userID = userID;
        return this;
    }
    public String getUserID() {
        return this.userID;
    }

}
