// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreateAINodesRequest extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     * <blockquote>
     * <p>You can call the <a href="https://api.aliyun.com/api/polardb/2017-08-01/DescribeAIDBClusters">DescribeAIDBClusters</a> operation to query the information about all clusters under your account, including the cluster ID.</p>
     * </blockquote>
     * <blockquote>
     * <p>The AiNodeType of the target cluster must be vnode or container. The maas type is not supported. You can query the AiNodeType by calling DescribeAIDBClusters.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>pm-xxxxxx</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The list of node information to add.</p>
     * <blockquote>
     * <p>You must specify at least 1 and at most 100 DBNode elements when you call this operation. If you omit this parameter or pass an empty array, the InvalidNewNodeNum.Malformed error is returned.</p>
     * </blockquote>
     */
    @NameInMap("DBNodes")
    public java.util.List<CreateAINodesRequestDBNodes> DBNodes;

    public static CreateAINodesRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAINodesRequest self = new CreateAINodesRequest();
        return TeaModel.build(map, self);
    }

    public CreateAINodesRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public CreateAINodesRequest setDBNodes(java.util.List<CreateAINodesRequestDBNodes> DBNodes) {
        this.DBNodes = DBNodes;
        return this;
    }
    public java.util.List<CreateAINodesRequestDBNodes> getDBNodes() {
        return this.DBNodes;
    }

    public static class CreateAINodesRequestDBNodes extends TeaModel {
        /**
         * <p>The node specifications.</p>
         * 
         * <strong>example:</strong>
         * <p>polar.mysql.g4.xlarge.gu10</p>
         */
        @NameInMap("DBNodeClass")
        public String DBNodeClass;

        public static CreateAINodesRequestDBNodes build(java.util.Map<String, ?> map) throws Exception {
            CreateAINodesRequestDBNodes self = new CreateAINodesRequestDBNodes();
            return TeaModel.build(map, self);
        }

        public CreateAINodesRequestDBNodes setDBNodeClass(String DBNodeClass) {
            this.DBNodeClass = DBNodeClass;
            return this;
        }
        public String getDBNodeClass() {
            return this.DBNodeClass;
        }

    }

}
