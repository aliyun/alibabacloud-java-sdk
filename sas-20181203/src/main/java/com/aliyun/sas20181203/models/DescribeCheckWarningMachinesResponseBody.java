// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeCheckWarningMachinesResponseBody extends TeaModel {
    /**
     * <p>The number of the servers on which the same risk item is detected.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Count")
    public Integer count;

    /**
     * <p>The number of the page to return. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The servers on which the same risk item is detected.</p>
     */
    @NameInMap("Machines")
    public java.util.List<DescribeCheckWarningMachinesResponseBodyMachines> machines;

    /**
     * <p>The number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>B3D989EB-2E59-584C-8438-5DFAA34A****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeCheckWarningMachinesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCheckWarningMachinesResponseBody self = new DescribeCheckWarningMachinesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCheckWarningMachinesResponseBody setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public DescribeCheckWarningMachinesResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeCheckWarningMachinesResponseBody setMachines(java.util.List<DescribeCheckWarningMachinesResponseBodyMachines> machines) {
        this.machines = machines;
        return this;
    }
    public java.util.List<DescribeCheckWarningMachinesResponseBodyMachines> getMachines() {
        return this.machines;
    }

    public DescribeCheckWarningMachinesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeCheckWarningMachinesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeCheckWarningMachinesResponseBodyMachines extends TeaModel {
        /**
         * <p>Indicates whether Security Center is authorized to protect the asset. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Bind")
        public Boolean bind;

        /**
         * <p>The instance ID of the server.</p>
         * 
         * <strong>example:</strong>
         * <p>i-bp1dp42hgn1xcq8l****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The instance name of the server.</p>
         * 
         * <strong>example:</strong>
         * <p>win-oracl****</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The public IP address of the server.</p>
         * 
         * <strong>example:</strong>
         * <p>8.210.XX.XX</p>
         */
        @NameInMap("InternetIp")
        public String internetIp;

        /**
         * <p>The private IP address of the server.</p>
         * 
         * <strong>example:</strong>
         * <p>172.25.XX.XX</p>
         */
        @NameInMap("IntranetIp")
        public String intranetIp;

        /**
         * <p>The ID of the region in which the server resides.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The UUID of the server.</p>
         * 
         * <strong>example:</strong>
         * <p>D0D6E6E4-CB8C-4897-B852-46AEFDA0****</p>
         */
        @NameInMap("Uuid")
        public String uuid;

        public static DescribeCheckWarningMachinesResponseBodyMachines build(java.util.Map<String, ?> map) throws Exception {
            DescribeCheckWarningMachinesResponseBodyMachines self = new DescribeCheckWarningMachinesResponseBodyMachines();
            return TeaModel.build(map, self);
        }

        public DescribeCheckWarningMachinesResponseBodyMachines setBind(Boolean bind) {
            this.bind = bind;
            return this;
        }
        public Boolean getBind() {
            return this.bind;
        }

        public DescribeCheckWarningMachinesResponseBodyMachines setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeCheckWarningMachinesResponseBodyMachines setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeCheckWarningMachinesResponseBodyMachines setInternetIp(String internetIp) {
            this.internetIp = internetIp;
            return this;
        }
        public String getInternetIp() {
            return this.internetIp;
        }

        public DescribeCheckWarningMachinesResponseBodyMachines setIntranetIp(String intranetIp) {
            this.intranetIp = intranetIp;
            return this;
        }
        public String getIntranetIp() {
            return this.intranetIp;
        }

        public DescribeCheckWarningMachinesResponseBodyMachines setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeCheckWarningMachinesResponseBodyMachines setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

}
