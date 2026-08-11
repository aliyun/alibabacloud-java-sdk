// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class ListDateSourceGenerationsResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>022F36C7-9FB4-5D67-BEBC-3D14B0984463</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The returned results.</p>
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
         * <p>The offline deployment ID.</p>
         * 
         * <strong>example:</strong>
         * <p>122</p>
         */
        @NameInMap("buildDeployId")
        public Integer buildDeployId;

        /**
         * <p>The start time of the build index operation.</p>
         * 
         * <strong>example:</strong>
         * <p>1626143673</p>
         */
        @NameInMap("createTime")
        public Long createTime;

        /**
         * <p>The storage path of the dump table index file.</p>
         * 
         * <strong>example:</strong>
         * <p>hdfs://opensearch/dump.json</p>
         */
        @NameInMap("dataDumpRoot")
        public String dataDumpRoot;

        /**
         * <p>The full index version.</p>
         * 
         * <strong>example:</strong>
         * <p>1626143930</p>
         */
        @NameInMap("generation")
        public Long generation;

        /**
         * <p>The export type. Valid values:</p>
         * <ul>
         * <li>api (default): restores to HDFS.</li>
         * <li>oss: exports to OSS.</li>
         * <li>odps: exports to ODPS.</li>
         * </ul>
         * <p>This parameter has a value only when the dump table is restored from an index. The value is empty for common tables.</p>
         */
        @NameInMap("outPutType")
        public String outPutType;

        /**
         * <p>Key: the index name. Value: the number of shards.</p>
         */
        @NameInMap("partition")
        public java.util.Map<String, Integer> partition;

        /**
         * <p>The status.</p>
         * 
         * <strong>example:</strong>
         * <p>STOPPED</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The incremental timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1626143673</p>
         */
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

        public ListDateSourceGenerationsResponseBodyResult setOutPutType(String outPutType) {
            this.outPutType = outPutType;
            return this;
        }
        public String getOutPutType() {
            return this.outPutType;
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
