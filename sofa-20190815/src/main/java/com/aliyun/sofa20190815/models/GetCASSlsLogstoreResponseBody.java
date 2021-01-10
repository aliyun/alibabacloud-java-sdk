// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetCASSlsLogstoreResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Data")
    public GetCASSlsLogstoreResponseBodyData data;

    public static GetCASSlsLogstoreResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCASSlsLogstoreResponseBody self = new GetCASSlsLogstoreResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCASSlsLogstoreResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetCASSlsLogstoreResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetCASSlsLogstoreResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetCASSlsLogstoreResponseBody setData(GetCASSlsLogstoreResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetCASSlsLogstoreResponseBodyData getData() {
        return this.data;
    }

    public static class GetCASSlsLogstoreResponseBodyData extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("ShardCount")
        public Long shardCount;

        @NameInMap("Ttl")
        public Long ttl;

        public static GetCASSlsLogstoreResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetCASSlsLogstoreResponseBodyData self = new GetCASSlsLogstoreResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetCASSlsLogstoreResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetCASSlsLogstoreResponseBodyData setShardCount(Long shardCount) {
            this.shardCount = shardCount;
            return this;
        }
        public Long getShardCount() {
            return this.shardCount;
        }

        public GetCASSlsLogstoreResponseBodyData setTtl(Long ttl) {
            this.ttl = ttl;
            return this;
        }
        public Long getTtl() {
            return this.ttl;
        }

    }

}
