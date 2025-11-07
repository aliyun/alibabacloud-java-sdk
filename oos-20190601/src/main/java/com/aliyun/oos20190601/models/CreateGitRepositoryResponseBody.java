// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class CreateGitRepositoryResponseBody extends TeaModel {
    @NameInMap("GitRepo")
    public CreateGitRepositoryResponseBodyGitRepo gitRepo;

    /**
     * <strong>example:</strong>
     * <p>AA9FA778-AE4B-55EC-81CC-C46BAF08A166</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateGitRepositoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateGitRepositoryResponseBody self = new CreateGitRepositoryResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateGitRepositoryResponseBody setGitRepo(CreateGitRepositoryResponseBodyGitRepo gitRepo) {
        this.gitRepo = gitRepo;
        return this;
    }
    public CreateGitRepositoryResponseBodyGitRepo getGitRepo() {
        return this.gitRepo;
    }

    public CreateGitRepositoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateGitRepositoryResponseBodyGitRepo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>Test parameter for security testing</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>aliyun-computest/lingo</p>
         */
        @NameInMap("FullName")
        public String fullName;

        /**
         * <strong>example:</strong>
         * <p><a href="https://github.com/alibaba/fastjson">https://github.com/alibaba/fastjson</a></p>
         */
        @NameInMap("HtmlUrl")
        public String htmlUrl;

        /**
         * <strong>example:</strong>
         * <p>False</p>
         */
        @NameInMap("IsPrivate")
        public String isPrivate;

        public static CreateGitRepositoryResponseBodyGitRepo build(java.util.Map<String, ?> map) throws Exception {
            CreateGitRepositoryResponseBodyGitRepo self = new CreateGitRepositoryResponseBodyGitRepo();
            return TeaModel.build(map, self);
        }

        public CreateGitRepositoryResponseBodyGitRepo setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateGitRepositoryResponseBodyGitRepo setFullName(String fullName) {
            this.fullName = fullName;
            return this;
        }
        public String getFullName() {
            return this.fullName;
        }

        public CreateGitRepositoryResponseBodyGitRepo setHtmlUrl(String htmlUrl) {
            this.htmlUrl = htmlUrl;
            return this;
        }
        public String getHtmlUrl() {
            return this.htmlUrl;
        }

        public CreateGitRepositoryResponseBodyGitRepo setIsPrivate(String isPrivate) {
            this.isPrivate = isPrivate;
            return this;
        }
        public String getIsPrivate() {
            return this.isPrivate;
        }

    }

}
