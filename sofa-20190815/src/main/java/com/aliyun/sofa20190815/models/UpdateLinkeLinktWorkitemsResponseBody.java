// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeLinktWorkitemsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ErrorCode")
    public Long errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("ResponseStatusCode")
    public Long responseStatusCode;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Data")
    public UpdateLinkeLinktWorkitemsResponseBodyData data;

    public static UpdateLinkeLinktWorkitemsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeLinktWorkitemsResponseBody self = new UpdateLinkeLinktWorkitemsResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeLinktWorkitemsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateLinkeLinktWorkitemsResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public UpdateLinkeLinktWorkitemsResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public UpdateLinkeLinktWorkitemsResponseBody setErrorCode(Long errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Long getErrorCode() {
        return this.errorCode;
    }

    public UpdateLinkeLinktWorkitemsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public UpdateLinkeLinktWorkitemsResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public UpdateLinkeLinktWorkitemsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public UpdateLinkeLinktWorkitemsResponseBody setData(UpdateLinkeLinktWorkitemsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdateLinkeLinktWorkitemsResponseBodyData getData() {
        return this.data;
    }

    public static class UpdateLinkeLinktWorkitemsResponseBodyData extends TeaModel {
        @NameInMap("AllSuccess")
        public Boolean allSuccess;

        @NameInMap("ModifyFailedItems")
        public java.util.List<String> modifyFailedItems;

        public static UpdateLinkeLinktWorkitemsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateLinkeLinktWorkitemsResponseBodyData self = new UpdateLinkeLinktWorkitemsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateLinkeLinktWorkitemsResponseBodyData setAllSuccess(Boolean allSuccess) {
            this.allSuccess = allSuccess;
            return this;
        }
        public Boolean getAllSuccess() {
            return this.allSuccess;
        }

        public UpdateLinkeLinktWorkitemsResponseBodyData setModifyFailedItems(java.util.List<String> modifyFailedItems) {
            this.modifyFailedItems = modifyFailedItems;
            return this;
        }
        public java.util.List<String> getModifyFailedItems() {
            return this.modifyFailedItems;
        }

    }

}
