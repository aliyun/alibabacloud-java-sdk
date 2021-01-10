// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class RetryTSChunksResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ChunkIds")
    public String chunkIds;

    @NameInMap("JobRequestId")
    public String jobRequestId;

    public static RetryTSChunksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RetryTSChunksResponseBody self = new RetryTSChunksResponseBody();
        return TeaModel.build(map, self);
    }

    public RetryTSChunksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RetryTSChunksResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public RetryTSChunksResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public RetryTSChunksResponseBody setChunkIds(String chunkIds) {
        this.chunkIds = chunkIds;
        return this;
    }
    public String getChunkIds() {
        return this.chunkIds;
    }

    public RetryTSChunksResponseBody setJobRequestId(String jobRequestId) {
        this.jobRequestId = jobRequestId;
        return this;
    }
    public String getJobRequestId() {
        return this.jobRequestId;
    }

}
