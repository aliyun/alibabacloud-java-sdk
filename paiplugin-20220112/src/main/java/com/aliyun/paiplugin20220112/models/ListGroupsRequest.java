// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiplugin20220112.models;

import com.aliyun.tea.*;

public class ListGroupsRequest extends TeaModel {
    /**
     * <p>人群名称过滤。</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>分页数，从1开始，默认为1。</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>分页大小，默认为10。</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>是否包含手机号过滤。</p>
     */
    @NameInMap("PhoneNumber")
    public Boolean phoneNumber;

    /**
     * <p>人群备注过滤。</p>
     */
    @NameInMap("Remark")
    public String remark;

    /**
     * <p>来源过滤。</p>
     */
    @NameInMap("Source")
    public Integer source;

    /**
     * <p>审核状态过滤。</p>
     */
    @NameInMap("Status")
    public Integer status;

    public static ListGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListGroupsRequest self = new ListGroupsRequest();
        return TeaModel.build(map, self);
    }

    public ListGroupsRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListGroupsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListGroupsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListGroupsRequest setPhoneNumber(Boolean phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
    public Boolean getPhoneNumber() {
        return this.phoneNumber;
    }

    public ListGroupsRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public ListGroupsRequest setSource(Integer source) {
        this.source = source;
        return this;
    }
    public Integer getSource() {
        return this.source;
    }

    public ListGroupsRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

}
