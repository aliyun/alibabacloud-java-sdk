// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class ListApplicationsResponseBody extends TeaModel {
    /**
     * <p>Queries applications.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>20</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The queried applications.</p>
     */
    @NameInMap("Data")
    public ListApplicationsResponseBodyData data;

    /**
     * <p>The number of entries returned on each page.</p>
     * 
     * <strong>example:</strong>
     * <p>The ID of the request.</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>20</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>cn-beijing:demo</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The number of entries returned on each page.</p>
     * 
     * <strong>example:</strong>
     * <p>B4D805CA-926D-41B1-8E63-7AD0C1ED****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>1</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>demo-app</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("TotalSize")
    public Integer totalSize;

    public static ListApplicationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListApplicationsResponseBody self = new ListApplicationsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListApplicationsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListApplicationsResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListApplicationsResponseBody setData(ListApplicationsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListApplicationsResponseBodyData getData() {
        return this.data;
    }

    public ListApplicationsResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListApplicationsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListApplicationsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListApplicationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListApplicationsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListApplicationsResponseBody setTotalSize(Integer totalSize) {
        this.totalSize = totalSize;
        return this;
    }
    public Integer getTotalSize() {
        return this.totalSize;
    }

    public static class ListApplicationsResponseBodyDataApplicationsChildrenTags extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static ListApplicationsResponseBodyDataApplicationsChildrenTags build(java.util.Map<String, ?> map) throws Exception {
            ListApplicationsResponseBodyDataApplicationsChildrenTags self = new ListApplicationsResponseBodyDataApplicationsChildrenTags();
            return TeaModel.build(map, self);
        }

        public ListApplicationsResponseBodyDataApplicationsChildrenTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListApplicationsResponseBodyDataApplicationsChildrenTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListApplicationsResponseBodyDataApplicationsChildren extends TeaModel {
        @NameInMap("AppDeletingStatus")
        public Boolean appDeletingStatus;

        @NameInMap("AppDescription")
        public String appDescription;

        @NameInMap("AppId")
        public String appId;

        @NameInMap("AppName")
        public String appName;

        @NameInMap("AppType")
        public String appType;

        @NameInMap("BaseAppId")
        public String baseAppId;

        @NameInMap("Cpu")
        public Integer cpu;

        @NameInMap("Instances")
        public Integer instances;

        @NameInMap("Mem")
        public Integer mem;

        @NameInMap("MseEnabled")
        public Boolean mseEnabled;

        @NameInMap("NamespaceId")
        public String namespaceId;

        @NameInMap("NamespaceName")
        public String namespaceName;

        @NameInMap("NewSaeVersion")
        public String newSaeVersion;

        @NameInMap("ProgrammingLanguage")
        public String programmingLanguage;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("RunningInstances")
        public Integer runningInstances;

        @NameInMap("ScaleRuleEnabled")
        public Boolean scaleRuleEnabled;

        @NameInMap("ScaleRuleType")
        public String scaleRuleType;

        @NameInMap("Tags")
        public java.util.List<ListApplicationsResponseBodyDataApplicationsChildrenTags> tags;

        public static ListApplicationsResponseBodyDataApplicationsChildren build(java.util.Map<String, ?> map) throws Exception {
            ListApplicationsResponseBodyDataApplicationsChildren self = new ListApplicationsResponseBodyDataApplicationsChildren();
            return TeaModel.build(map, self);
        }

        public ListApplicationsResponseBodyDataApplicationsChildren setAppDeletingStatus(Boolean appDeletingStatus) {
            this.appDeletingStatus = appDeletingStatus;
            return this;
        }
        public Boolean getAppDeletingStatus() {
            return this.appDeletingStatus;
        }

        public ListApplicationsResponseBodyDataApplicationsChildren setAppDescription(String appDescription) {
            this.appDescription = appDescription;
            return this;
        }
        public String getAppDescription() {
            return this.appDescription;
        }

        public ListApplicationsResponseBodyDataApplicationsChildren setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public ListApplicationsResponseBodyDataApplicationsChildren setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public ListApplicationsResponseBodyDataApplicationsChildren setAppType(String appType) {
            this.appType = appType;
            return this;
        }
        public String getAppType() {
            return this.appType;
        }

        public ListApplicationsResponseBodyDataApplicationsChildren setBaseAppId(String baseAppId) {
            this.baseAppId = baseAppId;
            return this;
        }
        public String getBaseAppId() {
            return this.baseAppId;
        }

        public ListApplicationsResponseBodyDataApplicationsChildren setCpu(Integer cpu) {
            this.cpu = cpu;
            return this;
        }
        public Integer getCpu() {
            return this.cpu;
        }

        public ListApplicationsResponseBodyDataApplicationsChildren setInstances(Integer instances) {
            this.instances = instances;
            return this;
        }
        public Integer getInstances() {
            return this.instances;
        }

        public ListApplicationsResponseBodyDataApplicationsChildren setMem(Integer mem) {
            this.mem = mem;
            return this;
        }
        public Integer getMem() {
            return this.mem;
        }

        public ListApplicationsResponseBodyDataApplicationsChildren setMseEnabled(Boolean mseEnabled) {
            this.mseEnabled = mseEnabled;
            return this;
        }
        public Boolean getMseEnabled() {
            return this.mseEnabled;
        }

        public ListApplicationsResponseBodyDataApplicationsChildren setNamespaceId(String namespaceId) {
            this.namespaceId = namespaceId;
            return this;
        }
        public String getNamespaceId() {
            return this.namespaceId;
        }

        public ListApplicationsResponseBodyDataApplicationsChildren setNamespaceName(String namespaceName) {
            this.namespaceName = namespaceName;
            return this;
        }
        public String getNamespaceName() {
            return this.namespaceName;
        }

        public ListApplicationsResponseBodyDataApplicationsChildren setNewSaeVersion(String newSaeVersion) {
            this.newSaeVersion = newSaeVersion;
            return this;
        }
        public String getNewSaeVersion() {
            return this.newSaeVersion;
        }

        public ListApplicationsResponseBodyDataApplicationsChildren setProgrammingLanguage(String programmingLanguage) {
            this.programmingLanguage = programmingLanguage;
            return this;
        }
        public String getProgrammingLanguage() {
            return this.programmingLanguage;
        }

        public ListApplicationsResponseBodyDataApplicationsChildren setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListApplicationsResponseBodyDataApplicationsChildren setRunningInstances(Integer runningInstances) {
            this.runningInstances = runningInstances;
            return this;
        }
        public Integer getRunningInstances() {
            return this.runningInstances;
        }

        public ListApplicationsResponseBodyDataApplicationsChildren setScaleRuleEnabled(Boolean scaleRuleEnabled) {
            this.scaleRuleEnabled = scaleRuleEnabled;
            return this;
        }
        public Boolean getScaleRuleEnabled() {
            return this.scaleRuleEnabled;
        }

        public ListApplicationsResponseBodyDataApplicationsChildren setScaleRuleType(String scaleRuleType) {
            this.scaleRuleType = scaleRuleType;
            return this;
        }
        public String getScaleRuleType() {
            return this.scaleRuleType;
        }

        public ListApplicationsResponseBodyDataApplicationsChildren setTags(java.util.List<ListApplicationsResponseBodyDataApplicationsChildrenTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<ListApplicationsResponseBodyDataApplicationsChildrenTags> getTags() {
            return this.tags;
        }

    }

    public static class ListApplicationsResponseBodyDataApplicationsTags extends TeaModel {
        /**
         * <p>The key of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>key</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>value</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListApplicationsResponseBodyDataApplicationsTags build(java.util.Map<String, ?> map) throws Exception {
            ListApplicationsResponseBodyDataApplicationsTags self = new ListApplicationsResponseBodyDataApplicationsTags();
            return TeaModel.build(map, self);
        }

        public ListApplicationsResponseBodyDataApplicationsTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListApplicationsResponseBodyDataApplicationsTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListApplicationsResponseBodyDataApplications extends TeaModel {
        /**
         * <p>Indicates whether the application is being deleted. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The application is being deleted.</li>
         * <li><strong>false</strong>: The application is not being deleted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("AppDeletingStatus")
        public Boolean appDeletingStatus;

        /**
         * <p>The description of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>description</p>
         */
        @NameInMap("AppDescription")
        public String appDescription;

        /**
         * <p>The application ID.</p>
         * 
         * <strong>example:</strong>
         * <p>f7730764-d88f-4b9a-8d8e-cd8efbfe****</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The application name.</p>
         * 
         * <strong>example:</strong>
         * <p>demo-app</p>
         */
        @NameInMap("AppName")
        public String appName;

        @NameInMap("AppType")
        public String appType;

        @NameInMap("BaseAppId")
        public String baseAppId;

        @NameInMap("Children")
        public java.util.List<ListApplicationsResponseBodyDataApplicationsChildren> children;

        /**
         * <p>The CPU specifications that are required for each instance. Unit: millicores. This parameter cannot be set to 0. Valid values:</p>
         * <ul>
         * <li><strong>500</strong></li>
         * <li><strong>1000</strong></li>
         * <li><strong>2000</strong></li>
         * <li><strong>4000</strong></li>
         * <li><strong>8000</strong></li>
         * <li><strong>16000</strong></li>
         * <li><strong>32000</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("Cpu")
        public Integer cpu;

        @NameInMap("DiskSize")
        public Integer diskSize;

        @NameInMap("EnableIdle")
        public String enableIdle;

        @NameInMap("ImageUrl")
        public String imageUrl;

        /**
         * <p>The number of application instances.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Instances")
        public Integer instances;

        /**
         * <p>The memory size that is required by each instance. Unit: MB. This parameter cannot be set to 0. The values of this parameter correspond to the values of the Cpu parameter:</p>
         * <ul>
         * <li>This parameter is set to <strong>1024</strong> if the Cpu parameter is set to 500 or 1000.</li>
         * <li>This parameter is set to <strong>2048</strong> if the Cpu parameter is set to 500, 1000, or 2000.</li>
         * <li>This parameter is set to <strong>4096</strong> if the Cpu parameter is set to 1000, 2000, or 4000.</li>
         * <li>This parameter is set to <strong>8192</strong> if the Cpu parameter is set to 2000, 4000, or 8000.</li>
         * <li>This parameter is set to <strong>12288</strong> if the Cpu parameter is set to 12000.</li>
         * <li>This parameter is set to <strong>16384</strong> if the Cpu parameter is set to 4000, 8000, or 16000.</li>
         * <li>This parameter is set to <strong>24576</strong> if the Cpu parameter is set to 12000.</li>
         * <li>This parameter is set to <strong>32768</strong> if the Cpu parameter is set to 16000.</li>
         * <li>This parameter is set to <strong>65536</strong> if the Cpu parameter is set to 8000, 16000, or 32000.</li>
         * <li>This parameter is set to <strong>131072</strong> if the Cpu parameter is set to 32000.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1024</p>
         */
        @NameInMap("Mem")
        public Integer mem;

        @NameInMap("MseEnabled")
        public Boolean mseEnabled;

        @NameInMap("MseNamespaceId")
        public String mseNamespaceId;

        /**
         * <p>The namespace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing:demo</p>
         */
        @NameInMap("NamespaceId")
        public String namespaceId;

        @NameInMap("NamespaceName")
        public String namespaceName;

        @NameInMap("NewSaeVersion")
        public String newSaeVersion;

        @NameInMap("PackageUrl")
        public String packageUrl;

        @NameInMap("ProgrammingLanguage")
        public String programmingLanguage;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The number of running instances.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("RunningInstances")
        public Integer runningInstances;

        /**
         * <p>The tags of the application.</p>
         */
        @NameInMap("Tags")
        public java.util.List<ListApplicationsResponseBodyDataApplicationsTags> tags;

        public static ListApplicationsResponseBodyDataApplications build(java.util.Map<String, ?> map) throws Exception {
            ListApplicationsResponseBodyDataApplications self = new ListApplicationsResponseBodyDataApplications();
            return TeaModel.build(map, self);
        }

        public ListApplicationsResponseBodyDataApplications setAppDeletingStatus(Boolean appDeletingStatus) {
            this.appDeletingStatus = appDeletingStatus;
            return this;
        }
        public Boolean getAppDeletingStatus() {
            return this.appDeletingStatus;
        }

        public ListApplicationsResponseBodyDataApplications setAppDescription(String appDescription) {
            this.appDescription = appDescription;
            return this;
        }
        public String getAppDescription() {
            return this.appDescription;
        }

        public ListApplicationsResponseBodyDataApplications setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public ListApplicationsResponseBodyDataApplications setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public ListApplicationsResponseBodyDataApplications setAppType(String appType) {
            this.appType = appType;
            return this;
        }
        public String getAppType() {
            return this.appType;
        }

        public ListApplicationsResponseBodyDataApplications setBaseAppId(String baseAppId) {
            this.baseAppId = baseAppId;
            return this;
        }
        public String getBaseAppId() {
            return this.baseAppId;
        }

        public ListApplicationsResponseBodyDataApplications setChildren(java.util.List<ListApplicationsResponseBodyDataApplicationsChildren> children) {
            this.children = children;
            return this;
        }
        public java.util.List<ListApplicationsResponseBodyDataApplicationsChildren> getChildren() {
            return this.children;
        }

        public ListApplicationsResponseBodyDataApplications setCpu(Integer cpu) {
            this.cpu = cpu;
            return this;
        }
        public Integer getCpu() {
            return this.cpu;
        }

        public ListApplicationsResponseBodyDataApplications setDiskSize(Integer diskSize) {
            this.diskSize = diskSize;
            return this;
        }
        public Integer getDiskSize() {
            return this.diskSize;
        }

        public ListApplicationsResponseBodyDataApplications setEnableIdle(String enableIdle) {
            this.enableIdle = enableIdle;
            return this;
        }
        public String getEnableIdle() {
            return this.enableIdle;
        }

        public ListApplicationsResponseBodyDataApplications setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }
        public String getImageUrl() {
            return this.imageUrl;
        }

        public ListApplicationsResponseBodyDataApplications setInstances(Integer instances) {
            this.instances = instances;
            return this;
        }
        public Integer getInstances() {
            return this.instances;
        }

        public ListApplicationsResponseBodyDataApplications setMem(Integer mem) {
            this.mem = mem;
            return this;
        }
        public Integer getMem() {
            return this.mem;
        }

        public ListApplicationsResponseBodyDataApplications setMseEnabled(Boolean mseEnabled) {
            this.mseEnabled = mseEnabled;
            return this;
        }
        public Boolean getMseEnabled() {
            return this.mseEnabled;
        }

        public ListApplicationsResponseBodyDataApplications setMseNamespaceId(String mseNamespaceId) {
            this.mseNamespaceId = mseNamespaceId;
            return this;
        }
        public String getMseNamespaceId() {
            return this.mseNamespaceId;
        }

        public ListApplicationsResponseBodyDataApplications setNamespaceId(String namespaceId) {
            this.namespaceId = namespaceId;
            return this;
        }
        public String getNamespaceId() {
            return this.namespaceId;
        }

        public ListApplicationsResponseBodyDataApplications setNamespaceName(String namespaceName) {
            this.namespaceName = namespaceName;
            return this;
        }
        public String getNamespaceName() {
            return this.namespaceName;
        }

        public ListApplicationsResponseBodyDataApplications setNewSaeVersion(String newSaeVersion) {
            this.newSaeVersion = newSaeVersion;
            return this;
        }
        public String getNewSaeVersion() {
            return this.newSaeVersion;
        }

        public ListApplicationsResponseBodyDataApplications setPackageUrl(String packageUrl) {
            this.packageUrl = packageUrl;
            return this;
        }
        public String getPackageUrl() {
            return this.packageUrl;
        }

        public ListApplicationsResponseBodyDataApplications setProgrammingLanguage(String programmingLanguage) {
            this.programmingLanguage = programmingLanguage;
            return this;
        }
        public String getProgrammingLanguage() {
            return this.programmingLanguage;
        }

        public ListApplicationsResponseBodyDataApplications setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListApplicationsResponseBodyDataApplications setRunningInstances(Integer runningInstances) {
            this.runningInstances = runningInstances;
            return this;
        }
        public Integer getRunningInstances() {
            return this.runningInstances;
        }

        public ListApplicationsResponseBodyDataApplications setTags(java.util.List<ListApplicationsResponseBodyDataApplicationsTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<ListApplicationsResponseBodyDataApplicationsTags> getTags() {
            return this.tags;
        }

    }

    public static class ListApplicationsResponseBodyData extends TeaModel {
        /**
         * <p>The queried applications.</p>
         */
        @NameInMap("Applications")
        public java.util.List<ListApplicationsResponseBodyDataApplications> applications;

        /**
         * <p>The number of application instances.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>The tags of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The information about applications.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("TotalSize")
        public Integer totalSize;

        public static ListApplicationsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListApplicationsResponseBodyData self = new ListApplicationsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListApplicationsResponseBodyData setApplications(java.util.List<ListApplicationsResponseBodyDataApplications> applications) {
            this.applications = applications;
            return this;
        }
        public java.util.List<ListApplicationsResponseBodyDataApplications> getApplications() {
            return this.applications;
        }

        public ListApplicationsResponseBodyData setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public ListApplicationsResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListApplicationsResponseBodyData setTotalSize(Integer totalSize) {
            this.totalSize = totalSize;
            return this;
        }
        public Integer getTotalSize() {
            return this.totalSize;
        }

    }

}
