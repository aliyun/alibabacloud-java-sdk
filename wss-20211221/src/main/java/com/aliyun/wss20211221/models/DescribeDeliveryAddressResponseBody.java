// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wss20211221.models;

import com.aliyun.tea.*;

public class DescribeDeliveryAddressResponseBody extends TeaModel {
    @NameInMap("Addresses")
    public java.util.List<DescribeDeliveryAddressResponseBodyAddresses> addresses;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("AreaId")
        public Long areaId;

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
        @NameInMap("CityId")
        public Long cityId;

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
        @NameInMap("ProvinceId")
        public Long provinceId;

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
        @NameInMap("TownId")
        public Long townId;

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
        @NameInMap("Area")
        public DescribeDeliveryAddressResponseBodyAddressesArea area;

        @NameInMap("City")
        public DescribeDeliveryAddressResponseBodyAddressesCity city;

        @NameInMap("Contacts")
        public String contacts;

        @NameInMap("DefaultAddress")
        public Boolean defaultAddress;

        @NameInMap("Detail")
        public String detail;

        @NameInMap("Mobile")
        public String mobile;

        @NameInMap("PostalCode")
        public String postalCode;

        @NameInMap("Province")
        public DescribeDeliveryAddressResponseBodyAddressesProvince province;

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
