// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class MLServiceParam extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>某某服务</p>
     */
    @NameInMap("description")
    public String description;

    @NameInMap("model")
    public MLServiceParamModel model;

    /**
     * <strong>example:</strong>
     * <p>service_name</p>
     */
    @NameInMap("name")
    public String name;

    @NameInMap("resource")
    public MLServiceParamResource resource;

    /**
     * <strong>example:</strong>
     * <p>sls_builtin</p>
     */
    @NameInMap("serviceType")
    public String serviceType;

    /**
     * <strong>example:</strong>
     * <p>running</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <strong>example:</strong>
     * <p>1695090077</p>
     */
    @NameInMap("updateTimestamp")
    public Long updateTimestamp;

    public static MLServiceParam build(java.util.Map<String, ?> map) throws Exception {
        MLServiceParam self = new MLServiceParam();
        return TeaModel.build(map, self);
    }

    public MLServiceParam setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public MLServiceParam setModel(MLServiceParamModel model) {
        this.model = model;
        return this;
    }
    public MLServiceParamModel getModel() {
        return this.model;
    }

    public MLServiceParam setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public MLServiceParam setResource(MLServiceParamResource resource) {
        this.resource = resource;
        return this;
    }
    public MLServiceParamResource getResource() {
        return this.resource;
    }

    public MLServiceParam setServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }
    public String getServiceType() {
        return this.serviceType;
    }

    public MLServiceParam setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public MLServiceParam setUpdateTimestamp(Long updateTimestamp) {
        this.updateTimestamp = updateTimestamp;
        return this;
    }
    public Long getUpdateTimestamp() {
        return this.updateTimestamp;
    }

    public static class MLServiceParamModel extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xxxx</p>
         */
        @NameInMap("modelResourceId")
        public String modelResourceId;

        /**
         * <strong>example:</strong>
         * <p>xxx_type</p>
         */
        @NameInMap("modelResourceType")
        public String modelResourceType;

        public static MLServiceParamModel build(java.util.Map<String, ?> map) throws Exception {
            MLServiceParamModel self = new MLServiceParamModel();
            return TeaModel.build(map, self);
        }

        public MLServiceParamModel setModelResourceId(String modelResourceId) {
            this.modelResourceId = modelResourceId;
            return this;
        }
        public String getModelResourceId() {
            return this.modelResourceId;
        }

        public MLServiceParamModel setModelResourceType(String modelResourceType) {
            this.modelResourceType = modelResourceType;
            return this;
        }
        public String getModelResourceType() {
            return this.modelResourceType;
        }

    }

    public static class MLServiceParamResource extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("cpuLimit")
        public Integer cpuLimit;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("gpu")
        public Integer gpu;

        /**
         * <strong>example:</strong>
         * <p>64</p>
         */
        @NameInMap("memoryLimit")
        public Integer memoryLimit;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("replica")
        public Integer replica;

        public static MLServiceParamResource build(java.util.Map<String, ?> map) throws Exception {
            MLServiceParamResource self = new MLServiceParamResource();
            return TeaModel.build(map, self);
        }

        public MLServiceParamResource setCpuLimit(Integer cpuLimit) {
            this.cpuLimit = cpuLimit;
            return this;
        }
        public Integer getCpuLimit() {
            return this.cpuLimit;
        }

        public MLServiceParamResource setGpu(Integer gpu) {
            this.gpu = gpu;
            return this;
        }
        public Integer getGpu() {
            return this.gpu;
        }

        public MLServiceParamResource setMemoryLimit(Integer memoryLimit) {
            this.memoryLimit = memoryLimit;
            return this;
        }
        public Integer getMemoryLimit() {
            return this.memoryLimit;
        }

        public MLServiceParamResource setReplica(Integer replica) {
            this.replica = replica;
            return this;
        }
        public Integer getReplica() {
            return this.replica;
        }

    }

}
