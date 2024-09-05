// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.support_plan20210706.models;

import com.aliyun.tea.*;

public class ListDdTaskOrderResponseBody extends TeaModel {
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
     * <p>{   &quot;msg&quot;: &quot;请求成功&quot;,   &quot;code&quot;: &quot;200&quot;,   &quot;data&quot;: [     {       &quot;wfNodeId&quot;: &quot;dealingNode&quot;,//任务单状态       &quot;createEmpId&quot;: null,//创建人工号，可以忽略       &quot;createTime&quot;: 1637571435000,//任务单创建时间       &quot;orderId&quot;: &quot;E2111221H1UKCZ&quot;,//任务单号       &quot;isImportant&quot;: &quot;normal&quot;,//是否紧急       &quot;closeTime&quot;: null,//任务单关单时间       &quot;taskTitle&quot;: &quot;测试单16点44&quot;,//标题       &quot;productType&quot;: &quot;3270&quot;//问题分类     },     {       &quot;wfNodeId&quot;: &quot;dealingNode&quot;,       &quot;createEmpId&quot;: null,       &quot;createTime&quot;: 1637820497000,       &quot;orderId&quot;: &quot;E211125CG111EM&quot;,       &quot;isImportant&quot;: &quot;normal&quot;,       &quot;closeTime&quot;: null,       &quot;taskTitle&quot;: &quot;测试单14&quot;,       &quot;class&quot;: &quot;com.aliyun.dingtalklanding.dto.OpenTaskOrderDTO&quot;,       &quot;productType&quot;: &quot;3270&quot;     }   ],   &quot;success&quot;: true,   &quot;requestId&quot;: &quot;123&quot;,   &quot;class&quot;: &quot;com.aliyun.dingtalklanding.pop.dto.PopResultDTO&quot; }</p>
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
     * <p>2F8557E4-742B-1CF7-8E83-28CD0C1F7B48</p>
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

    public static ListDdTaskOrderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDdTaskOrderResponseBody self = new ListDdTaskOrderResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDdTaskOrderResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListDdTaskOrderResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public ListDdTaskOrderResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListDdTaskOrderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDdTaskOrderResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
