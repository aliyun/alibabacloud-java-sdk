// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.reid_cloud20201027.models;

import com.aliyun.tea.*;

public class ListIpcStoreInfoResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Message")
    public String message;

    @NameInMap("DynamicCode")
    public String dynamicCode;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("IpcInfoList")
    public java.util.List<ListIpcStoreInfoResponseBodyIpcInfoList> ipcInfoList;

    public static ListIpcStoreInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListIpcStoreInfoResponseBody self = new ListIpcStoreInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public ListIpcStoreInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListIpcStoreInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListIpcStoreInfoResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public ListIpcStoreInfoResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListIpcStoreInfoResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public ListIpcStoreInfoResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListIpcStoreInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListIpcStoreInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListIpcStoreInfoResponseBody setIpcInfoList(java.util.List<ListIpcStoreInfoResponseBodyIpcInfoList> ipcInfoList) {
        this.ipcInfoList = ipcInfoList;
        return this;
    }
    public java.util.List<ListIpcStoreInfoResponseBodyIpcInfoList> getIpcInfoList() {
        return this.ipcInfoList;
    }

    public static class ListIpcStoreInfoResponseBodyIpcInfoList extends TeaModel {
        @NameInMap("Id")
        public Long id;

        @NameInMap("Ip")
        public String ip;

        @NameInMap("StoreId")
        public Long storeId;

        @NameInMap("StoreName")
        public String storeName;

        public static ListIpcStoreInfoResponseBodyIpcInfoList build(java.util.Map<String, ?> map) throws Exception {
            ListIpcStoreInfoResponseBodyIpcInfoList self = new ListIpcStoreInfoResponseBodyIpcInfoList();
            return TeaModel.build(map, self);
        }

        public ListIpcStoreInfoResponseBodyIpcInfoList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListIpcStoreInfoResponseBodyIpcInfoList setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public ListIpcStoreInfoResponseBodyIpcInfoList setStoreId(Long storeId) {
            this.storeId = storeId;
            return this;
        }
        public Long getStoreId() {
            return this.storeId;
        }

        public ListIpcStoreInfoResponseBodyIpcInfoList setStoreName(String storeName) {
            this.storeName = storeName;
            return this;
        }
        public String getStoreName() {
            return this.storeName;
        }

    }

}
