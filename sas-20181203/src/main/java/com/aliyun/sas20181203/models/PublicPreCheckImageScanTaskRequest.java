// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class PublicPreCheckImageScanTaskRequest extends TeaModel {
    @NameInMap("Digests")
    public String digests;

    @NameInMap("InstanceIds")
    public String instanceIds;

    @NameInMap("RegionIds")
    public String regionIds;

    @NameInMap("RegistryTypes")
    public String registryTypes;

    @NameInMap("RepoIds")
    public String repoIds;

    @NameInMap("RepoNames")
    public String repoNames;

    @NameInMap("RepoNamespaces")
    public String repoNamespaces;

    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("Tags")
    public String tags;

    public static PublicPreCheckImageScanTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        PublicPreCheckImageScanTaskRequest self = new PublicPreCheckImageScanTaskRequest();
        return TeaModel.build(map, self);
    }

    public PublicPreCheckImageScanTaskRequest setDigests(String digests) {
        this.digests = digests;
        return this;
    }
    public String getDigests() {
        return this.digests;
    }

    public PublicPreCheckImageScanTaskRequest setInstanceIds(String instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public String getInstanceIds() {
        return this.instanceIds;
    }

    public PublicPreCheckImageScanTaskRequest setRegionIds(String regionIds) {
        this.regionIds = regionIds;
        return this;
    }
    public String getRegionIds() {
        return this.regionIds;
    }

    public PublicPreCheckImageScanTaskRequest setRegistryTypes(String registryTypes) {
        this.registryTypes = registryTypes;
        return this;
    }
    public String getRegistryTypes() {
        return this.registryTypes;
    }

    public PublicPreCheckImageScanTaskRequest setRepoIds(String repoIds) {
        this.repoIds = repoIds;
        return this;
    }
    public String getRepoIds() {
        return this.repoIds;
    }

    public PublicPreCheckImageScanTaskRequest setRepoNames(String repoNames) {
        this.repoNames = repoNames;
        return this;
    }
    public String getRepoNames() {
        return this.repoNames;
    }

    public PublicPreCheckImageScanTaskRequest setRepoNamespaces(String repoNamespaces) {
        this.repoNamespaces = repoNamespaces;
        return this;
    }
    public String getRepoNamespaces() {
        return this.repoNamespaces;
    }

    public PublicPreCheckImageScanTaskRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public PublicPreCheckImageScanTaskRequest setTags(String tags) {
        this.tags = tags;
        return this;
    }
    public String getTags() {
        return this.tags;
    }

}
