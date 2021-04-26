// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.reid_cloud20201030.models;

import com.aliyun.tea.*;

public class ListStoreResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("Stores")
    public ListStoreResponseBodyStores stores;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Success")
    public Boolean success;

    public static ListStoreResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListStoreResponseBody self = new ListStoreResponseBody();
        return TeaModel.build(map, self);
    }

    public ListStoreResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListStoreResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListStoreResponseBody setStores(ListStoreResponseBodyStores stores) {
        this.stores = stores;
        return this;
    }
    public ListStoreResponseBodyStores getStores() {
        return this.stores;
    }

    public ListStoreResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListStoreResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListStoreResponseBodyStoresOpenStore extends TeaModel {
        @NameInMap("Status")
        public Integer status;

        @NameInMap("StoreId")
        public Long storeId;

        @NameInMap("OpeningEndTime")
        public String openingEndTime;

        @NameInMap("StoreType")
        public String storeType;

        @NameInMap("Address")
        public String address;

        @NameInMap("Sqm")
        public Float sqm;

        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("GmtModified")
        public Long gmtModified;

        @NameInMap("Name")
        public String name;

        @NameInMap("OpeningStartTime")
        public String openingStartTime;

        public static ListStoreResponseBodyStoresOpenStore build(java.util.Map<String, ?> map) throws Exception {
            ListStoreResponseBodyStoresOpenStore self = new ListStoreResponseBodyStoresOpenStore();
            return TeaModel.build(map, self);
        }

        public ListStoreResponseBodyStoresOpenStore setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListStoreResponseBodyStoresOpenStore setStoreId(Long storeId) {
            this.storeId = storeId;
            return this;
        }
        public Long getStoreId() {
            return this.storeId;
        }

        public ListStoreResponseBodyStoresOpenStore setOpeningEndTime(String openingEndTime) {
            this.openingEndTime = openingEndTime;
            return this;
        }
        public String getOpeningEndTime() {
            return this.openingEndTime;
        }

        public ListStoreResponseBodyStoresOpenStore setStoreType(String storeType) {
            this.storeType = storeType;
            return this;
        }
        public String getStoreType() {
            return this.storeType;
        }

        public ListStoreResponseBodyStoresOpenStore setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public ListStoreResponseBodyStoresOpenStore setSqm(Float sqm) {
            this.sqm = sqm;
            return this;
        }
        public Float getSqm() {
            return this.sqm;
        }

        public ListStoreResponseBodyStoresOpenStore setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public ListStoreResponseBodyStoresOpenStore setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public ListStoreResponseBodyStoresOpenStore setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListStoreResponseBodyStoresOpenStore setOpeningStartTime(String openingStartTime) {
            this.openingStartTime = openingStartTime;
            return this;
        }
        public String getOpeningStartTime() {
            return this.openingStartTime;
        }

    }

    public static class ListStoreResponseBodyStores extends TeaModel {
        @NameInMap("OpenStore")
        public java.util.List<ListStoreResponseBodyStoresOpenStore> openStore;

        public static ListStoreResponseBodyStores build(java.util.Map<String, ?> map) throws Exception {
            ListStoreResponseBodyStores self = new ListStoreResponseBodyStores();
            return TeaModel.build(map, self);
        }

        public ListStoreResponseBodyStores setOpenStore(java.util.List<ListStoreResponseBodyStoresOpenStore> openStore) {
            this.openStore = openStore;
            return this;
        }
        public java.util.List<ListStoreResponseBodyStoresOpenStore> getOpenStore() {
            return this.openStore;
        }

    }

}
