// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_finplus20240830.models;

import com.aliyun.tea.*;

public class CreateModelTaskRequest extends TeaModel {
    @NameInMap("param")
    public CreateModelTaskRequestParam param;

    public static CreateModelTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateModelTaskRequest self = new CreateModelTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateModelTaskRequest setParam(CreateModelTaskRequestParam param) {
        this.param = param;
        return this;
    }
    public CreateModelTaskRequestParam getParam() {
        return this.param;
    }

    public static class CreateModelTaskRequestParam extends TeaModel {
        @NameInMap("modelBcId")
        public String modelBcId;

        @NameInMap("modelComment")
        public String modelComment;

        @NameInMap("modelName")
        public String modelName;

        @NameInMap("modelTags")
        public String modelTags;

        @NameInMap("taskName")
        public String taskName;

        public static CreateModelTaskRequestParam build(java.util.Map<String, ?> map) throws Exception {
            CreateModelTaskRequestParam self = new CreateModelTaskRequestParam();
            return TeaModel.build(map, self);
        }

        public CreateModelTaskRequestParam setModelBcId(String modelBcId) {
            this.modelBcId = modelBcId;
            return this;
        }
        public String getModelBcId() {
            return this.modelBcId;
        }

        public CreateModelTaskRequestParam setModelComment(String modelComment) {
            this.modelComment = modelComment;
            return this;
        }
        public String getModelComment() {
            return this.modelComment;
        }

        public CreateModelTaskRequestParam setModelName(String modelName) {
            this.modelName = modelName;
            return this;
        }
        public String getModelName() {
            return this.modelName;
        }

        public CreateModelTaskRequestParam setModelTags(String modelTags) {
            this.modelTags = modelTags;
            return this;
        }
        public String getModelTags() {
            return this.modelTags;
        }

        public CreateModelTaskRequestParam setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

    }

}
