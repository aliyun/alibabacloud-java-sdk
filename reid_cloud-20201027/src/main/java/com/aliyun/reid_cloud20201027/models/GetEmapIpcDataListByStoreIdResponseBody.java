// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.reid_cloud20201027.models;

import com.aliyun.tea.*;

public class GetEmapIpcDataListByStoreIdResponseBody extends TeaModel {
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

    @NameInMap("EmapIpcDataList")
    public java.util.List<GetEmapIpcDataListByStoreIdResponseBodyEmapIpcDataList> emapIpcDataList;

    public static GetEmapIpcDataListByStoreIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetEmapIpcDataListByStoreIdResponseBody self = new GetEmapIpcDataListByStoreIdResponseBody();
        return TeaModel.build(map, self);
    }

    public GetEmapIpcDataListByStoreIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetEmapIpcDataListByStoreIdResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetEmapIpcDataListByStoreIdResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public GetEmapIpcDataListByStoreIdResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetEmapIpcDataListByStoreIdResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public GetEmapIpcDataListByStoreIdResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetEmapIpcDataListByStoreIdResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetEmapIpcDataListByStoreIdResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetEmapIpcDataListByStoreIdResponseBody setEmapIpcDataList(java.util.List<GetEmapIpcDataListByStoreIdResponseBodyEmapIpcDataList> emapIpcDataList) {
        this.emapIpcDataList = emapIpcDataList;
        return this;
    }
    public java.util.List<GetEmapIpcDataListByStoreIdResponseBodyEmapIpcDataList> getEmapIpcDataList() {
        return this.emapIpcDataList;
    }

    public static class GetEmapIpcDataListByStoreIdResponseBodyEmapIpcDataList extends TeaModel {
        @NameInMap("EmapIpcId")
        public String emapIpcId;

        @NameInMap("EmapIpcUid")
        public Long emapIpcUid;

        @NameInMap("EmapUid")
        public Long emapUid;

        @NameInMap("IpcId")
        public Long ipcId;

        @NameInMap("StoreId")
        public Long storeId;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("H")
        public String h;

        @NameInMap("ImgWidth")
        public Integer imgWidth;

        @NameInMap("ImgHeight")
        public Integer imgHeight;

        @NameInMap("Types")
        public java.util.List<String> types;

        @NameInMap("Name")
        public String name;

        @NameInMap("Floor")
        public String floor;

        @NameInMap("CaptureType")
        public String captureType;

        @NameInMap("Association")
        public java.util.List<Long> association;

        public static GetEmapIpcDataListByStoreIdResponseBodyEmapIpcDataList build(java.util.Map<String, ?> map) throws Exception {
            GetEmapIpcDataListByStoreIdResponseBodyEmapIpcDataList self = new GetEmapIpcDataListByStoreIdResponseBodyEmapIpcDataList();
            return TeaModel.build(map, self);
        }

        public GetEmapIpcDataListByStoreIdResponseBodyEmapIpcDataList setEmapIpcId(String emapIpcId) {
            this.emapIpcId = emapIpcId;
            return this;
        }
        public String getEmapIpcId() {
            return this.emapIpcId;
        }

        public GetEmapIpcDataListByStoreIdResponseBodyEmapIpcDataList setEmapIpcUid(Long emapIpcUid) {
            this.emapIpcUid = emapIpcUid;
            return this;
        }
        public Long getEmapIpcUid() {
            return this.emapIpcUid;
        }

        public GetEmapIpcDataListByStoreIdResponseBodyEmapIpcDataList setEmapUid(Long emapUid) {
            this.emapUid = emapUid;
            return this;
        }
        public Long getEmapUid() {
            return this.emapUid;
        }

        public GetEmapIpcDataListByStoreIdResponseBodyEmapIpcDataList setIpcId(Long ipcId) {
            this.ipcId = ipcId;
            return this;
        }
        public Long getIpcId() {
            return this.ipcId;
        }

        public GetEmapIpcDataListByStoreIdResponseBodyEmapIpcDataList setStoreId(Long storeId) {
            this.storeId = storeId;
            return this;
        }
        public Long getStoreId() {
            return this.storeId;
        }

        public GetEmapIpcDataListByStoreIdResponseBodyEmapIpcDataList setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public GetEmapIpcDataListByStoreIdResponseBodyEmapIpcDataList setH(String h) {
            this.h = h;
            return this;
        }
        public String getH() {
            return this.h;
        }

        public GetEmapIpcDataListByStoreIdResponseBodyEmapIpcDataList setImgWidth(Integer imgWidth) {
            this.imgWidth = imgWidth;
            return this;
        }
        public Integer getImgWidth() {
            return this.imgWidth;
        }

        public GetEmapIpcDataListByStoreIdResponseBodyEmapIpcDataList setImgHeight(Integer imgHeight) {
            this.imgHeight = imgHeight;
            return this;
        }
        public Integer getImgHeight() {
            return this.imgHeight;
        }

        public GetEmapIpcDataListByStoreIdResponseBodyEmapIpcDataList setTypes(java.util.List<String> types) {
            this.types = types;
            return this;
        }
        public java.util.List<String> getTypes() {
            return this.types;
        }

        public GetEmapIpcDataListByStoreIdResponseBodyEmapIpcDataList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetEmapIpcDataListByStoreIdResponseBodyEmapIpcDataList setFloor(String floor) {
            this.floor = floor;
            return this;
        }
        public String getFloor() {
            return this.floor;
        }

        public GetEmapIpcDataListByStoreIdResponseBodyEmapIpcDataList setCaptureType(String captureType) {
            this.captureType = captureType;
            return this;
        }
        public String getCaptureType() {
            return this.captureType;
        }

        public GetEmapIpcDataListByStoreIdResponseBodyEmapIpcDataList setAssociation(java.util.List<Long> association) {
            this.association = association;
            return this;
        }
        public java.util.List<Long> getAssociation() {
            return this.association;
        }

    }

}
