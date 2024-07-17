// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class CreateClusterRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable automatic connection.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("autoLoad")
    public Boolean autoLoad;

    /**
     * <p>The details of the Searcher workers.</p>
     */
    @NameInMap("dataNode")
    public CreateClusterRequestDataNode dataNode;

    /**
     * <p>The description of the cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;ha-tets&quot;</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The cluster name.</p>
     * 
     * <strong>example:</strong>
     * <p>ha-cn-zvp2qr1sk01_qrs</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The details of the Query Result Searcher (QRS) workers.</p>
     */
    @NameInMap("queryNode")
    public CreateClusterRequestQueryNode queryNode;

    public static CreateClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateClusterRequest self = new CreateClusterRequest();
        return TeaModel.build(map, self);
    }

    public CreateClusterRequest setAutoLoad(Boolean autoLoad) {
        this.autoLoad = autoLoad;
        return this;
    }
    public Boolean getAutoLoad() {
        return this.autoLoad;
    }

    public CreateClusterRequest setDataNode(CreateClusterRequestDataNode dataNode) {
        this.dataNode = dataNode;
        return this;
    }
    public CreateClusterRequestDataNode getDataNode() {
        return this.dataNode;
    }

    public CreateClusterRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateClusterRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateClusterRequest setQueryNode(CreateClusterRequestQueryNode queryNode) {
        this.queryNode = queryNode;
        return this;
    }
    public CreateClusterRequestQueryNode getQueryNode() {
        return this.queryNode;
    }

    public static class CreateClusterRequestDataNode extends TeaModel {
        /**
         * <p>The number of Searcher workers.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("number")
        public Integer number;

        /**
         * <p>The number of shards.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("partition")
        public String partition;

        public static CreateClusterRequestDataNode build(java.util.Map<String, ?> map) throws Exception {
            CreateClusterRequestDataNode self = new CreateClusterRequestDataNode();
            return TeaModel.build(map, self);
        }

        public CreateClusterRequestDataNode setNumber(Integer number) {
            this.number = number;
            return this;
        }
        public Integer getNumber() {
            return this.number;
        }

        public CreateClusterRequestDataNode setPartition(String partition) {
            this.partition = partition;
            return this;
        }
        public String getPartition() {
            return this.partition;
        }

    }

    public static class CreateClusterRequestQueryNode extends TeaModel {
        /**
         * <p>The number of QRS workers.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("number")
        public Integer number;

        public static CreateClusterRequestQueryNode build(java.util.Map<String, ?> map) throws Exception {
            CreateClusterRequestQueryNode self = new CreateClusterRequestQueryNode();
            return TeaModel.build(map, self);
        }

        public CreateClusterRequestQueryNode setNumber(Integer number) {
            this.number = number;
            return this;
        }
        public Integer getNumber() {
            return this.number;
        }

    }

}
