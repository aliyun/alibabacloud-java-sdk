// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wss20211221.models;

import com.aliyun.tea.*;

public class DescribeDeliveryAddressResponseBody extends TeaModel {
    /**
     * <p>The address list.</p>
     */
    @NameInMap("Addresses")
    public java.util.List<DescribeDeliveryAddressResponseBodyAddresses> addresses;

    /**
     * <p>The request ID. Alibaba Cloud generates this unique identifier for each request.</p>
     * 
     * <strong>example:</strong>
     * <p>72481C12-69AB-5CE1-8A35-A8EFA921****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total count of addresses.</p>
     * <blockquote>
     * <p>Up to 20 addresses are supported.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>6</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeDeliveryAddressResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDeliveryAddressResponseBody self = new DescribeDeliveryAddressResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDeliveryAddressResponseBody setAddresses(java.util.List<DescribeDeliveryAddressResponseBodyAddresses> addresses) {
        this.addresses = addresses;
        return this;
    }
    public java.util.List<DescribeDeliveryAddressResponseBodyAddresses> getAddresses() {
        return this.addresses;
    }

    public DescribeDeliveryAddressResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDeliveryAddressResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeDeliveryAddressResponseBodyAddressesArea extends TeaModel {
        /**
         * <p>The area ID.</p>
         * 
         * <strong>example:</strong>
         * <p>33****</p>
         */
        @NameInMap("AreaId")
        public Long areaId;

        /**
         * <p>The area name.</p>
         * 
         * <strong>example:</strong>
         * <p>西湖区</p>
         */
        @NameInMap("AreaName")
        public String areaName;

        public static DescribeDeliveryAddressResponseBodyAddressesArea build(java.util.Map<String, ?> map) throws Exception {
            DescribeDeliveryAddressResponseBodyAddressesArea self = new DescribeDeliveryAddressResponseBodyAddressesArea();
            return TeaModel.build(map, self);
        }

        public DescribeDeliveryAddressResponseBodyAddressesArea setAreaId(Long areaId) {
            this.areaId = areaId;
            return this;
        }
        public Long getAreaId() {
            return this.areaId;
        }

