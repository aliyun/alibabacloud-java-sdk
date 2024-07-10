// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class AppStackInstance extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1706518652</p>
     */
    @NameInMap("CreateTime")
    public Long createTime;

    @NameInMap("Endpoints")
    public java.util.List<AppStackInstanceEndpoints> endpoints;

    /**
     * <strong>example:</strong>
     * <p>i-789y</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>palworld</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    @NameInMap("Parameters")
    public java.util.List<AppStackInstanceParameters> parameters;

    /**
     * <strong>example:</strong>
     * <p>palworld</p>
     */
    @NameInMap("StackId")
    public String stackId;

    /**
     * <strong>example:</strong>
     * <p>WAIT</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <strong>example:</strong>
     * <p>1706518652</p>
     */
    @NameInMap("UpdateTime")
    public Long updateTime;

    public static AppStackInstance build(java.util.Map<String, ?> map) throws Exception {
        AppStackInstance self = new AppStackInstance();
        return TeaModel.build(map, self);
    }

    public AppStackInstance setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

    public AppStackInstance setEndpoints(java.util.List<AppStackInstanceEndpoints> endpoints) {
        this.endpoints = endpoints;
        return this;
    }
    public java.util.List<AppStackInstanceEndpoints> getEndpoints() {
        return this.endpoints;
    }

    public AppStackInstance setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AppStackInstance setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public AppStackInstance setParameters(java.util.List<AppStackInstanceParameters> parameters) {
        this.parameters = parameters;
        return this;
    }
    public java.util.List<AppStackInstanceParameters> getParameters() {
        return this.parameters;
    }

    public AppStackInstance setStackId(String stackId) {
        this.stackId = stackId;
        return this;
    }
    public String getStackId() {
        return this.stackId;
    }

    public AppStackInstance setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public AppStackInstance setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public Long getUpdateTime() {
        return this.updateTime;
    }

    public static class AppStackInstanceEndpoints extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>127.0.0.1:8211</p>
         */
        @NameInMap("Address")
        public String address;

        /**
         * <strong>example:</strong>
         * <p>game</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>UDP</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        public static AppStackInstanceEndpoints build(java.util.Map<String, ?> map) throws Exception {
            AppStackInstanceEndpoints self = new AppStackInstanceEndpoints();
            return TeaModel.build(map, self);
        }

        public AppStackInstanceEndpoints setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public AppStackInstanceEndpoints setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public AppStackInstanceEndpoints setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

    }

    public static class AppStackInstanceParameters extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>regionId</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("Value")
        public String value;

        public static AppStackInstanceParameters build(java.util.Map<String, ?> map) throws Exception {
            AppStackInstanceParameters self = new AppStackInstanceParameters();
            return TeaModel.build(map, self);
        }

        public AppStackInstanceParameters setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public AppStackInstanceParameters setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
