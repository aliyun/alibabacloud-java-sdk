// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class ListDeviceGroupsRequest extends TeaModel {
    @NameInMap("CorpIdList")
    public String corpIdList;

    @NameInMap("DataSourceType")
    public String dataSourceType;

    @NameInMap("DeviceCodeList")
    public String deviceCodeList;

    @NameInMap("Group")
    public String group;

    @NameInMap("IsPage")
    public Integer isPage;

    @NameInMap("Name")
    public String name;

    @NameInMap("PageNum")
    public Integer pageNum;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static ListDeviceGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDeviceGroupsRequest self = new ListDeviceGroupsRequest();
        return TeaModel.build(map, self);
    }

    public ListDeviceGroupsRequest setCorpIdList(String corpIdList) {
        this.corpIdList = corpIdList;
        return this;
    }
    public String getCorpIdList() {
        return this.corpIdList;
    }

    public ListDeviceGroupsRequest setDataSourceType(String dataSourceType) {
        this.dataSourceType = dataSourceType;
        return this;
    }
    public String getDataSourceType() {
        return this.dataSourceType;
    }

    public ListDeviceGroupsRequest setDeviceCodeList(String deviceCodeList) {
        this.deviceCodeList = deviceCodeList;
        return this;
    }
    public String getDeviceCodeList() {
        return this.deviceCodeList;
    }

    public ListDeviceGroupsRequest setGroup(String group) {
        this.group = group;
        return this;
    }
    public String getGroup() {
        return this.group;
    }

    public ListDeviceGroupsRequest setIsPage(Integer isPage) {
        this.isPage = isPage;
        return this;
    }
    public Integer getIsPage() {
        return this.isPage;
    }

    public ListDeviceGroupsRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
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

}
