// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nlp_automl20190701.models;

import com.aliyun.tea.*;

public class GetPredictDocResponseBody extends TeaModel {
    @NameInMap("Status")
    public Integer status;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("XLIFFInfo")
    public String XLIFFInfo;

    @NameInMap("ResultContent")
    public String resultContent;

    public static GetPredictDocResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPredictDocResponseBody self = new GetPredictDocResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPredictDocResponseBody setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public GetPredictDocResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetPredictDocResponseBody setXLIFFInfo(String XLIFFInfo) {
        this.XLIFFInfo = XLIFFInfo;
        return this;
    }
    public String getXLIFFInfo() {
        return this.XLIFFInfo;
    }

    public GetPredictDocResponseBody setResultContent(String resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public String getResultContent() {
        return this.resultContent;
    }

}
