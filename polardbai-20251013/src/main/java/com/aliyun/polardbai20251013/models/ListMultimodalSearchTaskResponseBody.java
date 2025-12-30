// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbai20251013.models;

import com.aliyun.tea.*;

public class ListMultimodalSearchTaskResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>模型相关信息</p>
     * <p>{
     *   &quot;Data&quot;: {
     *     &quot;PageSize&quot;: 1,
     *     &quot;PageNumber&quot;: 1,
     *     &quot;Total&quot;: 12,
     *     &quot;Items&quot;: [
     *       {
     *         &quot;Status&quot;: &quot;Running&quot;,
     *         &quot;ProcessBatch&quot;: 0,
     *         &quot;TotalBatch&quot;: 0,
     *         &quot;EndTime&quot;: &quot;&quot;,
     *         &quot;CreateTime&quot;: &quot;2025-12-25T20:38:35&quot;,
     *         &quot;Id&quot;: &quot;dd84065b-eb46-4c7b-abb0-0d633ec811d7&quot;,
     *         &quot;SuccessBatch&quot;: 0,
     *         &quot;Query&quot; : &quot;油漆桶&quot;,
     *         &quot;DatasetIds&quot;: [&quot;ds-1&quot;, &quot;ds-2&quot;]
     *       }
     *     ]
     *   },
     *   &quot;RequestId&quot;: &quot;849E84DB-*****-9D734&quot;,
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

    public static ListMultimodalSearchTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMultimodalSearchTaskResponseBody self = new ListMultimodalSearchTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMultimodalSearchTaskResponseBody setData(Object data) {
        this.data = data;
        return this;
    }
    public Object getData() {
        return this.data;
    }

    public ListMultimodalSearchTaskResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public ListMultimodalSearchTaskResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public ListMultimodalSearchTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListMultimodalSearchTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
