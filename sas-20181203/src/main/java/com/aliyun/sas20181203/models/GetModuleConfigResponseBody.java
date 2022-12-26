// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetModuleConfigResponseBody extends TeaModel {
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("ModuleConfigList")
    public java.util.List<GetModuleConfigResponseBodyModuleConfigList> moduleConfigList;

    @NameInMap("PageInfo")
    public GetModuleConfigResponseBodyPageInfo pageInfo;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetModuleConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetModuleConfigResponseBody self = new GetModuleConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public GetModuleConfigResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetModuleConfigResponseBody setModuleConfigList(java.util.List<GetModuleConfigResponseBodyModuleConfigList> moduleConfigList) {
        this.moduleConfigList = moduleConfigList;
        return this;
    }
    public java.util.List<GetModuleConfigResponseBodyModuleConfigList> getModuleConfigList() {
        return this.moduleConfigList;
    }

    public GetModuleConfigResponseBody setPageInfo(GetModuleConfigResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public GetModuleConfigResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public GetModuleConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetModuleConfigResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetModuleConfigResponseBodyModuleConfigListItems extends TeaModel {
        @NameInMap("GroupId")
        public Integer groupId;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("Ip")
        public String ip;

        @NameInMap("Region")
        public String region;

        @NameInMap("Uuid")
        public String uuid;

        public static GetModuleConfigResponseBodyModuleConfigListItems build(java.util.Map<String, ?> map) throws Exception {
            GetModuleConfigResponseBodyModuleConfigListItems self = new GetModuleConfigResponseBodyModuleConfigListItems();
            return TeaModel.build(map, self);
        }

        public GetModuleConfigResponseBodyModuleConfigListItems setGroupId(Integer groupId) {
            this.groupId = groupId;
            return this;
        }
        public Integer getGroupId() {
            return this.groupId;
        }

        public GetModuleConfigResponseBodyModuleConfigListItems setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetModuleConfigResponseBodyModuleConfigListItems setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public GetModuleConfigResponseBodyModuleConfigListItems setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public GetModuleConfigResponseBodyModuleConfigListItems setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public GetModuleConfigResponseBodyModuleConfigListItems setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

    public static class GetModuleConfigResponseBodyModuleConfigList extends TeaModel {
        @NameInMap("ConfigName")
        public String configName;

        @NameInMap("Items")
        public java.util.List<GetModuleConfigResponseBodyModuleConfigListItems> items;

        @NameInMap("ModuleName")
        public String moduleName;

        public static GetModuleConfigResponseBodyModuleConfigList build(java.util.Map<String, ?> map) throws Exception {
            GetModuleConfigResponseBodyModuleConfigList self = new GetModuleConfigResponseBodyModuleConfigList();
            return TeaModel.build(map, self);
        }

        public GetModuleConfigResponseBodyModuleConfigList setConfigName(String configName) {
            this.configName = configName;
            return this;
        }
        public String getConfigName() {
            return this.configName;
        }

        public GetModuleConfigResponseBodyModuleConfigList setItems(java.util.List<GetModuleConfigResponseBodyModuleConfigListItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<GetModuleConfigResponseBodyModuleConfigListItems> getItems() {
            return this.items;
        }

        public GetModuleConfigResponseBodyModuleConfigList setModuleName(String moduleName) {
            this.moduleName = moduleName;
            return this;
        }
        public String getModuleName() {
            return this.moduleName;
        }

    }

    public static class GetModuleConfigResponseBodyPageInfo extends TeaModel {
        @NameInMap("Count")
        public Integer count;

        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static GetModuleConfigResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            GetModuleConfigResponseBodyPageInfo self = new GetModuleConfigResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public GetModuleConfigResponseBodyPageInfo setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public GetModuleConfigResponseBodyPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public GetModuleConfigResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public GetModuleConfigResponseBodyPageInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
