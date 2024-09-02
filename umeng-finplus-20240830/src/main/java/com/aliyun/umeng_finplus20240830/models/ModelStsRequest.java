// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_finplus20240830.models;

import com.aliyun.tea.*;

public class ModelStsRequest extends TeaModel {
    @NameInMap("param")
    public ModelStsRequestParam param;

    public static ModelStsRequest build(java.util.Map<String, ?> map) throws Exception {
        ModelStsRequest self = new ModelStsRequest();
        return TeaModel.build(map, self);
    }

    public ModelStsRequest setParam(ModelStsRequestParam param) {
        this.param = param;
        return this;
    }
    public ModelStsRequestParam getParam() {
        return this.param;
    }

    public static class ModelStsRequestParam extends TeaModel {
        @NameInMap("taskId")
        public String taskId;

        public static ModelStsRequestParam build(java.util.Map<String, ?> map) throws Exception {
            ModelStsRequestParam self = new ModelStsRequestParam();
            return TeaModel.build(map, self);
        }

        public ModelStsRequestParam setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
