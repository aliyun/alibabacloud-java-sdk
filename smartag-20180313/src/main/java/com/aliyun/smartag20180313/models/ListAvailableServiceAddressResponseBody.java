// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ListAvailableServiceAddressResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<ListAvailableServiceAddressResponseBodyData> data;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>324223F3-93D3-4CE4-B26F-66C0C3809922</p>
     */
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
        /**
         * <p>The service address.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.1.1</p>
         */
        @NameInMap("Address")
        public String address;

        /**
         * <p>The type of service address.</p>
         * 
         * <strong>example:</strong>
         * <p>ProbeTask</p>
         */
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
