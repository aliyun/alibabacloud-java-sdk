// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class AddIdcProbeResponseBody extends TeaModel {
    /**
     * <p>The records of failure.</p>
     */
    @NameInMap("AddIdcProbeFailedList")
    public java.util.List<AddIdcProbeResponseBodyAddIdcProbeFailedList> addIdcProbeFailedList;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Count")
    public String count;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>D706F2DD-FF07-576B-9DD1-0B484A9B3065</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AddIdcProbeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddIdcProbeResponseBody self = new AddIdcProbeResponseBody();
        return TeaModel.build(map, self);
    }

    public AddIdcProbeResponseBody setAddIdcProbeFailedList(java.util.List<AddIdcProbeResponseBodyAddIdcProbeFailedList> addIdcProbeFailedList) {
        this.addIdcProbeFailedList = addIdcProbeFailedList;
        return this;
    }
    public java.util.List<AddIdcProbeResponseBodyAddIdcProbeFailedList> getAddIdcProbeFailedList() {
        return this.addIdcProbeFailedList;
    }

    public AddIdcProbeResponseBody setCount(String count) {
        this.count = count;
        return this;
    }
    public String getCount() {
        return this.count;
    }

    public AddIdcProbeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class AddIdcProbeResponseBodyAddIdcProbeFailedList extends TeaModel {
        /**
         * <p>The error message that is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>The ResourceDirectoryId is invalid.</p>
         */
        @NameInMap("ErrorMsg")
        public String errorMsg;

        /**
         * <p>The name of the data center.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("IdcName")
        public String idcName;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>Hangzhou</p>
         */
        @NameInMap("IdcRegion")
        public String idcRegion;

        /**
         * <p>The ID of the server.</p>
         * 
         * <strong>example:</strong>
         * <p>sas-yqcl2ck3****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The name of the server.</p>
         * 
         * <strong>example:</strong>
         * <p>gl-sms-01</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The public IP address of the server.</p>
         * 
         * <strong>example:</strong>
         * <p>95.214.XXX.XXX</p>
         */
        @NameInMap("InternetIp")
        public String internetIp;

        /**
         * <p>The private IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>172.29.XXX.XXX</p>
         */
        @NameInMap("IntranetIp")
        public String intranetIp;

        /**
         * <p>The settings of the CIDR block.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.XX.XX/24</p>
         */
        @NameInMap("IpSegments")
        public String ipSegments;

        /**
         * <p>The UUID of the server. Multiple UUIDs are separated by commas (,).</p>
         * <blockquote>
         * <p> You can call the <a href="~~DescribeCloudCenterInstances~~">DescribeCloudCenterInstances</a> operation to query the UUID.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>076a446d-df7d-424c-bdc5-bb5dc7f1****</p>
         */
        @NameInMap("Uuid")
        public String uuid;

        public static AddIdcProbeResponseBodyAddIdcProbeFailedList build(java.util.Map<String, ?> map) throws Exception {
            AddIdcProbeResponseBodyAddIdcProbeFailedList self = new AddIdcProbeResponseBodyAddIdcProbeFailedList();
            return TeaModel.build(map, self);
        }

        public AddIdcProbeResponseBodyAddIdcProbeFailedList setErrorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }
        public String getErrorMsg() {
            return this.errorMsg;
        }

        public AddIdcProbeResponseBodyAddIdcProbeFailedList setIdcName(String idcName) {
            this.idcName = idcName;
            return this;
        }
        public String getIdcName() {
            return this.idcName;
        }

        public AddIdcProbeResponseBodyAddIdcProbeFailedList setIdcRegion(String idcRegion) {
            this.idcRegion = idcRegion;
            return this;
        }
        public String getIdcRegion() {
            return this.idcRegion;
        }

        public AddIdcProbeResponseBodyAddIdcProbeFailedList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public AddIdcProbeResponseBodyAddIdcProbeFailedList setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public AddIdcProbeResponseBodyAddIdcProbeFailedList setInternetIp(String internetIp) {
            this.internetIp = internetIp;
            return this;
        }
        public String getInternetIp() {
            return this.internetIp;
        }

        public AddIdcProbeResponseBodyAddIdcProbeFailedList setIntranetIp(String intranetIp) {
            this.intranetIp = intranetIp;
            return this;
        }
        public String getIntranetIp() {
            return this.intranetIp;
        }

        public AddIdcProbeResponseBodyAddIdcProbeFailedList setIpSegments(String ipSegments) {
            this.ipSegments = ipSegments;
            return this;
        }
        public String getIpSegments() {
            return this.ipSegments;
        }

        public AddIdcProbeResponseBodyAddIdcProbeFailedList setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

}
