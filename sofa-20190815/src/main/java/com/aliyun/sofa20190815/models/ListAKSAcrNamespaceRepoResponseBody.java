// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListAKSAcrNamespaceRepoResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("RepoList")
    public ListAKSAcrNamespaceRepoResponseBodyRepoList repoList;

    public static ListAKSAcrNamespaceRepoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAKSAcrNamespaceRepoResponseBody self = new ListAKSAcrNamespaceRepoResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAKSAcrNamespaceRepoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAKSAcrNamespaceRepoResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListAKSAcrNamespaceRepoResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ListAKSAcrNamespaceRepoResponseBody setRepoList(ListAKSAcrNamespaceRepoResponseBodyRepoList repoList) {
        this.repoList = repoList;
        return this;
    }
    public ListAKSAcrNamespaceRepoResponseBodyRepoList getRepoList() {
        return this.repoList;
    }

    public static class ListAKSAcrNamespaceRepoResponseBodyRepoListReposRepoDomainList extends TeaModel {
        @NameInMap("Domain")
        public String domain;

        @NameInMap("Type")
        public String type;

        public static ListAKSAcrNamespaceRepoResponseBodyRepoListReposRepoDomainList build(java.util.Map<String, ?> map) throws Exception {
            ListAKSAcrNamespaceRepoResponseBodyRepoListReposRepoDomainList self = new ListAKSAcrNamespaceRepoResponseBodyRepoListReposRepoDomainList();
            return TeaModel.build(map, self);
        }

        public ListAKSAcrNamespaceRepoResponseBodyRepoListReposRepoDomainList setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public ListAKSAcrNamespaceRepoResponseBodyRepoListReposRepoDomainList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListAKSAcrNamespaceRepoResponseBodyRepoListRepos extends TeaModel {
        @NameInMap("Detail")
        public String detail;

        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("GmtModified")
        public Long gmtModified;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("RepoAuthorizeType")
        public String repoAuthorizeType;

        @NameInMap("RepoBuildType")
        public String repoBuildType;

        @NameInMap("RepoName")
        public String repoName;

        @NameInMap("RepoNamespace")
        public String repoNamespace;

        @NameInMap("RepoStatus")
        public String repoStatus;

        @NameInMap("RepoType")
        public String repoType;

        @NameInMap("Summary")
        public String summary;

        @NameInMap("RepoDomainList")
        public java.util.List<ListAKSAcrNamespaceRepoResponseBodyRepoListReposRepoDomainList> repoDomainList;

        public static ListAKSAcrNamespaceRepoResponseBodyRepoListRepos build(java.util.Map<String, ?> map) throws Exception {
            ListAKSAcrNamespaceRepoResponseBodyRepoListRepos self = new ListAKSAcrNamespaceRepoResponseBodyRepoListRepos();
            return TeaModel.build(map, self);
        }

        public ListAKSAcrNamespaceRepoResponseBodyRepoListRepos setDetail(String detail) {
            this.detail = detail;
            return this;
        }
        public String getDetail() {
            return this.detail;
        }

        public ListAKSAcrNamespaceRepoResponseBodyRepoListRepos setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public ListAKSAcrNamespaceRepoResponseBodyRepoListRepos setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public ListAKSAcrNamespaceRepoResponseBodyRepoListRepos setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListAKSAcrNamespaceRepoResponseBodyRepoListRepos setRepoAuthorizeType(String repoAuthorizeType) {
            this.repoAuthorizeType = repoAuthorizeType;
            return this;
        }
        public String getRepoAuthorizeType() {
            return this.repoAuthorizeType;
        }

        public ListAKSAcrNamespaceRepoResponseBodyRepoListRepos setRepoBuildType(String repoBuildType) {
            this.repoBuildType = repoBuildType;
            return this;
        }
        public String getRepoBuildType() {
            return this.repoBuildType;
        }

        public ListAKSAcrNamespaceRepoResponseBodyRepoListRepos setRepoName(String repoName) {
            this.repoName = repoName;
            return this;
        }
        public String getRepoName() {
            return this.repoName;
        }

        public ListAKSAcrNamespaceRepoResponseBodyRepoListRepos setRepoNamespace(String repoNamespace) {
            this.repoNamespace = repoNamespace;
            return this;
        }
        public String getRepoNamespace() {
            return this.repoNamespace;
        }

        public ListAKSAcrNamespaceRepoResponseBodyRepoListRepos setRepoStatus(String repoStatus) {
            this.repoStatus = repoStatus;
            return this;
        }
        public String getRepoStatus() {
            return this.repoStatus;
        }

        public ListAKSAcrNamespaceRepoResponseBodyRepoListRepos setRepoType(String repoType) {
            this.repoType = repoType;
            return this;
        }
        public String getRepoType() {
            return this.repoType;
        }

        public ListAKSAcrNamespaceRepoResponseBodyRepoListRepos setSummary(String summary) {
            this.summary = summary;
            return this;
        }
        public String getSummary() {
            return this.summary;
        }

        public ListAKSAcrNamespaceRepoResponseBodyRepoListRepos setRepoDomainList(java.util.List<ListAKSAcrNamespaceRepoResponseBodyRepoListReposRepoDomainList> repoDomainList) {
            this.repoDomainList = repoDomainList;
            return this;
        }
        public java.util.List<ListAKSAcrNamespaceRepoResponseBodyRepoListReposRepoDomainList> getRepoDomainList() {
            return this.repoDomainList;
        }

    }

    public static class ListAKSAcrNamespaceRepoResponseBodyRepoList extends TeaModel {
        @NameInMap("Page")
        public Long page;

        @NameInMap("PageSize")
        public Long pageSize;

        @NameInMap("Total")
        public Long total;

        @NameInMap("Repos")
        public java.util.List<ListAKSAcrNamespaceRepoResponseBodyRepoListRepos> repos;

        public static ListAKSAcrNamespaceRepoResponseBodyRepoList build(java.util.Map<String, ?> map) throws Exception {
            ListAKSAcrNamespaceRepoResponseBodyRepoList self = new ListAKSAcrNamespaceRepoResponseBodyRepoList();
            return TeaModel.build(map, self);
        }

        public ListAKSAcrNamespaceRepoResponseBodyRepoList setPage(Long page) {
            this.page = page;
            return this;
        }
        public Long getPage() {
            return this.page;
        }

        public ListAKSAcrNamespaceRepoResponseBodyRepoList setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public ListAKSAcrNamespaceRepoResponseBodyRepoList setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

        public ListAKSAcrNamespaceRepoResponseBodyRepoList setRepos(java.util.List<ListAKSAcrNamespaceRepoResponseBodyRepoListRepos> repos) {
            this.repos = repos;
            return this;
        }
        public java.util.List<ListAKSAcrNamespaceRepoResponseBodyRepoListRepos> getRepos() {
            return this.repos;
        }

    }

}
