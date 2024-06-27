// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeSimulationTaskListRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("currentPage")
    public String currentPage;

    @NameInMap("id")
    public String id;

    @NameInMap("name")
    public String name;

    @NameInMap("pageSize")
    public String pageSize;

    @NameInMap("regId")
    public String regId;

    @NameInMap("title")
    public String title;

    public static DescribeSimulationTaskListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSimulationTaskListRequest self = new DescribeSimulationTaskListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSimulationTaskListRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeSimulationTaskListRequest setCurrentPage(String currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public String getCurrentPage() {
        return this.currentPage;
    }

    public DescribeSimulationTaskListRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public DescribeSimulationTaskListRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeSimulationTaskListRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeSimulationTaskListRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

    public DescribeSimulationTaskListRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

}
