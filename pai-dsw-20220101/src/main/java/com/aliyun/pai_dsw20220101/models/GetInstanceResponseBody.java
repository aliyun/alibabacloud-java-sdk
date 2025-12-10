// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20220101.models;

import com.aliyun.tea.*;

public class GetInstanceResponseBody extends TeaModel {
    /**
     * <p>The accelerator type of the instance.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>CPU</li>
     * <li>GPU</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>CPU</p>
     */
    @NameInMap("AcceleratorType")
    public String acceleratorType;

    /**
     * <p>The accessibility. Valid values:</p>
     * <ul>
     * <li>PRIVATE: Accessible only to you and the administrator of the workspace.</li>
     * <li>PUBLIC: Accessible to all members in the workspace.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PRIVATE</p>
     */
    @NameInMap("Accessibility")
    public String accessibility;

    /**
     * <p>The accumulated running duration. Unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>3600000</p>
     */
    @NameInMap("AccumulatedRunningTimeInMs")
    public Long accumulatedRunningTimeInMs;

    /**
     * <p>The affinity configuration.</p>
     */
    @NameInMap("Affinity")
    public GetInstanceResponseBodyAffinity affinity;

    /**
     * <p>The cloud disks of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("CloudDisks")
    public java.util.List<GetInstanceResponseBodyCloudDisks> cloudDisks;

    /**
     * <p>The status code. Valid values:</p>
     * <ul>
     * <li>InternalError: All errors, except for parameter validation errors, are internal errors.</li>
     * <li>ValidationError: A parameter validation error.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The credential injection configuration.</p>
     */
    @NameInMap("CredentialConfig")
    public CredentialConfig credentialConfig;

    /**
     * <p>The datasets.</p>
     */
    @NameInMap("Datasets")
    public java.util.List<GetInstanceResponseBodyDatasets> datasets;

    /**
     * <p>The NVIDIA driver configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>535.54.03</p>
     */
    @NameInMap("Driver")
    public String driver;

    /**
     * <p>The dynamic mount configuration.</p>
     */
    @NameInMap("DynamicMount")
    public DynamicMount dynamicMount;

    /**
     * <p>The ECS instance type of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>ecs.c6.large</p>
     */
    @NameInMap("EcsSpec")
    public String ecsSpec;

    /**
     * <p>The environment variables.</p>
     * 
     * <strong>example:</strong>
     * <p>{userName: &quot;Chris&quot;}</p>
     */
    @NameInMap("EnvironmentVariables")
    public java.util.Map<String, String> environmentVariables;

    /**
     * <p>The creation time of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-01-12T14:36:01Z</p>
     */
    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    /**
     * <p>The last modified time of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-01-12T14:36:01Z</p>
     */
    @NameInMap("GmtModifiedTime")
    public String gmtModifiedTime;

    /**
     * <p>The HTTP status code. Valid values:</p>
     * <ul>
     * <li>400</li>
     * <li>404</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The automatic shutdown settings.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;InstanceId&quot;:&quot;dsw-05cefd0be2e5a278&quot;,&quot;CpuPercentThreshold&quot;:20,&quot;GpuPercentThreshold&quot;:10,&quot;MaxIdleTimeInMinutes&quot;:120,&quot;IdleTimeInMinutes&quot;:30}</p>
     */
    @NameInMap("IdleInstanceCuller")
    public GetInstanceResponseBodyIdleInstanceCuller idleInstanceCuller;

    /**
     * <p>The Base64-encoded account and password for the user‘s private image. The password will be hidden.</p>
     * 
     * <strong>example:</strong>
     * <p>YWxpeXVuNjUzMzM5MjIwMzoqKioqKio=</p>
     */
    @NameInMap("ImageAuth")
    public String imageAuth;

    /**
     * <p>The image ID.</p>
     * 
     * <strong>example:</strong>
     * <p>image-05cefd0be2exxxx</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <p>The image name.</p>
     * 
     * <strong>example:</strong>
     * <p>py36_cpu_tf1.12_ubuntu</p>
     */
    @NameInMap("ImageName")
    public String imageName;

    /**
     * <p>The image address.</p>
     * 
     * <strong>example:</strong>
     * <p>registry.cn-shanghai.aliyuncs.com/pai_product/tensorflow:py36_cpu_tf1.12_ubuntu</p>
     */
    @NameInMap("ImageUrl")
    public String imageUrl;

    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>dsw-730xxxxxxxxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The instance name.</p>
     * 
     * <strong>example:</strong>
     * <p>training_data</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>The scheduled stop tasks.</p>
     */
    @NameInMap("InstanceShutdownTimer")
    public GetInstanceResponseBodyInstanceShutdownTimer instanceShutdownTimer;

    /**
     * <p>The instance snapshots.</p>
     * 
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("InstanceSnapshotList")
    public java.util.List<GetInstanceResponseBodyInstanceSnapshotList> instanceSnapshotList;

    /**
     * <p>The instance URL.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://dsw-cn-shanghai.data.aliyun.com/notebook.htm?instance=39772#/">https://dsw-cn-shanghai.data.aliyun.com/notebook.htm?instance=39772#/</a></p>
     */
    @NameInMap("InstanceUrl")
    public String instanceUrl;

    /**
     * <p>The JupyterLab URL.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://dsw-gateway-cn-shanghai.aliyun.com/dsw-39772/lab/">https://dsw-gateway-cn-shanghai.aliyun.com/dsw-39772/lab/</a></p>
     */
    @NameInMap("JupyterlabUrl")
    public String jupyterlabUrl;

    /**
     * <p>The custom tags.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;foo\&quot;: \&quot;bar\&quot;}</p>
     */
    @NameInMap("Labels")
    public java.util.List<GetInstanceResponseBodyLabels> labels;

    /**
     * <p>The latest user image saved.</p>
     */
    @NameInMap("LatestSnapshot")
    public GetInstanceResponseBodyLatestSnapshot latestSnapshot;

