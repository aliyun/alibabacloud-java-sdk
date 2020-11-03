// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nlp_automl20190701.models;

import com.aliyun.tea.*;

public class GetPredictDocResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("ResultContent")
    @Validation(required = true)
    public String resultContent;

    @NameInMap("Status")
    @Validation(required = true)
    public Integer status;

    @NameInMap("XLIFFInfo")
    @Validation(required = true)
    public String XLIFFInfo;

    public static GetPredictDocResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPredictDocResponse self = new GetPredictDocResponse();
        return TeaModel.build(map, self);
    }

    public GetPredictDocResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetPredictDocResponse setResultContent(String resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public String getResultContent() {
        return this.resultContent;
    }

    public GetPredictDocResponse setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public GetPredictDocResponse setXLIFFInfo(String XLIFFInfo) {
        this.XLIFFInfo = XLIFFInfo;
        return this;
    }
    public String getXLIFFInfo() {
        return this.XLIFFInfo;
    }

}
