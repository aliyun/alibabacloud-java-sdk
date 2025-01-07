// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class QueryAssetDetailByUUIDResponseBody extends TeaModel {
    /**
     * <p>The response code. Valid values:</p>
     * <ul>
     * <li><strong>200</strong>: The request was successful.</li>
     * <li><strong>Other codes</strong>: The request failed. For a list of error codes, see <a href="https://help.aliyun.com/document_detail/145071.html">Service error codes</a>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("Count")
    public Integer count;

    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public java.util.List<QueryAssetDetailByUUIDResponseBodyData> data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>7532B7EE-7CE7-5F4D-BF04-B12447DDCAE1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The consumed time of the request. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TimeCost")
    public Long timeCost;

    public static QueryAssetDetailByUUIDResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryAssetDetailByUUIDResponseBody self = new QueryAssetDetailByUUIDResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryAssetDetailByUUIDResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryAssetDetailByUUIDResponseBody setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public QueryAssetDetailByUUIDResponseBody setData(java.util.List<QueryAssetDetailByUUIDResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryAssetDetailByUUIDResponseBodyData> getData() {
        return this.data;
    }

    public QueryAssetDetailByUUIDResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public QueryAssetDetailByUUIDResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryAssetDetailByUUIDResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryAssetDetailByUUIDResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryAssetDetailByUUIDResponseBody setTimeCost(Long timeCost) {
        this.timeCost = timeCost;
        return this;
    }
    public Long getTimeCost() {
        return this.timeCost;
    }

    public static class QueryAssetDetailByUUIDResponseBodyData extends TeaModel {
        /**
         * <p>The ID of the user.</p>
         * 
         * <strong>example:</strong>
         * <p>1766185894104***</p>
         */
        @NameInMap("AliUid")
        public Long aliUid;

        /**
         * <p>The edition of Security Center that is authorized to protect the asset. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: Basic.</li>
         * <li><strong>6</strong>: Anti-virus.</li>
         * <li><strong>5</strong>: Advanced.</li>
         * <li><strong>3</strong>: Enterprise.</li>
         * <li><strong>7</strong>: Ultimate.</li>
         * <li><strong>10</strong>: Value-added Plan.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("AuthVersion")
        public Integer authVersion;

        /**
         * <p>The virtual network operator (VNO).</p>
         * 
         * <strong>example:</strong>
         * <p>26842</p>
         */
        @NameInMap("Bid")
        public String bid;

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
         * <p>The status of the Security Center agent. Valid values:</p>
         * <ul>
         * <li><strong>online</strong></li>
         * <li><strong>offline</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>online</p>
         */
        @NameInMap("ClientStatus")
        public String clientStatus;

        /**
         * <p>The ID of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>c8ca91e0907d94efaba7fb0827eb9****</p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        /**
         * <p>The IP address of the elastic network interface (ENI).</p>
         * 
         * <strong>example:</strong>
         * <p>116.162.XX.XX</p>
         */
        @NameInMap("Eip")
        public String eip;

        /**
         * <p>Indicates whether the asset is provided by Alibaba Cloud. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: yes.</li>
         * <li><strong>1</strong>: no.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Flag")
        public Integer flag;

        /**
         * <p>The time at which the asset was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-10-16 18:17:16</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The time at which the asset was modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-11-21 10:40:01</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The ID of the group to which the server belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>12208928</p>
         */
        @NameInMap("GroupId")
        public Long groupId;

        /**
         * <p>The ID of the asset.</p>
         * 
         * <strong>example:</strong>
         * <p>443496</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The public IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>172.16.XX.XX</p>
         */
        @NameInMap("InternetIp")
        public String internetIp;

        /**
         * <p>The private IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>10.42.XX.XX</p>
         */
        @NameInMap("IntranetIp")
        public String intranetIp;

        /**
         * <p>The instance ID of the server.</p>
         * 
         * <strong>example:</strong>
         * <p>c8ca91e0907d94efaba7fb0827eb9</p>
         */
        @NameInMap("MachineInstanceId")
        public String machineInstanceId;

        /**
         * <p>The IP address of the server.</p>
         * 
         * <strong>example:</strong>
         * <p>172.16.XX.XX</p>
         */
        @NameInMap("MachineIp")
        public String machineIp;

        /**
         * <p>The type of the IP address for the server. Valid values include the following values:</p>
         * <ul>
         * <li><strong>ecs</strong>: the IP address of the Elastic Compute Service (ECS) instance.</li>
         * <li><strong>slb</strong>: the IP address of the Server Load Balancer (SLB) instance.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SLB</p>
         */
        @NameInMap("MachineIpType")
        public String machineIpType;

        /**
         * <p>The name of the server.</p>
         * 
         * <strong>example:</strong>
         * <p>security</p>
         */
        @NameInMap("MachineName")
        public String machineName;

        /**
         * <p>The region in which the server resides.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("MachineRegion")
        public String machineRegion;

        /**
         * <p>The instance type of the server. Valid values include the following values:</p>
         * <ul>
         * <li><strong>ecs</strong></li>
         * <li><strong>slb</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ecs</p>
         */
        @NameInMap("MachineType")
        public String machineType;

        /**
         * <p>Indicates whether the Security Center agent is online. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Online")
        public Boolean online;

        /**
         * <p>The operating system of the server.</p>
         * 
         * <strong>example:</strong>
         * <p>linux</p>
         */
        @NameInMap("Os")
        public String os;

        /**
         * <p>The name of the operating system for the server.</p>
         * 
         * <strong>example:</strong>
         * <p>Debian  10.3 64</p>
         */
        @NameInMap("OsName")
        public String osName;

        /**
         * <p>The ID of the region in which the server resides.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The status of the server. Valid values include the following values:</p>
         * <ul>
         * <li><strong>Running</strong></li>
         * <li><strong>Waiting</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The UUID of the asset.</p>
         * 
         * <strong>example:</strong>
         * <p>6690a46c-0edb-4663-a641-3629d1a9****</p>
         */
        @NameInMap("Uuid")
        public String uuid;

        public static QueryAssetDetailByUUIDResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryAssetDetailByUUIDResponseBodyData self = new QueryAssetDetailByUUIDResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryAssetDetailByUUIDResponseBodyData setAliUid(Long aliUid) {
            this.aliUid = aliUid;
            return this;
        }
        public Long getAliUid() {
            return this.aliUid;
        }

        public QueryAssetDetailByUUIDResponseBodyData setAuthVersion(Integer authVersion) {
            this.authVersion = authVersion;
            return this;
        }
        public Integer getAuthVersion() {
            return this.authVersion;
        }

        public QueryAssetDetailByUUIDResponseBodyData setBid(String bid) {
            this.bid = bid;
            return this;
        }
        public String getBid() {
            return this.bid;
        }

        public QueryAssetDetailByUUIDResponseBodyData setBind(Boolean bind) {
            this.bind = bind;
            return this;
        }
        public Boolean getBind() {
            return this.bind;
        }

        public QueryAssetDetailByUUIDResponseBodyData setClientStatus(String clientStatus) {
            this.clientStatus = clientStatus;
            return this;
        }
        public String getClientStatus() {
            return this.clientStatus;
        }

        public QueryAssetDetailByUUIDResponseBodyData setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public QueryAssetDetailByUUIDResponseBodyData setEip(String eip) {
            this.eip = eip;
            return this;
        }
        public String getEip() {
            return this.eip;
        }

        public QueryAssetDetailByUUIDResponseBodyData setFlag(Integer flag) {
            this.flag = flag;
            return this;
        }
        public Integer getFlag() {
            return this.flag;
        }

        public QueryAssetDetailByUUIDResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public QueryAssetDetailByUUIDResponseBodyData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public QueryAssetDetailByUUIDResponseBodyData setGroupId(Long groupId) {
            this.groupId = groupId;
            return this;
        }
        public Long getGroupId() {
            return this.groupId;
        }

        public QueryAssetDetailByUUIDResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryAssetDetailByUUIDResponseBodyData setInternetIp(String internetIp) {
            this.internetIp = internetIp;
            return this;
        }
        public String getInternetIp() {
            return this.internetIp;
        }

        public QueryAssetDetailByUUIDResponseBodyData setIntranetIp(String intranetIp) {
            this.intranetIp = intranetIp;
            return this;
        }
        public String getIntranetIp() {
            return this.intranetIp;
        }

        public QueryAssetDetailByUUIDResponseBodyData setMachineInstanceId(String machineInstanceId) {
            this.machineInstanceId = machineInstanceId;
            return this;
        }
        public String getMachineInstanceId() {
            return this.machineInstanceId;
        }

        public QueryAssetDetailByUUIDResponseBodyData setMachineIp(String machineIp) {
            this.machineIp = machineIp;
            return this;
        }
        public String getMachineIp() {
            return this.machineIp;
        }

        public QueryAssetDetailByUUIDResponseBodyData setMachineIpType(String machineIpType) {
            this.machineIpType = machineIpType;
            return this;
        }
        public String getMachineIpType() {
            return this.machineIpType;
        }

        public QueryAssetDetailByUUIDResponseBodyData setMachineName(String machineName) {
            this.machineName = machineName;
            return this;
        }
        public String getMachineName() {
            return this.machineName;
        }

        public QueryAssetDetailByUUIDResponseBodyData setMachineRegion(String machineRegion) {
            this.machineRegion = machineRegion;
            return this;
        }
        public String getMachineRegion() {
            return this.machineRegion;
        }

        public QueryAssetDetailByUUIDResponseBodyData setMachineType(String machineType) {
            this.machineType = machineType;
            return this;
        }
        public String getMachineType() {
            return this.machineType;
        }

        public QueryAssetDetailByUUIDResponseBodyData setOnline(Boolean online) {
            this.online = online;
            return this;
        }
        public Boolean getOnline() {
            return this.online;
        }

        public QueryAssetDetailByUUIDResponseBodyData setOs(String os) {
            this.os = os;
            return this;
        }
        public String getOs() {
            return this.os;
        }

        public QueryAssetDetailByUUIDResponseBodyData setOsName(String osName) {
            this.osName = osName;
            return this;
        }
        public String getOsName() {
            return this.osName;
        }

        public QueryAssetDetailByUUIDResponseBodyData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public QueryAssetDetailByUUIDResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryAssetDetailByUUIDResponseBodyData setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

}
