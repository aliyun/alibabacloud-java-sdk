// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeCheckWarningMachinesResponseBody extends TeaModel {
    @NameInMap("Count")
    public Integer count;

    @NameInMap("Machines")
    public java.util.List<DescribeCheckWarningMachinesResponseBodyMachines> machines;

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

    public DescribeCheckWarningMachinesResponseBody setMachines(java.util.List<DescribeCheckWarningMachinesResponseBodyMachines> machines) {
        this.machines = machines;
        return this;
    }
    public java.util.List<DescribeCheckWarningMachinesResponseBodyMachines> getMachines() {
        return this.machines;
    }

    public DescribeCheckWarningMachinesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeCheckWarningMachinesResponseBodyMachines extends TeaModel {
        @NameInMap("Bind")
        public Boolean bind;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("InternetIp")
        public String internetIp;

        @NameInMap("IntranetIp")
        public String intranetIp;

        @NameInMap("RegionId")
        public String regionId;

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
