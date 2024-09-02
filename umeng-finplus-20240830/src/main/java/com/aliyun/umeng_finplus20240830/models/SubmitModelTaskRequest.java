// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_finplus20240830.models;

import com.aliyun.tea.*;

public class SubmitModelTaskRequest extends TeaModel {
    @NameInMap("param")
    public SubmitModelTaskRequestParam param;

    public static SubmitModelTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitModelTaskRequest self = new SubmitModelTaskRequest();
        return TeaModel.build(map, self);
    }

    public SubmitModelTaskRequest setParam(SubmitModelTaskRequestParam param) {
        this.param = param;
        return this;
    }
    public SubmitModelTaskRequestParam getParam() {
        return this.param;
    }

    public static class SubmitModelTaskRequestParam extends TeaModel {
        @NameInMap("taskId")
        public String taskId;

        public static SubmitModelTaskRequestParam build(java.util.Map<String, ?> map) throws Exception {
            SubmitModelTaskRequestParam self = new SubmitModelTaskRequestParam();
            return TeaModel.build(map, self);
        }

        public SubmitModelTaskRequestParam setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
