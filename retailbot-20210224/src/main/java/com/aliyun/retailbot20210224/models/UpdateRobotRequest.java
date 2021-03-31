// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class UpdateRobotRequest extends TeaModel {
    // 机器人信息
    @NameInMap("RobotDTO")
    public UpdateRobotRequestRobotDTO robotDTO;

    // 操作人信息
    @NameInMap("Operator")
    public UpdateRobotRequestOperator operator;

    public static UpdateRobotRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateRobotRequest self = new UpdateRobotRequest();
        return TeaModel.build(map, self);
    }

    public UpdateRobotRequest setRobotDTO(UpdateRobotRequestRobotDTO robotDTO) {
        this.robotDTO = robotDTO;
        return this;
    }
    public UpdateRobotRequestRobotDTO getRobotDTO() {
        return this.robotDTO;
    }

    public UpdateRobotRequest setOperator(UpdateRobotRequestOperator operator) {
        this.operator = operator;
        return this;
    }
    public UpdateRobotRequestOperator getOperator() {
        return this.operator;
    }

    public static class UpdateRobotRequestRobotDTO extends TeaModel {
        // 机器人code
        @NameInMap("RobotCode")
        public String robotCode;

        // 商家nick
        @NameInMap("SellerNick")
        public String sellerNick;

        // 签约时间
        @NameInMap("SignDate")
        public Long signDate;

        // 签约到期时间
        @NameInMap("ExpireDate")
        public Long expireDate;

        public static UpdateRobotRequestRobotDTO build(java.util.Map<String, ?> map) throws Exception {
            UpdateRobotRequestRobotDTO self = new UpdateRobotRequestRobotDTO();
            return TeaModel.build(map, self);
        }

        public UpdateRobotRequestRobotDTO setRobotCode(String robotCode) {
            this.robotCode = robotCode;
            return this;
        }
        public String getRobotCode() {
            return this.robotCode;
        }

        public UpdateRobotRequestRobotDTO setSellerNick(String sellerNick) {
            this.sellerNick = sellerNick;
            return this;
        }
        public String getSellerNick() {
            return this.sellerNick;
        }

        public UpdateRobotRequestRobotDTO setSignDate(Long signDate) {
            this.signDate = signDate;
            return this;
        }
        public Long getSignDate() {
            return this.signDate;
        }

        public UpdateRobotRequestRobotDTO setExpireDate(Long expireDate) {
            this.expireDate = expireDate;
            return this;
        }
        public Long getExpireDate() {
            return this.expireDate;
        }

    }

    public static class UpdateRobotRequestOperator extends TeaModel {
        // 操作人id
        @NameInMap("OperatorId")
        public String operatorId;

        // 操作人显示名
        @NameInMap("OperatorName")
        public String operatorName;

        public static UpdateRobotRequestOperator build(java.util.Map<String, ?> map) throws Exception {
            UpdateRobotRequestOperator self = new UpdateRobotRequestOperator();
            return TeaModel.build(map, self);
        }

        public UpdateRobotRequestOperator setOperatorId(String operatorId) {
            this.operatorId = operatorId;
            return this;
        }
        public String getOperatorId() {
            return this.operatorId;
        }

        public UpdateRobotRequestOperator setOperatorName(String operatorName) {
            this.operatorName = operatorName;
            return this;
        }
        public String getOperatorName() {
            return this.operatorName;
        }

    }

}
