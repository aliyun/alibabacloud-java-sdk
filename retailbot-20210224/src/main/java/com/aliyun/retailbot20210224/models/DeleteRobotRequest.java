// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class DeleteRobotRequest extends TeaModel {
    @NameInMap("Memo")
    public String memo;

    @NameInMap("Operator")
    public DeleteRobotRequestOperator operator;

    @NameInMap("RobotCode")
    public String robotCode;

    public static DeleteRobotRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteRobotRequest self = new DeleteRobotRequest();
        return TeaModel.build(map, self);
    }

    public DeleteRobotRequest setMemo(String memo) {
        this.memo = memo;
        return this;
    }
    public String getMemo() {
        return this.memo;
    }

    public DeleteRobotRequest setOperator(DeleteRobotRequestOperator operator) {
        this.operator = operator;
        return this;
    }
    public DeleteRobotRequestOperator getOperator() {
        return this.operator;
    }

    public DeleteRobotRequest setRobotCode(String robotCode) {
        this.robotCode = robotCode;
        return this;
    }
    public String getRobotCode() {
        return this.robotCode;
    }

    public static class DeleteRobotRequestOperator extends TeaModel {
        @NameInMap("OperatorId")
        public String operatorId;

        @NameInMap("OperatorName")
        public String operatorName;

        public static DeleteRobotRequestOperator build(java.util.Map<String, ?> map) throws Exception {
            DeleteRobotRequestOperator self = new DeleteRobotRequestOperator();
            return TeaModel.build(map, self);
        }

        public DeleteRobotRequestOperator setOperatorId(String operatorId) {
            this.operatorId = operatorId;
            return this;
        }
        public String getOperatorId() {
            return this.operatorId;
        }

        public DeleteRobotRequestOperator setOperatorName(String operatorName) {
            this.operatorName = operatorName;
            return this;
        }
        public String getOperatorName() {
            return this.operatorName;
        }

    }

}
