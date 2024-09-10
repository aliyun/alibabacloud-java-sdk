// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeBruteForceRecordsResponseBody extends TeaModel {
    /**
     * <p>The IP addresses.</p>
     */
    @NameInMap("MachineList")
    public java.util.List<DescribeBruteForceRecordsResponseBodyMachineList> machineList;

    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("PageInfo")
    public DescribeBruteForceRecordsResponseBodyPageInfo pageInfo;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>7E0618A9-D5EF-4220-9471-C42B5E92719F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeBruteForceRecordsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBruteForceRecordsResponseBody self = new DescribeBruteForceRecordsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBruteForceRecordsResponseBody setMachineList(java.util.List<DescribeBruteForceRecordsResponseBodyMachineList> machineList) {
        this.machineList = machineList;
        return this;
    }
    public java.util.List<DescribeBruteForceRecordsResponseBodyMachineList> getMachineList() {
        return this.machineList;
    }

    public DescribeBruteForceRecordsResponseBody setPageInfo(DescribeBruteForceRecordsResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public DescribeBruteForceRecordsResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public DescribeBruteForceRecordsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeBruteForceRecordsResponseBodyMachineList extends TeaModel {
        /**
         * <p>The status of the host network extension. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: online</li>
         * <li><strong>false</strong>: offline</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("AliNetOnline")
        public Boolean aliNetOnline;

        /**
         * <p>The timestamp when the block action on the IP address becomes invalid.</p>
         * 
         * <strong>example:</strong>
         * <p>1671506882063</p>
         */
        @NameInMap("BlockExpireDate")
        public Long blockExpireDate;

        /**
         * <p>The IP address that is blocked.</p>
         * 
         * <strong>example:</strong>
         * <p>10.12.XX.XX</p>
         */
        @NameInMap("BlockIp")
        public String blockIp;

        /**
         * <p>The blocking type. Valid values:</p>
         * <ul>
         * <li><strong>group</strong>: security group</li>
         * <li><strong>alinet</strong>: host network extension</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>alinet</p>
         */
        @NameInMap("BlockType")
        public String blockType;

        /**
         * <p>The error code returned when the defense rule fails to block the IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>InstanceSecurityGroupLimitExceeded</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>The ID of the primary key that is recorded in the defense rule.</p>
         * 
         * <strong>example:</strong>
         * <p>112XX</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The instance name of the server.</p>
         * 
         * <strong>example:</strong>
         * <p>record-test-***</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The public IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>120.79.XX.XX</p>
         */
        @NameInMap("InternetIp")
        public String internetIp;

        /**
         * <p>The private IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.XX.XX</p>
         */
        @NameInMap("IntranetIp")
        public String intranetIp;

        /**
         * <p>The port that is attacked.</p>
         * 
         * <strong>example:</strong>
         * <p>22/22</p>
         */
        @NameInMap("Port")
        public String port;

        /**
         * <p>The name of the defense rule.</p>
         * 
         * <strong>example:</strong>
         * <p>AntiRuleName</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <p>The type of the defense rule. Valid values:</p>
         * <ul>
         * <li><strong>userRule</strong>: custom rule</li>
         * <li><strong>blinkRule</strong>: system rule</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>userRule</p>
         */
        @NameInMap("Source")
        public String source;

        /**
         * <p>The status of the defense rule. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: invalid</li>
         * <li><strong>1</strong>: enabled</li>
         * <li><strong>2</strong>: failed</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The UUID of the server on which the defense rule takes effect.</p>
         * 
         * <strong>example:</strong>
         * <p>6d5b361f-958d-48a8-a9d2-d6e82c1****</p>
         */
        @NameInMap("Uuid")
        public String uuid;

        public static DescribeBruteForceRecordsResponseBodyMachineList build(java.util.Map<String, ?> map) throws Exception {
            DescribeBruteForceRecordsResponseBodyMachineList self = new DescribeBruteForceRecordsResponseBodyMachineList();
            return TeaModel.build(map, self);
        }

        public DescribeBruteForceRecordsResponseBodyMachineList setAliNetOnline(Boolean aliNetOnline) {
            this.aliNetOnline = aliNetOnline;
            return this;
        }
        public Boolean getAliNetOnline() {
            return this.aliNetOnline;
        }

        public DescribeBruteForceRecordsResponseBodyMachineList setBlockExpireDate(Long blockExpireDate) {
            this.blockExpireDate = blockExpireDate;
            return this;
        }
        public Long getBlockExpireDate() {
            return this.blockExpireDate;
        }

        public DescribeBruteForceRecordsResponseBodyMachineList setBlockIp(String blockIp) {
            this.blockIp = blockIp;
            return this;
        }
        public String getBlockIp() {
            return this.blockIp;
        }

        public DescribeBruteForceRecordsResponseBodyMachineList setBlockType(String blockType) {
            this.blockType = blockType;
            return this;
        }
        public String getBlockType() {
            return this.blockType;
        }

        public DescribeBruteForceRecordsResponseBodyMachineList setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public DescribeBruteForceRecordsResponseBodyMachineList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeBruteForceRecordsResponseBodyMachineList setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeBruteForceRecordsResponseBodyMachineList setInternetIp(String internetIp) {
            this.internetIp = internetIp;
            return this;
        }
        public String getInternetIp() {
            return this.internetIp;
        }

        public DescribeBruteForceRecordsResponseBodyMachineList setIntranetIp(String intranetIp) {
            this.intranetIp = intranetIp;
            return this;
        }
        public String getIntranetIp() {
            return this.intranetIp;
        }

        public DescribeBruteForceRecordsResponseBodyMachineList setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public DescribeBruteForceRecordsResponseBodyMachineList setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public DescribeBruteForceRecordsResponseBodyMachineList setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public DescribeBruteForceRecordsResponseBodyMachineList setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public DescribeBruteForceRecordsResponseBodyMachineList setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

    public static class DescribeBruteForceRecordsResponseBodyPageInfo extends TeaModel {
        /**
         * <p>The number of entries returned on the current page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>The number of entries returned per page. Default value: <strong>20</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>263</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static DescribeBruteForceRecordsResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeBruteForceRecordsResponseBodyPageInfo self = new DescribeBruteForceRecordsResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public DescribeBruteForceRecordsResponseBodyPageInfo setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public DescribeBruteForceRecordsResponseBodyPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public DescribeBruteForceRecordsResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DescribeBruteForceRecordsResponseBodyPageInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
