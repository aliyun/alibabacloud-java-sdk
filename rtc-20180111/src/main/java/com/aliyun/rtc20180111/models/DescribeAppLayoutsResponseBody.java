// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeAppLayoutsResponseBody extends TeaModel {
    @NameInMap("Layouts")
    public java.util.List<DescribeAppLayoutsResponseBodyLayouts> layouts;

    /**
     * <strong>example:</strong>
     * <p>16A96B9A-F203-4EC5-8E43-CB92E68F4CD8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TotalNum")
    public Long totalNum;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalPage")
    public Long totalPage;

    public static DescribeAppLayoutsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAppLayoutsResponseBody self = new DescribeAppLayoutsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAppLayoutsResponseBody setLayouts(java.util.List<DescribeAppLayoutsResponseBodyLayouts> layouts) {
        this.layouts = layouts;
        return this;
    }
    public java.util.List<DescribeAppLayoutsResponseBodyLayouts> getLayouts() {
        return this.layouts;
    }

    public DescribeAppLayoutsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAppLayoutsResponseBody setTotalNum(Long totalNum) {
        this.totalNum = totalNum;
        return this;
    }
    public Long getTotalNum() {
        return this.totalNum;
    }

    public DescribeAppLayoutsResponseBody setTotalPage(Long totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Long getTotalPage() {
        return this.totalPage;
    }

    public static class DescribeAppLayoutsResponseBodyLayoutsPanes extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0.25</p>
         */
        @NameInMap("Height")
        public Float height;

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

        public static DescribeAppLayoutsResponseBodyLayoutsPanes build(java.util.Map<String, ?> map) throws Exception {
            DescribeAppLayoutsResponseBodyLayoutsPanes self = new DescribeAppLayoutsResponseBodyLayoutsPanes();
            return TeaModel.build(map, self);
        }

        public DescribeAppLayoutsResponseBodyLayoutsPanes setHeight(Float height) {
            this.height = height;
            return this;
        }
        public Float getHeight() {
            return this.height;
        }

        public DescribeAppLayoutsResponseBodyLayoutsPanes setPaneId(Integer paneId) {
            this.paneId = paneId;
            return this;
        }
        public Integer getPaneId() {
            return this.paneId;
        }

        public DescribeAppLayoutsResponseBodyLayoutsPanes setWidth(Float width) {
            this.width = width;
            return this;
        }
        public Float getWidth() {
            return this.width;
        }

        public DescribeAppLayoutsResponseBodyLayoutsPanes setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public DescribeAppLayoutsResponseBodyLayoutsPanes setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

        public DescribeAppLayoutsResponseBodyLayoutsPanes setZOrder(Integer ZOrder) {
            this.ZOrder = ZOrder;
            return this;
        }
        public Integer getZOrder() {
            return this.ZOrder;
        }

    }

    public static class DescribeAppLayoutsResponseBodyLayouts extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>167466539798442****</p>
         */
        @NameInMap("LayoutId")
        public String layoutId;

        /**
         * <strong>example:</strong>
         * <p>测试</p>
         */
        @NameInMap("Name")
        public String name;

        @NameInMap("Panes")
        public java.util.List<DescribeAppLayoutsResponseBodyLayoutsPanes> panes;

        public static DescribeAppLayoutsResponseBodyLayouts build(java.util.Map<String, ?> map) throws Exception {
            DescribeAppLayoutsResponseBodyLayouts self = new DescribeAppLayoutsResponseBodyLayouts();
            return TeaModel.build(map, self);
        }

        public DescribeAppLayoutsResponseBodyLayouts setLayoutId(String layoutId) {
            this.layoutId = layoutId;
            return this;
        }
        public String getLayoutId() {
            return this.layoutId;
        }

        public DescribeAppLayoutsResponseBodyLayouts setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeAppLayoutsResponseBodyLayouts setPanes(java.util.List<DescribeAppLayoutsResponseBodyLayoutsPanes> panes) {
            this.panes = panes;
            return this;
        }
        public java.util.List<DescribeAppLayoutsResponseBodyLayoutsPanes> getPanes() {
            return this.panes;
        }

    }

}
