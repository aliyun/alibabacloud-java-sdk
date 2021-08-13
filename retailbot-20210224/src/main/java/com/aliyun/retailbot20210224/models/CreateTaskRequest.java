// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class CreateTaskRequest extends TeaModel {
    @NameInMap("DigTaskInfoParam")
    public CreateTaskRequestDigTaskInfoParam digTaskInfoParam;

    public static CreateTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTaskRequest self = new CreateTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateTaskRequest setDigTaskInfoParam(CreateTaskRequestDigTaskInfoParam digTaskInfoParam) {
        this.digTaskInfoParam = digTaskInfoParam;
        return this;
    }
    public CreateTaskRequestDigTaskInfoParam getDigTaskInfoParam() {
        return this.digTaskInfoParam;
    }

    public static class CreateTaskRequestDigTaskInfoParam extends TeaModel {
        @NameInMap("RobotCode")
        public String robotCode;

        @NameInMap("Type")
        public String type;

        @NameInMap("OperatorName")
        public String operatorName;

        @NameInMap("OperatorId")
        public String operatorId;

        @NameInMap("ParamConfig")
        public String paramConfig;

        public static CreateTaskRequestDigTaskInfoParam build(java.util.Map<String, ?> map) throws Exception {
            CreateTaskRequestDigTaskInfoParam self = new CreateTaskRequestDigTaskInfoParam();
            return TeaModel.build(map, self);
        }

        public CreateTaskRequestDigTaskInfoParam setRobotCode(String robotCode) {
            this.robotCode = robotCode;
            return this;
        }
        public String getRobotCode() {
            return this.robotCode;
        }

        public CreateTaskRequestDigTaskInfoParam setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public CreateTaskRequestDigTaskInfoParam setOperatorName(String operatorName) {
            this.operatorName = operatorName;
            return this;
        }
        public String getOperatorName() {
            return this.operatorName;
        }

        public CreateTaskRequestDigTaskInfoParam setOperatorId(String operatorId) {
            this.operatorId = operatorId;
            return this;
        }
        public String getOperatorId() {
            return this.operatorId;
        }

        public CreateTaskRequestDigTaskInfoParam setParamConfig(String paramConfig) {
            this.paramConfig = paramConfig;
            return this;
        }
        public String getParamConfig() {
            return this.paramConfig;
        }

    }

}
