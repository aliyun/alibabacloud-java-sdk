// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeMPULayoutInfoResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Layout")
    public DescribeMPULayoutInfoResponseBodyLayout layout;

    public static DescribeMPULayoutInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMPULayoutInfoResponseBody self = new DescribeMPULayoutInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMPULayoutInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeMPULayoutInfoResponseBody setLayout(DescribeMPULayoutInfoResponseBodyLayout layout) {
        this.layout = layout;
        return this;
    }
    public DescribeMPULayoutInfoResponseBodyLayout getLayout() {
        return this.layout;
    }

    public static class DescribeMPULayoutInfoResponseBodyLayoutPanesPanes extends TeaModel {
        @NameInMap("MajorPane")
        public Integer majorPane;

        @NameInMap("Width")
        public Float width;

        @NameInMap("Height")
        public Float height;

        @NameInMap("Y")
        public Float y;

        @NameInMap("PaneId")
        public Integer paneId;

        @NameInMap("ZOrder")
        public Integer ZOrder;

        @NameInMap("X")
        public Float x;

        public static DescribeMPULayoutInfoResponseBodyLayoutPanesPanes build(java.util.Map<String, ?> map) throws Exception {
            DescribeMPULayoutInfoResponseBodyLayoutPanesPanes self = new DescribeMPULayoutInfoResponseBodyLayoutPanesPanes();
            return TeaModel.build(map, self);
        }

        public DescribeMPULayoutInfoResponseBodyLayoutPanesPanes setMajorPane(Integer majorPane) {
            this.majorPane = majorPane;
            return this;
        }
        public Integer getMajorPane() {
            return this.majorPane;
        }

        public DescribeMPULayoutInfoResponseBodyLayoutPanesPanes setWidth(Float width) {
            this.width = width;
            return this;
        }
        public Float getWidth() {
            return this.width;
        }

        public DescribeMPULayoutInfoResponseBodyLayoutPanesPanes setHeight(Float height) {
            this.height = height;
            return this;
        }
        public Float getHeight() {
            return this.height;
        }

        public DescribeMPULayoutInfoResponseBodyLayoutPanesPanes setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

        public DescribeMPULayoutInfoResponseBodyLayoutPanesPanes setPaneId(Integer paneId) {
            this.paneId = paneId;
            return this;
        }
        public Integer getPaneId() {
            return this.paneId;
        }

        public DescribeMPULayoutInfoResponseBodyLayoutPanesPanes setZOrder(Integer ZOrder) {
            this.ZOrder = ZOrder;
            return this;
        }
        public Integer getZOrder() {
            return this.ZOrder;
        }

        public DescribeMPULayoutInfoResponseBodyLayoutPanesPanes setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

    }

    public static class DescribeMPULayoutInfoResponseBodyLayoutPanes extends TeaModel {
        @NameInMap("Panes")
        public java.util.List<DescribeMPULayoutInfoResponseBodyLayoutPanesPanes> panes;

        public static DescribeMPULayoutInfoResponseBodyLayoutPanes build(java.util.Map<String, ?> map) throws Exception {
            DescribeMPULayoutInfoResponseBodyLayoutPanes self = new DescribeMPULayoutInfoResponseBodyLayoutPanes();
            return TeaModel.build(map, self);
        }

        public DescribeMPULayoutInfoResponseBodyLayoutPanes setPanes(java.util.List<DescribeMPULayoutInfoResponseBodyLayoutPanesPanes> panes) {
            this.panes = panes;
            return this;
        }
        public java.util.List<DescribeMPULayoutInfoResponseBodyLayoutPanesPanes> getPanes() {
            return this.panes;
        }

    }

    public static class DescribeMPULayoutInfoResponseBodyLayout extends TeaModel {
        @NameInMap("LayoutId")
        public Long layoutId;

        @NameInMap("Panes")
        public DescribeMPULayoutInfoResponseBodyLayoutPanes panes;

        @NameInMap("Name")
        public String name;

        @NameInMap("AudioMixCount")
        public Integer audioMixCount;

        public static DescribeMPULayoutInfoResponseBodyLayout build(java.util.Map<String, ?> map) throws Exception {
            DescribeMPULayoutInfoResponseBodyLayout self = new DescribeMPULayoutInfoResponseBodyLayout();
            return TeaModel.build(map, self);
        }

        public DescribeMPULayoutInfoResponseBodyLayout setLayoutId(Long layoutId) {
            this.layoutId = layoutId;
            return this;
        }
        public Long getLayoutId() {
            return this.layoutId;
        }

        public DescribeMPULayoutInfoResponseBodyLayout setPanes(DescribeMPULayoutInfoResponseBodyLayoutPanes panes) {
            this.panes = panes;
            return this;
        }
        public DescribeMPULayoutInfoResponseBodyLayoutPanes getPanes() {
            return this.panes;
        }

        public DescribeMPULayoutInfoResponseBodyLayout setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeMPULayoutInfoResponseBodyLayout setAudioMixCount(Integer audioMixCount) {
            this.audioMixCount = audioMixCount;
            return this;
        }
        public Integer getAudioMixCount() {
            return this.audioMixCount;
        }

    }

}
