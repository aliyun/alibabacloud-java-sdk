// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeVpnCrossAccountAuthorizationsResponseBody extends TeaModel {
    /**
     * <p>The cross-account authorization information about the IPsec-VPN connection.</p>
     */
    @NameInMap("CrossAccountAuthorizations")
    public java.util.List<DescribeVpnCrossAccountAuthorizationsResponseBodyCrossAccountAuthorizations> crossAccountAuthorizations;

    /**
     * <p>The page number of the returned page.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of entries returned.</p>
     */
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
        /**
         * <p>The ID of the Alibaba Cloud account to which the IPsec-VPN connection belongs.</p>
         */
        @NameInMap("AliUid")
        public Long aliUid;

        /**
         * <p>The ID of the CEN instance.</p>
         */
        @NameInMap("BindInstance")
        public String bindInstance;

        /**
         * <p>The resource type of the authorization.</p>
         * <br>
         * <p>The value is set to **CEN**, which indicates that the IPsec-VPN connection can be associated with a transit router of a Cloud Enterprise Network (CEN) instance that belongs to another Alibaba Cloud account.</p>
         */
        @NameInMap("BindProduct")
        public String bindProduct;

        /**
         * <p>The ID of the Alibaba Cloud account whose resource the IPsec-VPN connection can be associated with.</p>
         */
        @NameInMap("BindUid")
        public Long bindUid;

        /**
         * <p>The timestamp when the authorization for the IPsec-VPN connection was created.</p>
         * <br>
         * <p>This value is a UNIX timestamp representing the number of milliseconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.</p>
         */
        @NameInMap("CreationTime")
        public Long creationTime;

        /**
         * <p>The ID of the IPsec-VPN connection.</p>
         */
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
