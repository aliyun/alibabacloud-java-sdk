// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeAttestorsResponseBody extends TeaModel {
    /**
     * <p>The witnesses.</p>
     */
    @NameInMap("Attestors")
    public java.util.List<DescribeAttestorsResponseBodyAttestors> attestors;

    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("PageInfo")
    public DescribeAttestorsResponseBodyPageInfo pageInfo;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>7BC55C8F-226E-5AF5-9A2C-2EC43864****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeAttestorsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAttestorsResponseBody self = new DescribeAttestorsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAttestorsResponseBody setAttestors(java.util.List<DescribeAttestorsResponseBodyAttestors> attestors) {
        this.attestors = attestors;
        return this;
    }
    public java.util.List<DescribeAttestorsResponseBodyAttestors> getAttestors() {
        return this.attestors;
    }

    public DescribeAttestorsResponseBody setPageInfo(DescribeAttestorsResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public DescribeAttestorsResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public DescribeAttestorsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeAttestorsResponseBodyAttestors extends TeaModel {
        /**
         * <p>The ID of the KMS key.</p>
         * 
         * <strong>example:</strong>
         * <p>2e81355b-f8e7-4090-8082-a8f8124a****</p>
         */
        @NameInMap("KeyId")
        public String keyId;

        /**
         * <p>The region ID of the KMS key.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("KeyRegionId")
        public String keyRegionId;

        /**
         * <p>The version ID of the Key Management Service (KMS) key.</p>
         * 
         * <strong>example:</strong>
         * <p>8d7c9c91-57ce-4cf4-a959-1e700e13****</p>
         */
        @NameInMap("KeyVersionId")
        public String keyVersionId;

        /**
         * <p>The name of the witness.</p>
         * 
         * <strong>example:</strong>
         * <p>attestor-123</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>attestor</p>
         */
        @NameInMap("Remark")
        public String remark;

        public static DescribeAttestorsResponseBodyAttestors build(java.util.Map<String, ?> map) throws Exception {
            DescribeAttestorsResponseBodyAttestors self = new DescribeAttestorsResponseBodyAttestors();
            return TeaModel.build(map, self);
        }

        public DescribeAttestorsResponseBodyAttestors setKeyId(String keyId) {
            this.keyId = keyId;
            return this;
        }
        public String getKeyId() {
            return this.keyId;
        }

        public DescribeAttestorsResponseBodyAttestors setKeyRegionId(String keyRegionId) {
            this.keyRegionId = keyRegionId;
            return this;
        }
        public String getKeyRegionId() {
            return this.keyRegionId;
        }

        public DescribeAttestorsResponseBodyAttestors setKeyVersionId(String keyVersionId) {
            this.keyVersionId = keyVersionId;
            return this;
        }
        public String getKeyVersionId() {
            return this.keyVersionId;
        }

        public DescribeAttestorsResponseBodyAttestors setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeAttestorsResponseBodyAttestors setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

    }

    public static class DescribeAttestorsResponseBodyPageInfo extends TeaModel {
        /**
         * <p>The number of entries returned on the current page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>The number of entries per page.</p>
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
         * <p>122</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static DescribeAttestorsResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeAttestorsResponseBodyPageInfo self = new DescribeAttestorsResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public DescribeAttestorsResponseBodyPageInfo setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public DescribeAttestorsResponseBodyPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public DescribeAttestorsResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DescribeAttestorsResponseBodyPageInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
