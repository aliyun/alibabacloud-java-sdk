// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class ListTerminalsRequest extends TeaModel {
    @NameInMap("InManage")
    public Boolean inManage;

    @NameInMap("MainBizType")
    public String mainBizType;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>AAAAAdEdsXbwG2ZlbWCzN4wTTg6wQvfp7u1BJl4bxCAby41POSaYAlCvfULQpkAnb0ff****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("PasswordFreeLoginUser")
    public String passwordFreeLoginUser;

    /**
     * <strong>example:</strong>
     * <p>DemoDevice</p>
     */
    @NameInMap("SearchKeyword")
    public String searchKeyword;

    @NameInMap("SerialNumbers")
    public java.util.List<String> serialNumbers;

    /**
     * <strong>example:</strong>
     * <p>tg-default</p>
     */
    @NameInMap("TerminalGroupId")
    public String terminalGroupId;

    @NameInMap("Uuids")
    public java.util.List<String> uuids;

    @NameInMap("WithBindUser")
    public Boolean withBindUser;

    public static ListTerminalsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTerminalsRequest self = new ListTerminalsRequest();
        return TeaModel.build(map, self);
    }

    public ListTerminalsRequest setInManage(Boolean inManage) {
        this.inManage = inManage;
        return this;
    }
    public Boolean getInManage() {
        return this.inManage;
    }

    public ListTerminalsRequest setMainBizType(String mainBizType) {
        this.mainBizType = mainBizType;
        return this;
    }
    public String getMainBizType() {
        return this.mainBizType;
    }

    public ListTerminalsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListTerminalsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListTerminalsRequest setPasswordFreeLoginUser(String passwordFreeLoginUser) {
        this.passwordFreeLoginUser = passwordFreeLoginUser;
        return this;
    }
    public String getPasswordFreeLoginUser() {
        return this.passwordFreeLoginUser;
    }

    public ListTerminalsRequest setSearchKeyword(String searchKeyword) {
        this.searchKeyword = searchKeyword;
        return this;
    }
    public String getSearchKeyword() {
        return this.searchKeyword;
    }

    public ListTerminalsRequest setSerialNumbers(java.util.List<String> serialNumbers) {
        this.serialNumbers = serialNumbers;
        return this;
    }
    public java.util.List<String> getSerialNumbers() {
        return this.serialNumbers;
    }

    public ListTerminalsRequest setTerminalGroupId(String terminalGroupId) {
        this.terminalGroupId = terminalGroupId;
        return this;
    }
    public String getTerminalGroupId() {
        return this.terminalGroupId;
    }

    public ListTerminalsRequest setUuids(java.util.List<String> uuids) {
        this.uuids = uuids;
        return this;
    }
    public java.util.List<String> getUuids() {
        return this.uuids;
    }

    public ListTerminalsRequest setWithBindUser(Boolean withBindUser) {
        this.withBindUser = withBindUser;
        return this;
    }
    public Boolean getWithBindUser() {
        return this.withBindUser;
    }

}
