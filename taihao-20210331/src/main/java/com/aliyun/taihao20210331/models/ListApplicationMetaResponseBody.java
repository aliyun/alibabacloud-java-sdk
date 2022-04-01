// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ListApplicationMetaResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public java.util.List<ApplicationMetaDTO> data;

    @NameInMap("message")
    public String message;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

    public static ListApplicationMetaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListApplicationMetaResponseBody self = new ListApplicationMetaResponseBody();
        return TeaModel.build(map, self);
    }

    public ListApplicationMetaResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListApplicationMetaResponseBody setData(java.util.List<ApplicationMetaDTO> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ApplicationMetaDTO> getData() {
        return this.data;
    }

    public ListApplicationMetaResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListApplicationMetaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListApplicationMetaResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
