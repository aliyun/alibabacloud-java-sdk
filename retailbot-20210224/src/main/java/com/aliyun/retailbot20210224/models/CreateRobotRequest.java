// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class CreateRobotRequest extends TeaModel {
    // 机器人信息
    @NameInMap("RobotDTO")
    public CreateRobotRequestRobotDTO robotDTO;

    public static CreateRobotRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRobotRequest self = new CreateRobotRequest();
        return TeaModel.build(map, self);
    }

    public CreateRobotRequest setRobotDTO(CreateRobotRequestRobotDTO robotDTO) {
        this.robotDTO = robotDTO;
        return this;
    }
    public CreateRobotRequestRobotDTO getRobotDTO() {
        return this.robotDTO;
    }

    public static class CreateRobotRequestRobotDTO extends TeaModel {
        // 机器人类型
        @NameInMap("RobotType")
        public String robotType;

        // 机器人渠道
        @NameInMap("Channel")
        public String channel;

        // 商家id
        @NameInMap("SellerId")
        public String sellerId;

        // 商家nick
        @NameInMap("SellerNick")
        public String sellerNick;

        // 签约时间
        @NameInMap("SignDate")
        public Long signDate;

        // 签约到期时间
        @NameInMap("ExpireDate")
        public Long expireDate;

        public static CreateRobotRequestRobotDTO build(java.util.Map<String, ?> map) throws Exception {
            CreateRobotRequestRobotDTO self = new CreateRobotRequestRobotDTO();
            return TeaModel.build(map, self);
        }

        public CreateRobotRequestRobotDTO setRobotType(String robotType) {
            this.robotType = robotType;
            return this;
        }
        public String getRobotType() {
            return this.robotType;
        }

        public CreateRobotRequestRobotDTO setChannel(String channel) {
            this.channel = channel;
            return this;
        }
        public String getChannel() {
            return this.channel;
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

        public CreateRobotRequestRobotDTO setSignDate(Long signDate) {
            this.signDate = signDate;
            return this;
        }
        public Long getSignDate() {
            return this.signDate;
        }

        public CreateRobotRequestRobotDTO setExpireDate(Long expireDate) {
            this.expireDate = expireDate;
            return this;
        }
        public Long getExpireDate() {
            return this.expireDate;
        }

    }

}
