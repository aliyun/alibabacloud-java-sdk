// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class LibraryCreateCmd extends TeaModel {
    @NameInMap("artifactId")
    public String artifactId;

    @NameInMap("companyId")
    public Long companyId;

    @NameInMap("description")
    public String description;

    @NameInMap("groupId")
    public String groupId;

    @NameInMap("marketId")
    public Long marketId;

    @NameInMap("name")
    public String name;

    @NameInMap("repoUrl")
    public String repoUrl;

    public static LibraryCreateCmd build(java.util.Map<String, ?> map) throws Exception {
        LibraryCreateCmd self = new LibraryCreateCmd();
        return TeaModel.build(map, self);
    }

    public LibraryCreateCmd setArtifactId(String artifactId) {
        this.artifactId = artifactId;
        return this;
    }
    public String getArtifactId() {
        return this.artifactId;
    }

    public LibraryCreateCmd setCompanyId(Long companyId) {
        this.companyId = companyId;
        return this;
    }
    public Long getCompanyId() {
        return this.companyId;
    }

    public LibraryCreateCmd setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public LibraryCreateCmd setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public LibraryCreateCmd setMarketId(Long marketId) {
        this.marketId = marketId;
        return this;
    }
    public Long getMarketId() {
        return this.marketId;
    }

    public LibraryCreateCmd setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public LibraryCreateCmd setRepoUrl(String repoUrl) {
        this.repoUrl = repoUrl;
        return this;
    }
    public String getRepoUrl() {
        return this.repoUrl;
    }

}
