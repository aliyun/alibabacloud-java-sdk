// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class GetGitBranchResponseBody extends TeaModel {
    @NameInMap("Commit")
    public GetGitBranchResponseBodyCommit commit;

    /**
     * <strong>example:</strong>
     * <p>AA9FA778-AE4B-55EC-81CC-C46BAF08A166</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetGitBranchResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetGitBranchResponseBody self = new GetGitBranchResponseBody();
        return TeaModel.build(map, self);
    }

    public GetGitBranchResponseBody setCommit(GetGitBranchResponseBodyCommit commit) {
        this.commit = commit;
        return this;
    }
    public GetGitBranchResponseBodyCommit getCommit() {
        return this.commit;
    }

    public GetGitBranchResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetGitBranchResponseBodyCommit extends TeaModel {
        /**
         * <p>git commit message</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>git commit hash</p>
         * 
         * <strong>example:</strong>
         * <p>51417755</p>
         */
        @NameInMap("Sha")
        public String sha;

        public static GetGitBranchResponseBodyCommit build(java.util.Map<String, ?> map) throws Exception {
            GetGitBranchResponseBodyCommit self = new GetGitBranchResponseBodyCommit();
            return TeaModel.build(map, self);
        }

        public GetGitBranchResponseBodyCommit setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public GetGitBranchResponseBodyCommit setSha(String sha) {
            this.sha = sha;
            return this;
        }
        public String getSha() {
            return this.sha;
        }

    }

}
