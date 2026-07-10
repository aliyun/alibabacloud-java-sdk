// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class ListApplicationsResponseBody extends TeaModel {
    /**
     * <p>The API status or POP error code. Valid values:</p>
     * <ul>
     * <li><strong>2xx</strong>: Success.</li>
     * <li><strong>3xx</strong>: Redirection.</li>
     * <li><strong>4xx</strong>: Request error.</li>
     * <li><strong>5xx</strong>: Server error.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The application list.</p>
     */
    @NameInMap("Data")
    public ListApplicationsResponseBodyData data;

    /**
     * <p>The error code. Valid values:</p>
     * <ul>
     * <li>If the request is successful, the <strong>ErrorCode</strong> field is not returned.</li>
     * <li>If the request fails, the <strong>ErrorCode</strong> field is returned. For more information, see the <strong>Error codes</strong> section in this topic.</li>
     * </ul>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The additional information about the call result.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The page size.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>B4D805CA-926D-41B1-8E63-7AD0C1ED****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the application list is retrieved. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Retrieved.</li>
     * <li><strong>false</strong>: Not retrieved.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The total number of applications.</p>
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
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>key</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>value</p>
         */
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
        /**
         * <p>Indicates whether the application is being deleted.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("AppDeletingStatus")
        public Boolean appDeletingStatus;

        /**
         * <p>The application description.</p>
         * 
         * <strong>example:</strong>
         * <p>Test application</p>
         */
        @NameInMap("AppDescription")
        public String appDescription;

        /**
         * <p>The application ID.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx-xxx-xxx-xxx</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The application name.</p>
         * 
         * <strong>example:</strong>
         * <p>app1</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
         * <p>The deployment type of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>Image</p>
         */
        @NameInMap("AppType")
        public String appType;

        /**
         * <p>The base application ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ee99cce6-1c8e-4bfa-96c3-3e2fa9******</p>
         */
        @NameInMap("BaseAppId")
        public String baseAppId;

        /**
         * <p>The CPU size.</p>
         * 
         * <strong>example:</strong>
         * <p>2000</p>
         */
        @NameInMap("Cpu")
        public Integer cpu;

        /**
         * <p>Indicates whether idle mode is enabled.</p>
         */
        @NameInMap("EnableIdle")
        public String enableIdle;

        /**
         * <p>The number of instances.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Instances")
        public Integer instances;

        /**
         * <p>Specifies whether the application is stateful.</p>
         */
        @NameInMap("IsStateful")
        public Boolean isStateful;

        /**
         * <p>The memory size.</p>
         * 
         * <strong>example:</strong>
         * <p>2048</p>
         */
        @NameInMap("Mem")
        public Integer mem;

        /**
         * <p>Indicates whether MSE microservice governance is enabled for the application.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("MseEnabled")
        public Boolean mseEnabled;

        /**
         * <p>The namespace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing:demo</p>
         */
        @NameInMap("NamespaceId")
        public String namespaceId;

        /**
         * <p>The namespace name.</p>
         * 
         * <strong>example:</strong>
         * <p>demo</p>
         */
        @NameInMap("NamespaceName")
        public String namespaceName;

        /**
         * <p>The application version. Valid values:</p>
         * <ul>
         * <li>lite: Lite Edition</li>
         * <li>std: Standard Edition</li>
         * <li>pro: Professional Edition</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>pro</p>
         */
        @NameInMap("NewSaeVersion")
        public String newSaeVersion;

        /**
         * <p>The programming language of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>java</p>
         */
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
         * <p>The resource type.</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <p>The number of running instances.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("RunningInstances")
        public Integer runningInstances;

        /**
         * <p>Indicates whether the elastic scaling policy is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("ScaleRuleEnabled")
        public Boolean scaleRuleEnabled;

        /**
         * <p>The type of the elastic scaling rule.</p>
         * 
         * <strong>example:</strong>
         * <p>timing</p>
         */
        @NameInMap("ScaleRuleType")
        public String scaleRuleType;

        /**
         * <p>The application tags.</p>
         */
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

        public ListApplicationsResponseBodyDataApplicationsChildren setEnableIdle(String enableIdle) {
            this.enableIdle = enableIdle;
            return this;
        }
        public String getEnableIdle() {
            return this.enableIdle;
        }

        public ListApplicationsResponseBodyDataApplicationsChildren setInstances(Integer instances) {
            this.instances = instances;
            return this;
        }
        public Integer getInstances() {
            return this.instances;
        }

        public ListApplicationsResponseBodyDataApplicationsChildren setIsStateful(Boolean isStateful) {
            this.isStateful = isStateful;
            return this;
        }
        public Boolean getIsStateful() {
            return this.isStateful;
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

        public ListApplicationsResponseBodyDataApplicationsChildren setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
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
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>key</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
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
         * <p>The application description.</p>
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

        /**
         * <p>The deployment type of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>Image</p>
         */
        @NameInMap("AppType")
        public String appType;

        /**
         * <p>The base application ID. This property exists only for canary release applications.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx-xxx-xx-xxx</p>
         */
        @NameInMap("BaseAppId")
        public String baseAppId;

        /**
         * <p>The list of canary release applications for this application.</p>
         */
        @NameInMap("Children")
        public java.util.List<ListApplicationsResponseBodyDataApplicationsChildren> children;

        /**
         * <p>The CPU required for each instance, in millicores. This value cannot be 0. Only the following defined specifications are supported:</p>
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

        /**
         * <p>The disk storage size, in GB.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("DiskSize")
        public Integer diskSize;

        /**
         * <p>Indicates whether idle mode is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("EnableIdle")
        public String enableIdle;

        /**
         * <p>The image URL.</p>
         * 
         * <strong>example:</strong>
         * <p>registry.cn-hangzhou.aliyuncs.com/sae-serverless-demo/sae-demo:microservice-java-provider-v1.0</p>
         */
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
         * <p>Specifies whether the application is stateful.</p>
         */
        @NameInMap("IsStateful")
        public Boolean isStateful;

        /**
         * <p>The labels.</p>
         */
        @NameInMap("Labels")
        public java.util.Map<String, String> labels;

        /**
         * <p>The memory required for each instance, in MB. This value cannot be 0. The memory has a one-to-one mapping with CPU. Only the following defined specifications are supported:</p>
         * <ul>
         * <li><strong>1024</strong>: corresponds to 500 and 1000 millicores of CPU.</li>
         * <li><strong>2048</strong>: corresponds to 500, 1000, and 2000 millicores of CPU.</li>
         * <li><strong>4096</strong>: corresponds to 1000, 2000, and 4000 millicores of CPU.</li>
         * <li><strong>8192</strong>: corresponds to 2000, 4000, and 8000 millicores of CPU.</li>
         * <li><strong>12288</strong>: corresponds to 12000 millicores of CPU.</li>
         * <li><strong>16384</strong>: corresponds to 4000, 8000, and 16000 millicores of CPU.</li>
         * <li><strong>24576</strong>: corresponds to 12000 millicores of CPU.</li>
         * <li><strong>32768</strong>: corresponds to 16000 millicores of CPU.</li>
         * <li><strong>65536</strong>: corresponds to 8000, 16000, and 32000 millicores of CPU.</li>
         * <li><strong>131072</strong>: corresponds to 32000 millicores of CPU.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1024</p>
         */
        @NameInMap("Mem")
        public Integer mem;

        /**
         * <p>Indicates whether MSE microservice governance is enabled for the application.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("MseEnabled")
        public Boolean mseEnabled;

        /**
         * <p>The MSE microservice governance namespace.</p>
         * <ul>
         * <li><p>default: Free Edition</p>
         * </li>
         * <li><p>sae-pro: Professional Edition</p>
         * </li>
         * <li><p>sae-ent: Enterprise Edition</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>sae-ent</p>
         */
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

        /**
         * <p>The namespace name.</p>
         * 
         * <strong>example:</strong>
         * <p>demo</p>
         */
        @NameInMap("NamespaceName")
        public String namespaceName;

        /**
         * <p>The application version. Valid values:</p>
         * <ul>
         * <li>lite: Lite Edition</li>
         * <li>std: Standard Edition</li>
         * <li>pro: Professional Edition</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>pro</p>
         */
        @NameInMap("NewSaeVersion")
        public String newSaeVersion;

        /**
         * <p>The deployment package URL.</p>
         */
        @NameInMap("PackageUrl")
        public String packageUrl;

        /**
         * <p>The programming language of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>java</p>
         */
        @NameInMap("ProgrammingLanguage")
        public String programmingLanguage;

        @NameInMap("RaspEnabled")
        public Boolean raspEnabled;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The resource type.</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <p>The number of running instances.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("RunningInstances")
        public Integer runningInstances;

        /**
         * <p>The application tags.</p>
         */
        @NameInMap("Tags")
        public java.util.List<ListApplicationsResponseBodyDataApplicationsTags> tags;

        /**
         * <p>VPC ID。</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

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

        public ListApplicationsResponseBodyDataApplications setIsStateful(Boolean isStateful) {
            this.isStateful = isStateful;
            return this;
        }
        public Boolean getIsStateful() {
            return this.isStateful;
        }

        public ListApplicationsResponseBodyDataApplications setLabels(java.util.Map<String, String> labels) {
            this.labels = labels;
            return this;
        }
        public java.util.Map<String, String> getLabels() {
            return this.labels;
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

        public ListApplicationsResponseBodyDataApplications setRaspEnabled(Boolean raspEnabled) {
            this.raspEnabled = raspEnabled;
            return this;
        }
        public Boolean getRaspEnabled() {
            return this.raspEnabled;
        }

        public ListApplicationsResponseBodyDataApplications setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListApplicationsResponseBodyDataApplications setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
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

        public ListApplicationsResponseBodyDataApplications setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

    public static class ListApplicationsResponseBodyData extends TeaModel {
        /**
         * <p>The application list.</p>
         */
        @NameInMap("Applications")
        public java.util.List<ListApplicationsResponseBodyDataApplications> applications;

        /**
         * <p>The current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>The page size.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of applications.</p>
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
