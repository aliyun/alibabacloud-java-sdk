// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qktest20210908.models;

import com.aliyun.tea.*;

public class HsfWithMultiParamRequest extends TeaModel {
    @NameInMap("address")
    public HsfWithMultiParamRequestAddress address;

    @NameInMap("area")
    public HsfWithMultiParamRequestArea area;

    @NameInMap("test2")
    public String test2;

    public static HsfWithMultiParamRequest build(java.util.Map<String, ?> map) throws Exception {
        HsfWithMultiParamRequest self = new HsfWithMultiParamRequest();
        return TeaModel.build(map, self);
    }

    public HsfWithMultiParamRequest setAddress(HsfWithMultiParamRequestAddress address) {
        this.address = address;
        return this;
    }
    public HsfWithMultiParamRequestAddress getAddress() {
        return this.address;
    }

    public HsfWithMultiParamRequest setArea(HsfWithMultiParamRequestArea area) {
        this.area = area;
        return this;
    }
    public HsfWithMultiParamRequestArea getArea() {
        return this.area;
    }

    public HsfWithMultiParamRequest setTest2(String test2) {
        this.test2 = test2;
        return this;
    }
    public String getTest2() {
        return this.test2;
    }

    public static class HsfWithMultiParamRequestAddress extends TeaModel {
        @NameInMap("code")
        public Long code;

        @NameInMap("name")
        public String name;

        @NameInMap("size")
        public String size;

        @NameInMap("white")
        public Boolean white;

        public static HsfWithMultiParamRequestAddress build(java.util.Map<String, ?> map) throws Exception {
            HsfWithMultiParamRequestAddress self = new HsfWithMultiParamRequestAddress();
            return TeaModel.build(map, self);
        }

        public HsfWithMultiParamRequestAddress setCode(Long code) {
            this.code = code;
            return this;
        }
        public Long getCode() {
            return this.code;
        }

        public HsfWithMultiParamRequestAddress setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public HsfWithMultiParamRequestAddress setSize(String size) {
            this.size = size;
            return this;
        }
        public String getSize() {
            return this.size;
        }

        public HsfWithMultiParamRequestAddress setWhite(Boolean white) {
            this.white = white;
            return this;
        }
        public Boolean getWhite() {
            return this.white;
        }

    }

    public static class HsfWithMultiParamRequestAreaAddress extends TeaModel {
        @NameInMap("code")
        public Long code;

        @NameInMap("name")
        public String name;

        @NameInMap("size")
        public String size;

        @NameInMap("white")
        public Boolean white;

        public static HsfWithMultiParamRequestAreaAddress build(java.util.Map<String, ?> map) throws Exception {
            HsfWithMultiParamRequestAreaAddress self = new HsfWithMultiParamRequestAreaAddress();
            return TeaModel.build(map, self);
        }

        public HsfWithMultiParamRequestAreaAddress setCode(Long code) {
            this.code = code;
            return this;
        }
        public Long getCode() {
            return this.code;
        }

        public HsfWithMultiParamRequestAreaAddress setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public HsfWithMultiParamRequestAreaAddress setSize(String size) {
            this.size = size;
            return this;
        }
        public String getSize() {
            return this.size;
        }

        public HsfWithMultiParamRequestAreaAddress setWhite(Boolean white) {
            this.white = white;
            return this;
        }
        public Boolean getWhite() {
            return this.white;
        }

    }

    public static class HsfWithMultiParamRequestAreaAddressList extends TeaModel {
        @NameInMap("code")
        public Long code;

        @NameInMap("name")
        public String name;

        @NameInMap("size")
        public String size;

        @NameInMap("white")
        public Boolean white;

        public static HsfWithMultiParamRequestAreaAddressList build(java.util.Map<String, ?> map) throws Exception {
            HsfWithMultiParamRequestAreaAddressList self = new HsfWithMultiParamRequestAreaAddressList();
            return TeaModel.build(map, self);
        }

        public HsfWithMultiParamRequestAreaAddressList setCode(Long code) {
            this.code = code;
            return this;
        }
        public Long getCode() {
            return this.code;
        }

        public HsfWithMultiParamRequestAreaAddressList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public HsfWithMultiParamRequestAreaAddressList setSize(String size) {
            this.size = size;
            return this;
        }
        public String getSize() {
            return this.size;
        }

