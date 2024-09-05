// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.support_plan20210706.models;

import com.aliyun.tea.*;

public class CreateTaskOrderByEventReportResponseBody extends TeaModel {
    /**
     * <p>code</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>{  &quot;eid&quot;: &quot;E211129DT18M06&quot;,     &quot;status&quot;: &quot;dealingNode&quot;   }</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>msg</p>
     * 
     * <strong>example:</strong>
     * <p>请求成功</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>requestId</p>
     * 
     * <strong>example:</strong>
     * <p>02A300AC-367E-1716-A37B-F2FB46082610</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>success</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CreateTaskOrderByEventReportResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateTaskOrderByEventReportResponseBody self = new CreateTaskOrderByEventReportResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateTaskOrderByEventReportResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateTaskOrderByEventReportResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public CreateTaskOrderByEventReportResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateTaskOrderByEventReportResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateTaskOrderByEventReportResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
