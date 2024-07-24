// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class ListDataSetResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>23</p>
     */
    @NameInMap("Count")
    public Integer count;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("Data")
    public ListDataSetResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    @NameInMap("Messages")
    public ListDataSetResponseBodyMessages messages;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>96138D8D-8D26-4E41-BFF4-77AED1088BBD</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListDataSetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDataSetResponseBody self = new ListDataSetResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDataSetResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListDataSetResponseBody setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public ListDataSetResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListDataSetResponseBody setData(ListDataSetResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListDataSetResponseBodyData getData() {
        return this.data;
    }

    public ListDataSetResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListDataSetResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListDataSetResponseBody setMessages(ListDataSetResponseBodyMessages messages) {
        this.messages = messages;
        return this;
    }
    public ListDataSetResponseBodyMessages getMessages() {
        return this.messages;
    }

    public ListDataSetResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListDataSetResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListDataSetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDataSetResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListDataSetResponseBodyDataData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AutoTranscoding")
        public Integer autoTranscoding;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ChannelId0")
        public Integer channelId0;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ChannelId1")
        public Integer channelId1;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ChannelType")
        public Integer channelType;

        /**
         * <strong>example:</strong>
         * <p>2019-06-20T17:33Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CreateType")
        public Integer createType;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("DataSetType")
        public Integer dataSetType;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("IsDelete")
        public Integer isDelete;

        /**
         * <strong>example:</strong>
         * <p>filesFromLocal/ef7ff45c147a4a5e882c925f9a75ac43</p>
         */
        @NameInMap("RoleConfigProp")
        public String roleConfigProp;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RoleConfigStatus")
        public Integer roleConfigStatus;

        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("RoleConfigTask")
        public String roleConfigTask;

        /**
         * <strong>example:</strong>
         * <p>“”</p>
         */
        @NameInMap("SetBucketName")
        public String setBucketName;

        /**
         * <strong>example:</strong>
         * <p>“”</p>
         */
        @NameInMap("SetDomain")
        public String setDomain;

        /**
         * <strong>example:</strong>
         * <p>“”</p>
         */
        @NameInMap("SetFolderName")
        public String setFolderName;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SetId")
        public Long setId;

        @NameInMap("SetName")
        public String setName;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SetNumber")
        public Integer setNumber;

        /**
         * <strong>example:</strong>
         * <p>“”</p>
         */
        @NameInMap("SetRoleArn")
        public String setRoleArn;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SetType")
        public Integer setType;

        /**
         * <strong>example:</strong>
         * <p>11</p>
         */
        @NameInMap("SourceDataType")
        public Integer sourceDataType;

        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("SubDir")
        public String subDir;

        /**
         * <strong>example:</strong>
         * <p>2022-05-10T10:34Z</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("UserGroup")
        public String userGroup;

        public static ListDataSetResponseBodyDataData build(java.util.Map<String, ?> map) throws Exception {
            ListDataSetResponseBodyDataData self = new ListDataSetResponseBodyDataData();
            return TeaModel.build(map, self);
        }

        public ListDataSetResponseBodyDataData setAutoTranscoding(Integer autoTranscoding) {
            this.autoTranscoding = autoTranscoding;
            return this;
        }
        public Integer getAutoTranscoding() {
            return this.autoTranscoding;
        }

        public ListDataSetResponseBodyDataData setChannelId0(Integer channelId0) {
            this.channelId0 = channelId0;
            return this;
        }
        public Integer getChannelId0() {
            return this.channelId0;
        }

        public ListDataSetResponseBodyDataData setChannelId1(Integer channelId1) {
            this.channelId1 = channelId1;
            return this;
        }
        public Integer getChannelId1() {
            return this.channelId1;
        }

        public ListDataSetResponseBodyDataData setChannelType(Integer channelType) {
            this.channelType = channelType;
            return this;
        }
        public Integer getChannelType() {
            return this.channelType;
        }

        public ListDataSetResponseBodyDataData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListDataSetResponseBodyDataData setCreateType(Integer createType) {
            this.createType = createType;
            return this;
        }
        public Integer getCreateType() {
            return this.createType;
        }

        public ListDataSetResponseBodyDataData setDataSetType(Integer dataSetType) {
            this.dataSetType = dataSetType;
            return this;
        }
        public Integer getDataSetType() {
            return this.dataSetType;
        }

        public ListDataSetResponseBodyDataData setIsDelete(Integer isDelete) {
            this.isDelete = isDelete;
            return this;
        }
        public Integer getIsDelete() {
            return this.isDelete;
        }

        public ListDataSetResponseBodyDataData setRoleConfigProp(String roleConfigProp) {
            this.roleConfigProp = roleConfigProp;
            return this;
        }
        public String getRoleConfigProp() {
            return this.roleConfigProp;
        }

        public ListDataSetResponseBodyDataData setRoleConfigStatus(Integer roleConfigStatus) {
            this.roleConfigStatus = roleConfigStatus;
            return this;
        }
        public Integer getRoleConfigStatus() {
            return this.roleConfigStatus;
        }

        public ListDataSetResponseBodyDataData setRoleConfigTask(String roleConfigTask) {
            this.roleConfigTask = roleConfigTask;
            return this;
        }
        public String getRoleConfigTask() {
            return this.roleConfigTask;
        }

        public ListDataSetResponseBodyDataData setSetBucketName(String setBucketName) {
            this.setBucketName = setBucketName;
            return this;
        }
        public String getSetBucketName() {
            return this.setBucketName;
        }

        public ListDataSetResponseBodyDataData setSetDomain(String setDomain) {
            this.setDomain = setDomain;
            return this;
        }
        public String getSetDomain() {
            return this.setDomain;
        }

        public ListDataSetResponseBodyDataData setSetFolderName(String setFolderName) {
            this.setFolderName = setFolderName;
            return this;
        }
        public String getSetFolderName() {
            return this.setFolderName;
        }

        public ListDataSetResponseBodyDataData setSetId(Long setId) {
            this.setId = setId;
            return this;
        }
        public Long getSetId() {
            return this.setId;
        }

        public ListDataSetResponseBodyDataData setSetName(String setName) {
            this.setName = setName;
            return this;
        }
        public String getSetName() {
            return this.setName;
        }

        public ListDataSetResponseBodyDataData setSetNumber(Integer setNumber) {
            this.setNumber = setNumber;
            return this;
        }
        public Integer getSetNumber() {
            return this.setNumber;
        }

        public ListDataSetResponseBodyDataData setSetRoleArn(String setRoleArn) {
            this.setRoleArn = setRoleArn;
            return this;
        }
        public String getSetRoleArn() {
            return this.setRoleArn;
        }

        public ListDataSetResponseBodyDataData setSetType(Integer setType) {
            this.setType = setType;
            return this;
        }
        public Integer getSetType() {
            return this.setType;
        }

        public ListDataSetResponseBodyDataData setSourceDataType(Integer sourceDataType) {
            this.sourceDataType = sourceDataType;
            return this;
        }
        public Integer getSourceDataType() {
            return this.sourceDataType;
        }

        public ListDataSetResponseBodyDataData setSubDir(String subDir) {
            this.subDir = subDir;
            return this;
        }
        public String getSubDir() {
            return this.subDir;
        }

        public ListDataSetResponseBodyDataData setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public ListDataSetResponseBodyDataData setUserGroup(String userGroup) {
            this.userGroup = userGroup;
            return this;
        }
        public String getUserGroup() {
            return this.userGroup;
        }

    }

    public static class ListDataSetResponseBodyData extends TeaModel {
        @NameInMap("Data")
        public java.util.List<ListDataSetResponseBodyDataData> data;

        public static ListDataSetResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListDataSetResponseBodyData self = new ListDataSetResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListDataSetResponseBodyData setData(java.util.List<ListDataSetResponseBodyDataData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<ListDataSetResponseBodyDataData> getData() {
            return this.data;
        }

    }

    public static class ListDataSetResponseBodyMessages extends TeaModel {
        @NameInMap("Message")
        public java.util.List<String> message;

        public static ListDataSetResponseBodyMessages build(java.util.Map<String, ?> map) throws Exception {
            ListDataSetResponseBodyMessages self = new ListDataSetResponseBodyMessages();
            return TeaModel.build(map, self);
        }

        public ListDataSetResponseBodyMessages setMessage(java.util.List<String> message) {
            this.message = message;
            return this;
        }
        public java.util.List<String> getMessage() {
            return this.message;
        }

    }

}
