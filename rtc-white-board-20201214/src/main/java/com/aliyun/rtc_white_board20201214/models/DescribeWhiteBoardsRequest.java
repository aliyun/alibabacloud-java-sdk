// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc_white_board20201214.models;

import com.aliyun.tea.*;

public class DescribeWhiteBoardsRequest extends TeaModel {
    // 白板应用唯一标识符
    @NameInMap("AppID")
    public String appID;

    // 白板文档状态，默认查询所有状态。（取值：1:启用，2:停用）
    @NameInMap("DocStatus")
    public Long docStatus;

    // 第几页，默认查询第1页
    @NameInMap("PageNum")
    public Long pageNum;

    // 每页显示个数，默认为10
    @NameInMap("PageSize")
    public Long pageSize;

    public static DescribeWhiteBoardsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeWhiteBoardsRequest self = new DescribeWhiteBoardsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeWhiteBoardsRequest setAppID(String appID) {
        this.appID = appID;
        return this;
    }
    public String getAppID() {
        return this.appID;
    }

    public DescribeWhiteBoardsRequest setDocStatus(Long docStatus) {
        this.docStatus = docStatus;
        return this;
    }
    public Long getDocStatus() {
        return this.docStatus;
    }

    public DescribeWhiteBoardsRequest setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public DescribeWhiteBoardsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
