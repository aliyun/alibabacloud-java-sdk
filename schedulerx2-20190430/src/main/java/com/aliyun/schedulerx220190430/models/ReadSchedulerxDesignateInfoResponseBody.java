// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx220190430.models;

import com.aliyun.tea.*;

public class ReadSchedulerxDesignateInfoResponseBody extends TeaModel {
    /**
     * <p>The access denial details.</p>
     */
    @NameInMap("AccessDeniedDetail")
    public ReadSchedulerxDesignateInfoResponseBodyAccessDeniedDetail accessDeniedDetail;

    /**
     * <p>The HTTP status code returned.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("Data")
    public ReadSchedulerxDesignateInfoResponseBodyData data;

    /**
     * <p>The error message returned only if an error occurs.</p>
     * 
     * <strong>example:</strong>
     * <p>jobId=xxx is not existed</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4F68ABED-AC31-4412-9297-D9A8F0401108</p>
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

    public static ReadSchedulerxDesignateInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ReadSchedulerxDesignateInfoResponseBody self = new ReadSchedulerxDesignateInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public ReadSchedulerxDesignateInfoResponseBody setAccessDeniedDetail(ReadSchedulerxDesignateInfoResponseBodyAccessDeniedDetail accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public ReadSchedulerxDesignateInfoResponseBodyAccessDeniedDetail getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public ReadSchedulerxDesignateInfoResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ReadSchedulerxDesignateInfoResponseBody setData(ReadSchedulerxDesignateInfoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ReadSchedulerxDesignateInfoResponseBodyData getData() {
        return this.data;
    }

    public ReadSchedulerxDesignateInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ReadSchedulerxDesignateInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ReadSchedulerxDesignateInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ReadSchedulerxDesignateInfoResponseBodyAccessDeniedDetail extends TeaModel {
        /**
         * <p>The authentication operation.</p>
         * 
         * <strong>example:</strong>
         * <p>edas:ReadSchedulerxDesignateInfo</p>
         */
        @NameInMap("AuthAction")
        public String authAction;

        /**
         * <p>The principal name.</p>
         * 
         * <strong>example:</strong>
         * <p>209312833131416xxx</p>
         */
        @NameInMap("AuthPrincipalDisplayName")
        public String authPrincipalDisplayName;

        /**
         * <p>The principal account.</p>
         * 
         * <strong>example:</strong>
         * <p>1827811800526xxx</p>
         */
        @NameInMap("AuthPrincipalOwnerId")
        public String authPrincipalOwnerId;

        /**
         * <p>The principal type.</p>
         * 
         * <strong>example:</strong>
         * <p>SubUser</p>
         */
        @NameInMap("AuthPrincipalType")
        public String authPrincipalType;

        /**
         * <p>The encoded diagnostic message.</p>
         * 
         * <strong>example:</strong>
         * <p>AQFn/cLPZ/3Cz0YxQkZBMjVGLTY0REUtNTlGNS05NzUwLTgyMUE4M0MwMTFDRQ==</p>
         */
        @NameInMap("EncodedDiagnosticMessage")
        public String encodedDiagnosticMessage;

        /**
         * <p>The permission denial type.</p>
         * 
         * <strong>example:</strong>
         * <p>ImplicitDeny</p>
         */
        @NameInMap("NoPermissionType")
        public String noPermissionType;

        /**
         * <p>The policy type.</p>
         * 
         * <strong>example:</strong>
         * <p>AccountLevelIdentityBasedPolicy</p>
         */
        @NameInMap("PolicyType")
        public String policyType;

        public static ReadSchedulerxDesignateInfoResponseBodyAccessDeniedDetail build(java.util.Map<String, ?> map) throws Exception {
            ReadSchedulerxDesignateInfoResponseBodyAccessDeniedDetail self = new ReadSchedulerxDesignateInfoResponseBodyAccessDeniedDetail();
            return TeaModel.build(map, self);
        }

        public ReadSchedulerxDesignateInfoResponseBodyAccessDeniedDetail setAuthAction(String authAction) {
            this.authAction = authAction;
            return this;
        }
        public String getAuthAction() {
            return this.authAction;
        }

        public ReadSchedulerxDesignateInfoResponseBodyAccessDeniedDetail setAuthPrincipalDisplayName(String authPrincipalDisplayName) {
            this.authPrincipalDisplayName = authPrincipalDisplayName;
            return this;
        }
        public String getAuthPrincipalDisplayName() {
            return this.authPrincipalDisplayName;
        }

