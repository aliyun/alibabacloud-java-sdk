// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListAKSClustersResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("List")
    public java.util.List<ListAKSClustersResponseBodyList> list;

    public static ListAKSClustersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAKSClustersResponseBody self = new ListAKSClustersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAKSClustersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAKSClustersResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListAKSClustersResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ListAKSClustersResponseBody setList(java.util.List<ListAKSClustersResponseBodyList> list) {
        this.list = list;
        return this;
    }
    public java.util.List<ListAKSClustersResponseBodyList> getList() {
        return this.list;
    }

    public static class ListAKSClustersResponseBodyListCellInfos extends TeaModel {
        @NameInMap("DisplayName")
        public String displayName;

        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        public static ListAKSClustersResponseBodyListCellInfos build(java.util.Map<String, ?> map) throws Exception {
            ListAKSClustersResponseBodyListCellInfos self = new ListAKSClustersResponseBodyListCellInfos();
            return TeaModel.build(map, self);
        }

        public ListAKSClustersResponseBodyListCellInfos setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ListAKSClustersResponseBodyListCellInfos setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListAKSClustersResponseBodyListCellInfos setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ListAKSClustersResponseBodyListSecuredGroupInfos extends TeaModel {
        @NameInMap("IaasProviderId")
        public String iaasProviderId;

        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        @NameInMap("SecuredGroupIdentity")
        public String securedGroupIdentity;

        @NameInMap("SecuredZoneId")
        public String securedZoneId;

        @NameInMap("UtcCreate")
        public String utcCreate;

        @NameInMap("UtcModified")
        public String utcModified;

        public static ListAKSClustersResponseBodyListSecuredGroupInfos build(java.util.Map<String, ?> map) throws Exception {
            ListAKSClustersResponseBodyListSecuredGroupInfos self = new ListAKSClustersResponseBodyListSecuredGroupInfos();
            return TeaModel.build(map, self);
        }

        public ListAKSClustersResponseBodyListSecuredGroupInfos setIaasProviderId(String iaasProviderId) {
            this.iaasProviderId = iaasProviderId;
            return this;
        }
        public String getIaasProviderId() {
            return this.iaasProviderId;
        }

        public ListAKSClustersResponseBodyListSecuredGroupInfos setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListAKSClustersResponseBodyListSecuredGroupInfos setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListAKSClustersResponseBodyListSecuredGroupInfos setSecuredGroupIdentity(String securedGroupIdentity) {
            this.securedGroupIdentity = securedGroupIdentity;
            return this;
        }
        public String getSecuredGroupIdentity() {
            return this.securedGroupIdentity;
        }

        public ListAKSClustersResponseBodyListSecuredGroupInfos setSecuredZoneId(String securedZoneId) {
            this.securedZoneId = securedZoneId;
            return this;
        }
        public String getSecuredZoneId() {
            return this.securedZoneId;
        }

        public ListAKSClustersResponseBodyListSecuredGroupInfos setUtcCreate(String utcCreate) {
            this.utcCreate = utcCreate;
            return this;
        }
        public String getUtcCreate() {
            return this.utcCreate;
        }

        public ListAKSClustersResponseBodyListSecuredGroupInfos setUtcModified(String utcModified) {
            this.utcModified = utcModified;
            return this;
        }
        public String getUtcModified() {
            return this.utcModified;
        }

    }

    public static class ListAKSClustersResponseBodyListZoneInfos extends TeaModel {
        @NameInMap("DisplayName")
        public String displayName;

        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        public static ListAKSClustersResponseBodyListZoneInfos build(java.util.Map<String, ?> map) throws Exception {
            ListAKSClustersResponseBodyListZoneInfos self = new ListAKSClustersResponseBodyListZoneInfos();
            return TeaModel.build(map, self);
        }

        public ListAKSClustersResponseBodyListZoneInfos setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ListAKSClustersResponseBodyListZoneInfos setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListAKSClustersResponseBodyListZoneInfos setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ListAKSClustersResponseBodyListNetworkInfo extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("Segment")
        public String segment;

        @NameInMap("Type")
        public String type;

        public static ListAKSClustersResponseBodyListNetworkInfo build(java.util.Map<String, ?> map) throws Exception {
            ListAKSClustersResponseBodyListNetworkInfo self = new ListAKSClustersResponseBodyListNetworkInfo();
            return TeaModel.build(map, self);
        }

        public ListAKSClustersResponseBodyListNetworkInfo setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListAKSClustersResponseBodyListNetworkInfo setSegment(String segment) {
            this.segment = segment;
            return this;
        }
        public String getSegment() {
            return this.segment;
        }

        public ListAKSClustersResponseBodyListNetworkInfo setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListAKSClustersResponseBodyList extends TeaModel {
        @NameInMap("AlsProjectName")
        public String alsProjectName;

        @NameInMap("ClusterProviderType")
        public String clusterProviderType;

        @NameInMap("DisplayName")
        public String displayName;

        @NameInMap("EnableLogging")
        public Boolean enableLogging;

        @NameInMap("EnableMesh")
        public Boolean enableMesh;

        @NameInMap("EnableMetis")
        public Boolean enableMetis;

        @NameInMap("Id")
        public String id;

        @NameInMap("InstallType")
        public String installType;

        @NameInMap("Name")
        public String name;

        @NameInMap("PodCidr")
        public String podCidr;

        @NameInMap("ServiceCidr")
        public String serviceCidr;

        @NameInMap("Status")
        public String status;

        @NameInMap("CellInfos")
        public java.util.List<ListAKSClustersResponseBodyListCellInfos> cellInfos;

        @NameInMap("SecuredGroupInfos")
        public java.util.List<ListAKSClustersResponseBodyListSecuredGroupInfos> securedGroupInfos;

        @NameInMap("ZoneInfos")
        public java.util.List<ListAKSClustersResponseBodyListZoneInfos> zoneInfos;

        @NameInMap("NetworkInfo")
        public ListAKSClustersResponseBodyListNetworkInfo networkInfo;

        public static ListAKSClustersResponseBodyList build(java.util.Map<String, ?> map) throws Exception {
            ListAKSClustersResponseBodyList self = new ListAKSClustersResponseBodyList();
            return TeaModel.build(map, self);
        }

        public ListAKSClustersResponseBodyList setAlsProjectName(String alsProjectName) {
            this.alsProjectName = alsProjectName;
            return this;
        }
        public String getAlsProjectName() {
            return this.alsProjectName;
        }

        public ListAKSClustersResponseBodyList setClusterProviderType(String clusterProviderType) {
            this.clusterProviderType = clusterProviderType;
            return this;
        }
        public String getClusterProviderType() {
            return this.clusterProviderType;
        }

        public ListAKSClustersResponseBodyList setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ListAKSClustersResponseBodyList setEnableLogging(Boolean enableLogging) {
            this.enableLogging = enableLogging;
            return this;
        }
        public Boolean getEnableLogging() {
            return this.enableLogging;
        }

        public ListAKSClustersResponseBodyList setEnableMesh(Boolean enableMesh) {
            this.enableMesh = enableMesh;
            return this;
        }
        public Boolean getEnableMesh() {
            return this.enableMesh;
        }

        public ListAKSClustersResponseBodyList setEnableMetis(Boolean enableMetis) {
            this.enableMetis = enableMetis;
            return this;
        }
        public Boolean getEnableMetis() {
            return this.enableMetis;
        }

        public ListAKSClustersResponseBodyList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListAKSClustersResponseBodyList setInstallType(String installType) {
            this.installType = installType;
            return this;
        }
        public String getInstallType() {
            return this.installType;
        }

        public ListAKSClustersResponseBodyList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListAKSClustersResponseBodyList setPodCidr(String podCidr) {
            this.podCidr = podCidr;
            return this;
        }
        public String getPodCidr() {
            return this.podCidr;
        }

        public ListAKSClustersResponseBodyList setServiceCidr(String serviceCidr) {
            this.serviceCidr = serviceCidr;
            return this;
        }
        public String getServiceCidr() {
            return this.serviceCidr;
        }

        public ListAKSClustersResponseBodyList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListAKSClustersResponseBodyList setCellInfos(java.util.List<ListAKSClustersResponseBodyListCellInfos> cellInfos) {
            this.cellInfos = cellInfos;
            return this;
        }
        public java.util.List<ListAKSClustersResponseBodyListCellInfos> getCellInfos() {
            return this.cellInfos;
        }

        public ListAKSClustersResponseBodyList setSecuredGroupInfos(java.util.List<ListAKSClustersResponseBodyListSecuredGroupInfos> securedGroupInfos) {
            this.securedGroupInfos = securedGroupInfos;
            return this;
        }
        public java.util.List<ListAKSClustersResponseBodyListSecuredGroupInfos> getSecuredGroupInfos() {
            return this.securedGroupInfos;
        }

        public ListAKSClustersResponseBodyList setZoneInfos(java.util.List<ListAKSClustersResponseBodyListZoneInfos> zoneInfos) {
            this.zoneInfos = zoneInfos;
            return this;
        }
        public java.util.List<ListAKSClustersResponseBodyListZoneInfos> getZoneInfos() {
            return this.zoneInfos;
        }

        public ListAKSClustersResponseBodyList setNetworkInfo(ListAKSClustersResponseBodyListNetworkInfo networkInfo) {
            this.networkInfo = networkInfo;
            return this;
        }
        public ListAKSClustersResponseBodyListNetworkInfo getNetworkInfo() {
            return this.networkInfo;
        }

    }

}
