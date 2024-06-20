// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class ModifyMPULayoutRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>yourAppId</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("AudioMixCount")
    public Integer audioMixCount;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10117</p>
     */
    @NameInMap("LayoutId")
    public Long layoutId;

    /**
     * <strong>example:</strong>
     * <p>LayoutName</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("Panes")
    public java.util.List<ModifyMPULayoutRequestPanes> panes;

    public static ModifyMPULayoutRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyMPULayoutRequest self = new ModifyMPULayoutRequest();
        return TeaModel.build(map, self);
    }

    public ModifyMPULayoutRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ModifyMPULayoutRequest setAudioMixCount(Integer audioMixCount) {
        this.audioMixCount = audioMixCount;
        return this;
    }
    public Integer getAudioMixCount() {
        return this.audioMixCount;
    }

    public ModifyMPULayoutRequest setLayoutId(Long layoutId) {
        this.layoutId = layoutId;
        return this;
    }
    public Long getLayoutId() {
        return this.layoutId;
    }

    public ModifyMPULayoutRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ModifyMPULayoutRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyMPULayoutRequest setPanes(java.util.List<ModifyMPULayoutRequestPanes> panes) {
        this.panes = panes;
        return this;
    }
    public java.util.List<ModifyMPULayoutRequestPanes> getPanes() {
        return this.panes;
    }

    public static class ModifyMPULayoutRequestPanes extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0.2456</p>
         */
        @NameInMap("Height")
        public Float height;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("MajorPane")
        public Integer majorPane;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("PaneId")
        public Integer paneId;

        /**
         * <strong>example:</strong>
         * <p>0.2456</p>
         */
        @NameInMap("Width")
        public Float width;

        /**
         * <strong>example:</strong>
         * <p>0.7576</p>
         */
        @NameInMap("X")
        public Float x;

        /**
         * <strong>example:</strong>
         * <p>0.7576</p>
         */
        @NameInMap("Y")
        public Float y;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ZOrder")
        public Integer ZOrder;

        public static ModifyMPULayoutRequestPanes build(java.util.Map<String, ?> map) throws Exception {
            ModifyMPULayoutRequestPanes self = new ModifyMPULayoutRequestPanes();
            return TeaModel.build(map, self);
        }

        public ModifyMPULayoutRequestPanes setHeight(Float height) {
            this.height = height;
            return this;
        }
        public Float getHeight() {
            return this.height;
        }

        public ModifyMPULayoutRequestPanes setMajorPane(Integer majorPane) {
            this.majorPane = majorPane;
            return this;
        }
        public Integer getMajorPane() {
            return this.majorPane;
        }

        public ModifyMPULayoutRequestPanes setPaneId(Integer paneId) {
            this.paneId = paneId;
            return this;
        }
        public Integer getPaneId() {
            return this.paneId;
        }

        public ModifyMPULayoutRequestPanes setWidth(Float width) {
            this.width = width;
            return this;
        }
        public Float getWidth() {
            return this.width;
        }

        public ModifyMPULayoutRequestPanes setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public ModifyMPULayoutRequestPanes setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

        public ModifyMPULayoutRequestPanes setZOrder(Integer ZOrder) {
            this.ZOrder = ZOrder;
            return this;
        }
        public Integer getZOrder() {
            return this.ZOrder;
        }

    }

}
