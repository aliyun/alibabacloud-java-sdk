// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeUpgradeMajorVersionPrecheckTaskResponseBody extends TeaModel {
    /**
     * <p>The information about the upgrade check report.</p>
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
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageRecordCount")
    public Integer pageRecordCount;

    /**
     * <p>The ID of the request.</p>
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
         * <p>The time at which the upgrade check was performed.</p>
         * <p>The value of this parameter is a timestamp that follows the UNIX time format. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1635143903000</p>
         */
        @NameInMap("CheckTime")
        public String checkTime;

        /**
         * <p>The content of the upgrade check report.</p>
         * 
         * <strong>example:</strong>
         * <p>[user_check_report]User check success\n[pg_upgrade_internal.log]Performing...</p>
         */
        @NameInMap("Detail")
        public String detail;

        /**
         * <p>The expiration time of the upgrade check report.</p>
         * <p>The value of this parameter is a timestamp that follows the UNIX time format. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1635748703000</p>
         */
        @NameInMap("EffectiveTime")
        public String effectiveTime;

        /**
         * <p>The result of the upgrade check.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>Success</li>
         * <li>Fail</li>
         * </ul>
         * <blockquote>
         * <p> If the check result is <strong>Fail</strong>, you must check the value of the <strong>Detail</strong> parameter to obtain the information about the errors that occurred, resolve the errors, and then try again. For more information about how to resolve common errors, see <a href="https://help.aliyun.com/document_detail/218391.html">Introduction to the check report for a major engine version upgrade to an ApsaraDB RDS for PostgreSQL instance</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        @NameInMap("Result")
        public String result;

        /**
         * <p>The original major engine version of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>11.0</p>
         */
        @NameInMap("SourceMajorVersion")
        public String sourceMajorVersion;

        /**
         * <p>The new major engine version of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>12.0</p>
         */
        @NameInMap("TargetMajorVersion")
        public String targetMajorVersion;

        /**
         * <p>The ID of the upgrade check task.</p>
         * 
         * <strong>example:</strong>
         * <p>416980000</p>
         */
        @NameInMap("TaskId")
        public Integer taskId;

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

    }

}
