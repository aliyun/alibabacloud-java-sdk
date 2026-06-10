// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class ListInstanceStatusRequest extends TeaModel {
    /**
     * <p>This field exists when paging is used and indicates the current page (starting from 1).</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("current")
    public Long current;

    /**
     * <p>Instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>i-wz9b9vucz1iubsz355rh</p>
     */
    @NameInMap("instance")
    public String instance;

    /**
     * <p>Number of entries returned per page. Default value: pageSize=10</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Long pageSize;

    /**
     * <p>Region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shenzhen</p>
     */
    @NameInMap("region")
    public String region;

    /**
     * <p>Filter the instance list by status. If this field is specified, only instances with the corresponding status are returned.</p>
     * 
     * <strong>example:</strong>
     * <p>Running</p>
     */
    @NameInMap("status")
    public String status;

    public static ListInstanceStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        ListInstanceStatusRequest self = new ListInstanceStatusRequest();
        return TeaModel.build(map, self);
    }

    public ListInstanceStatusRequest setCurrent(Long current) {
        this.current = current;
        return this;
    }
    public Long getCurrent() {
        return this.current;
    }

    public ListInstanceStatusRequest setInstance(String instance) {
        this.instance = instance;
        return this;
    }
    public String getInstance() {
        return this.instance;
    }

    public ListInstanceStatusRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListInstanceStatusRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public ListInstanceStatusRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
