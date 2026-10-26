// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeUpgradeMajorVersionPrecheckTaskResponseBody extends TeaModel {
    /**
     * <p>The list of attributes in the check reports for major engine version upgrades.</p>
     */
    @NameInMap("Items")
    public java.util.List<DescribeUpgradeMajorVersionPrecheckTaskResponseBodyItems> items;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageRecordCount")
    public Integer pageRecordCount;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>D1586777-41B5-5F9E-81E8-93DFDD379024</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries in the upgrade check report.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalRecordCount")
    public Integer totalRecordCount;

    public static DescribeUpgradeMajorVersionPrecheckTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeUpgradeMajorVersionPrecheckTaskResponseBody self = new DescribeUpgradeMajorVersionPrecheckTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeUpgradeMajorVersionPrecheckTaskResponseBody setItems(java.util.List<DescribeUpgradeMajorVersionPrecheckTaskResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<DescribeUpgradeMajorVersionPrecheckTaskResponseBodyItems> getItems() {
        return this.items;
    }

    public DescribeUpgradeMajorVersionPrecheckTaskResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeUpgradeMajorVersionPrecheckTaskResponseBody setPageRecordCount(Integer pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
        return this;
    }
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    public DescribeUpgradeMajorVersionPrecheckTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeUpgradeMajorVersionPrecheckTaskResponseBody setTotalRecordCount(Integer totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static class DescribeUpgradeMajorVersionPrecheckTaskResponseBodyItems extends TeaModel {
        /**
         * <p>The time when the check is performed. The value is a UNIX timestamp. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1635143903000</p>
         */
        @NameInMap("CheckTime")
        public String checkTime;

        /**
         * <p>The content of the check report for the major engine version upgrade.</p>
         * 
         * <strong>example:</strong>
         * <p>[user_check_report]User check success\n[pg_upgrade_internal.log]Performing...</p>
         */
        @NameInMap("Detail")
        public String detail;

        /**
         * <p>The expiration time of the check report. The value is a UNIX timestamp. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1635748703000</p>
         */
        @NameInMap("EffectiveTime")
        public String effectiveTime;

        /**
         * <p>The recommended minimum disk capacity for the upgrade. Unit: GB.</p>
         * <blockquote>
         * <p>This parameter is returned only for ApsaraDB RDS for PostgreSQL instances.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("RecommendDiskSize")
        public Integer recommendDiskSize;

        /**
         * <p>The recommended minimum memory size for the upgrade. Unit: GB.</p>
         * <blockquote>
         * <p>This parameter is returned only for ApsaraDB RDS for PostgreSQL instances.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("RecommendLeastMemSize")
        public Integer recommendLeastMemSize;

        /**
         * <p>The recommended memory size for the upgrade. Unit: GB.</p>
         * <p>If the memory size of the instance is greater than or equal to the recommended memory size, the upgrade is performed at the maximum speed to minimize the read-only duration of the instance.</p>
         * <blockquote>
         * <p>This parameter is returned only for ApsaraDB RDS for PostgreSQL instances.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>32</p>
         */
        @NameInMap("RecommendMemSize")
        public Integer recommendMemSize;

        /**
         * <p>The result of the check for the major engine version upgrade. Valid values:</p>
         * <ul>
         * <li>Success: The check is successful.</li>
         * <li>Fail: The check fails.</li>
         * <li>warning: A warning is returned. You must check the report to determine whether to continue the upgrade.</li>
         * </ul>
         * <blockquote>
         * <p>If the check result is <strong>Fail</strong>, check the value of the <strong>Detail</strong> parameter, troubleshoot the error, and try again. For more information about common errors and solutions, see <a href="https://help.aliyun.com/document_detail/218391.html">Interpret check reports for major engine version upgrades of ApsaraDB RDS for PostgreSQL instances</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        @NameInMap("Result")
        public String result;

        /**
         * <p>The current major engine version of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>11.0</p>
         */
        @NameInMap("SourceMajorVersion")
        public String sourceMajorVersion;

        /**
         * <p>The major engine version of the target instance.</p>
         * 
         * <strong>example:</strong>
         * <p>12.0</p>
         */
        @NameInMap("TargetMajorVersion")
        public String targetMajorVersion;

        /**
         * <p>The ID of the check task before the major engine version upgrade.</p>
         * 
         * <strong>example:</strong>
         * <p>416980000</p>
         */
        @NameInMap("TaskId")
        public Integer taskId;

        /**
         * <p>The mode of the major engine version upgrade.</p>
         * 
         * <strong>example:</strong>
         * <p>zeroDownTimeUpgrade</p>
         */
        @NameInMap("UpgradeMode")
        public String upgradeMode;

        public static DescribeUpgradeMajorVersionPrecheckTaskResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeUpgradeMajorVersionPrecheckTaskResponseBodyItems self = new DescribeUpgradeMajorVersionPrecheckTaskResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeUpgradeMajorVersionPrecheckTaskResponseBodyItems setCheckTime(String checkTime) {
            this.checkTime = checkTime;
            return this;
        }
        public String getCheckTime() {
            return this.checkTime;
        }

        public DescribeUpgradeMajorVersionPrecheckTaskResponseBodyItems setDetail(String detail) {
            this.detail = detail;
            return this;
        }
        public String getDetail() {
            return this.detail;
        }

        public DescribeUpgradeMajorVersionPrecheckTaskResponseBodyItems setEffectiveTime(String effectiveTime) {
            this.effectiveTime = effectiveTime;
            return this;
        }
        public String getEffectiveTime() {
            return this.effectiveTime;
        }

        public DescribeUpgradeMajorVersionPrecheckTaskResponseBodyItems setRecommendDiskSize(Integer recommendDiskSize) {
            this.recommendDiskSize = recommendDiskSize;
            return this;
        }
        public Integer getRecommendDiskSize() {
            return this.recommendDiskSize;
        }

        public DescribeUpgradeMajorVersionPrecheckTaskResponseBodyItems setRecommendLeastMemSize(Integer recommendLeastMemSize) {
            this.recommendLeastMemSize = recommendLeastMemSize;
            return this;
        }
        public Integer getRecommendLeastMemSize() {
            return this.recommendLeastMemSize;
        }

        public DescribeUpgradeMajorVersionPrecheckTaskResponseBodyItems setRecommendMemSize(Integer recommendMemSize) {
            this.recommendMemSize = recommendMemSize;
            return this;
        }
        public Integer getRecommendMemSize() {
            return this.recommendMemSize;
        }

        public DescribeUpgradeMajorVersionPrecheckTaskResponseBodyItems setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

        public DescribeUpgradeMajorVersionPrecheckTaskResponseBodyItems setSourceMajorVersion(String sourceMajorVersion) {
            this.sourceMajorVersion = sourceMajorVersion;
            return this;
        }
        public String getSourceMajorVersion() {
            return this.sourceMajorVersion;
        }

        public DescribeUpgradeMajorVersionPrecheckTaskResponseBodyItems setTargetMajorVersion(String targetMajorVersion) {
            this.targetMajorVersion = targetMajorVersion;
            return this;
        }
        public String getTargetMajorVersion() {
            return this.targetMajorVersion;
        }

        public DescribeUpgradeMajorVersionPrecheckTaskResponseBodyItems setTaskId(Integer taskId) {
            this.taskId = taskId;
            return this;
        }
        public Integer getTaskId() {
            return this.taskId;
        }

        public DescribeUpgradeMajorVersionPrecheckTaskResponseBodyItems setUpgradeMode(String upgradeMode) {
            this.upgradeMode = upgradeMode;
            return this;
        }
        public String getUpgradeMode() {
            return this.upgradeMode;
        }

    }

}
