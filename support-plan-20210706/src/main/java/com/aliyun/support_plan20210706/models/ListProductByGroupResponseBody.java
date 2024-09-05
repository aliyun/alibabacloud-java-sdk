// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.support_plan20210706.models;

import com.aliyun.tea.*;

public class ListProductByGroupResponseBody extends TeaModel {
    /**
     * <p>code</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>data</p>
     * 
     * <strong>example:</strong>
     * <p>[     {       &quot;wfNodeId&quot;: &quot;dealingNode&quot;,//任务单状态       &quot;createEmpId&quot;: null,//创建人工号，可以忽略       &quot;createTime&quot;: 1637571435000,//任务单创建时间       &quot;orderId&quot;: &quot;E2111221H1UKCZ&quot;,//任务单号       &quot;isImportant&quot;: &quot;normal&quot;,//是否紧急       &quot;closeTime&quot;: null,//任务单关单时间       &quot;taskTitle&quot;: &quot;测试单16点44&quot;,//标题       &quot;productType&quot;: &quot;3270&quot;//问题分类     },     {       &quot;wfNodeId&quot;: &quot;dealingNode&quot;,       &quot;createEmpId&quot;: null,       &quot;createTime&quot;: 1637820497000,       &quot;orderId&quot;: &quot;E211125CG111EM&quot;,       &quot;isImportant&quot;: &quot;normal&quot;,       &quot;closeTime&quot;: null,       &quot;taskTitle&quot;: &quot;测试单14&quot;,       &quot;class&quot;: &quot;com.aliyun.dingtalklanding.dto.OpenTaskOrderDTO&quot;,       &quot;productType&quot;: &quot;3270&quot;     }   ]</p>
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
     * <p>123</p>
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

    public static ListProductByGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListProductByGroupResponseBody self = new ListProductByGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public ListProductByGroupResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListProductByGroupResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public ListProductByGroupResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListProductByGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListProductByGroupResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
