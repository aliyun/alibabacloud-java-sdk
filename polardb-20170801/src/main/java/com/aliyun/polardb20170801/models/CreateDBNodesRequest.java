// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreateDBNodesRequest extends TeaModel {
    @NameInMap("DBClusterId")
    @Validation(required = true)
    public String DBClusterId;

    @NameInMap("DBNode")
    @Validation(required = true)
    public java.util.List<CreateDBNodesRequestDBNode> DBNode;

    @NameInMap("ClientToken")
    public String clientToken;

    public static CreateDBNodesRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDBNodesRequest self = new CreateDBNodesRequest();
        return TeaModel.build(map, self);
    }

    public static class CreateDBNodesRequestDBNode extends TeaModel {
        @NameInMap("TargetClass")
        @Validation(required = true)
        public String targetClass;

        @NameInMap("ZoneId")
        @Validation(required = true)
        public String zoneId;

        public static CreateDBNodesRequestDBNode build(java.util.Map<String, ?> map) throws Exception {
            CreateDBNodesRequestDBNode self = new CreateDBNodesRequestDBNode();
            return TeaModel.build(map, self);
        }

    }

}
