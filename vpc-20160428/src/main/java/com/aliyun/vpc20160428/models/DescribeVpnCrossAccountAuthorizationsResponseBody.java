// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeVpnCrossAccountAuthorizationsResponseBody extends TeaModel {
    @NameInMap("CrossAccountAuthorizations")
    public java.util.List<DescribeVpnCrossAccountAuthorizationsResponseBodyCrossAccountAuthorizations> crossAccountAuthorizations;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeVpnCrossAccountAuthorizationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVpnCrossAccountAuthorizationsResponseBody self = new DescribeVpnCrossAccountAuthorizationsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVpnCrossAccountAuthorizationsResponseBody setCrossAccountAuthorizations(java.util.List<DescribeVpnCrossAccountAuthorizationsResponseBodyCrossAccountAuthorizations> crossAccountAuthorizations) {
        this.crossAccountAuthorizations = crossAccountAuthorizations;
        return this;
    }
    public java.util.List<DescribeVpnCrossAccountAuthorizationsResponseBodyCrossAccountAuthorizations> getCrossAccountAuthorizations() {
        return this.crossAccountAuthorizations;
    }

    public DescribeVpnCrossAccountAuthorizationsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeVpnCrossAccountAuthorizationsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeVpnCrossAccountAuthorizationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVpnCrossAccountAuthorizationsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeVpnCrossAccountAuthorizationsResponseBodyCrossAccountAuthorizations extends TeaModel {
        @NameInMap("AliUid")
        public Long aliUid;

        @NameInMap("BindInstance")
        public String bindInstance;

        @NameInMap("BindProduct")
        public String bindProduct;

        @NameInMap("BindUid")
        public Long bindUid;

        @NameInMap("CreationTime")
        public Long creationTime;

        @NameInMap("VpnConnectionId")
        public String vpnConnectionId;

        public static DescribeVpnCrossAccountAuthorizationsResponseBodyCrossAccountAuthorizations build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpnCrossAccountAuthorizationsResponseBodyCrossAccountAuthorizations self = new DescribeVpnCrossAccountAuthorizationsResponseBodyCrossAccountAuthorizations();
            return TeaModel.build(map, self);
        }

        public DescribeVpnCrossAccountAuthorizationsResponseBodyCrossAccountAuthorizations setAliUid(Long aliUid) {
            this.aliUid = aliUid;
            return this;
        }
        public Long getAliUid() {
            return this.aliUid;
        }

        public DescribeVpnCrossAccountAuthorizationsResponseBodyCrossAccountAuthorizations setBindInstance(String bindInstance) {
            this.bindInstance = bindInstance;
            return this;
        }
        public String getBindInstance() {
            return this.bindInstance;
        }

        public DescribeVpnCrossAccountAuthorizationsResponseBodyCrossAccountAuthorizations setBindProduct(String bindProduct) {
            this.bindProduct = bindProduct;
            return this;
        }
        public String getBindProduct() {
            return this.bindProduct;
        }

        public DescribeVpnCrossAccountAuthorizationsResponseBodyCrossAccountAuthorizations setBindUid(Long bindUid) {
            this.bindUid = bindUid;
            return this;
        }
        public Long getBindUid() {
            return this.bindUid;
        }

        public DescribeVpnCrossAccountAuthorizationsResponseBodyCrossAccountAuthorizations setCreationTime(Long creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public Long getCreationTime() {
            return this.creationTime;
        }

        public DescribeVpnCrossAccountAuthorizationsResponseBodyCrossAccountAuthorizations setVpnConnectionId(String vpnConnectionId) {
            this.vpnConnectionId = vpnConnectionId;
            return this;
        }
        public String getVpnConnectionId() {
            return this.vpnConnectionId;
        }

    }

}
