// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class PublicPreCheckImageScanTaskRequest extends TeaModel {
    /**
     * <p>The SHA-256 value of the image digest. Separate multiple SHA-256 values with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>6a5e103187b31a94592a47a5858617f7****</p>
     */
    @NameInMap("Digests")
    public String digests;

    /**
     * <p>The ID of the Container Registry instance in which the image repository is created. Separate multiple IDs with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>i-uf6j8vq9l4r5ntht****</p>
     */
    @NameInMap("InstanceIds")
    public String instanceIds;

    /**
     * <p>The region ID of the image. Separate multiple IDs with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionIds")
    public String regionIds;

    /**
     * <p>The type of the image repository. Separate multiple types with commas (,). Valid values:</p>
     * <ul>
     * <li><strong>acr</strong></li>
     * <li><strong>harbor</strong></li>
     * <li><strong>quay</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>acr</p>
     */
    @NameInMap("RegistryTypes")
    public String registryTypes;

    /**
     * <p>The ID of the image repository. Separate multiple IDs with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>crr-vridcl4****</p>
     */
    @NameInMap("RepoIds")
    public String repoIds;

    /**
     * <p>The name of the image repository. Separate multiple names with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>centos</p>
     */
    @NameInMap("RepoNames")
    public String repoNames;

    /**
     * <p>The namespace to which the image repository belongs. Separate multiple namespaces with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>hanghai-namespace</p>
     */
    @NameInMap("RepoNamespaces")
    public String repoNamespaces;

    /**
     * <p>The source IP address of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>192.168.XX.XX</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    /**
     * <p>The tag that is added to the image. Separate multiple tags with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>0.2</p>
     */
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
