// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class ListGitBranchesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Count")
    public Integer count;

    @NameInMap("GitBranches")
    public java.util.List<ListGitBranchesResponseBodyGitBranches> gitBranches;

    /**
     * <strong>example:</strong>
     * <p>DBA6E6C8-F75D-41DE-AFF5-1FA03F551CA3</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListGitBranchesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListGitBranchesResponseBody self = new ListGitBranchesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListGitBranchesResponseBody setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public ListGitBranchesResponseBody setGitBranches(java.util.List<ListGitBranchesResponseBodyGitBranches> gitBranches) {
        this.gitBranches = gitBranches;
        return this;
    }
    public java.util.List<ListGitBranchesResponseBodyGitBranches> getGitBranches() {
        return this.gitBranches;
    }

    public ListGitBranchesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListGitBranchesResponseBodyGitBranches extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>master</p>
         */
        @NameInMap("Name")
        public String name;

        public static ListGitBranchesResponseBodyGitBranches build(java.util.Map<String, ?> map) throws Exception {
            ListGitBranchesResponseBodyGitBranches self = new ListGitBranchesResponseBodyGitBranches();
            return TeaModel.build(map, self);
        }

        public ListGitBranchesResponseBodyGitBranches setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
