// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiplugin20220112.models;

import com.aliyun.tea.*;

public class ListCampaignsRequest extends TeaModel {
    // 运营活动名称过滤。
    @NameInMap("Name")
    public String name;

    // 分页数，从1开始，默认为1。
    @NameInMap("PageNumber")
    public Integer pageNumber;

    // 分页大小，默认为10。
    @NameInMap("PageSize")
    public Integer pageSize;

    // 运营活动备注过滤。
    @NameInMap("Remark")
    public String remark;

    public static ListCampaignsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCampaignsRequest self = new ListCampaignsRequest();
        return TeaModel.build(map, self);
    }

    public ListCampaignsRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListCampaignsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListCampaignsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListCampaignsRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

}
