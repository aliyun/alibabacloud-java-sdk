// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbai20251013.models;

import com.aliyun.tea.*;

public class ListMultimodalEmbeddingModelModeResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>模型相关信息
     * 返回示例：
     * {
     *   &quot;Data&quot;: {
     *     &quot;Items&quot;: [
     *       {
     *         &quot;Model&quot;: &quot;MultiModal-Embedding&quot;
     *       }
     *     ]
     *   },
     *   &quot;RequestId&quot;: &quot;7A53B3C8-2228-1478-9D12-B4C219369540&quot;,
     *   &quot;Success&quot;: true
     * }</p>
     */
    @NameInMap("Data")
    public Object data;

    /**
     * <strong>example:</strong>
     * <p>错误码</p>
     */
    @NameInMap("ErrCode")
    public String errCode;

    /**
     * <strong>example:</strong>
     * <p>错误信息</p>
     */
    @NameInMap("ErrMessage")
    public String errMessage;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>983863E2-****-1D15-A4AE-3468CD75383D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListMultimodalEmbeddingModelModeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMultimodalEmbeddingModelModeResponseBody self = new ListMultimodalEmbeddingModelModeResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMultimodalEmbeddingModelModeResponseBody setData(Object data) {
        this.data = data;
        return this;
    }
    public Object getData() {
        return this.data;
    }

    public ListMultimodalEmbeddingModelModeResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public ListMultimodalEmbeddingModelModeResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public ListMultimodalEmbeddingModelModeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListMultimodalEmbeddingModelModeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
