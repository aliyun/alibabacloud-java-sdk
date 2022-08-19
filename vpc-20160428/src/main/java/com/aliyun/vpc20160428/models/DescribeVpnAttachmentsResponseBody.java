// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeVpnAttachmentsResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

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
        @NameInMap("AttachType")
        public String attachType;

        @NameInMap("CrossAccountAuthorized")
        public Boolean crossAccountAuthorized;

        @NameInMap("Description")
        public String description;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Name")
        public String name;

        @NameInMap("TransitRouterId")
        public String transitRouterId;

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
