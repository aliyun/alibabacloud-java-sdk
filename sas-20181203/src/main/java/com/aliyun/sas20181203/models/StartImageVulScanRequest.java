// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class StartImageVulScanRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("RepoRegionId")
    public String repoRegionId;

    @NameInMap("RepoInstanceId")
    public String repoInstanceId;

    @NameInMap("RepoId")
    public String repoId;

    @NameInMap("RepName")
    public String repName;

    @NameInMap("RepoNamespace")
    public String repoNamespace;

    @NameInMap("ImageTag")
    public String imageTag;

    @NameInMap("ImageDigest")
    public String imageDigest;

    @NameInMap("ImageLayer")
    public String imageLayer;

    @NameInMap("RegistryTypes")
    public java.util.List<String> registryTypes;

    public static StartImageVulScanRequest build(java.util.Map<String, ?> map) throws Exception {
        StartImageVulScanRequest self = new StartImageVulScanRequest();
        return TeaModel.build(map, self);
    }

    public StartImageVulScanRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public StartImageVulScanRequest setRepoRegionId(String repoRegionId) {
        this.repoRegionId = repoRegionId;
        return this;
    }
    public String getRepoRegionId() {
        return this.repoRegionId;
    }

    public StartImageVulScanRequest setRepoInstanceId(String repoInstanceId) {
        this.repoInstanceId = repoInstanceId;
        return this;
    }
    public String getRepoInstanceId() {
        return this.repoInstanceId;
    }

    public StartImageVulScanRequest setRepoId(String repoId) {
        this.repoId = repoId;
        return this;
    }
    public String getRepoId() {
        return this.repoId;
    }

    public StartImageVulScanRequest setRepName(String repName) {
        this.repName = repName;
        return this;
    }
    public String getRepName() {
        return this.repName;
    }

    public StartImageVulScanRequest setRepoNamespace(String repoNamespace) {
        this.repoNamespace = repoNamespace;
        return this;
    }
    public String getRepoNamespace() {
        return this.repoNamespace;
    }

    public StartImageVulScanRequest setImageTag(String imageTag) {
        this.imageTag = imageTag;
        return this;
    }
    public String getImageTag() {
        return this.imageTag;
    }

    public StartImageVulScanRequest setImageDigest(String imageDigest) {
        this.imageDigest = imageDigest;
        return this;
    }
    public String getImageDigest() {
        return this.imageDigest;
    }

    public StartImageVulScanRequest setImageLayer(String imageLayer) {
        this.imageLayer = imageLayer;
        return this;
    }
    public String getImageLayer() {
        return this.imageLayer;
    }

    public StartImageVulScanRequest setRegistryTypes(java.util.List<String> registryTypes) {
        this.registryTypes = registryTypes;
        return this;
    }
    public java.util.List<String> getRegistryTypes() {
        return this.registryTypes;
    }

}
