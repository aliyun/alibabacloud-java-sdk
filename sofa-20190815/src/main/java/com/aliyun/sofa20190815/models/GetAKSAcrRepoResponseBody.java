// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetAKSAcrRepoResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Repo")
    public GetAKSAcrRepoResponseBodyRepo repo;

    public static GetAKSAcrRepoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAKSAcrRepoResponseBody self = new GetAKSAcrRepoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAKSAcrRepoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAKSAcrRepoResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetAKSAcrRepoResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetAKSAcrRepoResponseBody setRepo(GetAKSAcrRepoResponseBodyRepo repo) {
        this.repo = repo;
        return this;
    }
    public GetAKSAcrRepoResponseBodyRepo getRepo() {
        return this.repo;
    }

    public static class GetAKSAcrRepoResponseBodyRepoRepoDomainList extends TeaModel {
        @NameInMap("Domain")
        public String domain;

        @NameInMap("Type")
        public String type;

        public static GetAKSAcrRepoResponseBodyRepoRepoDomainList build(java.util.Map<String, ?> map) throws Exception {
            GetAKSAcrRepoResponseBodyRepoRepoDomainList self = new GetAKSAcrRepoResponseBodyRepoRepoDomainList();
            return TeaModel.build(map, self);
        }

        public GetAKSAcrRepoResponseBodyRepoRepoDomainList setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public GetAKSAcrRepoResponseBodyRepoRepoDomainList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetAKSAcrRepoResponseBodyRepo extends TeaModel {
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
        public java.util.List<GetAKSAcrRepoResponseBodyRepoRepoDomainList> repoDomainList;

        public static GetAKSAcrRepoResponseBodyRepo build(java.util.Map<String, ?> map) throws Exception {
            GetAKSAcrRepoResponseBodyRepo self = new GetAKSAcrRepoResponseBodyRepo();
            return TeaModel.build(map, self);
        }

        public GetAKSAcrRepoResponseBodyRepo setDetail(String detail) {
            this.detail = detail;
            return this;
        }
        public String getDetail() {
            return this.detail;
        }

        public GetAKSAcrRepoResponseBodyRepo setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public GetAKSAcrRepoResponseBodyRepo setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public GetAKSAcrRepoResponseBodyRepo setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetAKSAcrRepoResponseBodyRepo setRepoAuthorizeType(String repoAuthorizeType) {
            this.repoAuthorizeType = repoAuthorizeType;
            return this;
        }
        public String getRepoAuthorizeType() {
            return this.repoAuthorizeType;
        }

        public GetAKSAcrRepoResponseBodyRepo setRepoBuildType(String repoBuildType) {
            this.repoBuildType = repoBuildType;
            return this;
        }
        public String getRepoBuildType() {
            return this.repoBuildType;
        }

        public GetAKSAcrRepoResponseBodyRepo setRepoName(String repoName) {
            this.repoName = repoName;
            return this;
        }
        public String getRepoName() {
            return this.repoName;
        }

        public GetAKSAcrRepoResponseBodyRepo setRepoNamespace(String repoNamespace) {
            this.repoNamespace = repoNamespace;
            return this;
        }
        public String getRepoNamespace() {
            return this.repoNamespace;
        }

        public GetAKSAcrRepoResponseBodyRepo setRepoStatus(String repoStatus) {
            this.repoStatus = repoStatus;
            return this;
        }
        public String getRepoStatus() {
            return this.repoStatus;
        }

        public GetAKSAcrRepoResponseBodyRepo setRepoType(String repoType) {
            this.repoType = repoType;
            return this;
        }
        public String getRepoType() {
            return this.repoType;
        }

        public GetAKSAcrRepoResponseBodyRepo setSummary(String summary) {
            this.summary = summary;
            return this;
        }
        public String getSummary() {
            return this.summary;
        }

        public GetAKSAcrRepoResponseBodyRepo setRepoDomainList(java.util.List<GetAKSAcrRepoResponseBodyRepoRepoDomainList> repoDomainList) {
            this.repoDomainList = repoDomainList;
            return this;
        }
        public java.util.List<GetAKSAcrRepoResponseBodyRepoRepoDomainList> getRepoDomainList() {
            return this.repoDomainList;
        }

    }

}
