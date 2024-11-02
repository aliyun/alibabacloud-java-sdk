// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class DescribeDistinctReleasesResponseBody extends TeaModel {
    /**
     * <p>The information about versions.</p>
     */
    @NameInMap("Records")
    public java.util.List<DescribeDistinctReleasesResponseBodyRecords> records;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>145CACF6-D276-5197-8549-CB1AD76E2AC8</p>
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
         * 
         * <strong>example:</strong>
         * <p>demo version</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The MD5 value of the version XML configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>17cf53049bc8efa941207xxxxx</p>
         */
        @NameInMap("TaskflowMd5")
        public String taskflowMd5;

        /**
         * <p>The format of the playbook. Valid values:</p>
         * <ul>
         * <li><strong>xml</strong>: XML format.</li>
         * <li><strong>x6</strong>: JSON format.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>x6</p>
         */
        @NameInMap("TaskflowType")
        public String taskflowType;

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

        public DescribeDistinctReleasesResponseBodyRecords setTaskflowType(String taskflowType) {
            this.taskflowType = taskflowType;
            return this;
        }
        public String getTaskflowType() {
            return this.taskflowType;
        }

    }

}
