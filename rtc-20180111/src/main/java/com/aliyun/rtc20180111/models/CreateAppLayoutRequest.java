// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class CreateAppLayoutRequest extends TeaModel {
    /**
     * <p>The application ID. You can create and query the ID in the console. Only a single ID is supported.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ac7N****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The client token.</p>
     * 
     * <strong>example:</strong>
     * <p>53200b81-b761-4c10-842a-a0726d97xxxx</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The layout.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Layout")
    public CreateAppLayoutRequestLayout layout;

    public static CreateAppLayoutRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAppLayoutRequest self = new CreateAppLayoutRequest();
        return TeaModel.build(map, self);
    }

    public CreateAppLayoutRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public CreateAppLayoutRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateAppLayoutRequest setLayout(CreateAppLayoutRequestLayout layout) {
        this.layout = layout;
        return this;
    }
    public CreateAppLayoutRequestLayout getLayout() {
        return this.layout;
    }

    public static class CreateAppLayoutRequestLayoutPanes extends TeaModel {
        /**
         * <p>The height of the pane, represented as a normalized percentage. Valid values: 0.0 &lt; Height ≤ 1.0.</p>
         * 
         * <strong>example:</strong>
         * <p>0.25</p>
         */
        @NameInMap("Height")
        public Double height;

        /**
         * <p>The ID of the pane. The value starts from 0.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("PaneId")
        public Long paneId;

        /**
         * <p>The width of the pane, represented as a normalized percentage. Valid values: 0.0 &lt; Width ≤ 1.0.</p>
         * 
         * <strong>example:</strong>
         * <p>0.25</p>
         */
        @NameInMap("Width")
        public Double width;

        /**
         * <p>The X coordinate, represented as a normalized percentage. Valid values: 0.0 ≤ X ≤ 1.0.</p>
         * 
         * <strong>example:</strong>
         * <p>0.25</p>
         */
        @NameInMap("X")
        public Double x;

        /**
         * <p>The Y coordinate, represented as a normalized percentage. Valid values: 0.0 ≤ Y ≤ 1.0.</p>
         * 
         * <strong>example:</strong>
         * <p>0.25</p>
         */
        @NameInMap("Y")
        public Double y;

        /**
         * <p>The Z-order of the pane. A value of 0 indicates the bottom layer, 1 indicates the layer above 0, and so on.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ZOrder")
        public Integer ZOrder;

        public static CreateAppLayoutRequestLayoutPanes build(java.util.Map<String, ?> map) throws Exception {
            CreateAppLayoutRequestLayoutPanes self = new CreateAppLayoutRequestLayoutPanes();
            return TeaModel.build(map, self);
        }

        public CreateAppLayoutRequestLayoutPanes setHeight(Double height) {
            this.height = height;
            return this;
        }
        public Double getHeight() {
            return this.height;
        }

        public CreateAppLayoutRequestLayoutPanes setPaneId(Long paneId) {
            this.paneId = paneId;
            return this;
        }
        public Long getPaneId() {
            return this.paneId;
        }

        public CreateAppLayoutRequestLayoutPanes setWidth(Double width) {
            this.width = width;
            return this;
        }
        public Double getWidth() {
            return this.width;
        }

        public CreateAppLayoutRequestLayoutPanes setX(Double x) {
            this.x = x;
            return this;
        }
        public Double getX() {
            return this.x;
        }

        public CreateAppLayoutRequestLayoutPanes setY(Double y) {
            this.y = y;
            return this;
        }
        public Double getY() {
            return this.y;
        }

        public CreateAppLayoutRequestLayoutPanes setZOrder(Integer ZOrder) {
            this.ZOrder = ZOrder;
            return this;
        }
        public Integer getZOrder() {
            return this.ZOrder;
        }

    }

    public static class CreateAppLayoutRequestLayout extends TeaModel {
        /**
         * <p>The name of the layout.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Layout</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The list of panes.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("Panes")
        public java.util.List<CreateAppLayoutRequestLayoutPanes> panes;

        public static CreateAppLayoutRequestLayout build(java.util.Map<String, ?> map) throws Exception {
            CreateAppLayoutRequestLayout self = new CreateAppLayoutRequestLayout();
            return TeaModel.build(map, self);
        }

        public CreateAppLayoutRequestLayout setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateAppLayoutRequestLayout setPanes(java.util.List<CreateAppLayoutRequestLayoutPanes> panes) {
            this.panes = panes;
            return this;
        }
        public java.util.List<CreateAppLayoutRequestLayoutPanes> getPanes() {
            return this.panes;
        }

    }

}
