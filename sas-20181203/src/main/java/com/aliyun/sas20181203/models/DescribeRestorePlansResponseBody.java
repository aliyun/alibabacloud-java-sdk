// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeRestorePlansResponseBody extends TeaModel {
    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("PageInfo")
    public DescribeRestorePlansResponseBodyPageInfo pageInfo;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>BE120DAB-F4E7-4C53-ADC3-A97578AB****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>An array that consists of the restoration tasks.</p>
     */
    @NameInMap("RestorePlans")
    public java.util.List<DescribeRestorePlansResponseBodyRestorePlans> restorePlans;

    public static DescribeRestorePlansResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRestorePlansResponseBody self = new DescribeRestorePlansResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRestorePlansResponseBody setPageInfo(DescribeRestorePlansResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public DescribeRestorePlansResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public DescribeRestorePlansResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRestorePlansResponseBody setRestorePlans(java.util.List<DescribeRestorePlansResponseBodyRestorePlans> restorePlans) {
        this.restorePlans = restorePlans;
        return this;
    }
    public java.util.List<DescribeRestorePlansResponseBodyRestorePlans> getRestorePlans() {
        return this.restorePlans;
    }

    public static class DescribeRestorePlansResponseBodyPageInfo extends TeaModel {
        /**
         * <p>The number of entries returned on the current page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>33</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static DescribeRestorePlansResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeRestorePlansResponseBodyPageInfo self = new DescribeRestorePlansResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public DescribeRestorePlansResponseBodyPageInfo setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public DescribeRestorePlansResponseBodyPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public DescribeRestorePlansResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DescribeRestorePlansResponseBodyPageInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

    public static class DescribeRestorePlansResponseBodyRestorePlans extends TeaModel {
        /**
         * <p>The timestamp when the restoration task was created. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1655174753****</p>
         */
        @NameInMap("CreatedTime")
        public Long createdTime;

        /**
         * <p>The name of the database.</p>
         * 
         * <strong>example:</strong>
         * <p>Bankup****</p>
         */
        @NameInMap("DatabaseName")
        public String databaseName;

        /**
         * <p>The name of the server on which the database resides.</p>
         * 
         * <strong>example:</strong>
         * <p>sql-test-001</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The ID of the anti-ransomware policy.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("PolicyId")
        public Long policyId;

        /**
         * <p>The name of the anti-ransomware policy.</p>
         * 
         * <strong>example:</strong>
         * <p>KtDataBase</p>
         */
        @NameInMap("PolicyName")
        public String policyName;

        /**
         * <p>The point in time to which data is restored.</p>
         * 
         * <strong>example:</strong>
         * <p>165875100****</p>
         */
        @NameInMap("RestorePoint")
        public Long restorePoint;

        /**
         * <p>The status of the restoration task. Valid values:</p>
         * <ul>
         * <li><strong>init</strong>: initializing</li>
         * <li><strong>created</strong>: creating</li>
         * <li><strong>running</strong>: running</li>
         * <li><strong>completed</strong>: complete</li>
         * <li><strong>error</strong>: failed</li>
         * <li><strong>restoring</strong>: restoring</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>running</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The name of the destination database.</p>
         * 
         * <strong>example:</strong>
         * <p>OABak</p>
         */
        @NameInMap("TargetDatabaseName")
        public String targetDatabaseName;

        /**
         * <p>The ID of the destination server.</p>
         * 
         * <strong>example:</strong>
         * <p>i-2zehqflgbl9ep2he****</p>
         */
        @NameInMap("TargetInstanceId")
        public String targetInstanceId;

        /**
         * <p>The name of the destination server.</p>
         * 
         * <strong>example:</strong>
         * <p>hbr-detection-hh</p>
         */
        @NameInMap("TargetInstanceName")
        public String targetInstanceName;

        /**
         * <p>The timestamp when the restoration task was last updated. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>166849080****</p>
         */
        @NameInMap("UpdatedTime")
        public Long updatedTime;

        public static DescribeRestorePlansResponseBodyRestorePlans build(java.util.Map<String, ?> map) throws Exception {
            DescribeRestorePlansResponseBodyRestorePlans self = new DescribeRestorePlansResponseBodyRestorePlans();
            return TeaModel.build(map, self);
        }

        public DescribeRestorePlansResponseBodyRestorePlans setCreatedTime(Long createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public Long getCreatedTime() {
            return this.createdTime;
        }

        public DescribeRestorePlansResponseBodyRestorePlans setDatabaseName(String databaseName) {
            this.databaseName = databaseName;
            return this;
        }
        public String getDatabaseName() {
            return this.databaseName;
        }

        public DescribeRestorePlansResponseBodyRestorePlans setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeRestorePlansResponseBodyRestorePlans setPolicyId(Long policyId) {
            this.policyId = policyId;
            return this;
        }
        public Long getPolicyId() {
            return this.policyId;
        }

        public DescribeRestorePlansResponseBodyRestorePlans setPolicyName(String policyName) {
            this.policyName = policyName;
            return this;
        }
        public String getPolicyName() {
            return this.policyName;
        }

        public DescribeRestorePlansResponseBodyRestorePlans setRestorePoint(Long restorePoint) {
            this.restorePoint = restorePoint;
            return this;
        }
        public Long getRestorePoint() {
            return this.restorePoint;
        }

        public DescribeRestorePlansResponseBodyRestorePlans setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeRestorePlansResponseBodyRestorePlans setTargetDatabaseName(String targetDatabaseName) {
            this.targetDatabaseName = targetDatabaseName;
            return this;
        }
        public String getTargetDatabaseName() {
            return this.targetDatabaseName;
        }

        public DescribeRestorePlansResponseBodyRestorePlans setTargetInstanceId(String targetInstanceId) {
            this.targetInstanceId = targetInstanceId;
            return this;
        }
        public String getTargetInstanceId() {
            return this.targetInstanceId;
        }

        public DescribeRestorePlansResponseBodyRestorePlans setTargetInstanceName(String targetInstanceName) {
            this.targetInstanceName = targetInstanceName;
            return this;
        }
        public String getTargetInstanceName() {
            return this.targetInstanceName;
        }

        public DescribeRestorePlansResponseBodyRestorePlans setUpdatedTime(Long updatedTime) {
            this.updatedTime = updatedTime;
            return this;
        }
        public Long getUpdatedTime() {
            return this.updatedTime;
        }

    }

}
