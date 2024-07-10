// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class ListWebApplicationInstancesBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public ListWebInstancesOutput data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListWebApplicationInstancesBody build(java.util.Map<String, ?> map) throws Exception {
        ListWebApplicationInstancesBody self = new ListWebApplicationInstancesBody();
        return TeaModel.build(map, self);
    }

    public ListWebApplicationInstancesBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListWebApplicationInstancesBody setData(ListWebInstancesOutput data) {
        this.data = data;
        return this;
    }
    public ListWebInstancesOutput getData() {
        return this.data;
    }

    public ListWebApplicationInstancesBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListWebApplicationInstancesBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListWebApplicationInstancesBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
