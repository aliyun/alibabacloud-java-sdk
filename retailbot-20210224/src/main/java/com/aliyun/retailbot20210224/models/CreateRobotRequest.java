// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class CreateRobotRequest extends TeaModel {
    // 操作人信息
    @NameInMap("Operator")
    public CreateRobotRequestOperator operator;

    // 机器人信息
    @NameInMap("RobotDTO")
    public CreateRobotRequestRobotDTO robotDTO;

    public static CreateRobotRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRobotRequest self = new CreateRobotRequest();
        return TeaModel.build(map, self);
    }

    public CreateRobotRequest setOperator(CreateRobotRequestOperator operator) {
        this.operator = operator;
        return this;
    }
    public CreateRobotRequestOperator getOperator() {
        return this.operator;
    }

    public CreateRobotRequest setRobotDTO(CreateRobotRequestRobotDTO robotDTO) {
        this.robotDTO = robotDTO;
        return this;
    }
    public CreateRobotRequestRobotDTO getRobotDTO() {
        return this.robotDTO;
    }

    public static class CreateRobotRequestOperator extends TeaModel {
        // 操作人id
        @NameInMap("OperatorId")
        public String operatorId;

        // 操作人显示名
        @NameInMap("OperatorName")
        public String operatorName;

        public static CreateRobotRequestOperator build(java.util.Map<String, ?> map) throws Exception {
            CreateRobotRequestOperator self = new CreateRobotRequestOperator();
            return TeaModel.build(map, self);
        }

        public CreateRobotRequestOperator setOperatorId(String operatorId) {
            this.operatorId = operatorId;
            return this;
        }
        public String getOperatorId() {
            return this.operatorId;
        }

        public CreateRobotRequestOperator setOperatorName(String operatorName) {
            this.operatorName = operatorName;
            return this;
        }
        public String getOperatorName() {
            return this.operatorName;
        }

    }

    public static class CreateRobotRequestRobotDTO extends TeaModel {
        // 机器人渠道
        @NameInMap("Channel")
        public String channel;

        // 签约到期时间
        @NameInMap("ExpireDate")
        public Long expireDate;

        // sass实例id
        @NameInMap("InstanceId")
        public String instanceId;

        // 机器人类型
        @NameInMap("RobotType")
        public String robotType;

        // 商家id
        @NameInMap("SellerId")
        public String sellerId;

        // 商家nick
        @NameInMap("SellerNick")
        public String sellerNick;

        // 店铺id
        @NameInMap("ShopId")
        public String shopId;

        // 签约时间
        @NameInMap("SignDate")
        public Long signDate;

        public static CreateRobotRequestRobotDTO build(java.util.Map<String, ?> map) throws Exception {
            CreateRobotRequestRobotDTO self = new CreateRobotRequestRobotDTO();
            return TeaModel.build(map, self);
        }

        public CreateRobotRequestRobotDTO setChannel(String channel) {
            this.channel = channel;
            return this;
        }
        public String getChannel() {
            return this.channel;
        }

        public CreateRobotRequestRobotDTO setExpireDate(Long expireDate) {
            this.expireDate = expireDate;
            return this;
        }
        public Long getExpireDate() {
            return this.expireDate;
        }

        public CreateRobotRequestRobotDTO setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public CreateRobotRequestRobotDTO setRobotType(String robotType) {
            this.robotType = robotType;
            return this;
        }
        public String getRobotType() {
            return this.robotType;
        }

        public CreateRobotRequestRobotDTO setSellerId(String sellerId) {
            this.sellerId = sellerId;
            return this;
        }
        public String getSellerId() {
            return this.sellerId;
        }

        public CreateRobotRequestRobotDTO setSellerNick(String sellerNick) {
            this.sellerNick = sellerNick;
            return this;
        }
        public String getSellerNick() {
            return this.sellerNick;
        }

        public CreateRobotRequestRobotDTO setShopId(String shopId) {
            this.shopId = shopId;
            return this;
        }
        public String getShopId() {
            return this.shopId;
        }

        public CreateRobotRequestRobotDTO setSignDate(Long signDate) {
            this.signDate = signDate;
            return this;
        }
        public Long getSignDate() {
            return this.signDate;
        }

    }

}
