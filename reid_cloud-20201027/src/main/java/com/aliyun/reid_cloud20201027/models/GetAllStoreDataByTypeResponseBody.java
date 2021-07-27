// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.reid_cloud20201027.models;

import com.aliyun.tea.*;

public class GetAllStoreDataByTypeResponseBody extends TeaModel {
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

    @NameInMap("StoreDataList")
    public java.util.List<GetAllStoreDataByTypeResponseBodyStoreDataList> storeDataList;

    public static GetAllStoreDataByTypeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAllStoreDataByTypeResponseBody self = new GetAllStoreDataByTypeResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAllStoreDataByTypeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAllStoreDataByTypeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetAllStoreDataByTypeResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public GetAllStoreDataByTypeResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetAllStoreDataByTypeResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public GetAllStoreDataByTypeResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetAllStoreDataByTypeResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetAllStoreDataByTypeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetAllStoreDataByTypeResponseBody setStoreDataList(java.util.List<GetAllStoreDataByTypeResponseBodyStoreDataList> storeDataList) {
        this.storeDataList = storeDataList;
        return this;
    }
    public java.util.List<GetAllStoreDataByTypeResponseBodyStoreDataList> getStoreDataList() {
        return this.storeDataList;
    }

    public static class GetAllStoreDataByTypeResponseBodyStoreDataList extends TeaModel {
        @NameInMap("StoreId")
        public Long storeId;

        @NameInMap("Sqm")
        public Float sqm;

        @NameInMap("RootLocationUid")
        public Long rootLocationUid;

        @NameInMap("RootLocationId")
        public Long rootLocationId;

        @NameInMap("StoreName")
        public String storeName;

        @NameInMap("BrandId")
        public Long brandId;

        @NameInMap("BrandName")
        public String brandName;

        @NameInMap("MasterId")
        public Long masterId;

        @NameInMap("SourceType")
        public String sourceType;

        public static GetAllStoreDataByTypeResponseBodyStoreDataList build(java.util.Map<String, ?> map) throws Exception {
            GetAllStoreDataByTypeResponseBodyStoreDataList self = new GetAllStoreDataByTypeResponseBodyStoreDataList();
            return TeaModel.build(map, self);
        }

        public GetAllStoreDataByTypeResponseBodyStoreDataList setStoreId(Long storeId) {
            this.storeId = storeId;
            return this;
        }
        public Long getStoreId() {
            return this.storeId;
        }

        public GetAllStoreDataByTypeResponseBodyStoreDataList setSqm(Float sqm) {
            this.sqm = sqm;
            return this;
        }
        public Float getSqm() {
            return this.sqm;
        }

        public GetAllStoreDataByTypeResponseBodyStoreDataList setRootLocationUid(Long rootLocationUid) {
            this.rootLocationUid = rootLocationUid;
            return this;
        }
        public Long getRootLocationUid() {
            return this.rootLocationUid;
        }

        public GetAllStoreDataByTypeResponseBodyStoreDataList setRootLocationId(Long rootLocationId) {
            this.rootLocationId = rootLocationId;
            return this;
        }
        public Long getRootLocationId() {
            return this.rootLocationId;
        }

        public GetAllStoreDataByTypeResponseBodyStoreDataList setStoreName(String storeName) {
            this.storeName = storeName;
            return this;
        }
        public String getStoreName() {
            return this.storeName;
        }

        public GetAllStoreDataByTypeResponseBodyStoreDataList setBrandId(Long brandId) {
            this.brandId = brandId;
            return this;
        }
        public Long getBrandId() {
            return this.brandId;
        }

        public GetAllStoreDataByTypeResponseBodyStoreDataList setBrandName(String brandName) {
            this.brandName = brandName;
            return this;
        }
        public String getBrandName() {
            return this.brandName;
        }

        public GetAllStoreDataByTypeResponseBodyStoreDataList setMasterId(Long masterId) {
            this.masterId = masterId;
            return this;
        }
        public Long getMasterId() {
            return this.masterId;
        }

        public GetAllStoreDataByTypeResponseBodyStoreDataList setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

    }

}
