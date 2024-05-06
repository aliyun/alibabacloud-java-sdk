// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class CreateClusterRequest extends TeaModel {
    /**
     * <p>The remarks of the query node</p>
     */
    @NameInMap("autoLoad")
    public Boolean autoLoad;

    /**
     * <p>The description of the data node</p>
     */
    @NameInMap("dataNode")
    public CreateClusterRequestDataNode dataNode;

    /**
     * <p>The description of the cluster</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The name of the node</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The description of the query node</p>
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
         * <p>The number of data nodes</p>
         */
        @NameInMap("number")
        public Integer number;

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

    }

    public static class CreateClusterRequestQueryNode extends TeaModel {
        /**
         * <p>The number of nodes to query</p>
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
