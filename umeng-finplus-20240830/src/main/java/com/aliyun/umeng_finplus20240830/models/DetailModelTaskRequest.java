// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_finplus20240830.models;

import com.aliyun.tea.*;

public class DetailModelTaskRequest extends TeaModel {
    @NameInMap("param")
    public DetailModelTaskRequestParam param;

    public static DetailModelTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        DetailModelTaskRequest self = new DetailModelTaskRequest();
        return TeaModel.build(map, self);
    }

    public DetailModelTaskRequest setParam(DetailModelTaskRequestParam param) {
        this.param = param;
        return this;
    }
    public DetailModelTaskRequestParam getParam() {
        return this.param;
    }

    public static class DetailModelTaskRequestParam extends TeaModel {
        @NameInMap("taskId")
        public String taskId;

        public static DetailModelTaskRequestParam build(java.util.Map<String, ?> map) throws Exception {
            DetailModelTaskRequestParam self = new DetailModelTaskRequestParam();
            return TeaModel.build(map, self);
        }

        public DetailModelTaskRequestParam setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
