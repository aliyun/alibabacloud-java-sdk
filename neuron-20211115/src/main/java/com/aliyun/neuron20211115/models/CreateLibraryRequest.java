// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class CreateLibraryRequest extends TeaModel {
    @NameInMap("artifactId")
    public String artifactId;

    @NameInMap("companyId")
    public String companyId;

    @NameInMap("description")
    public String description;

    @NameInMap("groupId")
    public String groupId;

    @NameInMap("name")
    public String name;

    @NameInMap("repoUrl")
    public String repoUrl;

    public static CreateLibraryRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLibraryRequest self = new CreateLibraryRequest();
        return TeaModel.build(map, self);
    }

    public CreateLibraryRequest setArtifactId(String artifactId) {
        this.artifactId = artifactId;
        return this;
    }
    public String getArtifactId() {
        return this.artifactId;
    }

    public CreateLibraryRequest setCompanyId(String companyId) {
        this.companyId = companyId;
        return this;
    }
    public String getCompanyId() {
        return this.companyId;
    }

    public CreateLibraryRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateLibraryRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public CreateLibraryRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateLibraryRequest setRepoUrl(String repoUrl) {
        this.repoUrl = repoUrl;
        return this;
    }
    public String getRepoUrl() {
        return this.repoUrl;
    }

}
