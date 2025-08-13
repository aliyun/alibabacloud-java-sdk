// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeScoreSectionPieChartResponseBody extends TeaModel {
    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>AE7E6105-7DEB-5125-9B24-DCBC139F6CD2</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Return object</p>
     */
    @NameInMap("resultObject")
    public DescribeScoreSectionPieChartResponseBodyResultObject resultObject;

    public static DescribeScoreSectionPieChartResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeScoreSectionPieChartResponseBody self = new DescribeScoreSectionPieChartResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeScoreSectionPieChartResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeScoreSectionPieChartResponseBody setResultObject(DescribeScoreSectionPieChartResponseBodyResultObject resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public DescribeScoreSectionPieChartResponseBodyResultObject getResultObject() {
        return this.resultObject;
    }

    public static class DescribeScoreSectionPieChartResponseBodyResultObjectGrid extends TeaModel {
        /**
         * <p>Chart field, default false</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("show")
        public Boolean show;

        public static DescribeScoreSectionPieChartResponseBodyResultObjectGrid build(java.util.Map<String, ?> map) throws Exception {
            DescribeScoreSectionPieChartResponseBodyResultObjectGrid self = new DescribeScoreSectionPieChartResponseBodyResultObjectGrid();
            return TeaModel.build(map, self);
        }

        public DescribeScoreSectionPieChartResponseBodyResultObjectGrid setShow(Boolean show) {
            this.show = show;
            return this;
        }
        public Boolean getShow() {
            return this.show;
        }

    }

    public static class DescribeScoreSectionPieChartResponseBodyResultObjectSeriesData extends TeaModel {
        /**
         * <p>Category item name.</p>
         * 
         * <strong>example:</strong>
         * <p>名称</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>Result value.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("value")
        public String value;

        public static DescribeScoreSectionPieChartResponseBodyResultObjectSeriesData build(java.util.Map<String, ?> map) throws Exception {
            DescribeScoreSectionPieChartResponseBodyResultObjectSeriesData self = new DescribeScoreSectionPieChartResponseBodyResultObjectSeriesData();
            return TeaModel.build(map, self);
        }

        public DescribeScoreSectionPieChartResponseBodyResultObjectSeriesData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeScoreSectionPieChartResponseBodyResultObjectSeriesData setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeScoreSectionPieChartResponseBodyResultObjectSeries extends TeaModel {
        /**
         * <p>Chart data list</p>
         */
        @NameInMap("data")
        public java.util.List<DescribeScoreSectionPieChartResponseBodyResultObjectSeriesData> data;

        /**
         * <p>Category name.</p>
         * 
         * <strong>example:</strong>
         * <p>分值区间占比</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>Chart field, default false</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("roseType")
        public Boolean roseType;

        public static DescribeScoreSectionPieChartResponseBodyResultObjectSeries build(java.util.Map<String, ?> map) throws Exception {
            DescribeScoreSectionPieChartResponseBodyResultObjectSeries self = new DescribeScoreSectionPieChartResponseBodyResultObjectSeries();
            return TeaModel.build(map, self);
        }

        public DescribeScoreSectionPieChartResponseBodyResultObjectSeries setData(java.util.List<DescribeScoreSectionPieChartResponseBodyResultObjectSeriesData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<DescribeScoreSectionPieChartResponseBodyResultObjectSeriesData> getData() {
            return this.data;
        }

        public DescribeScoreSectionPieChartResponseBodyResultObjectSeries setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeScoreSectionPieChartResponseBodyResultObjectSeries setRoseType(Boolean roseType) {
            this.roseType = roseType;
            return this;
        }
        public Boolean getRoseType() {
            return this.roseType;
        }

    }

    public static class DescribeScoreSectionPieChartResponseBodyResultObject extends TeaModel {
        /**
         * <p>Chart field, default true</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("animation")
        public Boolean animation;

        /**
         * <p>Belongs to grid.</p>
         */
        @NameInMap("grid")
        public DescribeScoreSectionPieChartResponseBodyResultObjectGrid grid;

        /**
         * <p>Data list</p>
         */
        @NameInMap("series")
        public java.util.List<DescribeScoreSectionPieChartResponseBodyResultObjectSeries> series;

        public static DescribeScoreSectionPieChartResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            DescribeScoreSectionPieChartResponseBodyResultObject self = new DescribeScoreSectionPieChartResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public DescribeScoreSectionPieChartResponseBodyResultObject setAnimation(Boolean animation) {
            this.animation = animation;
            return this;
        }
        public Boolean getAnimation() {
            return this.animation;
        }

        public DescribeScoreSectionPieChartResponseBodyResultObject setGrid(DescribeScoreSectionPieChartResponseBodyResultObjectGrid grid) {
            this.grid = grid;
            return this;
        }
        public DescribeScoreSectionPieChartResponseBodyResultObjectGrid getGrid() {
            return this.grid;
        }

        public DescribeScoreSectionPieChartResponseBodyResultObject setSeries(java.util.List<DescribeScoreSectionPieChartResponseBodyResultObjectSeries> series) {
            this.series = series;
            return this;
        }
        public java.util.List<DescribeScoreSectionPieChartResponseBodyResultObjectSeries> getSeries() {
            return this.series;
        }

    }

}
