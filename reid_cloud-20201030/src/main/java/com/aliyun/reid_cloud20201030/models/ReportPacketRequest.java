// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.reid_cloud20201030.models;

import com.aliyun.tea.*;

public class ReportPacketRequest extends TeaModel {
    @NameInMap("PacketCount")
    public Long packetCount;

    @NameInMap("DeviceId")
    public String deviceId;

    @NameInMap("StoreId")
    public Long storeId;

    @NameInMap("PacketContent")
    public java.util.List<ReportPacketRequestPacketContent> packetContent;

    public static ReportPacketRequest build(java.util.Map<String, ?> map) throws Exception {
        ReportPacketRequest self = new ReportPacketRequest();
        return TeaModel.build(map, self);
    }

    public ReportPacketRequest setPacketCount(Long packetCount) {
        this.packetCount = packetCount;
        return this;
    }
    public Long getPacketCount() {
        return this.packetCount;
    }

    public ReportPacketRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public ReportPacketRequest setStoreId(Long storeId) {
        this.storeId = storeId;
        return this;
    }
    public Long getStoreId() {
        return this.storeId;
    }

    public ReportPacketRequest setPacketContent(java.util.List<ReportPacketRequestPacketContent> packetContent) {
        this.packetContent = packetContent;
        return this;
    }
    public java.util.List<ReportPacketRequestPacketContent> getPacketContent() {
        return this.packetContent;
    }

    public static class ReportPacketRequestPacketContent extends TeaModel {
        @NameInMap("Version")
        public String version;

        @NameInMap("Content")
        public String content;

        public static ReportPacketRequestPacketContent build(java.util.Map<String, ?> map) throws Exception {
            ReportPacketRequestPacketContent self = new ReportPacketRequestPacketContent();
            return TeaModel.build(map, self);
        }

        public ReportPacketRequestPacketContent setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public ReportPacketRequestPacketContent setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

}
