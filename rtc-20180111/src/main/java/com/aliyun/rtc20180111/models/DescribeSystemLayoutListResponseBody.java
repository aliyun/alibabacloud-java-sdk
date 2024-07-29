// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeSystemLayoutListResponseBody extends TeaModel {
    @NameInMap("Layouts")
    public DescribeSystemLayoutListResponseBodyLayouts layouts;

    /**
     * <strong>example:</strong>
     * <p>16A96B9A-F203-4EC5-8E43-CB92E68F4CD8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>6</p>
     */
    @NameInMap("TotalNum")
    public Long totalNum;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("TotalPage")
    public Long totalPage;

    public static DescribeSystemLayoutListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSystemLayoutListResponseBody self = new DescribeSystemLayoutListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSystemLayoutListResponseBody setLayouts(DescribeSystemLayoutListResponseBodyLayouts layouts) {
        this.layouts = layouts;
        return this;
    }
    public DescribeSystemLayoutListResponseBodyLayouts getLayouts() {
        return this.layouts;
    }

    public DescribeSystemLayoutListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSystemLayoutListResponseBody setTotalNum(Long totalNum) {
        this.totalNum = totalNum;
        return this;
    }
    public Long getTotalNum() {
        return this.totalNum;
    }

    public DescribeSystemLayoutListResponseBody setTotalPage(Long totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Long getTotalPage() {
        return this.totalPage;
    }

    public static class DescribeSystemLayoutListResponseBodyLayoutsLayoutPanesPanes extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0.25</p>
         */
        @NameInMap("Height")
        public Float height;

        /**
         * <p>MajorPane。</p>
         * 
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
         * <p>0.25</p>
         */
        @NameInMap("Width")
        public Float width;

        /**
         * <strong>example:</strong>
         * <p>0.25</p>
         */
        @NameInMap("X")
        public Float x;

        /**
         * <strong>example:</strong>
         * <p>0.25</p>
         */
        @NameInMap("Y")
        public Float y;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ZOrder")
        public Integer ZOrder;

        public static DescribeSystemLayoutListResponseBodyLayoutsLayoutPanesPanes build(java.util.Map<String, ?> map) throws Exception {
            DescribeSystemLayoutListResponseBodyLayoutsLayoutPanesPanes self = new DescribeSystemLayoutListResponseBodyLayoutsLayoutPanesPanes();
            return TeaModel.build(map, self);
        }

        public DescribeSystemLayoutListResponseBodyLayoutsLayoutPanesPanes setHeight(Float height) {
            this.height = height;
            return this;
        }
        public Float getHeight() {
            return this.height;
        }

        public DescribeSystemLayoutListResponseBodyLayoutsLayoutPanesPanes setMajorPane(Integer majorPane) {
            this.majorPane = majorPane;
            return this;
        }
        public Integer getMajorPane() {
            return this.majorPane;
        }

        public DescribeSystemLayoutListResponseBodyLayoutsLayoutPanesPanes setPaneId(Integer paneId) {
            this.paneId = paneId;
            return this;
        }
        public Integer getPaneId() {
            return this.paneId;
        }

        public DescribeSystemLayoutListResponseBodyLayoutsLayoutPanesPanes setWidth(Float width) {
            this.width = width;
            return this;
        }
        public Float getWidth() {
            return this.width;
        }

        public DescribeSystemLayoutListResponseBodyLayoutsLayoutPanesPanes setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public DescribeSystemLayoutListResponseBodyLayoutsLayoutPanesPanes setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

        public DescribeSystemLayoutListResponseBodyLayoutsLayoutPanesPanes setZOrder(Integer ZOrder) {
            this.ZOrder = ZOrder;
            return this;
        }
        public Integer getZOrder() {
            return this.ZOrder;
        }

    }

    public static class DescribeSystemLayoutListResponseBodyLayoutsLayoutPanes extends TeaModel {
        @NameInMap("Panes")
        public java.util.List<DescribeSystemLayoutListResponseBodyLayoutsLayoutPanesPanes> panes;

        public static DescribeSystemLayoutListResponseBodyLayoutsLayoutPanes build(java.util.Map<String, ?> map) throws Exception {
            DescribeSystemLayoutListResponseBodyLayoutsLayoutPanes self = new DescribeSystemLayoutListResponseBodyLayoutsLayoutPanes();
            return TeaModel.build(map, self);
        }

        public DescribeSystemLayoutListResponseBodyLayoutsLayoutPanes setPanes(java.util.List<DescribeSystemLayoutListResponseBodyLayoutsLayoutPanesPanes> panes) {
            this.panes = panes;
            return this;
        }
        public java.util.List<DescribeSystemLayoutListResponseBodyLayoutsLayoutPanesPanes> getPanes() {
            return this.panes;
        }

    }

    public static class DescribeSystemLayoutListResponseBodyLayoutsLayout extends TeaModel {
        /**
         * <p>AudioMixCount。</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("AudioMixCount")
        public Integer audioMixCount;

        /**
         * <strong>example:</strong>
         * <p>22</p>
         */
        @NameInMap("LayoutId")
        public Long layoutId;

        @NameInMap("Name")
        public String name;

        @NameInMap("Panes")
        public DescribeSystemLayoutListResponseBodyLayoutsLayoutPanes panes;

        public static DescribeSystemLayoutListResponseBodyLayoutsLayout build(java.util.Map<String, ?> map) throws Exception {
            DescribeSystemLayoutListResponseBodyLayoutsLayout self = new DescribeSystemLayoutListResponseBodyLayoutsLayout();
            return TeaModel.build(map, self);
        }

        public DescribeSystemLayoutListResponseBodyLayoutsLayout setAudioMixCount(Integer audioMixCount) {
            this.audioMixCount = audioMixCount;
            return this;
        }
        public Integer getAudioMixCount() {
            return this.audioMixCount;
        }

        public DescribeSystemLayoutListResponseBodyLayoutsLayout setLayoutId(Long layoutId) {
            this.layoutId = layoutId;
            return this;
        }
        public Long getLayoutId() {
            return this.layoutId;
        }

        public DescribeSystemLayoutListResponseBodyLayoutsLayout setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeSystemLayoutListResponseBodyLayoutsLayout setPanes(DescribeSystemLayoutListResponseBodyLayoutsLayoutPanes panes) {
            this.panes = panes;
            return this;
        }
        public DescribeSystemLayoutListResponseBodyLayoutsLayoutPanes getPanes() {
            return this.panes;
        }

    }

    public static class DescribeSystemLayoutListResponseBodyLayouts extends TeaModel {
        @NameInMap("Layout")
        public java.util.List<DescribeSystemLayoutListResponseBodyLayoutsLayout> layout;

        public static DescribeSystemLayoutListResponseBodyLayouts build(java.util.Map<String, ?> map) throws Exception {
            DescribeSystemLayoutListResponseBodyLayouts self = new DescribeSystemLayoutListResponseBodyLayouts();
            return TeaModel.build(map, self);
        }

        public DescribeSystemLayoutListResponseBodyLayouts setLayout(java.util.List<DescribeSystemLayoutListResponseBodyLayoutsLayout> layout) {
            this.layout = layout;
            return this;
        }
        public java.util.List<DescribeSystemLayoutListResponseBodyLayoutsLayout> getLayout() {
            return this.layout;
        }

    }

}
