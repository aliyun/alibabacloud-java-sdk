// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeMonitorAccountsResponseBody extends TeaModel {
    /**
     * <p>List of member account information.</p>
     */
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
        /**
         * <p>The Alibaba Cloud account ID of the member.</p>
         * 
         * <strong>example:</strong>
         * <p>119593010538****</p>
         */
        @NameInMap("AccountId")
        public String accountId;

        /**
         * <p>The time when it was added to the control list, in timestamp format with second precision.</p>
         * 
         * <strong>example:</strong>
         * <p>1760520684000</p>
         */
        @NameInMap("AddTime")
        public Long addTime;

        /**
         * <p>The account ID of the operator.</p>
         * 
         * <strong>example:</strong>
         * <p>106635707417****</p>
         */
        @NameInMap("OperatorUid")
        public String operatorUid;

        /**
         * <p>Basic service switch. Values: </p>
         * <ul>
         * <li><strong>0</strong>: Off </li>
         * <li><strong>1</strong>: On</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PostBasicService")
        public Integer postBasicService;

        /**
         * <p>The purchased version of Cloud Security Center. Values:</p>
         * <ul>
         * <li><strong>0</strong> or <strong>1</strong>: Free Edition </li>
         * <li><strong>2</strong> or <strong>3</strong>: Enterprise Edition</li>
         * <li><strong>5</strong>: Advanced Edition </li>
         * <li><strong>6</strong>: Anti-Virus Edition </li>
         * <li><strong>7</strong>: Flagship Edition</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
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
