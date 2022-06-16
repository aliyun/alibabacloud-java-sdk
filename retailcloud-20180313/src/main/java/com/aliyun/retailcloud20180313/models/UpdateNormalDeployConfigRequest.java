// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class UpdateNormalDeployConfigRequest extends TeaModel {
    @NameInMap("AppId")
    public Long appId;

    @NameInMap("ContainerResourceLimit")
    public UpdateNormalDeployConfigRequestContainerResourceLimit containerResourceLimit;

    @NameInMap("ContainerResourceRequest")
    public UpdateNormalDeployConfigRequestContainerResourceRequest containerResourceRequest;

    @NameInMap("Id")
    public Long id;

    public static UpdateNormalDeployConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateNormalDeployConfigRequest self = new UpdateNormalDeployConfigRequest();
        return TeaModel.build(map, self);
    }

    public UpdateNormalDeployConfigRequest setAppId(Long appId) {
        this.appId = appId;
        return this;
    }
    public Long getAppId() {
        return this.appId;
    }

    public UpdateNormalDeployConfigRequest setContainerResourceLimit(UpdateNormalDeployConfigRequestContainerResourceLimit containerResourceLimit) {
        this.containerResourceLimit = containerResourceLimit;
        return this;
    }
    public UpdateNormalDeployConfigRequestContainerResourceLimit getContainerResourceLimit() {
        return this.containerResourceLimit;
    }

    public UpdateNormalDeployConfigRequest setContainerResourceRequest(UpdateNormalDeployConfigRequestContainerResourceRequest containerResourceRequest) {
        this.containerResourceRequest = containerResourceRequest;
        return this;
    }
    public UpdateNormalDeployConfigRequestContainerResourceRequest getContainerResourceRequest() {
        return this.containerResourceRequest;
    }

    public UpdateNormalDeployConfigRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public static class UpdateNormalDeployConfigRequestContainerResourceLimit extends TeaModel {
        @NameInMap("Cpu")
        public String cpu;

        @NameInMap("Memory")
        public String memory;

        public static UpdateNormalDeployConfigRequestContainerResourceLimit build(java.util.Map<String, ?> map) throws Exception {
            UpdateNormalDeployConfigRequestContainerResourceLimit self = new UpdateNormalDeployConfigRequestContainerResourceLimit();
            return TeaModel.build(map, self);
        }

        public UpdateNormalDeployConfigRequestContainerResourceLimit setCpu(String cpu) {
            this.cpu = cpu;
            return this;
        }
        public String getCpu() {
            return this.cpu;
        }

        public UpdateNormalDeployConfigRequestContainerResourceLimit setMemory(String memory) {
            this.memory = memory;
            return this;
        }
        public String getMemory() {
            return this.memory;
        }

    }

    public static class UpdateNormalDeployConfigRequestContainerResourceRequest extends TeaModel {
        @NameInMap("Cpu")
        public String cpu;

        @NameInMap("Memory")
        public String memory;

        public static UpdateNormalDeployConfigRequestContainerResourceRequest build(java.util.Map<String, ?> map) throws Exception {
            UpdateNormalDeployConfigRequestContainerResourceRequest self = new UpdateNormalDeployConfigRequestContainerResourceRequest();
            return TeaModel.build(map, self);
        }

        public UpdateNormalDeployConfigRequestContainerResourceRequest setCpu(String cpu) {
            this.cpu = cpu;
            return this;
        }
        public String getCpu() {
            return this.cpu;
        }

        public UpdateNormalDeployConfigRequestContainerResourceRequest setMemory(String memory) {
            this.memory = memory;
            return this;
        }
        public String getMemory() {
            return this.memory;
        }

    }

}
