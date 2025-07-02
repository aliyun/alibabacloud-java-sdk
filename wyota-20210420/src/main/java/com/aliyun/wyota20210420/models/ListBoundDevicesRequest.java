// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class ListBoundDevicesRequest extends TeaModel {
    @NameInMap("AdDomain")
    public String adDomain;

    @NameInMap("Alias")
    public String alias;

    @NameInMap("ClientType")
    public Integer clientType;

    @NameInMap("DirectoryId")
    public String directoryId;

    @NameInMap("EndUserId")
    public String endUserId;

    @NameInMap("InManage")
    public Boolean inManage;

    @NameInMap("LastLoginUser")
    public String lastLoginUser;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("SerialNo")
    public String serialNo;

    @NameInMap("UserType")
    public String userType;

    @NameInMap("Uuid")
    public String uuid;

    public static ListBoundDevicesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListBoundDevicesRequest self = new ListBoundDevicesRequest();
        return TeaModel.build(map, self);
    }

    public ListBoundDevicesRequest setAdDomain(String adDomain) {
        this.adDomain = adDomain;
        return this;
    }
    public String getAdDomain() {
        return this.adDomain;
    }

    public ListBoundDevicesRequest setAlias(String alias) {
        this.alias = alias;
        return this;
    }
    public String getAlias() {
        return this.alias;
    }

    public ListBoundDevicesRequest setClientType(Integer clientType) {
        this.clientType = clientType;
        return this;
    }
    public Integer getClientType() {
        return this.clientType;
    }

    public ListBoundDevicesRequest setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

    public ListBoundDevicesRequest setEndUserId(String endUserId) {
        this.endUserId = endUserId;
        return this;
    }
    public String getEndUserId() {
        return this.endUserId;
    }

    public ListBoundDevicesRequest setInManage(Boolean inManage) {
        this.inManage = inManage;
        return this;
    }
    public Boolean getInManage() {
        return this.inManage;
    }

    public ListBoundDevicesRequest setLastLoginUser(String lastLoginUser) {
        this.lastLoginUser = lastLoginUser;
        return this;
    }
    public String getLastLoginUser() {
        return this.lastLoginUser;
    }

    public ListBoundDevicesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListBoundDevicesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListBoundDevicesRequest setSerialNo(String serialNo) {
        this.serialNo = serialNo;
        return this;
    }
    public String getSerialNo() {
        return this.serialNo;
    }

    public ListBoundDevicesRequest setUserType(String userType) {
        this.userType = userType;
        return this;
    }
    public String getUserType() {
        return this.userType;
    }

    public ListBoundDevicesRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

}
