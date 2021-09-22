// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiflow20210202.models;

import com.aliyun.tea.*;

public class GetRunStatusResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // run状态
    @NameInMap("Status")
    public String status;

    // node集合状态
    @NameInMap("Nodes")
    public GetRunStatusResponseBodyNodes nodes;

    public static GetRunStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRunStatusResponseBody self = new GetRunStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRunStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetRunStatusResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetRunStatusResponseBody setNodes(GetRunStatusResponseBodyNodes nodes) {
        this.nodes = nodes;
        return this;
    }
    public GetRunStatusResponseBodyNodes getNodes() {
        return this.nodes;
    }

    public static class GetRunStatusResponseBodyNodes extends TeaModel {
        // 结束时间
        @NameInMap("FinishedAt")
        public String finishedAt;

        // 开始时间
        @NameInMap("StartedAt")
        public String startedAt;

        // 状态
        @NameInMap("Status")
        public String status;

        // node的名字
        @NameInMap("Name")
        public String name;

        // node的id
        @NameInMap("Id")
        public String id;

        public static GetRunStatusResponseBodyNodes build(java.util.Map<String, ?> map) throws Exception {
            GetRunStatusResponseBodyNodes self = new GetRunStatusResponseBodyNodes();
            return TeaModel.build(map, self);
        }

        public GetRunStatusResponseBodyNodes setFinishedAt(String finishedAt) {
            this.finishedAt = finishedAt;
            return this;
        }
        public String getFinishedAt() {
            return this.finishedAt;
        }

        public GetRunStatusResponseBodyNodes setStartedAt(String startedAt) {
            this.startedAt = startedAt;
            return this;
        }
        public String getStartedAt() {
            return this.startedAt;
        }

        public GetRunStatusResponseBodyNodes setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetRunStatusResponseBodyNodes setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetRunStatusResponseBodyNodes setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}
