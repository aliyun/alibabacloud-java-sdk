// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetClriskDataNodeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Description")
    public String description;

    @NameInMap("Id")
    public String id;

    @NameInMap("Name")
    public String name;

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

    @NameInMap("RelatedEntranceList")
    public java.util.List<GetClriskDataNodeResponseBodyRelatedEntranceList> relatedEntranceList;

    public static GetClriskDataNodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetClriskDataNodeResponseBody self = new GetClriskDataNodeResponseBody();
        return TeaModel.build(map, self);
    }

    public GetClriskDataNodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetClriskDataNodeResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetClriskDataNodeResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetClriskDataNodeResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public GetClriskDataNodeResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public GetClriskDataNodeResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetClriskDataNodeResponseBody setOdpsProject(String odpsProject) {
        this.odpsProject = odpsProject;
        return this;
    }
    public String getOdpsProject() {
        return this.odpsProject;
    }

    public GetClriskDataNodeResponseBody setTableAuthDescription(String tableAuthDescription) {
        this.tableAuthDescription = tableAuthDescription;
        return this;
    }
    public String getTableAuthDescription() {
        return this.tableAuthDescription;
    }

    public GetClriskDataNodeResponseBody setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

    public GetClriskDataNodeResponseBody setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

    public GetClriskDataNodeResponseBody setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
        return this;
    }
    public String getUpdateUser() {
        return this.updateUser;
    }

    public GetClriskDataNodeResponseBody setRelatedEntranceList(java.util.List<GetClriskDataNodeResponseBodyRelatedEntranceList> relatedEntranceList) {
        this.relatedEntranceList = relatedEntranceList;
        return this;
    }
    public java.util.List<GetClriskDataNodeResponseBodyRelatedEntranceList> getRelatedEntranceList() {
        return this.relatedEntranceList;
    }

    public static class GetClriskDataNodeResponseBodyRelatedEntranceList extends TeaModel {
        @NameInMap("Id")
        public String id;

        @NameInMap("ModelCode")
        public String modelCode;

        @NameInMap("Name")
        public String name;

        @NameInMap("Url")
        public String url;

        public static GetClriskDataNodeResponseBodyRelatedEntranceList build(java.util.Map<String, ?> map) throws Exception {
            GetClriskDataNodeResponseBodyRelatedEntranceList self = new GetClriskDataNodeResponseBodyRelatedEntranceList();
            return TeaModel.build(map, self);
        }

        public GetClriskDataNodeResponseBodyRelatedEntranceList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetClriskDataNodeResponseBodyRelatedEntranceList setModelCode(String modelCode) {
            this.modelCode = modelCode;
            return this;
        }
        public String getModelCode() {
            return this.modelCode;
        }

        public GetClriskDataNodeResponseBodyRelatedEntranceList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetClriskDataNodeResponseBodyRelatedEntranceList setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
