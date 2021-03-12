// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class UpdateRobotRequest extends TeaModel {
    // 机器人信息
    @NameInMap("Robot")
    public UpdateRobotRequestRobot robot;

    public static UpdateRobotRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateRobotRequest self = new UpdateRobotRequest();
        return TeaModel.build(map, self);
    }

    public UpdateRobotRequest setRobot(UpdateRobotRequestRobot robot) {
        this.robot = robot;
        return this;
    }
    public UpdateRobotRequestRobot getRobot() {
        return this.robot;
    }

    public static class UpdateRobotRequestRobot extends TeaModel {
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

        public static UpdateRobotRequestRobot build(java.util.Map<String, ?> map) throws Exception {
            UpdateRobotRequestRobot self = new UpdateRobotRequestRobot();
            return TeaModel.build(map, self);
        }

        public UpdateRobotRequestRobot setRobotCode(String robotCode) {
            this.robotCode = robotCode;
            return this;
        }
        public String getRobotCode() {
            return this.robotCode;
        }

        public UpdateRobotRequestRobot setSellerNick(String sellerNick) {
            this.sellerNick = sellerNick;
            return this;
        }
        public String getSellerNick() {
            return this.sellerNick;
        }

        public UpdateRobotRequestRobot setSignDate(Long signDate) {
            this.signDate = signDate;
            return this;
        }
        public Long getSignDate() {
            return this.signDate;
        }

        public UpdateRobotRequestRobot setExpireDate(Long expireDate) {
            this.expireDate = expireDate;
            return this;
        }
        public Long getExpireDate() {
            return this.expireDate;
        }

    }

}
