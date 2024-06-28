// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeEcGrantRelationResponseBody extends TeaModel {
    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Count")
    public Integer count;

    /**
     * <p>The query results.</p>
     */
    @NameInMap("EcGrantRelations")
    public java.util.List<DescribeEcGrantRelationResponseBodyEcGrantRelations> ecGrantRelations;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Page")
    public Integer page;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>E6E90F6B-2B41-5AAF-ABEB-236ADBAAD91D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeEcGrantRelationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeEcGrantRelationResponseBody self = new DescribeEcGrantRelationResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeEcGrantRelationResponseBody setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public DescribeEcGrantRelationResponseBody setEcGrantRelations(java.util.List<DescribeEcGrantRelationResponseBodyEcGrantRelations> ecGrantRelations) {
        this.ecGrantRelations = ecGrantRelations;
        return this;
    }
    public java.util.List<DescribeEcGrantRelationResponseBodyEcGrantRelations> getEcGrantRelations() {
        return this.ecGrantRelations;
    }

    public DescribeEcGrantRelationResponseBody setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public DescribeEcGrantRelationResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeEcGrantRelationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeEcGrantRelationResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeEcGrantRelationResponseBodyEcGrantRelations extends TeaModel {
        /**
         * <p>The ID of the Alibaba Cloud account to which the VPC belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>1250123456123456</p>
         */
        @NameInMap("AliUid")
        public Long aliUid;

        /**
         * <p>The time when permissions on the VPC were granted to the VBR.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-09-02T11:46Z</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The VBRs that have permissions on the VPC. Valid values:</p>
         * <ul>
         * <li><strong>All</strong>: VBRs that reside in the specified region and belong to the specified Alibaba Cloud account all have permissions on the VPC.</li>
         * <li><strong>Specify</strong>: Only the specified VBR has permissions on the VPC.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>All</p>
         */
        @NameInMap("GrantType")
        public String grantType;

        /**
         * <p>The ID of the VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp1brjuegjc88v3u9****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The name of the VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>VPCname</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The ID of the vRouter.</p>
         * 
         * <strong>example:</strong>
         * <p>vrt-bp1i0yzgjd8ra05ec****</p>
         */
        @NameInMap("InstanceRouterId")
        public String instanceRouterId;

        /**
         * <p>The ID of the region where the VPC is deployed.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionNo")
        public String regionNo;

        /**
         * <p>The query result. Valid values:</p>
         * <ul>
         * <li><strong>Created</strong>: The VBR has permissions on the VPC.</li>
         * <li><strong>Deleted</strong>: The VBR does not have permissions on the VPC.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Created</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The ID of the VBR.</p>
         * 
         * <strong>example:</strong>
         * <p>vbr-m5ex0xf63xk8s5bob****</p>
         */
        @NameInMap("VbrInstanceId")
        public String vbrInstanceId;

        /**
         * <p>The ID of the Alibaba Cloud account to which the VBR belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>1210123456123456</p>
         */
        @NameInMap("VbrOwnerUid")
        public Long vbrOwnerUid;

        /**
         * <p>The ID of the region where the VBR is deployed.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("VbrRegionNo")
        public String vbrRegionNo;

        public static DescribeEcGrantRelationResponseBodyEcGrantRelations build(java.util.Map<String, ?> map) throws Exception {
            DescribeEcGrantRelationResponseBodyEcGrantRelations self = new DescribeEcGrantRelationResponseBodyEcGrantRelations();
            return TeaModel.build(map, self);
        }

        public DescribeEcGrantRelationResponseBodyEcGrantRelations setAliUid(Long aliUid) {
            this.aliUid = aliUid;
            return this;
        }
        public Long getAliUid() {
            return this.aliUid;
        }

        public DescribeEcGrantRelationResponseBodyEcGrantRelations setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeEcGrantRelationResponseBodyEcGrantRelations setGrantType(String grantType) {
            this.grantType = grantType;
            return this;
        }
        public String getGrantType() {
            return this.grantType;
        }

        public DescribeEcGrantRelationResponseBodyEcGrantRelations setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeEcGrantRelationResponseBodyEcGrantRelations setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeEcGrantRelationResponseBodyEcGrantRelations setInstanceRouterId(String instanceRouterId) {
            this.instanceRouterId = instanceRouterId;
            return this;
        }
        public String getInstanceRouterId() {
            return this.instanceRouterId;
        }

        public DescribeEcGrantRelationResponseBodyEcGrantRelations setRegionNo(String regionNo) {
            this.regionNo = regionNo;
            return this;
        }
        public String getRegionNo() {
            return this.regionNo;
        }

        public DescribeEcGrantRelationResponseBodyEcGrantRelations setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeEcGrantRelationResponseBodyEcGrantRelations setVbrInstanceId(String vbrInstanceId) {
            this.vbrInstanceId = vbrInstanceId;
            return this;
        }
        public String getVbrInstanceId() {
            return this.vbrInstanceId;
        }

        public DescribeEcGrantRelationResponseBodyEcGrantRelations setVbrOwnerUid(Long vbrOwnerUid) {
            this.vbrOwnerUid = vbrOwnerUid;
            return this;
        }
        public Long getVbrOwnerUid() {
            return this.vbrOwnerUid;
        }

        public DescribeEcGrantRelationResponseBodyEcGrantRelations setVbrRegionNo(String vbrRegionNo) {
            this.vbrRegionNo = vbrRegionNo;
            return this;
        }
        public String getVbrRegionNo() {
            return this.vbrRegionNo;
        }

    }

}
