// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeUpgradeMajorVersionPrecheckTaskResponseBody extends TeaModel {
    @NameInMap("Items")
    public java.util.List<DescribeUpgradeMajorVersionPrecheckTaskResponseBodyItems> items;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageRecordCount")
    public Integer pageRecordCount;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("CheckTime")
        public String checkTime;

        @NameInMap("Detail")
        public String detail;

        @NameInMap("EffectiveTime")
        public String effectiveTime;

        @NameInMap("Result")
        public String result;

        @NameInMap("SourceMajorVersion")
        public String sourceMajorVersion;

        @NameInMap("TargetMajorVersion")
        public String targetMajorVersion;

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
