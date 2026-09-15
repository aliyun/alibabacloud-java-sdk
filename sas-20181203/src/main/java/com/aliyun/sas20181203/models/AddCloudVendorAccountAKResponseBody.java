// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class AddCloudVendorAccountAKResponseBody extends TeaModel {
    /**
     * <p>The information about the added AK.</p>
     */
    @NameInMap("Data")
    public AddCloudVendorAccountAKResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A60DA4EC-7CD8-577D-AD73-***</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AddCloudVendorAccountAKResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddCloudVendorAccountAKResponseBody self = new AddCloudVendorAccountAKResponseBody();
        return TeaModel.build(map, self);
    }

    public AddCloudVendorAccountAKResponseBody setData(AddCloudVendorAccountAKResponseBodyData data) {
        this.data = data;
        return this;
    }
    public AddCloudVendorAccountAKResponseBodyData getData() {
        return this.data;
    }

    public AddCloudVendorAccountAKResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class AddCloudVendorAccountAKResponseBodyDataAuthModules extends TeaModel {
        /**
         * <p>The module exception information.</p>
         * 
         * <strong>example:</strong>
         * <p>ak_domain_error</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The module code. Valid values:</p>
         * <ul>
         * <li><strong>HOST</strong>: Host</li>
         * <li><strong>CSPM</strong>: Cloud product configuration check</li>
         * <li><strong>SIEM</strong>: CloudSiem</li>
         * <li><strong>TRIAL</strong>: Log audit</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>HOST</p>
         */
        @NameInMap("Module")
        public String module;

        /**
         * <p>The cloud asset description associated with the module.</p>
         * 
         * <strong>example:</strong>
         * <p>Cloud server or virtual machine</p>
         */
        @NameInMap("ModuleAssetType")
        public String moduleAssetType;

        /**
         * <p>The display name of the module.</p>
         * 
         * <strong>example:</strong>
         * <p>Host Assets</p>
         */
        @NameInMap("ModuleDisp")
        public String moduleDisp;

        /**
         * <p>The module status. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: In use.</li>
         * <li><strong>1</strong>: Usage exception.</li>
         * <li><strong>2</strong>: Validity verification in progress.</li>
         * <li><strong>3</strong>: Validity verification timed out.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ModuleServiceStatus")
        public Integer moduleServiceStatus;

        /**
         * <p>The description of permissions associated with the module.</p>
         * 
         * <strong>example:</strong>
         * <p>Read permission of the cloud server or virtual machine</p>
         */
        @NameInMap("ModuleStatement")
        public String moduleStatement;

        public static AddCloudVendorAccountAKResponseBodyDataAuthModules build(java.util.Map<String, ?> map) throws Exception {
            AddCloudVendorAccountAKResponseBodyDataAuthModules self = new AddCloudVendorAccountAKResponseBodyDataAuthModules();
            return TeaModel.build(map, self);
        }

        public AddCloudVendorAccountAKResponseBodyDataAuthModules setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public AddCloudVendorAccountAKResponseBodyDataAuthModules setModule(String module) {
            this.module = module;
            return this;
        }
        public String getModule() {
            return this.module;
        }

        public AddCloudVendorAccountAKResponseBodyDataAuthModules setModuleAssetType(String moduleAssetType) {
            this.moduleAssetType = moduleAssetType;
            return this;
        }
        public String getModuleAssetType() {
            return this.moduleAssetType;
        }

        public AddCloudVendorAccountAKResponseBodyDataAuthModules setModuleDisp(String moduleDisp) {
            this.moduleDisp = moduleDisp;
            return this;
        }
        public String getModuleDisp() {
            return this.moduleDisp;
        }

        public AddCloudVendorAccountAKResponseBodyDataAuthModules setModuleServiceStatus(Integer moduleServiceStatus) {
            this.moduleServiceStatus = moduleServiceStatus;
            return this;
        }
        public Integer getModuleServiceStatus() {
            return this.moduleServiceStatus;
        }

        public AddCloudVendorAccountAKResponseBodyDataAuthModules setModuleStatement(String moduleStatement) {
            this.moduleStatement = moduleStatement;
            return this;
        }
        public String getModuleStatement() {
            return this.moduleStatement;
        }

    }

    public static class AddCloudVendorAccountAKResponseBodyData extends TeaModel {
        /**
         * <p>The AK type. Valid values:</p>
         * <ul>
         * <li><strong>primary</strong>: Primary account.</li>
         * <li><strong>sub</strong>: Sub-account.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>sub</p>
         */
        @NameInMap("AkType")
        public String akType;

        /**
         * <p>The unique ID of the AK.</p>
         * 
         * <strong>example:</strong>
         * <p>2158</p>
         */
        @NameInMap("AuthId")
        public Long authId;

        /**
         * <p>The list of AK-associated modules.</p>
         */
        @NameInMap("AuthModules")
        public java.util.List<AddCloudVendorAccountAKResponseBodyDataAuthModules> authModules;

        /**
         * <p>The account ID.</p>
         * <blockquote>
         * <p>The account ID of the connected cloud vendor.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>azure_demo_1</p>
         */
        @NameInMap("CtdrCloudUserId")
        public String ctdrCloudUserId;

        /**
         * <p>The AK exception information.</p>
         * 
         * <strong>example:</strong>
         * <p>The IAM user is forbidden in the currently selected region</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The AK parameter ID.</p>
         * 
         * <strong>example:</strong>
         * <p>AE6SLd****</p>
         */
        @NameInMap("SecretId")
        public String secretId;

        /**
         * <p>The AK usage status. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: In use.</li>
         * <li><strong>1</strong>: Usage exception.</li>
         * <li><strong>2</strong>: Validity verification in progress.</li>
         * <li><strong>3</strong>: Validity verification timed out.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ServiceStatus")
        public Integer serviceStatus;

        /**
         * <p>The AK status. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: Enabled.</li>
         * <li><strong>1</strong>: Not enabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The cloud asset vendor. Valid values:</p>
         * <ul>
         * <li><strong>Tencent</strong>: Tencent Cloud</li>
         * <li><strong>HUAWEICLOUD</strong>: Huawei Cloud</li>
         * <li><strong>Azure</strong>: Azure</li>
         * <li><strong>AWS</strong>: AWS</li>
         * <li><strong>VOLCENGINE</strong>: Volcengine</li>
         * <li><strong>google</strong>: Google Cloud</li>
         * <li><strong>CHAITIN</strong>: Chaitin Technology</li>
         * <li><strong>FORTINET</strong>: Fortinet</li>
         * <li><strong>THREATBOOK</strong>: ThreatBook</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Tencent</p>
         */
        @NameInMap("Vendor")
        public String vendor;

        /**
         * <p>The AK account name.</p>
         * <blockquote>
         * <p>Used to identify the account to which third-party host assets belong.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("VendorAuthAlias")
        public String vendorAuthAlias;

        public static AddCloudVendorAccountAKResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            AddCloudVendorAccountAKResponseBodyData self = new AddCloudVendorAccountAKResponseBodyData();
            return TeaModel.build(map, self);
        }

        public AddCloudVendorAccountAKResponseBodyData setAkType(String akType) {
            this.akType = akType;
            return this;
        }
        public String getAkType() {
            return this.akType;
        }

        public AddCloudVendorAccountAKResponseBodyData setAuthId(Long authId) {
            this.authId = authId;
            return this;
        }
        public Long getAuthId() {
            return this.authId;
        }

        public AddCloudVendorAccountAKResponseBodyData setAuthModules(java.util.List<AddCloudVendorAccountAKResponseBodyDataAuthModules> authModules) {
            this.authModules = authModules;
            return this;
        }
        public java.util.List<AddCloudVendorAccountAKResponseBodyDataAuthModules> getAuthModules() {
            return this.authModules;
        }

        public AddCloudVendorAccountAKResponseBodyData setCtdrCloudUserId(String ctdrCloudUserId) {
            this.ctdrCloudUserId = ctdrCloudUserId;
            return this;
        }
        public String getCtdrCloudUserId() {
            return this.ctdrCloudUserId;
        }

        public AddCloudVendorAccountAKResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public AddCloudVendorAccountAKResponseBodyData setSecretId(String secretId) {
            this.secretId = secretId;
            return this;
        }
        public String getSecretId() {
            return this.secretId;
        }

        public AddCloudVendorAccountAKResponseBodyData setServiceStatus(Integer serviceStatus) {
            this.serviceStatus = serviceStatus;
            return this;
        }
        public Integer getServiceStatus() {
            return this.serviceStatus;
        }

        public AddCloudVendorAccountAKResponseBodyData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public AddCloudVendorAccountAKResponseBodyData setVendor(String vendor) {
            this.vendor = vendor;
            return this;
        }
        public String getVendor() {
            return this.vendor;
        }

        public AddCloudVendorAccountAKResponseBodyData setVendorAuthAlias(String vendorAuthAlias) {
            this.vendorAuthAlias = vendorAuthAlias;
            return this;
        }
        public String getVendorAuthAlias() {
            return this.vendorAuthAlias;
        }

    }

}
