// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20251111.models;

import com.aliyun.tea.*;

public class CreateFlashSmsAccessProfileRequest extends TeaModel {
    /**
     * <p>The access configuration.</p>
     */
    @NameInMap("AccessProfile")
    public CreateFlashSmsAccessProfileRequestAccessProfile accessProfile;

    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4f9a8e2b-6c1d-4a7e-9b3f-2d5c8a1e7b04</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The provider ID. Valid values:</p>
     * <ul>
     * <li>Uincall: Beijing Youyin Communication Co., Ltd.</li>
     * <li>ChuangLan: Beijing Chuanglan Yunzhi Information Co., Ltd.</li>
     * <li>ChinaMobile: China Mobile.</li>
     * <li>ShangHaiTianNan: Shanghai Tiannan.</li>
     * <li>HeDao: Galaxis.</li>
     * <li>DySms: Alibaba Communication.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Uincall</p>
     */
    @NameInMap("ProviderId")
    public String providerId;

    public static CreateFlashSmsAccessProfileRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateFlashSmsAccessProfileRequest self = new CreateFlashSmsAccessProfileRequest();
        return TeaModel.build(map, self);
    }

    public CreateFlashSmsAccessProfileRequest setAccessProfile(CreateFlashSmsAccessProfileRequestAccessProfile accessProfile) {
        this.accessProfile = accessProfile;
        return this;
    }
    public CreateFlashSmsAccessProfileRequestAccessProfile getAccessProfile() {
        return this.accessProfile;
    }

    public CreateFlashSmsAccessProfileRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateFlashSmsAccessProfileRequest setProviderId(String providerId) {
        this.providerId = providerId;
        return this;
    }
    public String getProviderId() {
        return this.providerId;
    }

    public static class CreateFlashSmsAccessProfileRequestAccessProfileDySmsAccessProfiles extends TeaModel {
        /**
         * <p>The template content.</p>
         * 
         * <strong>example:</strong>
         * <p>We tried to reach you but you were unavailable. Our staff will contact you again shortly. We apologize for any inconvenience</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The template name.</p>
         * 
         * <strong>example:</strong>
         * <p>Test</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The signature name.</p>
         * 
         * <strong>example:</strong>
         * <p>Cloud Call Center</p>
         */
        @NameInMap("SignName")
        public String signName;

        /**
         * <p>The template code.</p>
         * 
         * <strong>example:</strong>
         * <p>SMS_469075249</p>
         */
        @NameInMap("TemplateCode")
        public String templateCode;

        public static CreateFlashSmsAccessProfileRequestAccessProfileDySmsAccessProfiles build(java.util.Map<String, ?> map) throws Exception {
            CreateFlashSmsAccessProfileRequestAccessProfileDySmsAccessProfiles self = new CreateFlashSmsAccessProfileRequestAccessProfileDySmsAccessProfiles();
            return TeaModel.build(map, self);
        }

        public CreateFlashSmsAccessProfileRequestAccessProfileDySmsAccessProfiles setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateFlashSmsAccessProfileRequestAccessProfileDySmsAccessProfiles setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateFlashSmsAccessProfileRequestAccessProfileDySmsAccessProfiles setSignName(String signName) {
            this.signName = signName;
            return this;
        }
        public String getSignName() {
            return this.signName;
        }

        public CreateFlashSmsAccessProfileRequestAccessProfileDySmsAccessProfiles setTemplateCode(String templateCode) {
            this.templateCode = templateCode;
            return this;
        }
        public String getTemplateCode() {
            return this.templateCode;
        }

    }

    public static class CreateFlashSmsAccessProfileRequestAccessProfile extends TeaModel {
        /**
         * <p>Required when ProviderId is set to ShangHaiTianNan or Uincall.</p>
         * 
         * <strong>example:</strong>
         * <p>6004200267</p>
         */
        @NameInMap("Account")
        public String account;

        /**
         * <p>Required when ProviderId is set to ChinaMobile.</p>
         * 
         * <strong>example:</strong>
         * <p>TQChVEAabhaNp2AB</p>
         */
        @NameInMap("AesKey")
        public String aesKey;

        /**
         * <p>Required when ProviderId is set to ChuangLan.</p>
         * 
         * <strong>example:</strong>
         * <p>N92685567</p>
         */
        @NameInMap("ApiAccount")
        public String apiAccount;

        /**
         * <p>Required when ProviderId is set to ChinaMobile.</p>
         * 
         * <strong>example:</strong>
         * <p>100235</p>
         */
        @NameInMap("ApiId")
        public String apiId;

        /**
         * <p>Required when ProviderId is set to ChinaMobile.</p>
         * 
         * <strong>example:</strong>
         * <p>3aRsPrTsDG3OPNq5</p>
         */
        @NameInMap("ApiKey")
        public String apiKey;

        /**
         * <p>Required when ProviderId is set to ChuangLan.</p>
         * 
         * <strong>example:</strong>
         * <p>Rp7hyUbtXMef23</p>
         */
        @NameInMap("ApiPassword")
        public String apiPassword;

        /**
         * <p>Required when ProviderId is set to ChinaMobile.</p>
         * 
         * <strong>example:</strong>
         * <p>300012117547</p>
         */
        @NameInMap("CapAppId")
        public String capAppId;

        /**
         * <p>The list of Alibaba Communication configurations. Required when ProviderId is set to DySms.</p>
         */
        @NameInMap("DySmsAccessProfiles")
        public java.util.List<CreateFlashSmsAccessProfileRequestAccessProfileDySmsAccessProfiles> dySmsAccessProfiles;

        /**
         * <p>Required when ProviderId is set to ShangHaiTianNan.</p>
         * 
         * <strong>example:</strong>
         * <p>10690101220</p>
         */
        @NameInMap("Extno")
        public String extno;

        /**
         * <p>Required when ProviderId is set to ChuangLan.</p>
         * 
         * <strong>example:</strong>
         * <p>Rp7hyUbtXMef23</p>
         */
        @NameInMap("ManagementPassword")
        public String managementPassword;

        /**
         * <p>Required when ProviderId is set to ChuangLan.</p>
         * 
         * <strong>example:</strong>
         * <p>chuanglanrobot2</p>
         */
        @NameInMap("ManagementSubUserId")
        public String managementSubUserId;

        /**
         * <p>Required when ProviderId is set to ChuangLan.</p>
         * 
         * <strong>example:</strong>
         * <p>chuanglanrobot</p>
         */
        @NameInMap("ManagementUsername")
        public String managementUsername;

        /**
         * <p>Required when ProviderId is set to ShangHaiTianNan or HeDao.</p>
         * 
         * <strong>example:</strong>
         * <p>nu2DxxfZtY46</p>
         */
        @NameInMap("Password")
        public String password;

        /**
         * <p>Required when ProviderId is set to Uincall.</p>
         * 
         * <strong>example:</strong>
         * <p>828ee92ebc8241d3b37d0238dde6345e</p>
         */
        @NameInMap("Pwd")
        public String pwd;

        /**
         * <p>Required when ProviderId is set to Uincall.</p>
         * 
         * <strong>example:</strong>
         * <p>6004200267_dev</p>
         */
        @NameInMap("User")
        public String user;

        /**
         * <p>Required when ProviderId is set to HeDao.</p>
         * 
         * <strong>example:</strong>
         * <p>TEST10</p>
         */
        @NameInMap("UserName")
        public String userName;

        public static CreateFlashSmsAccessProfileRequestAccessProfile build(java.util.Map<String, ?> map) throws Exception {
            CreateFlashSmsAccessProfileRequestAccessProfile self = new CreateFlashSmsAccessProfileRequestAccessProfile();
            return TeaModel.build(map, self);
        }

        public CreateFlashSmsAccessProfileRequestAccessProfile setAccount(String account) {
            this.account = account;
            return this;
        }
        public String getAccount() {
            return this.account;
        }

        public CreateFlashSmsAccessProfileRequestAccessProfile setAesKey(String aesKey) {
            this.aesKey = aesKey;
            return this;
        }
        public String getAesKey() {
            return this.aesKey;
        }

        public CreateFlashSmsAccessProfileRequestAccessProfile setApiAccount(String apiAccount) {
            this.apiAccount = apiAccount;
            return this;
        }
        public String getApiAccount() {
            return this.apiAccount;
        }

        public CreateFlashSmsAccessProfileRequestAccessProfile setApiId(String apiId) {
            this.apiId = apiId;
            return this;
        }
        public String getApiId() {
            return this.apiId;
        }

        public CreateFlashSmsAccessProfileRequestAccessProfile setApiKey(String apiKey) {
            this.apiKey = apiKey;
            return this;
        }
        public String getApiKey() {
            return this.apiKey;
        }

        public CreateFlashSmsAccessProfileRequestAccessProfile setApiPassword(String apiPassword) {
            this.apiPassword = apiPassword;
            return this;
        }
        public String getApiPassword() {
            return this.apiPassword;
        }

        public CreateFlashSmsAccessProfileRequestAccessProfile setCapAppId(String capAppId) {
            this.capAppId = capAppId;
            return this;
        }
        public String getCapAppId() {
            return this.capAppId;
        }

        public CreateFlashSmsAccessProfileRequestAccessProfile setDySmsAccessProfiles(java.util.List<CreateFlashSmsAccessProfileRequestAccessProfileDySmsAccessProfiles> dySmsAccessProfiles) {
            this.dySmsAccessProfiles = dySmsAccessProfiles;
            return this;
        }
        public java.util.List<CreateFlashSmsAccessProfileRequestAccessProfileDySmsAccessProfiles> getDySmsAccessProfiles() {
            return this.dySmsAccessProfiles;
        }

        public CreateFlashSmsAccessProfileRequestAccessProfile setExtno(String extno) {
            this.extno = extno;
            return this;
        }
        public String getExtno() {
            return this.extno;
        }

        public CreateFlashSmsAccessProfileRequestAccessProfile setManagementPassword(String managementPassword) {
            this.managementPassword = managementPassword;
            return this;
        }
        public String getManagementPassword() {
            return this.managementPassword;
        }

        public CreateFlashSmsAccessProfileRequestAccessProfile setManagementSubUserId(String managementSubUserId) {
            this.managementSubUserId = managementSubUserId;
            return this;
        }
        public String getManagementSubUserId() {
            return this.managementSubUserId;
        }

        public CreateFlashSmsAccessProfileRequestAccessProfile setManagementUsername(String managementUsername) {
            this.managementUsername = managementUsername;
            return this;
        }
        public String getManagementUsername() {
            return this.managementUsername;
        }

        public CreateFlashSmsAccessProfileRequestAccessProfile setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public CreateFlashSmsAccessProfileRequestAccessProfile setPwd(String pwd) {
            this.pwd = pwd;
            return this;
        }
        public String getPwd() {
            return this.pwd;
        }

        public CreateFlashSmsAccessProfileRequestAccessProfile setUser(String user) {
            this.user = user;
            return this;
        }
        public String getUser() {
            return this.user;
        }

        public CreateFlashSmsAccessProfileRequestAccessProfile setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

}
