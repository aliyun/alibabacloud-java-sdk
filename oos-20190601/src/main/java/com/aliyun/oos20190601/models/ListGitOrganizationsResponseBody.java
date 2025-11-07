// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class ListGitOrganizationsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Count")
    public Integer count;

    @NameInMap("GitOrgs")
    public java.util.List<ListGitOrganizationsResponseBodyGitOrgs> gitOrgs;

    /**
     * <strong>example:</strong>
     * <p>9E011F98-4EE5-5E3A-8FA3-D38F2C531C1F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListGitOrganizationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListGitOrganizationsResponseBody self = new ListGitOrganizationsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListGitOrganizationsResponseBody setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public ListGitOrganizationsResponseBody setGitOrgs(java.util.List<ListGitOrganizationsResponseBodyGitOrgs> gitOrgs) {
        this.gitOrgs = gitOrgs;
        return this;
    }
    public java.util.List<ListGitOrganizationsResponseBodyGitOrgs> getGitOrgs() {
        return this.gitOrgs;
    }

    public ListGitOrganizationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListGitOrganizationsResponseBodyGitOrgs extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>dfj3535</p>
         */
        @NameInMap("OrgId")
        public String orgId;

        /**
         * <strong>example:</strong>
         * <p>aliyun-computenest</p>
         */
        @NameInMap("OrgName")
        public String orgName;

        public static ListGitOrganizationsResponseBodyGitOrgs build(java.util.Map<String, ?> map) throws Exception {
            ListGitOrganizationsResponseBodyGitOrgs self = new ListGitOrganizationsResponseBodyGitOrgs();
            return TeaModel.build(map, self);
        }

        public ListGitOrganizationsResponseBodyGitOrgs setOrgId(String orgId) {
            this.orgId = orgId;
            return this;
        }
        public String getOrgId() {
            return this.orgId;
        }

        public ListGitOrganizationsResponseBodyGitOrgs setOrgName(String orgName) {
            this.orgName = orgName;
            return this;
        }
        public String getOrgName() {
            return this.orgName;
        }

    }

}
