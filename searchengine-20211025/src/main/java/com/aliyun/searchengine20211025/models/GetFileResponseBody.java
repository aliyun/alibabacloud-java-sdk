// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class GetFileResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2AE63638-5420-56DC-BF59-37D8174039A0</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The index information.</p>
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
         * <p>{&quot;summarys&quot;:{&quot;parameter&quot;:{&quot;file_compressor&quot;:&quot;zstd&quot;},&quot;summary_fields&quot;:[&quot;id&quot;]},&quot;file_compress&quot;:[{&quot;name&quot;:&quot;file_compressor&quot;,&quot;type&quot;:&quot;zstd&quot;},{&quot;name&quot;:&quot;no_compressor&quot;,&quot;type&quot;:&quot;&quot;}],&quot;indexs&quot;:[{&quot;index_fields&quot;:&quot;name&quot;,&quot;index_name&quot;:&quot;ids&quot;,&quot;index_type&quot;:&quot;STRING&quot;},{&quot;has_primary_key_attribute&quot;:true,&quot;index_fields&quot;:&quot;id&quot;,&quot;is_primary_key_sorted&quot;:false,&quot;index_name&quot;:&quot;id&quot;,&quot;index_type&quot;:&quot;PRIMARYKEY64&quot;}],&quot;attributes&quot;:[{&quot;file_compress&quot;:&quot;no_compressor&quot;,&quot;field_name&quot;:&quot;id&quot;}],&quot;fields&quot;:[{&quot;user_defined_param&quot;:{},&quot;compress_type&quot;:&quot;uniq&quot;,&quot;field_type&quot;:&quot;STRING&quot;,&quot;field_name&quot;:&quot;id&quot;},{&quot;compress_type&quot;:&quot;uniq&quot;,&quot;field_type&quot;:&quot;STRING&quot;,&quot;field_name&quot;:&quot;name&quot;}],&quot;table_name&quot;:&quot;api&quot;}</p>
         */
        @NameInMap("content")
        public String content;

        /**
         * <p>The data source.</p>
         * 
         * <strong>example:</strong>
         * <p>ha-cn-pl32rf0****_test_api</p>
         */
        @NameInMap("dataSource")
        public String dataSource;

        /**
         * <p>The extended information.</p>
         */
        @NameInMap("extend")
        public java.util.Map<String, java.util.List<String>> extend;

        /**
         * <p>The full path of the file.</p>
         * 
         * <strong>example:</strong>
         * <p>/schema.json</p>
         */
        @NameInMap("fullPathName")
        public String fullPathName;

        /**
         * <p>Indicates whether the path points to a directory.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("isDir")
        public Boolean isDir;

        /**
         * <p>The file name.</p>
         * 
         * <strong>example:</strong>
         * <p>testFile</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The number of shards.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
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

        public GetFileResponseBodyResult setExtend(java.util.Map<String, java.util.List<String>> extend) {
            this.extend = extend;
            return this;
        }
        public java.util.Map<String, java.util.List<String>> getExtend() {
            return this.extend;
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
