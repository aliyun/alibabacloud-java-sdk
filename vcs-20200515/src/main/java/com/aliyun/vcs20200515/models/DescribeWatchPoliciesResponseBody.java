// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class DescribeWatchPoliciesResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public DescribeWatchPoliciesResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeWatchPoliciesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeWatchPoliciesResponseBody self = new DescribeWatchPoliciesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeWatchPoliciesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeWatchPoliciesResponseBody setData(DescribeWatchPoliciesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeWatchPoliciesResponseBodyData getData() {
        return this.data;
    }

    public DescribeWatchPoliciesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeWatchPoliciesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeWatchPoliciesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeWatchPoliciesResponseBodyDataRecords extends TeaModel {
        @NameInMap("ItemMatchType")
        public String itemMatchType;

        @NameInMap("SimilarityThreshold")
        public Double similarityThreshold;

        @NameInMap("TargetType")
        public String targetType;

        @NameInMap("WatchMode")
        public String watchMode;

        @NameInMap("WatchPolicyId")
        public String watchPolicyId;

        @NameInMap("WatchPolicyName")
        public String watchPolicyName;

        public static DescribeWatchPoliciesResponseBodyDataRecords build(java.util.Map<String, ?> map) throws Exception {
            DescribeWatchPoliciesResponseBodyDataRecords self = new DescribeWatchPoliciesResponseBodyDataRecords();
            return TeaModel.build(map, self);
        }

        public DescribeWatchPoliciesResponseBodyDataRecords setItemMatchType(String itemMatchType) {
            this.itemMatchType = itemMatchType;
            return this;
        }
        public String getItemMatchType() {
            return this.itemMatchType;
        }

        public DescribeWatchPoliciesResponseBodyDataRecords setSimilarityThreshold(Double similarityThreshold) {
            this.similarityThreshold = similarityThreshold;
            return this;
        }
        public Double getSimilarityThreshold() {
            return this.similarityThreshold;
        }

        public DescribeWatchPoliciesResponseBodyDataRecords setTargetType(String targetType) {
            this.targetType = targetType;
            return this;
        }
        public String getTargetType() {
            return this.targetType;
        }

        public DescribeWatchPoliciesResponseBodyDataRecords setWatchMode(String watchMode) {
            this.watchMode = watchMode;
            return this;
        }
        public String getWatchMode() {
            return this.watchMode;
        }

        public DescribeWatchPoliciesResponseBodyDataRecords setWatchPolicyId(String watchPolicyId) {
            this.watchPolicyId = watchPolicyId;
            return this;
        }
        public String getWatchPolicyId() {
            return this.watchPolicyId;
        }

        public DescribeWatchPoliciesResponseBodyDataRecords setWatchPolicyName(String watchPolicyName) {
            this.watchPolicyName = watchPolicyName;
            return this;
        }
        public String getWatchPolicyName() {
            return this.watchPolicyName;
        }

    }

    public static class DescribeWatchPoliciesResponseBodyData extends TeaModel {
        @NameInMap("PageNumber")
        public Long pageNumber;

        @NameInMap("PageSize")
        public Long pageSize;

        @NameInMap("Records")
        public java.util.List<DescribeWatchPoliciesResponseBodyDataRecords> records;

        @NameInMap("TotalCount")
        public Long totalCount;

        public static DescribeWatchPoliciesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeWatchPoliciesResponseBodyData self = new DescribeWatchPoliciesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeWatchPoliciesResponseBodyData setPageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Long getPageNumber() {
            return this.pageNumber;
        }

        public DescribeWatchPoliciesResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public DescribeWatchPoliciesResponseBodyData setRecords(java.util.List<DescribeWatchPoliciesResponseBodyDataRecords> records) {
            this.records = records;
            return this;
        }
        public java.util.List<DescribeWatchPoliciesResponseBodyDataRecords> getRecords() {
            return this.records;
        }

        public DescribeWatchPoliciesResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
