// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetModuleConfigResponseBody extends TeaModel {
    /**
     * <p>The response code returned.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>An array that consists of the configurations of the module.</p>
     */
    @NameInMap("ModuleConfigList")
    public java.util.List<GetModuleConfigResponseBodyModuleConfigList> moduleConfigList;

    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("PageInfo")
    public GetModuleConfigResponseBodyPageInfo pageInfo;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>291B49F9-1685-4005-9D34-606B6F78****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <p>The ID of the server group to which the server belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>5562414</p>
         */
        @NameInMap("GroupId")
        public Integer groupId;

        /**
         * <p>The instance ID of the server.</p>
         * 
         * <strong>example:</strong>
         * <p>i-uf6435dn4t59b9av****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The instance name of the server.</p>
         * 
         * <strong>example:</strong>
         * <p>inStanceName****</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The IP address of the server.</p>
         * 
         * <strong>example:</strong>
         * <p>2.2.X.X</p>
         */
        @NameInMap("Ip")
        public String ip;

        /**
         * <p>The region in which the server resides.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>The UUID of the server.</p>
         * 
         * <strong>example:</strong>
         * <p>a47e3713-ed22-4015-93a3-d88ebe6****</p>
         */
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
        /**
         * <p>The name of the configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>timescan</p>
         */
        @NameInMap("ConfigName")
        public String configName;

        /**
         * <p>An array that consists of the configuration items.</p>
         */
        @NameInMap("Items")
        public java.util.List<GetModuleConfigResponseBodyModuleConfigListItems> items;

        /**
         * <p>The name of the module.</p>
         * 
         * <strong>example:</strong>
         * <p>alihids</p>
         */
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
        /**
         * <p>The number of entries returned on the current page.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
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
