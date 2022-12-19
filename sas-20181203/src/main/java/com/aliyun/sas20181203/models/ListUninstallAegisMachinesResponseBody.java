// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListUninstallAegisMachinesResponseBody extends TeaModel {
    // The page number of the returned page.
    @NameInMap("CurrentPage")
    public Integer currentPage;

    // An array that consists of the information about servers.
    @NameInMap("MachineList")
    public java.util.List<ListUninstallAegisMachinesResponseBodyMachineList> machineList;

    // The number of entries returned per page.
    @NameInMap("PageSize")
    public Integer pageSize;

    // The ID of the request, which is used to locate and troubleshoot issues.
    @NameInMap("RequestId")
    public String requestId;

    // The total number of entries returned.
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListUninstallAegisMachinesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListUninstallAegisMachinesResponseBody self = new ListUninstallAegisMachinesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListUninstallAegisMachinesResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListUninstallAegisMachinesResponseBody setMachineList(java.util.List<ListUninstallAegisMachinesResponseBodyMachineList> machineList) {
        this.machineList = machineList;
        return this;
    }
    public java.util.List<ListUninstallAegisMachinesResponseBodyMachineList> getMachineList() {
        return this.machineList;
    }

    public ListUninstallAegisMachinesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListUninstallAegisMachinesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListUninstallAegisMachinesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListUninstallAegisMachinesResponseBodyMachineList extends TeaModel {
        // The ID of the server.
        @NameInMap("InstanceId")
        public String instanceId;

        // The name of the server.
        @NameInMap("InstanceName")
        public String instanceName;

        // The public IP address of the server.
        @NameInMap("InternetIp")
        public String internetIp;

        // The private IP address of the server.
        @NameInMap("IntranetIp")
        public String intranetIp;

        // The region in which the server resides.
        @NameInMap("MachineRegion")
        public String machineRegion;

        // The operating system of the server. Valid values:
        // 
        // *   **linux**
        // *   **windows**
        // *   **windows-2003**
        @NameInMap("Os")
        public String os;

        // The ID of the region in which the server resides.
        @NameInMap("RegionId")
        public String regionId;

        // The UUID of the server.
        @NameInMap("Uuid")
        public String uuid;

        // The source of the server. Valid values:
        // 
        // *   **0**: an asset provided by Alibaba Cloud
        // *   **1**: a third-party cloud server
        // *   **2**: a server in a data center
        // *   **3**, **4**, **5**, and **7**: other cloud asset
        // *   **8**: a lightweight asset
        @NameInMap("Vendor")
        public Integer vendor;

        // The name of the service provider (SP) for the server.
        // 
        // Valid values:
        // 
        // *   **ALIYUN**: Alibaba Cloud
        // *   **OUT**: a third-party service provider
        // *   **IDC**: a data center
        // *   **TENCENT**: Tencent Cloud
        // *   **HUAWEICLOUD**: Huawei Cloud
        // *   **Microsoft**: Microsoft
        // *   **AWS**: Amazon Web Services (AWS)
        // *   **TRIPARTITE**: a lightweight server
        @NameInMap("VendorName")
        public String vendorName;

        public static ListUninstallAegisMachinesResponseBodyMachineList build(java.util.Map<String, ?> map) throws Exception {
            ListUninstallAegisMachinesResponseBodyMachineList self = new ListUninstallAegisMachinesResponseBodyMachineList();
            return TeaModel.build(map, self);
        }

        public ListUninstallAegisMachinesResponseBodyMachineList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListUninstallAegisMachinesResponseBodyMachineList setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public ListUninstallAegisMachinesResponseBodyMachineList setInternetIp(String internetIp) {
            this.internetIp = internetIp;
            return this;
        }
        public String getInternetIp() {
            return this.internetIp;
        }

        public ListUninstallAegisMachinesResponseBodyMachineList setIntranetIp(String intranetIp) {
            this.intranetIp = intranetIp;
            return this;
        }
        public String getIntranetIp() {
            return this.intranetIp;
        }

        public ListUninstallAegisMachinesResponseBodyMachineList setMachineRegion(String machineRegion) {
            this.machineRegion = machineRegion;
            return this;
        }
        public String getMachineRegion() {
            return this.machineRegion;
        }

        public ListUninstallAegisMachinesResponseBodyMachineList setOs(String os) {
            this.os = os;
            return this;
        }
        public String getOs() {
            return this.os;
        }

        public ListUninstallAegisMachinesResponseBodyMachineList setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListUninstallAegisMachinesResponseBodyMachineList setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

        public ListUninstallAegisMachinesResponseBodyMachineList setVendor(Integer vendor) {
            this.vendor = vendor;
            return this;
        }
        public Integer getVendor() {
            return this.vendor;
        }

        public ListUninstallAegisMachinesResponseBodyMachineList setVendorName(String vendorName) {
            this.vendorName = vendorName;
            return this;
        }
        public String getVendorName() {
            return this.vendorName;
        }

    }

}
