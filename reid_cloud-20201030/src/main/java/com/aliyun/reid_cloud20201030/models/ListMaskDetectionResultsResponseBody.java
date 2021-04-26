// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.reid_cloud20201030.models;

import com.aliyun.tea.*;

public class ListMaskDetectionResultsResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Long totalCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Message")
    public String message;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("MaskDetectionResults")
    public java.util.List<ListMaskDetectionResultsResponseBodyMaskDetectionResults> maskDetectionResults;

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

    public static ListMaskDetectionResultsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMaskDetectionResultsResponseBody self = new ListMaskDetectionResultsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMaskDetectionResultsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public ListMaskDetectionResultsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListMaskDetectionResultsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListMaskDetectionResultsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListMaskDetectionResultsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListMaskDetectionResultsResponseBody setMaskDetectionResults(java.util.List<ListMaskDetectionResultsResponseBodyMaskDetectionResults> maskDetectionResults) {
        this.maskDetectionResults = maskDetectionResults;
        return this;
    }
    public java.util.List<ListMaskDetectionResultsResponseBodyMaskDetectionResults> getMaskDetectionResults() {
        return this.maskDetectionResults;
    }

    public ListMaskDetectionResultsResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public ListMaskDetectionResultsResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListMaskDetectionResultsResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public ListMaskDetectionResultsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListMaskDetectionResultsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListMaskDetectionResultsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListMaskDetectionResultsResponseBodyMaskDetectionResults extends TeaModel {
        @NameInMap("PkId")
        public String pkId;

        @NameInMap("MaskResult")
        public String maskResult;

        @NameInMap("IpcId")
        public String ipcId;

        @NameInMap("LocationId")
        public Long locationId;

        @NameInMap("Score")
        public String score;

        @NameInMap("ImageKey")
        public String imageKey;

        @NameInMap("Id")
        public Long id;

        public static ListMaskDetectionResultsResponseBodyMaskDetectionResults build(java.util.Map<String, ?> map) throws Exception {
            ListMaskDetectionResultsResponseBodyMaskDetectionResults self = new ListMaskDetectionResultsResponseBodyMaskDetectionResults();
            return TeaModel.build(map, self);
        }

        public ListMaskDetectionResultsResponseBodyMaskDetectionResults setPkId(String pkId) {
            this.pkId = pkId;
            return this;
        }
        public String getPkId() {
            return this.pkId;
        }

        public ListMaskDetectionResultsResponseBodyMaskDetectionResults setMaskResult(String maskResult) {
            this.maskResult = maskResult;
            return this;
        }
        public String getMaskResult() {
            return this.maskResult;
        }

        public ListMaskDetectionResultsResponseBodyMaskDetectionResults setIpcId(String ipcId) {
            this.ipcId = ipcId;
            return this;
        }
        public String getIpcId() {
            return this.ipcId;
        }

        public ListMaskDetectionResultsResponseBodyMaskDetectionResults setLocationId(Long locationId) {
            this.locationId = locationId;
            return this;
        }
        public Long getLocationId() {
            return this.locationId;
        }

        public ListMaskDetectionResultsResponseBodyMaskDetectionResults setScore(String score) {
            this.score = score;
            return this;
        }
        public String getScore() {
            return this.score;
        }

        public ListMaskDetectionResultsResponseBodyMaskDetectionResults setImageKey(String imageKey) {
            this.imageKey = imageKey;
            return this;
        }
        public String getImageKey() {
            return this.imageKey;
        }

        public ListMaskDetectionResultsResponseBodyMaskDetectionResults setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

}
