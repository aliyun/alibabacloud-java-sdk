// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListUninstallAegisMachinesResponseBody extends TeaModel {
    /**
     * <p>The page number of the returned page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
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
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>151F6EB6-D5F3-417A-AF7B-4D84975DB586</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>44</p>
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
         * 
         * <strong>example:</strong>
         * <p>sas-bdrvxb4b****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The name of the server.</p>
         * 
         * <strong>example:</strong>
         * <p>sql-test-001</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The public IP address of the server.</p>
         * 
         * <strong>example:</strong>
         * <p>120.79.XX.XX</p>
         */
        @NameInMap("InternetIp")
        public String internetIp;

        /**
         * <p>The private IP address of the server.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.XX.XX</p>
         */
        @NameInMap("IntranetIp")
        public String intranetIp;

        /**
         * <p>The region in which the server resides.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("MachineRegion")
        public String machineRegion;

        /**
         * <p>The operating system of the server. Valid values:</p>
         * <ul>
         * <li><strong>linux</strong></li>
         * <li><strong>windows</strong></li>
         * <li><strong>windows-2003</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>linux</p>
         */
        @NameInMap("Os")
        public String os;

        /**
         * <p>The ID of the region in which the server resides.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The UUID of the server.</p>
         * 
         * <strong>example:</strong>
         * <p>6d5b361f-958d-48a8-a9d2-d6e82c1****</p>
         */
        @NameInMap("Uuid")
        public String uuid;

        /**
         * <p>The source of the server. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: an asset provided by Alibaba Cloud</li>
         * <li><strong>1</strong>: a third-party cloud server</li>
         * <li><strong>2</strong>: a server in a data center</li>
         * <li><strong>3</strong>, <strong>4</strong>, <strong>5</strong>, and <strong>7</strong>: other cloud asset</li>
         * <li><strong>8</strong>: a lightweight asset</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Vendor")
        public Integer vendor;

        /**
         * <p>The name of the service provider (SP) for the server.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><strong>ALIYUN</strong>: Alibaba Cloud</li>
         * <li><strong>OUT</strong>: a third-party service provider</li>
         * <li><strong>IDC</strong>: a data center</li>
         * <li><strong>TENCENT</strong>: Tencent Cloud</li>
         * <li><strong>HUAWEICLOUD</strong>: Huawei Cloud</li>
         * <li><strong>Microsoft</strong>: Microsoft</li>
         * <li><strong>AWS</strong>: Amazon Web Services (AWS)</li>
         * <li><strong>TRIPARTITE</strong>: a lightweight server</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ALIYUN</p>
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