        public HsfWithMultiParamRequestAreaAddressList setWhite(Boolean white) {
            this.white = white;
            return this;
        }
        public Boolean getWhite() {
            return this.white;
        }

    }

    public static class HsfWithMultiParamRequestAreaArrAddr extends TeaModel {
        @NameInMap("code")
        public Integer code;

        @NameInMap("name")
        public String name;

        @NameInMap("size")
        public String size;

        @NameInMap("white")
        public Boolean white;

        public static HsfWithMultiParamRequestAreaArrAddr build(java.util.Map<String, ?> map) throws Exception {
            HsfWithMultiParamRequestAreaArrAddr self = new HsfWithMultiParamRequestAreaArrAddr();
            return TeaModel.build(map, self);
        }

        public HsfWithMultiParamRequestAreaArrAddr setCode(Integer code) {
            this.code = code;
            return this;
        }
        public Integer getCode() {
            return this.code;
        }

        public HsfWithMultiParamRequestAreaArrAddr setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public HsfWithMultiParamRequestAreaArrAddr setSize(String size) {
            this.size = size;
            return this;
        }
        public String getSize() {
            return this.size;
        }

        public HsfWithMultiParamRequestAreaArrAddr setWhite(Boolean white) {
            this.white = white;
            return this;
        }
        public Boolean getWhite() {
            return this.white;
        }

    }

    public static class HsfWithMultiParamRequestArea extends TeaModel {
        @NameInMap("address")
        public HsfWithMultiParamRequestAreaAddress address;

        @NameInMap("addressList")
        public java.util.List<HsfWithMultiParamRequestAreaAddressList> addressList;

        @NameInMap("arrAddr")
        public java.util.List<HsfWithMultiParamRequestAreaArrAddr> arrAddr;

        @NameInMap("arrInt")
        public java.util.List<Integer> arrInt;

        @NameInMap("id")
        public Long id;

        @NameInMap("listStr")
        public java.util.List<String> listStr;

        @NameInMap("mapAddr")
        public java.util.Map<String, AreaMapAddrValue> mapAddr;

        @NameInMap("mapStr")
        public java.util.Map<String, String> mapStr;

        @NameInMap("requestId")
        public String requestId;

        public static HsfWithMultiParamRequestArea build(java.util.Map<String, ?> map) throws Exception {
            HsfWithMultiParamRequestArea self = new HsfWithMultiParamRequestArea();
            return TeaModel.build(map, self);
        }

        public HsfWithMultiParamRequestArea setAddress(HsfWithMultiParamRequestAreaAddress address) {
            this.address = address;
            return this;
        }
        public HsfWithMultiParamRequestAreaAddress getAddress() {
            return this.address;
        }

        public HsfWithMultiParamRequestArea setAddressList(java.util.List<HsfWithMultiParamRequestAreaAddressList> addressList) {
            this.addressList = addressList;
            return this;
        }
        public java.util.List<HsfWithMultiParamRequestAreaAddressList> getAddressList() {
            return this.addressList;
        }

        public HsfWithMultiParamRequestArea setArrAddr(java.util.List<HsfWithMultiParamRequestAreaArrAddr> arrAddr) {
            this.arrAddr = arrAddr;
            return this;
        }
        public java.util.List<HsfWithMultiParamRequestAreaArrAddr> getArrAddr() {
            return this.arrAddr;
        }

        public HsfWithMultiParamRequestArea setArrInt(java.util.List<Integer> arrInt) {
            this.arrInt = arrInt;
            return this;
        }
        public java.util.List<Integer> getArrInt() {
            return this.arrInt;
        }

        public HsfWithMultiParamRequestArea setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public HsfWithMultiParamRequestArea setListStr(java.util.List<String> listStr) {
            this.listStr = listStr;
            return this;
        }
        public java.util.List<String> getListStr() {
            return this.listStr;
        }

        public HsfWithMultiParamRequestArea setMapAddr(java.util.Map<String, AreaMapAddrValue> mapAddr) {
            this.mapAddr = mapAddr;
            return this;
        }
        public java.util.Map<String, AreaMapAddrValue> getMapAddr() {
            return this.mapAddr;
        }

        public HsfWithMultiParamRequestArea setMapStr(java.util.Map<String, String> mapStr) {
            this.mapStr = mapStr;
            return this;
        }
        public java.util.Map<String, String> getMapStr() {
            return this.mapStr;
        }

        public HsfWithMultiParamRequestArea setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

    }

}
