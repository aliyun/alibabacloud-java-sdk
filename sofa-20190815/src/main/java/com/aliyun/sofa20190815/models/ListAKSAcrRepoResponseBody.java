// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListAKSAcrRepoResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("RepoList")
    public ListAKSAcrRepoResponseBodyRepoList repoList;

    public static ListAKSAcrRepoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAKSAcrRepoResponseBody self = new ListAKSAcrRepoResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAKSAcrRepoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAKSAcrRepoResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListAKSAcrRepoResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ListAKSAcrRepoResponseBody setRepoList(ListAKSAcrRepoResponseBodyRepoList repoList) {
        this.repoList = repoList;
        return this;
    }
    public ListAKSAcrRepoResponseBodyRepoList getRepoList() {
        return this.repoList;
    }

    public static class ListAKSAcrRepoResponseBodyRepoListReposRepoDomainList extends TeaModel {
        @NameInMap("Domain")
        public String domain;

        @NameInMap("Type")
        public String type;

        public static ListAKSAcrRepoResponseBodyRepoListReposRepoDomainList build(java.util.Map<String, ?> map) throws Exception {
            ListAKSAcrRepoResponseBodyRepoListReposRepoDomainList self = new ListAKSAcrRepoResponseBodyRepoListReposRepoDomainList();
            return TeaModel.build(map, self);
        }

        public ListAKSAcrRepoResponseBodyRepoListReposRepoDomainList setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public ListAKSAcrRepoResponseBodyRepoListReposRepoDomainList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListAKSAcrRepoResponseBodyRepoListRepos extends TeaModel {
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
        public java.util.List<ListAKSAcrRepoResponseBodyRepoListReposRepoDomainList> repoDomainList;

        public static ListAKSAcrRepoResponseBodyRepoListRepos build(java.util.Map<String, ?> map) throws Exception {
            ListAKSAcrRepoResponseBodyRepoListRepos self = new ListAKSAcrRepoResponseBodyRepoListRepos();
            return TeaModel.build(map, self);
        }

        public ListAKSAcrRepoResponseBodyRepoListRepos setDetail(String detail) {
            this.detail = detail;
            return this;
        }
        public String getDetail() {
            return this.detail;
        }

        public ListAKSAcrRepoResponseBodyRepoListRepos setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public ListAKSAcrRepoResponseBodyRepoListRepos setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public ListAKSAcrRepoResponseBodyRepoListRepos setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListAKSAcrRepoResponseBodyRepoListRepos setRepoAuthorizeType(String repoAuthorizeType) {
            this.repoAuthorizeType = repoAuthorizeType;
            return this;
        }
        public String getRepoAuthorizeType() {
            return this.repoAuthorizeType;
        }

        public ListAKSAcrRepoResponseBodyRepoListRepos setRepoBuildType(String repoBuildType) {
            this.repoBuildType = repoBuildType;
            return this;
        }
        public String getRepoBuildType() {
            return this.repoBuildType;
        }

        public ListAKSAcrRepoResponseBodyRepoListRepos setRepoName(String repoName) {
            this.repoName = repoName;
            return this;
        }
        public String getRepoName() {
            return this.repoName;
        }

        public ListAKSAcrRepoResponseBodyRepoListRepos setRepoNamespace(String repoNamespace) {
            this.repoNamespace = repoNamespace;
            return this;
        }
        public String getRepoNamespace() {
            return this.repoNamespace;
        }

        public ListAKSAcrRepoResponseBodyRepoListRepos setRepoStatus(String repoStatus) {
            this.repoStatus = repoStatus;
            return this;
        }
        public String getRepoStatus() {
            return this.repoStatus;
        }

        public ListAKSAcrRepoResponseBodyRepoListRepos setRepoType(String repoType) {
            this.repoType = repoType;
            return this;
        }
        public String getRepoType() {
            return this.repoType;
        }

        public ListAKSAcrRepoResponseBodyRepoListRepos setSummary(String summary) {
            this.summary = summary;
            return this;
        }
        public String getSummary() {
            return this.summary;
        }

        public ListAKSAcrRepoResponseBodyRepoListRepos setRepoDomainList(java.util.List<ListAKSAcrRepoResponseBodyRepoListReposRepoDomainList> repoDomainList) {
            this.repoDomainList = repoDomainList;
            return this;
        }
        public java.util.List<ListAKSAcrRepoResponseBodyRepoListReposRepoDomainList> getRepoDomainList() {
            return this.repoDomainList;
        }

    }

    public static class ListAKSAcrRepoResponseBodyRepoList extends TeaModel {
        @NameInMap("Page")
        public Long page;

        @NameInMap("PageSize")
        public Long pageSize;

        @NameInMap("Total")
        public Long total;

        @NameInMap("Repos")
        public java.util.List<ListAKSAcrRepoResponseBodyRepoListRepos> repos;

        public static ListAKSAcrRepoResponseBodyRepoList build(java.util.Map<String, ?> map) throws Exception {
            ListAKSAcrRepoResponseBodyRepoList self = new ListAKSAcrRepoResponseBodyRepoList();
            return TeaModel.build(map, self);
        }

        public ListAKSAcrRepoResponseBodyRepoList setPage(Long page) {
            this.page = page;
            return this;
        }
        public Long getPage() {
            return this.page;
        }

        public ListAKSAcrRepoResponseBodyRepoList setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public ListAKSAcrRepoResponseBodyRepoList setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

        public ListAKSAcrRepoResponseBodyRepoList setRepos(java.util.List<ListAKSAcrRepoResponseBodyRepoListRepos> repos) {
            this.repos = repos;
            return this;
        }
        public java.util.List<ListAKSAcrRepoResponseBodyRepoListRepos> getRepos() {
            return this.repos;
        }

    }

}
