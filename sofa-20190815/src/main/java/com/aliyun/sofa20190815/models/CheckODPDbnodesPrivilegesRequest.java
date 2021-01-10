// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CheckODPDbnodesPrivilegesRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Dbnodes")
    public java.util.List<CheckODPDbnodesPrivilegesRequestDbnodes> dbnodes;

    public static CheckODPDbnodesPrivilegesRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckODPDbnodesPrivilegesRequest self = new CheckODPDbnodesPrivilegesRequest();
        return TeaModel.build(map, self);
    }

    public CheckODPDbnodesPrivilegesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CheckODPDbnodesPrivilegesRequest setDbnodes(java.util.List<CheckODPDbnodesPrivilegesRequestDbnodes> dbnodes) {
        this.dbnodes = dbnodes;
        return this;
    }
    public java.util.List<CheckODPDbnodesPrivilegesRequestDbnodes> getDbnodes() {
        return this.dbnodes;
    }

    public static class CheckODPDbnodesPrivilegesRequestDbnodes extends TeaModel {
        @NameInMap("Password")
        public String password;

        @NameInMap("NodeId")
        public String nodeId;

        @NameInMap("Username")
        public String username;

        public static CheckODPDbnodesPrivilegesRequestDbnodes build(java.util.Map<String, ?> map) throws Exception {
            CheckODPDbnodesPrivilegesRequestDbnodes self = new CheckODPDbnodesPrivilegesRequestDbnodes();
            return TeaModel.build(map, self);
        }

        public CheckODPDbnodesPrivilegesRequestDbnodes setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public CheckODPDbnodesPrivilegesRequestDbnodes setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public CheckODPDbnodesPrivilegesRequestDbnodes setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

    }

}
