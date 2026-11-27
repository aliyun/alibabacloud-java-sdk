// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class ModifyAppLayoutRequest extends TeaModel {
    /**
     * <p>Application ID. Create and query through the console. Only a single ID is supported.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ac7N****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>Idempotent parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>53200b81-b761-4c10-842a-a0726d97xxxx</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Layout.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Layout")
    public ModifyAppLayoutRequestLayout layout;

    public static ModifyAppLayoutRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyAppLayoutRequest self = new ModifyAppLayoutRequest();
        return TeaModel.build(map, self);
    }

    public ModifyAppLayoutRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ModifyAppLayoutRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ModifyAppLayoutRequest setLayout(ModifyAppLayoutRequestLayout layout) {
        this.layout = layout;
        return this;
    }
    public ModifyAppLayoutRequestLayout getLayout() {
        return this.layout;
    }

    public static class ModifyAppLayoutRequestLayoutPanes extends TeaModel {
        /**
         * <p>Pane height, normalized percentage. Height ranges from 0.0&lt;Height≤1.0.</p>
         * 
         * <strong>example:</strong>
         * <p>0.25</p>
         */
        @NameInMap("Height")
        public Double height;

        /**
         * <p>Pane ID, starting from 0.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("PaneId")
        public Long paneId;

        /**
         * <p>Pane width, normalized percentage. Width ranges from 0.0&lt;Width≤1.0.</p>
         * 
         * <strong>example:</strong>
         * <p>0.25</p>
         */
        @NameInMap("Width")
        public Double width;

        /**
         * <p>X coordinate, normalized percentage. The X coordinate ranges from 0.0 to 1.0.</p>
         * 
         * <strong>example:</strong>
         * <p>0.25</p>
         */
        @NameInMap("X")
        public Double x;

        /**
         * <p>Y coordinate, normalized percentage. The Y coordinate ranges from 0.0 to 1.0.</p>
         * 
         * <strong>example:</strong>
         * <p>0.25</p>
         */
        @NameInMap("Y")
        public Double y;

        /**
         * <p>Stacking order. 0 is the bottom layer, 1 is above 0, and so on.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ZOrder")
        public Integer ZOrder;

        public static ModifyAppLayoutRequestLayoutPanes build(java.util.Map<String, ?> map) throws Exception {
            ModifyAppLayoutRequestLayoutPanes self = new ModifyAppLayoutRequestLayoutPanes();
            return TeaModel.build(map, self);
        }

        public ModifyAppLayoutRequestLayoutPanes setHeight(Double height) {
            this.height = height;
            return this;
        }
        public Double getHeight() {
            return this.height;
        }

        public ModifyAppLayoutRequestLayoutPanes setPaneId(Long paneId) {
            this.paneId = paneId;
            return this;
        }
        public Long getPaneId() {
            return this.paneId;
        }

        public ModifyAppLayoutRequestLayoutPanes setWidth(Double width) {
            this.width = width;
            return this;
        }
        public Double getWidth() {
            return this.width;
        }

        public ModifyAppLayoutRequestLayoutPanes setX(Double x) {
            this.x = x;
            return this;
        }
        public Double getX() {
            return this.x;
        }

        public ModifyAppLayoutRequestLayoutPanes setY(Double y) {
            this.y = y;
            return this;
        }
        public Double getY() {
            return this.y;
        }

        public ModifyAppLayoutRequestLayoutPanes setZOrder(Integer ZOrder) {
            this.ZOrder = ZOrder;
            return this;
        }
        public Integer getZOrder() {
            return this.ZOrder;
        }

    }

    public static class ModifyAppLayoutRequestLayout extends TeaModel {
        /**
         * <p>Layout ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123121231313</p>
         */
        @NameInMap("LayoutId")
        public String layoutId;

        /**
         * <p>Layout name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>测试</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>List of panes.</p>
         */
        @NameInMap("Panes")
        public java.util.List<ModifyAppLayoutRequestLayoutPanes> panes;

        public static ModifyAppLayoutRequestLayout build(java.util.Map<String, ?> map) throws Exception {
            ModifyAppLayoutRequestLayout self = new ModifyAppLayoutRequestLayout();
            return TeaModel.build(map, self);
        }

        public ModifyAppLayoutRequestLayout setLayoutId(String layoutId) {
            this.layoutId = layoutId;
            return this;
        }
        public String getLayoutId() {
            return this.layoutId;
        }

        public ModifyAppLayoutRequestLayout setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ModifyAppLayoutRequestLayout setPanes(java.util.List<ModifyAppLayoutRequestLayoutPanes> panes) {
            this.panes = panes;
            return this;
        }
        public java.util.List<ModifyAppLayoutRequestLayoutPanes> getPanes() {
            return this.panes;
        }

    }

}
