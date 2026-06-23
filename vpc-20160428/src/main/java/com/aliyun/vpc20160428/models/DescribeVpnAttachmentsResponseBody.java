// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeVpnAttachmentsResponseBody extends TeaModel {
    /**
     * <p>The page number of the list.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page when paging is used.</p>
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
     * <p>9F0725BB-186A-3564-91C3-AAE48042F853</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    /**
     * <p>The list of IPsec-VPN connections that are associated with transit router instances.</p>
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

    public static class DescribeVpnAttachmentsResponseBodyVpnAttachmentsTags extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>TagKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>TagValue</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeVpnAttachmentsResponseBodyVpnAttachmentsTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpnAttachmentsResponseBodyVpnAttachmentsTags self = new DescribeVpnAttachmentsResponseBodyVpnAttachmentsTags();
            return TeaModel.build(map, self);
        }

        public DescribeVpnAttachmentsResponseBodyVpnAttachmentsTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeVpnAttachmentsResponseBodyVpnAttachmentsTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeVpnAttachmentsResponseBodyVpnAttachments extends TeaModel {
        /**
         * <p>The type of resource to which the IPsec-VPN connection is attached. The value is <strong>CEN</strong>, which indicates that the IPsec-VPN connection is associated with a transit router instance.</p>
         * 
         * <strong>example:</strong>
         * <p>CEN</p>
         */
        @NameInMap("AttachType")
        public String attachType;

        /**
         * <p>Indicates whether the IPsec-VPN connection is associated with a transit router instance that belongs to a different Alibaba Cloud account.</p>
         * <ul>
         * <li><strong>true</strong>: yes.</li>
         * <li><strong>false</strong>: no.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("CrossAccountAuthorized")
        public Boolean crossAccountAuthorized;

        /**
         * <p>The description of the IPsec-VPN connection.</p>
         * 
         * <strong>example:</strong>
         * <p>desctest</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The ID of the IPsec-VPN connection.</p>
         * 
         * <strong>example:</strong>
         * <p>vco-p0w2jpkhi2eeop6q6****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The name of the IPsec-VPN connection.</p>
         * 
         * <strong>example:</strong>
         * <p>nametest1</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The system tags of the IPsec-VPN connection.</p>
         * <p>You can use system tags to check whether the IPsec-VPN connection supports BGP. You do not need to pay attention to other properties.</p>
         * <p><strong>BGPSupport</strong>: indicates whether the IPsec-VPN connection supports BGP.</p>
         * <ul>
         * <li><strong>true</strong>: supported.</li>
         * <li><strong>false</strong>: not supported.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;description\&quot;:\&quot;转发1.7.22\&quot;,\&quot;VisuallySsl\&quot;:\&quot;true\&quot;,\&quot;PbrPriority\&quot;:\&quot;true\&quot;,\&quot;BGPSupport\&quot;:\&quot;true\&quot;,\&quot;IDaaSNewVersion\&quot;:\&quot;true\&quot;}</p>
         */
        @NameInMap("Tag")
        public String tag;

        /**
         * <p>The list of tags that are attached to the IPsec-VPN connection.</p>
         */
        @NameInMap("Tags")
        public java.util.List<DescribeVpnAttachmentsResponseBodyVpnAttachmentsTags> tags;

        /**
         * <p>The ID of the transit routing instance to which the IPsec-VPN connection is attached.</p>
         * 
         * <strong>example:</strong>
         * <p>tr-p0wkh4yryb1dnanqw****</p>
         */
        @NameInMap("TransitRouterId")
        public String transitRouterId;

        /**
         * <p>The name of the transit router instance.</p>
         * 
         * <strong>example:</strong>
         * <p>nametest2</p>
         */
        @NameInMap("TransitRouterName")
        public String transitRouterName;

        /**
         * <p>The bandwidth specification of a single VPN tunnel. Valid values:
         * Standard (default): standard. The default bandwidth is 1 Gbit/s.
         * Large: large. The default bandwidth is 3 Gbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>Standard</p>
         */
        @NameInMap("TunnelBandwidth")
        public String tunnelBandwidth;

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

        public DescribeVpnAttachmentsResponseBodyVpnAttachments setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

        public DescribeVpnAttachmentsResponseBodyVpnAttachments setTags(java.util.List<DescribeVpnAttachmentsResponseBodyVpnAttachmentsTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<DescribeVpnAttachmentsResponseBodyVpnAttachmentsTags> getTags() {
            return this.tags;
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

        public DescribeVpnAttachmentsResponseBodyVpnAttachments setTunnelBandwidth(String tunnelBandwidth) {
            this.tunnelBandwidth = tunnelBandwidth;
            return this;
        }
        public String getTunnelBandwidth() {
            return this.tunnelBandwidth;
        }

    }

}
