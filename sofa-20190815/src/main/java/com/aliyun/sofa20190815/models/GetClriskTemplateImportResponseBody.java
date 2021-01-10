// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetClriskTemplateImportResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ProductId")
    public Long productId;

    @NameInMap("ProductName")
    public String productName;

    @NameInMap("TemplateCode")
    public String templateCode;

    @NameInMap("TemplateName")
    public String templateName;

    @NameInMap("TriggerDelay")
    public String triggerDelay;

    @NameInMap("TriggerMode")
    public String triggerMode;

    @NameInMap("DataNodes")
    public java.util.List<GetClriskTemplateImportResponseBodyDataNodes> dataNodes;

    @NameInMap("Owners")
    public java.util.List<GetClriskTemplateImportResponseBodyOwners> owners;

    @NameInMap("RuleList")
    public java.util.List<GetClriskTemplateImportResponseBodyRuleList> ruleList;

    public static GetClriskTemplateImportResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetClriskTemplateImportResponseBody self = new GetClriskTemplateImportResponseBody();
        return TeaModel.build(map, self);
    }

    public GetClriskTemplateImportResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetClriskTemplateImportResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetClriskTemplateImportResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetClriskTemplateImportResponseBody setProductId(Long productId) {
        this.productId = productId;
        return this;
    }
    public Long getProductId() {
        return this.productId;
    }

    public GetClriskTemplateImportResponseBody setProductName(String productName) {
        this.productName = productName;
        return this;
    }
    public String getProductName() {
        return this.productName;
    }

    public GetClriskTemplateImportResponseBody setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
        return this;
    }
    public String getTemplateCode() {
        return this.templateCode;
    }

    public GetClriskTemplateImportResponseBody setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public GetClriskTemplateImportResponseBody setTriggerDelay(String triggerDelay) {
        this.triggerDelay = triggerDelay;
        return this;
    }
    public String getTriggerDelay() {
        return this.triggerDelay;
    }

    public GetClriskTemplateImportResponseBody setTriggerMode(String triggerMode) {
        this.triggerMode = triggerMode;
        return this;
    }
    public String getTriggerMode() {
        return this.triggerMode;
    }

    public GetClriskTemplateImportResponseBody setDataNodes(java.util.List<GetClriskTemplateImportResponseBodyDataNodes> dataNodes) {
        this.dataNodes = dataNodes;
        return this;
    }
    public java.util.List<GetClriskTemplateImportResponseBodyDataNodes> getDataNodes() {
        return this.dataNodes;
    }

    public GetClriskTemplateImportResponseBody setOwners(java.util.List<GetClriskTemplateImportResponseBodyOwners> owners) {
        this.owners = owners;
        return this;
    }
    public java.util.List<GetClriskTemplateImportResponseBodyOwners> getOwners() {
        return this.owners;
    }

    public GetClriskTemplateImportResponseBody setRuleList(java.util.List<GetClriskTemplateImportResponseBodyRuleList> ruleList) {
        this.ruleList = ruleList;
        return this;
    }
    public java.util.List<GetClriskTemplateImportResponseBodyRuleList> getRuleList() {
        return this.ruleList;
    }

    public static class GetClriskTemplateImportResponseBodyDataNodes extends TeaModel {
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

        public static GetClriskTemplateImportResponseBodyDataNodes build(java.util.Map<String, ?> map) throws Exception {
            GetClriskTemplateImportResponseBodyDataNodes self = new GetClriskTemplateImportResponseBodyDataNodes();
            return TeaModel.build(map, self);
        }

        public GetClriskTemplateImportResponseBodyDataNodes setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetClriskTemplateImportResponseBodyDataNodes setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetClriskTemplateImportResponseBodyDataNodes setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetClriskTemplateImportResponseBodyDataNodes setNodeCode(String nodeCode) {
            this.nodeCode = nodeCode;
            return this;
        }
        public String getNodeCode() {
            return this.nodeCode;
        }

        public GetClriskTemplateImportResponseBodyDataNodes setOdpsProject(String odpsProject) {
            this.odpsProject = odpsProject;
            return this;
        }
        public String getOdpsProject() {
            return this.odpsProject;
        }

        public GetClriskTemplateImportResponseBodyDataNodes setTableAuthDescription(String tableAuthDescription) {
            this.tableAuthDescription = tableAuthDescription;
            return this;
        }
        public String getTableAuthDescription() {
            return this.tableAuthDescription;
        }

        public GetClriskTemplateImportResponseBodyDataNodes setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

        public GetClriskTemplateImportResponseBodyDataNodes setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetClriskTemplateImportResponseBodyDataNodes setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public GetClriskTemplateImportResponseBodyDataNodes setUpdateUser(String updateUser) {
            this.updateUser = updateUser;
            return this;
        }
        public String getUpdateUser() {
            return this.updateUser;
        }

    }

    public static class GetClriskTemplateImportResponseBodyOwners extends TeaModel {
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

        public static GetClriskTemplateImportResponseBodyOwners build(java.util.Map<String, ?> map) throws Exception {
            GetClriskTemplateImportResponseBodyOwners self = new GetClriskTemplateImportResponseBodyOwners();
            return TeaModel.build(map, self);
        }

        public GetClriskTemplateImportResponseBodyOwners setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public GetClriskTemplateImportResponseBodyOwners setLoginName(String loginName) {
            this.loginName = loginName;
            return this;
        }
        public String getLoginName() {
            return this.loginName;
        }

        public GetClriskTemplateImportResponseBodyOwners setMobile(String mobile) {
            this.mobile = mobile;
            return this;
        }
        public String getMobile() {
            return this.mobile;
        }

        public GetClriskTemplateImportResponseBodyOwners setNickName(String nickName) {
            this.nickName = nickName;
            return this;
        }
        public String getNickName() {
            return this.nickName;
        }

        public GetClriskTemplateImportResponseBodyOwners setOriginId(String originId) {
            this.originId = originId;
            return this;
        }
        public String getOriginId() {
            return this.originId;
        }

        public GetClriskTemplateImportResponseBodyOwners setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetClriskTemplateImportResponseBodyRuleList extends TeaModel {
        @NameInMap("Content")
        public String content;

        @NameInMap("DebugStatus")
        public String debugStatus;

        @NameInMap("Desc")
        public String desc;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("RuleCode")
        public String ruleCode;

        @NameInMap("RuleName")
        public String ruleName;

        @NameInMap("TemplateCode")
        public String templateCode;

        @NameInMap("Type")
        public String type;

        public static GetClriskTemplateImportResponseBodyRuleList build(java.util.Map<String, ?> map) throws Exception {
            GetClriskTemplateImportResponseBodyRuleList self = new GetClriskTemplateImportResponseBodyRuleList();
            return TeaModel.build(map, self);
        }

        public GetClriskTemplateImportResponseBodyRuleList setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public GetClriskTemplateImportResponseBodyRuleList setDebugStatus(String debugStatus) {
            this.debugStatus = debugStatus;
            return this;
        }
        public String getDebugStatus() {
            return this.debugStatus;
        }

        public GetClriskTemplateImportResponseBodyRuleList setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public GetClriskTemplateImportResponseBodyRuleList setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetClriskTemplateImportResponseBodyRuleList setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetClriskTemplateImportResponseBodyRuleList setRuleCode(String ruleCode) {
            this.ruleCode = ruleCode;
            return this;
        }
        public String getRuleCode() {
            return this.ruleCode;
        }

        public GetClriskTemplateImportResponseBodyRuleList setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public GetClriskTemplateImportResponseBodyRuleList setTemplateCode(String templateCode) {
            this.templateCode = templateCode;
            return this;
        }
        public String getTemplateCode() {
            return this.templateCode;
        }

        public GetClriskTemplateImportResponseBodyRuleList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
