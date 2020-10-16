// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class ListDeviceGroupsRequest extends TeaModel {
    @NameInMap("DeviceCodeList")
    public String deviceCodeList;

    @NameInMap("CorpIdList")
    public String corpIdList;

    @NameInMap("Name")
    public String name;

    @NameInMap("IsPage")
    @Validation(required = true)
    public Integer isPage;

    @NameInMap("PageNum")
    @Validation(required = true)
    public Integer pageNum;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("Group")
    public String group;

    public static ListDeviceGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDeviceGroupsRequest self = new ListDeviceGroupsRequest();
        return TeaModel.build(map, self);
    }

    public ListDeviceGroupsRequest setDeviceCodeList(String deviceCodeList) {
        this.deviceCodeList = deviceCodeList;
        return this;
    }
    public String getDeviceCodeList() {
        return this.deviceCodeList;
    }

    public ListDeviceGroupsRequest setCorpIdList(String corpIdList) {
        this.corpIdList = corpIdList;
        return this;
    }
    public String getCorpIdList() {
        return this.corpIdList;
    }

    public ListDeviceGroupsRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListDeviceGroupsRequest setIsPage(Integer isPage) {
        this.isPage = isPage;
        return this;
    }
    public Integer getIsPage() {
        return this.isPage;
    }

    public ListDeviceGroupsRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public ListDeviceGroupsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListDeviceGroupsRequest setGroup(String group) {
        this.group = group;
        return this;
    }
    public String getGroup() {
        return this.group;
    }

}
