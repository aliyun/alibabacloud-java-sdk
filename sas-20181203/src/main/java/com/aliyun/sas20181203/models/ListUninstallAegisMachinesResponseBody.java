// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListUninstallAegisMachinesResponseBody extends TeaModel {
    /**
     * <p>The page number of the returned page.</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>An array that consists of the information about servers.</p>
     */
    @NameInMap("MachineList")
    public java.util.List<ListUninstallAegisMachinesResponseBodyMachineList> machineList;

    /**
     * <p>The number of entries returned per page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     */
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
        /**
         * <p>The ID of the server.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The name of the server.</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The public IP address of the server.</p>
         */
        @NameInMap("InternetIp")
        public String internetIp;

        /**
         * <p>The private IP address of the server.</p>
         */
        @NameInMap("IntranetIp")
        public String intranetIp;

        /**
         * <p>The region in which the server resides.</p>
         */
        @NameInMap("MachineRegion")
        public String machineRegion;

        /**
         * <p>The operating system of the server. Valid values:</p>
         * <br>
         * <p>*   **linux**</p>
         * <p>*   **windows**</p>
         * <p>*   **windows-2003**</p>
         */
        @NameInMap("Os")
        public String os;

        /**
         * <p>The ID of the region in which the server resides.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The UUID of the server.</p>
         */
        @NameInMap("Uuid")
        public String uuid;

        /**
         * <p>The source of the server. Valid values:</p>
         * <br>
         * <p>*   **0**: an asset provided by Alibaba Cloud</p>
         * <p>*   **1**: a third-party cloud server</p>
         * <p>*   **2**: a server in a data center</p>
         * <p>*   **3**, **4**, **5**, and **7**: other cloud asset</p>
         * <p>*   **8**: a lightweight asset</p>
         */
        @NameInMap("Vendor")
        public Integer vendor;

        /**
         * <p>The name of the service provider (SP) for the server.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   **ALIYUN**: Alibaba Cloud</p>
         * <p>*   **OUT**: a third-party service provider</p>
         * <p>*   **IDC**: a data center</p>
         * <p>*   **TENCENT**: Tencent Cloud</p>
         * <p>*   **HUAWEICLOUD**: Huawei Cloud</p>
         * <p>*   **Microsoft**: Microsoft</p>
         * <p>*   **AWS**: Amazon Web Services (AWS)</p>
         * <p>*   **TRIPARTITE**: a lightweight server</p>
         */
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
