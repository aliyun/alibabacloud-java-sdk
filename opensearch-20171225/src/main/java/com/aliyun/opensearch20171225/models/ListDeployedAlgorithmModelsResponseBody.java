// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ListDeployedAlgorithmModelsResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public java.util.List<ListDeployedAlgorithmModelsResponseBodyResult> result;

    public static ListDeployedAlgorithmModelsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDeployedAlgorithmModelsResponseBody self = new ListDeployedAlgorithmModelsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDeployedAlgorithmModelsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDeployedAlgorithmModelsResponseBody setResult(java.util.List<ListDeployedAlgorithmModelsResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListDeployedAlgorithmModelsResponseBodyResult> getResult() {
        return this.result;
    }

    public static class ListDeployedAlgorithmModelsResponseBodyResultModels extends TeaModel {
        @NameInMap("algorithmType")
        public String algorithmType;

        @NameInMap("modelId")
        public Integer modelId;

        @NameInMap("modelName")
        public String modelName;

        @NameInMap("progress")
        public Integer progress;

        @NameInMap("projectId")
        public Integer projectId;

        @NameInMap("status")
        public String status;

        public static ListDeployedAlgorithmModelsResponseBodyResultModels build(java.util.Map<String, ?> map) throws Exception {
            ListDeployedAlgorithmModelsResponseBodyResultModels self = new ListDeployedAlgorithmModelsResponseBodyResultModels();
            return TeaModel.build(map, self);
        }

        public ListDeployedAlgorithmModelsResponseBodyResultModels setAlgorithmType(String algorithmType) {
            this.algorithmType = algorithmType;
            return this;
        }
        public String getAlgorithmType() {
            return this.algorithmType;
        }

        public ListDeployedAlgorithmModelsResponseBodyResultModels setModelId(Integer modelId) {
            this.modelId = modelId;
            return this;
        }
        public Integer getModelId() {
            return this.modelId;
        }

        public ListDeployedAlgorithmModelsResponseBodyResultModels setModelName(String modelName) {
            this.modelName = modelName;
            return this;
        }
        public String getModelName() {
            return this.modelName;
        }

        public ListDeployedAlgorithmModelsResponseBodyResultModels setProgress(Integer progress) {
            this.progress = progress;
            return this;
        }
        public Integer getProgress() {
            return this.progress;
        }

        public ListDeployedAlgorithmModelsResponseBodyResultModels setProjectId(Integer projectId) {
            this.projectId = projectId;
            return this;
        }
        public Integer getProjectId() {
            return this.projectId;
        }

        public ListDeployedAlgorithmModelsResponseBodyResultModels setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class ListDeployedAlgorithmModelsResponseBodyResult extends TeaModel {
        @NameInMap("appGroupName")
        public String appGroupName;

        @NameInMap("apps")
        public java.util.List<String> apps;

        @NameInMap("desc")
        public String desc;

        @NameInMap("gmtCreate")
        public String gmtCreate;

        @NameInMap("gmtModified")
        public String gmtModified;

        @NameInMap("id")
        public String id;

        @NameInMap("models")
        public java.util.List<ListDeployedAlgorithmModelsResponseBodyResultModels> models;

        @NameInMap("scene")
        public String scene;

        @NameInMap("status")
        public String status;

        public static ListDeployedAlgorithmModelsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListDeployedAlgorithmModelsResponseBodyResult self = new ListDeployedAlgorithmModelsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListDeployedAlgorithmModelsResponseBodyResult setAppGroupName(String appGroupName) {
            this.appGroupName = appGroupName;
            return this;
        }
        public String getAppGroupName() {
            return this.appGroupName;
        }

        public ListDeployedAlgorithmModelsResponseBodyResult setApps(java.util.List<String> apps) {
            this.apps = apps;
            return this;
        }
        public java.util.List<String> getApps() {
            return this.apps;
        }

        public ListDeployedAlgorithmModelsResponseBodyResult setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public ListDeployedAlgorithmModelsResponseBodyResult setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListDeployedAlgorithmModelsResponseBodyResult setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListDeployedAlgorithmModelsResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListDeployedAlgorithmModelsResponseBodyResult setModels(java.util.List<ListDeployedAlgorithmModelsResponseBodyResultModels> models) {
            this.models = models;
            return this;
        }
        public java.util.List<ListDeployedAlgorithmModelsResponseBodyResultModels> getModels() {
            return this.models;
        }

        public ListDeployedAlgorithmModelsResponseBodyResult setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public ListDeployedAlgorithmModelsResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
