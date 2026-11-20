// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qwenb2bmed20261116.models;

import com.aliyun.tea.*;

public class OpenServiceRequest extends TeaModel {
    /**
     * <p>The business user identity. It is provided based on the identity configuration bound to the gateway credentials.</p>
     */
    @NameInMap("communication")
    public OpenServiceRequestCommunication communication;

    /**
     * <p>Specifies whether to actually activate the benefits. A value of true initiates the activation process. A value of false only verifies the call and returns TEST_OK.</p>
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
         * <p>The customer business user ID.</p>
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
         * <p>The object that carries the customer business user identifier.</p>
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
