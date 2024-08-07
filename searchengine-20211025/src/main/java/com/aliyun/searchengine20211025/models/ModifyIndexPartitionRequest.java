// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class ModifyIndexPartitionRequest extends TeaModel {
    /**
     * <p>The name of the data source.</p>
     * 
     * <strong>example:</strong>
     * <p>test1</p>
     */
    @NameInMap("dataSourceName")
    public String dataSourceName;

    /**
     * <p>The data center.</p>
     * 
     * <strong>example:</strong>
     * <p>pre_domain_1</p>
     */
    @NameInMap("domainName")
    public String domainName;

    /**
     * <p>The primary key.</p>
     * 
     * <strong>example:</strong>
     * <p>1633293829</p>
     */
    @NameInMap("generation")
    public Long generation;

    /**
     * <p>The index information.</p>
     */
    @NameInMap("indexInfos")
    public java.util.List<ModifyIndexPartitionRequestIndexInfos> indexInfos;

    public static ModifyIndexPartitionRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyIndexPartitionRequest self = new ModifyIndexPartitionRequest();
        return TeaModel.build(map, self);
    }

    public ModifyIndexPartitionRequest setDataSourceName(String dataSourceName) {
        this.dataSourceName = dataSourceName;
        return this;
    }
    public String getDataSourceName() {
        return this.dataSourceName;
    }

    public ModifyIndexPartitionRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public ModifyIndexPartitionRequest setGeneration(Long generation) {
        this.generation = generation;
        return this;
    }
    public Long getGeneration() {
        return this.generation;
    }

    public ModifyIndexPartitionRequest setIndexInfos(java.util.List<ModifyIndexPartitionRequestIndexInfos> indexInfos) {
        this.indexInfos = indexInfos;
        return this;
    }
    public java.util.List<ModifyIndexPartitionRequestIndexInfos> getIndexInfos() {
        return this.indexInfos;
    }

    public static class ModifyIndexPartitionRequestIndexInfos extends TeaModel {
        /**
         * <p>The index name.</p>
         * 
         * <strong>example:</strong>
         * <p>atest2</p>
         */
        @NameInMap("indexName")
        public String indexName;

        /**
         * <p>The concurrency. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("parallelNum")
        public Integer parallelNum;

        /**
         * <p>The number of shards.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("partitionCount")
        public Integer partitionCount;

        public static ModifyIndexPartitionRequestIndexInfos build(java.util.Map<String, ?> map) throws Exception {
            ModifyIndexPartitionRequestIndexInfos self = new ModifyIndexPartitionRequestIndexInfos();
            return TeaModel.build(map, self);
        }

        public ModifyIndexPartitionRequestIndexInfos setIndexName(String indexName) {
            this.indexName = indexName;
            return this;
        }
        public String getIndexName() {
            return this.indexName;
        }

        public ModifyIndexPartitionRequestIndexInfos setParallelNum(Integer parallelNum) {
            this.parallelNum = parallelNum;
            return this;
        }
        public Integer getParallelNum() {
            return this.parallelNum;
        }

        public ModifyIndexPartitionRequestIndexInfos setPartitionCount(Integer partitionCount) {
            this.partitionCount = partitionCount;
            return this;
        }
        public Integer getPartitionCount() {
            return this.partitionCount;
        }

    }

}
