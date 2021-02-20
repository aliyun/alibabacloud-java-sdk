// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeMPULayoutInfoListResponseBody extends TeaModel {
    @NameInMap("TotalNum")
    public Long totalNum;

    @NameInMap("TotalPage")
    public Long totalPage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Layouts")
    public DescribeMPULayoutInfoListResponseBodyLayouts layouts;

    public static DescribeMPULayoutInfoListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMPULayoutInfoListResponseBody self = new DescribeMPULayoutInfoListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMPULayoutInfoListResponseBody setTotalNum(Long totalNum) {
        this.totalNum = totalNum;
        return this;
    }
    public Long getTotalNum() {
        return this.totalNum;
    }

    public DescribeMPULayoutInfoListResponseBody setTotalPage(Long totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Long getTotalPage() {
        return this.totalPage;
    }

    public DescribeMPULayoutInfoListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeMPULayoutInfoListResponseBody setLayouts(DescribeMPULayoutInfoListResponseBodyLayouts layouts) {
        this.layouts = layouts;
        return this;
    }
    public DescribeMPULayoutInfoListResponseBodyLayouts getLayouts() {
        return this.layouts;
    }

    public static class DescribeMPULayoutInfoListResponseBodyLayoutsLayoutPanesPanes extends TeaModel {
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

        public static DescribeMPULayoutInfoListResponseBodyLayoutsLayoutPanesPanes build(java.util.Map<String, ?> map) throws Exception {
            DescribeMPULayoutInfoListResponseBodyLayoutsLayoutPanesPanes self = new DescribeMPULayoutInfoListResponseBodyLayoutsLayoutPanesPanes();
            return TeaModel.build(map, self);
        }

        public DescribeMPULayoutInfoListResponseBodyLayoutsLayoutPanesPanes setMajorPane(Integer majorPane) {
            this.majorPane = majorPane;
            return this;
        }
        public Integer getMajorPane() {
            return this.majorPane;
        }

        public DescribeMPULayoutInfoListResponseBodyLayoutsLayoutPanesPanes setWidth(Float width) {
            this.width = width;
            return this;
        }
        public Float getWidth() {
            return this.width;
        }

        public DescribeMPULayoutInfoListResponseBodyLayoutsLayoutPanesPanes setHeight(Float height) {
            this.height = height;
            return this;
        }
        public Float getHeight() {
            return this.height;
        }

        public DescribeMPULayoutInfoListResponseBodyLayoutsLayoutPanesPanes setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

        public DescribeMPULayoutInfoListResponseBodyLayoutsLayoutPanesPanes setPaneId(Integer paneId) {
            this.paneId = paneId;
            return this;
        }
        public Integer getPaneId() {
            return this.paneId;
        }

        public DescribeMPULayoutInfoListResponseBodyLayoutsLayoutPanesPanes setZOrder(Integer ZOrder) {
            this.ZOrder = ZOrder;
            return this;
        }
        public Integer getZOrder() {
            return this.ZOrder;
        }

        public DescribeMPULayoutInfoListResponseBodyLayoutsLayoutPanesPanes setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

    }

    public static class DescribeMPULayoutInfoListResponseBodyLayoutsLayoutPanes extends TeaModel {
        @NameInMap("Panes")
        public java.util.List<DescribeMPULayoutInfoListResponseBodyLayoutsLayoutPanesPanes> panes;

        public static DescribeMPULayoutInfoListResponseBodyLayoutsLayoutPanes build(java.util.Map<String, ?> map) throws Exception {
            DescribeMPULayoutInfoListResponseBodyLayoutsLayoutPanes self = new DescribeMPULayoutInfoListResponseBodyLayoutsLayoutPanes();
            return TeaModel.build(map, self);
        }

        public DescribeMPULayoutInfoListResponseBodyLayoutsLayoutPanes setPanes(java.util.List<DescribeMPULayoutInfoListResponseBodyLayoutsLayoutPanesPanes> panes) {
            this.panes = panes;
            return this;
        }
        public java.util.List<DescribeMPULayoutInfoListResponseBodyLayoutsLayoutPanesPanes> getPanes() {
            return this.panes;
        }

    }

    public static class DescribeMPULayoutInfoListResponseBodyLayoutsLayout extends TeaModel {
        @NameInMap("LayoutId")
        public Long layoutId;

        @NameInMap("Panes")
        public DescribeMPULayoutInfoListResponseBodyLayoutsLayoutPanes panes;

        @NameInMap("Name")
        public String name;

        @NameInMap("AudioMixCount")
        public Integer audioMixCount;

        public static DescribeMPULayoutInfoListResponseBodyLayoutsLayout build(java.util.Map<String, ?> map) throws Exception {
            DescribeMPULayoutInfoListResponseBodyLayoutsLayout self = new DescribeMPULayoutInfoListResponseBodyLayoutsLayout();
            return TeaModel.build(map, self);
        }

        public DescribeMPULayoutInfoListResponseBodyLayoutsLayout setLayoutId(Long layoutId) {
            this.layoutId = layoutId;
            return this;
        }
        public Long getLayoutId() {
            return this.layoutId;
        }

        public DescribeMPULayoutInfoListResponseBodyLayoutsLayout setPanes(DescribeMPULayoutInfoListResponseBodyLayoutsLayoutPanes panes) {
            this.panes = panes;
            return this;
        }
        public DescribeMPULayoutInfoListResponseBodyLayoutsLayoutPanes getPanes() {
            return this.panes;
        }

        public DescribeMPULayoutInfoListResponseBodyLayoutsLayout setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeMPULayoutInfoListResponseBodyLayoutsLayout setAudioMixCount(Integer audioMixCount) {
            this.audioMixCount = audioMixCount;
            return this;
        }
        public Integer getAudioMixCount() {
            return this.audioMixCount;
        }

    }

    public static class DescribeMPULayoutInfoListResponseBodyLayouts extends TeaModel {
        @NameInMap("Layout")
        public java.util.List<DescribeMPULayoutInfoListResponseBodyLayoutsLayout> layout;

        public static DescribeMPULayoutInfoListResponseBodyLayouts build(java.util.Map<String, ?> map) throws Exception {
            DescribeMPULayoutInfoListResponseBodyLayouts self = new DescribeMPULayoutInfoListResponseBodyLayouts();
            return TeaModel.build(map, self);
        }

        public DescribeMPULayoutInfoListResponseBodyLayouts setLayout(java.util.List<DescribeMPULayoutInfoListResponseBodyLayoutsLayout> layout) {
            this.layout = layout;
            return this;
        }
        public java.util.List<DescribeMPULayoutInfoListResponseBodyLayoutsLayout> getLayout() {
            return this.layout;
        }

    }

}
