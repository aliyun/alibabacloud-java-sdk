// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.reid_cloud20201030.models;

import com.aliyun.tea.*;

public class GetFootwearEventResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Message")
    public String message;

    @NameInMap("FootwearEventList")
    public GetFootwearEventResponseBodyFootwearEventList footwearEventList;

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

    public static GetFootwearEventResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetFootwearEventResponseBody self = new GetFootwearEventResponseBody();
        return TeaModel.build(map, self);
    }

    public GetFootwearEventResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetFootwearEventResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetFootwearEventResponseBody setFootwearEventList(GetFootwearEventResponseBodyFootwearEventList footwearEventList) {
        this.footwearEventList = footwearEventList;
        return this;
    }
    public GetFootwearEventResponseBodyFootwearEventList getFootwearEventList() {
        return this.footwearEventList;
    }

    public GetFootwearEventResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public GetFootwearEventResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetFootwearEventResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public GetFootwearEventResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetFootwearEventResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetFootwearEventResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetFootwearEventResponseBodyFootwearEventListFootwearEvent extends TeaModel {
        @NameInMap("StoreId")
        public Long storeId;

        @NameInMap("TakeEventCount")
        public Integer takeEventCount;

        @NameInMap("SkuId")
        public String skuId;

        @NameInMap("Date")
        public String date;

        @NameInMap("PositionNumber")
        public String positionNumber;

        @NameInMap("TryOnEventCount")
        public Integer tryOnEventCount;

        public static GetFootwearEventResponseBodyFootwearEventListFootwearEvent build(java.util.Map<String, ?> map) throws Exception {
            GetFootwearEventResponseBodyFootwearEventListFootwearEvent self = new GetFootwearEventResponseBodyFootwearEventListFootwearEvent();
            return TeaModel.build(map, self);
        }

        public GetFootwearEventResponseBodyFootwearEventListFootwearEvent setStoreId(Long storeId) {
            this.storeId = storeId;
            return this;
        }
        public Long getStoreId() {
            return this.storeId;
        }

        public GetFootwearEventResponseBodyFootwearEventListFootwearEvent setTakeEventCount(Integer takeEventCount) {
            this.takeEventCount = takeEventCount;
            return this;
        }
        public Integer getTakeEventCount() {
            return this.takeEventCount;
        }

        public GetFootwearEventResponseBodyFootwearEventListFootwearEvent setSkuId(String skuId) {
            this.skuId = skuId;
            return this;
        }
        public String getSkuId() {
            return this.skuId;
        }

        public GetFootwearEventResponseBodyFootwearEventListFootwearEvent setDate(String date) {
            this.date = date;
            return this;
        }
        public String getDate() {
            return this.date;
        }

        public GetFootwearEventResponseBodyFootwearEventListFootwearEvent setPositionNumber(String positionNumber) {
            this.positionNumber = positionNumber;
            return this;
        }
        public String getPositionNumber() {
            return this.positionNumber;
        }

        public GetFootwearEventResponseBodyFootwearEventListFootwearEvent setTryOnEventCount(Integer tryOnEventCount) {
            this.tryOnEventCount = tryOnEventCount;
            return this;
        }
        public Integer getTryOnEventCount() {
            return this.tryOnEventCount;
        }

    }

    public static class GetFootwearEventResponseBodyFootwearEventList extends TeaModel {
        @NameInMap("FootwearEvent")
        public java.util.List<GetFootwearEventResponseBodyFootwearEventListFootwearEvent> footwearEvent;

        public static GetFootwearEventResponseBodyFootwearEventList build(java.util.Map<String, ?> map) throws Exception {
            GetFootwearEventResponseBodyFootwearEventList self = new GetFootwearEventResponseBodyFootwearEventList();
            return TeaModel.build(map, self);
        }

        public GetFootwearEventResponseBodyFootwearEventList setFootwearEvent(java.util.List<GetFootwearEventResponseBodyFootwearEventListFootwearEvent> footwearEvent) {
            this.footwearEvent = footwearEvent;
            return this;
        }
        public java.util.List<GetFootwearEventResponseBodyFootwearEventListFootwearEvent> getFootwearEvent() {
            return this.footwearEvent;
        }

    }

}
