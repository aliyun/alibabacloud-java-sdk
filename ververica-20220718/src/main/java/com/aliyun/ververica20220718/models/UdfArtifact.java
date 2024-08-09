// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class UdfArtifact extends TeaModel {
    @NameInMap("artifactType")
    public String artifactType;

    @NameInMap("createdAt")
    public Long createdAt;

    @NameInMap("creator")
    public String creator;

    @NameInMap("dependencyJarUris")
    public java.util.List<String> dependencyJarUris;

    @NameInMap("jarUrl")
    public String jarUrl;

    @NameInMap("modifiedAt")
    public Long modifiedAt;

    @NameInMap("name")
    public String name;

    @NameInMap("namespace")
    public String namespace;

    @NameInMap("udfClasses")
    public java.util.List<UdfClass> udfClasses;

    public static UdfArtifact build(java.util.Map<String, ?> map) throws Exception {
        UdfArtifact self = new UdfArtifact();
        return TeaModel.build(map, self);
    }

    public UdfArtifact setArtifactType(String artifactType) {
        this.artifactType = artifactType;
        return this;
    }
    public String getArtifactType() {
        return this.artifactType;
    }

    public UdfArtifact setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public Long getCreatedAt() {
        return this.createdAt;
    }

    public UdfArtifact setCreator(String creator) {
        this.creator = creator;
        return this;
    }
    public String getCreator() {
        return this.creator;
    }

    public UdfArtifact setDependencyJarUris(java.util.List<String> dependencyJarUris) {
        this.dependencyJarUris = dependencyJarUris;
        return this;
    }
    public java.util.List<String> getDependencyJarUris() {
        return this.dependencyJarUris;
    }

    public UdfArtifact setJarUrl(String jarUrl) {
        this.jarUrl = jarUrl;
        return this;
    }
    public String getJarUrl() {
        return this.jarUrl;
    }

    public UdfArtifact setModifiedAt(Long modifiedAt) {
        this.modifiedAt = modifiedAt;
        return this;
    }
    public Long getModifiedAt() {
        return this.modifiedAt;
    }

    public UdfArtifact setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UdfArtifact setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public UdfArtifact setUdfClasses(java.util.List<UdfClass> udfClasses) {
        this.udfClasses = udfClasses;
        return this;
    }
    public java.util.List<UdfClass> getUdfClasses() {
        return this.udfClasses;
    }

}
