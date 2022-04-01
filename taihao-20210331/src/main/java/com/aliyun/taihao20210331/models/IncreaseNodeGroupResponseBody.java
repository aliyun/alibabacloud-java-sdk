// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class IncreaseNodeGroupResponseBody extends TeaModel {
    // code
    @NameInMap("Code")
    public String code;

    // message
    @NameInMap("Message")
    public String message;

    // requestId
    @NameInMap("RequestId")
    public String requestId;

    // data
    @NameInMap("data")
    public Data data;

    // success
    @NameInMap("success")
    public Boolean success;

    public static IncreaseNodeGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        IncreaseNodeGroupResponseBody self = new IncreaseNodeGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public IncreaseNodeGroupResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public IncreaseNodeGroupResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public IncreaseNodeGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public IncreaseNodeGroupResponseBody setData(Data data) {
        this.data = data;
        return this;
    }
    public Data getData() {
        return this.data;
    }

    public IncreaseNodeGroupResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class Data extends TeaModel {
        // clusterId
        @NameInMap("clusterId")
        public String clusterId;

        // operationId
        @NameInMap("operationId")
        public String operationId;

        public static Data build(java.util.Map<String, ?> map) throws Exception {
            Data self = new Data();
            return TeaModel.build(map, self);
        }

        public Data setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public Data setOperationId(String operationId) {
            this.operationId = operationId;
            return this;
        }
        public String getOperationId() {
            return this.operationId;
        }

    }

}
