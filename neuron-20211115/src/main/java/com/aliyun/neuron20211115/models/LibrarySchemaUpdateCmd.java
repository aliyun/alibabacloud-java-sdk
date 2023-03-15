// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class LibrarySchemaUpdateCmd extends TeaModel {
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

    @NameInMap("libraryId")
    public Long libraryId;

    public static LibrarySchemaUpdateCmd build(java.util.Map<String, ?> map) throws Exception {
        LibrarySchemaUpdateCmd self = new LibrarySchemaUpdateCmd();
        return TeaModel.build(map, self);
    }

    public LibrarySchemaUpdateCmd setArtifactId(String artifactId) {
        this.artifactId = artifactId;
        return this;
    }
    public String getArtifactId() {
        return this.artifactId;
    }

    public LibrarySchemaUpdateCmd setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public LibrarySchemaUpdateCmd setGitGroup(String gitGroup) {
        this.gitGroup = gitGroup;
        return this;
    }
    public String getGitGroup() {
        return this.gitGroup;
    }

    public LibrarySchemaUpdateCmd setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public LibrarySchemaUpdateCmd setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public LibrarySchemaUpdateCmd setLibraryId(Long libraryId) {
        this.libraryId = libraryId;
        return this;
    }
    public Long getLibraryId() {
        return this.libraryId;
    }

}
