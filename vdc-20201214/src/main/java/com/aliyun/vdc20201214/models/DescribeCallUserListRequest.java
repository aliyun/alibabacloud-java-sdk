// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdc20201214.models;

import com.aliyun.tea.*;

public class DescribeCallUserListRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("ChannelId")
    public String channelId;

    @NameInMap("CreatedTs")
    public Long createdTs;

    @NameInMap("DestroyedTs")
    public Long destroyedTs;

    @NameInMap("ExtDataType")
    public String extDataType;

    @NameInMap("PageNo")
    public Integer pageNo;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("QueryExpInfo")
    public Boolean queryExpInfo;

    @NameInMap("RoleType")
    public String roleType;

    @NameInMap("UserId")
    public String userId;

    public static DescribeCallUserListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCallUserListRequest self = new DescribeCallUserListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCallUserListRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DescribeCallUserListRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    public DescribeCallUserListRequest setCreatedTs(Long createdTs) {
        this.createdTs = createdTs;
        return this;
    }
    public Long getCreatedTs() {
        return this.createdTs;
    }

    public DescribeCallUserListRequest setDestroyedTs(Long destroyedTs) {
        this.destroyedTs = destroyedTs;
        return this;
    }
    public Long getDestroyedTs() {
        return this.destroyedTs;
    }

    public DescribeCallUserListRequest setExtDataType(String extDataType) {
        this.extDataType = extDataType;
        return this;
    }
    public String getExtDataType() {
        return this.extDataType;
    }

    public DescribeCallUserListRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public DescribeCallUserListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeCallUserListRequest setQueryExpInfo(Boolean queryExpInfo) {
        this.queryExpInfo = queryExpInfo;
        return this;
    }
    public Boolean getQueryExpInfo() {
        return this.queryExpInfo;
    }

    public DescribeCallUserListRequest setRoleType(String roleType) {
        this.roleType = roleType;
        return this;
    }
    public String getRoleType() {
        return this.roleType;
    }

    public DescribeCallUserListRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