        public ReadSchedulerxDesignateInfoResponseBodyAccessDeniedDetail setAuthPrincipalOwnerId(String authPrincipalOwnerId) {
            this.authPrincipalOwnerId = authPrincipalOwnerId;
            return this;
        }
        public String getAuthPrincipalOwnerId() {
            return this.authPrincipalOwnerId;
        }

        public ReadSchedulerxDesignateInfoResponseBodyAccessDeniedDetail setAuthPrincipalType(String authPrincipalType) {
            this.authPrincipalType = authPrincipalType;
            return this;
        }
        public String getAuthPrincipalType() {
            return this.authPrincipalType;
        }

        public ReadSchedulerxDesignateInfoResponseBodyAccessDeniedDetail setEncodedDiagnosticMessage(String encodedDiagnosticMessage) {
            this.encodedDiagnosticMessage = encodedDiagnosticMessage;
            return this;
        }
        public String getEncodedDiagnosticMessage() {
            return this.encodedDiagnosticMessage;
        }

        public ReadSchedulerxDesignateInfoResponseBodyAccessDeniedDetail setNoPermissionType(String noPermissionType) {
            this.noPermissionType = noPermissionType;
            return this;
        }
        public String getNoPermissionType() {
            return this.noPermissionType;
        }

        public ReadSchedulerxDesignateInfoResponseBodyAccessDeniedDetail setPolicyType(String policyType) {
            this.policyType = policyType;
            return this;
        }
        public String getPolicyType() {
            return this.policyType;
        }

    }

    public static class ReadSchedulerxDesignateInfoResponseBodyDataDesignateDetailVosMetrics extends TeaModel {
        /**
         * <p>The most recent value of CPU workload.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CpuLoad1")
        public Double cpuLoad1;

        /**
         * <p>The average of the latest five values of CPU workload.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CpuLoad5")
        public Double cpuLoad5;

        /**
         * <p>The number of available CPU processors.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CpuProcessors")
        public Integer cpuProcessors;

        /**
         * <p>The total disk capacity in MB.</p>
         * 
         * <strong>example:</strong>
         * <p>1024</p>
         */
        @NameInMap("DiskMax")
        public Integer diskMax;

        /**
         * <p>The disk usage.</p>
         * 
         * <strong>example:</strong>
         * <p>0.19142496008515167</p>
         */
        @NameInMap("DiskUsage")
        public Double diskUsage;

        /**
         * <p>The used disk space in MB.</p>
         * 
         * <strong>example:</strong>
         * <p>148</p>
         */
        @NameInMap("DiskUsed")
        public Integer diskUsed;

        /**
         * <p>The number of job executions.</p>
         * 
         * <strong>example:</strong>
         * <p>56</p>
         */
        @NameInMap("ExecCount")
        public Long execCount;

        /**
         * <p>The most recent value of heap memory usage.</p>
         * 
         * <strong>example:</strong>
         * <p>0.06072874493927125</p>
         */
        @NameInMap("Heap1Usage")
        public Double heap1Usage;

        /**
         * <p>The most recent value of used heap memory in MB.</p>
         * 
         * <strong>example:</strong>
         * <p>14</p>
         */
        @NameInMap("Heap1Used")
        public Double heap1Used;

        /**
         * <p>The average of the latest five values of heap memory usage.</p>
         * 
         * <strong>example:</strong>
         * <p>0.06477732793522267</p>
         */
        @NameInMap("Heap5Usage")
        public Double heap5Usage;

        /**
         * <p>The maximum heap memory in MB.</p>
         * 
         * <strong>example:</strong>
         * <p>500</p>
         */
        @NameInMap("HeapMax")
        public Integer heapMax;

        /**
         * <p>The number of available resources in the shared pool.</p>
         * 
         * <strong>example:</strong>
         * <p>72</p>
         */
        @NameInMap("SharePoolAvailableSize")
        public Integer sharePoolAvailableSize;

        /**
         * <p>The queue size in the shared pool.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SharePoolQueueSize")
        public Integer sharePoolQueueSize;

        public static ReadSchedulerxDesignateInfoResponseBodyDataDesignateDetailVosMetrics build(java.util.Map<String, ?> map) throws Exception {
            ReadSchedulerxDesignateInfoResponseBodyDataDesignateDetailVosMetrics self = new ReadSchedulerxDesignateInfoResponseBodyDataDesignateDetailVosMetrics();
            return TeaModel.build(map, self);
        }

        public ReadSchedulerxDesignateInfoResponseBodyDataDesignateDetailVosMetrics setCpuLoad1(Double cpuLoad1) {
            this.cpuLoad1 = cpuLoad1;
            return this;
        }
        public Double getCpuLoad1() {
            return this.cpuLoad1;
        }

        public ReadSchedulerxDesignateInfoResponseBodyDataDesignateDetailVosMetrics setCpuLoad5(Double cpuLoad5) {
            this.cpuLoad5 = cpuLoad5;
            return this;
        }
        public Double getCpuLoad5() {
            return this.cpuLoad5;
        }

        public ReadSchedulerxDesignateInfoResponseBodyDataDesignateDetailVosMetrics setCpuProcessors(Integer cpuProcessors) {
            this.cpuProcessors = cpuProcessors;
            return this;
        }
        public Integer getCpuProcessors() {
            return this.cpuProcessors;
        }

        public ReadSchedulerxDesignateInfoResponseBodyDataDesignateDetailVosMetrics setDiskMax(Integer diskMax) {
            this.diskMax = diskMax;
            return this;
        }
        public Integer getDiskMax() {
            return this.diskMax;
        }

        public ReadSchedulerxDesignateInfoResponseBodyDataDesignateDetailVosMetrics setDiskUsage(Double diskUsage) {
            this.diskUsage = diskUsage;
            return this;
        }
        public Double getDiskUsage() {
            return this.diskUsage;
        }

        public ReadSchedulerxDesignateInfoResponseBodyDataDesignateDetailVosMetrics setDiskUsed(Integer diskUsed) {
            this.diskUsed = diskUsed;
            return this;
        }
        public Integer getDiskUsed() {
            return this.diskUsed;
        }

        public ReadSchedulerxDesignateInfoResponseBodyDataDesignateDetailVosMetrics setExecCount(Long execCount) {
            this.execCount = execCount;
            return this;
        }
        public Long getExecCount() {
            return this.execCount;
        }

        public ReadSchedulerxDesignateInfoResponseBodyDataDesignateDetailVosMetrics setHeap1Usage(Double heap1Usage) {
            this.heap1Usage = heap1Usage;
            return this;
        }
        public Double getHeap1Usage() {
            return this.heap1Usage;
        }

        public ReadSchedulerxDesignateInfoResponseBodyDataDesignateDetailVosMetrics setHeap1Used(Double heap1Used) {
            this.heap1Used = heap1Used;
            return this;
        }
        public Double getHeap1Used() {
            return this.heap1Used;
        }

        public ReadSchedulerxDesignateInfoResponseBodyDataDesignateDetailVosMetrics setHeap5Usage(Double heap5Usage) {
            this.heap5Usage = heap5Usage;
            return this;
        }
        public Double getHeap5Usage() {
            return this.heap5Usage;
        }

        public ReadSchedulerxDesignateInfoResponseBodyDataDesignateDetailVosMetrics setHeapMax(Integer heapMax) {
            this.heapMax = heapMax;
            return this;
        }
        public Integer getHeapMax() {
            return this.heapMax;
        }

        public ReadSchedulerxDesignateInfoResponseBodyDataDesignateDetailVosMetrics setSharePoolAvailableSize(Integer sharePoolAvailableSize) {
            this.sharePoolAvailableSize = sharePoolAvailableSize;
            return this;
        }
        public Integer getSharePoolAvailableSize() {
            return this.sharePoolAvailableSize;
        }

        public ReadSchedulerxDesignateInfoResponseBodyDataDesignateDetailVosMetrics setSharePoolQueueSize(Integer sharePoolQueueSize) {
            this.sharePoolQueueSize = sharePoolQueueSize;
            return this;
        }
        public Integer getSharePoolQueueSize() {
            return this.sharePoolQueueSize;
        }

    }

    public static class ReadSchedulerxDesignateInfoResponseBodyDataDesignateDetailVos extends TeaModel {
        /**
         * <p>The status of the workers. Valid values:</p>
         * <ul>
         * <li>FREE: idle.</li>
         * <li>LOAD5_BUSY: The average of the latest five values of CPU workload is too high.</li>
         * <li>HEAP5_BUSY: The average of the latest five values of heap memory usage is too high.</li>
         * <li>DISK_BUSY: The disk usage is too high.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>FREE</p>
         */
        @NameInMap("Busy")
        public String busy;

        /**
         * <p>Indicates whether the workers are specified.</p>
         * <ul>
         * <li>true: The workers are specified.</li>
         * <li>false: The workers are not specified.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Checked")
        public Boolean checked;

        /**
         * <p>The information returned based on the value of the DesignateType parameter.</p>
         * <ul>
         * <li>If you set the DesignateType parameter to 2, the tags of the workers are returned.</li>
         * <li>If you set the DesignateType parameter to 1, the IP addresses of the workers are returned.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>10.52.169.25</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The metric values.</p>
         */
        @NameInMap("Metrics")
        public ReadSchedulerxDesignateInfoResponseBodyDataDesignateDetailVosMetrics metrics;

        /**
         * <p>Indicates whether the workers are offline.</p>
         * 
         * <strong>example:</strong>
         * <p>fasle</p>
         */
        @NameInMap("Offline")
        public Boolean offline;

        /**
         * <p>The number of workers.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Size")
        public Integer size;

        /**
         * <p>The startup method of the workers.</p>
         * 
         * <strong>example:</strong>
         * <p>pod</p>
         */
        @NameInMap("Starter")
        public String starter;

        /**
         * <p>The version of the workers.</p>
         * 
         * <strong>example:</strong>
         * <p>1.12.5</p>
         */
        @NameInMap("Version")
        public String version;

        public static ReadSchedulerxDesignateInfoResponseBodyDataDesignateDetailVos build(java.util.Map<String, ?> map) throws Exception {
            ReadSchedulerxDesignateInfoResponseBodyDataDesignateDetailVos self = new ReadSchedulerxDesignateInfoResponseBodyDataDesignateDetailVos();
            return TeaModel.build(map, self);
        }

        public ReadSchedulerxDesignateInfoResponseBodyDataDesignateDetailVos setBusy(String busy) {
            this.busy = busy;
            return this;
        }
        public String getBusy() {
            return this.busy;
        }

        public ReadSchedulerxDesignateInfoResponseBodyDataDesignateDetailVos setChecked(Boolean checked) {
            this.checked = checked;
            return this;
        }
        public Boolean getChecked() {
            return this.checked;
        }

        public ReadSchedulerxDesignateInfoResponseBodyDataDesignateDetailVos setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ReadSchedulerxDesignateInfoResponseBodyDataDesignateDetailVos setMetrics(ReadSchedulerxDesignateInfoResponseBodyDataDesignateDetailVosMetrics metrics) {
            this.metrics = metrics;
            return this;
        }
        public ReadSchedulerxDesignateInfoResponseBodyDataDesignateDetailVosMetrics getMetrics() {
            return this.metrics;
        }

        public ReadSchedulerxDesignateInfoResponseBodyDataDesignateDetailVos setOffline(Boolean offline) {
            this.offline = offline;
            return this;
        }
        public Boolean getOffline() {
            return this.offline;
        }

        public ReadSchedulerxDesignateInfoResponseBodyDataDesignateDetailVos setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

        public ReadSchedulerxDesignateInfoResponseBodyDataDesignateDetailVos setStarter(String starter) {
            this.starter = starter;
            return this;
        }
        public String getStarter() {
            return this.starter;
        }

        public ReadSchedulerxDesignateInfoResponseBodyDataDesignateDetailVos setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class ReadSchedulerxDesignateInfoResponseBodyData extends TeaModel {
        /**
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("DesignateDetailVos")
        public java.util.List<ReadSchedulerxDesignateInfoResponseBodyDataDesignateDetailVos> designateDetailVos;

        /**
         * <p>The information type of the specified workers.</p>
         * <ul>
         * <li>1: the IP address of the specified workers.</li>
         * <li>2: the tags of the specified workers.</li>
         * </ul>
         * <blockquote>
         * <p> The default value of the DesignateType parameter is 1.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("DesignateType")
        public Integer designateType;

        /**
         * <p>Indicates whether to enable failover for the workers. If you set this parameter to true, the job is scheduled to other workers when the specified workers go offline.</p>
         * <ul>
         * <li>true: enables failover for the workers.</li>
         * <li>false: disables failover for the workers.</li>
         * </ul>
         * <blockquote>
         * <p> The default value of the Transferable parameter is false.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Transferable")
        public Boolean transferable;

        public static ReadSchedulerxDesignateInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ReadSchedulerxDesignateInfoResponseBodyData self = new ReadSchedulerxDesignateInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ReadSchedulerxDesignateInfoResponseBodyData setDesignateDetailVos(java.util.List<ReadSchedulerxDesignateInfoResponseBodyDataDesignateDetailVos> designateDetailVos) {
            this.designateDetailVos = designateDetailVos;
            return this;
        }
        public java.util.List<ReadSchedulerxDesignateInfoResponseBodyDataDesignateDetailVos> getDesignateDetailVos() {
            return this.designateDetailVos;
        }

        public ReadSchedulerxDesignateInfoResponseBodyData setDesignateType(Integer designateType) {
            this.designateType = designateType;
            return this;
        }
        public Integer getDesignateType() {
            return this.designateType;
        }

        public ReadSchedulerxDesignateInfoResponseBodyData setTransferable(Boolean transferable) {
            this.transferable = transferable;
            return this;
        }
        public Boolean getTransferable() {
            return this.transferable;
        }

    }

}
