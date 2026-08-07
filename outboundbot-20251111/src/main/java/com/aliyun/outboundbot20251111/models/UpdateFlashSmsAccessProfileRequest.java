// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20251111.models;

import com.aliyun.tea.*;

public class UpdateFlashSmsAccessProfileRequest extends TeaModel {
    /**
     * <p>接入配置</p>
     */
    @NameInMap("AccessProfile")
    public UpdateFlashSmsAccessProfileRequestAccessProfile accessProfile;

    /**
     * <p>接入配置ID</p>
     * 
     * <strong>example:</strong>
     * <p>4f9a8e2b-6c1d-4a7e-9b3f-2d5c8a1e7b04</p>
     */
    @NameInMap("AccessProfileId")
    public String accessProfileId;

    /**
     * <p>实例ID</p>
     * 
     * <strong>example:</strong>
     * <p>4f9a8e2b-6c1d-4a7e-9b3f-2d5c8a1e7b04</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>供应商ID</p>
     * 
     * <strong>example:</strong>
     * <p>Uincall</p>
     */
    @NameInMap("ProviderId")
    public String providerId;

    public static UpdateFlashSmsAccessProfileRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateFlashSmsAccessProfileRequest self = new UpdateFlashSmsAccessProfileRequest();
        return TeaModel.build(map, self);
    }

    public UpdateFlashSmsAccessProfileRequest setAccessProfile(UpdateFlashSmsAccessProfileRequestAccessProfile accessProfile) {
        this.accessProfile = accessProfile;
        return this;
    }
    public UpdateFlashSmsAccessProfileRequestAccessProfile getAccessProfile() {
        return this.accessProfile;
    }

    public UpdateFlashSmsAccessProfileRequest setAccessProfileId(String accessProfileId) {
        this.accessProfileId = accessProfileId;
        return this;
    }
    public String getAccessProfileId() {
        return this.accessProfileId;
    }

    public UpdateFlashSmsAccessProfileRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateFlashSmsAccessProfileRequest setProviderId(String providerId) {
        this.providerId = providerId;
        return this;
    }
    public String getProviderId() {
        return this.providerId;
    }

    public static class UpdateFlashSmsAccessProfileRequestAccessProfileDySmsAccessProfiles extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>我们联系您，您不在，稍后工作人员会继续联系您，如有打扰，请见谅</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>测试</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>云呼叫中心</p>
         */
        @NameInMap("SignName")
        public String signName;

        /**
         * <strong>example:</strong>
         * <p>SMS_469075249</p>
         */
        @NameInMap("TemplateCode")
        public String templateCode;

        public static UpdateFlashSmsAccessProfileRequestAccessProfileDySmsAccessProfiles build(java.util.Map<String, ?> map) throws Exception {
            UpdateFlashSmsAccessProfileRequestAccessProfileDySmsAccessProfiles self = new UpdateFlashSmsAccessProfileRequestAccessProfileDySmsAccessProfiles();
            return TeaModel.build(map, self);
        }

        public UpdateFlashSmsAccessProfileRequestAccessProfileDySmsAccessProfiles setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateFlashSmsAccessProfileRequestAccessProfileDySmsAccessProfiles setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateFlashSmsAccessProfileRequestAccessProfileDySmsAccessProfiles setSignName(String signName) {
            this.signName = signName;
            return this;
        }
        public String getSignName() {
            return this.signName;
        }

        public UpdateFlashSmsAccessProfileRequestAccessProfileDySmsAccessProfiles setTemplateCode(String templateCode) {
            this.templateCode = templateCode;
            return this;
        }
        public String getTemplateCode() {
            return this.templateCode;
        }

    }

    public static class UpdateFlashSmsAccessProfileRequestAccessProfile extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>6004200267</p>
         */
        @NameInMap("Account")
        public String account;

        /**
         * <strong>example:</strong>
         * <p>TQChVEAabhaNp2AB</p>
         */
        @NameInMap("AesKey")
        public String aesKey;

        /**
         * <strong>example:</strong>
         * <p>N92685567</p>
         */
        @NameInMap("ApiAccount")
        public String apiAccount;

        /**
         * <strong>example:</strong>
         * <p>100235</p>
         */
        @NameInMap("ApiId")
        public String apiId;

        /**
         * <strong>example:</strong>
         * <p>3aRsPrTsDG3OPNq5</p>
         */
        @NameInMap("ApiKey")
        public String apiKey;

        /**
         * <strong>example:</strong>
         * <p>Rp7hyUbtXMef23</p>
         */
        @NameInMap("ApiPassword")
        public String apiPassword;

        /**
         * <strong>example:</strong>
         * <p>300012117547</p>
         */
        @NameInMap("CapAppId")
        public String capAppId;

        @NameInMap("DySmsAccessProfiles")
        public java.util.List<UpdateFlashSmsAccessProfileRequestAccessProfileDySmsAccessProfiles> dySmsAccessProfiles;

        /**
         * <strong>example:</strong>
         * <p>10690101220</p>
         */
        @NameInMap("Extno")
        public String extno;

        /**
         * <strong>example:</strong>
         * <p>Rp7hyUbtXMef23</p>
         */
        @NameInMap("ManagementPassword")
        public String managementPassword;

        /**
         * <strong>example:</strong>
         * <p>chuanglanrobot2</p>
         */
        @NameInMap("ManagementSubUserId")
        public String managementSubUserId;

        /**
         * <strong>example:</strong>
         * <p>chuanglanrobot</p>
         */
        @NameInMap("ManagementUsername")
        public String managementUsername;

        /**
         * <strong>example:</strong>
         * <p>nu2DxxfZtY46</p>
         */
        @NameInMap("Password")
        public String password;

        /**
         * <strong>example:</strong>
         * <p>828ee92ebc8241d3b37d0238dde6345e</p>
         */
        @NameInMap("Pwd")
        public String pwd;

        /**
         * <strong>example:</strong>
         * <p>6004200267_dev</p>
         */
        @NameInMap("User")
        public String user;

        /**
         * <strong>example:</strong>
         * <p>TEST10</p>
         */
        @NameInMap("UserName")
        public String userName;

        public static UpdateFlashSmsAccessProfileRequestAccessProfile build(java.util.Map<String, ?> map) throws Exception {
            UpdateFlashSmsAccessProfileRequestAccessProfile self = new UpdateFlashSmsAccessProfileRequestAccessProfile();
            return TeaModel.build(map, self);
        }

        public UpdateFlashSmsAccessProfileRequestAccessProfile setAccount(String account) {
            this.account = account;
            return this;
        }
        public String getAccount() {
            return this.account;
        }

        public UpdateFlashSmsAccessProfileRequestAccessProfile setAesKey(String aesKey) {
            this.aesKey = aesKey;
            return this;
        }
        public String getAesKey() {
            return this.aesKey;
        }

        public UpdateFlashSmsAccessProfileRequestAccessProfile setApiAccount(String apiAccount) {
            this.apiAccount = apiAccount;
            return this;
        }
        public String getApiAccount() {
            return this.apiAccount;
        }

        public UpdateFlashSmsAccessProfileRequestAccessProfile setApiId(String apiId) {
            this.apiId = apiId;
            return this;
        }
        public String getApiId() {
            return this.apiId;
        }

        public UpdateFlashSmsAccessProfileRequestAccessProfile setApiKey(String apiKey) {
            this.apiKey = apiKey;
            return this;
        }
        public String getApiKey() {
            return this.apiKey;
        }

        public UpdateFlashSmsAccessProfileRequestAccessProfile setApiPassword(String apiPassword) {
            this.apiPassword = apiPassword;
            return this;
        }
        public String getApiPassword() {
            return this.apiPassword;
        }

        public UpdateFlashSmsAccessProfileRequestAccessProfile setCapAppId(String capAppId) {
            this.capAppId = capAppId;
            return this;
        }
        public String getCapAppId() {
            return this.capAppId;
        }

        public UpdateFlashSmsAccessProfileRequestAccessProfile setDySmsAccessProfiles(java.util.List<UpdateFlashSmsAccessProfileRequestAccessProfileDySmsAccessProfiles> dySmsAccessProfiles) {
            this.dySmsAccessProfiles = dySmsAccessProfiles;
            return this;
        }
        public java.util.List<UpdateFlashSmsAccessProfileRequestAccessProfileDySmsAccessProfiles> getDySmsAccessProfiles() {
            return this.dySmsAccessProfiles;
        }

        public UpdateFlashSmsAccessProfileRequestAccessProfile setExtno(String extno) {
            this.extno = extno;
            return this;
        }
        public String getExtno() {
            return this.extno;
        }

        public UpdateFlashSmsAccessProfileRequestAccessProfile setManagementPassword(String managementPassword) {
            this.managementPassword = managementPassword;
            return this;
        }
        public String getManagementPassword() {
            return this.managementPassword;
        }

        public UpdateFlashSmsAccessProfileRequestAccessProfile setManagementSubUserId(String managementSubUserId) {
            this.managementSubUserId = managementSubUserId;
            return this;
        }
        public String getManagementSubUserId() {
            return this.managementSubUserId;
        }

        public UpdateFlashSmsAccessProfileRequestAccessProfile setManagementUsername(String managementUsername) {
            this.managementUsername = managementUsername;
            return this;
        }
        public String getManagementUsername() {
            return this.managementUsername;
        }

        public UpdateFlashSmsAccessProfileRequestAccessProfile setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public UpdateFlashSmsAccessProfileRequestAccessProfile setPwd(String pwd) {
            this.pwd = pwd;
            return this;
        }
        public String getPwd() {
            return this.pwd;
        }

        public UpdateFlashSmsAccessProfileRequestAccessProfile setUser(String user) {
            this.user = user;
            return this;
        }
        public String getUser() {
            return this.user;
        }

        public UpdateFlashSmsAccessProfileRequestAccessProfile setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

}
