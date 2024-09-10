// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeClientProblemTypeResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("Count")
    public Integer count;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ProblemTypes")
    public java.util.List<DescribeClientProblemTypeResponseBodyProblemTypes> problemTypes;

    /**
     * <strong>example:</strong>
     * <p>D65AADFC-1D20-5A6A-8F6A-9FA53CXXXXX</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>21</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeClientProblemTypeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeClientProblemTypeResponseBody self = new DescribeClientProblemTypeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeClientProblemTypeResponseBody setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public DescribeClientProblemTypeResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeClientProblemTypeResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeClientProblemTypeResponseBody setProblemTypes(java.util.List<DescribeClientProblemTypeResponseBodyProblemTypes> problemTypes) {
        this.problemTypes = problemTypes;
        return this;
    }
    public java.util.List<DescribeClientProblemTypeResponseBodyProblemTypes> getProblemTypes() {
        return this.problemTypes;
    }

    public DescribeClientProblemTypeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeClientProblemTypeResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeClientProblemTypeResponseBodyProblemTypes extends TeaModel {
        @NameInMap("problemDetail")
        public String problemDetail;

        /**
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("problemId")
        public String problemId;

        /**
         * <strong>example:</strong>
         * <p>high_cpu</p>
         */
        @NameInMap("problemType")
        public String problemType;

        public static DescribeClientProblemTypeResponseBodyProblemTypes build(java.util.Map<String, ?> map) throws Exception {
            DescribeClientProblemTypeResponseBodyProblemTypes self = new DescribeClientProblemTypeResponseBodyProblemTypes();
            return TeaModel.build(map, self);
        }

        public DescribeClientProblemTypeResponseBodyProblemTypes setProblemDetail(String problemDetail) {
            this.problemDetail = problemDetail;
            return this;
        }
        public String getProblemDetail() {
            return this.problemDetail;
        }

        public DescribeClientProblemTypeResponseBodyProblemTypes setProblemId(String problemId) {
            this.problemId = problemId;
            return this;
        }
        public String getProblemId() {
            return this.problemId;
        }

        public DescribeClientProblemTypeResponseBodyProblemTypes setProblemType(String problemType) {
            this.problemType = problemType;
            return this;
        }
        public String getProblemType() {
            return this.problemType;
        }

    }

}
