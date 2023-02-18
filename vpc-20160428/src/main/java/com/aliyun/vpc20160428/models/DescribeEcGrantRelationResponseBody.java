// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeEcGrantRelationResponseBody extends TeaModel {
    @NameInMap("Count")
    public Integer count;

    @NameInMap("EcGrantRelations")
    public java.util.List<DescribeEcGrantRelationResponseBodyEcGrantRelations> ecGrantRelations;

    @NameInMap("Page")
    public Integer page;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("AliUid")
        public Long aliUid;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GrantType")
        public String grantType;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("InstanceRouterId")
        public String instanceRouterId;

        @NameInMap("RegionNo")
        public String regionNo;

        @NameInMap("Status")
        public String status;

        @NameInMap("VbrInstanceId")
        public String vbrInstanceId;

        @NameInMap("VbrOwnerUid")
        public Long vbrOwnerUid;

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
