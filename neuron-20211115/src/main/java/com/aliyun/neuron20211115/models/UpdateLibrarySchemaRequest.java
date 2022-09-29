// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class UpdateLibrarySchemaRequest extends TeaModel {
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

    @NameInMap("name")
    public String name;

    @NameInMap("version")
    public String version;

    public static UpdateLibrarySchemaRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLibrarySchemaRequest self = new UpdateLibrarySchemaRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLibrarySchemaRequest setArtifactId(String artifactId) {
        this.artifactId = artifactId;
        return this;
    }
    public String getArtifactId() {
        return this.artifactId;
    }

    public UpdateLibrarySchemaRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateLibrarySchemaRequest setGitGroup(String gitGroup) {
        this.gitGroup = gitGroup;
        return this;
    }
    public String getGitGroup() {
        return this.gitGroup;
    }

    public UpdateLibrarySchemaRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public UpdateLibrarySchemaRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateLibrarySchemaRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateLibrarySchemaRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}
