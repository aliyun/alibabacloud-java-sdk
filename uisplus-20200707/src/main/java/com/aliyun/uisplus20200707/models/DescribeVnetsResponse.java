// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.uisplus20200707.models;

import com.aliyun.tea.*;

public class DescribeVnetsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Integer totalCount;

    @NameInMap("Vnets")
    @Validation(required = true)
    public java.util.List<DescribeVnetsResponseVnets> vnets;

    public static DescribeVnetsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVnetsResponse self = new DescribeVnetsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVnetsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVnetsResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeVnetsResponse setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeVnetsResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeVnetsResponse setVnets(java.util.List<DescribeVnetsResponseVnets> vnets) {
        this.vnets = vnets;
        return this;
    }
    public java.util.List<DescribeVnetsResponseVnets> getVnets() {
        return this.vnets;
    }

    public static class DescribeVnetsResponseVnets extends TeaModel {
        @NameInMap("UisId")
        @Validation(required = true)
        public String uisId;

        @NameInMap("VnetId")
        @Validation(required = true)
        public String vnetId;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("Cidrs")
        @Validation(required = true)
        public String cidrs;

        @NameInMap("MbpsQuota")
        @Validation(required = true)
        public Integer mbpsQuota;

        @NameInMap("KppsQuota")
        @Validation(required = true)
        public Integer kppsQuota;

        @NameInMap("FlowQuota")
        @Validation(required = true)
        public Integer flowQuota;

        @NameInMap("State")
        @Validation(required = true)
        public String state;

        public static DescribeVnetsResponseVnets build(java.util.Map<String, ?> map) throws Exception {
            DescribeVnetsResponseVnets self = new DescribeVnetsResponseVnets();
            return TeaModel.build(map, self);
        }

        public DescribeVnetsResponseVnets setUisId(String uisId) {
            this.uisId = uisId;
            return this;
        }
        public String getUisId() {
            return this.uisId;
        }

        public DescribeVnetsResponseVnets setVnetId(String vnetId) {
            this.vnetId = vnetId;
            return this;
        }
        public String getVnetId() {
            return this.vnetId;
        }

        public DescribeVnetsResponseVnets setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeVnetsResponseVnets setCidrs(String cidrs) {
            this.cidrs = cidrs;
            return this;
        }
        public String getCidrs() {
            return this.cidrs;
        }

        public DescribeVnetsResponseVnets setMbpsQuota(Integer mbpsQuota) {
            this.mbpsQuota = mbpsQuota;
            return this;
        }
        public Integer getMbpsQuota() {
            return this.mbpsQuota;
        }

        public DescribeVnetsResponseVnets setKppsQuota(Integer kppsQuota) {
            this.kppsQuota = kppsQuota;
            return this;
        }
        public Integer getKppsQuota() {
            return this.kppsQuota;
        }

        public DescribeVnetsResponseVnets setFlowQuota(Integer flowQuota) {
            this.flowQuota = flowQuota;
            return this;
        }
        public Integer getFlowQuota() {
            return this.flowQuota;
        }

        public DescribeVnetsResponseVnets setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

    }

}
