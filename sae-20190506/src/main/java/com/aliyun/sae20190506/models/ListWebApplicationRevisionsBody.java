// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class ListWebApplicationRevisionsBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public ListWebApplicationRevisionsOutput data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListWebApplicationRevisionsBody build(java.util.Map<String, ?> map) throws Exception {
        ListWebApplicationRevisionsBody self = new ListWebApplicationRevisionsBody();
        return TeaModel.build(map, self);
    }

    public ListWebApplicationRevisionsBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListWebApplicationRevisionsBody setData(ListWebApplicationRevisionsOutput data) {
        this.data = data;
        return this;
    }
    public ListWebApplicationRevisionsOutput getData() {
        return this.data;
    }

    public ListWebApplicationRevisionsBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListWebApplicationRevisionsBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListWebApplicationRevisionsBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
