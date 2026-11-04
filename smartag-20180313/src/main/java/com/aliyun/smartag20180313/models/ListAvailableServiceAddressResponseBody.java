// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ListAvailableServiceAddressResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<ListAvailableServiceAddressResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static ListAvailableServiceAddressResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAvailableServiceAddressResponseBody self = new ListAvailableServiceAddressResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAvailableServiceAddressResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListAvailableServiceAddressResponseBody setData(java.util.List<ListAvailableServiceAddressResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListAvailableServiceAddressResponseBodyData> getData() {
        return this.data;
    }

    public ListAvailableServiceAddressResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListAvailableServiceAddressResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListAvailableServiceAddressResponseBodyData extends TeaModel {
        @NameInMap("Address")
        public String address;

        @NameInMap("AddressType")
        public String addressType;

        public static ListAvailableServiceAddressResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListAvailableServiceAddressResponseBodyData self = new ListAvailableServiceAddressResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListAvailableServiceAddressResponseBodyData setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public ListAvailableServiceAddressResponseBodyData setAddressType(String addressType) {
            this.addressType = addressType;
            return this;
        }
        public String getAddressType() {
            return this.addressType;
        }

    }

}
