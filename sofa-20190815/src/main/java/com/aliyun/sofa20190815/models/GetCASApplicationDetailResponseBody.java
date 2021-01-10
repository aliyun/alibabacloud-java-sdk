// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetCASApplicationDetailResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Data")
    public GetCASApplicationDetailResponseBodyData data;

    public static GetCASApplicationDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCASApplicationDetailResponseBody self = new GetCASApplicationDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCASApplicationDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetCASApplicationDetailResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetCASApplicationDetailResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetCASApplicationDetailResponseBody setData(GetCASApplicationDetailResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetCASApplicationDetailResponseBodyData getData() {
        return this.data;
    }

    public static class GetCASApplicationDetailResponseBodyDataAppExtraInfos extends TeaModel {
        @NameInMap("AppExtrainfoId")
        public String appExtrainfoId;

        @NameInMap("AppId")
        public String appId;

        @NameInMap("Description")
        public String description;

        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        @NameInMap("TemplateDataId")
        public String templateDataId;

        @NameInMap("TemplateId")
        public String templateId;

        @NameInMap("Type")
        public String type;

        @NameInMap("UtcCreate")
        public String utcCreate;

        @NameInMap("UtcModified")
        public String utcModified;

        @NameInMap("Value")
        public String value;

        public static GetCASApplicationDetailResponseBodyDataAppExtraInfos build(java.util.Map<String, ?> map) throws Exception {
            GetCASApplicationDetailResponseBodyDataAppExtraInfos self = new GetCASApplicationDetailResponseBodyDataAppExtraInfos();
            return TeaModel.build(map, self);
        }

        public GetCASApplicationDetailResponseBodyDataAppExtraInfos setAppExtrainfoId(String appExtrainfoId) {
            this.appExtrainfoId = appExtrainfoId;
            return this;
        }
        public String getAppExtrainfoId() {
            return this.appExtrainfoId;
        }

        public GetCASApplicationDetailResponseBodyDataAppExtraInfos setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public GetCASApplicationDetailResponseBodyDataAppExtraInfos setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetCASApplicationDetailResponseBodyDataAppExtraInfos setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetCASApplicationDetailResponseBodyDataAppExtraInfos setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetCASApplicationDetailResponseBodyDataAppExtraInfos setTemplateDataId(String templateDataId) {
            this.templateDataId = templateDataId;
            return this;
        }
        public String getTemplateDataId() {
            return this.templateDataId;
        }

        public GetCASApplicationDetailResponseBodyDataAppExtraInfos setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public GetCASApplicationDetailResponseBodyDataAppExtraInfos setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetCASApplicationDetailResponseBodyDataAppExtraInfos setUtcCreate(String utcCreate) {
            this.utcCreate = utcCreate;
            return this;
        }
        public String getUtcCreate() {
            return this.utcCreate;
        }

        public GetCASApplicationDetailResponseBodyDataAppExtraInfos setUtcModified(String utcModified) {
            this.utcModified = utcModified;
            return this;
        }
        public String getUtcModified() {
            return this.utcModified;
        }

        public GetCASApplicationDetailResponseBodyDataAppExtraInfos setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetCASApplicationDetailResponseBodyDataAppLevel extends TeaModel {
        @NameInMap("CreatorId")
        public String creatorId;

        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        @NameInMap("TenantId")
        public String tenantId;

        @NameInMap("UtcCreate")
        public String utcCreate;

        @NameInMap("UtcModified")
        public String utcModified;

        public static GetCASApplicationDetailResponseBodyDataAppLevel build(java.util.Map<String, ?> map) throws Exception {
            GetCASApplicationDetailResponseBodyDataAppLevel self = new GetCASApplicationDetailResponseBodyDataAppLevel();
            return TeaModel.build(map, self);
        }

        public GetCASApplicationDetailResponseBodyDataAppLevel setCreatorId(String creatorId) {
            this.creatorId = creatorId;
            return this;
        }
        public String getCreatorId() {
            return this.creatorId;
        }

        public GetCASApplicationDetailResponseBodyDataAppLevel setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetCASApplicationDetailResponseBodyDataAppLevel setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetCASApplicationDetailResponseBodyDataAppLevel setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public GetCASApplicationDetailResponseBodyDataAppLevel setUtcCreate(String utcCreate) {
            this.utcCreate = utcCreate;
            return this;
        }
        public String getUtcCreate() {
            return this.utcCreate;
        }

        public GetCASApplicationDetailResponseBodyDataAppLevel setUtcModified(String utcModified) {
            this.utcModified = utcModified;
            return this;
        }
        public String getUtcModified() {
            return this.utcModified;
        }

    }

    public static class GetCASApplicationDetailResponseBodyDataAppOwnerBackupDevArchitects extends TeaModel {
        @NameInMap("CustomerId")
        public String customerId;

        @NameInMap("Email")
        public String email;

        @NameInMap("EnName")
        public String enName;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Id")
        public String id;

        @NameInMap("ImAccount")
        public String imAccount;

        @NameInMap("LastLogonTime")
        public String lastLogonTime;

        @NameInMap("LoginName")
        public String loginName;

        @NameInMap("Mobile")
        public String mobile;

        @NameInMap("Nation")
        public String nation;

        @NameInMap("NationCountry")
        public String nationCountry;

        @NameInMap("NickName")
        public String nickName;

        @NameInMap("PersonalPhoto")
        public String personalPhoto;

        @NameInMap("Phone")
        public String phone;

        @NameInMap("RealName")
        public String realName;

        @NameInMap("Sex")
        public String sex;

        @NameInMap("SourceSystem")
        public String sourceSystem;

        @NameInMap("SourceUserId")
        public String sourceUserId;

        @NameInMap("Status")
        public String status;

        @NameInMap("Type")
        public String type;

        @NameInMap("WorkNo")
        public String workNo;

        public static GetCASApplicationDetailResponseBodyDataAppOwnerBackupDevArchitects build(java.util.Map<String, ?> map) throws Exception {
            GetCASApplicationDetailResponseBodyDataAppOwnerBackupDevArchitects self = new GetCASApplicationDetailResponseBodyDataAppOwnerBackupDevArchitects();
            return TeaModel.build(map, self);
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerBackupDevArchitects setCustomerId(String customerId) {
            this.customerId = customerId;
            return this;
        }
        public String getCustomerId() {
            return this.customerId;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerBackupDevArchitects setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerBackupDevArchitects setEnName(String enName) {
            this.enName = enName;
            return this;
        }
        public String getEnName() {
            return this.enName;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerBackupDevArchitects setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerBackupDevArchitects setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerBackupDevArchitects setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerBackupDevArchitects setImAccount(String imAccount) {
            this.imAccount = imAccount;
            return this;
        }
        public String getImAccount() {
            return this.imAccount;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerBackupDevArchitects setLastLogonTime(String lastLogonTime) {
            this.lastLogonTime = lastLogonTime;
            return this;
        }
        public String getLastLogonTime() {
            return this.lastLogonTime;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerBackupDevArchitects setLoginName(String loginName) {
            this.loginName = loginName;
            return this;
        }
        public String getLoginName() {
            return this.loginName;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerBackupDevArchitects setMobile(String mobile) {
            this.mobile = mobile;
            return this;
        }
        public String getMobile() {
            return this.mobile;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerBackupDevArchitects setNation(String nation) {
            this.nation = nation;
            return this;
        }
        public String getNation() {
            return this.nation;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerBackupDevArchitects setNationCountry(String nationCountry) {
            this.nationCountry = nationCountry;
            return this;
        }
        public String getNationCountry() {
            return this.nationCountry;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerBackupDevArchitects setNickName(String nickName) {
            this.nickName = nickName;
            return this;
        }
        public String getNickName() {
            return this.nickName;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerBackupDevArchitects setPersonalPhoto(String personalPhoto) {
            this.personalPhoto = personalPhoto;
            return this;
        }
        public String getPersonalPhoto() {
            return this.personalPhoto;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerBackupDevArchitects setPhone(String phone) {
            this.phone = phone;
            return this;
        }
        public String getPhone() {
            return this.phone;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerBackupDevArchitects setRealName(String realName) {
            this.realName = realName;
            return this;
        }
        public String getRealName() {
            return this.realName;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerBackupDevArchitects setSex(String sex) {
            this.sex = sex;
            return this;
        }
        public String getSex() {
            return this.sex;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerBackupDevArchitects setSourceSystem(String sourceSystem) {
            this.sourceSystem = sourceSystem;
            return this;
        }
        public String getSourceSystem() {
            return this.sourceSystem;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerBackupDevArchitects setSourceUserId(String sourceUserId) {
            this.sourceUserId = sourceUserId;
            return this;
        }
        public String getSourceUserId() {
            return this.sourceUserId;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerBackupDevArchitects setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerBackupDevArchitects setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerBackupDevArchitects setWorkNo(String workNo) {
            this.workNo = workNo;
            return this;
        }
        public String getWorkNo() {
            return this.workNo;
        }

    }

    public static class GetCASApplicationDetailResponseBodyDataAppOwnerBackupDevOwners extends TeaModel {
        @NameInMap("CustomerId")
        public String customerId;

        @NameInMap("Email")
        public String email;

        @NameInMap("EnName")
        public String enName;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Id")
        public String id;

        @NameInMap("ImAccount")
        public String imAccount;

        @NameInMap("LastLogonTime")
        public String lastLogonTime;

        @NameInMap("LoginName")
        public String loginName;

        @NameInMap("Mobile")
        public String mobile;

        @NameInMap("Nation")
        public String nation;

        @NameInMap("NationCountry")
        public String nationCountry;

        @NameInMap("NickName")
        public String nickName;

        @NameInMap("PersonalPhoto")
        public String personalPhoto;

        @NameInMap("Phone")
        public String phone;

        @NameInMap("RealName")
        public String realName;

        @NameInMap("Sex")
        public String sex;

        @NameInMap("SourceSystem")
        public String sourceSystem;

        @NameInMap("SourceUserId")
        public String sourceUserId;

        @NameInMap("Status")
        public String status;

        @NameInMap("Type")
        public String type;

        @NameInMap("WorkNo")
        public String workNo;

        public static GetCASApplicationDetailResponseBodyDataAppOwnerBackupDevOwners build(java.util.Map<String, ?> map) throws Exception {
            GetCASApplicationDetailResponseBodyDataAppOwnerBackupDevOwners self = new GetCASApplicationDetailResponseBodyDataAppOwnerBackupDevOwners();
            return TeaModel.build(map, self);
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerBackupDevOwners setCustomerId(String customerId) {
            this.customerId = customerId;
            return this;
        }
        public String getCustomerId() {
            return this.customerId;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerBackupDevOwners setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerBackupDevOwners setEnName(String enName) {
            this.enName = enName;
            return this;
        }
        public String getEnName() {
            return this.enName;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerBackupDevOwners setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerBackupDevOwners setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerBackupDevOwners setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerBackupDevOwners setImAccount(String imAccount) {
            this.imAccount = imAccount;
            return this;
        }
        public String getImAccount() {
            return this.imAccount;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerBackupDevOwners setLastLogonTime(String lastLogonTime) {
            this.lastLogonTime = lastLogonTime;
            return this;
        }
        public String getLastLogonTime() {
            return this.lastLogonTime;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerBackupDevOwners setLoginName(String loginName) {
            this.loginName = loginName;
            return this;
        }
        public String getLoginName() {
            return this.loginName;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerBackupDevOwners setMobile(String mobile) {
            this.mobile = mobile;
            return this;
        }
        public String getMobile() {
            return this.mobile;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerBackupDevOwners setNation(String nation) {
            this.nation = nation;
            return this;
        }
        public String getNation() {
            return this.nation;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerBackupDevOwners setNationCountry(String nationCountry) {
            this.nationCountry = nationCountry;
            return this;
        }
        public String getNationCountry() {
            return this.nationCountry;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerBackupDevOwners setNickName(String nickName) {
            this.nickName = nickName;
            return this;
        }
        public String getNickName() {
            return this.nickName;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerBackupDevOwners setPersonalPhoto(String personalPhoto) {
            this.personalPhoto = personalPhoto;
            return this;
        }
        public String getPersonalPhoto() {
            return this.personalPhoto;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerBackupDevOwners setPhone(String phone) {
            this.phone = phone;
            return this;
        }
        public String getPhone() {
            return this.phone;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerBackupDevOwners setRealName(String realName) {
            this.realName = realName;
            return this;
        }
        public String getRealName() {
            return this.realName;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerBackupDevOwners setSex(String sex) {
            this.sex = sex;
            return this;
        }
        public String getSex() {
            return this.sex;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerBackupDevOwners setSourceSystem(String sourceSystem) {
            this.sourceSystem = sourceSystem;
            return this;
        }
        public String getSourceSystem() {
            return this.sourceSystem;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerBackupDevOwners setSourceUserId(String sourceUserId) {
            this.sourceUserId = sourceUserId;
            return this;
        }
        public String getSourceUserId() {
            return this.sourceUserId;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerBackupDevOwners setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerBackupDevOwners setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerBackupDevOwners setWorkNo(String workNo) {
            this.workNo = workNo;
            return this;
        }
        public String getWorkNo() {
            return this.workNo;
        }

    }

    public static class GetCASApplicationDetailResponseBodyDataAppOwnerBackupOpses extends TeaModel {
        @NameInMap("CustomerId")
        public String customerId;

        @NameInMap("Email")
        public String email;

        @NameInMap("EnName")
        public String enName;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Id")
        public String id;

        @NameInMap("ImAccount")
        public String imAccount;

        @NameInMap("LastLogonTime")
        public String lastLogonTime;

        @NameInMap("LoginName")
        public String loginName;

        @NameInMap("Mobile")
        public String mobile;

        @NameInMap("Nation")
        public String nation;

        @NameInMap("NationCountry")
        public String nationCountry;

        @NameInMap("NickName")
        public String nickName;

        @NameInMap("PersonalPhoto")
        public String personalPhoto;

        @NameInMap("Phone")
        public String phone;

        @NameInMap("RealName")
        public String realName;

        @NameInMap("Sex")
        public String sex;

        @NameInMap("SourceSystem")
        public String sourceSystem;

        @NameInMap("SourceUserId")
        public String sourceUserId;

        @NameInMap("Status")
        public String status;

        @NameInMap("Type")
        public String type;

        @NameInMap("WorkNo")
        public String workNo;

        public static GetCASApplicationDetailResponseBodyDataAppOwnerBackupOpses build(java.util.Map<String, ?> map) throws Exception {
            GetCASApplicationDetailResponseBodyDataAppOwnerBackupOpses self = new GetCASApplicationDetailResponseBodyDataAppOwnerBackupOpses();
            return TeaModel.build(map, self);
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerBackupOpses setCustomerId(String customerId) {
            this.customerId = customerId;
            return this;
        }
        public String getCustomerId() {
            return this.customerId;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerBackupOpses setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerBackupOpses setEnName(String enName) {
            this.enName = enName;
            return this;
        }
        public String getEnName() {
            return this.enName;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerBackupOpses setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerBackupOpses setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerBackupOpses setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerBackupOpses setImAccount(String imAccount) {
            this.imAccount = imAccount;
            return this;
        }
        public String getImAccount() {
            return this.imAccount;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerBackupOpses setLastLogonTime(String lastLogonTime) {
            this.lastLogonTime = lastLogonTime;
            return this;
        }
        public String getLastLogonTime() {
            return this.lastLogonTime;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerBackupOpses setLoginName(String loginName) {
            this.loginName = loginName;
            return this;
        }
        public String getLoginName() {
            return this.loginName;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerBackupOpses setMobile(String mobile) {
            this.mobile = mobile;
            return this;
        }
        public String getMobile() {
            return this.mobile;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerBackupOpses setNation(String nation) {
            this.nation = nation;
            return this;
        }
        public String getNation() {
            return this.nation;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerBackupOpses setNationCountry(String nationCountry) {
            this.nationCountry = nationCountry;
            return this;
        }
        public String getNationCountry() {
            return this.nationCountry;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerBackupOpses setNickName(String nickName) {
            this.nickName = nickName;
            return this;
        }
        public String getNickName() {
            return this.nickName;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerBackupOpses setPersonalPhoto(String personalPhoto) {
            this.personalPhoto = personalPhoto;
            return this;
        }
        public String getPersonalPhoto() {
            return this.personalPhoto;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerBackupOpses setPhone(String phone) {
            this.phone = phone;
            return this;
        }
        public String getPhone() {
            return this.phone;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerBackupOpses setRealName(String realName) {
            this.realName = realName;
            return this;
        }
        public String getRealName() {
            return this.realName;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerBackupOpses setSex(String sex) {
            this.sex = sex;
            return this;
        }
        public String getSex() {
            return this.sex;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerBackupOpses setSourceSystem(String sourceSystem) {
            this.sourceSystem = sourceSystem;
            return this;
        }
        public String getSourceSystem() {
            return this.sourceSystem;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerBackupOpses setSourceUserId(String sourceUserId) {
            this.sourceUserId = sourceUserId;
            return this;
        }
        public String getSourceUserId() {
            return this.sourceUserId;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerBackupOpses setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerBackupOpses setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerBackupOpses setWorkNo(String workNo) {
            this.workNo = workNo;
            return this;
        }
        public String getWorkNo() {
            return this.workNo;
        }

    }

    public static class GetCASApplicationDetailResponseBodyDataAppOwnerBackupTestArchitects extends TeaModel {
        @NameInMap("CustomerId")
        public String customerId;

        @NameInMap("Email")
        public String email;

        @NameInMap("EnName")
        public String enName;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Id")
        public String id;

        @NameInMap("ImAccount")
        public String imAccount;

        @NameInMap("LastLogonTime")
        public String lastLogonTime;

        @NameInMap("LoginName")
        public String loginName;

        @NameInMap("Mobile")
        public String mobile;

        @NameInMap("Nation")
        public String nation;

        @NameInMap("NationCountry")
        public String nationCountry;

        @NameInMap("NickName")
        public String nickName;

        @NameInMap("PersonalPhoto")
        public String personalPhoto;

        @NameInMap("Phone")
        public String phone;

        @NameInMap("RealName")
        public String realName;

        @NameInMap("Sex")
        public String sex;

        @NameInMap("SourceSystem")
        public String sourceSystem;

        @NameInMap("SourceUserId")
        public String sourceUserId;

        @NameInMap("Status")
        public String status;

        @NameInMap("Type")
        public String type;

        @NameInMap("WorkNo")
        public String workNo;

        public static GetCASApplicationDetailResponseBodyDataAppOwnerBackupTestArchitects build(java.util.Map<String, ?> map) throws Exception {
            GetCASApplicationDetailResponseBodyDataAppOwnerBackupTestArchitects self = new GetCASApplicationDetailResponseBodyDataAppOwnerBackupTestArchitects();
            return TeaModel.build(map, self);
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerBackupTestArchitects setCustomerId(String customerId) {
            this.customerId = customerId;
            return this;
        }
        public String getCustomerId() {
            return this.customerId;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerBackupTestArchitects setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerBackupTestArchitects setEnName(String enName) {
            this.enName = enName;
            return this;
        }
        public String getEnName() {
            return this.enName;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerBackupTestArchitects setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerBackupTestArchitects setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerBackupTestArchitects setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerBackupTestArchitects setImAccount(String imAccount) {
            this.imAccount = imAccount;
            return this;
        }
        public String getImAccount() {
            return this.imAccount;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerBackupTestArchitects setLastLogonTime(String lastLogonTime) {
            this.lastLogonTime = lastLogonTime;
            return this;
        }
        public String getLastLogonTime() {
            return this.lastLogonTime;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerBackupTestArchitects setLoginName(String loginName) {
            this.loginName = loginName;
            return this;
        }
        public String getLoginName() {
            return this.loginName;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerBackupTestArchitects setMobile(String mobile) {
            this.mobile = mobile;
            return this;
        }
        public String getMobile() {
            return this.mobile;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerBackupTestArchitects setNation(String nation) {
            this.nation = nation;
            return this;
        }
        public String getNation() {
            return this.nation;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerBackupTestArchitects setNationCountry(String nationCountry) {
            this.nationCountry = nationCountry;
            return this;
        }
        public String getNationCountry() {
            return this.nationCountry;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerBackupTestArchitects setNickName(String nickName) {
            this.nickName = nickName;
            return this;
        }
        public String getNickName() {
            return this.nickName;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerBackupTestArchitects setPersonalPhoto(String personalPhoto) {
            this.personalPhoto = personalPhoto;
            return this;
        }
        public String getPersonalPhoto() {
            return this.personalPhoto;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerBackupTestArchitects setPhone(String phone) {
            this.phone = phone;
            return this;
        }
        public String getPhone() {
            return this.phone;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerBackupTestArchitects setRealName(String realName) {
            this.realName = realName;
            return this;
        }
        public String getRealName() {
            return this.realName;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerBackupTestArchitects setSex(String sex) {
            this.sex = sex;
            return this;
        }
        public String getSex() {
            return this.sex;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerBackupTestArchitects setSourceSystem(String sourceSystem) {
            this.sourceSystem = sourceSystem;
            return this;
        }
        public String getSourceSystem() {
            return this.sourceSystem;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerBackupTestArchitects setSourceUserId(String sourceUserId) {
            this.sourceUserId = sourceUserId;
            return this;
        }
        public String getSourceUserId() {
            return this.sourceUserId;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerBackupTestArchitects setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerBackupTestArchitects setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerBackupTestArchitects setWorkNo(String workNo) {
            this.workNo = workNo;
            return this;
        }
        public String getWorkNo() {
            return this.workNo;
        }

    }

    public static class GetCASApplicationDetailResponseBodyDataAppOwnerBackupTestOwners extends TeaModel {
        @NameInMap("CustomerId")
        public String customerId;

        @NameInMap("Email")
        public String email;

        @NameInMap("EnName")
        public String enName;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Id")
        public String id;

        @NameInMap("ImAccount")
        public String imAccount;

        @NameInMap("LastLogonTime")
        public String lastLogonTime;

        @NameInMap("LoginName")
        public String loginName;

        @NameInMap("Mobile")
        public String mobile;

        @NameInMap("Nation")
        public String nation;

        @NameInMap("NationCountry")
        public String nationCountry;

        @NameInMap("NickName")
        public String nickName;

        @NameInMap("PersonalPhoto")
        public String personalPhoto;

        @NameInMap("Phone")
        public String phone;

        @NameInMap("RealName")
        public String realName;

        @NameInMap("Sex")
        public String sex;

        @NameInMap("SourceSystem")
        public String sourceSystem;

        @NameInMap("SourceUserId")
        public String sourceUserId;

        @NameInMap("Status")
        public String status;

        @NameInMap("Type")
        public String type;

        @NameInMap("WorkNo")
        public String workNo;

        public static GetCASApplicationDetailResponseBodyDataAppOwnerBackupTestOwners build(java.util.Map<String, ?> map) throws Exception {
            GetCASApplicationDetailResponseBodyDataAppOwnerBackupTestOwners self = new GetCASApplicationDetailResponseBodyDataAppOwnerBackupTestOwners();
            return TeaModel.build(map, self);
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerBackupTestOwners setCustomerId(String customerId) {
            this.customerId = customerId;
            return this;
        }
        public String getCustomerId() {
            return this.customerId;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerBackupTestOwners setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerBackupTestOwners setEnName(String enName) {
            this.enName = enName;
            return this;
        }
        public String getEnName() {
            return this.enName;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerBackupTestOwners setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerBackupTestOwners setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerBackupTestOwners setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerBackupTestOwners setImAccount(String imAccount) {
            this.imAccount = imAccount;
            return this;
        }
        public String getImAccount() {
            return this.imAccount;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerBackupTestOwners setLastLogonTime(String lastLogonTime) {
            this.lastLogonTime = lastLogonTime;
            return this;
        }
        public String getLastLogonTime() {
            return this.lastLogonTime;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerBackupTestOwners setLoginName(String loginName) {
            this.loginName = loginName;
            return this;
        }
        public String getLoginName() {
            return this.loginName;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerBackupTestOwners setMobile(String mobile) {
            this.mobile = mobile;
            return this;
        }
        public String getMobile() {
            return this.mobile;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerBackupTestOwners setNation(String nation) {
            this.nation = nation;
            return this;
        }
        public String getNation() {
            return this.nation;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerBackupTestOwners setNationCountry(String nationCountry) {
            this.nationCountry = nationCountry;
            return this;
        }
        public String getNationCountry() {
            return this.nationCountry;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerBackupTestOwners setNickName(String nickName) {
            this.nickName = nickName;
            return this;
        }
        public String getNickName() {
            return this.nickName;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerBackupTestOwners setPersonalPhoto(String personalPhoto) {
            this.personalPhoto = personalPhoto;
            return this;
        }
        public String getPersonalPhoto() {
            return this.personalPhoto;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerBackupTestOwners setPhone(String phone) {
            this.phone = phone;
            return this;
        }
        public String getPhone() {
            return this.phone;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerBackupTestOwners setRealName(String realName) {
            this.realName = realName;
            return this;
        }
        public String getRealName() {
            return this.realName;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerBackupTestOwners setSex(String sex) {
            this.sex = sex;
            return this;
        }
        public String getSex() {
            return this.sex;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerBackupTestOwners setSourceSystem(String sourceSystem) {
            this.sourceSystem = sourceSystem;
            return this;
        }
        public String getSourceSystem() {
            return this.sourceSystem;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerBackupTestOwners setSourceUserId(String sourceUserId) {
            this.sourceUserId = sourceUserId;
            return this;
        }
        public String getSourceUserId() {
            return this.sourceUserId;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerBackupTestOwners setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerBackupTestOwners setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerBackupTestOwners setWorkNo(String workNo) {
            this.workNo = workNo;
            return this;
        }
        public String getWorkNo() {
            return this.workNo;
        }

    }

    public static class GetCASApplicationDetailResponseBodyDataAppOwnerDevArchitect extends TeaModel {
        @NameInMap("CustomerId")
        public String customerId;

        @NameInMap("Email")
        public String email;

        @NameInMap("EnName")
        public String enName;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Id")
        public String id;

        @NameInMap("ImAccount")
        public String imAccount;

        @NameInMap("LastLogonTime")
        public String lastLogonTime;

        @NameInMap("LoginName")
        public String loginName;

        @NameInMap("Mobile")
        public String mobile;

        @NameInMap("Nation")
        public String nation;

        @NameInMap("NationCountry")
        public String nationCountry;

        @NameInMap("NickName")
        public String nickName;

        @NameInMap("PersonalPhoto")
        public String personalPhoto;

        @NameInMap("Phone")
        public String phone;

        @NameInMap("RealName")
        public String realName;

        @NameInMap("Sex")
        public String sex;

        @NameInMap("SourceSystem")
        public String sourceSystem;

        @NameInMap("SourceUserId")
        public String sourceUserId;

        @NameInMap("Status")
        public String status;

        @NameInMap("Type")
        public String type;

        @NameInMap("WorkNo")
        public String workNo;

        public static GetCASApplicationDetailResponseBodyDataAppOwnerDevArchitect build(java.util.Map<String, ?> map) throws Exception {
            GetCASApplicationDetailResponseBodyDataAppOwnerDevArchitect self = new GetCASApplicationDetailResponseBodyDataAppOwnerDevArchitect();
            return TeaModel.build(map, self);
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerDevArchitect setCustomerId(String customerId) {
            this.customerId = customerId;
            return this;
        }
        public String getCustomerId() {
            return this.customerId;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerDevArchitect setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerDevArchitect setEnName(String enName) {
            this.enName = enName;
            return this;
        }
        public String getEnName() {
            return this.enName;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerDevArchitect setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerDevArchitect setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerDevArchitect setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerDevArchitect setImAccount(String imAccount) {
            this.imAccount = imAccount;
            return this;
        }
        public String getImAccount() {
            return this.imAccount;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerDevArchitect setLastLogonTime(String lastLogonTime) {
            this.lastLogonTime = lastLogonTime;
            return this;
        }
        public String getLastLogonTime() {
            return this.lastLogonTime;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerDevArchitect setLoginName(String loginName) {
            this.loginName = loginName;
            return this;
        }
        public String getLoginName() {
            return this.loginName;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerDevArchitect setMobile(String mobile) {
            this.mobile = mobile;
            return this;
        }
        public String getMobile() {
            return this.mobile;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerDevArchitect setNation(String nation) {
            this.nation = nation;
            return this;
        }
        public String getNation() {
            return this.nation;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerDevArchitect setNationCountry(String nationCountry) {
            this.nationCountry = nationCountry;
            return this;
        }
        public String getNationCountry() {
            return this.nationCountry;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerDevArchitect setNickName(String nickName) {
            this.nickName = nickName;
            return this;
        }
        public String getNickName() {
            return this.nickName;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerDevArchitect setPersonalPhoto(String personalPhoto) {
            this.personalPhoto = personalPhoto;
            return this;
        }
        public String getPersonalPhoto() {
            return this.personalPhoto;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerDevArchitect setPhone(String phone) {
            this.phone = phone;
            return this;
        }
        public String getPhone() {
            return this.phone;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerDevArchitect setRealName(String realName) {
            this.realName = realName;
            return this;
        }
        public String getRealName() {
            return this.realName;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerDevArchitect setSex(String sex) {
            this.sex = sex;
            return this;
        }
        public String getSex() {
            return this.sex;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerDevArchitect setSourceSystem(String sourceSystem) {
            this.sourceSystem = sourceSystem;
            return this;
        }
        public String getSourceSystem() {
            return this.sourceSystem;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerDevArchitect setSourceUserId(String sourceUserId) {
            this.sourceUserId = sourceUserId;
            return this;
        }
        public String getSourceUserId() {
            return this.sourceUserId;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerDevArchitect setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerDevArchitect setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerDevArchitect setWorkNo(String workNo) {
            this.workNo = workNo;
            return this;
        }
        public String getWorkNo() {
            return this.workNo;
        }

    }

    public static class GetCASApplicationDetailResponseBodyDataAppOwnerDevOwner extends TeaModel {
        @NameInMap("CustomerId")
        public String customerId;

        @NameInMap("Email")
        public String email;

        @NameInMap("EnName")
        public String enName;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Id")
        public String id;

        @NameInMap("ImAccount")
        public String imAccount;

        @NameInMap("LastLogonTime")
        public String lastLogonTime;

        @NameInMap("LoginName")
        public String loginName;

        @NameInMap("Mobile")
        public String mobile;

        @NameInMap("Nation")
        public String nation;

        @NameInMap("NationCountry")
        public String nationCountry;

        @NameInMap("NickName")
        public String nickName;

        @NameInMap("PersonalPhoto")
        public String personalPhoto;

        @NameInMap("Phone")
        public String phone;

        @NameInMap("RealName")
        public String realName;

        @NameInMap("Sex")
        public String sex;

        @NameInMap("SourceSystem")
        public String sourceSystem;

        @NameInMap("SourceUserId")
        public String sourceUserId;

        @NameInMap("Status")
        public String status;

        @NameInMap("Type")
        public String type;

        @NameInMap("WorkNo")
        public String workNo;

        public static GetCASApplicationDetailResponseBodyDataAppOwnerDevOwner build(java.util.Map<String, ?> map) throws Exception {
            GetCASApplicationDetailResponseBodyDataAppOwnerDevOwner self = new GetCASApplicationDetailResponseBodyDataAppOwnerDevOwner();
            return TeaModel.build(map, self);
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerDevOwner setCustomerId(String customerId) {
            this.customerId = customerId;
            return this;
        }
        public String getCustomerId() {
            return this.customerId;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerDevOwner setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerDevOwner setEnName(String enName) {
            this.enName = enName;
            return this;
        }
        public String getEnName() {
            return this.enName;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerDevOwner setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerDevOwner setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerDevOwner setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerDevOwner setImAccount(String imAccount) {
            this.imAccount = imAccount;
            return this;
        }
        public String getImAccount() {
            return this.imAccount;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerDevOwner setLastLogonTime(String lastLogonTime) {
            this.lastLogonTime = lastLogonTime;
            return this;
        }
        public String getLastLogonTime() {
            return this.lastLogonTime;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerDevOwner setLoginName(String loginName) {
            this.loginName = loginName;
            return this;
        }
        public String getLoginName() {
            return this.loginName;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerDevOwner setMobile(String mobile) {
            this.mobile = mobile;
            return this;
        }
        public String getMobile() {
            return this.mobile;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerDevOwner setNation(String nation) {
            this.nation = nation;
            return this;
        }
        public String getNation() {
            return this.nation;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerDevOwner setNationCountry(String nationCountry) {
            this.nationCountry = nationCountry;
            return this;
        }
        public String getNationCountry() {
            return this.nationCountry;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerDevOwner setNickName(String nickName) {
            this.nickName = nickName;
            return this;
        }
        public String getNickName() {
            return this.nickName;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerDevOwner setPersonalPhoto(String personalPhoto) {
            this.personalPhoto = personalPhoto;
            return this;
        }
        public String getPersonalPhoto() {
            return this.personalPhoto;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerDevOwner setPhone(String phone) {
            this.phone = phone;
            return this;
        }
        public String getPhone() {
            return this.phone;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerDevOwner setRealName(String realName) {
            this.realName = realName;
            return this;
        }
        public String getRealName() {
            return this.realName;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerDevOwner setSex(String sex) {
            this.sex = sex;
            return this;
        }
        public String getSex() {
            return this.sex;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerDevOwner setSourceSystem(String sourceSystem) {
            this.sourceSystem = sourceSystem;
            return this;
        }
        public String getSourceSystem() {
            return this.sourceSystem;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerDevOwner setSourceUserId(String sourceUserId) {
            this.sourceUserId = sourceUserId;
            return this;
        }
        public String getSourceUserId() {
            return this.sourceUserId;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerDevOwner setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerDevOwner setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerDevOwner setWorkNo(String workNo) {
            this.workNo = workNo;
            return this;
        }
        public String getWorkNo() {
            return this.workNo;
        }

    }

    public static class GetCASApplicationDetailResponseBodyDataAppOwnerOps extends TeaModel {
        @NameInMap("CustomerId")
        public String customerId;

        @NameInMap("Email")
        public String email;

        @NameInMap("EnName")
        public String enName;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Id")
        public String id;

        @NameInMap("ImAccount")
        public String imAccount;

        @NameInMap("LastLogonTime")
        public String lastLogonTime;

        @NameInMap("LoginName")
        public String loginName;

        @NameInMap("Mobile")
        public String mobile;

        @NameInMap("Nation")
        public String nation;

        @NameInMap("NationCountry")
        public String nationCountry;

        @NameInMap("NickName")
        public String nickName;

        @NameInMap("PersonalPhoto")
        public String personalPhoto;

        @NameInMap("Phone")
        public String phone;

        @NameInMap("RealName")
        public String realName;

        @NameInMap("Sex")
        public String sex;

        @NameInMap("SourceSystem")
        public String sourceSystem;

        @NameInMap("SourceUserId")
        public String sourceUserId;

        @NameInMap("Status")
        public String status;

        @NameInMap("Type")
        public String type;

        @NameInMap("WorkNo")
        public String workNo;

        public static GetCASApplicationDetailResponseBodyDataAppOwnerOps build(java.util.Map<String, ?> map) throws Exception {
            GetCASApplicationDetailResponseBodyDataAppOwnerOps self = new GetCASApplicationDetailResponseBodyDataAppOwnerOps();
            return TeaModel.build(map, self);
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerOps setCustomerId(String customerId) {
            this.customerId = customerId;
            return this;
        }
        public String getCustomerId() {
            return this.customerId;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerOps setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerOps setEnName(String enName) {
            this.enName = enName;
            return this;
        }
        public String getEnName() {
            return this.enName;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerOps setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerOps setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerOps setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerOps setImAccount(String imAccount) {
            this.imAccount = imAccount;
            return this;
        }
        public String getImAccount() {
            return this.imAccount;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerOps setLastLogonTime(String lastLogonTime) {
            this.lastLogonTime = lastLogonTime;
            return this;
        }
        public String getLastLogonTime() {
            return this.lastLogonTime;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerOps setLoginName(String loginName) {
            this.loginName = loginName;
            return this;
        }
        public String getLoginName() {
            return this.loginName;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerOps setMobile(String mobile) {
            this.mobile = mobile;
            return this;
        }
        public String getMobile() {
            return this.mobile;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerOps setNation(String nation) {
            this.nation = nation;
            return this;
        }
        public String getNation() {
            return this.nation;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerOps setNationCountry(String nationCountry) {
            this.nationCountry = nationCountry;
            return this;
        }
        public String getNationCountry() {
            return this.nationCountry;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerOps setNickName(String nickName) {
            this.nickName = nickName;
            return this;
        }
        public String getNickName() {
            return this.nickName;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerOps setPersonalPhoto(String personalPhoto) {
            this.personalPhoto = personalPhoto;
            return this;
        }
        public String getPersonalPhoto() {
            return this.personalPhoto;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerOps setPhone(String phone) {
            this.phone = phone;
            return this;
        }
        public String getPhone() {
            return this.phone;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerOps setRealName(String realName) {
            this.realName = realName;
            return this;
        }
        public String getRealName() {
            return this.realName;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerOps setSex(String sex) {
            this.sex = sex;
            return this;
        }
        public String getSex() {
            return this.sex;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerOps setSourceSystem(String sourceSystem) {
            this.sourceSystem = sourceSystem;
            return this;
        }
        public String getSourceSystem() {
            return this.sourceSystem;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerOps setSourceUserId(String sourceUserId) {
            this.sourceUserId = sourceUserId;
            return this;
        }
        public String getSourceUserId() {
            return this.sourceUserId;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerOps setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerOps setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerOps setWorkNo(String workNo) {
            this.workNo = workNo;
            return this;
        }
        public String getWorkNo() {
            return this.workNo;
        }

    }

    public static class GetCASApplicationDetailResponseBodyDataAppOwnerTestArchitect extends TeaModel {
        @NameInMap("CustomerId")
        public String customerId;

        @NameInMap("Email")
        public String email;

        @NameInMap("EnName")
        public String enName;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Id")
        public String id;

        @NameInMap("ImAccount")
        public String imAccount;

        @NameInMap("LastLogonTime")
        public String lastLogonTime;

        @NameInMap("LoginName")
        public String loginName;

        @NameInMap("Mobile")
        public String mobile;

        @NameInMap("Nation")
        public String nation;

        @NameInMap("NationCountry")
        public String nationCountry;

        @NameInMap("NickName")
        public String nickName;

        @NameInMap("PersonalPhoto")
        public String personalPhoto;

        @NameInMap("Phone")
        public String phone;

        @NameInMap("RealName")
        public String realName;

        @NameInMap("Sex")
        public String sex;

        @NameInMap("SourceSystem")
        public String sourceSystem;

        @NameInMap("SourceUserId")
        public String sourceUserId;

        @NameInMap("Status")
        public String status;

        @NameInMap("Type")
        public String type;

        @NameInMap("WorkNo")
        public String workNo;

        public static GetCASApplicationDetailResponseBodyDataAppOwnerTestArchitect build(java.util.Map<String, ?> map) throws Exception {
            GetCASApplicationDetailResponseBodyDataAppOwnerTestArchitect self = new GetCASApplicationDetailResponseBodyDataAppOwnerTestArchitect();
            return TeaModel.build(map, self);
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerTestArchitect setCustomerId(String customerId) {
            this.customerId = customerId;
            return this;
        }
        public String getCustomerId() {
            return this.customerId;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerTestArchitect setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerTestArchitect setEnName(String enName) {
            this.enName = enName;
            return this;
        }
        public String getEnName() {
            return this.enName;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerTestArchitect setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerTestArchitect setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerTestArchitect setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerTestArchitect setImAccount(String imAccount) {
            this.imAccount = imAccount;
            return this;
        }
        public String getImAccount() {
            return this.imAccount;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerTestArchitect setLastLogonTime(String lastLogonTime) {
            this.lastLogonTime = lastLogonTime;
            return this;
        }
        public String getLastLogonTime() {
            return this.lastLogonTime;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerTestArchitect setLoginName(String loginName) {
            this.loginName = loginName;
            return this;
        }
        public String getLoginName() {
            return this.loginName;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerTestArchitect setMobile(String mobile) {
            this.mobile = mobile;
            return this;
        }
        public String getMobile() {
            return this.mobile;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerTestArchitect setNation(String nation) {
            this.nation = nation;
            return this;
        }
        public String getNation() {
            return this.nation;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerTestArchitect setNationCountry(String nationCountry) {
            this.nationCountry = nationCountry;
            return this;
        }
        public String getNationCountry() {
            return this.nationCountry;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerTestArchitect setNickName(String nickName) {
            this.nickName = nickName;
            return this;
        }
        public String getNickName() {
            return this.nickName;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerTestArchitect setPersonalPhoto(String personalPhoto) {
            this.personalPhoto = personalPhoto;
            return this;
        }
        public String getPersonalPhoto() {
            return this.personalPhoto;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerTestArchitect setPhone(String phone) {
            this.phone = phone;
            return this;
        }
        public String getPhone() {
            return this.phone;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerTestArchitect setRealName(String realName) {
            this.realName = realName;
            return this;
        }
        public String getRealName() {
            return this.realName;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerTestArchitect setSex(String sex) {
            this.sex = sex;
            return this;
        }
        public String getSex() {
            return this.sex;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerTestArchitect setSourceSystem(String sourceSystem) {
            this.sourceSystem = sourceSystem;
            return this;
        }
        public String getSourceSystem() {
            return this.sourceSystem;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerTestArchitect setSourceUserId(String sourceUserId) {
            this.sourceUserId = sourceUserId;
            return this;
        }
        public String getSourceUserId() {
            return this.sourceUserId;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerTestArchitect setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerTestArchitect setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerTestArchitect setWorkNo(String workNo) {
            this.workNo = workNo;
            return this;
        }
        public String getWorkNo() {
            return this.workNo;
        }

    }

    public static class GetCASApplicationDetailResponseBodyDataAppOwnerTestOwner extends TeaModel {
        @NameInMap("CustomerId")
        public String customerId;

        @NameInMap("Email")
        public String email;

        @NameInMap("EnName")
        public String enName;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Id")
        public String id;

        @NameInMap("ImAccount")
        public String imAccount;

        @NameInMap("LastLogonTime")
        public String lastLogonTime;

        @NameInMap("LoginName")
        public String loginName;

        @NameInMap("Mobile")
        public String mobile;

        @NameInMap("Nation")
        public String nation;

        @NameInMap("NationCountry")
        public String nationCountry;

        @NameInMap("NickName")
        public String nickName;

        @NameInMap("PersonalPhoto")
        public String personalPhoto;

        @NameInMap("Phone")
        public String phone;

        @NameInMap("RealName")
        public String realName;

        @NameInMap("Sex")
        public String sex;

        @NameInMap("SourceSystem")
        public String sourceSystem;

        @NameInMap("SourceUserId")
        public String sourceUserId;

        @NameInMap("Status")
        public String status;

        @NameInMap("Type")
        public String type;

        @NameInMap("WorkNo")
        public String workNo;

        public static GetCASApplicationDetailResponseBodyDataAppOwnerTestOwner build(java.util.Map<String, ?> map) throws Exception {
            GetCASApplicationDetailResponseBodyDataAppOwnerTestOwner self = new GetCASApplicationDetailResponseBodyDataAppOwnerTestOwner();
            return TeaModel.build(map, self);
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerTestOwner setCustomerId(String customerId) {
            this.customerId = customerId;
            return this;
        }
        public String getCustomerId() {
            return this.customerId;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerTestOwner setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerTestOwner setEnName(String enName) {
            this.enName = enName;
            return this;
        }
        public String getEnName() {
            return this.enName;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerTestOwner setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerTestOwner setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerTestOwner setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerTestOwner setImAccount(String imAccount) {
            this.imAccount = imAccount;
            return this;
        }
        public String getImAccount() {
            return this.imAccount;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerTestOwner setLastLogonTime(String lastLogonTime) {
            this.lastLogonTime = lastLogonTime;
            return this;
        }
        public String getLastLogonTime() {
            return this.lastLogonTime;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerTestOwner setLoginName(String loginName) {
            this.loginName = loginName;
            return this;
        }
        public String getLoginName() {
            return this.loginName;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerTestOwner setMobile(String mobile) {
            this.mobile = mobile;
            return this;
        }
        public String getMobile() {
            return this.mobile;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerTestOwner setNation(String nation) {
            this.nation = nation;
            return this;
        }
        public String getNation() {
            return this.nation;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerTestOwner setNationCountry(String nationCountry) {
            this.nationCountry = nationCountry;
            return this;
        }
        public String getNationCountry() {
            return this.nationCountry;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerTestOwner setNickName(String nickName) {
            this.nickName = nickName;
            return this;
        }
        public String getNickName() {
            return this.nickName;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerTestOwner setPersonalPhoto(String personalPhoto) {
            this.personalPhoto = personalPhoto;
            return this;
        }
        public String getPersonalPhoto() {
            return this.personalPhoto;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerTestOwner setPhone(String phone) {
            this.phone = phone;
            return this;
        }
        public String getPhone() {
            return this.phone;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerTestOwner setRealName(String realName) {
            this.realName = realName;
            return this;
        }
        public String getRealName() {
            return this.realName;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerTestOwner setSex(String sex) {
            this.sex = sex;
            return this;
        }
        public String getSex() {
            return this.sex;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerTestOwner setSourceSystem(String sourceSystem) {
            this.sourceSystem = sourceSystem;
            return this;
        }
        public String getSourceSystem() {
            return this.sourceSystem;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerTestOwner setSourceUserId(String sourceUserId) {
            this.sourceUserId = sourceUserId;
            return this;
        }
        public String getSourceUserId() {
            return this.sourceUserId;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerTestOwner setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerTestOwner setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwnerTestOwner setWorkNo(String workNo) {
            this.workNo = workNo;
            return this;
        }
        public String getWorkNo() {
            return this.workNo;
        }

    }

    public static class GetCASApplicationDetailResponseBodyDataAppOwner extends TeaModel {
        @NameInMap("BackupDevArchitects")
        public java.util.List<GetCASApplicationDetailResponseBodyDataAppOwnerBackupDevArchitects> backupDevArchitects;

        @NameInMap("BackupDevOwners")
        public java.util.List<GetCASApplicationDetailResponseBodyDataAppOwnerBackupDevOwners> backupDevOwners;

        @NameInMap("BackupOpses")
        public java.util.List<GetCASApplicationDetailResponseBodyDataAppOwnerBackupOpses> backupOpses;

        @NameInMap("BackupTestArchitects")
        public java.util.List<GetCASApplicationDetailResponseBodyDataAppOwnerBackupTestArchitects> backupTestArchitects;

        @NameInMap("BackupTestOwners")
        public java.util.List<GetCASApplicationDetailResponseBodyDataAppOwnerBackupTestOwners> backupTestOwners;

        @NameInMap("DevArchitect")
        public GetCASApplicationDetailResponseBodyDataAppOwnerDevArchitect devArchitect;

        @NameInMap("DevOwner")
        public GetCASApplicationDetailResponseBodyDataAppOwnerDevOwner devOwner;

        @NameInMap("Ops")
        public GetCASApplicationDetailResponseBodyDataAppOwnerOps ops;

        @NameInMap("TestArchitect")
        public GetCASApplicationDetailResponseBodyDataAppOwnerTestArchitect testArchitect;

        @NameInMap("TestOwner")
        public GetCASApplicationDetailResponseBodyDataAppOwnerTestOwner testOwner;

        public static GetCASApplicationDetailResponseBodyDataAppOwner build(java.util.Map<String, ?> map) throws Exception {
            GetCASApplicationDetailResponseBodyDataAppOwner self = new GetCASApplicationDetailResponseBodyDataAppOwner();
            return TeaModel.build(map, self);
        }

        public GetCASApplicationDetailResponseBodyDataAppOwner setBackupDevArchitects(java.util.List<GetCASApplicationDetailResponseBodyDataAppOwnerBackupDevArchitects> backupDevArchitects) {
            this.backupDevArchitects = backupDevArchitects;
            return this;
        }
        public java.util.List<GetCASApplicationDetailResponseBodyDataAppOwnerBackupDevArchitects> getBackupDevArchitects() {
            return this.backupDevArchitects;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwner setBackupDevOwners(java.util.List<GetCASApplicationDetailResponseBodyDataAppOwnerBackupDevOwners> backupDevOwners) {
            this.backupDevOwners = backupDevOwners;
            return this;
        }
        public java.util.List<GetCASApplicationDetailResponseBodyDataAppOwnerBackupDevOwners> getBackupDevOwners() {
            return this.backupDevOwners;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwner setBackupOpses(java.util.List<GetCASApplicationDetailResponseBodyDataAppOwnerBackupOpses> backupOpses) {
            this.backupOpses = backupOpses;
            return this;
        }
        public java.util.List<GetCASApplicationDetailResponseBodyDataAppOwnerBackupOpses> getBackupOpses() {
            return this.backupOpses;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwner setBackupTestArchitects(java.util.List<GetCASApplicationDetailResponseBodyDataAppOwnerBackupTestArchitects> backupTestArchitects) {
            this.backupTestArchitects = backupTestArchitects;
            return this;
        }
        public java.util.List<GetCASApplicationDetailResponseBodyDataAppOwnerBackupTestArchitects> getBackupTestArchitects() {
            return this.backupTestArchitects;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwner setBackupTestOwners(java.util.List<GetCASApplicationDetailResponseBodyDataAppOwnerBackupTestOwners> backupTestOwners) {
            this.backupTestOwners = backupTestOwners;
            return this;
        }
        public java.util.List<GetCASApplicationDetailResponseBodyDataAppOwnerBackupTestOwners> getBackupTestOwners() {
            return this.backupTestOwners;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwner setDevArchitect(GetCASApplicationDetailResponseBodyDataAppOwnerDevArchitect devArchitect) {
            this.devArchitect = devArchitect;
            return this;
        }
        public GetCASApplicationDetailResponseBodyDataAppOwnerDevArchitect getDevArchitect() {
            return this.devArchitect;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwner setDevOwner(GetCASApplicationDetailResponseBodyDataAppOwnerDevOwner devOwner) {
            this.devOwner = devOwner;
            return this;
        }
        public GetCASApplicationDetailResponseBodyDataAppOwnerDevOwner getDevOwner() {
            return this.devOwner;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwner setOps(GetCASApplicationDetailResponseBodyDataAppOwnerOps ops) {
            this.ops = ops;
            return this;
        }
        public GetCASApplicationDetailResponseBodyDataAppOwnerOps getOps() {
            return this.ops;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwner setTestArchitect(GetCASApplicationDetailResponseBodyDataAppOwnerTestArchitect testArchitect) {
            this.testArchitect = testArchitect;
            return this;
        }
        public GetCASApplicationDetailResponseBodyDataAppOwnerTestArchitect getTestArchitect() {
            return this.testArchitect;
        }

        public GetCASApplicationDetailResponseBodyDataAppOwner setTestOwner(GetCASApplicationDetailResponseBodyDataAppOwnerTestOwner testOwner) {
            this.testOwner = testOwner;
            return this;
        }
        public GetCASApplicationDetailResponseBodyDataAppOwnerTestOwner getTestOwner() {
            return this.testOwner;
        }

    }

    public static class GetCASApplicationDetailResponseBodyDataArchetype extends TeaModel {
        @NameInMap("ArtifactId")
        public String artifactId;

        @NameInMap("CodePackage")
        public String codePackage;

        @NameInMap("Encoding")
        public String encoding;

        @NameInMap("GenerateCode")
        public Boolean generateCode;

        @NameInMap("GroupId")
        public String groupId;

        @NameInMap("MetaData")
        public String metaData;

        @NameInMap("ProjectType")
        public String projectType;

        @NameInMap("UsePrivateRepo")
        public Boolean usePrivateRepo;

        @NameInMap("Version")
        public String version;

        public static GetCASApplicationDetailResponseBodyDataArchetype build(java.util.Map<String, ?> map) throws Exception {
            GetCASApplicationDetailResponseBodyDataArchetype self = new GetCASApplicationDetailResponseBodyDataArchetype();
            return TeaModel.build(map, self);
        }

        public GetCASApplicationDetailResponseBodyDataArchetype setArtifactId(String artifactId) {
            this.artifactId = artifactId;
            return this;
        }
        public String getArtifactId() {
            return this.artifactId;
        }

        public GetCASApplicationDetailResponseBodyDataArchetype setCodePackage(String codePackage) {
            this.codePackage = codePackage;
            return this;
        }
        public String getCodePackage() {
            return this.codePackage;
        }

        public GetCASApplicationDetailResponseBodyDataArchetype setEncoding(String encoding) {
            this.encoding = encoding;
            return this;
        }
        public String getEncoding() {
            return this.encoding;
        }

        public GetCASApplicationDetailResponseBodyDataArchetype setGenerateCode(Boolean generateCode) {
            this.generateCode = generateCode;
            return this;
        }
        public Boolean getGenerateCode() {
            return this.generateCode;
        }

        public GetCASApplicationDetailResponseBodyDataArchetype setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public GetCASApplicationDetailResponseBodyDataArchetype setMetaData(String metaData) {
            this.metaData = metaData;
            return this;
        }
        public String getMetaData() {
            return this.metaData;
        }

        public GetCASApplicationDetailResponseBodyDataArchetype setProjectType(String projectType) {
            this.projectType = projectType;
            return this;
        }
        public String getProjectType() {
            return this.projectType;
        }

        public GetCASApplicationDetailResponseBodyDataArchetype setUsePrivateRepo(Boolean usePrivateRepo) {
            this.usePrivateRepo = usePrivateRepo;
            return this;
        }
        public Boolean getUsePrivateRepo() {
            return this.usePrivateRepo;
        }

        public GetCASApplicationDetailResponseBodyDataArchetype setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class GetCASApplicationDetailResponseBodyDataCodeRepository extends TeaModel {
        @NameInMap("ExtraParams")
        public String extraParams;

        @NameInMap("GroupName")
        public String groupName;

        @NameInMap("Id")
        public String id;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("IsInitStandardPath")
        public Boolean isInitStandardPath;

        @NameInMap("Name")
        public String name;

        @NameInMap("Owner")
        public String owner;

        @NameInMap("ParentReposName")
        public String parentReposName;

        @NameInMap("RemoteRepoId")
        public String remoteRepoId;

        @NameInMap("RepoReuse")
        public String repoReuse;

        @NameInMap("SourceLocation")
        public String sourceLocation;

        @NameInMap("Status")
        public String status;

        @NameInMap("Type")
        public String type;

        @NameInMap("UseExist")
        public Boolean useExist;

        public static GetCASApplicationDetailResponseBodyDataCodeRepository build(java.util.Map<String, ?> map) throws Exception {
            GetCASApplicationDetailResponseBodyDataCodeRepository self = new GetCASApplicationDetailResponseBodyDataCodeRepository();
            return TeaModel.build(map, self);
        }

        public GetCASApplicationDetailResponseBodyDataCodeRepository setExtraParams(String extraParams) {
            this.extraParams = extraParams;
            return this;
        }
        public String getExtraParams() {
            return this.extraParams;
        }

        public GetCASApplicationDetailResponseBodyDataCodeRepository setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public GetCASApplicationDetailResponseBodyDataCodeRepository setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetCASApplicationDetailResponseBodyDataCodeRepository setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetCASApplicationDetailResponseBodyDataCodeRepository setIsInitStandardPath(Boolean isInitStandardPath) {
            this.isInitStandardPath = isInitStandardPath;
            return this;
        }
        public Boolean getIsInitStandardPath() {
            return this.isInitStandardPath;
        }

        public GetCASApplicationDetailResponseBodyDataCodeRepository setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetCASApplicationDetailResponseBodyDataCodeRepository setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public GetCASApplicationDetailResponseBodyDataCodeRepository setParentReposName(String parentReposName) {
            this.parentReposName = parentReposName;
            return this;
        }
        public String getParentReposName() {
            return this.parentReposName;
        }

        public GetCASApplicationDetailResponseBodyDataCodeRepository setRemoteRepoId(String remoteRepoId) {
            this.remoteRepoId = remoteRepoId;
            return this;
        }
        public String getRemoteRepoId() {
            return this.remoteRepoId;
        }

        public GetCASApplicationDetailResponseBodyDataCodeRepository setRepoReuse(String repoReuse) {
            this.repoReuse = repoReuse;
            return this;
        }
        public String getRepoReuse() {
            return this.repoReuse;
        }

        public GetCASApplicationDetailResponseBodyDataCodeRepository setSourceLocation(String sourceLocation) {
            this.sourceLocation = sourceLocation;
            return this;
        }
        public String getSourceLocation() {
            return this.sourceLocation;
        }

        public GetCASApplicationDetailResponseBodyDataCodeRepository setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetCASApplicationDetailResponseBodyDataCodeRepository setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetCASApplicationDetailResponseBodyDataCodeRepository setUseExist(Boolean useExist) {
            this.useExist = useExist;
            return this;
        }
        public Boolean getUseExist() {
            return this.useExist;
        }

    }

    public static class GetCASApplicationDetailResponseBodyDataLifeCycle extends TeaModel {
        @NameInMap("AppId")
        public String appId;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Id")
        public String id;

        @NameInMap("LastDeployTime")
        public String lastDeployTime;

        @NameInMap("LastDeployVersion")
        public String lastDeployVersion;

        @NameInMap("LastOpsorderId")
        public String lastOpsorderId;

        @NameInMap("OnlineTime")
        public String onlineTime;

        @NameInMap("State")
        public String state;

        @NameInMap("WorkspaceId")
        public String workspaceId;

        public static GetCASApplicationDetailResponseBodyDataLifeCycle build(java.util.Map<String, ?> map) throws Exception {
            GetCASApplicationDetailResponseBodyDataLifeCycle self = new GetCASApplicationDetailResponseBodyDataLifeCycle();
            return TeaModel.build(map, self);
        }

        public GetCASApplicationDetailResponseBodyDataLifeCycle setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public GetCASApplicationDetailResponseBodyDataLifeCycle setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetCASApplicationDetailResponseBodyDataLifeCycle setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetCASApplicationDetailResponseBodyDataLifeCycle setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetCASApplicationDetailResponseBodyDataLifeCycle setLastDeployTime(String lastDeployTime) {
            this.lastDeployTime = lastDeployTime;
            return this;
        }
        public String getLastDeployTime() {
            return this.lastDeployTime;
        }

        public GetCASApplicationDetailResponseBodyDataLifeCycle setLastDeployVersion(String lastDeployVersion) {
            this.lastDeployVersion = lastDeployVersion;
            return this;
        }
        public String getLastDeployVersion() {
            return this.lastDeployVersion;
        }

        public GetCASApplicationDetailResponseBodyDataLifeCycle setLastOpsorderId(String lastOpsorderId) {
            this.lastOpsorderId = lastOpsorderId;
            return this;
        }
        public String getLastOpsorderId() {
            return this.lastOpsorderId;
        }

        public GetCASApplicationDetailResponseBodyDataLifeCycle setOnlineTime(String onlineTime) {
            this.onlineTime = onlineTime;
            return this;
        }
        public String getOnlineTime() {
            return this.onlineTime;
        }

        public GetCASApplicationDetailResponseBodyDataLifeCycle setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public GetCASApplicationDetailResponseBodyDataLifeCycle setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

    public static class GetCASApplicationDetailResponseBodyData extends TeaModel {
        @NameInMap("AppDomainId")
        public String appDomainId;

        @NameInMap("AppDomainName")
        public String appDomainName;

        @NameInMap("AppLevelName")
        public String appLevelName;

        @NameInMap("BuildpackVersion")
        public String buildpackVersion;

        @NameInMap("ChineseName")
        public String chineseName;

        @NameInMap("ContainerCount")
        public Long containerCount;

        @NameInMap("DatabaseCount")
        public Long databaseCount;

        @NameInMap("Description")
        public String description;

        @NameInMap("ExtraParams")
        public String extraParams;

        @NameInMap("Id")
        public String id;

        @NameInMap("IsService")
        public Boolean isService;

        @NameInMap("Name")
        public String name;

        @NameInMap("OcsCount")
        public Long ocsCount;

        @NameInMap("OwnerId")
        public String ownerId;

        @NameInMap("OwnerName")
        public String ownerName;

        @NameInMap("PackageCount")
        public Long packageCount;

        @NameInMap("RealOwnerName")
        public String realOwnerName;

        @NameInMap("SlbCount")
        public Long slbCount;

        @NameInMap("StackId")
        public String stackId;

        @NameInMap("StackName")
        public String stackName;

        @NameInMap("StackVersion")
        public String stackVersion;

        @NameInMap("Status")
        public String status;

        @NameInMap("Tags")
        public String tags;

        @NameInMap("TenantId")
        public String tenantId;

        @NameInMap("UtcCreate")
        public String utcCreate;

        @NameInMap("UtcModified")
        public String utcModified;

        @NameInMap("WorkspaceId")
        public String workspaceId;

        @NameInMap("DomainNames")
        public java.util.List<String> domainNames;

        @NameInMap("AppExtraInfos")
        public java.util.List<GetCASApplicationDetailResponseBodyDataAppExtraInfos> appExtraInfos;

        @NameInMap("AppLevel")
        public GetCASApplicationDetailResponseBodyDataAppLevel appLevel;

        @NameInMap("AppOwner")
        public GetCASApplicationDetailResponseBodyDataAppOwner appOwner;

        @NameInMap("Archetype")
        public GetCASApplicationDetailResponseBodyDataArchetype archetype;

        @NameInMap("CodeRepository")
        public GetCASApplicationDetailResponseBodyDataCodeRepository codeRepository;

        @NameInMap("LifeCycle")
        public GetCASApplicationDetailResponseBodyDataLifeCycle lifeCycle;

        public static GetCASApplicationDetailResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetCASApplicationDetailResponseBodyData self = new GetCASApplicationDetailResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetCASApplicationDetailResponseBodyData setAppDomainId(String appDomainId) {
            this.appDomainId = appDomainId;
            return this;
        }
        public String getAppDomainId() {
            return this.appDomainId;
        }

        public GetCASApplicationDetailResponseBodyData setAppDomainName(String appDomainName) {
            this.appDomainName = appDomainName;
            return this;
        }
        public String getAppDomainName() {
            return this.appDomainName;
        }

        public GetCASApplicationDetailResponseBodyData setAppLevelName(String appLevelName) {
            this.appLevelName = appLevelName;
            return this;
        }
        public String getAppLevelName() {
            return this.appLevelName;
        }

        public GetCASApplicationDetailResponseBodyData setBuildpackVersion(String buildpackVersion) {
            this.buildpackVersion = buildpackVersion;
            return this;
        }
        public String getBuildpackVersion() {
            return this.buildpackVersion;
        }

        public GetCASApplicationDetailResponseBodyData setChineseName(String chineseName) {
            this.chineseName = chineseName;
            return this;
        }
        public String getChineseName() {
            return this.chineseName;
        }

        public GetCASApplicationDetailResponseBodyData setContainerCount(Long containerCount) {
            this.containerCount = containerCount;
            return this;
        }
        public Long getContainerCount() {
            return this.containerCount;
        }

        public GetCASApplicationDetailResponseBodyData setDatabaseCount(Long databaseCount) {
            this.databaseCount = databaseCount;
            return this;
        }
        public Long getDatabaseCount() {
            return this.databaseCount;
        }

        public GetCASApplicationDetailResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetCASApplicationDetailResponseBodyData setExtraParams(String extraParams) {
            this.extraParams = extraParams;
            return this;
        }
        public String getExtraParams() {
            return this.extraParams;
        }

        public GetCASApplicationDetailResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetCASApplicationDetailResponseBodyData setIsService(Boolean isService) {
            this.isService = isService;
            return this;
        }
        public Boolean getIsService() {
            return this.isService;
        }

        public GetCASApplicationDetailResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetCASApplicationDetailResponseBodyData setOcsCount(Long ocsCount) {
            this.ocsCount = ocsCount;
            return this;
        }
        public Long getOcsCount() {
            return this.ocsCount;
        }

        public GetCASApplicationDetailResponseBodyData setOwnerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public String getOwnerId() {
            return this.ownerId;
        }

        public GetCASApplicationDetailResponseBodyData setOwnerName(String ownerName) {
            this.ownerName = ownerName;
            return this;
        }
        public String getOwnerName() {
            return this.ownerName;
        }

        public GetCASApplicationDetailResponseBodyData setPackageCount(Long packageCount) {
            this.packageCount = packageCount;
            return this;
        }
        public Long getPackageCount() {
            return this.packageCount;
        }

        public GetCASApplicationDetailResponseBodyData setRealOwnerName(String realOwnerName) {
            this.realOwnerName = realOwnerName;
            return this;
        }
        public String getRealOwnerName() {
            return this.realOwnerName;
        }

        public GetCASApplicationDetailResponseBodyData setSlbCount(Long slbCount) {
            this.slbCount = slbCount;
            return this;
        }
        public Long getSlbCount() {
            return this.slbCount;
        }

        public GetCASApplicationDetailResponseBodyData setStackId(String stackId) {
            this.stackId = stackId;
            return this;
        }
        public String getStackId() {
            return this.stackId;
        }

        public GetCASApplicationDetailResponseBodyData setStackName(String stackName) {
            this.stackName = stackName;
            return this;
        }
        public String getStackName() {
            return this.stackName;
        }

        public GetCASApplicationDetailResponseBodyData setStackVersion(String stackVersion) {
            this.stackVersion = stackVersion;
            return this;
        }
        public String getStackVersion() {
            return this.stackVersion;
        }

        public GetCASApplicationDetailResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetCASApplicationDetailResponseBodyData setTags(String tags) {
            this.tags = tags;
            return this;
        }
        public String getTags() {
            return this.tags;
        }

        public GetCASApplicationDetailResponseBodyData setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public GetCASApplicationDetailResponseBodyData setUtcCreate(String utcCreate) {
            this.utcCreate = utcCreate;
            return this;
        }
        public String getUtcCreate() {
            return this.utcCreate;
        }

        public GetCASApplicationDetailResponseBodyData setUtcModified(String utcModified) {
            this.utcModified = utcModified;
            return this;
        }
        public String getUtcModified() {
            return this.utcModified;
        }

        public GetCASApplicationDetailResponseBodyData setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public GetCASApplicationDetailResponseBodyData setDomainNames(java.util.List<String> domainNames) {
            this.domainNames = domainNames;
            return this;
        }
        public java.util.List<String> getDomainNames() {
            return this.domainNames;
        }

        public GetCASApplicationDetailResponseBodyData setAppExtraInfos(java.util.List<GetCASApplicationDetailResponseBodyDataAppExtraInfos> appExtraInfos) {
            this.appExtraInfos = appExtraInfos;
            return this;
        }
        public java.util.List<GetCASApplicationDetailResponseBodyDataAppExtraInfos> getAppExtraInfos() {
            return this.appExtraInfos;
        }

        public GetCASApplicationDetailResponseBodyData setAppLevel(GetCASApplicationDetailResponseBodyDataAppLevel appLevel) {
            this.appLevel = appLevel;
            return this;
        }
        public GetCASApplicationDetailResponseBodyDataAppLevel getAppLevel() {
            return this.appLevel;
        }

        public GetCASApplicationDetailResponseBodyData setAppOwner(GetCASApplicationDetailResponseBodyDataAppOwner appOwner) {
            this.appOwner = appOwner;
            return this;
        }
        public GetCASApplicationDetailResponseBodyDataAppOwner getAppOwner() {
            return this.appOwner;
        }

        public GetCASApplicationDetailResponseBodyData setArchetype(GetCASApplicationDetailResponseBodyDataArchetype archetype) {
            this.archetype = archetype;
            return this;
        }
        public GetCASApplicationDetailResponseBodyDataArchetype getArchetype() {
            return this.archetype;
        }

        public GetCASApplicationDetailResponseBodyData setCodeRepository(GetCASApplicationDetailResponseBodyDataCodeRepository codeRepository) {
            this.codeRepository = codeRepository;
            return this;
        }
        public GetCASApplicationDetailResponseBodyDataCodeRepository getCodeRepository() {
            return this.codeRepository;
        }

        public GetCASApplicationDetailResponseBodyData setLifeCycle(GetCASApplicationDetailResponseBodyDataLifeCycle lifeCycle) {
            this.lifeCycle = lifeCycle;
            return this;
        }
        public GetCASApplicationDetailResponseBodyDataLifeCycle getLifeCycle() {
            return this.lifeCycle;
        }

    }

}
