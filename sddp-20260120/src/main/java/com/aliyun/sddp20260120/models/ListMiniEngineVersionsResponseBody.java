// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20260120.models;

import com.aliyun.tea.*;

public class ListMiniEngineVersionsResponseBody extends TeaModel {
    /**
     * <p>The list of available kernel versions.</p>
     */
    @NameInMap("KernelVersions")
    public java.util.List<ListMiniEngineVersionsResponseBodyKernelVersions> kernelVersions;

    /**
     * <p>The request ID. You can use this ID to locate the API call.</p>
     * 
     * <strong>example:</strong>
     * <p>7C6D8E9F-1234-5678-ABCD-0123456789AB</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListMiniEngineVersionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMiniEngineVersionsResponseBody self = new ListMiniEngineVersionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMiniEngineVersionsResponseBody setKernelVersions(java.util.List<ListMiniEngineVersionsResponseBodyKernelVersions> kernelVersions) {
        this.kernelVersions = kernelVersions;
        return this;
    }
    public java.util.List<ListMiniEngineVersionsResponseBodyKernelVersions> getKernelVersions() {
        return this.kernelVersions;
    }

    public ListMiniEngineVersionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListMiniEngineVersionsResponseBodyKernelVersions extends TeaModel {
        /**
         * <p>The release type of the kernel version. This value is the same as the value returned by the corresponding database product. For example, for ApsaraDB RDS, LTS indicates a long-term support version and BETA indicates a preview version. For PolarDB, the value can be Stable, Old, HighRisk, or Beta.</p>
         * 
         * <strong>example:</strong>
         * <p>LTS</p>
         */
        @NameInMap("KernelReleaseType")
        public String kernelReleaseType;

        /**
         * <p>The available kernel version number.</p>
         * 
         * <strong>example:</strong>
         * <p>rds_20220731</p>
         */
        @NameInMap("KernelVersion")
        public String kernelVersion;

        /**
         * <p>The display name of the kernel version.</p>
         * 
         * <strong>example:</strong>
         * <p>MySQL 8.0</p>
         */
        @NameInMap("KernelVersionName")
        public String kernelVersionName;

        public static ListMiniEngineVersionsResponseBodyKernelVersions build(java.util.Map<String, ?> map) throws Exception {
            ListMiniEngineVersionsResponseBodyKernelVersions self = new ListMiniEngineVersionsResponseBodyKernelVersions();
            return TeaModel.build(map, self);
        }

        public ListMiniEngineVersionsResponseBodyKernelVersions setKernelReleaseType(String kernelReleaseType) {
            this.kernelReleaseType = kernelReleaseType;
            return this;
        }
        public String getKernelReleaseType() {
            return this.kernelReleaseType;
        }

        public ListMiniEngineVersionsResponseBodyKernelVersions setKernelVersion(String kernelVersion) {
            this.kernelVersion = kernelVersion;
            return this;
        }
        public String getKernelVersion() {
            return this.kernelVersion;
        }

        public ListMiniEngineVersionsResponseBodyKernelVersions setKernelVersionName(String kernelVersionName) {
            this.kernelVersionName = kernelVersionName;
            return this;
        }
        public String getKernelVersionName() {
            return this.kernelVersionName;
        }

    }

}
