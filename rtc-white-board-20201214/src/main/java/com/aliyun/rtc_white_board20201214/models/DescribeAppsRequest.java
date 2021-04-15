// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc_white_board20201214.models;

import com.aliyun.tea.*;

public class DescribeAppsRequest extends TeaModel {
    // 白板应用唯一标识符，默认查询所有应用ID
    @NameInMap("AppID")
    public String appID;

    // 白板应用状态，默认查询所有状态。（取值：1:启用，2:停用）
    @NameInMap("AppStatus")
    public Long appStatus;

    // 第几页，默认查询第1页。
    @NameInMap("PageNum")
    public Long pageNum;

    // 每页显示个数，默认为10。
    @NameInMap("PageSize")
    public Long pageSize;

    public static DescribeAppsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAppsRequest self = new DescribeAppsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAppsRequest setAppID(String appID) {
        this.appID = appID;
        return this;
    }
    public String getAppID() {
        return this.appID;
    }

    public DescribeAppsRequest setAppStatus(Long appStatus) {
        this.appStatus = appStatus;
        return this;
    }
    public Long getAppStatus() {
        return this.appStatus;
    }

    public DescribeAppsRequest setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public DescribeAppsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
