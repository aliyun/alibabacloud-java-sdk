// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreateAINodesRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>pm-xxxxxx</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

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
