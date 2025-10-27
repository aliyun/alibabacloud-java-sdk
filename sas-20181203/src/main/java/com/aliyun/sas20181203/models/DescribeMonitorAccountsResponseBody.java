// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeMonitorAccountsResponseBody extends TeaModel {
    @NameInMap("AccountIdInfos")
    public java.util.List<DescribeMonitorAccountsResponseBodyAccountIdInfos> accountIdInfos;

    /**
     * <p>The IDs of the members.</p>
     */
    @NameInMap("AccountIds")
    public java.util.List<String> accountIds;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>028CF634-5268-5660-9575-48C9ED6BF880</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeMonitorAccountsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMonitorAccountsResponseBody self = new DescribeMonitorAccountsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMonitorAccountsResponseBody setAccountIdInfos(java.util.List<DescribeMonitorAccountsResponseBodyAccountIdInfos> accountIdInfos) {
        this.accountIdInfos = accountIdInfos;
        return this;
    }
    public java.util.List<DescribeMonitorAccountsResponseBodyAccountIdInfos> getAccountIdInfos() {
        return this.accountIdInfos;
    }

    public DescribeMonitorAccountsResponseBody setAccountIds(java.util.List<String> accountIds) {
        this.accountIds = accountIds;
        return this;
    }
    public java.util.List<String> getAccountIds() {
        return this.accountIds;
    }

    public DescribeMonitorAccountsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeMonitorAccountsResponseBodyAccountIdInfos extends TeaModel {
        @NameInMap("AccountId")
        public String accountId;

        @NameInMap("AddTime")
        public Long addTime;

        @NameInMap("OperatorUid")
        public String operatorUid;

        @NameInMap("PostBasicService")
        public Integer postBasicService;

        @NameInMap("SasVersion")
        public String sasVersion;

        public static DescribeMonitorAccountsResponseBodyAccountIdInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeMonitorAccountsResponseBodyAccountIdInfos self = new DescribeMonitorAccountsResponseBodyAccountIdInfos();
            return TeaModel.build(map, self);
        }

        public DescribeMonitorAccountsResponseBodyAccountIdInfos setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public DescribeMonitorAccountsResponseBodyAccountIdInfos setAddTime(Long addTime) {
            this.addTime = addTime;
            return this;
        }
        public Long getAddTime() {
            return this.addTime;
        }

        public DescribeMonitorAccountsResponseBodyAccountIdInfos setOperatorUid(String operatorUid) {
            this.operatorUid = operatorUid;
            return this;
        }
        public String getOperatorUid() {
            return this.operatorUid;
        }

        public DescribeMonitorAccountsResponseBodyAccountIdInfos setPostBasicService(Integer postBasicService) {
            this.postBasicService = postBasicService;
            return this;
        }
        public Integer getPostBasicService() {
            return this.postBasicService;
        }

        public DescribeMonitorAccountsResponseBodyAccountIdInfos setSasVersion(String sasVersion) {
            this.sasVersion = sasVersion;
            return this;
        }
        public String getSasVersion() {
            return this.sasVersion;
        }

    }

}
