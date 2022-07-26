// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class GetClusterInfoResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public java.util.List<GetClusterInfoResponseBodyResult> result;

    public static GetClusterInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetClusterInfoResponseBody self = new GetClusterInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetClusterInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetClusterInfoResponseBody setResult(java.util.List<GetClusterInfoResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<GetClusterInfoResponseBodyResult> getResult() {
        return this.result;
    }

    public static class GetClusterInfoResponseBodyResultConfigStatus extends TeaModel {
        @NameInMap("percent")
        public Long percent;

        public static GetClusterInfoResponseBodyResultConfigStatus build(java.util.Map<String, ?> map) throws Exception {
            GetClusterInfoResponseBodyResultConfigStatus self = new GetClusterInfoResponseBodyResultConfigStatus();
            return TeaModel.build(map, self);
        }

        public GetClusterInfoResponseBodyResultConfigStatus setPercent(Long percent) {
            this.percent = percent;
            return this;
        }
        public Long getPercent() {
            return this.percent;
        }

    }

    public static class GetClusterInfoResponseBodyResultDataStatus extends TeaModel {
        @NameInMap("name")
        public String name;

        @NameInMap("percent")
        public Long percent;

        @NameInMap("status")
        public String status;

        public static GetClusterInfoResponseBodyResultDataStatus build(java.util.Map<String, ?> map) throws Exception {
            GetClusterInfoResponseBodyResultDataStatus self = new GetClusterInfoResponseBodyResultDataStatus();
            return TeaModel.build(map, self);
        }

        public GetClusterInfoResponseBodyResultDataStatus setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetClusterInfoResponseBodyResultDataStatus setPercent(Long percent) {
            this.percent = percent;
            return this;
        }
        public Long getPercent() {
            return this.percent;
        }

        public GetClusterInfoResponseBodyResultDataStatus setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class GetClusterInfoResponseBodyResultIndexes extends TeaModel {
        @NameInMap("fullUpdateTime")
        public String fullUpdateTime;

        @NameInMap("incUpdateTime")
        public String incUpdateTime;

        @NameInMap("name")
        public String name;

        @NameInMap("partition")
        public Long partition;

        @NameInMap("version")
        public String version;

        public static GetClusterInfoResponseBodyResultIndexes build(java.util.Map<String, ?> map) throws Exception {
            GetClusterInfoResponseBodyResultIndexes self = new GetClusterInfoResponseBodyResultIndexes();
            return TeaModel.build(map, self);
        }

        public GetClusterInfoResponseBodyResultIndexes setFullUpdateTime(String fullUpdateTime) {
            this.fullUpdateTime = fullUpdateTime;
            return this;
        }
        public String getFullUpdateTime() {
            return this.fullUpdateTime;
        }

        public GetClusterInfoResponseBodyResultIndexes setIncUpdateTime(String incUpdateTime) {
            this.incUpdateTime = incUpdateTime;
            return this;
        }
        public String getIncUpdateTime() {
            return this.incUpdateTime;
        }

        public GetClusterInfoResponseBodyResultIndexes setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetClusterInfoResponseBodyResultIndexes setPartition(Long partition) {
            this.partition = partition;
            return this;
        }
        public Long getPartition() {
            return this.partition;
        }

        public GetClusterInfoResponseBodyResultIndexes setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class GetClusterInfoResponseBodyResultServerStatus extends TeaModel {
        @NameInMap("percent")
        public Long percent;

        public static GetClusterInfoResponseBodyResultServerStatus build(java.util.Map<String, ?> map) throws Exception {
            GetClusterInfoResponseBodyResultServerStatus self = new GetClusterInfoResponseBodyResultServerStatus();
            return TeaModel.build(map, self);
        }

        public GetClusterInfoResponseBodyResultServerStatus setPercent(Long percent) {
            this.percent = percent;
            return this;
        }
        public Long getPercent() {
            return this.percent;
        }

    }

    public static class GetClusterInfoResponseBodyResult extends TeaModel {
        @NameInMap("configStatus")
        public GetClusterInfoResponseBodyResultConfigStatus configStatus;

        @NameInMap("dataStatus")
        public java.util.List<GetClusterInfoResponseBodyResultDataStatus> dataStatus;

        @NameInMap("indexes")
        public java.util.List<GetClusterInfoResponseBodyResultIndexes> indexes;

        @NameInMap("name")
        public String name;

        @NameInMap("serverStatus")
        public GetClusterInfoResponseBodyResultServerStatus serverStatus;

        public static GetClusterInfoResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetClusterInfoResponseBodyResult self = new GetClusterInfoResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetClusterInfoResponseBodyResult setConfigStatus(GetClusterInfoResponseBodyResultConfigStatus configStatus) {
            this.configStatus = configStatus;
            return this;
        }
        public GetClusterInfoResponseBodyResultConfigStatus getConfigStatus() {
            return this.configStatus;
        }

        public GetClusterInfoResponseBodyResult setDataStatus(java.util.List<GetClusterInfoResponseBodyResultDataStatus> dataStatus) {
            this.dataStatus = dataStatus;
            return this;
        }
        public java.util.List<GetClusterInfoResponseBodyResultDataStatus> getDataStatus() {
            return this.dataStatus;
        }

        public GetClusterInfoResponseBodyResult setIndexes(java.util.List<GetClusterInfoResponseBodyResultIndexes> indexes) {
            this.indexes = indexes;
            return this;
        }
        public java.util.List<GetClusterInfoResponseBodyResultIndexes> getIndexes() {
            return this.indexes;
        }

        public GetClusterInfoResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetClusterInfoResponseBodyResult setServerStatus(GetClusterInfoResponseBodyResultServerStatus serverStatus) {
            this.serverStatus = serverStatus;
            return this;
        }
        public GetClusterInfoResponseBodyResultServerStatus getServerStatus() {
            return this.serverStatus;
        }

    }

}
