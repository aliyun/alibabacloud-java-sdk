// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeMPULayoutInfoListResponseBody extends TeaModel {
    @NameInMap("Layouts")
    public DescribeMPULayoutInfoListResponseBodyLayouts layouts;

    /**
     * <strong>example:</strong>
     * <p>760bad53276431c499e30dc36f6b26be</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalNum")
    public Long totalNum;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalPage")
    public Long totalPage;

    public static DescribeMPULayoutInfoListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMPULayoutInfoListResponseBody self = new DescribeMPULayoutInfoListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMPULayoutInfoListResponseBody setLayouts(DescribeMPULayoutInfoListResponseBodyLayouts layouts) {
        this.layouts = layouts;
        return this;
    }
    public DescribeMPULayoutInfoListResponseBodyLayouts getLayouts() {
        return this.layouts;
    }

    public DescribeMPULayoutInfoListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
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

    public static class DescribeMPULayoutInfoListResponseBodyLayoutsLayoutPanesPanes extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0.5</p>
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
         * <p>0.5</p>
         */
        @NameInMap("Width")
        public Float width;

        /**
         * <strong>example:</strong>
         * <p>0.5</p>
         */
        @NameInMap("X")
        public Float x;

        /**
         * <strong>example:</strong>
         * <p>0.5</p>
         */
        @NameInMap("Y")
        public Float y;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ZOrder")
        public Integer ZOrder;

        public static DescribeMPULayoutInfoListResponseBodyLayoutsLayoutPanesPanes build(java.util.Map<String, ?> map) throws Exception {
            DescribeMPULayoutInfoListResponseBodyLayoutsLayoutPanesPanes self = new DescribeMPULayoutInfoListResponseBodyLayoutsLayoutPanesPanes();
            return TeaModel.build(map, self);
        }

        public DescribeMPULayoutInfoListResponseBodyLayoutsLayoutPanesPanes setHeight(Float height) {
            this.height = height;
            return this;
        }
        public Float getHeight() {
            return this.height;
        }

        public DescribeMPULayoutInfoListResponseBodyLayoutsLayoutPanesPanes setMajorPane(Integer majorPane) {
            this.majorPane = majorPane;
            return this;
        }
        public Integer getMajorPane() {
            return this.majorPane;
        }

        public DescribeMPULayoutInfoListResponseBodyLayoutsLayoutPanesPanes setPaneId(Integer paneId) {
            this.paneId = paneId;
            return this;
        }
        public Integer getPaneId() {
            return this.paneId;
        }

        public DescribeMPULayoutInfoListResponseBodyLayoutsLayoutPanesPanes setWidth(Float width) {
            this.width = width;
            return this;
        }
        public Float getWidth() {
            return this.width;
        }

        public DescribeMPULayoutInfoListResponseBodyLayoutsLayoutPanesPanes setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public DescribeMPULayoutInfoListResponseBodyLayoutsLayoutPanesPanes setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

        public DescribeMPULayoutInfoListResponseBodyLayoutsLayoutPanesPanes setZOrder(Integer ZOrder) {
            this.ZOrder = ZOrder;
            return this;
        }
        public Integer getZOrder() {
            return this.ZOrder;
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
        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("AudioMixCount")
        public Integer audioMixCount;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("LayoutId")
        public Long layoutId;

        /**
         * <strong>example:</strong>
         * <p>LayoutName</p>
         */
        @NameInMap("Name")
        public String name;

        @NameInMap("Panes")
        public DescribeMPULayoutInfoListResponseBodyLayoutsLayoutPanes panes;

        public static DescribeMPULayoutInfoListResponseBodyLayoutsLayout build(java.util.Map<String, ?> map) throws Exception {
            DescribeMPULayoutInfoListResponseBodyLayoutsLayout self = new DescribeMPULayoutInfoListResponseBodyLayoutsLayout();
            return TeaModel.build(map, self);
        }

        public DescribeMPULayoutInfoListResponseBodyLayoutsLayout setAudioMixCount(Integer audioMixCount) {
            this.audioMixCount = audioMixCount;
            return this;
        }
        public Integer getAudioMixCount() {
            return this.audioMixCount;
        }

        public DescribeMPULayoutInfoListResponseBodyLayoutsLayout setLayoutId(Long layoutId) {
            this.layoutId = layoutId;
            return this;
        }
        public Long getLayoutId() {
            return this.layoutId;
        }

        public DescribeMPULayoutInfoListResponseBodyLayoutsLayout setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeMPULayoutInfoListResponseBodyLayoutsLayout setPanes(DescribeMPULayoutInfoListResponseBodyLayoutsLayoutPanes panes) {
            this.panes = panes;
            return this;
        }
        public DescribeMPULayoutInfoListResponseBodyLayoutsLayoutPanes getPanes() {
            return this.panes;
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
