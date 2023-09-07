// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateOpaClusterPluginResponseBody extends TeaModel {
    @NameInMap("InstallStatus")
    public java.util.List<CreateOpaClusterPluginResponseBodyInstallStatus> installStatus;

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
        @NameInMap("ClusterId")
        public String clusterId;

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
