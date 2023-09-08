// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class ListDateSourceGenerationsResponseBody extends TeaModel {
    /**
     * <p>id of request</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>List</p>
     */
    @NameInMap("result")
    public java.util.List<ListDateSourceGenerationsResponseBodyResult> result;

    public static ListDateSourceGenerationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDateSourceGenerationsResponseBody self = new ListDateSourceGenerationsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDateSourceGenerationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDateSourceGenerationsResponseBody setResult(java.util.List<ListDateSourceGenerationsResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListDateSourceGenerationsResponseBodyResult> getResult() {
        return this.result;
    }

    public static class ListDateSourceGenerationsResponseBodyResult extends TeaModel {
        /**
         * <p>buildDeployId</p>
         */
        @NameInMap("buildDeployId")
        public Integer buildDeployId;

        @NameInMap("createTime")
        public Long createTime;

        @NameInMap("dataDumpRoot")
        public String dataDumpRoot;

        @NameInMap("generation")
        public Long generation;

        @NameInMap("partition")
        public java.util.Map<String, Integer> partition;

        @NameInMap("status")
        public String status;

        @NameInMap("timestamp")
        public Long timestamp;

        public static ListDateSourceGenerationsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListDateSourceGenerationsResponseBodyResult self = new ListDateSourceGenerationsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListDateSourceGenerationsResponseBodyResult setBuildDeployId(Integer buildDeployId) {
            this.buildDeployId = buildDeployId;
            return this;
        }
        public Integer getBuildDeployId() {
            return this.buildDeployId;
        }

        public ListDateSourceGenerationsResponseBodyResult setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListDateSourceGenerationsResponseBodyResult setDataDumpRoot(String dataDumpRoot) {
            this.dataDumpRoot = dataDumpRoot;
            return this;
        }
        public String getDataDumpRoot() {
            return this.dataDumpRoot;
        }

        public ListDateSourceGenerationsResponseBodyResult setGeneration(Long generation) {
            this.generation = generation;
            return this;
        }
        public Long getGeneration() {
            return this.generation;
        }

        public ListDateSourceGenerationsResponseBodyResult setPartition(java.util.Map<String, Integer> partition) {
            this.partition = partition;
            return this;
        }
        public java.util.Map<String, Integer> getPartition() {
            return this.partition;
        }

        public ListDateSourceGenerationsResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListDateSourceGenerationsResponseBodyResult setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

    }

}
