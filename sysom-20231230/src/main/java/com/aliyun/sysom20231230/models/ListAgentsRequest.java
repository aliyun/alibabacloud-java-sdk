// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class ListAgentsRequest extends TeaModel {
    /**
     * <p>The current page number. Pages start from page 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("current")
    public Long current;

    /**
     * <p>Filters plug-ins by plug-in name.</p>
     * 
     * <strong>example:</strong>
     * <p>SysOM</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Long pageSize;

    /**
     * <p>The agent type used to filter the list. For example, set this parameter to control to retrieve all agents of the control type.</p>
     * 
     * <strong>example:</strong>
     * <p>control</p>
     */
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
