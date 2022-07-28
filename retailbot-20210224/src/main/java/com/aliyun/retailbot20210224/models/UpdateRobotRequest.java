// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class UpdateRobotRequest extends TeaModel {
    @NameInMap("Operator")
    public UpdateRobotRequestOperator operator;

    @NameInMap("RobotDTO")
    public UpdateRobotRequestRobotDTO robotDTO;

    public static UpdateRobotRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateRobotRequest self = new UpdateRobotRequest();
        return TeaModel.build(map, self);
    }

    public UpdateRobotRequest setOperator(UpdateRobotRequestOperator operator) {
        this.operator = operator;
        return this;
    }
    public UpdateRobotRequestOperator getOperator() {
        return this.operator;
    }

    public UpdateRobotRequest setRobotDTO(UpdateRobotRequestRobotDTO robotDTO) {
        this.robotDTO = robotDTO;
        return this;
    }
    public UpdateRobotRequestRobotDTO getRobotDTO() {
        return this.robotDTO;
    }

    public static class UpdateRobotRequestOperator extends TeaModel {
        @NameInMap("OperatorId")
        public String operatorId;

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

    public static class UpdateRobotRequestRobotDTO extends TeaModel {
        @NameInMap("ExpireDate")
        public Long expireDate;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("RobotCode")
        public String robotCode;

        @NameInMap("SellerId")
        public String sellerId;

        @NameInMap("SellerNick")
        public String sellerNick;

        @NameInMap("ShopId")
        public String shopId;

        @NameInMap("SignDate")
        public Long signDate;

        public static UpdateRobotRequestRobotDTO build(java.util.Map<String, ?> map) throws Exception {
            UpdateRobotRequestRobotDTO self = new UpdateRobotRequestRobotDTO();
            return TeaModel.build(map, self);
        }

        public UpdateRobotRequestRobotDTO setExpireDate(Long expireDate) {
            this.expireDate = expireDate;
            return this;
        }
        public Long getExpireDate() {
            return this.expireDate;
        }

        public UpdateRobotRequestRobotDTO setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public UpdateRobotRequestRobotDTO setRobotCode(String robotCode) {
            this.robotCode = robotCode;
            return this;
        }
        public String getRobotCode() {
            return this.robotCode;
        }

        public UpdateRobotRequestRobotDTO setSellerId(String sellerId) {
            this.sellerId = sellerId;
            return this;
        }
        public String getSellerId() {
            return this.sellerId;
        }

        public UpdateRobotRequestRobotDTO setSellerNick(String sellerNick) {
            this.sellerNick = sellerNick;
            return this;
        }
        public String getSellerNick() {
            return this.sellerNick;
        }

        public UpdateRobotRequestRobotDTO setShopId(String shopId) {
            this.shopId = shopId;
            return this;
        }
        public String getShopId() {
            return this.shopId;
        }

        public UpdateRobotRequestRobotDTO setSignDate(Long signDate) {
            this.signDate = signDate;
            return this;
        }
        public Long getSignDate() {
            return this.signDate;
        }

    }

}
