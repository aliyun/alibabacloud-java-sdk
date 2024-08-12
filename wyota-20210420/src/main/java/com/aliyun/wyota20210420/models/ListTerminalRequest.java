// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class ListTerminalRequest extends TeaModel {
    @NameInMap("Alias")
    public String alias;

    @NameInMap("BuildId")
    public String buildId;

    @NameInMap("ClientType")
    public Integer clientType;

    @NameInMap("InManage")
    public Boolean inManage;

    @NameInMap("Ipv4")
    public String ipv4;

    @NameInMap("LocationInfo")
    public String locationInfo;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("Model")
    public String model;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("SearchKeyword")
    public String searchKeyword;

    @NameInMap("SerialNumber")
    public String serialNumber;

    @NameInMap("TerminalGroupId")
    public String terminalGroupId;

    @NameInMap("Uuid")
    public String uuid;

    public static ListTerminalRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTerminalRequest self = new ListTerminalRequest();
        return TeaModel.build(map, self);
    }

    public ListTerminalRequest setAlias(String alias) {
        this.alias = alias;
        return this;
    }
    public String getAlias() {
        return this.alias;
    }

    public ListTerminalRequest setBuildId(String buildId) {
        this.buildId = buildId;
        return this;
    }
    public String getBuildId() {
        return this.buildId;
    }

    public ListTerminalRequest setClientType(Integer clientType) {
        this.clientType = clientType;
        return this;
    }
    public Integer getClientType() {
        return this.clientType;
    }

    public ListTerminalRequest setInManage(Boolean inManage) {
        this.inManage = inManage;
        return this;
    }
    public Boolean getInManage() {
        return this.inManage;
    }

    public ListTerminalRequest setIpv4(String ipv4) {
        this.ipv4 = ipv4;
        return this;
    }
    public String getIpv4() {
        return this.ipv4;
    }

    public ListTerminalRequest setLocationInfo(String locationInfo) {
        this.locationInfo = locationInfo;
        return this;
    }
    public String getLocationInfo() {
        return this.locationInfo;
    }

    public ListTerminalRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListTerminalRequest setModel(String model) {
        this.model = model;
        return this;
    }
    public String getModel() {
        return this.model;
    }

    public ListTerminalRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListTerminalRequest setSearchKeyword(String searchKeyword) {
        this.searchKeyword = searchKeyword;
        return this;
    }
    public String getSearchKeyword() {
        return this.searchKeyword;
    }

    public ListTerminalRequest setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
        return this;
    }
    public String getSerialNumber() {
        return this.serialNumber;
    }

    public ListTerminalRequest setTerminalGroupId(String terminalGroupId) {
        this.terminalGroupId = terminalGroupId;
        return this;
    }
    public String getTerminalGroupId() {
        return this.terminalGroupId;
    }

    public ListTerminalRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

}
