// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nlp_automl20190701.models;

import com.aliyun.tea.*;

public class GetPredictDocResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>86D18195-D89C-4C8C-9DC4-5FCE789CE6D5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("ResultContent")
    public String resultContent;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("Status")
    public Integer status;

    /**
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("XLIFFInfo")
    public String XLIFFInfo;

    public static GetPredictDocResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPredictDocResponseBody self = new GetPredictDocResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPredictDocResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetPredictDocResponseBody setResultContent(String resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public String getResultContent() {
        return this.resultContent;
    }

    public GetPredictDocResponseBody setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public GetPredictDocResponseBody setXLIFFInfo(String XLIFFInfo) {
        this.XLIFFInfo = XLIFFInfo;
        return this;
    }
    public String getXLIFFInfo() {
        return this.XLIFFInfo;
    }

}
