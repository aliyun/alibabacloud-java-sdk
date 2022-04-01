// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ListNodesResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public Data data;

    @NameInMap("message")
    public String message;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

    public static ListNodesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListNodesResponseBody self = new ListNodesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListNodesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListNodesResponseBody setData(Data data) {
        this.data = data;
        return this;
    }
    public Data getData() {
        return this.data;
    }

    public ListNodesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListNodesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListNodesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class Items extends TeaModel {
        // autoRenew
        @NameInMap("autoRenew")
        public Boolean autoRenew;

        @NameInMap("creator")
        public String creator;

        @NameInMap("dataDiskCapacity")
        public Integer dataDiskCapacity;

        @NameInMap("dataDiskCount")
        public Integer dataDiskCount;

        @NameInMap("dataDiskType")
        public String dataDiskType;

        // expireTime
        @NameInMap("expireTime")
        public Long expireTime;

        // fqdn
        @NameInMap("fqdn")
        public String fqdn;

        // gmtCreate
        @NameInMap("gmtCreate")
        public Long gmtCreate;

        // gmtModified
        @NameInMap("gmtModified")
        public Long gmtModified;

        // index
        @NameInMap("index")
        public Integer index;

        // instanceType
        @NameInMap("instanceType")
        public String instanceType;

        // modifier
        @NameInMap("modifier")
        public String modifier;

        // nodeGroupId
        @NameInMap("nodeGroupId")
        public String nodeGroupId;

        // nodeGroupType
        @NameInMap("nodeGroupType")
        public String nodeGroupType;

        // nodeId
        @NameInMap("nodeId")
        public String nodeId;

        // nodeName
        @NameInMap("nodeName")
        public String nodeName;

        // nodeResourceType
        @NameInMap("nodeResourceType")
        public String nodeResourceType;

        // nodeStatus
        @NameInMap("nodeStatus")
        public String nodeStatus;

        // privateIp
        @NameInMap("privateIp")
        public String privateIp;

        // publicIp
        @NameInMap("publicIp")
        public String publicIp;

        // serialNumber
        @NameInMap("serialNumber")
        public String serialNumber;

        @NameInMap("systemDiskCapacity")
        public Integer systemDiskCapacity;

        @NameInMap("systemDiskType")
        public String systemDiskType;

        public static Items build(java.util.Map<String, ?> map) throws Exception {
            Items self = new Items();
            return TeaModel.build(map, self);
        }

        public Items setAutoRenew(Boolean autoRenew) {
            this.autoRenew = autoRenew;
            return this;
        }
        public Boolean getAutoRenew() {
            return this.autoRenew;
        }

        public Items setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public Items setDataDiskCapacity(Integer dataDiskCapacity) {
            this.dataDiskCapacity = dataDiskCapacity;
            return this;
        }
        public Integer getDataDiskCapacity() {
            return this.dataDiskCapacity;
        }

        public Items setDataDiskCount(Integer dataDiskCount) {
            this.dataDiskCount = dataDiskCount;
            return this;
        }
        public Integer getDataDiskCount() {
            return this.dataDiskCount;
        }

        public Items setDataDiskType(String dataDiskType) {
            this.dataDiskType = dataDiskType;
            return this;
        }
        public String getDataDiskType() {
            return this.dataDiskType;
        }

        public Items setExpireTime(Long expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public Long getExpireTime() {
            return this.expireTime;
        }

        public Items setFqdn(String fqdn) {
            this.fqdn = fqdn;
            return this;
        }
        public String getFqdn() {
            return this.fqdn;
        }

        public Items setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public Items setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public Items setIndex(Integer index) {
            this.index = index;
            return this;
        }
        public Integer getIndex() {
            return this.index;
        }

        public Items setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public Items setModifier(String modifier) {
            this.modifier = modifier;
            return this;
        }
        public String getModifier() {
            return this.modifier;
        }

        public Items setNodeGroupId(String nodeGroupId) {
            this.nodeGroupId = nodeGroupId;
            return this;
        }
        public String getNodeGroupId() {
            return this.nodeGroupId;
        }

        public Items setNodeGroupType(String nodeGroupType) {
            this.nodeGroupType = nodeGroupType;
            return this;
        }
        public String getNodeGroupType() {
            return this.nodeGroupType;
        }

        public Items setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public Items setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

        public Items setNodeResourceType(String nodeResourceType) {
            this.nodeResourceType = nodeResourceType;
            return this;
        }
        public String getNodeResourceType() {
            return this.nodeResourceType;
        }

        public Items setNodeStatus(String nodeStatus) {
            this.nodeStatus = nodeStatus;
            return this;
        }
        public String getNodeStatus() {
            return this.nodeStatus;
        }

        public Items setPrivateIp(String privateIp) {
            this.privateIp = privateIp;
            return this;
        }
        public String getPrivateIp() {
            return this.privateIp;
        }

        public Items setPublicIp(String publicIp) {
            this.publicIp = publicIp;
            return this;
        }
        public String getPublicIp() {
            return this.publicIp;
        }

        public Items setSerialNumber(String serialNumber) {
            this.serialNumber = serialNumber;
            return this;
        }
        public String getSerialNumber() {
            return this.serialNumber;
        }

        public Items setSystemDiskCapacity(Integer systemDiskCapacity) {
            this.systemDiskCapacity = systemDiskCapacity;
            return this;
        }
        public Integer getSystemDiskCapacity() {
            return this.systemDiskCapacity;
        }

        public Items setSystemDiskType(String systemDiskType) {
            this.systemDiskType = systemDiskType;
            return this;
        }
        public String getSystemDiskType() {
            return this.systemDiskType;
        }

    }

    public static class Data extends TeaModel {
        @NameInMap("items")
        public java.util.List<Items> items;

        @NameInMap("pageNumber")
        public Integer pageNumber;

        @NameInMap("pageSize")
        public Integer pageSize;

        @NameInMap("totalCount")
        public Integer totalCount;

        public static Data build(java.util.Map<String, ?> map) throws Exception {
            Data self = new Data();
            return TeaModel.build(map, self);
        }

        public Data setItems(java.util.List<Items> items) {
            this.items = items;
            return this;
        }
        public java.util.List<Items> getItems() {
            return this.items;
        }

        public Data setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public Data setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public Data setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
