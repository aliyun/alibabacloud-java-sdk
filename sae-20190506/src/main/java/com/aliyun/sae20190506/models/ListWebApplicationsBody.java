// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class ListWebApplicationsBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public ListWebApplicationsOutput data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListWebApplicationsBody build(java.util.Map<String, ?> map) throws Exception {
        ListWebApplicationsBody self = new ListWebApplicationsBody();
        return TeaModel.build(map, self);
    }

    public ListWebApplicationsBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListWebApplicationsBody setData(ListWebApplicationsOutput data) {
        this.data = data;
        return this;
    }
    public ListWebApplicationsOutput getData() {
        return this.data;
    }

    public ListWebApplicationsBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListWebApplicationsBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListWebApplicationsBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
