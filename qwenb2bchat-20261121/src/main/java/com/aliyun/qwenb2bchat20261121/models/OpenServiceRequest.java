// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qwenb2bchat20261121.models;

import com.aliyun.tea.*;

public class OpenServiceRequest extends TeaModel {
    /**
     * <p>按凭据的业务身份配置提供；固定用户身份或不要求正文用户身份时可省略。若提供，必须是只含 user_info 的对象，不能为 null 或空对象。测试与真实开通请求执行相同身份检查。</p>
     */
    @NameInMap("communication")
    public OpenServiceRequestCommunication communication;

    /**
     * <p>必填 JSON 布尔值，无默认值。false 仅验证接口、鉴权、身份和请求参数，成功返回 TEST_OK，不实际开通。true 发起服务开通；返回 OPENING 时仍在处理中。重复发送 true 仍是开通操作，不是只读状态查询。字符串 true/false 不合法。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("openBenefits")
    public Boolean openBenefits;

    public static OpenServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        OpenServiceRequest self = new OpenServiceRequest();
        return TeaModel.build(map, self);
    }

    public OpenServiceRequest setCommunication(OpenServiceRequestCommunication communication) {
        this.communication = communication;
        return this;
    }
    public OpenServiceRequestCommunication getCommunication() {
        return this.communication;
    }

    public OpenServiceRequest setOpenBenefits(Boolean openBenefits) {
        this.openBenefits = openBenefits;
        return this;
    }
    public Boolean getOpenBenefits() {
        return this.openBenefits;
    }

    public static class OpenServiceRequestCommunicationUserInfo extends TeaModel {
        /**
         * <p>客户应用内的业务用户标识，须符合凭据身份配置。非空，最多 256 个 UTF-16 代码单元，无首尾空白、控制字符或非法 Unicode。不是阿里云 UID、订单号或 SP 实例 ID。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>example-user-001</p>
         */
        @NameInMap("user_id")
        public String userId;

        public static OpenServiceRequestCommunicationUserInfo build(java.util.Map<String, ?> map) throws Exception {
            OpenServiceRequestCommunicationUserInfo self = new OpenServiceRequestCommunicationUserInfo();
            return TeaModel.build(map, self);
        }

        public OpenServiceRequestCommunicationUserInfo setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class OpenServiceRequestCommunication extends TeaModel {
        /**
         * <p>communication 存在时必填的对象，只包含 user_id，不能为 null 或空对象。</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("user_info")
        public OpenServiceRequestCommunicationUserInfo userInfo;

        public static OpenServiceRequestCommunication build(java.util.Map<String, ?> map) throws Exception {
            OpenServiceRequestCommunication self = new OpenServiceRequestCommunication();
            return TeaModel.build(map, self);
        }

        public OpenServiceRequestCommunication setUserInfo(OpenServiceRequestCommunicationUserInfo userInfo) {
            this.userInfo = userInfo;
            return this;
        }
        public OpenServiceRequestCommunicationUserInfo getUserInfo() {
            return this.userInfo;
        }

    }

}
