// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeVpnAttachmentsResponseBody extends TeaModel {
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

    /**
     * <p>The list of IPsec-VPN connections associated with the transit router.</p>
     */
    @NameInMap("VpnAttachments")
    public java.util.List<DescribeVpnAttachmentsResponseBodyVpnAttachments> vpnAttachments;

    public static DescribeVpnAttachmentsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVpnAttachmentsResponseBody self = new DescribeVpnAttachmentsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVpnAttachmentsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeVpnAttachmentsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeVpnAttachmentsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVpnAttachmentsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeVpnAttachmentsResponseBody setVpnAttachments(java.util.List<DescribeVpnAttachmentsResponseBodyVpnAttachments> vpnAttachments) {
        this.vpnAttachments = vpnAttachments;
        return this;
    }
    public java.util.List<DescribeVpnAttachmentsResponseBodyVpnAttachments> getVpnAttachments() {
        return this.vpnAttachments;
    }

    public static class DescribeVpnAttachmentsResponseBodyVpnAttachments extends TeaModel {
        /**
         * <p>The type of resource that is associated with the IPsec-VPN connection. The value is set to **CEN**, which indicates that the IPsec-VPN connection is associated with a transit router.</p>
         */
        @NameInMap("AttachType")
        public String attachType;

        /**
         * <p>Indicates whether the IPsec-VPN connection is associated with a transit router that belongs to another Alibaba Cloud account. Valid values:</p>
         * <br>
         * <p>*   **true**: yes</p>
         * <p>*   **false**: no</p>
         */
        @NameInMap("CrossAccountAuthorized")
        public Boolean crossAccountAuthorized;

        /**
         * <p>The description of the IPsec-VPN connection.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The ID of the IPsec-VPN connection.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The name of the IPsec-VPN connection.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The ID of the transit router with which the IPsec-VPN connection is associated.</p>
         */
        @NameInMap("TransitRouterId")
        public String transitRouterId;

        /**
         * <p>The name of the transit router.</p>
         */
        @NameInMap("TransitRouterName")
        public String transitRouterName;

        public static DescribeVpnAttachmentsResponseBodyVpnAttachments build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpnAttachmentsResponseBodyVpnAttachments self = new DescribeVpnAttachmentsResponseBodyVpnAttachments();
            return TeaModel.build(map, self);
        }

        public DescribeVpnAttachmentsResponseBodyVpnAttachments setAttachType(String attachType) {
            this.attachType = attachType;
            return this;
        }
        public String getAttachType() {
            return this.attachType;
        }

        public DescribeVpnAttachmentsResponseBodyVpnAttachments setCrossAccountAuthorized(Boolean crossAccountAuthorized) {
            this.crossAccountAuthorized = crossAccountAuthorized;
            return this;
        }
        public Boolean getCrossAccountAuthorized() {
            return this.crossAccountAuthorized;
        }

        public DescribeVpnAttachmentsResponseBodyVpnAttachments setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeVpnAttachmentsResponseBodyVpnAttachments setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeVpnAttachmentsResponseBodyVpnAttachments setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeVpnAttachmentsResponseBodyVpnAttachments setTransitRouterId(String transitRouterId) {
            this.transitRouterId = transitRouterId;
            return this;
        }
        public String getTransitRouterId() {
            return this.transitRouterId;
        }

        public DescribeVpnAttachmentsResponseBodyVpnAttachments setTransitRouterName(String transitRouterName) {
            this.transitRouterName = transitRouterName;
            return this;
        }
        public String getTransitRouterName() {
            return this.transitRouterName;
        }

    }

}
