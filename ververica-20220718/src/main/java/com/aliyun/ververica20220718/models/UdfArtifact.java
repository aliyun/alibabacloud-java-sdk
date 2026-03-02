// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class UdfArtifact extends TeaModel {
    /**
     * <p>The type of the JAR file.</p>
     * 
     * <strong>example:</strong>
     * <p>ARTIFACT_TYPE_JAVA</p>
     */
    @NameInMap("artifactType")
    public String artifactType;

    /**
     * <p>The time when the JAR file was created.</p>
     * 
     * <strong>example:</strong>
     * <p>1723532876</p>
     */
    @NameInMap("createdAt")
    public Long createdAt;

    /**
     * <p>The user that creates the JAR file.</p>
     * 
     * <strong>example:</strong>
     * <p>userA</p>
     */
    @NameInMap("creator")
    public String creator;

    /**
     * <p>The list of paths in which the additional dependencies of the JAR file are stored.</p>
     */
    @NameInMap("dependencyJarUris")
    public java.util.List<String> dependencyJarUris;

    /**
     * <p>The path in which the JAR file is stored.</p>
     * 
     * <strong>example:</strong>
     * <p>oss://bucket/udfCollection.jar</p>
     */
    @NameInMap("jarUrl")
    public String jarUrl;

    /**
     * <p>The time when the JAR file was modified.</p>
     * 
     * <strong>example:</strong>
     * <p>1723537876</p>
     */
    @NameInMap("modifiedAt")
    public Long modifiedAt;

    /**
     * <p>The name of the JAR file.</p>
     * 
     * <strong>example:</strong>
     * <p>udfCollection.jar</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The namespace.</p>
     * 
     * <strong>example:</strong>
     * <p>default-namespace</p>
     */
    @NameInMap("namespace")
    public String namespace;

    /**
     * <p>The list of the class name of the JAR file.</p>
     */
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
