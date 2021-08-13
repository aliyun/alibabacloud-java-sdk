// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class DeleteTaskRequest extends TeaModel {
    @NameInMap("DigDeleteParam")
    public DeleteTaskRequestDigDeleteParam digDeleteParam;

    public static DeleteTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteTaskRequest self = new DeleteTaskRequest();
        return TeaModel.build(map, self);
    }

    public DeleteTaskRequest setDigDeleteParam(DeleteTaskRequestDigDeleteParam digDeleteParam) {
        this.digDeleteParam = digDeleteParam;
        return this;
    }
    public DeleteTaskRequestDigDeleteParam getDigDeleteParam() {
        return this.digDeleteParam;
    }

    public static class DeleteTaskRequestDigDeleteParam extends TeaModel {
        @NameInMap("TaskId")
        public Long taskId;

        @NameInMap("RobotCode")
        public String robotCode;

        @NameInMap("OperatorName")
        public String operatorName;

        @NameInMap("OperatorId")
        public String operatorId;

        @NameInMap("DelMessage")
        public String delMessage;

        public static DeleteTaskRequestDigDeleteParam build(java.util.Map<String, ?> map) throws Exception {
            DeleteTaskRequestDigDeleteParam self = new DeleteTaskRequestDigDeleteParam();
            return TeaModel.build(map, self);
        }

        public DeleteTaskRequestDigDeleteParam setTaskId(Long taskId) {
            this.taskId = taskId;
            return this;
        }
        public Long getTaskId() {
            return this.taskId;
        }

        public DeleteTaskRequestDigDeleteParam setRobotCode(String robotCode) {
            this.robotCode = robotCode;
            return this;
        }
        public String getRobotCode() {
            return this.robotCode;
        }

        public DeleteTaskRequestDigDeleteParam setOperatorName(String operatorName) {
            this.operatorName = operatorName;
            return this;
        }
        public String getOperatorName() {
            return this.operatorName;
        }

        public DeleteTaskRequestDigDeleteParam setOperatorId(String operatorId) {
            this.operatorId = operatorId;
            return this;
        }
        public String getOperatorId() {
            return this.operatorId;
        }

        public DeleteTaskRequestDigDeleteParam setDelMessage(String delMessage) {
            this.delMessage = delMessage;
            return this;
        }
        public String getDelMessage() {
            return this.delMessage;
        }

    }

}
