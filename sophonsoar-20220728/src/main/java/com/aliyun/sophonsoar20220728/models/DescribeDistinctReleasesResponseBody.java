// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class DescribeDistinctReleasesResponseBody extends TeaModel {
    /**
     * <p>The version information.</p>
     */
    @NameInMap("Records")
    public java.util.List<DescribeDistinctReleasesResponseBodyRecords> records;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDistinctReleasesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDistinctReleasesResponseBody self = new DescribeDistinctReleasesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDistinctReleasesResponseBody setRecords(java.util.List<DescribeDistinctReleasesResponseBodyRecords> records) {
        this.records = records;
        return this;
    }
    public java.util.List<DescribeDistinctReleasesResponseBodyRecords> getRecords() {
        return this.records;
    }

    public DescribeDistinctReleasesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDistinctReleasesResponseBodyRecords extends TeaModel {
        /**
         * <p>The version description.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The MD5 value of the playbook XML configuration.</p>
         */
        @NameInMap("TaskflowMd5")
        public String taskflowMd5;

        public static DescribeDistinctReleasesResponseBodyRecords build(java.util.Map<String, ?> map) throws Exception {
            DescribeDistinctReleasesResponseBodyRecords self = new DescribeDistinctReleasesResponseBodyRecords();
            return TeaModel.build(map, self);
        }

        public DescribeDistinctReleasesResponseBodyRecords setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeDistinctReleasesResponseBodyRecords setTaskflowMd5(String taskflowMd5) {
            this.taskflowMd5 = taskflowMd5;
            return this;
        }
        public String getTaskflowMd5() {
            return this.taskflowMd5;
        }

    }

}
