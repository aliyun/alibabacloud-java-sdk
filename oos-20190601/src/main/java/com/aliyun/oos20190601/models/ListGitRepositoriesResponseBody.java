// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class ListGitRepositoriesResponseBody extends TeaModel {
    @NameInMap("Count")
    public Integer count;

    @NameInMap("GitRepos")
    public java.util.List<ListGitRepositoriesResponseBodyGitRepos> gitRepos;

    @NameInMap("RequestId")
    public String requestId;

    public static ListGitRepositoriesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListGitRepositoriesResponseBody self = new ListGitRepositoriesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListGitRepositoriesResponseBody setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public ListGitRepositoriesResponseBody setGitRepos(java.util.List<ListGitRepositoriesResponseBodyGitRepos> gitRepos) {
        this.gitRepos = gitRepos;
        return this;
    }
    public java.util.List<ListGitRepositoriesResponseBodyGitRepos> getGitRepos() {
        return this.gitRepos;
    }

    public ListGitRepositoriesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListGitRepositoriesResponseBodyGitRepos extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("FullName")
        public String fullName;

        @NameInMap("HtmlUrl")
        public String htmlUrl;

        @NameInMap("IsPrivate")
        public Boolean isPrivate;

        public static ListGitRepositoriesResponseBodyGitRepos build(java.util.Map<String, ?> map) throws Exception {
            ListGitRepositoriesResponseBodyGitRepos self = new ListGitRepositoriesResponseBodyGitRepos();
            return TeaModel.build(map, self);
        }

        public ListGitRepositoriesResponseBodyGitRepos setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListGitRepositoriesResponseBodyGitRepos setFullName(String fullName) {
            this.fullName = fullName;
            return this;
        }
        public String getFullName() {
            return this.fullName;
        }

        public ListGitRepositoriesResponseBodyGitRepos setHtmlUrl(String htmlUrl) {
            this.htmlUrl = htmlUrl;
            return this;
        }
        public String getHtmlUrl() {
            return this.htmlUrl;
        }

        public ListGitRepositoriesResponseBodyGitRepos setIsPrivate(Boolean isPrivate) {
            this.isPrivate = isPrivate;
            return this;
        }
        public Boolean getIsPrivate() {
            return this.isPrivate;
        }

    }

}