    /**
     * <p>The error message. Valid values:</p>
     * <ul>
     * <li>If the request is successful, null is returned.</li>
     * <li>If the request fails, the cause for the failure is returned.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>&quot;XXX&quot;</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The error recovery configuration of the node.</p>
     */
    @NameInMap("NodeErrorRecovery")
    public GetInstanceResponseBodyNodeErrorRecovery nodeErrorRecovery;

    /**
     * <p>The billing method. Valid values:</p>
     * <ul>
     * <li>PayAsYouGo</li>
     * <li>Subscription</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PayAsYouGo</p>
     */
    @NameInMap("PaymentType")
    public String paymentType;

    @NameInMap("PodIps")
    public java.util.List<PodIp> podIps;

    /**
     * <p>The priority based on which resources are allocated to instances.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Priority")
    public Long priority;

    /**
     * <p>The proxy path.</p>
     * 
     * <strong>example:</strong>
     * <p>dsw-170197/proxy/</p>
     */
    @NameInMap("ProxyPath")
    public String proxyPath;

    /**
     * <p>The error code of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>Internal Error</p>
     */
    @NameInMap("ReasonCode")
    public String reasonCode;

    /**
     * <p>The cause of the instance error.</p>
     * 
     * <strong>example:</strong>
     * <p>ImagePullBackOff</p>
     */
    @NameInMap("ReasonMessage")
    public String reasonMessage;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>E7D55162-4489-1619-AAF5-3F97D5FCA948</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The resource configurations in subscription scenarios.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;CPU&quot;:&quot;4&quot;,&quot;Memory&quot;:&quot;8Gi&quot;,&quot;SharedMemory&quot;:&quot;4Gi&quot;,&quot;GPU&quot;:&quot;1&quot;,&quot;GPUType&quot;:&quot;Tesla-V100-16G&quot;}</p>
     */
    @NameInMap("RequestedResource")
    public GetInstanceResponseBodyRequestedResource requestedResource;

    /**
     * <p>The resource ID. This parameter is available if the billing method is subscription.</p>
     * 
     * <strong>example:</strong>
     * <p>dsw-123456789</p>
     */
    @NameInMap("ResourceId")
    public String resourceId;

    /**
     * <p>The specification type.</p>
     * <ul>
     * <li>For subscription, this is the requested CPU and memory size.</li>
     * <li>For pay-as-you-go, this is the selected ECS instance type.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ecs.g7.xlarge</p>
     */
    @NameInMap("ResourceName")
    public String resourceName;

    @NameInMap("ServiceConfig")
    public ServiceConfig serviceConfig;

    /**
     * <p>The instance status.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>Creating</li>
     * <li>SaveFailed</li>
     * <li>Stopped</li>
     * <li>Failed</li>
     * <li>ResourceAllocating</li>
     * <li>Stopping</li>
     * <li>Updating</li>
     * <li>Saving</li>
     * <li>Queuing</li>
     * <li>Recovering</li>
     * <li>Starting</li>
     * <li>Running</li>
     * <li>Saved</li>
     * <li>Deleting</li>
     * <li>EnvPreparing</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Running</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The tags.</p>
     */
    @NameInMap("Tags")
    public java.util.List<GetInstanceResponseBodyTags> tags;

    /**
     * <p>The terminal URL.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://dsw-gateway-cn-shanghai.aliyun.com/dsw-39772/tty/">https://dsw-gateway-cn-shanghai.aliyun.com/dsw-39772/tty/</a></p>
     */
    @NameInMap("TerminalUrl")
    public String terminalUrl;

    @NameInMap("UserCommandId")
    public String userCommandId;

    /**
     * <p>The user ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1612285282502324</p>
     */
    @NameInMap("UserId")
    public String userId;

    /**
     * <p>The username.</p>
     * 
     * <strong>example:</strong>
     * <p>测试用户</p>
     */
    @NameInMap("UserName")
    public String userName;

    /**
     * <p>The virtual private cloud (VPC) configurations.</p>
     */
    @NameInMap("UserVpc")
    public GetInstanceResponseBodyUserVpc userVpc;

    /**
     * <p>The Web IDE URL.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://dsw-gateway-cn-shanghai.aliyun.com/dsw-39772/ide/">https://dsw-gateway-cn-shanghai.aliyun.com/dsw-39772/ide/</a></p>
     */
    @NameInMap("WebIDEUrl")
    public String webIDEUrl;

    /**
     * <p>The workspace ID.</p>
     * 
     * <strong>example:</strong>
     * <p>40823</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    /**
     * <p>The workspace name.</p>
     * 
     * <strong>example:</strong>
     * <p>training_data</p>
     */
    @NameInMap("WorkspaceName")
    public String workspaceName;

    /**
     * <p>The storage for the workspace. If you leave this parameter empty, the workspace uses File Storage NAS (NAS) storage, cloud disks, or local disks in sequence.</p>
     * 
     * <strong>example:</strong>
     * <p>d-123456789</p>
     */
    @NameInMap("WorkspaceSource")
    public String workspaceSource;

    public static GetInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceResponseBody self = new GetInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetInstanceResponseBody setAcceleratorType(String acceleratorType) {
        this.acceleratorType = acceleratorType;
        return this;
    }
    public String getAcceleratorType() {
        return this.acceleratorType;
    }

    public GetInstanceResponseBody setAccessibility(String accessibility) {
        this.accessibility = accessibility;
        return this;
    }
    public String getAccessibility() {
        return this.accessibility;
    }

    public GetInstanceResponseBody setAccumulatedRunningTimeInMs(Long accumulatedRunningTimeInMs) {
        this.accumulatedRunningTimeInMs = accumulatedRunningTimeInMs;
        return this;
    }
    public Long getAccumulatedRunningTimeInMs() {
        return this.accumulatedRunningTimeInMs;
    }

    public GetInstanceResponseBody setAffinity(GetInstanceResponseBodyAffinity affinity) {
        this.affinity = affinity;
        return this;
    }
    public GetInstanceResponseBodyAffinity getAffinity() {
        return this.affinity;
    }

    public GetInstanceResponseBody setCloudDisks(java.util.List<GetInstanceResponseBodyCloudDisks> cloudDisks) {
        this.cloudDisks = cloudDisks;
        return this;
    }
    public java.util.List<GetInstanceResponseBodyCloudDisks> getCloudDisks() {
        return this.cloudDisks;
    }

    public GetInstanceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetInstanceResponseBody setCredentialConfig(CredentialConfig credentialConfig) {
        this.credentialConfig = credentialConfig;
        return this;
    }
    public CredentialConfig getCredentialConfig() {
        return this.credentialConfig;
    }

    public GetInstanceResponseBody setDatasets(java.util.List<GetInstanceResponseBodyDatasets> datasets) {
        this.datasets = datasets;
        return this;
    }
    public java.util.List<GetInstanceResponseBodyDatasets> getDatasets() {
        return this.datasets;
    }

    public GetInstanceResponseBody setDriver(String driver) {
        this.driver = driver;
        return this;
    }
    public String getDriver() {
        return this.driver;
    }

    public GetInstanceResponseBody setDynamicMount(DynamicMount dynamicMount) {
        this.dynamicMount = dynamicMount;
        return this;
    }
    public DynamicMount getDynamicMount() {
        return this.dynamicMount;
    }

    public GetInstanceResponseBody setEcsSpec(String ecsSpec) {
        this.ecsSpec = ecsSpec;
        return this;
    }
    public String getEcsSpec() {
        return this.ecsSpec;
    }

    public GetInstanceResponseBody setEnvironmentVariables(java.util.Map<String, String> environmentVariables) {
        this.environmentVariables = environmentVariables;
        return this;
    }
    public java.util.Map<String, String> getEnvironmentVariables() {
        return this.environmentVariables;
    }

    public GetInstanceResponseBody setGmtCreateTime(String gmtCreateTime) {
        this.gmtCreateTime = gmtCreateTime;
        return this;
    }
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    public GetInstanceResponseBody setGmtModifiedTime(String gmtModifiedTime) {
        this.gmtModifiedTime = gmtModifiedTime;
        return this;
    }
    public String getGmtModifiedTime() {
        return this.gmtModifiedTime;
    }

    public GetInstanceResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetInstanceResponseBody setIdleInstanceCuller(GetInstanceResponseBodyIdleInstanceCuller idleInstanceCuller) {
        this.idleInstanceCuller = idleInstanceCuller;
        return this;
    }
    public GetInstanceResponseBodyIdleInstanceCuller getIdleInstanceCuller() {
        return this.idleInstanceCuller;
    }

    public GetInstanceResponseBody setImageAuth(String imageAuth) {
        this.imageAuth = imageAuth;
        return this;
    }
    public String getImageAuth() {
        return this.imageAuth;
    }

    public GetInstanceResponseBody setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public GetInstanceResponseBody setImageName(String imageName) {
        this.imageName = imageName;
        return this;
    }
    public String getImageName() {
        return this.imageName;
    }

    public GetInstanceResponseBody setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    public String getImageUrl() {
        return this.imageUrl;
    }

    public GetInstanceResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetInstanceResponseBody setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public GetInstanceResponseBody setInstanceShutdownTimer(GetInstanceResponseBodyInstanceShutdownTimer instanceShutdownTimer) {
        this.instanceShutdownTimer = instanceShutdownTimer;
        return this;
    }
    public GetInstanceResponseBodyInstanceShutdownTimer getInstanceShutdownTimer() {
        return this.instanceShutdownTimer;
    }

    public GetInstanceResponseBody setInstanceSnapshotList(java.util.List<GetInstanceResponseBodyInstanceSnapshotList> instanceSnapshotList) {
        this.instanceSnapshotList = instanceSnapshotList;
        return this;
    }
    public java.util.List<GetInstanceResponseBodyInstanceSnapshotList> getInstanceSnapshotList() {
        return this.instanceSnapshotList;
    }

    public GetInstanceResponseBody setInstanceUrl(String instanceUrl) {
        this.instanceUrl = instanceUrl;
        return this;
    }
    public String getInstanceUrl() {
        return this.instanceUrl;
    }

    public GetInstanceResponseBody setJupyterlabUrl(String jupyterlabUrl) {
        this.jupyterlabUrl = jupyterlabUrl;
        return this;
    }
    public String getJupyterlabUrl() {
        return this.jupyterlabUrl;
    }

    public GetInstanceResponseBody setLabels(java.util.List<GetInstanceResponseBodyLabels> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.List<GetInstanceResponseBodyLabels> getLabels() {
        return this.labels;
    }

    public GetInstanceResponseBody setLatestSnapshot(GetInstanceResponseBodyLatestSnapshot latestSnapshot) {
        this.latestSnapshot = latestSnapshot;
        return this;
    }
    public GetInstanceResponseBodyLatestSnapshot getLatestSnapshot() {
        return this.latestSnapshot;
    }

    public GetInstanceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetInstanceResponseBody setNodeErrorRecovery(GetInstanceResponseBodyNodeErrorRecovery nodeErrorRecovery) {
        this.nodeErrorRecovery = nodeErrorRecovery;
        return this;
    }
    public GetInstanceResponseBodyNodeErrorRecovery getNodeErrorRecovery() {
        return this.nodeErrorRecovery;
    }

    public GetInstanceResponseBody setPaymentType(String paymentType) {
        this.paymentType = paymentType;
        return this;
    }
    public String getPaymentType() {
        return this.paymentType;
    }

    public GetInstanceResponseBody setPodIps(java.util.List<PodIp> podIps) {
        this.podIps = podIps;
        return this;
    }
    public java.util.List<PodIp> getPodIps() {
        return this.podIps;
    }

    public GetInstanceResponseBody setPriority(Long priority) {
        this.priority = priority;
        return this;
    }
    public Long getPriority() {
        return this.priority;
    }

    public GetInstanceResponseBody setProxyPath(String proxyPath) {
        this.proxyPath = proxyPath;
        return this;
    }
    public String getProxyPath() {
        return this.proxyPath;
    }

    public GetInstanceResponseBody setReasonCode(String reasonCode) {
        this.reasonCode = reasonCode;
        return this;
    }
    public String getReasonCode() {
        return this.reasonCode;
    }

    public GetInstanceResponseBody setReasonMessage(String reasonMessage) {
        this.reasonMessage = reasonMessage;
        return this;
    }
    public String getReasonMessage() {
        return this.reasonMessage;
    }

    public GetInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetInstanceResponseBody setRequestedResource(GetInstanceResponseBodyRequestedResource requestedResource) {
        this.requestedResource = requestedResource;
        return this;
    }
    public GetInstanceResponseBodyRequestedResource getRequestedResource() {
        return this.requestedResource;
    }

    public GetInstanceResponseBody setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public GetInstanceResponseBody setResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }
    public String getResourceName() {
        return this.resourceName;
    }

    public GetInstanceResponseBody setServiceConfig(ServiceConfig serviceConfig) {
        this.serviceConfig = serviceConfig;
        return this;
    }
    public ServiceConfig getServiceConfig() {
        return this.serviceConfig;
    }

    public GetInstanceResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetInstanceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetInstanceResponseBody setTags(java.util.List<GetInstanceResponseBodyTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<GetInstanceResponseBodyTags> getTags() {
        return this.tags;
    }

    public GetInstanceResponseBody setTerminalUrl(String terminalUrl) {
        this.terminalUrl = terminalUrl;
        return this;
    }
    public String getTerminalUrl() {
        return this.terminalUrl;
    }

    public GetInstanceResponseBody setUserCommandId(String userCommandId) {
        this.userCommandId = userCommandId;
        return this;
    }
    public String getUserCommandId() {
        return this.userCommandId;
    }

    public GetInstanceResponseBody setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public GetInstanceResponseBody setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public GetInstanceResponseBody setUserVpc(GetInstanceResponseBodyUserVpc userVpc) {
        this.userVpc = userVpc;
        return this;
    }
    public GetInstanceResponseBodyUserVpc getUserVpc() {
        return this.userVpc;
    }

    public GetInstanceResponseBody setWebIDEUrl(String webIDEUrl) {
        this.webIDEUrl = webIDEUrl;
        return this;
    }
    public String getWebIDEUrl() {
        return this.webIDEUrl;
    }

    public GetInstanceResponseBody setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public GetInstanceResponseBody setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public GetInstanceResponseBody setWorkspaceSource(String workspaceSource) {
        this.workspaceSource = workspaceSource;
        return this;
    }
    public String getWorkspaceSource() {
        return this.workspaceSource;
    }

    public static class GetInstanceResponseBodyAffinityCPU extends TeaModel {
        /**
         * <p>Indicates whether CPU affinity is enabled.</p>
         * <p>true false</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Enable")
        public Boolean enable;

        public static GetInstanceResponseBodyAffinityCPU build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceResponseBodyAffinityCPU self = new GetInstanceResponseBodyAffinityCPU();
            return TeaModel.build(map, self);
        }

        public GetInstanceResponseBodyAffinityCPU setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

    }

    public static class GetInstanceResponseBodyAffinity extends TeaModel {
        /**
         * <p>The CPU affinity configuration. Only subscription instances that use general-purpose computing resources support CPU affinity configuration.</p>
         */
        @NameInMap("CPU")
        public GetInstanceResponseBodyAffinityCPU CPU;

        public static GetInstanceResponseBodyAffinity build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceResponseBodyAffinity self = new GetInstanceResponseBodyAffinity();
            return TeaModel.build(map, self);
        }

        public GetInstanceResponseBodyAffinity setCPU(GetInstanceResponseBodyAffinityCPU CPU) {
            this.CPU = CPU;
            return this;
        }
        public GetInstanceResponseBodyAffinityCPU getCPU() {
            return this.CPU;
        }

    }

    public static class GetInstanceResponseBodyCloudDisksStatus extends TeaModel {
        @NameInMap("Available")
        public Long available;

        @NameInMap("Capacity")
        public Long capacity;

        @NameInMap("Usage")
        public Long usage;

        public static GetInstanceResponseBodyCloudDisksStatus build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceResponseBodyCloudDisksStatus self = new GetInstanceResponseBodyCloudDisksStatus();
            return TeaModel.build(map, self);
        }

        public GetInstanceResponseBodyCloudDisksStatus setAvailable(Long available) {
            this.available = available;
            return this;
        }
        public Long getAvailable() {
            return this.available;
        }

        public GetInstanceResponseBodyCloudDisksStatus setCapacity(Long capacity) {
            this.capacity = capacity;
            return this;
        }
        public Long getCapacity() {
            return this.capacity;
        }

        public GetInstanceResponseBodyCloudDisksStatus setUsage(Long usage) {
            this.usage = usage;
            return this;
        }
        public Long getUsage() {
            return this.usage;
        }

    }

    public static class GetInstanceResponseBodyCloudDisks extends TeaModel {
        /**
         * <p>Disk Capacity</p>
         * 
         * <strong>example:</strong>
         * <p>30Gi</p>
         */
        @NameInMap("Capacity")
        public String capacity;

        /**
         * <p>The mount path of the cloud disk in the container.</p>
         * 
         * <strong>example:</strong>
         * <p>/mmt/workspace</p>
         */
        @NameInMap("MountPath")
        public String mountPath;

        /**
         * <p>The directory on the cloud disk that is mounted to the container.</p>
         * 
         * <strong>example:</strong>
         * <p>/workspace</p>
         */
        @NameInMap("Path")
        public String path;

        @NameInMap("Status")
        public GetInstanceResponseBodyCloudDisksStatus status;

        /**
         * <p>The usage mode of the cloud disk. The value rootfs indicates that the cloud disk is used as the root file system.</p>
         * 
         * <strong>example:</strong>
         * <p>rootfs</p>
         */
        @NameInMap("SubType")
        public String subType;

        public static GetInstanceResponseBodyCloudDisks build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceResponseBodyCloudDisks self = new GetInstanceResponseBodyCloudDisks();
            return TeaModel.build(map, self);
        }

        public GetInstanceResponseBodyCloudDisks setCapacity(String capacity) {
            this.capacity = capacity;
            return this;
        }
        public String getCapacity() {
            return this.capacity;
        }

        public GetInstanceResponseBodyCloudDisks setMountPath(String mountPath) {
            this.mountPath = mountPath;
            return this;
        }
        public String getMountPath() {
            return this.mountPath;
        }

        public GetInstanceResponseBodyCloudDisks setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public GetInstanceResponseBodyCloudDisks setStatus(GetInstanceResponseBodyCloudDisksStatus status) {
            this.status = status;
            return this;
        }
        public GetInstanceResponseBodyCloudDisksStatus getStatus() {
            return this.status;
        }

        public GetInstanceResponseBodyCloudDisks setSubType(String subType) {
            this.subType = subType;
            return this;
        }
        public String getSubType() {
            return this.subType;
        }

    }

    public static class GetInstanceResponseBodyDatasets extends TeaModel {
        /**
         * <p>The dataset ID.</p>
         * 
         * <strong>example:</strong>
         * <p>d-vsqjvsjp4orp5l206u</p>
         */
        @NameInMap("DatasetId")
        public String datasetId;

        /**
         * <p>The dataset version.</p>
         * 
         * <strong>example:</strong>
         * <p>v1</p>
         */
        @NameInMap("DatasetVersion")
        public String datasetVersion;

        /**
         * <p>Indicates whether dynamic mounting is enabled. Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Dynamic")
        public Boolean dynamic;

        /**
         * <p>The read and write permissions. Valid values: RW and RO.</p>
         * 
         * <strong>example:</strong>
         * <p>RW</p>
         */
        @NameInMap("MountAccess")
        public String mountAccess;

        /**
         * <p>The mount path in the container.</p>
         * 
         * <strong>example:</strong>
         * <p>/mnt/data</p>
         */
        @NameInMap("MountPath")
        public String mountPath;

        /**
         * <p>The mount type of the dataset (deprecated).</p>
         * 
         * <strong>example:</strong>
         * <p>FastReadWrite</p>
         */
        @NameInMap("OptionType")
        public String optionType;

        /**
         * <p>The mount type of the dataset.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *   &quot;fs.oss.download.thread.concurrency&quot;: &quot;10&quot;,
         *   &quot;fs.oss.upload.thread.concurrency&quot;: &quot;10&quot;,
         *   &quot;fs.jindo.args&quot;: &quot;-oattr_timeout=3 -oentry_timeout=0 -onegative_timeout=0 -oauto_cache -ono_symlink&quot;
         * }</p>
         */
        @NameInMap("Options")
        public String options;

        /**
         * <p>The dataset URI.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://bucket-name.oss-cn-shanghai-internal.aliyuncs.com/data/path/</p>
         */
        @NameInMap("Uri")
        public String uri;

        public static GetInstanceResponseBodyDatasets build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceResponseBodyDatasets self = new GetInstanceResponseBodyDatasets();
            return TeaModel.build(map, self);
        }

        public GetInstanceResponseBodyDatasets setDatasetId(String datasetId) {
            this.datasetId = datasetId;
            return this;
        }
        public String getDatasetId() {
            return this.datasetId;
        }

        public GetInstanceResponseBodyDatasets setDatasetVersion(String datasetVersion) {
            this.datasetVersion = datasetVersion;
            return this;
        }
        public String getDatasetVersion() {
            return this.datasetVersion;
        }

        public GetInstanceResponseBodyDatasets setDynamic(Boolean dynamic) {
            this.dynamic = dynamic;
            return this;
        }
        public Boolean getDynamic() {
            return this.dynamic;
        }

        public GetInstanceResponseBodyDatasets setMountAccess(String mountAccess) {
            this.mountAccess = mountAccess;
            return this;
        }
        public String getMountAccess() {
            return this.mountAccess;
        }

        public GetInstanceResponseBodyDatasets setMountPath(String mountPath) {
            this.mountPath = mountPath;
            return this;
        }
        public String getMountPath() {
            return this.mountPath;
        }

        public GetInstanceResponseBodyDatasets setOptionType(String optionType) {
            this.optionType = optionType;
            return this;
        }
        public String getOptionType() {
            return this.optionType;
        }

        public GetInstanceResponseBodyDatasets setOptions(String options) {
            this.options = options;
            return this;
        }
        public String getOptions() {
            return this.options;
        }

        public GetInstanceResponseBodyDatasets setUri(String uri) {
            this.uri = uri;
            return this;
        }
        public String getUri() {
            return this.uri;
        }

    }

    public static class GetInstanceResponseBodyIdleInstanceCuller extends TeaModel {
        /**
         * <p>The CPU utilization threshold. Unit: percentage. Valid values: 1 to 100. If the CPU utilization of the instance is lower than this threshold, the instance is considered idle.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("CpuPercentThreshold")
        public Integer cpuPercentThreshold;

        /**
         * <p>The GPU utilization threshold. Unit: percentage. Valid values: 1 to 100. This parameter takes effect only if the instance is of the GPU instance type. If both CPU and GPU utilization is lower than the thresholds, the instance is considered idle.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("GpuPercentThreshold")
        public Integer gpuPercentThreshold;

        /**
         * <p>The current time duration for which the instance is idle. Unit: minutes.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("IdleTimeInMinutes")
        public Integer idleTimeInMinutes;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>dsw-730xxxxxxxxxx</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The maximum time duration for which the instance is idle. Unit: minutes. If the time duration for which the instance is idle exceeds this value, the system automatically stops the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("MaxIdleTimeInMinutes")
        public Integer maxIdleTimeInMinutes;

        public static GetInstanceResponseBodyIdleInstanceCuller build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceResponseBodyIdleInstanceCuller self = new GetInstanceResponseBodyIdleInstanceCuller();
            return TeaModel.build(map, self);
        }

        public GetInstanceResponseBodyIdleInstanceCuller setCpuPercentThreshold(Integer cpuPercentThreshold) {
            this.cpuPercentThreshold = cpuPercentThreshold;
            return this;
        }
        public Integer getCpuPercentThreshold() {
            return this.cpuPercentThreshold;
        }

        public GetInstanceResponseBodyIdleInstanceCuller setGpuPercentThreshold(Integer gpuPercentThreshold) {
            this.gpuPercentThreshold = gpuPercentThreshold;
            return this;
        }
        public Integer getGpuPercentThreshold() {
            return this.gpuPercentThreshold;
        }

        public GetInstanceResponseBodyIdleInstanceCuller setIdleTimeInMinutes(Integer idleTimeInMinutes) {
            this.idleTimeInMinutes = idleTimeInMinutes;
            return this;
        }
        public Integer getIdleTimeInMinutes() {
            return this.idleTimeInMinutes;
        }

        public GetInstanceResponseBodyIdleInstanceCuller setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetInstanceResponseBodyIdleInstanceCuller setMaxIdleTimeInMinutes(Integer maxIdleTimeInMinutes) {
            this.maxIdleTimeInMinutes = maxIdleTimeInMinutes;
            return this;
        }
        public Integer getMaxIdleTimeInMinutes() {
            return this.maxIdleTimeInMinutes;
        }

    }

    public static class GetInstanceResponseBodyInstanceShutdownTimer extends TeaModel {
        /**
         * <p>The scheduled stop time.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-01-12T14:36:01Z</p>
         */
        @NameInMap("DueTime")
        public String dueTime;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-01-12T14:36:01Z</p>
         */
        @NameInMap("GmtCreateTime")
        public String gmtCreateTime;

        /**
         * <p>The modified time.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-01-12T14:36:01Z</p>
         */
        @NameInMap("GmtModifiedTime")
        public String gmtModifiedTime;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>dsw-730xxxxxxxxxx</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The remaining time before the instance is stopped. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>3600000</p>
         */
        @NameInMap("RemainingTimeInMs")
        public Long remainingTimeInMs;

        public static GetInstanceResponseBodyInstanceShutdownTimer build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceResponseBodyInstanceShutdownTimer self = new GetInstanceResponseBodyInstanceShutdownTimer();
            return TeaModel.build(map, self);
        }

        public GetInstanceResponseBodyInstanceShutdownTimer setDueTime(String dueTime) {
            this.dueTime = dueTime;
            return this;
        }
        public String getDueTime() {
            return this.dueTime;
        }

        public GetInstanceResponseBodyInstanceShutdownTimer setGmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }
        public String getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        public GetInstanceResponseBodyInstanceShutdownTimer setGmtModifiedTime(String gmtModifiedTime) {
            this.gmtModifiedTime = gmtModifiedTime;
            return this;
        }
        public String getGmtModifiedTime() {
            return this.gmtModifiedTime;
        }

        public GetInstanceResponseBodyInstanceShutdownTimer setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetInstanceResponseBodyInstanceShutdownTimer setRemainingTimeInMs(Long remainingTimeInMs) {
            this.remainingTimeInMs = remainingTimeInMs;
            return this;
        }
        public Long getRemainingTimeInMs() {
            return this.remainingTimeInMs;
        }

    }

    public static class GetInstanceResponseBodyInstanceSnapshotList extends TeaModel {
        /**
         * <p>The time when the snapshot was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-01-12T14:36:01Z</p>
         */
        @NameInMap("GmtCreateTime")
        public String gmtCreateTime;

        /**
         * <p>The time when the snapshot was modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-01-12T14:36:01Z</p>
         */
        @NameInMap("GmtModifiedTime")
        public String gmtModifiedTime;

        /**
         * <p>The image ID.</p>
         * 
         * <strong>example:</strong>
         * <p>image-05cefd0be2exxxx</p>
         */
        @NameInMap("ImageId")
        public String imageId;

        /**
         * <p>The image name.</p>
         * 
         * <strong>example:</strong>
         * <p>py36_cpu_tf1.12_ubuntu</p>
         */
        @NameInMap("ImageName")
        public String imageName;

        /**
         * <p>The image URL.</p>
         * 
         * <strong>example:</strong>
         * <p>registry.cn-shanghai.aliyuncs.com/pai_product/tensorflow:py36_cpu_tf1.12_ubuntu</p>
         */
        @NameInMap("ImageUrl")
        public String imageUrl;

        /**
         * <p>The error code of the instance snapshot.</p>
         * 
         * <strong>example:</strong>
         * <p>Internal Error</p>
         */
        @NameInMap("ReasonCode")
        public String reasonCode;

        /**
         * <p>The error message of the instance snapshot.</p>
         * 
         * <strong>example:</strong>
         * <p>ImagePullBackOff</p>
         */
        @NameInMap("ReasonMessage")
        public String reasonMessage;

        /**
         * <p>The image repository URL.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://cr.console.aliyun.com/repository/cn-hangzhou/zouxu/kf/images">https://cr.console.aliyun.com/repository/cn-hangzhou/zouxu/kf/images</a></p>
         */
        @NameInMap("RepositoryUrl")
        public String repositoryUrl;

        /**
         * <p>The instance snapshot status.</p>
         * 
         * <strong>example:</strong>
         * <p>Pushing</p>
         */
        @NameInMap("Status")
        public String status;

        public static GetInstanceResponseBodyInstanceSnapshotList build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceResponseBodyInstanceSnapshotList self = new GetInstanceResponseBodyInstanceSnapshotList();
            return TeaModel.build(map, self);
        }

        public GetInstanceResponseBodyInstanceSnapshotList setGmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }
        public String getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        public GetInstanceResponseBodyInstanceSnapshotList setGmtModifiedTime(String gmtModifiedTime) {
            this.gmtModifiedTime = gmtModifiedTime;
            return this;
        }
        public String getGmtModifiedTime() {
            return this.gmtModifiedTime;
        }

        public GetInstanceResponseBodyInstanceSnapshotList setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public GetInstanceResponseBodyInstanceSnapshotList setImageName(String imageName) {
            this.imageName = imageName;
            return this;
        }
        public String getImageName() {
            return this.imageName;
        }

        public GetInstanceResponseBodyInstanceSnapshotList setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }
        public String getImageUrl() {
            return this.imageUrl;
        }

        public GetInstanceResponseBodyInstanceSnapshotList setReasonCode(String reasonCode) {
            this.reasonCode = reasonCode;
            return this;
        }
        public String getReasonCode() {
            return this.reasonCode;
        }

        public GetInstanceResponseBodyInstanceSnapshotList setReasonMessage(String reasonMessage) {
            this.reasonMessage = reasonMessage;
            return this;
        }
        public String getReasonMessage() {
            return this.reasonMessage;
        }

        public GetInstanceResponseBodyInstanceSnapshotList setRepositoryUrl(String repositoryUrl) {
            this.repositoryUrl = repositoryUrl;
            return this;
        }
        public String getRepositoryUrl() {
            return this.repositoryUrl;
        }

        public GetInstanceResponseBodyInstanceSnapshotList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class GetInstanceResponseBodyLabels extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>stsTokenOwner</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>123xxxxxxxx</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetInstanceResponseBodyLabels build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceResponseBodyLabels self = new GetInstanceResponseBodyLabels();
            return TeaModel.build(map, self);
        }

        public GetInstanceResponseBodyLabels setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetInstanceResponseBodyLabels setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetInstanceResponseBodyLatestSnapshot extends TeaModel {
        /**
         * <p>The time when the snapshot was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-01-12T14:36:01Z</p>
         */
        @NameInMap("GmtCreateTime")
        public String gmtCreateTime;

        /**
         * <p>The time when the snapshot was modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-01-12T14:36:01Z</p>
         */
        @NameInMap("GmtModifiedTime")
        public String gmtModifiedTime;

        /**
         * <p>The image ID.</p>
         * 
         * <strong>example:</strong>
         * <p>image-05cefd0be2exxxx</p>
         */
        @NameInMap("ImageId")
        public String imageId;

        /**
         * <p>The image name.</p>
         * 
         * <strong>example:</strong>
         * <p>py36_cpu_tf1.12_ubuntu</p>
         */
        @NameInMap("ImageName")
        public String imageName;

        /**
         * <p>The image URL.</p>
         * 
         * <strong>example:</strong>
         * <p>registry.cn-shanghai.aliyuncs.com/pai_product/tensorflow:py36_cpu_tf1.12_ubuntu</p>
         */
        @NameInMap("ImageUrl")
        public String imageUrl;

        /**
         * <p>The error code of the instance snapshot.</p>
         * 
         * <strong>example:</strong>
         * <p>Internal Error</p>
         */
        @NameInMap("ReasonCode")
        public String reasonCode;

        /**
         * <p>The error message of the instance snapshot.</p>
         * 
         * <strong>example:</strong>
         * <p>ImagePullBackOff</p>
         */
        @NameInMap("ReasonMessage")
        public String reasonMessage;

        /**
         * <p>The image repository URL.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://cr.console.aliyun.com/repository/cn-hangzhou/zouxu/kf/images">https://cr.console.aliyun.com/repository/cn-hangzhou/zouxu/kf/images</a></p>
         */
        @NameInMap("RepositoryUrl")
        public String repositoryUrl;

        /**
         * <p>The instance snapshot status.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>Committing</li>
         * <li>Pushing</li>
         * <li>Failed</li>
         * <li>Saved</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Pushing</p>
         */
        @NameInMap("Status")
        public String status;

        public static GetInstanceResponseBodyLatestSnapshot build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceResponseBodyLatestSnapshot self = new GetInstanceResponseBodyLatestSnapshot();
            return TeaModel.build(map, self);
        }

        public GetInstanceResponseBodyLatestSnapshot setGmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }
        public String getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        public GetInstanceResponseBodyLatestSnapshot setGmtModifiedTime(String gmtModifiedTime) {
            this.gmtModifiedTime = gmtModifiedTime;
            return this;
        }
        public String getGmtModifiedTime() {
            return this.gmtModifiedTime;
        }

        public GetInstanceResponseBodyLatestSnapshot setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public GetInstanceResponseBodyLatestSnapshot setImageName(String imageName) {
            this.imageName = imageName;
            return this;
        }
        public String getImageName() {
            return this.imageName;
        }

        public GetInstanceResponseBodyLatestSnapshot setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }
        public String getImageUrl() {
            return this.imageUrl;
        }

        public GetInstanceResponseBodyLatestSnapshot setReasonCode(String reasonCode) {
            this.reasonCode = reasonCode;
            return this;
        }
        public String getReasonCode() {
            return this.reasonCode;
        }

        public GetInstanceResponseBodyLatestSnapshot setReasonMessage(String reasonMessage) {
            this.reasonMessage = reasonMessage;
            return this;
        }
        public String getReasonMessage() {
            return this.reasonMessage;
        }

        public GetInstanceResponseBodyLatestSnapshot setRepositoryUrl(String repositoryUrl) {
            this.repositoryUrl = repositoryUrl;
            return this;
        }
        public String getRepositoryUrl() {
            return this.repositoryUrl;
        }

        public GetInstanceResponseBodyLatestSnapshot setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class GetInstanceResponseBodyNodeErrorRecovery extends TeaModel {
        /**
         * <p>The number of seconds to wait before automatic switchover.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("autoSwitchCountdownSeconds")
        public Long autoSwitchCountdownSeconds;

        /**
         * <p>Indicates whether to enable automatic switchover when a node error occurs.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enableAutoSwitchOnNodeError")
        public Boolean enableAutoSwitchOnNodeError;

        /**
         * <p>Indicates whether the node has an error.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("hasNodeError")
        public Boolean hasNodeError;

        public static GetInstanceResponseBodyNodeErrorRecovery build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceResponseBodyNodeErrorRecovery self = new GetInstanceResponseBodyNodeErrorRecovery();
            return TeaModel.build(map, self);
        }

        public GetInstanceResponseBodyNodeErrorRecovery setAutoSwitchCountdownSeconds(Long autoSwitchCountdownSeconds) {
            this.autoSwitchCountdownSeconds = autoSwitchCountdownSeconds;
            return this;
        }
        public Long getAutoSwitchCountdownSeconds() {
            return this.autoSwitchCountdownSeconds;
        }

        public GetInstanceResponseBodyNodeErrorRecovery setEnableAutoSwitchOnNodeError(Boolean enableAutoSwitchOnNodeError) {
            this.enableAutoSwitchOnNodeError = enableAutoSwitchOnNodeError;
            return this;
        }
        public Boolean getEnableAutoSwitchOnNodeError() {
            return this.enableAutoSwitchOnNodeError;
        }

        public GetInstanceResponseBodyNodeErrorRecovery setHasNodeError(Boolean hasNodeError) {
            this.hasNodeError = hasNodeError;
            return this;
        }
        public Boolean getHasNodeError() {
            return this.hasNodeError;
        }

    }

    public static class GetInstanceResponseBodyRequestedResource extends TeaModel {
        /**
         * <p>The number of CPU cores.</p>
         * 
         * <strong>example:</strong>
         * <p>32</p>
         */
        @NameInMap("CPU")
        public String CPU;

        /**
         * <p>The number of GPUs.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("GPU")
        public String GPU;

        /**
         * <p>The GPU type. Valid values:</p>
         * <ul>
         * <li>V100</li>
         * <li>A100</li>
         * <li>T4</li>
         * <li>A10</li>
         * <li>P100</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>v100</p>
         */
        @NameInMap("GPUType")
        public String GPUType;

        /**
         * <p>The memory size. Unit: GB.</p>
         * 
         * <strong>example:</strong>
         * <p>32</p>
         */
        @NameInMap("Memory")
        public String memory;

        /**
         * <p>The shared memory size. Unit: GB.</p>
         * 
         * <strong>example:</strong>
         * <p>32</p>
         */
        @NameInMap("SharedMemory")
        public String sharedMemory;

        public static GetInstanceResponseBodyRequestedResource build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceResponseBodyRequestedResource self = new GetInstanceResponseBodyRequestedResource();
            return TeaModel.build(map, self);
        }

        public GetInstanceResponseBodyRequestedResource setCPU(String CPU) {
            this.CPU = CPU;
            return this;
        }
        public String getCPU() {
            return this.CPU;
        }

        public GetInstanceResponseBodyRequestedResource setGPU(String GPU) {
            this.GPU = GPU;
            return this;
        }
        public String getGPU() {
            return this.GPU;
        }

        public GetInstanceResponseBodyRequestedResource setGPUType(String GPUType) {
            this.GPUType = GPUType;
            return this;
        }
        public String getGPUType() {
            return this.GPUType;
        }

        public GetInstanceResponseBodyRequestedResource setMemory(String memory) {
            this.memory = memory;
            return this;
        }
        public String getMemory() {
            return this.memory;
        }

        public GetInstanceResponseBodyRequestedResource setSharedMemory(String sharedMemory) {
            this.sharedMemory = sharedMemory;
            return this;
        }
        public String getSharedMemory() {
            return this.sharedMemory;
        }

    }

    public static class GetInstanceResponseBodyTags extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>tag1</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>value1</p>
         */
        @NameInMap("TagValue")
        public String tagValue;

        public static GetInstanceResponseBodyTags build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceResponseBodyTags self = new GetInstanceResponseBodyTags();
            return TeaModel.build(map, self);
        }

        public GetInstanceResponseBodyTags setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public GetInstanceResponseBodyTags setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class GetInstanceResponseBodyUserVpc extends TeaModel {
        @NameInMap("BandwidthLimit")
        public BandwidthLimit bandwidthLimit;

        /**
         * <p>Default Route</p>
         * 
         * <strong>example:</strong>
         * <p>eth0 | eth1</p>
         */
        @NameInMap("DefaultRoute")
        public String defaultRoute;

        /**
         * <p>The extended CIDR block.</p>
         * <ul>
         * <li>If you leave VSwitchId empty, this parameter is not required and the system automatically obtains all CIDR blocks in the VPC.</li>
         * <li>If VSwitchId is not empty, this parameter is required. Specify all CIDR blocks in the VPC.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>[&quot;192.168.0.1/24&quot;, &quot;192.168.1.1/24&quot;]</p>
         */
        @NameInMap("ExtendedCIDRs")
        public java.util.List<String> extendedCIDRs;

        /**
         * <p>The forward information.</p>
         */
        @NameInMap("ForwardInfos")
        public java.util.List<ForwardInfoResponse> forwardInfos;

        @NameInMap("Ip")
        public String ip;

        /**
         * <p>The security group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-xxxxxx</p>
         */
        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        /**
         * <p>The vSwitch ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-xxxxx</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The VPC ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-xxxxx</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        public static GetInstanceResponseBodyUserVpc build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceResponseBodyUserVpc self = new GetInstanceResponseBodyUserVpc();
            return TeaModel.build(map, self);
        }

        public GetInstanceResponseBodyUserVpc setBandwidthLimit(BandwidthLimit bandwidthLimit) {
            this.bandwidthLimit = bandwidthLimit;
            return this;
        }
        public BandwidthLimit getBandwidthLimit() {
            return this.bandwidthLimit;
        }

        public GetInstanceResponseBodyUserVpc setDefaultRoute(String defaultRoute) {
            this.defaultRoute = defaultRoute;
            return this;
        }
        public String getDefaultRoute() {
            return this.defaultRoute;
        }

        public GetInstanceResponseBodyUserVpc setExtendedCIDRs(java.util.List<String> extendedCIDRs) {
            this.extendedCIDRs = extendedCIDRs;
            return this;
        }
        public java.util.List<String> getExtendedCIDRs() {
            return this.extendedCIDRs;
        }

        public GetInstanceResponseBodyUserVpc setForwardInfos(java.util.List<ForwardInfoResponse> forwardInfos) {
            this.forwardInfos = forwardInfos;
            return this;
        }
        public java.util.List<ForwardInfoResponse> getForwardInfos() {
            return this.forwardInfos;
        }

        public GetInstanceResponseBodyUserVpc setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public GetInstanceResponseBodyUserVpc setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public GetInstanceResponseBodyUserVpc setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public GetInstanceResponseBodyUserVpc setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

}
