// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class Chart extends TeaModel {
    /**
     * <p>action</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("action")
    public java.util.Map<String, ?> action;

    /**
     * <p>图表的显示配置。</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("display")
    public java.util.Map<String, ?> display;

    /**
     * <p>查询配置。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>(*)| SELECT date_format(<strong>time</strong> - <strong>time</strong> % 60, \&quot;%H:%i:%s\&quot;) as time, count(1) as count GROUP BY time ORDER BY time</p>
     */
    @NameInMap("search")
    public java.util.Map<String, ?> search;

    /**
     * <p>图表标题。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>my-chart</p>
     */
    @NameInMap("title")
    public String title;

    /**
     * <p>图表类型。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>linepro</p>
     */
    @NameInMap("type")
    public String type;

    public static Chart build(java.util.Map<String, ?> map) throws Exception {
        Chart self = new Chart();
        return TeaModel.build(map, self);
    }

    public Chart setAction(java.util.Map<String, ?> action) {
        this.action = action;
        return this;
    }
    public java.util.Map<String, ?> getAction() {
        return this.action;
    }

    public Chart setDisplay(java.util.Map<String, ?> display) {
        this.display = display;
        return this;
    }
    public java.util.Map<String, ?> getDisplay() {
        return this.display;
    }

    public Chart setSearch(java.util.Map<String, ?> search) {
        this.search = search;
        return this;
    }
    public java.util.Map<String, ?> getSearch() {
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

}
