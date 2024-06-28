// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ListEnhanhcedNatGatewayAvailableZonesRequest extends TeaModel {
    /**
     * <p>The language to display the results. Valid values:</p>
     * <ul>
     * <li><strong>zh-CN</strong> (default): Chinese</li>
     * <li><strong>en-US</strong>: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh-CN</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The filter information. You can specify a filter key and a filter value.</p>
     */
    @NameInMap("Filter")
    public java.util.List<ListEnhanhcedNatGatewayAvailableZonesRequestFilter> filter;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The ID of the region that you want to query.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * <p>In this example, zones that support NAT gateways in the UAE (Dubai) region are queried.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>me-east-1</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static ListEnhanhcedNatGatewayAvailableZonesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListEnhanhcedNatGatewayAvailableZonesRequest self = new ListEnhanhcedNatGatewayAvailableZonesRequest();
        return TeaModel.build(map, self);
    }

    public ListEnhanhcedNatGatewayAvailableZonesRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public ListEnhanhcedNatGatewayAvailableZonesRequest setFilter(java.util.List<ListEnhanhcedNatGatewayAvailableZonesRequestFilter> filter) {
        this.filter = filter;
        return this;
    }
    public java.util.List<ListEnhanhcedNatGatewayAvailableZonesRequestFilter> getFilter() {
        return this.filter;
    }

    public ListEnhanhcedNatGatewayAvailableZonesRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ListEnhanhcedNatGatewayAvailableZonesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ListEnhanhcedNatGatewayAvailableZonesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListEnhanhcedNatGatewayAvailableZonesRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ListEnhanhcedNatGatewayAvailableZonesRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public static class ListEnhanhcedNatGatewayAvailableZonesRequestFilter extends TeaModel {
        /**
         * <p>The filter key. Only <strong>PrivateLinkEnabled</strong> is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>PrivateLinkEnabled</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the filter key.</p>
         * <blockquote>
         * <p> If the filter key is set to <strong>PrivateLinkEnabled</strong>, you must specify a filter value. Valid values: <strong>true</strong> and <strong>false</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListEnhanhcedNatGatewayAvailableZonesRequestFilter build(java.util.Map<String, ?> map) throws Exception {
            ListEnhanhcedNatGatewayAvailableZonesRequestFilter self = new ListEnhanhcedNatGatewayAvailableZonesRequestFilter();
            return TeaModel.build(map, self);
        }

        public ListEnhanhcedNatGatewayAvailableZonesRequestFilter setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListEnhanhcedNatGatewayAvailableZonesRequestFilter setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
