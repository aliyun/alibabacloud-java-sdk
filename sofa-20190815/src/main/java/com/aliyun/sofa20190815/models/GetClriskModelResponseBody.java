// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetClriskModelResponseBody extends TeaModel {
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

    @NameInMap("Memo")
    public String memo;

    @NameInMap("ModelCode")
    public String modelCode;

    @NameInMap("Name")
    public String name;

    @NameInMap("ProductId")
    public Long productId;

    @NameInMap("ProductName")
    public String productName;

    @NameInMap("Status")
    public String status;

    @NameInMap("TemplateCode")
    public String templateCode;

    @NameInMap("TriggerDelay")
    public String triggerDelay;

    @NameInMap("TriggerMode")
    public String triggerMode;

    @NameInMap("Version")
    public String version;

    @NameInMap("DataNodes")
    public java.util.List<GetClriskModelResponseBodyDataNodes> dataNodes;

    @NameInMap("ExtMap")
    public java.util.List<GetClriskModelResponseBodyExtMap> extMap;

    @NameInMap("Owners")
    public java.util.List<GetClriskModelResponseBodyOwners> owners;

    @NameInMap("Subscribers")
    public java.util.List<GetClriskModelResponseBodySubscribers> subscribers;

    @NameInMap("LastModifier")
    public GetClriskModelResponseBodyLastModifier lastModifier;

    @NameInMap("ModifiedColumn")
    public GetClriskModelResponseBodyModifiedColumn modifiedColumn;

    public static GetClriskModelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetClriskModelResponseBody self = new GetClriskModelResponseBody();
        return TeaModel.build(map, self);
    }

    public GetClriskModelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetClriskModelResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetClriskModelResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetClriskModelResponseBody setCurrentOwner(Boolean currentOwner) {
        this.currentOwner = currentOwner;
        return this;
    }
    public Boolean getCurrentOwner() {
        return this.currentOwner;
    }

    public GetClriskModelResponseBody setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public GetClriskModelResponseBody setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public GetClriskModelResponseBody setMemo(String memo) {
        this.memo = memo;
        return this;
    }
    public String getMemo() {
        return this.memo;
    }

    public GetClriskModelResponseBody setModelCode(String modelCode) {
        this.modelCode = modelCode;
        return this;
    }
    public String getModelCode() {
        return this.modelCode;
    }

    public GetClriskModelResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetClriskModelResponseBody setProductId(Long productId) {
        this.productId = productId;
        return this;
    }
    public Long getProductId() {
        return this.productId;
    }

    public GetClriskModelResponseBody setProductName(String productName) {
        this.productName = productName;
        return this;
    }
    public String getProductName() {
        return this.productName;
    }

    public GetClriskModelResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetClriskModelResponseBody setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
        return this;
    }
    public String getTemplateCode() {
        return this.templateCode;
    }

    public GetClriskModelResponseBody setTriggerDelay(String triggerDelay) {
        this.triggerDelay = triggerDelay;
        return this;
    }
    public String getTriggerDelay() {
        return this.triggerDelay;
    }

    public GetClriskModelResponseBody setTriggerMode(String triggerMode) {
        this.triggerMode = triggerMode;
        return this;
    }
    public String getTriggerMode() {
        return this.triggerMode;
    }

    public GetClriskModelResponseBody setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public GetClriskModelResponseBody setDataNodes(java.util.List<GetClriskModelResponseBodyDataNodes> dataNodes) {
        this.dataNodes = dataNodes;
        return this;
    }
    public java.util.List<GetClriskModelResponseBodyDataNodes> getDataNodes() {
        return this.dataNodes;
    }

    public GetClriskModelResponseBody setExtMap(java.util.List<GetClriskModelResponseBodyExtMap> extMap) {
        this.extMap = extMap;
        return this;
    }
    public java.util.List<GetClriskModelResponseBodyExtMap> getExtMap() {
        return this.extMap;
    }

    public GetClriskModelResponseBody setOwners(java.util.List<GetClriskModelResponseBodyOwners> owners) {
        this.owners = owners;
        return this;
    }
    public java.util.List<GetClriskModelResponseBodyOwners> getOwners() {
        return this.owners;
    }

    public GetClriskModelResponseBody setSubscribers(java.util.List<GetClriskModelResponseBodySubscribers> subscribers) {
        this.subscribers = subscribers;
        return this;
    }
    public java.util.List<GetClriskModelResponseBodySubscribers> getSubscribers() {
        return this.subscribers;
    }

    public GetClriskModelResponseBody setLastModifier(GetClriskModelResponseBodyLastModifier lastModifier) {
        this.lastModifier = lastModifier;
        return this;
    }
    public GetClriskModelResponseBodyLastModifier getLastModifier() {
        return this.lastModifier;
    }

    public GetClriskModelResponseBody setModifiedColumn(GetClriskModelResponseBodyModifiedColumn modifiedColumn) {
        this.modifiedColumn = modifiedColumn;
        return this;
    }
    public GetClriskModelResponseBodyModifiedColumn getModifiedColumn() {
        return this.modifiedColumn;
    }

    public static class GetClriskModelResponseBodyDataNodes extends TeaModel {
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

        public static GetClriskModelResponseBodyDataNodes build(java.util.Map<String, ?> map) throws Exception {
            GetClriskModelResponseBodyDataNodes self = new GetClriskModelResponseBodyDataNodes();
            return TeaModel.build(map, self);
        }

        public GetClriskModelResponseBodyDataNodes setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetClriskModelResponseBodyDataNodes setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetClriskModelResponseBodyDataNodes setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetClriskModelResponseBodyDataNodes setNodeCode(String nodeCode) {
            this.nodeCode = nodeCode;
            return this;
        }
        public String getNodeCode() {
            return this.nodeCode;
        }

        public GetClriskModelResponseBodyDataNodes setOdpsProject(String odpsProject) {
            this.odpsProject = odpsProject;
            return this;
        }
        public String getOdpsProject() {
            return this.odpsProject;
        }

        public GetClriskModelResponseBodyDataNodes setTableAuthDescription(String tableAuthDescription) {
            this.tableAuthDescription = tableAuthDescription;
            return this;
        }
        public String getTableAuthDescription() {
            return this.tableAuthDescription;
        }

        public GetClriskModelResponseBodyDataNodes setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

        public GetClriskModelResponseBodyDataNodes setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetClriskModelResponseBodyDataNodes setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public GetClriskModelResponseBodyDataNodes setUpdateUser(String updateUser) {
            this.updateUser = updateUser;
            return this;
        }
        public String getUpdateUser() {
            return this.updateUser;
        }

    }

    public static class GetClriskModelResponseBodyExtMap extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static GetClriskModelResponseBodyExtMap build(java.util.Map<String, ?> map) throws Exception {
            GetClriskModelResponseBodyExtMap self = new GetClriskModelResponseBodyExtMap();
            return TeaModel.build(map, self);
        }

        public GetClriskModelResponseBodyExtMap setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetClriskModelResponseBodyExtMap setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetClriskModelResponseBodyOwners extends TeaModel {
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

        public static GetClriskModelResponseBodyOwners build(java.util.Map<String, ?> map) throws Exception {
            GetClriskModelResponseBodyOwners self = new GetClriskModelResponseBodyOwners();
            return TeaModel.build(map, self);
        }

        public GetClriskModelResponseBodyOwners setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public GetClriskModelResponseBodyOwners setLoginName(String loginName) {
            this.loginName = loginName;
            return this;
        }
        public String getLoginName() {
            return this.loginName;
        }

        public GetClriskModelResponseBodyOwners setMobile(String mobile) {
            this.mobile = mobile;
            return this;
        }
        public String getMobile() {
            return this.mobile;
        }

        public GetClriskModelResponseBodyOwners setNickName(String nickName) {
            this.nickName = nickName;
            return this;
        }
        public String getNickName() {
            return this.nickName;
        }

        public GetClriskModelResponseBodyOwners setOriginId(String originId) {
            this.originId = originId;
            return this;
        }
        public String getOriginId() {
            return this.originId;
        }

        public GetClriskModelResponseBodyOwners setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetClriskModelResponseBodySubscribers extends TeaModel {
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

        public static GetClriskModelResponseBodySubscribers build(java.util.Map<String, ?> map) throws Exception {
            GetClriskModelResponseBodySubscribers self = new GetClriskModelResponseBodySubscribers();
            return TeaModel.build(map, self);
        }

        public GetClriskModelResponseBodySubscribers setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public GetClriskModelResponseBodySubscribers setLoginName(String loginName) {
            this.loginName = loginName;
            return this;
        }
        public String getLoginName() {
            return this.loginName;
        }

        public GetClriskModelResponseBodySubscribers setMobile(String mobile) {
            this.mobile = mobile;
            return this;
        }
        public String getMobile() {
            return this.mobile;
        }

        public GetClriskModelResponseBodySubscribers setNickName(String nickName) {
            this.nickName = nickName;
            return this;
        }
        public String getNickName() {
            return this.nickName;
        }

        public GetClriskModelResponseBodySubscribers setOriginId(String originId) {
            this.originId = originId;
            return this;
        }
        public String getOriginId() {
            return this.originId;
        }

        public GetClriskModelResponseBodySubscribers setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetClriskModelResponseBodyLastModifier extends TeaModel {
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

        public static GetClriskModelResponseBodyLastModifier build(java.util.Map<String, ?> map) throws Exception {
            GetClriskModelResponseBodyLastModifier self = new GetClriskModelResponseBodyLastModifier();
            return TeaModel.build(map, self);
        }

        public GetClriskModelResponseBodyLastModifier setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public GetClriskModelResponseBodyLastModifier setLoginName(String loginName) {
            this.loginName = loginName;
            return this;
        }
        public String getLoginName() {
            return this.loginName;
        }

        public GetClriskModelResponseBodyLastModifier setMobile(String mobile) {
            this.mobile = mobile;
            return this;
        }
        public String getMobile() {
            return this.mobile;
        }

        public GetClriskModelResponseBodyLastModifier setNickName(String nickName) {
            this.nickName = nickName;
            return this;
        }
        public String getNickName() {
            return this.nickName;
        }

        public GetClriskModelResponseBodyLastModifier setOriginId(String originId) {
            this.originId = originId;
            return this;
        }
        public String getOriginId() {
            return this.originId;
        }

        public GetClriskModelResponseBodyLastModifier setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetClriskModelResponseBodyModifiedColumnRuleCodes extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static GetClriskModelResponseBodyModifiedColumnRuleCodes build(java.util.Map<String, ?> map) throws Exception {
            GetClriskModelResponseBodyModifiedColumnRuleCodes self = new GetClriskModelResponseBodyModifiedColumnRuleCodes();
            return TeaModel.build(map, self);
        }

        public GetClriskModelResponseBodyModifiedColumnRuleCodes setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetClriskModelResponseBodyModifiedColumnRuleCodes setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetClriskModelResponseBodyModifiedColumn extends TeaModel {
        @NameInMap("ModelConfig")
        public Boolean modelConfig;

        @NameInMap("RuleCodes")
        public java.util.List<GetClriskModelResponseBodyModifiedColumnRuleCodes> ruleCodes;

        public static GetClriskModelResponseBodyModifiedColumn build(java.util.Map<String, ?> map) throws Exception {
            GetClriskModelResponseBodyModifiedColumn self = new GetClriskModelResponseBodyModifiedColumn();
            return TeaModel.build(map, self);
        }

        public GetClriskModelResponseBodyModifiedColumn setModelConfig(Boolean modelConfig) {
            this.modelConfig = modelConfig;
            return this;
        }
        public Boolean getModelConfig() {
            return this.modelConfig;
        }

        public GetClriskModelResponseBodyModifiedColumn setRuleCodes(java.util.List<GetClriskModelResponseBodyModifiedColumnRuleCodes> ruleCodes) {
            this.ruleCodes = ruleCodes;
            return this;
        }
        public java.util.List<GetClriskModelResponseBodyModifiedColumnRuleCodes> getRuleCodes() {
            return this.ruleCodes;
        }

    }

}
