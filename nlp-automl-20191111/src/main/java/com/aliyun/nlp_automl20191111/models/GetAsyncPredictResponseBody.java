// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nlp_automl20191111.models;

import com.aliyun.tea.*;

public class GetAsyncPredictResponseBody extends TeaModel {
    @NameInMap("AsyncPredictId")
    public Integer asyncPredictId;

    @NameInMap("Content")
    public String content;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Status")
    public Integer status;

    public static GetAsyncPredictResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAsyncPredictResponseBody self = new GetAsyncPredictResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAsyncPredictResponseBody setAsyncPredictId(Integer asyncPredictId) {
        this.asyncPredictId = asyncPredictId;
        return this;
    }
    public Integer getAsyncPredictId() {
        return this.asyncPredictId;
    }

    public GetAsyncPredictResponseBody setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public GetAsyncPredictResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAsyncPredictResponseBody setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

}
