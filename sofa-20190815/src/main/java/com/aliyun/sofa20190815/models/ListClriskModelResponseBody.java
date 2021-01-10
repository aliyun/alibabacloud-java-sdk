// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListClriskModelResponseBody extends TeaModel {
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
    public java.util.List<ListClriskModelResponseBodyEntranceList> entranceList;

    public static ListClriskModelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListClriskModelResponseBody self = new ListClriskModelResponseBody();
        return TeaModel.build(map, self);
    }

    public ListClriskModelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListClriskModelResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListClriskModelResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ListClriskModelResponseBody setPageCount(Long pageCount) {
        this.pageCount = pageCount;
        return this;
    }
    public Long getPageCount() {
        return this.pageCount;
    }

    public ListClriskModelResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListClriskModelResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListClriskModelResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public ListClriskModelResponseBody setEntranceList(java.util.List<ListClriskModelResponseBodyEntranceList> entranceList) {
        this.entranceList = entranceList;
        return this;
    }
    public java.util.List<ListClriskModelResponseBodyEntranceList> getEntranceList() {
        return this.entranceList;
    }

    public static class ListClriskModelResponseBodyEntranceListDataNodes extends TeaModel {
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

        public static ListClriskModelResponseBodyEntranceListDataNodes build(java.util.Map<String, ?> map) throws Exception {
            ListClriskModelResponseBodyEntranceListDataNodes self = new ListClriskModelResponseBodyEntranceListDataNodes();
            return TeaModel.build(map, self);
        }

        public ListClriskModelResponseBodyEntranceListDataNodes setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListClriskModelResponseBodyEntranceListDataNodes setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListClriskModelResponseBodyEntranceListDataNodes setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListClriskModelResponseBodyEntranceListDataNodes setNodeCode(String nodeCode) {
            this.nodeCode = nodeCode;
            return this;
        }
        public String getNodeCode() {
            return this.nodeCode;
        }

        public ListClriskModelResponseBodyEntranceListDataNodes setOdpsProject(String odpsProject) {
            this.odpsProject = odpsProject;
            return this;
        }
        public String getOdpsProject() {
            return this.odpsProject;
        }

        public ListClriskModelResponseBodyEntranceListDataNodes setTableAuthDescription(String tableAuthDescription) {
            this.tableAuthDescription = tableAuthDescription;
            return this;
        }
        public String getTableAuthDescription() {
            return this.tableAuthDescription;
        }

        public ListClriskModelResponseBodyEntranceListDataNodes setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

        public ListClriskModelResponseBodyEntranceListDataNodes setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListClriskModelResponseBodyEntranceListDataNodes setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public ListClriskModelResponseBodyEntranceListDataNodes setUpdateUser(String updateUser) {
            this.updateUser = updateUser;
            return this;
        }
        public String getUpdateUser() {
            return this.updateUser;
        }

    }

    public static class ListClriskModelResponseBodyEntranceListExtMap extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static ListClriskModelResponseBodyEntranceListExtMap build(java.util.Map<String, ?> map) throws Exception {
            ListClriskModelResponseBodyEntranceListExtMap self = new ListClriskModelResponseBodyEntranceListExtMap();
            return TeaModel.build(map, self);
        }

        public ListClriskModelResponseBodyEntranceListExtMap setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListClriskModelResponseBodyEntranceListExtMap setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListClriskModelResponseBodyEntranceListOwners extends TeaModel {
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

        public static ListClriskModelResponseBodyEntranceListOwners build(java.util.Map<String, ?> map) throws Exception {
            ListClriskModelResponseBodyEntranceListOwners self = new ListClriskModelResponseBodyEntranceListOwners();
            return TeaModel.build(map, self);
        }

        public ListClriskModelResponseBodyEntranceListOwners setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public ListClriskModelResponseBodyEntranceListOwners setLoginName(String loginName) {
            this.loginName = loginName;
            return this;
        }
        public String getLoginName() {
            return this.loginName;
        }

        public ListClriskModelResponseBodyEntranceListOwners setMobile(String mobile) {
            this.mobile = mobile;
            return this;
        }
        public String getMobile() {
            return this.mobile;
        }

        public ListClriskModelResponseBodyEntranceListOwners setNickName(String nickName) {
            this.nickName = nickName;
            return this;
        }
        public String getNickName() {
            return this.nickName;
        }

        public ListClriskModelResponseBodyEntranceListOwners setOriginId(String originId) {
            this.originId = originId;
            return this;
        }
        public String getOriginId() {
            return this.originId;
        }

        public ListClriskModelResponseBodyEntranceListOwners setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListClriskModelResponseBodyEntranceListLastModifier extends TeaModel {
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

        public static ListClriskModelResponseBodyEntranceListLastModifier build(java.util.Map<String, ?> map) throws Exception {
            ListClriskModelResponseBodyEntranceListLastModifier self = new ListClriskModelResponseBodyEntranceListLastModifier();
            return TeaModel.build(map, self);
        }

        public ListClriskModelResponseBodyEntranceListLastModifier setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public ListClriskModelResponseBodyEntranceListLastModifier setLoginName(String loginName) {
            this.loginName = loginName;
            return this;
        }
        public String getLoginName() {
            return this.loginName;
        }

        public ListClriskModelResponseBodyEntranceListLastModifier setMobile(String mobile) {
            this.mobile = mobile;
            return this;
        }
        public String getMobile() {
            return this.mobile;
        }

        public ListClriskModelResponseBodyEntranceListLastModifier setNickName(String nickName) {
            this.nickName = nickName;
            return this;
        }
        public String getNickName() {
            return this.nickName;
        }

        public ListClriskModelResponseBodyEntranceListLastModifier setOriginId(String originId) {
            this.originId = originId;
            return this;
        }
        public String getOriginId() {
            return this.originId;
        }

        public ListClriskModelResponseBodyEntranceListLastModifier setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListClriskModelResponseBodyEntranceListModifiedColumnRuleCodes extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static ListClriskModelResponseBodyEntranceListModifiedColumnRuleCodes build(java.util.Map<String, ?> map) throws Exception {
            ListClriskModelResponseBodyEntranceListModifiedColumnRuleCodes self = new ListClriskModelResponseBodyEntranceListModifiedColumnRuleCodes();
            return TeaModel.build(map, self);
        }

        public ListClriskModelResponseBodyEntranceListModifiedColumnRuleCodes setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListClriskModelResponseBodyEntranceListModifiedColumnRuleCodes setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListClriskModelResponseBodyEntranceListModifiedColumn extends TeaModel {
        @NameInMap("ModelConfig")
        public Boolean modelConfig;

        @NameInMap("RuleCodes")
        public java.util.List<ListClriskModelResponseBodyEntranceListModifiedColumnRuleCodes> ruleCodes;

        public static ListClriskModelResponseBodyEntranceListModifiedColumn build(java.util.Map<String, ?> map) throws Exception {
            ListClriskModelResponseBodyEntranceListModifiedColumn self = new ListClriskModelResponseBodyEntranceListModifiedColumn();
            return TeaModel.build(map, self);
        }

        public ListClriskModelResponseBodyEntranceListModifiedColumn setModelConfig(Boolean modelConfig) {
            this.modelConfig = modelConfig;
            return this;
        }
        public Boolean getModelConfig() {
            return this.modelConfig;
        }

        public ListClriskModelResponseBodyEntranceListModifiedColumn setRuleCodes(java.util.List<ListClriskModelResponseBodyEntranceListModifiedColumnRuleCodes> ruleCodes) {
            this.ruleCodes = ruleCodes;
            return this;
        }
        public java.util.List<ListClriskModelResponseBodyEntranceListModifiedColumnRuleCodes> getRuleCodes() {
            return this.ruleCodes;
        }

    }

    public static class ListClriskModelResponseBodyEntranceList extends TeaModel {
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
        public java.util.List<ListClriskModelResponseBodyEntranceListDataNodes> dataNodes;

        @NameInMap("ExtMap")
        public java.util.List<ListClriskModelResponseBodyEntranceListExtMap> extMap;

        @NameInMap("Owners")
        public java.util.List<ListClriskModelResponseBodyEntranceListOwners> owners;

        @NameInMap("LastModifier")
        public ListClriskModelResponseBodyEntranceListLastModifier lastModifier;

        @NameInMap("ModifiedColumn")
        public ListClriskModelResponseBodyEntranceListModifiedColumn modifiedColumn;

        public static ListClriskModelResponseBodyEntranceList build(java.util.Map<String, ?> map) throws Exception {
            ListClriskModelResponseBodyEntranceList self = new ListClriskModelResponseBodyEntranceList();
            return TeaModel.build(map, self);
        }

        public ListClriskModelResponseBodyEntranceList setCurrentOwner(Boolean currentOwner) {
            this.currentOwner = currentOwner;
            return this;
        }
        public Boolean getCurrentOwner() {
            return this.currentOwner;
        }

        public ListClriskModelResponseBodyEntranceList setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListClriskModelResponseBodyEntranceList setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListClriskModelResponseBodyEntranceList setMemo(String memo) {
            this.memo = memo;
            return this;
        }
        public String getMemo() {
            return this.memo;
        }

        public ListClriskModelResponseBodyEntranceList setModelCode(String modelCode) {
            this.modelCode = modelCode;
            return this;
        }
        public String getModelCode() {
            return this.modelCode;
        }

        public ListClriskModelResponseBodyEntranceList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListClriskModelResponseBodyEntranceList setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

        public ListClriskModelResponseBodyEntranceList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListClriskModelResponseBodyEntranceList setTriggerDelay(String triggerDelay) {
            this.triggerDelay = triggerDelay;
            return this;
        }
        public String getTriggerDelay() {
            return this.triggerDelay;
        }

        public ListClriskModelResponseBodyEntranceList setTriggerMode(String triggerMode) {
            this.triggerMode = triggerMode;
            return this;
        }
        public String getTriggerMode() {
            return this.triggerMode;
        }

        public ListClriskModelResponseBodyEntranceList setDataNodes(java.util.List<ListClriskModelResponseBodyEntranceListDataNodes> dataNodes) {
            this.dataNodes = dataNodes;
            return this;
        }
        public java.util.List<ListClriskModelResponseBodyEntranceListDataNodes> getDataNodes() {
            return this.dataNodes;
        }

        public ListClriskModelResponseBodyEntranceList setExtMap(java.util.List<ListClriskModelResponseBodyEntranceListExtMap> extMap) {
            this.extMap = extMap;
            return this;
        }
        public java.util.List<ListClriskModelResponseBodyEntranceListExtMap> getExtMap() {
            return this.extMap;
        }

        public ListClriskModelResponseBodyEntranceList setOwners(java.util.List<ListClriskModelResponseBodyEntranceListOwners> owners) {
            this.owners = owners;
            return this;
        }
        public java.util.List<ListClriskModelResponseBodyEntranceListOwners> getOwners() {
            return this.owners;
        }

        public ListClriskModelResponseBodyEntranceList setLastModifier(ListClriskModelResponseBodyEntranceListLastModifier lastModifier) {
            this.lastModifier = lastModifier;
            return this;
        }
        public ListClriskModelResponseBodyEntranceListLastModifier getLastModifier() {
            return this.lastModifier;
        }

        public ListClriskModelResponseBodyEntranceList setModifiedColumn(ListClriskModelResponseBodyEntranceListModifiedColumn modifiedColumn) {
            this.modifiedColumn = modifiedColumn;
            return this;
        }
        public ListClriskModelResponseBodyEntranceListModifiedColumn getModifiedColumn() {
            return this.modifiedColumn;
        }

    }

}
