// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ListMainVersionsResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public java.util.List<ListMainVersionDTO> data;

    @NameInMap("message")
    public String message;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

    public static ListMainVersionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMainVersionsResponseBody self = new ListMainVersionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMainVersionsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListMainVersionsResponseBody setData(java.util.List<ListMainVersionDTO> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListMainVersionDTO> getData() {
        return this.data;
    }

    public ListMainVersionsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListMainVersionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListMainVersionsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
