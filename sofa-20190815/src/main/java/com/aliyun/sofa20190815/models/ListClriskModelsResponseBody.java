// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListClriskModelsResponseBody extends TeaModel {
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

    @NameInMap("EntranceList")
    public java.util.List<ListClriskModelsResponseBodyEntranceList> entranceList;

    public static ListClriskModelsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListClriskModelsResponseBody self = new ListClriskModelsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListClriskModelsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListClriskModelsResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListClriskModelsResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ListClriskModelsResponseBody setPageCount(Long pageCount) {
        this.pageCount = pageCount;
        return this;
    }
    public Long getPageCount() {
        return this.pageCount;
    }

    public ListClriskModelsResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListClriskModelsResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListClriskModelsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public ListClriskModelsResponseBody setEntranceList(java.util.List<ListClriskModelsResponseBodyEntranceList> entranceList) {
        this.entranceList = entranceList;
        return this;
    }
    public java.util.List<ListClriskModelsResponseBodyEntranceList> getEntranceList() {
        return this.entranceList;
    }

    public static class ListClriskModelsResponseBodyEntranceListDataNodes extends TeaModel {
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

        @NameInMap("UpdateTime")
        public String updateTime;

        @NameInMap("UpdateUser")
        public String updateUser;

        public static ListClriskModelsResponseBodyEntranceListDataNodes build(java.util.Map<String, ?> map) throws Exception {
            ListClriskModelsResponseBodyEntranceListDataNodes self = new ListClriskModelsResponseBodyEntranceListDataNodes();
            return TeaModel.build(map, self);
        }

        public ListClriskModelsResponseBodyEntranceListDataNodes setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListClriskModelsResponseBodyEntranceListDataNodes setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListClriskModelsResponseBodyEntranceListDataNodes setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListClriskModelsResponseBodyEntranceListDataNodes setNodeCode(String nodeCode) {
            this.nodeCode = nodeCode;
            return this;
        }
        public String getNodeCode() {
            return this.nodeCode;
        }

        public ListClriskModelsResponseBodyEntranceListDataNodes setOdpsProject(String odpsProject) {
            this.odpsProject = odpsProject;
            return this;
        }
        public String getOdpsProject() {
            return this.odpsProject;
        }

        public ListClriskModelsResponseBodyEntranceListDataNodes setTableAuthDescription(String tableAuthDescription) {
            this.tableAuthDescription = tableAuthDescription;
            return this;
        }
        public String getTableAuthDescription() {
            return this.tableAuthDescription;
        }

        public ListClriskModelsResponseBodyEntranceListDataNodes setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

        public ListClriskModelsResponseBodyEntranceListDataNodes setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public ListClriskModelsResponseBodyEntranceListDataNodes setUpdateUser(String updateUser) {
            this.updateUser = updateUser;
            return this;
        }
        public String getUpdateUser() {
            return this.updateUser;
        }

    }

    public static class ListClriskModelsResponseBodyEntranceListExtMap extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static ListClriskModelsResponseBodyEntranceListExtMap build(java.util.Map<String, ?> map) throws Exception {
            ListClriskModelsResponseBodyEntranceListExtMap self = new ListClriskModelsResponseBodyEntranceListExtMap();
            return TeaModel.build(map, self);
        }

        public ListClriskModelsResponseBodyEntranceListExtMap setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListClriskModelsResponseBodyEntranceListExtMap setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListClriskModelsResponseBodyEntranceListOwners extends TeaModel {
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

        public static ListClriskModelsResponseBodyEntranceListOwners build(java.util.Map<String, ?> map) throws Exception {
            ListClriskModelsResponseBodyEntranceListOwners self = new ListClriskModelsResponseBodyEntranceListOwners();
            return TeaModel.build(map, self);
        }

        public ListClriskModelsResponseBodyEntranceListOwners setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public ListClriskModelsResponseBodyEntranceListOwners setLoginName(String loginName) {
            this.loginName = loginName;
            return this;
        }
        public String getLoginName() {
            return this.loginName;
        }

        public ListClriskModelsResponseBodyEntranceListOwners setMobile(String mobile) {
            this.mobile = mobile;
            return this;
        }
        public String getMobile() {
            return this.mobile;
        }

        public ListClriskModelsResponseBodyEntranceListOwners setNickName(String nickName) {
            this.nickName = nickName;
            return this;
        }
        public String getNickName() {
            return this.nickName;
        }

        public ListClriskModelsResponseBodyEntranceListOwners setOriginId(String originId) {
            this.originId = originId;
            return this;
        }
        public String getOriginId() {
            return this.originId;
        }

        public ListClriskModelsResponseBodyEntranceListOwners setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListClriskModelsResponseBodyEntranceListLastModifier extends TeaModel {
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

        public static ListClriskModelsResponseBodyEntranceListLastModifier build(java.util.Map<String, ?> map) throws Exception {
            ListClriskModelsResponseBodyEntranceListLastModifier self = new ListClriskModelsResponseBodyEntranceListLastModifier();
            return TeaModel.build(map, self);
        }

        public ListClriskModelsResponseBodyEntranceListLastModifier setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public ListClriskModelsResponseBodyEntranceListLastModifier setLoginName(String loginName) {
            this.loginName = loginName;
            return this;
        }
        public String getLoginName() {
            return this.loginName;
        }

        public ListClriskModelsResponseBodyEntranceListLastModifier setMobile(String mobile) {
            this.mobile = mobile;
            return this;
        }
        public String getMobile() {
            return this.mobile;
        }

        public ListClriskModelsResponseBodyEntranceListLastModifier setNickName(String nickName) {
            this.nickName = nickName;
            return this;
        }
        public String getNickName() {
            return this.nickName;
        }

        public ListClriskModelsResponseBodyEntranceListLastModifier setOriginId(String originId) {
            this.originId = originId;
            return this;
        }
        public String getOriginId() {
            return this.originId;
        }

        public ListClriskModelsResponseBodyEntranceListLastModifier setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListClriskModelsResponseBodyEntranceListModifiedColumnRuleCodes extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static ListClriskModelsResponseBodyEntranceListModifiedColumnRuleCodes build(java.util.Map<String, ?> map) throws Exception {
            ListClriskModelsResponseBodyEntranceListModifiedColumnRuleCodes self = new ListClriskModelsResponseBodyEntranceListModifiedColumnRuleCodes();
            return TeaModel.build(map, self);
        }

        public ListClriskModelsResponseBodyEntranceListModifiedColumnRuleCodes setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListClriskModelsResponseBodyEntranceListModifiedColumnRuleCodes setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListClriskModelsResponseBodyEntranceListModifiedColumn extends TeaModel {
        @NameInMap("ModelConfig")
        public Boolean modelConfig;

        @NameInMap("RuleCodes")
        public java.util.List<ListClriskModelsResponseBodyEntranceListModifiedColumnRuleCodes> ruleCodes;

        public static ListClriskModelsResponseBodyEntranceListModifiedColumn build(java.util.Map<String, ?> map) throws Exception {
            ListClriskModelsResponseBodyEntranceListModifiedColumn self = new ListClriskModelsResponseBodyEntranceListModifiedColumn();
            return TeaModel.build(map, self);
        }

        public ListClriskModelsResponseBodyEntranceListModifiedColumn setModelConfig(Boolean modelConfig) {
            this.modelConfig = modelConfig;
            return this;
        }
        public Boolean getModelConfig() {
            return this.modelConfig;
        }

        public ListClriskModelsResponseBodyEntranceListModifiedColumn setRuleCodes(java.util.List<ListClriskModelsResponseBodyEntranceListModifiedColumnRuleCodes> ruleCodes) {
            this.ruleCodes = ruleCodes;
            return this;
        }
        public java.util.List<ListClriskModelsResponseBodyEntranceListModifiedColumnRuleCodes> getRuleCodes() {
            return this.ruleCodes;
        }

    }

    public static class ListClriskModelsResponseBodyEntranceList extends TeaModel {
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

        @NameInMap("ProductName")
        public String productName;

        @NameInMap("Status")
        public String status;

        @NameInMap("TriggerDelay")
        public String triggerDelay;

        @NameInMap("TriggerMode")
        public String triggerMode;

        @NameInMap("DataNodes")
        public java.util.List<ListClriskModelsResponseBodyEntranceListDataNodes> dataNodes;

        @NameInMap("ExtMap")
        public java.util.List<ListClriskModelsResponseBodyEntranceListExtMap> extMap;

        @NameInMap("Owners")
        public java.util.List<ListClriskModelsResponseBodyEntranceListOwners> owners;

        @NameInMap("LastModifier")
        public ListClriskModelsResponseBodyEntranceListLastModifier lastModifier;

        @NameInMap("ModifiedColumn")
        public ListClriskModelsResponseBodyEntranceListModifiedColumn modifiedColumn;

        public static ListClriskModelsResponseBodyEntranceList build(java.util.Map<String, ?> map) throws Exception {
            ListClriskModelsResponseBodyEntranceList self = new ListClriskModelsResponseBodyEntranceList();
            return TeaModel.build(map, self);
        }

        public ListClriskModelsResponseBodyEntranceList setCurrentOwner(Boolean currentOwner) {
            this.currentOwner = currentOwner;
            return this;
        }
        public Boolean getCurrentOwner() {
            return this.currentOwner;
        }

        public ListClriskModelsResponseBodyEntranceList setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListClriskModelsResponseBodyEntranceList setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListClriskModelsResponseBodyEntranceList setMemo(String memo) {
            this.memo = memo;
            return this;
        }
        public String getMemo() {
            return this.memo;
        }

        public ListClriskModelsResponseBodyEntranceList setModelCode(String modelCode) {
            this.modelCode = modelCode;
            return this;
        }
        public String getModelCode() {
            return this.modelCode;
        }

        public ListClriskModelsResponseBodyEntranceList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListClriskModelsResponseBodyEntranceList setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

        public ListClriskModelsResponseBodyEntranceList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListClriskModelsResponseBodyEntranceList setTriggerDelay(String triggerDelay) {
            this.triggerDelay = triggerDelay;
            return this;
        }
        public String getTriggerDelay() {
            return this.triggerDelay;
        }

        public ListClriskModelsResponseBodyEntranceList setTriggerMode(String triggerMode) {
            this.triggerMode = triggerMode;
            return this;
        }
        public String getTriggerMode() {
            return this.triggerMode;
        }

        public ListClriskModelsResponseBodyEntranceList setDataNodes(java.util.List<ListClriskModelsResponseBodyEntranceListDataNodes> dataNodes) {
            this.dataNodes = dataNodes;
            return this;
        }
        public java.util.List<ListClriskModelsResponseBodyEntranceListDataNodes> getDataNodes() {
            return this.dataNodes;
        }

        public ListClriskModelsResponseBodyEntranceList setExtMap(java.util.List<ListClriskModelsResponseBodyEntranceListExtMap> extMap) {
            this.extMap = extMap;
            return this;
        }
        public java.util.List<ListClriskModelsResponseBodyEntranceListExtMap> getExtMap() {
            return this.extMap;
        }

        public ListClriskModelsResponseBodyEntranceList setOwners(java.util.List<ListClriskModelsResponseBodyEntranceListOwners> owners) {
            this.owners = owners;
            return this;
        }
        public java.util.List<ListClriskModelsResponseBodyEntranceListOwners> getOwners() {
            return this.owners;
        }

        public ListClriskModelsResponseBodyEntranceList setLastModifier(ListClriskModelsResponseBodyEntranceListLastModifier lastModifier) {
            this.lastModifier = lastModifier;
            return this;
        }
        public ListClriskModelsResponseBodyEntranceListLastModifier getLastModifier() {
            return this.lastModifier;
        }

        public ListClriskModelsResponseBodyEntranceList setModifiedColumn(ListClriskModelsResponseBodyEntranceListModifiedColumn modifiedColumn) {
            this.modifiedColumn = modifiedColumn;
            return this;
        }
        public ListClriskModelsResponseBodyEntranceListModifiedColumn getModifiedColumn() {
            return this.modifiedColumn;
        }

    }

}
