// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class ListWebCustomDomainBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public ListWebCustomDomainOutput data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListWebCustomDomainBody build(java.util.Map<String, ?> map) throws Exception {
        ListWebCustomDomainBody self = new ListWebCustomDomainBody();
        return TeaModel.build(map, self);
    }

    public ListWebCustomDomainBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListWebCustomDomainBody setData(ListWebCustomDomainOutput data) {
        this.data = data;
        return this;
    }
    public ListWebCustomDomainOutput getData() {
        return this.data;
    }

    public ListWebCustomDomainBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListWebCustomDomainBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListWebCustomDomainBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
