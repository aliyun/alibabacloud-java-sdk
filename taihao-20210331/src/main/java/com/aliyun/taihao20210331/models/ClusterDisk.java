// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ClusterDisk extends TeaModel {
    // category
    @NameInMap("category")
    public String category;

    // device
    @NameInMap("device")
    public String device;

    // diskId
    @NameInMap("diskId")
    public String diskId;

    // mountPath
    @NameInMap("mountPath")
    public String mountPath;

    // nodeId
    @NameInMap("nodeId")
    public String nodeId;

    // paymentType
    @NameInMap("paymentType")
    public String paymentType;

    // realMountPath
    @NameInMap("realMountPath")
    public String realMountPath;

    // serialNumber
    @NameInMap("serialNumber")
    public String serialNumber;

    // size
    @NameInMap("size")
    public Long size;

    // status
    @NameInMap("status")
    public String status;

    // type
    @NameInMap("type")
    public String type;

    public static ClusterDisk build(java.util.Map<String, ?> map) throws Exception {
        ClusterDisk self = new ClusterDisk();
        return TeaModel.build(map, self);
    }

    public ClusterDisk setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public ClusterDisk setDevice(String device) {
        this.device = device;
        return this;
    }
    public String getDevice() {
        return this.device;
    }

    public ClusterDisk setDiskId(String diskId) {
        this.diskId = diskId;
        return this;
    }
    public String getDiskId() {
        return this.diskId;
    }

    public ClusterDisk setMountPath(String mountPath) {
        this.mountPath = mountPath;
        return this;
    }
    public String getMountPath() {
        return this.mountPath;
    }

    public ClusterDisk setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public ClusterDisk setPaymentType(String paymentType) {
        this.paymentType = paymentType;
        return this;
    }
    public String getPaymentType() {
        return this.paymentType;
    }

    public ClusterDisk setRealMountPath(String realMountPath) {
        this.realMountPath = realMountPath;
        return this;
    }
    public String getRealMountPath() {
        return this.realMountPath;
    }

    public ClusterDisk setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
        return this;
    }
    public String getSerialNumber() {
        return this.serialNumber;
    }

    public ClusterDisk setSize(Long size) {
        this.size = size;
        return this;
    }
    public Long getSize() {
        return this.size;
    }

    public ClusterDisk setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ClusterDisk setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
