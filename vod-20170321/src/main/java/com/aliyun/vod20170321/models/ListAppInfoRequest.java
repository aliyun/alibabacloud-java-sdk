// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ListAppInfoRequest extends TeaModel {
    /**
     * <p>The operation that you want to perform. Set the value to **ListAppInfo**.</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <p>The type of the application. Valid values:</p>
     * <br>
     * <p>*   **System**</p>
     * <p>*   **Custom**</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The details of each application.</p>
     */
    @NameInMap("Status")
    public String status;

    public static ListAppInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAppInfoRequest self = new ListAppInfoRequest();
        return TeaModel.build(map, self);
    }

    public ListAppInfoRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public ListAppInfoRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListAppInfoRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
