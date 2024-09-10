// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateOpaClusterPluginResponseBody extends TeaModel {
    /**
     * <p>The installation status of the components.</p>
     */
    @NameInMap("InstallStatus")
    public java.util.List<CreateOpaClusterPluginResponseBodyInstallStatus> installStatus;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>D65AADFC-1D20-5A6A-8F6A-9FA53C0DC1F8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateOpaClusterPluginResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateOpaClusterPluginResponseBody self = new CreateOpaClusterPluginResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateOpaClusterPluginResponseBody setInstallStatus(java.util.List<CreateOpaClusterPluginResponseBodyInstallStatus> installStatus) {
        this.installStatus = installStatus;
        return this;
    }
    public java.util.List<CreateOpaClusterPluginResponseBodyInstallStatus> getInstallStatus() {
        return this.installStatus;
    }

    public CreateOpaClusterPluginResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateOpaClusterPluginResponseBodyInstallStatus extends TeaModel {
        /**
         * <p>The cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>c60b77fe62093480db6164a3c2fa****</p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        /**
         * <p>Indicates whether the component is installed. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("InstallStatus")
        public Boolean installStatus;

        public static CreateOpaClusterPluginResponseBodyInstallStatus build(java.util.Map<String, ?> map) throws Exception {
            CreateOpaClusterPluginResponseBodyInstallStatus self = new CreateOpaClusterPluginResponseBodyInstallStatus();
            return TeaModel.build(map, self);
        }

        public CreateOpaClusterPluginResponseBodyInstallStatus setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public CreateOpaClusterPluginResponseBodyInstallStatus setInstallStatus(Boolean installStatus) {
            this.installStatus = installStatus;
            return this;
        }
        public Boolean getInstallStatus() {
            return this.installStatus;
        }

    }

}
