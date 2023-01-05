// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class ListAllTenantBindNumberBindingResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ListAllTenantBindNumberBindingResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListAllTenantBindNumberBindingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAllTenantBindNumberBindingResponseBody self = new ListAllTenantBindNumberBindingResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAllTenantBindNumberBindingResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListAllTenantBindNumberBindingResponseBody setData(ListAllTenantBindNumberBindingResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListAllTenantBindNumberBindingResponseBodyData getData() {
        return this.data;
    }

    public ListAllTenantBindNumberBindingResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListAllTenantBindNumberBindingResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListAllTenantBindNumberBindingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAllTenantBindNumberBindingResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListAllTenantBindNumberBindingResponseBodyDataList extends TeaModel {
        @NameInMap("BillingType")
        public String billingType;

        @NameInMap("BindingId")
        public String bindingId;

        @NameInMap("InstanceNameList")
        public java.util.List<String> instanceNameList;

        @NameInMap("Number")
        public String number;

        @NameInMap("SerializedParams")
        public String serializedParams;

        @NameInMap("TrunkName")
        public String trunkName;

        public static ListAllTenantBindNumberBindingResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            ListAllTenantBindNumberBindingResponseBodyDataList self = new ListAllTenantBindNumberBindingResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public ListAllTenantBindNumberBindingResponseBodyDataList setBillingType(String billingType) {
            this.billingType = billingType;
            return this;
        }
        public String getBillingType() {
            return this.billingType;
        }

        public ListAllTenantBindNumberBindingResponseBodyDataList setBindingId(String bindingId) {
            this.bindingId = bindingId;
            return this;
        }
        public String getBindingId() {
            return this.bindingId;
        }

        public ListAllTenantBindNumberBindingResponseBodyDataList setInstanceNameList(java.util.List<String> instanceNameList) {
            this.instanceNameList = instanceNameList;
            return this;
        }
        public java.util.List<String> getInstanceNameList() {
            return this.instanceNameList;
        }

        public ListAllTenantBindNumberBindingResponseBodyDataList setNumber(String number) {
            this.number = number;
            return this;
        }
        public String getNumber() {
            return this.number;
        }

        public ListAllTenantBindNumberBindingResponseBodyDataList setSerializedParams(String serializedParams) {
            this.serializedParams = serializedParams;
            return this;
        }
        public String getSerializedParams() {
            return this.serializedParams;
        }

        public ListAllTenantBindNumberBindingResponseBodyDataList setTrunkName(String trunkName) {
            this.trunkName = trunkName;
            return this;
        }
        public String getTrunkName() {
            return this.trunkName;
        }

    }

    public static class ListAllTenantBindNumberBindingResponseBodyData extends TeaModel {
        @NameInMap("List")
        public java.util.List<ListAllTenantBindNumberBindingResponseBodyDataList> list;

        public static ListAllTenantBindNumberBindingResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListAllTenantBindNumberBindingResponseBodyData self = new ListAllTenantBindNumberBindingResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListAllTenantBindNumberBindingResponseBodyData setList(java.util.List<ListAllTenantBindNumberBindingResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ListAllTenantBindNumberBindingResponseBodyDataList> getList() {
            return this.list;
        }

    }

}
