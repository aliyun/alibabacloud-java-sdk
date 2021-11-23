// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class CreateMPULayoutRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("AudioMixCount")
    public Integer audioMixCount;

    @NameInMap("Name")
    public String name;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("Panes")
    public java.util.List<CreateMPULayoutRequestPanes> panes;

    public static CreateMPULayoutRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMPULayoutRequest self = new CreateMPULayoutRequest();
        return TeaModel.build(map, self);
    }

    public CreateMPULayoutRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public CreateMPULayoutRequest setAudioMixCount(Integer audioMixCount) {
        this.audioMixCount = audioMixCount;
        return this;
    }
    public Integer getAudioMixCount() {
        return this.audioMixCount;
    }

    public CreateMPULayoutRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateMPULayoutRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateMPULayoutRequest setPanes(java.util.List<CreateMPULayoutRequestPanes> panes) {
        this.panes = panes;
        return this;
    }
    public java.util.List<CreateMPULayoutRequestPanes> getPanes() {
        return this.panes;
    }

    public static class CreateMPULayoutRequestPanes extends TeaModel {
        @NameInMap("Height")
        public Float height;

        @NameInMap("MajorPane")
        public Integer majorPane;

        @NameInMap("PaneId")
        public Integer paneId;

        @NameInMap("Width")
        public Float width;

        @NameInMap("X")
        public Float x;

        @NameInMap("Y")
        public Float y;

        @NameInMap("ZOrder")
        public Integer ZOrder;

        public static CreateMPULayoutRequestPanes build(java.util.Map<String, ?> map) throws Exception {
            CreateMPULayoutRequestPanes self = new CreateMPULayoutRequestPanes();
            return TeaModel.build(map, self);
        }

        public CreateMPULayoutRequestPanes setHeight(Float height) {
            this.height = height;
            return this;
        }
        public Float getHeight() {
            return this.height;
        }

        public CreateMPULayoutRequestPanes setMajorPane(Integer majorPane) {
            this.majorPane = majorPane;
            return this;
        }
        public Integer getMajorPane() {
            return this.majorPane;
        }

        public CreateMPULayoutRequestPanes setPaneId(Integer paneId) {
            this.paneId = paneId;
            return this;
        }
        public Integer getPaneId() {
            return this.paneId;
        }

        public CreateMPULayoutRequestPanes setWidth(Float width) {
            this.width = width;
            return this;
        }
        public Float getWidth() {
            return this.width;
        }

        public CreateMPULayoutRequestPanes setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public CreateMPULayoutRequestPanes setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

        public CreateMPULayoutRequestPanes setZOrder(Integer ZOrder) {
            this.ZOrder = ZOrder;
            return this;
        }
        public Integer getZOrder() {
            return this.ZOrder;
        }

    }

}
