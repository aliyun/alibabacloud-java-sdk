// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class ListProjectResponseBody extends TeaModel {
    /**
     * <p>The number of projects returned on the current page.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("count")
    public Long count;

    /**
     * <p>The list of projects that meet the query criteria.</p>
     * 
     * <strong>example:</strong>
     * <p>不涉及</p>
     */
    @NameInMap("projects")
    public java.util.List<Project> projects;

    /**
     * <p>The total number of projects that meet the query criteria.</p>
     * 
     * <strong>example:</strong>
     * <p>11</p>
     */
    @NameInMap("total")
    public Long total;

    public static ListProjectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListProjectResponseBody self = new ListProjectResponseBody();
        return TeaModel.build(map, self);
    }

    public ListProjectResponseBody setCount(Long count) {
        this.count = count;
        return this;
    }
    public Long getCount() {
        return this.count;
    }

    public ListProjectResponseBody setProjects(java.util.List<Project> projects) {
        this.projects = projects;
        return this;
    }
    public java.util.List<Project> getProjects() {
        return this.projects;
    }

    public ListProjectResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

}
