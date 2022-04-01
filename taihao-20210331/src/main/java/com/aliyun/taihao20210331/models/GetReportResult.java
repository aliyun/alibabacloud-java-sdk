// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class GetReportResult extends TeaModel {
    // children
    @NameInMap("children")
    public java.util.List<ViewChild> children;

    // name
    @NameInMap("name")
    public String name;

    // report time
    @NameInMap("reportTime")
    public Long reportTime;

    // title
    @NameInMap("title")
    public String title;

    public static GetReportResult build(java.util.Map<String, ?> map) throws Exception {
        GetReportResult self = new GetReportResult();
        return TeaModel.build(map, self);
    }

    public GetReportResult setChildren(java.util.List<ViewChild> children) {
        this.children = children;
        return this;
    }
    public java.util.List<ViewChild> getChildren() {
        return this.children;
    }

    public GetReportResult setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetReportResult setReportTime(Long reportTime) {
        this.reportTime = reportTime;
        return this;
    }
    public Long getReportTime() {
        return this.reportTime;
    }

    public GetReportResult setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

}
