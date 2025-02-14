// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeImageSecurityScanCountRequest extends TeaModel {
    /**
     * <p>Cluster ID for image security scanning.</p>
     * 
     * <strong>example:</strong>
     * <p>cdbbe7aa56cbf4b8f830f83718d26****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>Whether it has been processed. Values:</p>
     * <ul>
     * <li><strong>Y</strong>: Processed </li>
     * <li><strong>N</strong>: Not processed </li>
     * <li><strong>A</strong>: All</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>N</p>
     */
    @NameInMap("Dealed")
    public String dealed;

    /**
     * <p>SHA256 value of the image digest.</p>
     * 
     * <strong>example:</strong>
     * <p>a7978d51f5eddf7612ab15ae46bd4b4257bf59da77c2aafc9d9d8ab41bb3****</p>
     */
    @NameInMap("ImageDigest")
    public String imageDigest;

    /**
     * <p>Image tag.</p>
     * 
     * <strong>example:</strong>
     * <p>c958b80f-prd_default-9bb0****</p>
     */
    @NameInMap("ImageTag")
    public String imageTag;

    /**
     * <p>Image UUID.</p>
     * 
     * <strong>example:</strong>
     * <p>325bfa067ae6c678e59e8a1b34cc****</p>
     */
    @NameInMap("ImageUuid")
    public String imageUuid;

    /**
     * <p>Container image repository ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3df5b5a1f2339eb7ebc7d474b8d4****</p>
     */
    @NameInMap("RepoId")
    public String repoId;

    /**
     * <p>Specifies the container image instance ID.</p>
     * <blockquote>
     * <p>Call the <a href="~~DescribeImageInstances~~">DescribeImageInstances</a> API to obtain this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cri-p2jahwuuwuk7****</p>
     */
    @NameInMap("RepoInstanceId")
    public String repoInstanceId;

    /**
     * <p>The region ID of the container image repository.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RepoRegionId")
    public String repoRegionId;

    /**
     * <p>Scanning scope.</p>
     */
    @NameInMap("ScanRange")
    public java.util.List<String> scanRange;

    /**
     * <p>Instance IDs for image security scanning.</p>
     */
    @NameInMap("Uuids")
    public java.util.List<String> uuids;

    public static DescribeImageSecurityScanCountRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageSecurityScanCountRequest self = new DescribeImageSecurityScanCountRequest();
        return TeaModel.build(map, self);
    }

    public DescribeImageSecurityScanCountRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DescribeImageSecurityScanCountRequest setDealed(String dealed) {
        this.dealed = dealed;
        return this;
    }
    public String getDealed() {
        return this.dealed;
    }

    public DescribeImageSecurityScanCountRequest setImageDigest(String imageDigest) {
        this.imageDigest = imageDigest;
        return this;
    }
    public String getImageDigest() {
        return this.imageDigest;
    }

    public DescribeImageSecurityScanCountRequest setImageTag(String imageTag) {
        this.imageTag = imageTag;
        return this;
    }
    public String getImageTag() {
        return this.imageTag;
    }

    public DescribeImageSecurityScanCountRequest setImageUuid(String imageUuid) {
        this.imageUuid = imageUuid;
        return this;
    }
    public String getImageUuid() {
        return this.imageUuid;
    }

    public DescribeImageSecurityScanCountRequest setRepoId(String repoId) {
        this.repoId = repoId;
        return this;
    }
    public String getRepoId() {
        return this.repoId;
    }

    public DescribeImageSecurityScanCountRequest setRepoInstanceId(String repoInstanceId) {
        this.repoInstanceId = repoInstanceId;
        return this;
    }
    public String getRepoInstanceId() {
        return this.repoInstanceId;
    }

    public DescribeImageSecurityScanCountRequest setRepoRegionId(String repoRegionId) {
        this.repoRegionId = repoRegionId;
        return this;
    }
    public String getRepoRegionId() {
        return this.repoRegionId;
    }

    public DescribeImageSecurityScanCountRequest setScanRange(java.util.List<String> scanRange) {
        this.scanRange = scanRange;
        return this;
    }
    public java.util.List<String> getScanRange() {
        return this.scanRange;
    }

    public DescribeImageSecurityScanCountRequest setUuids(java.util.List<String> uuids) {
        this.uuids = uuids;
        return this;
    }
    public java.util.List<String> getUuids() {
        return this.uuids;
    }

}
