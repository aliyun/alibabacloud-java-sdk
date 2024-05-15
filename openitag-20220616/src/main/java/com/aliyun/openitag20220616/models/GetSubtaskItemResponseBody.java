// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openitag20220616.models;

import com.aliyun.tea.*;

public class GetSubtaskItemResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Details")
    public String details;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("Item")
    public SubtaskItemDetail item;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetSubtaskItemResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSubtaskItemResponseBody self = new GetSubtaskItemResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSubtaskItemResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetSubtaskItemResponseBody setDetails(String details) {
        this.details = details;
        return this;
    }
    public String getDetails() {
        return this.details;
    }

    public GetSubtaskItemResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetSubtaskItemResponseBody setItem(SubtaskItemDetail item) {
        this.item = item;
        return this;
    }
    public SubtaskItemDetail getItem() {
        return this.item;
    }

    public GetSubtaskItemResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetSubtaskItemResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSubtaskItemResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
