// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qwenb2bmed20261121.models;

import com.aliyun.tea.*;

public class OpenServiceRequest extends TeaModel {
    /**
     * <p>按接入时约定填写业务用户信息。如果当前业务凭据无需提供用户信息，可省略整个对象。字段名为 user_info 和 user_id。</p>
     */
    @NameInMap("communication")
    public OpenServiceRequestCommunication communication;

    /**
     * <p>必填 JSON 布尔值。false 只验证本次调用，成功返回 TEST_OK；true 提交服务开通申请。</p>
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
         * <p>非空字符串，填写你自己的应用中用于识别该用户的 ID。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>user-001</p>
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
         * <p>业务用户信息对象。提供时必须填写其中的 user_id。</p>
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
