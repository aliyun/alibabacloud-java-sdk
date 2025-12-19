// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeGrantRulesToEcrResponseBody extends TeaModel {
    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Count")
    public Integer count;

    /**
     * <p>The cross-account authorization list of the ECR</p>
     */
    @NameInMap("EcrGrantRules")
    public java.util.List<DescribeGrantRulesToEcrResponseBodyEcrGrantRules> ecrGrantRules;

    /**
     * <p>The page number. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries on each page. Maximum value: 50. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>C1CCAB91-6AE6-50E3-AAA3-D0E5A2BC6ADE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeGrantRulesToEcrResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeGrantRulesToEcrResponseBody self = new DescribeGrantRulesToEcrResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeGrantRulesToEcrResponseBody setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public DescribeGrantRulesToEcrResponseBody setEcrGrantRules(java.util.List<DescribeGrantRulesToEcrResponseBodyEcrGrantRules> ecrGrantRules) {
        this.ecrGrantRules = ecrGrantRules;
        return this;
    }
    public java.util.List<DescribeGrantRulesToEcrResponseBodyEcrGrantRules> getEcrGrantRules() {
        return this.ecrGrantRules;
    }

    public DescribeGrantRulesToEcrResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeGrantRulesToEcrResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeGrantRulesToEcrResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeGrantRulesToEcrResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeGrantRulesToEcrResponseBodyEcrGrantRules extends TeaModel {
        /**
         * <p>The authorization time. The time follows the ISO8601 standard and uses UTC time. The format is YYYY-MM-DDThh:mm:ssZ.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-09-15T14:00:00Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The ECR account ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ecr-xxxxxx</p>
         */
        @NameInMap("EcrInstanceId")
        public String ecrInstanceId;

        /**
         * <p>The ECR account ID.</p>
         * 
         * <strong>example:</strong>
         * <p>11111111111</p>
         */
        @NameInMap("EcrUid")
        public Long ecrUid;

        public static DescribeGrantRulesToEcrResponseBodyEcrGrantRules build(java.util.Map<String, ?> map) throws Exception {
            DescribeGrantRulesToEcrResponseBodyEcrGrantRules self = new DescribeGrantRulesToEcrResponseBodyEcrGrantRules();
            return TeaModel.build(map, self);
        }

        public DescribeGrantRulesToEcrResponseBodyEcrGrantRules setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeGrantRulesToEcrResponseBodyEcrGrantRules setEcrInstanceId(String ecrInstanceId) {
            this.ecrInstanceId = ecrInstanceId;
            return this;
        }
        public String getEcrInstanceId() {
            return this.ecrInstanceId;
        }

        public DescribeGrantRulesToEcrResponseBodyEcrGrantRules setEcrUid(Long ecrUid) {
            this.ecrUid = ecrUid;
            return this;
        }
        public Long getEcrUid() {
            return this.ecrUid;
        }

    }

}
