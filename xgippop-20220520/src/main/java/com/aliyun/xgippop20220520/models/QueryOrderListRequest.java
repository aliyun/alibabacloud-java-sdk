// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xgippop20220520.models;

import com.aliyun.tea.*;

public class QueryOrderListRequest extends TeaModel {
    @NameInMap("Current")
    public Integer current;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("ItemCode")
    public String itemCode;

    @NameInMap("Mobile")
    public String mobile;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("UId")
    public Long UId;

    public static QueryOrderListRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryOrderListRequest self = new QueryOrderListRequest();
        return TeaModel.build(map, self);
    }

    public QueryOrderListRequest setCurrent(Integer current) {
        this.current = current;
        return this;
    }
    public Integer getCurrent() {
        return this.current;
    }

    public QueryOrderListRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public QueryOrderListRequest setItemCode(String itemCode) {
        this.itemCode = itemCode;
        return this;
    }
    public String getItemCode() {
        return this.itemCode;
    }

    public QueryOrderListRequest setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }
    public String getMobile() {
        return this.mobile;
    }

    public QueryOrderListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryOrderListRequest setUId(Long UId) {
        this.UId = UId;
        return this;
    }
    public Long getUId() {
        return this.UId;
    }

}
