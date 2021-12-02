// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class ListSlbAPsRequest extends TeaModel {
    @NameInMap("AppId")
    public Long appId;

    @NameInMap("EnvId")
    public Long envId;

    @NameInMap("Name")
    public String name;

    @NameInMap("NetworkMode")
    public String networkMode;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ProtocolList")
    public java.util.List<String> protocolList;

    @NameInMap("SlbId")
    public String slbId;

    public static ListSlbAPsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSlbAPsRequest self = new ListSlbAPsRequest();
        return TeaModel.build(map, self);
    }

    public ListSlbAPsRequest setAppId(Long appId) {
        this.appId = appId;
        return this;
    }
    public Long getAppId() {
        return this.appId;
    }

    public ListSlbAPsRequest setEnvId(Long envId) {
        this.envId = envId;
        return this;
    }
    public Long getEnvId() {
        return this.envId;
    }

    public ListSlbAPsRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListSlbAPsRequest setNetworkMode(String networkMode) {
        this.networkMode = networkMode;
        return this;
    }
    public String getNetworkMode() {
        return this.networkMode;
    }

    public ListSlbAPsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListSlbAPsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListSlbAPsRequest setProtocolList(java.util.List<String> protocolList) {
        this.protocolList = protocolList;
        return this;
    }
    public java.util.List<String> getProtocolList() {
        return this.protocolList;
    }

    public ListSlbAPsRequest setSlbId(String slbId) {
        this.slbId = slbId;
        return this;
    }
    public String getSlbId() {
        return this.slbId;
    }

}
