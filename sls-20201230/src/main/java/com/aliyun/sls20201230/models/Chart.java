// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class Chart extends TeaModel {
    // action
    @NameInMap("action")
    public java.util.Map<String, String> action;

    // 图表的显示配置
    @NameInMap("display")
    public ChartDisplay display;

    // 查询配置
    @NameInMap("search")
    public ChartSearch search;

    // 图表标题
    @NameInMap("title")
    public String title;

    // 图标类型
    @NameInMap("type")
    public String type;

    public static Chart build(java.util.Map<String, ?> map) throws Exception {
        Chart self = new Chart();
        return TeaModel.build(map, self);
    }

    public Chart setAction(java.util.Map<String, String> action) {
        this.action = action;
        return this;
    }
    public java.util.Map<String, String> getAction() {
        return this.action;
    }

    public Chart setDisplay(ChartDisplay display) {
        this.display = display;
        return this;
    }
    public ChartDisplay getDisplay() {
        return this.display;
    }

    public Chart setSearch(ChartSearch search) {
        this.search = search;
        return this;
    }
    public ChartSearch getSearch() {
        return this.search;
    }

    public Chart setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public Chart setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public static class ChartDisplay extends TeaModel {
        // 高度
        @NameInMap("height")
        public Long height;

        // 宽度
        @NameInMap("width")
        public Long width;

        // x 轴
        @NameInMap("xAxis")
        public java.util.List<String> xAxis;

        // x 坐标
        @NameInMap("xPos")
        public Long xPos;

        // y 轴
        @NameInMap("yAxis")
        public java.util.List<String> yAxis;

        // y 坐标
        @NameInMap("yPos")
        public Long yPos;

        public static ChartDisplay build(java.util.Map<String, ?> map) throws Exception {
            ChartDisplay self = new ChartDisplay();
            return TeaModel.build(map, self);
        }

        public ChartDisplay setHeight(Long height) {
            this.height = height;
            return this;
        }
        public Long getHeight() {
            return this.height;
        }

        public ChartDisplay setWidth(Long width) {
            this.width = width;
            return this;
        }
        public Long getWidth() {
            return this.width;
        }

        public ChartDisplay setXAxis(java.util.List<String> xAxis) {
            this.xAxis = xAxis;
            return this;
        }
        public java.util.List<String> getXAxis() {
            return this.xAxis;
        }

        public ChartDisplay setXPos(Long xPos) {
            this.xPos = xPos;
            return this;
        }
        public Long getXPos() {
            return this.xPos;
        }

        public ChartDisplay setYAxis(java.util.List<String> yAxis) {
            this.yAxis = yAxis;
            return this;
        }
        public java.util.List<String> getYAxis() {
            return this.yAxis;
        }

        public ChartDisplay setYPos(Long yPos) {
            this.yPos = yPos;
            return this;
        }
        public Long getYPos() {
            return this.yPos;
        }

    }

    public static class ChartSearch extends TeaModel {
        // 结束时间
        @NameInMap("end")
        public String end;

        // logstore 名称
        @NameInMap("logstore")
        public String logstore;

        // 查询语句
        @NameInMap("query")
        public String query;

        // 开始时间
        @NameInMap("start")
        public String start;

        // topic
        @NameInMap("topic")
        public String topic;

        public static ChartSearch build(java.util.Map<String, ?> map) throws Exception {
            ChartSearch self = new ChartSearch();
            return TeaModel.build(map, self);
        }

        public ChartSearch setEnd(String end) {
            this.end = end;
            return this;
        }
        public String getEnd() {
            return this.end;
        }

        public ChartSearch setLogstore(String logstore) {
            this.logstore = logstore;
            return this;
        }
        public String getLogstore() {
            return this.logstore;
        }

        public ChartSearch setQuery(String query) {
            this.query = query;
            return this;
        }
        public String getQuery() {
            return this.query;
        }

        public ChartSearch setStart(String start) {
            this.start = start;
            return this;
        }
        public String getStart() {
            return this.start;
        }

        public ChartSearch setTopic(String topic) {
            this.topic = topic;
            return this;
        }
        public String getTopic() {
            return this.topic;
        }

    }

}
