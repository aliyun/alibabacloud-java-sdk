// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class ListActiveGroupsResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ListActiveGroupsResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListActiveGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListActiveGroupsResponseBody self = new ListActiveGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListActiveGroupsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListActiveGroupsResponseBody setData(ListActiveGroupsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListActiveGroupsResponseBodyData getData() {
        return this.data;
    }

    public ListActiveGroupsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListActiveGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListActiveGroupsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListActiveGroupsResponseBodyDataGroupList extends TeaModel {
        @NameInMap("AppCode")
        public String appCode;

        @NameInMap("AppVersion")
        public String appVersion;

        @NameInMap("Config")
        public String config;

        @NameInMap("Description")
        public String description;

        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("GmtModified")
        public Long gmtModified;

        @NameInMap("GroupId")
        public Long groupId;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Modifier")
        public String modifier;

        @NameInMap("Name")
        public String name;

        @NameInMap("ShopId")
        public String shopId;

        @NameInMap("Status")
        public Integer status;

        public static ListActiveGroupsResponseBodyDataGroupList build(java.util.Map<String, ?> map) throws Exception {
            ListActiveGroupsResponseBodyDataGroupList self = new ListActiveGroupsResponseBodyDataGroupList();
            return TeaModel.build(map, self);
        }

        public ListActiveGroupsResponseBodyDataGroupList setAppCode(String appCode) {
            this.appCode = appCode;
            return this;
        }
        public String getAppCode() {
            return this.appCode;
        }

        public ListActiveGroupsResponseBodyDataGroupList setAppVersion(String appVersion) {
            this.appVersion = appVersion;
            return this;
        }
        public String getAppVersion() {
            return this.appVersion;
        }

        public ListActiveGroupsResponseBodyDataGroupList setConfig(String config) {
            this.config = config;
            return this;
        }
        public String getConfig() {
            return this.config;
        }

        public ListActiveGroupsResponseBodyDataGroupList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListActiveGroupsResponseBodyDataGroupList setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public ListActiveGroupsResponseBodyDataGroupList setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public ListActiveGroupsResponseBodyDataGroupList setGroupId(Long groupId) {
            this.groupId = groupId;
            return this;
        }
        public Long getGroupId() {
            return this.groupId;
        }

        public ListActiveGroupsResponseBodyDataGroupList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListActiveGroupsResponseBodyDataGroupList setModifier(String modifier) {
            this.modifier = modifier;
            return this;
        }
        public String getModifier() {
            return this.modifier;
        }

        public ListActiveGroupsResponseBodyDataGroupList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListActiveGroupsResponseBodyDataGroupList setShopId(String shopId) {
            this.shopId = shopId;
            return this;
        }
        public String getShopId() {
            return this.shopId;
        }

        public ListActiveGroupsResponseBodyDataGroupList setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

    }

    public static class ListActiveGroupsResponseBodyData extends TeaModel {
        @NameInMap("GroupList")
        public java.util.List<ListActiveGroupsResponseBodyDataGroupList> groupList;

        @NameInMap("PageNo")
        public Integer pageNo;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalPage")
        public Integer totalPage;

        @NameInMap("TotalSize")
        public Long totalSize;

        public static ListActiveGroupsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListActiveGroupsResponseBodyData self = new ListActiveGroupsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListActiveGroupsResponseBodyData setGroupList(java.util.List<ListActiveGroupsResponseBodyDataGroupList> groupList) {
            this.groupList = groupList;
            return this;
        }
        public java.util.List<ListActiveGroupsResponseBodyDataGroupList> getGroupList() {
            return this.groupList;
        }

        public ListActiveGroupsResponseBodyData setPageNo(Integer pageNo) {
            this.pageNo = pageNo;
            return this;
        }
        public Integer getPageNo() {
            return this.pageNo;
        }

        public ListActiveGroupsResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListActiveGroupsResponseBodyData setTotalPage(Integer totalPage) {
            this.totalPage = totalPage;
            return this;
        }
        public Integer getTotalPage() {
            return this.totalPage;
        }

        public ListActiveGroupsResponseBodyData setTotalSize(Long totalSize) {
            this.totalSize = totalSize;
            return this;
        }
        public Long getTotalSize() {
            return this.totalSize;
        }

    }

}
