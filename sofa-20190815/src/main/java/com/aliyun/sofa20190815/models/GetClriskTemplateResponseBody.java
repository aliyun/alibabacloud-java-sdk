// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetClriskTemplateResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("CurrentOwner")
    public Boolean currentOwner;

    @NameInMap("GmtCreate")
    public String gmtCreate;

    @NameInMap("GmtModified")
    public String gmtModified;

    @NameInMap("IsMultiplex")
    public Boolean isMultiplex;

    @NameInMap("Memo")
    public String memo;

    @NameInMap("ModelNumber")
    public Long modelNumber;

    @NameInMap("ProductId")
    public Long productId;

    @NameInMap("ProductName")
    public String productName;

    @NameInMap("RuleNumber")
    public Long ruleNumber;

    @NameInMap("TemplateCode")
    public String templateCode;

    @NameInMap("TemplateName")
    public String templateName;

    @NameInMap("TriggerDelay")
    public String triggerDelay;

    @NameInMap("TriggerMode")
    public String triggerMode;

    @NameInMap("Version")
    public String version;

    @NameInMap("DataNodes")
    public java.util.List<GetClriskTemplateResponseBodyDataNodes> dataNodes;

    @NameInMap("Owners")
    public java.util.List<GetClriskTemplateResponseBodyOwners> owners;

    @NameInMap("LastModifier")
    public GetClriskTemplateResponseBodyLastModifier lastModifier;

    public static GetClriskTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetClriskTemplateResponseBody self = new GetClriskTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public GetClriskTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetClriskTemplateResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetClriskTemplateResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetClriskTemplateResponseBody setCurrentOwner(Boolean currentOwner) {
        this.currentOwner = currentOwner;
        return this;
    }
    public Boolean getCurrentOwner() {
        return this.currentOwner;
    }

    public GetClriskTemplateResponseBody setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public GetClriskTemplateResponseBody setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public GetClriskTemplateResponseBody setIsMultiplex(Boolean isMultiplex) {
        this.isMultiplex = isMultiplex;
        return this;
    }
    public Boolean getIsMultiplex() {
        return this.isMultiplex;
    }

    public GetClriskTemplateResponseBody setMemo(String memo) {
        this.memo = memo;
        return this;
    }
    public String getMemo() {
        return this.memo;
    }

    public GetClriskTemplateResponseBody setModelNumber(Long modelNumber) {
        this.modelNumber = modelNumber;
        return this;
    }
    public Long getModelNumber() {
        return this.modelNumber;
    }

    public GetClriskTemplateResponseBody setProductId(Long productId) {
        this.productId = productId;
        return this;
    }
    public Long getProductId() {
        return this.productId;
    }

    public GetClriskTemplateResponseBody setProductName(String productName) {
        this.productName = productName;
        return this;
    }
    public String getProductName() {
        return this.productName;
    }

    public GetClriskTemplateResponseBody setRuleNumber(Long ruleNumber) {
        this.ruleNumber = ruleNumber;
        return this;
    }
    public Long getRuleNumber() {
        return this.ruleNumber;
    }

    public GetClriskTemplateResponseBody setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
        return this;
    }
    public String getTemplateCode() {
        return this.templateCode;
    }

    public GetClriskTemplateResponseBody setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public GetClriskTemplateResponseBody setTriggerDelay(String triggerDelay) {
        this.triggerDelay = triggerDelay;
        return this;
    }
    public String getTriggerDelay() {
        return this.triggerDelay;
    }

    public GetClriskTemplateResponseBody setTriggerMode(String triggerMode) {
        this.triggerMode = triggerMode;
        return this;
    }
    public String getTriggerMode() {
        return this.triggerMode;
    }

    public GetClriskTemplateResponseBody setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public GetClriskTemplateResponseBody setDataNodes(java.util.List<GetClriskTemplateResponseBodyDataNodes> dataNodes) {
        this.dataNodes = dataNodes;
        return this;
    }
    public java.util.List<GetClriskTemplateResponseBodyDataNodes> getDataNodes() {
        return this.dataNodes;
    }

    public GetClriskTemplateResponseBody setOwners(java.util.List<GetClriskTemplateResponseBodyOwners> owners) {
        this.owners = owners;
        return this;
    }
    public java.util.List<GetClriskTemplateResponseBodyOwners> getOwners() {
        return this.owners;
    }

    public GetClriskTemplateResponseBody setLastModifier(GetClriskTemplateResponseBodyLastModifier lastModifier) {
        this.lastModifier = lastModifier;
        return this;
    }
    public GetClriskTemplateResponseBodyLastModifier getLastModifier() {
        return this.lastModifier;
    }

    public static class GetClriskTemplateResponseBodyDataNodes extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        @NameInMap("NodeCode")
        public String nodeCode;

        @NameInMap("OdpsProject")
        public String odpsProject;

        @NameInMap("TableAuthDescription")
        public String tableAuthDescription;

        @NameInMap("TableName")
        public String tableName;

        @NameInMap("Type")
        public String type;

        @NameInMap("UpdateTime")
        public String updateTime;

        @NameInMap("UpdateUser")
        public String updateUser;

        public static GetClriskTemplateResponseBodyDataNodes build(java.util.Map<String, ?> map) throws Exception {
            GetClriskTemplateResponseBodyDataNodes self = new GetClriskTemplateResponseBodyDataNodes();
            return TeaModel.build(map, self);
        }

        public GetClriskTemplateResponseBodyDataNodes setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetClriskTemplateResponseBodyDataNodes setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetClriskTemplateResponseBodyDataNodes setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetClriskTemplateResponseBodyDataNodes setNodeCode(String nodeCode) {
            this.nodeCode = nodeCode;
            return this;
        }
        public String getNodeCode() {
            return this.nodeCode;
        }

        public GetClriskTemplateResponseBodyDataNodes setOdpsProject(String odpsProject) {
            this.odpsProject = odpsProject;
            return this;
        }
        public String getOdpsProject() {
            return this.odpsProject;
        }

        public GetClriskTemplateResponseBodyDataNodes setTableAuthDescription(String tableAuthDescription) {
            this.tableAuthDescription = tableAuthDescription;
            return this;
        }
        public String getTableAuthDescription() {
            return this.tableAuthDescription;
        }

        public GetClriskTemplateResponseBodyDataNodes setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

        public GetClriskTemplateResponseBodyDataNodes setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetClriskTemplateResponseBodyDataNodes setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public GetClriskTemplateResponseBodyDataNodes setUpdateUser(String updateUser) {
            this.updateUser = updateUser;
            return this;
        }
        public String getUpdateUser() {
            return this.updateUser;
        }

    }

    public static class GetClriskTemplateResponseBodyOwners extends TeaModel {
        @NameInMap("Email")
        public String email;

        @NameInMap("LoginName")
        public String loginName;

        @NameInMap("Mobile")
        public String mobile;

        @NameInMap("NickName")
        public String nickName;

        @NameInMap("OriginId")
        public String originId;

        @NameInMap("Type")
        public String type;

        public static GetClriskTemplateResponseBodyOwners build(java.util.Map<String, ?> map) throws Exception {
            GetClriskTemplateResponseBodyOwners self = new GetClriskTemplateResponseBodyOwners();
            return TeaModel.build(map, self);
        }

        public GetClriskTemplateResponseBodyOwners setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public GetClriskTemplateResponseBodyOwners setLoginName(String loginName) {
            this.loginName = loginName;
            return this;
        }
        public String getLoginName() {
            return this.loginName;
        }

        public GetClriskTemplateResponseBodyOwners setMobile(String mobile) {
            this.mobile = mobile;
            return this;
        }
        public String getMobile() {
            return this.mobile;
        }

        public GetClriskTemplateResponseBodyOwners setNickName(String nickName) {
            this.nickName = nickName;
            return this;
        }
        public String getNickName() {
            return this.nickName;
        }

        public GetClriskTemplateResponseBodyOwners setOriginId(String originId) {
            this.originId = originId;
            return this;
        }
        public String getOriginId() {
            return this.originId;
        }

        public GetClriskTemplateResponseBodyOwners setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetClriskTemplateResponseBodyLastModifier extends TeaModel {
        @NameInMap("Email")
        public String email;

        @NameInMap("LoginName")
        public String loginName;

        @NameInMap("Mobile")
        public String mobile;

        @NameInMap("NickName")
        public String nickName;

        @NameInMap("OriginId")
        public String originId;

        @NameInMap("Type")
        public String type;

        public static GetClriskTemplateResponseBodyLastModifier build(java.util.Map<String, ?> map) throws Exception {
            GetClriskTemplateResponseBodyLastModifier self = new GetClriskTemplateResponseBodyLastModifier();
            return TeaModel.build(map, self);
        }

        public GetClriskTemplateResponseBodyLastModifier setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public GetClriskTemplateResponseBodyLastModifier setLoginName(String loginName) {
            this.loginName = loginName;
            return this;
        }
        public String getLoginName() {
            return this.loginName;
        }

        public GetClriskTemplateResponseBodyLastModifier setMobile(String mobile) {
            this.mobile = mobile;
            return this;
        }
        public String getMobile() {
            return this.mobile;
        }

        public GetClriskTemplateResponseBodyLastModifier setNickName(String nickName) {
            this.nickName = nickName;
            return this;
        }
        public String getNickName() {
            return this.nickName;
        }

        public GetClriskTemplateResponseBodyLastModifier setOriginId(String originId) {
            this.originId = originId;
            return this;
        }
        public String getOriginId() {
            return this.originId;
        }

        public GetClriskTemplateResponseBodyLastModifier setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
