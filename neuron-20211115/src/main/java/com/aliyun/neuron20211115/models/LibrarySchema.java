// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class LibrarySchema extends TeaModel {
    @NameInMap("artifactId")
    public String artifactId;

    @NameInMap("description")
    public String description;

    @NameInMap("gitGroup")
    public String gitGroup;

    @NameInMap("groupId")
    public String groupId;

    @NameInMap("id")
    public Long id;

    @NameInMap("industry")
    public String industry;

    @NameInMap("name")
    public String name;

    @NameInMap("provider")
    public Provider provider;

    @NameInMap("version")
    public String version;

    public static LibrarySchema build(java.util.Map<String, ?> map) throws Exception {
        LibrarySchema self = new LibrarySchema();
        return TeaModel.build(map, self);
    }

    public LibrarySchema setArtifactId(String artifactId) {
        this.artifactId = artifactId;
        return this;
    }
    public String getArtifactId() {
        return this.artifactId;
    }

    public LibrarySchema setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public LibrarySchema setGitGroup(String gitGroup) {
        this.gitGroup = gitGroup;
        return this;
    }
    public String getGitGroup() {
        return this.gitGroup;
    }

    public LibrarySchema setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public LibrarySchema setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public LibrarySchema setIndustry(String industry) {
        this.industry = industry;
        return this;
    }
    public String getIndustry() {
        return this.industry;
    }

    public LibrarySchema setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public LibrarySchema setProvider(Provider provider) {
        this.provider = provider;
        return this;
    }
    public Provider getProvider() {
        return this.provider;
    }

    public LibrarySchema setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}
