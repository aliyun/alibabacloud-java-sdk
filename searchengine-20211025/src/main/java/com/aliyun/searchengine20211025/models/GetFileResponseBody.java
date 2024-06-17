// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class GetFileResponseBody extends TeaModel {
    /**
     * <p>id of request</p>
     * 
     * <strong>example:</strong>
     * <p>2AE63638-5420-56DC-BF59-37D8174039A0</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The information about the index.</p>
     */
    @NameInMap("result")
    public GetFileResponseBodyResult result;

    public static GetFileResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetFileResponseBody self = new GetFileResponseBody();
        return TeaModel.build(map, self);
    }

    public GetFileResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetFileResponseBody setResult(GetFileResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetFileResponseBodyResult getResult() {
        return this.result;
    }

    public static class GetFileResponseBodyResult extends TeaModel {
        /**
         * <p>The content of the file.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        @NameInMap("content")
        public String content;

        /**
         * <p>The data source.</p>
         * 
         * <strong>example:</strong>
         * <p>ha-cn-2r42p5oi202_xijie_test</p>
         */
        @NameInMap("dataSource")
        public String dataSource;

        /**
         * <p>The name of the full path.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("fullPathName")
        public String fullPathName;

        /**
         * <p>Indicates whether it is a directory.</p>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        @NameInMap("isDir")
        public Boolean isDir;

        /**
         * <p>The name of the file.</p>
         * 
         * <strong>example:</strong>
         * <p>ha-cn-2r42ostoc01_qrs</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The number of shards.</p>
         * 
         * <strong>example:</strong>
         * <p>ds=20210828</p>
         */
        @NameInMap("partition")
        public Long partition;

        public static GetFileResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetFileResponseBodyResult self = new GetFileResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetFileResponseBodyResult setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public GetFileResponseBodyResult setDataSource(String dataSource) {
            this.dataSource = dataSource;
            return this;
        }
        public String getDataSource() {
            return this.dataSource;
        }

        public GetFileResponseBodyResult setFullPathName(String fullPathName) {
            this.fullPathName = fullPathName;
            return this;
        }
        public String getFullPathName() {
            return this.fullPathName;
        }

        public GetFileResponseBodyResult setIsDir(Boolean isDir) {
            this.isDir = isDir;
            return this;
        }
        public Boolean getIsDir() {
            return this.isDir;
        }

        public GetFileResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetFileResponseBodyResult setPartition(Long partition) {
            this.partition = partition;
            return this;
        }
        public Long getPartition() {
            return this.partition;
        }

    }

}
