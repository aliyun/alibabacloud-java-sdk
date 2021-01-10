// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListClriskTemplateResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("PageCount")
    public Long pageCount;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("TotalCount")
    public Long totalCount;

    @NameInMap("TemplateList")
    public java.util.List<ListClriskTemplateResponseBodyTemplateList> templateList;

    public static ListClriskTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListClriskTemplateResponseBody self = new ListClriskTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public ListClriskTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListClriskTemplateResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListClriskTemplateResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ListClriskTemplateResponseBody setPageCount(Long pageCount) {
        this.pageCount = pageCount;
        return this;
    }
    public Long getPageCount() {
        return this.pageCount;
    }

    public ListClriskTemplateResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListClriskTemplateResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListClriskTemplateResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public ListClriskTemplateResponseBody setTemplateList(java.util.List<ListClriskTemplateResponseBodyTemplateList> templateList) {
        this.templateList = templateList;
        return this;
    }
    public java.util.List<ListClriskTemplateResponseBodyTemplateList> getTemplateList() {
        return this.templateList;
    }

    public static class ListClriskTemplateResponseBodyTemplateListDataNodes extends TeaModel {
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

        public static ListClriskTemplateResponseBodyTemplateListDataNodes build(java.util.Map<String, ?> map) throws Exception {
            ListClriskTemplateResponseBodyTemplateListDataNodes self = new ListClriskTemplateResponseBodyTemplateListDataNodes();
            return TeaModel.build(map, self);
        }

        public ListClriskTemplateResponseBodyTemplateListDataNodes setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListClriskTemplateResponseBodyTemplateListDataNodes setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListClriskTemplateResponseBodyTemplateListDataNodes setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListClriskTemplateResponseBodyTemplateListDataNodes setNodeCode(String nodeCode) {
            this.nodeCode = nodeCode;
            return this;
        }
        public String getNodeCode() {
            return this.nodeCode;
        }

        public ListClriskTemplateResponseBodyTemplateListDataNodes setOdpsProject(String odpsProject) {
            this.odpsProject = odpsProject;
            return this;
        }
        public String getOdpsProject() {
            return this.odpsProject;
        }

        public ListClriskTemplateResponseBodyTemplateListDataNodes setTableAuthDescription(String tableAuthDescription) {
            this.tableAuthDescription = tableAuthDescription;
            return this;
        }
        public String getTableAuthDescription() {
            return this.tableAuthDescription;
        }

        public ListClriskTemplateResponseBodyTemplateListDataNodes setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

        public ListClriskTemplateResponseBodyTemplateListDataNodes setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListClriskTemplateResponseBodyTemplateListDataNodes setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public ListClriskTemplateResponseBodyTemplateListDataNodes setUpdateUser(String updateUser) {
            this.updateUser = updateUser;
            return this;
        }
        public String getUpdateUser() {
            return this.updateUser;
        }

    }

    public static class ListClriskTemplateResponseBodyTemplateListOwners extends TeaModel {
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

        public static ListClriskTemplateResponseBodyTemplateListOwners build(java.util.Map<String, ?> map) throws Exception {
            ListClriskTemplateResponseBodyTemplateListOwners self = new ListClriskTemplateResponseBodyTemplateListOwners();
            return TeaModel.build(map, self);
        }

        public ListClriskTemplateResponseBodyTemplateListOwners setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public ListClriskTemplateResponseBodyTemplateListOwners setLoginName(String loginName) {
            this.loginName = loginName;
            return this;
        }
        public String getLoginName() {
            return this.loginName;
        }

        public ListClriskTemplateResponseBodyTemplateListOwners setMobile(String mobile) {
            this.mobile = mobile;
            return this;
        }
        public String getMobile() {
            return this.mobile;
        }

        public ListClriskTemplateResponseBodyTemplateListOwners setNickName(String nickName) {
            this.nickName = nickName;
            return this;
        }
        public String getNickName() {
            return this.nickName;
        }

        public ListClriskTemplateResponseBodyTemplateListOwners setOriginId(String originId) {
            this.originId = originId;
            return this;
        }
        public String getOriginId() {
            return this.originId;
        }

        public ListClriskTemplateResponseBodyTemplateListOwners setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListClriskTemplateResponseBodyTemplateListLastModifier extends TeaModel {
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

        public static ListClriskTemplateResponseBodyTemplateListLastModifier build(java.util.Map<String, ?> map) throws Exception {
            ListClriskTemplateResponseBodyTemplateListLastModifier self = new ListClriskTemplateResponseBodyTemplateListLastModifier();
            return TeaModel.build(map, self);
        }

        public ListClriskTemplateResponseBodyTemplateListLastModifier setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public ListClriskTemplateResponseBodyTemplateListLastModifier setLoginName(String loginName) {
            this.loginName = loginName;
            return this;
        }
        public String getLoginName() {
            return this.loginName;
        }

        public ListClriskTemplateResponseBodyTemplateListLastModifier setMobile(String mobile) {
            this.mobile = mobile;
            return this;
        }
        public String getMobile() {
            return this.mobile;
        }

        public ListClriskTemplateResponseBodyTemplateListLastModifier setNickName(String nickName) {
            this.nickName = nickName;
            return this;
        }
        public String getNickName() {
            return this.nickName;
        }

        public ListClriskTemplateResponseBodyTemplateListLastModifier setOriginId(String originId) {
            this.originId = originId;
            return this;
        }
        public String getOriginId() {
            return this.originId;
        }

        public ListClriskTemplateResponseBodyTemplateListLastModifier setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListClriskTemplateResponseBodyTemplateList extends TeaModel {
        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

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
        public java.util.List<ListClriskTemplateResponseBodyTemplateListDataNodes> dataNodes;

        @NameInMap("Owners")
        public java.util.List<ListClriskTemplateResponseBodyTemplateListOwners> owners;

        @NameInMap("LastModifier")
        public ListClriskTemplateResponseBodyTemplateListLastModifier lastModifier;

        public static ListClriskTemplateResponseBodyTemplateList build(java.util.Map<String, ?> map) throws Exception {
            ListClriskTemplateResponseBodyTemplateList self = new ListClriskTemplateResponseBodyTemplateList();
            return TeaModel.build(map, self);
        }

        public ListClriskTemplateResponseBodyTemplateList setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListClriskTemplateResponseBodyTemplateList setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListClriskTemplateResponseBodyTemplateList setMemo(String memo) {
            this.memo = memo;
            return this;
        }
        public String getMemo() {
            return this.memo;
        }

        public ListClriskTemplateResponseBodyTemplateList setModelNumber(Long modelNumber) {
            this.modelNumber = modelNumber;
            return this;
        }
        public Long getModelNumber() {
            return this.modelNumber;
        }

        public ListClriskTemplateResponseBodyTemplateList setProductId(Long productId) {
            this.productId = productId;
            return this;
        }
        public Long getProductId() {
            return this.productId;
        }

        public ListClriskTemplateResponseBodyTemplateList setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

        public ListClriskTemplateResponseBodyTemplateList setRuleNumber(Long ruleNumber) {
            this.ruleNumber = ruleNumber;
            return this;
        }
        public Long getRuleNumber() {
            return this.ruleNumber;
        }

        public ListClriskTemplateResponseBodyTemplateList setTemplateCode(String templateCode) {
            this.templateCode = templateCode;
            return this;
        }
        public String getTemplateCode() {
            return this.templateCode;
        }

        public ListClriskTemplateResponseBodyTemplateList setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

        public ListClriskTemplateResponseBodyTemplateList setTriggerDelay(String triggerDelay) {
            this.triggerDelay = triggerDelay;
            return this;
        }
        public String getTriggerDelay() {
            return this.triggerDelay;
        }

        public ListClriskTemplateResponseBodyTemplateList setTriggerMode(String triggerMode) {
            this.triggerMode = triggerMode;
            return this;
        }
        public String getTriggerMode() {
            return this.triggerMode;
        }

        public ListClriskTemplateResponseBodyTemplateList setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public ListClriskTemplateResponseBodyTemplateList setDataNodes(java.util.List<ListClriskTemplateResponseBodyTemplateListDataNodes> dataNodes) {
            this.dataNodes = dataNodes;
            return this;
        }
        public java.util.List<ListClriskTemplateResponseBodyTemplateListDataNodes> getDataNodes() {
            return this.dataNodes;
        }

        public ListClriskTemplateResponseBodyTemplateList setOwners(java.util.List<ListClriskTemplateResponseBodyTemplateListOwners> owners) {
            this.owners = owners;
            return this;
        }
        public java.util.List<ListClriskTemplateResponseBodyTemplateListOwners> getOwners() {
            return this.owners;
        }

        public ListClriskTemplateResponseBodyTemplateList setLastModifier(ListClriskTemplateResponseBodyTemplateListLastModifier lastModifier) {
            this.lastModifier = lastModifier;
            return this;
        }
        public ListClriskTemplateResponseBodyTemplateListLastModifier getLastModifier() {
            return this.lastModifier;
        }

    }

}