        public DescribeDeliveryAddressResponseBodyAddressesArea setAreaName(String areaName) {
            this.areaName = areaName;
            return this;
        }
        public String getAreaName() {
            return this.areaName;
        }

    }

    public static class DescribeDeliveryAddressResponseBodyAddressesCity extends TeaModel {
        /**
         * <p>The city ID.</p>
         * 
         * <strong>example:</strong>
         * <p>33****</p>
         */
        @NameInMap("CityId")
        public Long cityId;

        /**
         * <p>The city name.</p>
         * 
         * <strong>example:</strong>
         * <p>杭州市</p>
         */
        @NameInMap("CityName")
        public String cityName;

        public static DescribeDeliveryAddressResponseBodyAddressesCity build(java.util.Map<String, ?> map) throws Exception {
            DescribeDeliveryAddressResponseBodyAddressesCity self = new DescribeDeliveryAddressResponseBodyAddressesCity();
            return TeaModel.build(map, self);
        }

        public DescribeDeliveryAddressResponseBodyAddressesCity setCityId(Long cityId) {
            this.cityId = cityId;
            return this;
        }
        public Long getCityId() {
            return this.cityId;
        }

        public DescribeDeliveryAddressResponseBodyAddressesCity setCityName(String cityName) {
            this.cityName = cityName;
            return this;
        }
        public String getCityName() {
            return this.cityName;
        }

    }

    public static class DescribeDeliveryAddressResponseBodyAddressesProvince extends TeaModel {
        /**
         * <p>The province ID. For more information, see <a href="https://help.aliyun.com/document_detail/167926.html">China regions, countries and territories codes</a>.</p>
         * <p>For example, <strong>110000</strong> represents Beijing and <strong>120000</strong> represents Tianjin.</p>
         * 
         * <strong>example:</strong>
         * <p>330000</p>
         */
        @NameInMap("ProvinceId")
        public Long provinceId;

        /**
         * <p>The province name.</p>
         * 
         * <strong>example:</strong>
         * <p>浙江省</p>
         */
        @NameInMap("ProvinceName")
        public String provinceName;

        public static DescribeDeliveryAddressResponseBodyAddressesProvince build(java.util.Map<String, ?> map) throws Exception {
            DescribeDeliveryAddressResponseBodyAddressesProvince self = new DescribeDeliveryAddressResponseBodyAddressesProvince();
            return TeaModel.build(map, self);
        }

        public DescribeDeliveryAddressResponseBodyAddressesProvince setProvinceId(Long provinceId) {
            this.provinceId = provinceId;
            return this;
        }
        public Long getProvinceId() {
            return this.provinceId;
        }

        public DescribeDeliveryAddressResponseBodyAddressesProvince setProvinceName(String provinceName) {
            this.provinceName = provinceName;
            return this;
        }
        public String getProvinceName() {
            return this.provinceName;
        }

    }

    public static class DescribeDeliveryAddressResponseBodyAddressesTown extends TeaModel {
        /**
         * <p>The town ID.</p>
         * 
         * <strong>example:</strong>
         * <p>3001****</p>
         */
        @NameInMap("TownId")
        public Long townId;

        /**
         * <p>The town name.</p>
         * 
         * <strong>example:</strong>
         * <p>三墩镇</p>
         */
        @NameInMap("TownName")
        public String townName;

        public static DescribeDeliveryAddressResponseBodyAddressesTown build(java.util.Map<String, ?> map) throws Exception {
            DescribeDeliveryAddressResponseBodyAddressesTown self = new DescribeDeliveryAddressResponseBodyAddressesTown();
            return TeaModel.build(map, self);
        }

        public DescribeDeliveryAddressResponseBodyAddressesTown setTownId(Long townId) {
            this.townId = townId;
            return this;
        }
        public Long getTownId() {
            return this.townId;
        }

        public DescribeDeliveryAddressResponseBodyAddressesTown setTownName(String townName) {
            this.townName = townName;
            return this;
        }
        public String getTownName() {
            return this.townName;
        }

    }

    public static class DescribeDeliveryAddressResponseBodyAddresses extends TeaModel {
        /**
         * <p>The area.</p>
         */
        @NameInMap("Area")
        public DescribeDeliveryAddressResponseBodyAddressesArea area;

        /**
         * <p>The city.</p>
         */
        @NameInMap("City")
        public DescribeDeliveryAddressResponseBodyAddressesCity city;

        /**
         * <p>The contact name.</p>
         * 
         * <strong>example:</strong>
         * <p>Alice</p>
         */
        @NameInMap("Contacts")
        public String contacts;

        /**
         * <p>Indicates whether this is the default address.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("DefaultAddress")
        public Boolean defaultAddress;

        /**
         * <p>The detailed address, which should include the street name and house number.</p>
         * 
         * <strong>example:</strong>
         * <p>灯彩街1008号云园区2号楼测试中心</p>
         */
        @NameInMap("Detail")
        public String detail;

        /**
         * <p>The mobile number.</p>
         * 
         * <strong>example:</strong>
         * <p>1381111****</p>
         */
        @NameInMap("Mobile")
        public String mobile;

        /**
         * <p>The postal code.</p>
         * 
         * <strong>example:</strong>
         * <p>03****</p>
         */
        @NameInMap("PostalCode")
        public String postalCode;

        /**
         * <p>The province.</p>
         */
        @NameInMap("Province")
        public DescribeDeliveryAddressResponseBodyAddressesProvince province;

        /**
         * <p>The town.</p>
         */
        @NameInMap("Town")
        public DescribeDeliveryAddressResponseBodyAddressesTown town;

        public static DescribeDeliveryAddressResponseBodyAddresses build(java.util.Map<String, ?> map) throws Exception {
            DescribeDeliveryAddressResponseBodyAddresses self = new DescribeDeliveryAddressResponseBodyAddresses();
            return TeaModel.build(map, self);
        }

        public DescribeDeliveryAddressResponseBodyAddresses setArea(DescribeDeliveryAddressResponseBodyAddressesArea area) {
            this.area = area;
            return this;
        }
        public DescribeDeliveryAddressResponseBodyAddressesArea getArea() {
            return this.area;
        }

        public DescribeDeliveryAddressResponseBodyAddresses setCity(DescribeDeliveryAddressResponseBodyAddressesCity city) {
            this.city = city;
            return this;
        }
        public DescribeDeliveryAddressResponseBodyAddressesCity getCity() {
            return this.city;
        }

        public DescribeDeliveryAddressResponseBodyAddresses setContacts(String contacts) {
            this.contacts = contacts;
            return this;
        }
        public String getContacts() {
            return this.contacts;
        }

        public DescribeDeliveryAddressResponseBodyAddresses setDefaultAddress(Boolean defaultAddress) {
            this.defaultAddress = defaultAddress;
            return this;
        }
        public Boolean getDefaultAddress() {
            return this.defaultAddress;
        }

        public DescribeDeliveryAddressResponseBodyAddresses setDetail(String detail) {
            this.detail = detail;
            return this;
        }
        public String getDetail() {
            return this.detail;
        }

        public DescribeDeliveryAddressResponseBodyAddresses setMobile(String mobile) {
            this.mobile = mobile;
            return this;
        }
        public String getMobile() {
            return this.mobile;
        }

        public DescribeDeliveryAddressResponseBodyAddresses setPostalCode(String postalCode) {
            this.postalCode = postalCode;
            return this;
        }
        public String getPostalCode() {
            return this.postalCode;
        }

        public DescribeDeliveryAddressResponseBodyAddresses setProvince(DescribeDeliveryAddressResponseBodyAddressesProvince province) {
            this.province = province;
            return this;
        }
        public DescribeDeliveryAddressResponseBodyAddressesProvince getProvince() {
            return this.province;
        }

        public DescribeDeliveryAddressResponseBodyAddresses setTown(DescribeDeliveryAddressResponseBodyAddressesTown town) {
            this.town = town;
            return this;
        }
        public DescribeDeliveryAddressResponseBodyAddressesTown getTown() {
            return this.town;
        }

    }

}
