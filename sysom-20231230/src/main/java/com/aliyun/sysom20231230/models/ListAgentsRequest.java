// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class ListAgentsRequest extends TeaModel {
    @NameInMap("current")
    public Long current;

    @NameInMap("name")
    public String name;

    @NameInMap("pageSize")
    public Long pageSize;

    @NameInMap("type")
    public String type;

    public static ListAgentsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAgentsRequest self = new ListAgentsRequest();
        return TeaModel.build(map, self);
    }

    public ListAgentsRequest setCurrent(Long current) {
        this.current = current;
        return this;
    }
    public Long getCurrent() {
        return this.current;
    }

    public ListAgentsRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListAgentsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListAgentsRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
