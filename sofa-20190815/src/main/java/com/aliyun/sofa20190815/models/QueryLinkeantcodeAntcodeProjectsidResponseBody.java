// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeantcodeAntcodeProjectsidResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Description")
    public String description;

    @NameInMap("HttpUrlToRepo")
    public String httpUrlToRepo;

    @NameInMap("Id")
    public Long id;

    @NameInMap("LastActivityAt")
    public String lastActivityAt;

    @NameInMap("Name")
    public String name;

    @NameInMap("NameWithNamespace")
    public String nameWithNamespace;

    @NameInMap("Path")
    public String path;

    @NameInMap("PathWithNamespace")
    public String pathWithNamespace;

    @NameInMap("RepositorySize")
    public String repositorySize;

    @NameInMap("ResponseStatusCode")
    public Long responseStatusCode;

    @NameInMap("SshUrlToRepo")
    public String sshUrlToRepo;

    @NameInMap("VisibilityLevel")
    public Long visibilityLevel;

    public static QueryLinkeantcodeAntcodeProjectsidResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeantcodeAntcodeProjectsidResponseBody self = new QueryLinkeantcodeAntcodeProjectsidResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryLinkeantcodeAntcodeProjectsidResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryLinkeantcodeAntcodeProjectsidResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryLinkeantcodeAntcodeProjectsidResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryLinkeantcodeAntcodeProjectsidResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public QueryLinkeantcodeAntcodeProjectsidResponseBody setHttpUrlToRepo(String httpUrlToRepo) {
        this.httpUrlToRepo = httpUrlToRepo;
        return this;
    }
    public String getHttpUrlToRepo() {
        return this.httpUrlToRepo;
    }

    public QueryLinkeantcodeAntcodeProjectsidResponseBody setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public QueryLinkeantcodeAntcodeProjectsidResponseBody setLastActivityAt(String lastActivityAt) {
        this.lastActivityAt = lastActivityAt;
        return this;
    }
    public String getLastActivityAt() {
        return this.lastActivityAt;
    }

    public QueryLinkeantcodeAntcodeProjectsidResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public QueryLinkeantcodeAntcodeProjectsidResponseBody setNameWithNamespace(String nameWithNamespace) {
        this.nameWithNamespace = nameWithNamespace;
        return this;
    }
    public String getNameWithNamespace() {
        return this.nameWithNamespace;
    }

    public QueryLinkeantcodeAntcodeProjectsidResponseBody setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

    public QueryLinkeantcodeAntcodeProjectsidResponseBody setPathWithNamespace(String pathWithNamespace) {
        this.pathWithNamespace = pathWithNamespace;
        return this;
    }
    public String getPathWithNamespace() {
        return this.pathWithNamespace;
    }

    public QueryLinkeantcodeAntcodeProjectsidResponseBody setRepositorySize(String repositorySize) {
        this.repositorySize = repositorySize;
        return this;
    }
    public String getRepositorySize() {
        return this.repositorySize;
    }

    public QueryLinkeantcodeAntcodeProjectsidResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public QueryLinkeantcodeAntcodeProjectsidResponseBody setSshUrlToRepo(String sshUrlToRepo) {
        this.sshUrlToRepo = sshUrlToRepo;
        return this;
    }
    public String getSshUrlToRepo() {
        return this.sshUrlToRepo;
    }

    public QueryLinkeantcodeAntcodeProjectsidResponseBody setVisibilityLevel(Long visibilityLevel) {
        this.visibilityLevel = visibilityLevel;
        return this;
    }
    public Long getVisibilityLevel() {
        return this.visibilityLevel;
    }

}
