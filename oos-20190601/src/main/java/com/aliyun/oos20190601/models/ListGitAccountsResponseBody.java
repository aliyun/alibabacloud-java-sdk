// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class ListGitAccountsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Count")
    public Integer count;

    @NameInMap("GitAccounts")
    public java.util.List<ListGitAccountsResponseBodyGitAccounts> gitAccounts;

    /**
     * <strong>example:</strong>
     * <p>1457F46C-7AAE-59FA-BD12-0BDB3751E6F8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListGitAccountsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListGitAccountsResponseBody self = new ListGitAccountsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListGitAccountsResponseBody setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public ListGitAccountsResponseBody setGitAccounts(java.util.List<ListGitAccountsResponseBodyGitAccounts> gitAccounts) {
        this.gitAccounts = gitAccounts;
        return this;
    }
    public java.util.List<ListGitAccountsResponseBodyGitAccounts> getGitAccounts() {
        return this.gitAccounts;
    }

    public ListGitAccountsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListGitAccountsResponseBodyGitAccounts extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsActive")
        public Boolean isActive;

        /**
         * <strong>example:</strong>
         * <p>LYH-RAIN</p>
         */
        @NameInMap("Owner")
        public String owner;

        public static ListGitAccountsResponseBodyGitAccounts build(java.util.Map<String, ?> map) throws Exception {
            ListGitAccountsResponseBodyGitAccounts self = new ListGitAccountsResponseBodyGitAccounts();
            return TeaModel.build(map, self);
        }

        public ListGitAccountsResponseBodyGitAccounts setIsActive(Boolean isActive) {
            this.isActive = isActive;
            return this;
        }
        public Boolean getIsActive() {
            return this.isActive;
        }

        public ListGitAccountsResponseBodyGitAccounts setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

    }

}
