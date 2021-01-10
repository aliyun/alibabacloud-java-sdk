// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateAKSPlanRequest extends TeaModel {
    @NameInMap("AksServiceInfosJsonStr")
    public String aksServiceInfosJsonStr;

    @NameInMap("AutoExecution")
    public Boolean autoExecution;

    @NameInMap("Executor")
    public String executor;

    @NameInMap("ExecutorId")
    public String executorId;

    @NameInMap("ExecutorName")
    public String executorName;

    @NameInMap("OpsType")
    public String opsType;

    @NameInMap("Title")
    public String title;

    @NameInMap("Workspace")
    public String workspace;

    @NameInMap("Context")
    public java.util.List<CreateAKSPlanRequestContext> context;

    public static CreateAKSPlanRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAKSPlanRequest self = new CreateAKSPlanRequest();
        return TeaModel.build(map, self);
    }

    public CreateAKSPlanRequest setAksServiceInfosJsonStr(String aksServiceInfosJsonStr) {
        this.aksServiceInfosJsonStr = aksServiceInfosJsonStr;
        return this;
    }
    public String getAksServiceInfosJsonStr() {
        return this.aksServiceInfosJsonStr;
    }

    public CreateAKSPlanRequest setAutoExecution(Boolean autoExecution) {
        this.autoExecution = autoExecution;
        return this;
    }
    public Boolean getAutoExecution() {
        return this.autoExecution;
    }

    public CreateAKSPlanRequest setExecutor(String executor) {
        this.executor = executor;
        return this;
    }
    public String getExecutor() {
        return this.executor;
    }

    public CreateAKSPlanRequest setExecutorId(String executorId) {
        this.executorId = executorId;
        return this;
    }
    public String getExecutorId() {
        return this.executorId;
    }

    public CreateAKSPlanRequest setExecutorName(String executorName) {
        this.executorName = executorName;
        return this;
    }
    public String getExecutorName() {
        return this.executorName;
    }

    public CreateAKSPlanRequest setOpsType(String opsType) {
        this.opsType = opsType;
        return this;
    }
    public String getOpsType() {
        return this.opsType;
    }

    public CreateAKSPlanRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public CreateAKSPlanRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

    public CreateAKSPlanRequest setContext(java.util.List<CreateAKSPlanRequestContext> context) {
        this.context = context;
        return this;
    }
    public java.util.List<CreateAKSPlanRequestContext> getContext() {
        return this.context;
    }

    public static class CreateAKSPlanRequestContext extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static CreateAKSPlanRequestContext build(java.util.Map<String, ?> map) throws Exception {
            CreateAKSPlanRequestContext self = new CreateAKSPlanRequestContext();
            return TeaModel.build(map, self);
        }

        public CreateAKSPlanRequestContext setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateAKSPlanRequestContext setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
