// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeBruteForceRecordsResponseBody extends TeaModel {
    @NameInMap("MachineList")
    public java.util.List<DescribeBruteForceRecordsResponseBodyMachineList> machineList;

    @NameInMap("PageInfo")
    public DescribeBruteForceRecordsResponseBodyPageInfo pageInfo;

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
        @NameInMap("AliNetOnline")
        public Boolean aliNetOnline;

        @NameInMap("BlockExpireDate")
        public Long blockExpireDate;

        @NameInMap("BlockIp")
        public String blockIp;

        @NameInMap("BlockType")
        public String blockType;

        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("Id")
        public Long id;

        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("InternetIp")
        public String internetIp;

        @NameInMap("IntranetIp")
        public String intranetIp;

        @NameInMap("Port")
        public String port;

        @NameInMap("RuleName")
        public String ruleName;

        @NameInMap("Source")
        public String source;

        @NameInMap("Status")
        public Integer status;

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
        @NameInMap("Count")
        public Integer count;

        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("PageSize")
        public Integer pageSize;

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
