// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AllLinkeantcodeAntcodeProjectsallResponseBody extends TeaModel {
    @NameInMap("ResponsePageInfoNextPage")
    public String responsePageInfoNextPage;

    @NameInMap("ResponsePage")
    public String responsePage;

    @NameInMap("ResponsePageInfoPrevPage")
    public String responsePageInfoPrevPage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Amount")
    public Long amount;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResponsePageInfoPerPage")
    public String responsePageInfoPerPage;

    @NameInMap("ResponsePageInfoTotalPages")
    public String responsePageInfoTotalPages;

    @NameInMap("ResponseStatusCode")
    public Long responseStatusCode;

    @NameInMap("StateCounts")
    public java.util.List<AllLinkeantcodeAntcodeProjectsallResponseBodyStateCounts> stateCounts;

    @NameInMap("Total")
    public Long total;

    @NameInMap("List")
    public java.util.List<AllLinkeantcodeAntcodeProjectsallResponseBodyList> list;

    @NameInMap("ResponsePageInfoTotal")
    public String responsePageInfoTotal;

    @NameInMap("ResultCode")
    public String resultCode;

    public static AllLinkeantcodeAntcodeProjectsallResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AllLinkeantcodeAntcodeProjectsallResponseBody self = new AllLinkeantcodeAntcodeProjectsallResponseBody();
        return TeaModel.build(map, self);
    }

    public AllLinkeantcodeAntcodeProjectsallResponseBody setResponsePageInfoNextPage(String responsePageInfoNextPage) {
        this.responsePageInfoNextPage = responsePageInfoNextPage;
        return this;
    }
    public String getResponsePageInfoNextPage() {
        return this.responsePageInfoNextPage;
    }

    public AllLinkeantcodeAntcodeProjectsallResponseBody setResponsePage(String responsePage) {
        this.responsePage = responsePage;
        return this;
    }
    public String getResponsePage() {
        return this.responsePage;
    }

    public AllLinkeantcodeAntcodeProjectsallResponseBody setResponsePageInfoPrevPage(String responsePageInfoPrevPage) {
        this.responsePageInfoPrevPage = responsePageInfoPrevPage;
        return this;
    }
    public String getResponsePageInfoPrevPage() {
        return this.responsePageInfoPrevPage;
    }

    public AllLinkeantcodeAntcodeProjectsallResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AllLinkeantcodeAntcodeProjectsallResponseBody setAmount(Long amount) {
        this.amount = amount;
        return this;
    }
    public Long getAmount() {
        return this.amount;
    }

    public AllLinkeantcodeAntcodeProjectsallResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public AllLinkeantcodeAntcodeProjectsallResponseBody setResponsePageInfoPerPage(String responsePageInfoPerPage) {
        this.responsePageInfoPerPage = responsePageInfoPerPage;
        return this;
    }
    public String getResponsePageInfoPerPage() {
        return this.responsePageInfoPerPage;
    }

    public AllLinkeantcodeAntcodeProjectsallResponseBody setResponsePageInfoTotalPages(String responsePageInfoTotalPages) {
        this.responsePageInfoTotalPages = responsePageInfoTotalPages;
        return this;
    }
    public String getResponsePageInfoTotalPages() {
        return this.responsePageInfoTotalPages;
    }

    public AllLinkeantcodeAntcodeProjectsallResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public AllLinkeantcodeAntcodeProjectsallResponseBody setStateCounts(java.util.List<AllLinkeantcodeAntcodeProjectsallResponseBodyStateCounts> stateCounts) {
        this.stateCounts = stateCounts;
        return this;
    }
    public java.util.List<AllLinkeantcodeAntcodeProjectsallResponseBodyStateCounts> getStateCounts() {
        return this.stateCounts;
    }

    public AllLinkeantcodeAntcodeProjectsallResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public AllLinkeantcodeAntcodeProjectsallResponseBody setList(java.util.List<AllLinkeantcodeAntcodeProjectsallResponseBodyList> list) {
        this.list = list;
        return this;
    }
    public java.util.List<AllLinkeantcodeAntcodeProjectsallResponseBodyList> getList() {
        return this.list;
    }

    public AllLinkeantcodeAntcodeProjectsallResponseBody setResponsePageInfoTotal(String responsePageInfoTotal) {
        this.responsePageInfoTotal = responsePageInfoTotal;
        return this;
    }
    public String getResponsePageInfoTotal() {
        return this.responsePageInfoTotal;
    }

    public AllLinkeantcodeAntcodeProjectsallResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public static class AllLinkeantcodeAntcodeProjectsallResponseBodyStateCounts extends TeaModel {
        @NameInMap("State")
        public String state;

        @NameInMap("Count")
        public Long count;

        public static AllLinkeantcodeAntcodeProjectsallResponseBodyStateCounts build(java.util.Map<String, ?> map) throws Exception {
            AllLinkeantcodeAntcodeProjectsallResponseBodyStateCounts self = new AllLinkeantcodeAntcodeProjectsallResponseBodyStateCounts();
            return TeaModel.build(map, self);
        }

        public AllLinkeantcodeAntcodeProjectsallResponseBodyStateCounts setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public AllLinkeantcodeAntcodeProjectsallResponseBodyStateCounts setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

    }

    public static class AllLinkeantcodeAntcodeProjectsallResponseBodyList extends TeaModel {
        @NameInMap("LastActivityAt")
        public String lastActivityAt;

        @NameInMap("Description")
        public String description;

        @NameInMap("NameWithNamespace")
        public String nameWithNamespace;

        @NameInMap("RepositorySize")
        public String repositorySize;

        @NameInMap("PathWithNamespace")
        public String pathWithNamespace;

        @NameInMap("VisibilityLevel")
        public Long visibilityLevel;

        @NameInMap("Path")
        public String path;

        @NameInMap("SshUrlToRepo")
        public String sshUrlToRepo;

        @NameInMap("Name")
        public String name;

        @NameInMap("Id")
        public Long id;

        @NameInMap("HttpUrlToRepo")
        public String httpUrlToRepo;

        public static AllLinkeantcodeAntcodeProjectsallResponseBodyList build(java.util.Map<String, ?> map) throws Exception {
            AllLinkeantcodeAntcodeProjectsallResponseBodyList self = new AllLinkeantcodeAntcodeProjectsallResponseBodyList();
            return TeaModel.build(map, self);
        }

        public AllLinkeantcodeAntcodeProjectsallResponseBodyList setLastActivityAt(String lastActivityAt) {
            this.lastActivityAt = lastActivityAt;
            return this;
        }
        public String getLastActivityAt() {
            return this.lastActivityAt;
        }

        public AllLinkeantcodeAntcodeProjectsallResponseBodyList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public AllLinkeantcodeAntcodeProjectsallResponseBodyList setNameWithNamespace(String nameWithNamespace) {
            this.nameWithNamespace = nameWithNamespace;
            return this;
        }
        public String getNameWithNamespace() {
            return this.nameWithNamespace;
        }

        public AllLinkeantcodeAntcodeProjectsallResponseBodyList setRepositorySize(String repositorySize) {
            this.repositorySize = repositorySize;
            return this;
        }
        public String getRepositorySize() {
            return this.repositorySize;
        }

        public AllLinkeantcodeAntcodeProjectsallResponseBodyList setPathWithNamespace(String pathWithNamespace) {
            this.pathWithNamespace = pathWithNamespace;
            return this;
        }
        public String getPathWithNamespace() {
            return this.pathWithNamespace;
        }

        public AllLinkeantcodeAntcodeProjectsallResponseBodyList setVisibilityLevel(Long visibilityLevel) {
            this.visibilityLevel = visibilityLevel;
            return this;
        }
        public Long getVisibilityLevel() {
            return this.visibilityLevel;
        }

        public AllLinkeantcodeAntcodeProjectsallResponseBodyList setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public AllLinkeantcodeAntcodeProjectsallResponseBodyList setSshUrlToRepo(String sshUrlToRepo) {
            this.sshUrlToRepo = sshUrlToRepo;
            return this;
        }
        public String getSshUrlToRepo() {
            return this.sshUrlToRepo;
        }

        public AllLinkeantcodeAntcodeProjectsallResponseBodyList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public AllLinkeantcodeAntcodeProjectsallResponseBodyList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public AllLinkeantcodeAntcodeProjectsallResponseBodyList setHttpUrlToRepo(String httpUrlToRepo) {
            this.httpUrlToRepo = httpUrlToRepo;
            return this;
        }
        public String getHttpUrlToRepo() {
            return this.httpUrlToRepo;
        }

    }

}
